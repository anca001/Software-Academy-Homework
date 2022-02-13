import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;


public class DBConnection {

	public int insert(String uname, String email, String pass, int uid)

	{

	String DRIVER_NAME = "com.mysql.cj.jdbc.Driver"; //mysql driver name 
	
	String URL = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&userSSL=false"; //mysql schema
	String user = "root"; //mysql workbench user name
	String password = "root"; //mysql workbench password

	int row_update = 0;

	try
	{
		Class.forName(DRIVER_NAME); // coming from ext lib

		Connection con = DriverManager.getConnection(URL, user, password);
		Statement stmt = con.createStatement();
		
		"insert into user(uid, uname, pass, email) values(" + 123 + ", '" + sdfs', 'sdfs', 'a@a.com')"

		//insert query
		row_update = stmt.executeUpdate("insert into user(uid, uname, pass, email) values(" + uid + ", '" +uname+"', '"+pass+"','"+email+"')"); //I think - not too sure of this 

		System.out.println("Row update:"+row_update);
		
		return row_update;

	}

	catch(Exception ex)
	{	
		System.out.println("DB error :"+ex);
	}
	
	return row_update; //used a return statement 

	}

	
}
