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
	
	//���ؼ��ֽ��в�ѯ�����ز�ѯ�����Ӧ�Ķ������һ����
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
	
	//��ָ���ֶν��в�ѯ�����ز�ѯ���������ڼ����У������Ƕ�����
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
	
	//�Ӽ������������ɸ�ѧ�����ݣ�����ڼ�����
	public ArrayList<Student> readStudentFromKeyBoard(){
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("���������ѧ���Ļ�����Ϣ���Ӹ������ԣ��ָ����000�������룩��");
		Scanner scan=new Scanner(System.in);
		String aLine="";
		while(!(aLine=scan.nextLine()).equals("000")){
			String arr[] = aLine.split(",|��");
			String id=arr[0];
			if(get(id)==null){
				Student stu = new Student (arr[0],arr[1],arr[2],arr[3],Float.parseFloat(arr[4]));
				list.add(stu);
			}
			else{
				System.out.println("ѧ��" + id + "�Ѵ��ڣ����������룡");
			}
		}
		
		
		return list;
	}
	
	//��һ��ѧ��������뵽���ݿ��У����سɹ������¼����������1����ʾ����ɹ���
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
	
	//ɾ��ָ���ؼ��ֵļ�¼�����سɹ�ɾ����¼����������1����ʾɾ���ɹ���
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
		System.out.println("��������޸�ѧ����ѧ�ţ�");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		if(get(id)==null){
			System.out.println("ѧ��"+id+"�����ڣ�");
		}
		else{
			System.out.println("�������޸ĺ��ѧ��");
			String name = scan.next();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			System.out.println("�������޸ĺ�ĳ�������");
			String birth = scan.next();
			System.out.println("�������޸ĺ���Ա�");
			String gender = scan.next();
			System.out.println("�������޸ĺ�ĳɼ�");
			float score = scan.nextFloat();
			stu=new Student(id,name,birth,gender,score);
		}
		System.out.println(stu.toString());
		
		return stu;
		
	}
}



















