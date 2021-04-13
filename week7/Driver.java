package week7;

import java.awt.Choice;
import java.util.Scanner;

public class Driver {

	public static Enrollment enrollment;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = menu();
		
		
		while(choice != 5){
			switch(choice){
			case 1:createNewSubject();break;
			case 2:addAStudent();break;
			case 3:withDraw();break;
			case 4:PrintSubDetails();break;
			default:System.out.println("��Чѡ��");
			}
			choice = menu();
		}
		
		System.out.println("���������");
	}
	
	public static int menu(){
		int choice = 0;
		System.out.println("= = = =��ӭʹ��ѧ��ѡ��ϵͳ��= = = =");
		System.out.println("1.����ѧ��");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡѧ��ϸ��");
		System.out.println("5.�˳�����");
		System.out.println("���������ѡ��");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		return choice;
		
	}
	
	public static void createNewSubject(){
		String choice = "y";
		if(enrollment != null){
			System.out.println("�Ѵ����γ̣��Ƿ����´�����(y/n):");
			Scanner scan = new Scanner(System.in);
			choice = scan.next();
		}
		
		if(choice.equals("n")) return;
		if(choice.equals("y") || enrollment == null){
			Scanner subscan = new Scanner(System.in);
			System.out.println("������γ����ƣ�");
			String subName = subscan.next();
			System.out.println("������γ̺ţ�");
			String subId = subscan.next();
			System.out.println("������γ�������");
			int subnum = subscan.nextInt();
			enrollment = new Enrollment(new Subject(subId,subName,subnum));
			
			System.out.println("�γ̴����ɹ���");
			System.out.println(enrollment.getSubject().toString());
		}
		else System.out.println("��Ч���ţ�");
		
		
	}
	
	public static void addAStudent(){
		if(enrollment == null){
			System.out.println("���ȴ����γ̣�");
			return;
		}
		if(enrollment.getCount() >= enrollment.getSubject().getMaxNum()){
			System.out.println("ѡ������������");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��ѧ�ţ�");
		int stuId = scan.nextInt();
		System.out.println("������ѧ��������");
		String stuName = scan.next();
		
		if(enrollment.addStudent(new Student(stuId,stuName)))
			System.out.println("ѡ�γɹ�!");
		else System.out.println("ѡ��ʧ��...");
		
	}
	
	public static void withDraw(){
		if(enrollment == null){
			System.out.println("���ȴ���ѧ�ƣ�");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��ѧ�ţ�");
		int stuId = scan.nextInt();
		System.out.println("������ѧ��������");
		String stuName = scan.next();
		if(enrollment.withDraw(stuId, stuName))
			System.out.println("��ѡ�ɹ���");
		else System.out.println("��ѡʧ��...");
		
	}
	
	public static void PrintSubDetails(){
		if(enrollment == null){
			System.out.println("���ȴ���ѧ�ƣ�");
			return;
		}
		System.out.println(enrollment.toString());
	}
	
	
	
	
	
}
