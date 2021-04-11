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
			default:System.out.println("无效的选择！");
			}
			choose=menu();
		}
		System.out.println("欢迎下次使用！");
	}
	
	public static int menu(){
		int choose=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("========WTU选课系统=======");
		System.out.println("1:create list");
		System.out.println("2:print list");
		System.out.println("请输入操作选择:");
		choose=scan.nextInt();
		return choose;
	}

	public static void createList(){
		if(list != null) {
			System.out.println("是否重新输入？（y/n）：");
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			if(ch.equals("n")) {
				return;
			}
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.println("请输入学年:");
		int year=scan.nextInt();
		System.out.println("请输入学期（1-2）:");
		int semester=scan.nextInt();
		System.out.println("请输入学科代码:");
		String subid=scan.next();
		System.out.println("请输入学科名称:");
		String subname=scan.next();		
		System.out.println("请输入学生1姓名:");
		String s1name=scan.next();
		System.out.println("请输入学生1学号:");
		String s1id=scan.next();
		System.out.println("请输入学生2姓名:");
		String s2name=scan.next();
		System.out.println("请输入学生2学号:");
		String s2id=scan.next();
		Student s1=new Student(s1name,s1id);
		Student s2=new Student(s2name,s2id);
		Subject sub=new Subject(subname,subid);
		list=new classList(semester,year,sub,s1,s2);
	}
	
	public static void printList(){
		if(list == null) {
			System.out.println("请先输入！");
			return;
		}
		System.out.println(list.toString());
		
	}
}
