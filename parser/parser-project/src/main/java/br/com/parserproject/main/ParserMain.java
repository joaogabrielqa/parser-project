package br.com.parserproject.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
			JSONParser parser = new JSONParser();
			
			ResultSet rs = pgConn.getResultSet("select * from auditoria where dado->>'tabela' = 'produto' and dado->>'tipo' = 'novo registro' order by id_auditoria");
			while(rs.next()){
//				System.out.println(rs.getString("id_auditoria"));
				Long idAuditoria = rs.getLong("id_auditoria");
				Timestamp data = rs.getTimestamp("data_auditoria");
				Object obj = parser.parse(rs.getString("dado"));
				JSONObject jsonObj = (JSONObject) obj;
				JSONObject jsonValores = (JSONObject) jsonObj.get("valores");
				String valor = jsonObj.get("valores").toString();
//				Double custoReal = (Double) jsonValores.get("custo_real");
				Long idProduto = (Long) jsonValores.get("id_produto");
				//System.out.println(valor);
//				System.out.println("Custo real: " + idProduto);
				System.out.println("Id auditoria: "+ idAuditoria + " Data: " + data + " Id produto: " + idProduto);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
