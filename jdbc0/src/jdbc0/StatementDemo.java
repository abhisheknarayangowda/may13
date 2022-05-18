package jdbc0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StatementDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
//Object con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","admin");
String url="jdbc:mysql://localhost:3306/b3tns";
Properties p=new Properties();
p.put("user", "root");
p.put("password", "admin");
Connection con=DriverManager.getConnection(url,p);
Statement st=con.createStatement();
String query1="create table student(studentId int primary Key,studentName varchar(20),studentMarks int)";
int i=st.executeUpdate("create table student1(studentId int primary Key,studentName varchar(20),studentMarks int");
System.out.println("no of rows affected:"+i);
String j=null;
System.out.println("no of rows affected:"+j);
System.out.println("table created successfully");
st.close();
//communication con.close();
//connection


	}

}
