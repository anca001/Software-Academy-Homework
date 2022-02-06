import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.Scanner;

public class DBConnect {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		
		String URL = "jdbc:mysql://localhost:3306/tta";
		String user = "root";
		String pass = "root";
		
		try {
			Class.forName(DRIVER_NAME);
			
			Connection con = DriverManager.getConnection(URL, user, pass);

			Statement stmt = con.createStatement();

			if(con != null)

			{
				System.out.println("Connection done !");
			}
			
			String qry2 = "replace into employee values " 
					+ "(101, 'Annie', 'annie@gmail.com', '074444', 'manager', 60.000 ),"
					+ "(103, 'Jane', 'jane@gmail.com', '07555', 'director', 55.000 )," 
					+ "(104, 'Joe', 'joe@gmail.com', '07666', 'admin', 50.000 ),"
					+ "(105, 'Paul', 'paul@gmail.com', '07777', 'admin', 50.000 )";

			int insert_count = stmt.executeUpdate(qry2);
			if(insert_count != 5)
			{
				System.out.println("Please check query...");
			}
			
			String qry1 = "select * from employee";
			ResultSet rs = stmt.executeQuery(qry1);
			while(rs.next())
			{
				System.out.println("Employee id : "+rs.getInt("eid"));
				System.out.println("Employee name : "+rs.getString("ename"));
				System.out.println("Employee email : "+rs.getString("email"));
				System.out.println("Employee mobile : "+rs.getString("mobile"));
				System.out.println("Employee designation : "+rs.getString("designation"));
				System.out.println("Employee salary : "+rs.getDouble("salary"));
			}
			System.out.println("=========================");
			
			String qry3 = "delete from employee where designation = 'admin'";
			int delete_count = stmt.executeUpdate(qry3);
			System.out.println("Deleted " + delete_count + " rows.");
			
			String qry4 = "update employee set ename = 'Anna' where eid = 101 ";
			int update_count = stmt.executeUpdate(qry4);
			System.out.println("Updated " + update_count + " rows.");

		}
		catch(Exception ex)
		{
			System.out.println("DB Connection error " + ex.getMessage());
		}

		
	}
}
