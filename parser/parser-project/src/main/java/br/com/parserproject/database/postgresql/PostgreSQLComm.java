package br.com.parserproject.database.postgresql;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PostgreSQLComm {
	
	private Connection conn;
	private String url;
	
	public PostgreSQLComm() throws ClassNotFoundException, SQLException, IOException, ParseException{
		Class.forName("org.postgresql.Driver");
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(new FileReader("META-INF/application_properties.json"));
		url = "jdbc:postgresql://" + json.get("database_host") + ":" + json.get("database_port") + "/" + json.get("database_name");
		conn = DriverManager.getConnection(url, (String) json.get("database_login"), (String) json.get("database_password"));
	}

	public Connection getConn() {
		return conn;
	}
	
	public Statement getStatement() throws SQLException{
		return conn.createStatement();
	}
	
	public ResultSet getResultSet(String query) throws SQLException{
		return getStatement().executeQuery(query);
	}

}
