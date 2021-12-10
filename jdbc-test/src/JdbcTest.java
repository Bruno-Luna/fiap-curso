import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Bruno Luna
 *
 */
public class JdbcTest {

	public static void main(String[] args)  throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myResul = null;
		
		try {
			// 1.Recebe/faz a conexão do banco de dados
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?UseSSL=false", "student", "22071991");
			System.out.println("Conexão feita com sucesso!\n");
		
			// 2.  Cria um Statement Objeto para enviar instruções SQL ao banco de dados.
			myStmt = myConn.createStatement();
			
			//3. Execução das query SQL
			myResul = myStmt.executeQuery("select * from employees");
			
			//4. Processamento do result set
			while(myResul.next()) {
				System.out.println(myResul.getString("last_name") + " " + myResul.getString("first_name") + " | " + myResul.getString("email"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
