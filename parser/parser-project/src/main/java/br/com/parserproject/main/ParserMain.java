package br.com.parserproject.main;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.parserproject.database.postgresql.PostgreSQLComm;

/**
 * Classe principal da execução do Parser.
 * @author João Gabriel QA
 *
 */
public class ParserMain {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		try {
			PostgreSQLComm pgConn = new PostgreSQLComm();
			
			ResultSet rs = pgConn.getResultSet("select dado from auditoria where dado->>'tabela' = 'produto' LIMIT 100");
			while(rs.next()){
				System.out.println(rs.getString("dado"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
