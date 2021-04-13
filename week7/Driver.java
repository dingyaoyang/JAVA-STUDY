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
			default:System.out.println("无效选择！");
			}
			choice = menu();
		}
		
		System.out.println("程序结束！");
	}
	
	public static int menu(){
		int choice = 0;
		System.out.println("= = = =欢迎使用学生选课系统！= = = =");
		System.out.println("1.创建学科");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印学科细节");
		System.out.println("5.退出程序");
		System.out.println("请输入你的选择：");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		return choice;
		
	}
	
	public static void createNewSubject(){
		String choice = "y";
		if(enrollment != null){
			System.out.println("已创建课程，是否重新创建？(y/n):");
			Scanner scan = new Scanner(System.in);
			choice = scan.next();
		}
		
		if(choice.equals("n")) return;
		if(choice.equals("y") || enrollment == null){
			Scanner subscan = new Scanner(System.in);
			System.out.println("请输入课程名称：");
			String subName = subscan.next();
			System.out.println("请输入课程号：");
			String subId = subscan.next();
			System.out.println("请输入课程人数：");
			int subnum = subscan.nextInt();
			enrollment = new Enrollment(new Subject(subId,subName,subnum));
			
			System.out.println("课程创建成功：");
			System.out.println(enrollment.getSubject().toString());
		}
		else System.out.println("无效符号！");
		
		
	}
	
	public static void addAStudent(){
		if(enrollment == null){
			System.out.println("请先创建课程！");
			return;
		}
		if(enrollment.getCount() >= enrollment.getSubject().getMaxNum()){
			System.out.println("选课人数已满！");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生学号：");
		int stuId = scan.nextInt();
		System.out.println("请输入学生姓名：");
		String stuName = scan.next();
		
		if(enrollment.addStudent(new Student(stuId,stuName)))
			System.out.println("选课成功!");
		else System.out.println("选课失败...");
		
	}
	
	public static void withDraw(){
		if(enrollment == null){
			System.out.println("请先创建学科！");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生学号：");
		int stuId = scan.nextInt();
		System.out.println("请输入学生姓名：");
		String stuName = scan.next();
		if(enrollment.withDraw(stuId, stuName))
			System.out.println("退选成功！");
		else System.out.println("退选失败...");
		
	}
	
	public static void PrintSubDetails(){
		if(enrollment == null){
			System.out.println("请先创建学科！");
			return;
		}
		System.out.println(enrollment.toString());
	}
	
	
	
	
	
}
