package com.datacoper.locacaoequipamentos.client.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.datacoper.locacaoequipamentos.client.formspadrao.FormPadraoPesquisa;
import com.datacoper.locacaoequipamentos.client.tablemodel.MyModelTable;
import com.datacoper.locacaoequipamentos.client.tablemodel.TableModelCliente;
import com.datacoper.locacaoequipamentos.common.model.Cliente;
import com.datacoper.locacaoequipamentos.common.service.ClienteService;
import com.datacoper.locacaoequipamentos.common.service.ServiceLocator;

public class FormBuscaCliente extends FormPadraoPesquisa {

	private static final long serialVersionUID = 1L;

	private String operation;
	private ClienteService clienteService;
	private JComboBox comboBox;
	private List<Cliente> listaClientes;

	public FormBuscaCliente() {
		super();
	}


	public void ok() {
		super.ok();
	}


	public void cancelar() {
		super.cancelar();
	}

	@Override
	public JComboBox getComboBox() {

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Nome", "Código", "CPF", "Telefone" }));
		comboBox.setSelectedIndex(0);
		return comboBox;
	}

	@Override
	public TableModel getTableModel(List listaClientes) {

		TableModel tableModel = new TableModelCliente(listaClientes);
		return tableModel;
	}

	@Override
	public List<Cliente> pesquisar(String pesquisa) {
		if (pesquisa == null || pesquisa.isEmpty()) {
			List<Cliente> l = getClienteService().encontrarTodosClientes();
			for (Cliente cliente : l) {
				System.out.println("Sexo = " + cliente.getSexo().getDescricao());
			}
			return l;
		} else {
			return getClienteService().encontrarClienteEsp(comboBox.getSelectedIndex(), pesquisa);
		}
	}

	public ClienteService getClienteService() {
		if (clienteService == null) {
			clienteService = new ServiceLocator().loadService(ClienteService.class);
		}
		return clienteService;
	}

	// @Override
	// public void getSelectedRow(int selectedRow, TableModel model) {
	// Cliente cliente = (Cliente)
	// FormCliente.setCliente(listaClientes.get(selectedRow));
	// }

}
