package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Jsecond {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try {
			
			Scanner sc=new Scanner(System.in);
			Driver dir=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(dir);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			System.out.println("connection complete");
			
			PreparedStatement pstmt=con.prepareStatement("insert into `#2024`.places values(?,?,?,?,?)");
			
			System.out.println("enter sno: ");
			int sno=sc.nextInt();
			
			System.out.println("enter name of palce: ");
			String name=sc.next();
			
			System.out.println("enter state: ");
			String state=sc.next();
			
			System.out.println("enter distance: ");
			int dis=sc.nextInt();
			
			System.out.println("enter bus ticket amount : ");
			int cost=sc.nextInt();
			
			pstmt.setInt(1, sno);
			pstmt.setString(2, name);
			pstmt.setString(3, state);
			pstmt.setInt(4, dis);
			pstmt.setInt(5, cost);
			
			pstmt.execute();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
