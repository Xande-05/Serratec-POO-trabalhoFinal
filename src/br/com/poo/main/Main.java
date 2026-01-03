package br.com.poo.main;

import java.sql.Connection;

import dao.ConnectionFactory;


public class Main {

	public static void main(String[] args) {
		System.out.println("Consegui Compilar e executar");
		
		Connection connection = new ConnectionFactory().getConnection();
	}
}
