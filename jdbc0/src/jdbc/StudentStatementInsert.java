package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Object con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","admin");
		String url="jdbc:mysql://localhost:3306/b3tns";
		Properties p=new Properties();
		p.put("user", "root");
		p.put("password", "admin");
		Connection con=DriverManager.getConnection(url,p);
		
		
		Statement st=con.createStatement();
		
		String query="insert into student values(3,'Aniket',20)";
		int i=st.executeUpdate(query);
		System.out.println("no of rows affected:"+i);
		
		System.out.println("query executed" + t);
		System.out.println("row inserted successfully");
		st.close();
		con.close();
	}

}
