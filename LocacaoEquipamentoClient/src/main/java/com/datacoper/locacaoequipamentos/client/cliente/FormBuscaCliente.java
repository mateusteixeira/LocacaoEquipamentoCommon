package com.datacoper.locacaoequipamentos.client.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.datacoper.locacaoequipamentos.arquitetura.client.FormPadraoPesquisa;
import com.datacoper.locacaoequipamentos.client.util.MyModelTable;
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

	@Override
	public void ok() {

	}

	@Override
	public void cancelar() {
		//

	}

	@Override
	public JComboBox getComboBox() {

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Nome", "Código", "CPF", "Telefone" }));
		comboBox.setSelectedIndex(0);
		return comboBox;
	}

	@Override
	public TableModel getTableModel() {

		MyModelTable modelo = new MyModelTable();
		Object columnNames[] = new Object[] { "Nome", "Código", "CPF", "Telefone" };
		modelo.setColumnIdentifiers(columnNames);
		modelo.setNumRows(0);
		Object temp[] = new Object[4];
		for (Object c : listaClientes) {
			Cliente cliente = (Cliente) c;
			System.out.println("codigo = " + cliente.getIdCliente());
			temp[0] = cliente.getNome();
			temp[1] = cliente.getIdCliente();
			temp[2] = cliente.getCpf();
			temp[3] = cliente.getTelefone();
			modelo.addRow(temp);
		}

		return modelo;
	}

	@Override
	public void pesquisar(String pesquisa) {
		if (pesquisa == null || pesquisa.isEmpty()) {
			listaClientes = new ArrayList<Cliente>();
			listaClientes = getClienteService().encontrarTodosClientes();
		} else {
			listaClientes = new ArrayList<Cliente>();
			listaClientes = getClienteService().encontrarClienteEsp(comboBox.getSelectedIndex(), pesquisa);
		}
	}

	public ClienteService getClienteService() {
		if (clienteService == null) {
			clienteService = new ServiceLocator().loadService(ClienteService.class);
		}
		return clienteService;
	}

	@Override
	public void getSelectedRow(int selectedRow) {
		FormCliente.setCliente(listaClientes.get(selectedRow));
	}

}
