package week14;

import java.util.ArrayList;

import iot.week14.dao.StudentDao;
import iot.week14.vo.Student;

public class Driver {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		Student stu=dao.get("1001");
		if(stu==null){
			System.out.println("not find");
		}
		else{
			System.out.println(stu.toString());
		}
		
		ArrayList<Student> list = dao.query("name", "һ", "y");
		if(list.size()==0){
			System.out.println("not find");
		}
		else{
			for (Student student : list) {
				System.out.println(student.toString());
			}
		}
		

	}

}
