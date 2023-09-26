package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	// Módulo de conexão
	// Paramêtros de conexão
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbcontas?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "1234";
			
	
	
	//Método de conexão
	private Connection conectar() {
		Connection con = null; // con cria uma sessão com o banco.
		try {
			Class.forName(driver); // lê o driver do banco
			con = DriverManager.getConnection(url, user, password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
			
		}
	
	}
	// testando a conexão
			public void testeconexao() {
				try {
					Connection con = conectar();
					System.out.println(con);
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				
				
			}
	
	

}
