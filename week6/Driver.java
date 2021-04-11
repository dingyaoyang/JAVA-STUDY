package week6;

import java.util.Scanner;

public class Driver {
public static CheckingAccount ca;
public static SavingAccount sa;

	public static void main(String[] args) {
		int choice = menu();
		while(choice!=8){
			switch(choice){
			case 1:createAccount();break;
			case 2:saveMoney();break;
			case 3:withdraw();break;
			case 4:comsume();break;
			case 5:repay();break;
			case 6:settle();break;
			case 7:balance();break;
			default:System.out.println("��Чѡ������������");break;
			}
			choice = menu();
		}
		System.out.println("�����������ӭ�ٴ�ʹ��");

	}
	public static int menu(){
		int choice = 0;
		System.out.println("====��ӭʹ������ϵͳ====");
		System.out.println("1.����create");
		System.out.println("2.���save");
		System.out.println("3.ȡ��withdraw");
		System.out.println("4.����comsume");
		System.out.println("5.����repay");
		System.out.println("6.���н���settle");
		System.out.println("7.��ѯ���balance");
		System.out.println("8.�˳�exit");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	public static int subMenu(){
		int choice = 0;
		System.out.println("---ѡ�񿪿�����---");
		System.out.println("1.���ÿ�checkingAccount");
		System.out.println("2.�洢��savingAccount");
		System.out.println("3.����exit");
		System.out.println("��ѡ��1-3��");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}
	
	public static void createAccount(){
		int choice = subMenu();
		Scanner scan = new Scanner(System.in);
		while(choice!=3){
			switch(choice){
			case 1:
				System.out.println("���������֤��:");
				String ssn = scan.next();
				System.out.println("����������:");
				String name = scan.next();
				System.out.println("�����뿨��:");
				String accountNum = scan.next();
				System.out.println("����������:");
				double serviceChange = scan.nextDouble();
				if(serviceChange <= 0) {System.out.println("�����Ӧ>0");break;}
				
				ca = new CheckingAccount(accountNum,50000,serviceChange);
				Customer cus = new Customer(ssn,name,ca);
				break;
			case 2:
				System.out.println("���������֤��:");
				String ssn2 = scan.next();
				System.out.println("����������:");
				String name2 = scan.next();
				System.out.println("�����뿨��:");
				String accountNum2 = scan.next();
				System.out.println("����������:");
				double interestRate = scan.nextDouble();
				if(interestRate<0) {System.out.println("����Ӧ>0");break;}
				
				sa = new SavingAccount(accountNum2,0,interestRate);
				Customer cus2 = new Customer(ssn2,name2,sa);
				break;
				default:System.out.println("��Чѡ������������");break;
			}
			choice = subMenu();
		}
		
	}
	public static void saveMoney(){
		if(sa == null) {
			System.out.println("���ȿ���...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������");
		double savemoney = scan.nextDouble();
		sa.setBalance(sa.getBalance()+savemoney);
		System.out.println("���ɹ���");
	}
	public static void withdraw(){
		if(sa == null) {
			System.out.println("���ȿ���...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ȡ���");
		double widraw = scan.nextDouble();
		if(sa.getBalance() < widraw) {
			System.out.println("���㣡");
			return;
		}
		sa.setBalance(sa.getBalance()-widraw);
		System.out.println("ȡ��ɹ���");
	}
	public static void comsume(){
		if(ca == null) {
			System.out.println("���ȿ���...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ѽ�");
		double com = scan.nextDouble();
		if(ca.getBalance()<com) {
			System.out.println("���㣡");
			return;
		}
		ca.setBalance(ca.getBalance()-com);
		System.out.println("���ѳɹ���");
	}
	public static void repay(){
		if(ca == null) {
			System.out.println("���ȿ���...");
			return;
		}
		if (50000 - ca.getBalance() == 0) {
			System.out.println("���軹��");
			return;
		}
		System.out.println("��Ҫ���"+(50000-ca.getBalance()));

		Scanner scan = new Scanner(System.in);
		System.out.println("�����뻹���");
		double rep = scan.nextDouble();
		if(rep>50000-ca.getBalance()) {
			System.out.println("too much��ֻ�軹��"+(50000-ca.getBalance()));
		}
		else if(rep>0) {
			ca.setBalance(ca.getBalance()+rep);
			System.out.println("����ɹ���");
		}
		
	}
	public static void settle(){
		if(ca != null)
			 ca.setBalance(ca.getBalance()-ca.getServiceChange());
		if(sa != null)
			 sa.setBalance(sa.getBalance()*(sa.getInterestRate()+1));
		if(ca == null && sa == null)
			 System.out.println("���ȿ���...");
		else System.out.println("����ɹ���");
	}
	public static void balance(){
		if(ca != null) {
			System.out.println("���ÿ���"+ca.getBalance());
		}
		if(sa != null) {
			System.out.println("�洢����"+sa.getBalance());
		}
		if(ca == null && sa == null) {
			System.out.println("���ȿ���...");
		}
	}
}
