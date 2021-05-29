package week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.加载驱动
			String driverName="com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			//2.建立与数据库的链接
			String url="jdbc:mysql://127.0.0.1:3306/wtu?useUnicode=true&"
					+ "charaEncoding=utf-8";
			String userName="root";
			String password="990428";
			Connection con = DriverManager.getConnection(url,userName,password);
			
			//3.创建语句
//			String sql = "select * from t_student ";
			String sql = "update t_student set gender='男' where id ='1002'";
			PreparedStatement pst = con.prepareStatement(sql);
			
			int iCount= pst.executeUpdate();
			System.out.println("记录"+iCount+"个");
//			//4.执行语句
//			ResultSet rs = pst.executeQuery();
//			//5.返回结果处理
//			while(rs.next()){
//				String sno = rs.getString("id");
//				String name = rs.getString("name");
//				String birth = rs.getString("birth");
//				String gender = rs.getString("gender");
//				System.out.println(sno+"\t"+name+"\t"+birth+"\t"+gender);
//			}
//			//6.释放资源
//			rs.close();
			pst.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
