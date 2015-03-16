package com.datacoper.locacaoequipamentos.persistence.transaction;

import java.sql.Connection;
import java.sql.SQLException;

import com.datacoper.locacaoequipamentos.persistence.dao.jdbc.JdbcDAOFactory;
import com.datacoper.locacaoequipamentos.util.ConfiguracaoSistema;
import com.datacoper.locacaoequipamentos.util.ParametrosEnum;

public abstract class TransactionManagerFactory {

	private static TransactionManagerFactory transactionManagerFactory;

	protected TransactionManagerFactory() {
	}

	public static <T> TransactionManagerFactory startTransaction(T dao) {
		String persistenceType = getPersistenceType();
		if (persistenceType.equals("JDBC")) {
			JdbcDAOFactory jdbcDAOFactory = (JdbcDAOFactory) dao;
			transactionManagerFactory = new TransactionManagerJdbc();
//			transactionManagerFactory.setConnection(jdbcDAOFactory
//					.getConnection());
			try {
				transactionManagerFactory.getConnection().setAutoCommit(false);
			} catch (SQLException e) {
			}
			return transactionManagerFactory;
		} else if (persistenceType.equals("JPA")) {
		}
		return null;
	}

	private static String getPersistenceType() {
		String persistenceType = ConfiguracaoSistema
				.getValorConfiguracao(ParametrosEnum.PERSISTENCETYPE);
		return persistenceType;
	}

	abstract void setConnection(Connection connection);

	abstract Connection getConnection();

	public void commit() {
		String persistenceType = getPersistenceType();
		if (persistenceType.equals("JDBC")) {
			try {
				transactionManagerFactory.getConnection().commit();
				transactionManagerFactory.getConnection().setAutoCommit(true);
			} catch (SQLException e) {
				throw new RuntimeException(
						"Erro commit - TransactionManagerFactory", e);
			}

		} else if (persistenceType.equals("JPA")) {
		}
	}

	public void rollBack() {
		String persistenceType = getPersistenceType();
		if (persistenceType.equals("JDBC")) {
			try {
				transactionManagerFactory.getConnection().rollback();
				transactionManagerFactory.getConnection().setAutoCommit(true);
			} catch (SQLException e) {
				throw new RuntimeException(
						"Erro commit - TransactionManagerFactory", e);
			}

		} else if (persistenceType.equals("JPA")) {
		}
	}

}
