package iot.week14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import iot.week14.tools.DbConnection;
import iot.week14.vo.Student;

public class StudentDao {
	
	//按关键字进行查询，返回查询结果对应的对象（最多一条）
	public static Student get(String id){
		
		Student stu = null;
		DbConnection db =new DbConnection();
		Connection con=db.getCon();
		String sql="select *from t_student where id=?";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				stu=new Student(rs.getString("id"),
						rs.getString("name"),
						rs.getString("birth"),
						rs.getString("gender"),
						rs.getInt("score"));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}
	
	//按指定字段进行查询，返回查询结果，存放在集合中（可能是多条）
	public ArrayList<Student> query(String fieldName, String value,String flux){
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		DbConnection db =new DbConnection();
		Connection con=db.getCon();
		String sql="";
		String condition="";
		if(flux.equals("y")){
			sql="select *from t_student where " + fieldName+" like ?";
			condition="%"+value+"%";
		}
		else{
			sql="select *from t_student where "+ fieldName+"=?";
			condition = value;
		}
		
		try{
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, condition);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				Student stu=new Student(rs.getString("id"),
						rs.getString("name"),
						rs.getString("birth"),
						rs.getString("gender"),
						rs.getInt("score"));
				list.add(stu);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//从键盘中输入若干个学生数据，存放在集合中
	public ArrayList<Student> readStudentFromKeyBoard(){
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("请输入插入学生的基本信息（从各属性以，分割，输入000结束输入）：");
		Scanner scan=new Scanner(System.in);
		String aLine="";
		while(!(aLine=scan.nextLine()).equals("000")){
			String arr[] = aLine.split(",|，");
			String id=arr[0];
			if(get(id)==null){
				Student stu = new Student (arr[0],arr[1],arr[2],arr[3],Float.parseFloat(arr[4]));
				list.add(stu);
			}
			else{
				System.out.println("学号" + id + "已存在，请重新输入！");
			}
		}
		
		
		return list;
	}
	
	//将一个学生对象插入到数据库中，返回成功插入记录的条数（〉1，表示插入成功）
	public int insert(ArrayList<Student> list){
		int iRet=0;
		
		DbConnection db =new DbConnection();
		Connection con=db.getCon();
		try{
			for(Student student : list){
			String sql="insert into t_student value(?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, student.getId());
			pst.setString(2, student.getName());
			pst.setString(3, student.getBirth());
			pst.setString(4, student.getGender());
			pst.setFloat(5, student.getScore());
			
			int count=pst.executeUpdate();
			iRet+=count;
			}
		}catch (Exception e) {
			e.printStackTrace();
			db.close();
		}
		return iRet;
	}
	
	//删除指定关键字的记录，返回成功删除记录的条数（〉1，表示删除成功）
	public int delete(String id){
		int iRet=0;
		
		
		DbConnection db =new DbConnection();
		Connection con=db.getCon();
		String sql="delete *from t_student where id=?";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			int rs=pst.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			db.close();
		}
		
		return iRet;
	}
	
	public Student inputUpdateInfo(){
		Student stu = null;
		System.out.println("请输入待修改学生的学号：");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		if(get(id)==null){
			System.out.println("学号"+id+"不存在！");
		}
		else{
			System.out.println("请输入修改后的学号");
			String name = scan.next();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			System.out.println("请输入修改后的出生日期");
			String birth = scan.next();
			System.out.println("请输入修改后的性别");
			String gender = scan.next();
			System.out.println("请输入修改后的成绩");
			float score = scan.nextFloat();
			stu=new Student(id,name,birth,gender,score);
		}
		System.out.println(stu.toString());
		
		return stu;
		
	}
}



















