package week12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dao {
	
	public ArrayList<Student> importStudentFromTxt(){
		ArrayList<Student> listStudent = new  ArrayList<Student>();
		try{
			System.out.println("������ѧ��������Ϣ��");
			File file = new File("d:/student.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			Scanner scan = new Scanner(System.in);
			String aLine = "";
			while((aLine=scan.nextLine())!="end"){
				String arr[]= aLine.split(",|��");
				String id = arr[0];
				String name = arr[1];
				String gender = arr[2];
				Student stu = new Student(id,name,gender);
				listStudent.add(stu);
			}
		}	
		catch (Exception e) {
			e.printStackTrace();
		}
		return listStudent;
	}
	
	public ArrayList<Course> importCourseFromTxt(){
		ArrayList<Course> listCourse = new ArrayList<Course>();
		try{
			System.out.println("������ѧ���ɼ�");
			File file = new File("d:/course.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			Scanner scan = new Scanner(System.in);
			String aLine = "";
			while((aLine=scan.nextLine())!="end"){
				String arr[]= aLine.split(",|��");
				String id = arr[0];
				String courseName = arr[1];
				float grade = Float.parseFloat(arr[2]);
				Course cor = new Course(id,courseName,grade);
				listCourse.add(cor);
			}
		}	
		catch (Exception e) {
			e.printStackTrace();
		}
		return listCourse;
	}
	
	public void printText(ArrayList<Student> studentList,ArrayList<Result> resultList){
		File file = new File("D:/week12print.txt");
		try{
			FileWriter fwt = new FileWriter(file);
			PrintWriter pwt = new PrintWriter(fwt);
			pwt.println("��ѧ��ͳ�ƣ�");
			pwt.println("ѧ��\t����\t�Ա�\tƽ����");
			for (Student student : studentList) {
				pwt.println(student);
			}
			pwt.println("���γ�ͳ�ƣ�");
			pwt.println("�γ�\tƽ����");
			for (Result result : resultList) {
				pwt.println(result);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




