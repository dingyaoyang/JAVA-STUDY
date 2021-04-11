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
			default:System.out.println("无效选择！请重新输入");break;
			}
			choice = menu();
		}
		System.out.println("程序结束，欢迎再次使用");

	}
	public static int menu(){
		int choice = 0;
		System.out.println("====欢迎使用银行系统====");
		System.out.println("1.开户create");
		System.out.println("2.存款save");
		System.out.println("3.取款withdraw");
		System.out.println("4.消费comsume");
		System.out.println("5.还款repay");
		System.out.println("6.银行结算settle");
		System.out.println("7.查询余额balance");
		System.out.println("8.退出exit");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	public static int subMenu(){
		int choice = 0;
		System.out.println("---选择开卡类型---");
		System.out.println("1.信用卡checkingAccount");
		System.out.println("2.存储卡savingAccount");
		System.out.println("3.返回exit");
		System.out.println("请选择1-3：");
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
				System.out.println("请输入身份证号:");
				String ssn = scan.next();
				System.out.println("请输入姓名:");
				String name = scan.next();
				System.out.println("请输入卡号:");
				String accountNum = scan.next();
				System.out.println("请输入服务费:");
				double serviceChange = scan.nextDouble();
				if(serviceChange <= 0) {System.out.println("服务费应>0");break;}
				
				ca = new CheckingAccount(accountNum,50000,serviceChange);
				Customer cus = new Customer(ssn,name,ca);
				break;
			case 2:
				System.out.println("请输入身份证号:");
				String ssn2 = scan.next();
				System.out.println("请输入姓名:");
				String name2 = scan.next();
				System.out.println("请输入卡号:");
				String accountNum2 = scan.next();
				System.out.println("请输入利率:");
				double interestRate = scan.nextDouble();
				if(interestRate<0) {System.out.println("利率应>0");break;}
				
				sa = new SavingAccount(accountNum2,0,interestRate);
				Customer cus2 = new Customer(ssn2,name2,sa);
				break;
				default:System.out.println("无效选择！请重新输入");break;
			}
			choice = subMenu();
		}
		
	}
	public static void saveMoney(){
		if(sa == null) {
			System.out.println("请先开户...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入存款金额：");
		double savemoney = scan.nextDouble();
		sa.setBalance(sa.getBalance()+savemoney);
		System.out.println("存款成功！");
	}
	public static void withdraw(){
		if(sa == null) {
			System.out.println("请先开户...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入取款金额：");
		double widraw = scan.nextDouble();
		if(sa.getBalance() < widraw) {
			System.out.println("余额不足！");
			return;
		}
		sa.setBalance(sa.getBalance()-widraw);
		System.out.println("取款成功！");
	}
	public static void comsume(){
		if(ca == null) {
			System.out.println("请先开户...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double com = scan.nextDouble();
		if(ca.getBalance()<com) {
			System.out.println("余额不足！");
			return;
		}
		ca.setBalance(ca.getBalance()-com);
		System.out.println("消费成功！");
	}
	public static void repay(){
		if(ca == null) {
			System.out.println("请先开户...");
			return;
		}
		if (50000 - ca.getBalance() == 0) {
			System.out.println("无需还款");
			return;
		}
		System.out.println("需要还款："+(50000-ca.getBalance()));

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入还款金额：");
		double rep = scan.nextDouble();
		if(rep>50000-ca.getBalance()) {
			System.out.println("too much！只需还款"+(50000-ca.getBalance()));
		}
		else if(rep>0) {
			ca.setBalance(ca.getBalance()+rep);
			System.out.println("还款成功！");
		}
		
	}
	public static void settle(){
		if(ca != null)
			 ca.setBalance(ca.getBalance()-ca.getServiceChange());
		if(sa != null)
			 sa.setBalance(sa.getBalance()*(sa.getInterestRate()+1));
		if(ca == null && sa == null)
			 System.out.println("请先开户...");
		else System.out.println("结算成功！");
	}
	public static void balance(){
		if(ca != null) {
			System.out.println("信用卡余额："+ca.getBalance());
		}
		if(sa != null) {
			System.out.println("存储卡余额："+sa.getBalance());
		}
		if(ca == null && sa == null) {
			System.out.println("请先开户...");
		}
	}
}
