import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDeleteDemo {

	public static void main(String[] args) throws SQLException{

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myResul = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?UseSSL=false";
		String user = "student";
		String pass = "22071991";

	
		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("Conexão feita com sucesso!\n");
			
			myStmt = myConn.createStatement();
		
			int rowsAffected = myStmt.executeUpdate(
					"delete from employees "
					+ "where id= 16 and id=15");
			
			System.out.println("Informação deletada! \n");

			myResul = myStmt.executeQuery("select * from employees");

			while(myResul.next()) {
				System.out.println(myResul.getString("id") + " " + myResul.getString("first_name") + " " + myResul.getString("last_name") + " | " + myResul.getString("email")
				+ " "+ myResul.getString("department") + " " + myResul.getString("salary"));
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

}
