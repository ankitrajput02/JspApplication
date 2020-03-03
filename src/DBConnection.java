import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
//	static Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/UserRecord?useSSL=false";
	static String uname = "ankit";
	static String password = "password";

	public static int connect() {
		try {
			System.out.println("a");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("b");
			Connection con = DriverManager.getConnection(url, uname, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	
		
		
	}
}
