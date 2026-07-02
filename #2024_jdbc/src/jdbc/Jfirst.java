package jdbc;

import java.sql.*;

public class Jfirst 
{
   public static void main(String[] args) 
   {
	    try {
			Driver dri=new com.mysql.cj.jdbc.Driver();
			//System.out.println("load the driver");
			DriverManager.registerDriver(dri);
			//System.out.println("register the driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			//System.out.println("get connection");
			
		
			Statement stmt=con.createStatement();
			//stmt.execute("insert into `#2024`.places values(2,'bangalor','KA',260,500)");
			
			//int up=stmt.executeUpdate("update `#2024`.places set cost=450 where SNO=2");
			//System.out.println("update the query");
			
			
			ResultSet res=stmt.executeQuery("select * from `#2024`.places");
			
			while(res.next())
			{
				int sno=res.getInt(1);
				System.out.print("SNO: " + sno);
				String name=res.getString(2);
				System.out.print("place: " + name);
				String  state=res.getString(3);
				System.out.println("state:" +state);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
   }
}





//1) load the divers.
//i) import the sql packegs

//2) register the drivers.
//i) in drivermanager class one methode is there called registerdriver.

//3) connect the drivers.
//i) Connection class we have Drivermanager.getConnection method.
//ii) we acn pass 3 parameters:--protocal, sub protocal, sub name.
//iii) protocal is nothong but client end , it is madatory to write
//iv) sub protocal is db vendors like mysql,sql,oracl ect..
//v) sub name we have  port number, host name, database name,user name,password.

//4)create the statements and execution the query.
// we can use statement stm=con.createstatement method.
//there is no return type 
//if we insert the values ------> use stmt.execute(write insert query);
//if we update the query:-------> int =stmt.executeupdate();

//5) result the query.