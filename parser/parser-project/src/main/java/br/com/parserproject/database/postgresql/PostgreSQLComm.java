package br.com.parserproject.database.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLComm {
	
	private Connection conn;
	
	public PostgreSQLComm() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:45432/datamining", "postgres", "root");
	}

	public Connection getConn() {
		return conn;
	}

}
