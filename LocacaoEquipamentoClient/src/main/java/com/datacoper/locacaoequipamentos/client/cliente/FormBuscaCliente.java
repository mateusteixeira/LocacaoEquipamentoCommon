package com.datacoper.locacaoequipamentos.client.cliente;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.datacoper.locacaoequipamentos.arquitetura.client.FormPadraoPesquisa;
import com.datacoper.locacaoequipamentos.common.model.Cliente;
import com.datacoper.locacaoequipamentos.common.service.ClienteService;

public class FormBuscaCliente extends FormPadraoPesquisa {

	private String operation;
	private ClienteService clienteService;
	private JComboBox comboBox;

	public FormBuscaCliente(ClienteService cService) {
		
		System.out.println(cService.getClass().getName());
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
	public TableModel getTableModel(List clientes) {

		DefaultTableModel modelo = new DefaultTableModel();
		Object columnNames[] = new Object[] { "Codigo", "nome", "CPF", "Telefone" };
		modelo.setColumnIdentifiers(columnNames);
		modelo.setNumRows(0);
		Object temp[] = new Object[4];
		for (Object c : clientes) {
			Cliente cliente = (Cliente) c;
			temp[0] = cliente.getNome();
			temp[1] = cliente.getIdCliente();
			temp[2] = cliente.getCpf();
			temp[3] = cliente.getTelefone();
			modelo.addRow(temp);
		}
		return modelo;
	}

	@Override
	public List<Cliente> pesquisar(String pesquisa) {
		if(clienteService == null){
			System.out.println("null");
		}
		int idPesquisa = 0;
		if (pesquisa == null || pesquisa.isEmpty()) {
			return clienteService.encontrarTodosClientes();
		} else {
			idPesquisa = comboBox.getSelectedIndex();
			return clienteService.encontrarClienteEsp();
		}
	}

}
