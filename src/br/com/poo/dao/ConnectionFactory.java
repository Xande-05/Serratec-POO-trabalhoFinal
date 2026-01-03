package br.com.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:postgresql://dpg-d36mj3ndiees73bvbacg-a.oregon-postgres.render.com:5432/rh_o40m";
	private String usuario = "rh_o40m_user";
	private String senha = "JQLy5dRdeVcUbQsUdHt49GYZx9xeQjPj";
	private Connection connection;

	public Connection getConnection() {
		System.out.println("Conectando no banco de dados.....");
		try {
			connection = DriverManager.getConnection(url, usuario, senha);
			if (connection != null) {
				System.out.println("Conectado com sucesso!");
			} else {
				System.out.println("Erro nos dados da conexão!");
			}
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar...");
			e.printStackTrace();
		}
		return connection;
	}
}
