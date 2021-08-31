package uteis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	 String DRIVER = "com.mysql.jdbc.Driver";
	 String URL = "jdbc:postgressql://127.0.0.1:5432";
	 String USER = "postgres";
	 String PASS = "postgres";

	private static Connection conexao;
	
	public boolean conecta();{
		
		try {
			Class.forName("org.postgresql.Driver");
			
			conexao = DriverManager.getConnection(URL, USER, PASS);
						
		} catch(ClassNotFoundException e){
			e.printStackTrace();
			return false;			
		} catch (SQLException e){
			e.printStackTrace();  
		    return false;
		}
		    
				
		return true;
	}
	
	
}
