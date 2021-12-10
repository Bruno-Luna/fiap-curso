import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myResul = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?UseSSL=false";
		String user = "student";
		String pass = "22071991";

		try {
			// 1.Recebe/faz a conexão do banco de dados
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("Conexão feita com sucesso!\n");

			// 2. Cria um Statement Objeto para enviar instruções SQL ao banco de dados.
			myStmt = myConn.createStatement();

			// 3. Inserção da nova query
			System.out.println("Insira a nova informação no banco de dados: \n");
			
			int rowsAffected = myStmt.executeUpdate(
						"insert into employees " +
						"(last_name, first_name, email, department, salary)" +
						"values" +
						"('Bruno', 'Luna', 'lunabr@email.com', 'Java developer', 8820.00)"
					);

			//4. Execução das query SQL
			myResul = myStmt.executeQuery("select * from employees order by first_name");
			
			//5. Processamento do result set
			while(myResul.next()) {
				System.out.println(myResul.getString("first_name") + " " + myResul.getString("last_name") + " | " + myResul.getString("email"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if(myResul != null) {
				myResul.close();
			}
		}
	}
}
