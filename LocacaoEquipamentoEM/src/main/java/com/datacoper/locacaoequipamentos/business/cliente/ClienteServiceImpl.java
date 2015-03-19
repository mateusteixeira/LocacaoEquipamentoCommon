/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.business.cliente;

import com.datacoper.locacaoequipamentos.common.exception.BusinessException;
import com.datacoper.locacaoequipamentos.common.model.Cliente;
import com.datacoper.locacaoequipamentos.common.model.Locacao;
import com.datacoper.locacaoequipamentos.common.service.ClienteService;
import com.datacoper.locacaoequipamentos.persistence.dao.ClienteDAO;
import com.datacoper.locacaoequipamentos.persistence.dao.DAOFactory;
import com.datacoper.locacaoequipamentos.persistence.dao.LocacaoDAO;
import com.datacoper.locacaoequipamentos.persistence.dao.jdbc.JdbcDAOFactory;
import com.datacoper.locacaoequipamentos.persistence.exception.PersistenceException;
import com.datacoper.locacaoequipamentos.persistence.transaction.ITransaction;
import com.datacoper.locacaoequipamentos.persistence.transaction.TransactionManagerFactory;
import com.datacoper.locacaoequipamentos.persistence.transaction.TransactionManagerJdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Java
 */
public class ClienteServiceImpl implements ClienteService {

	private ClienteDAO clienteDAO;

	public ClienteDAO getClienteDAO() {
		if (clienteDAO == null) {
			clienteDAO = DAOFactory.getInstance().createDAO(ClienteDAO.class);
		}
		return clienteDAO;
	}

	@Override
	public void gravar(Cliente cliente) throws BusinessException {

		validarDadosObrigatorios(cliente);

		atualizarIDCliente(cliente);

		ITransaction transaction = TransactionManagerFactory.getTransaction();

		try {

			transaction.beginTransaction();
			cliente.setIdCliente(50);
			getClienteDAO().insert(cliente);
			transaction.commit();

		} catch (Exception e) {

			try {
				transaction.rollback();
			} catch (PersistenceException e1) {
				throw new BusinessException();
			}

			throw new BusinessException(e);

		} finally {
			try {
				transaction.closeTransaction();
			} catch (PersistenceException e) {
				e.printStackTrace();
			}
		}

	}

	private void atualizarIDCliente(Cliente cliente) {
		if (cliente.getIdCliente() == null) {// update
			Integer idCliente = getClienteDAO().nextId();
			cliente.setIdCliente(idCliente);
		}
	}

	private void validarDadosObrigatorios(Cliente cliente) throws BusinessException {

		StringBuilder camposNaoPreenchidos = new StringBuilder();
		if (cliente.getCpf().matches("(\\d\\d\\.){3}-\\d{2}")) {
			camposNaoPreenchidos.append("CPF inválido");
		}
		if (cliente.getDataNascimento() == null) {
			camposNaoPreenchidos.append("Data Nascimento não preenchido");
		}
		// } else if (cliente.getTelefone().contains(" ")) {
		// throw new
		// RuntimeException("Por favor, preencha o campo Telefone de forma correta");
		// }

		if (camposNaoPreenchidos.length() > 0) {
			throw new BusinessException("Os seguintes campos são de preenchimento obrigatório:\n" + camposNaoPreenchidos);
		}
	}

	@Override
	public List<Cliente> encontrarTodosClientes() {
		List<Cliente> clientes = getClienteDAO().encontrarClienteAll();
		return clientes;
	}

	@Override
	public List<Cliente> encontrarClienteEsp(int campoPesquisar, String pesquisa) {
		return getClienteDAO().encontrarClienteEsp(campoPesquisar,pesquisa);
	}



	// @Override
	// public boolean excluir(Cliente cliente) {
	//
	// List<Locacao> locacoes;
	//
	// try {
	// locacoes = encontrarTodasLocacoes();
	// } catch (Exception ex) {
	// Logger.getLogger(ClienteServiceImpl.class.getName()).log(Level.SEVERE,
	// null, ex);
	// throw new
	// RuntimeException("Problema encontrar locações de cliente para excluir",
	// ex);
	// }
	//
	// boolean lock = false;
	// for (Locacao l : locacoes) {
	// System.out.println("ID Cliente = " + l.getIdCliente());
	// if (l.getIdCliente() == cliente.getIdCliente()) {
	// lock = true;
	// }
	// }
	// if (lock) {
	// throw new RuntimeException("Cliente com Locação!");
	// } else {
	//
	// if (getClienteDAO().excluiCliente(cliente)) {
	// return true;
	// } else {
	// return false;
	// }
	//
	// }
	// }
	//
	// @Override
	// public List<Cliente> encontrarTodosClientes() {
	// throw new UnsupportedOperationException("Not supported yet."); //To
	// change body of generated methods, choose Tools | Templates.
	// }
	//
	// @Override
	// public boolean updateCliente(Cliente cliente) {
	// if (cliente.getCpf().contains(" ")) {
	// throw new RuntimeException("Por favor preencha CPF corretamenta");
	// } else if (cliente.getDataNascimento() == null) {
	// throw new
	// RuntimeException("Por favor, preencha o campo Data de Nascimento de forma correta");
	// } else if (cliente.getTelefone().contains(" ")) {
	// throw new
	// RuntimeException("Por favor, preencha o campo Telefone de forma correta");
	// }
	//
	// if (getClienteDAO().updateCliente(cliente)) {
	// return true;
	// } else {
	// return false;
	// }
	//
	// }
	//
	// @Override
	// public List<Locacao> encontrarTodasLocacoes() {
	//
	// try {
	// return getLocacaoDAO().buscaLocacoesAll();
	// } catch (Exception ex) {
	// Logger.getLogger(ClienteServiceImpl.class.getName()).log(Level.SEVERE,
	// null, ex);
	// throw new RuntimeException("Problema para encontrar todas as locações!",
	// ex);
	// }
	//
	// }
	//
	// @Override
	// public List<Cliente> buscaClienteAll(int ordem, int ascDesc) {
	// List<Cliente> lista;
	//
	// lista = getClienteDAO().buscaAll(ordem, ascDesc);
	//
	// return lista;
	// }
	//
	// @Override
	// public List<Cliente> buscaClienteEsp(int ordem, int ascDesc, int id,
	// String cont) {
	//
	// List<Cliente> lista;
	//
	// lista = getClienteDAO().buscaEsp(ordem, ascDesc, id, cont);
	//
	// return lista;
	// }

}
