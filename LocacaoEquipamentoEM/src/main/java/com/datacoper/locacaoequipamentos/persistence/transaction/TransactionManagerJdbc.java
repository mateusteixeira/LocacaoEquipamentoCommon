package com.datacoper.locacaoequipamentos.persistence.transaction;

import java.sql.Connection;

public class TransactionManagerJdbc extends TransactionManagerFactory {

	private Connection connection;

	Connection getConnection() {
		return connection;
	}

	void setConnection(Connection connection) {
		this.connection = connection;
	}

}
