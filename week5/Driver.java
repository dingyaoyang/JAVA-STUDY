package week5;

import java.util.Scanner;

public class Driver {

	public static classList list=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose=menu();
		while(choose!=3){
			switch(choose){
			case 1:createList();break;
			case 2:printList();break;
			default:System.out.println("��Ч��ѡ��");
			}
			choose=menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}
	
	public static int menu(){
		int choose=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("========WTUѡ��ϵͳ=======");
		System.out.println("1:create list");
		System.out.println("2:print list");
		System.out.println("���������ѡ��:");
		choose=scan.nextInt();
		return choose;
	}

	public static void createList(){
		if(list != null) {
			System.out.println("�Ƿ��������룿��y/n����");
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			if(ch.equals("n")) {
				return;
			}
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.println("������ѧ��:");
		int year=scan.nextInt();
		System.out.println("������ѧ�ڣ�1-2��:");
		int semester=scan.nextInt();
		System.out.println("������ѧ�ƴ���:");
		String subid=scan.next();
		System.out.println("������ѧ������:");
		String subname=scan.next();		
		System.out.println("������ѧ��1����:");
		String s1name=scan.next();
		System.out.println("������ѧ��1ѧ��:");
		String s1id=scan.next();
		System.out.println("������ѧ��2����:");
		String s2name=scan.next();
		System.out.println("������ѧ��2ѧ��:");
		String s2id=scan.next();
		Student s1=new Student(s1name,s1id);
		Student s2=new Student(s2name,s2id);
		Subject sub=new Subject(subname,subid);
		list=new classList(semester,year,sub,s1,s2);
	}
	
	public static void printList(){
		if(list == null) {
			System.out.println("�������룡");
			return;
		}
		System.out.println(list.toString());
		
	}
}
