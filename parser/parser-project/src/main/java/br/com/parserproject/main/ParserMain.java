package br.com.parserproject.main;

import java.sql.SQLException;

import br.com.parserproject.database.postgresql.PostgreSQLComm;

/**
 * Classe principal da execu��o do Parser.
 * @author Jo�o Gabriel QA
 *
 */
public class ParserMain {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		try {
			PostgreSQLComm pgConn = new PostgreSQLComm();
			
			System.out.println(pgConn.getConn().createStatement().toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
