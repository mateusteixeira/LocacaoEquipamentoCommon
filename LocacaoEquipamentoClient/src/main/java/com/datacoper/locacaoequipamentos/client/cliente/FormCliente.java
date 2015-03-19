package com.datacoper.locacaoequipamentos.client.cliente;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.datacoper.locacaoequipamentos.arquitetura.client.FormPadrao;
import com.datacoper.locacaoequipamentos.arquitetura.client.IAcoes;
import com.datacoper.locacaoequipamentos.common.exception.BusinessException;
import com.datacoper.locacaoequipamentos.common.model.Cliente;
import com.datacoper.locacaoequipamentos.common.model.Endereco;
import com.datacoper.locacaoequipamentos.common.service.ClienteService;
import com.datacoper.locacaoequipamentos.common.service.ServiceLocator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FormCliente extends FormPadrao implements IAcoes {

	private static final long serialVersionUID = 1L;

	private JTextField idClienteField;
	private JTextField dataCadastroField;
	private JTextField nomeClienteField;
	private JTextField cpfClienteField;
	private JTextField rgClienteField;
	private static com.toedter.calendar.JDateChooser nascimentoClienteField;
	private JTextField telefoneClienteField;
	private JTextField emailClienteField;
	private JTextField cidadeClienteField;
	private JTextField ruaClienteField;
	private JTextField bairroClienteField;
	private JTextField complementoClienteField;
	private JTextField numeroClienteField;
	private JTextField cepClienteField;
	private JComboBox sexoClienteBox;
	private JComboBox estadoCivilClienteBox;
	private JComboBox estadoClienteBox;

	private SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
	private Date date = new Date(System.currentTimeMillis());
	private ClienteService clienteService;

	public FormCliente() {
		super();
		panelDados.setLayout(null);
		init();
		getClienteService();
		setDisableComponents();
		setIAcoes(this);
	}

	private void setDisableComponents() {
		idClienteField.setEnabled(false);
		dataCadastroField.setEnabled(false);
		nomeClienteField.setEnabled(false);
		cpfClienteField.setEnabled(false);
		rgClienteField.setEnabled(false);
		nascimentoClienteField.setEnabled(false);
		telefoneClienteField.setEnabled(false);
		emailClienteField.setEnabled(false);
		cidadeClienteField.setEnabled(false);
		ruaClienteField.setEnabled(false);
		bairroClienteField.setEnabled(false);
		complementoClienteField.setEnabled(false);
		numeroClienteField.setEnabled(false);
		cepClienteField.setEnabled(false);
		sexoClienteBox.setEnabled(false);
		estadoCivilClienteBox.setEnabled(false);
		estadoClienteBox.setEnabled(false);

	}

	private void init() {
		JPanel panelPessoa = new JPanel();
		panelPessoa.setBorder(new TitledBorder(null, "Pessoa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPessoa.setBounds(10, 38, 452, 155);
		panelDados.add(panelPessoa);
		panelPessoa.setLayout(null);

		JLabel lblnome = new JLabel("*Nome:");
		lblnome.setBounds(10, 24, 37, 14);
		panelPessoa.add(lblnome);

		JLabel lblcpf = new JLabel("*CPF:");
		lblcpf.setBounds(290, 24, 29, 14);
		panelPessoa.add(lblcpf);

		JLabel lblNewLabel_1 = new JLabel("*RG:");
		lblNewLabel_1.setBounds(10, 52, 29, 14);
		panelPessoa.add(lblNewLabel_1);

		JLabel lbldatanascimento = new JLabel("*DataNascimento:");
		lbldatanascimento.setBounds(257, 114, 88, 14);
		panelPessoa.add(lbldatanascimento);

		nomeClienteField = new JTextField();
		nomeClienteField.setBounds(57, 21, 223, 20);
		panelPessoa.add(nomeClienteField);
		nomeClienteField.setColumns(10);

		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
			cpfClienteField = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e) {
		}
		cpfClienteField.setBounds(356, 21, 86, 20);
		panelPessoa.add(cpfClienteField);
		cpfClienteField.setColumns(10);

		rgClienteField = new JTextField();
		rgClienteField.setBounds(57, 49, 223, 20);
		panelPessoa.add(rgClienteField);
		rgClienteField.setColumns(10);

		nascimentoClienteField = new com.toedter.calendar.JDateChooser();
		nascimentoClienteField.setBounds(355, 108, 87, 20);
		panelPessoa.add(nascimentoClienteField);

		JLabel lbltelefone = new JLabel("*Telefone:");
		lbltelefone.setBounds(290, 52, 59, 14);
		panelPessoa.add(lbltelefone);

		JLabel lblE = new JLabel("E-mail:");
		lblE.setBounds(10, 77, 37, 14);
		panelPessoa.add(lblE);

		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(290, 77, 28, 14);
		panelPessoa.add(lblNewLabel_2);

		sexoClienteBox = new JComboBox();
		sexoClienteBox.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		sexoClienteBox.setSelectedIndex(0);
		sexoClienteBox.setMaximumRowCount(3);
		sexoClienteBox.setBounds(356, 77, 86, 20);
		panelPessoa.add(sexoClienteBox);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 112, 59, 14);
		panelPessoa.add(lblEstadoCivil);

		estadoCivilClienteBox = new JComboBox();
		estadoCivilClienteBox.setModel(new DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", " Viúvo(a)", " Divorciado(a)" }));
		estadoCivilClienteBox.setSelectedIndex(0);
		estadoCivilClienteBox.setMaximumRowCount(3);
		estadoCivilClienteBox.setBounds(77, 109, 92, 20);
		panelPessoa.add(estadoCivilClienteBox);
		try {
			javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)####-####");
			telefoneClienteField = new javax.swing.JFormattedTextField(telefone);
		} catch (Exception e) {
		}

		telefoneClienteField.setBounds(356, 49, 86, 20);
		panelPessoa.add(telefoneClienteField);
		telefoneClienteField.setColumns(10);

		emailClienteField = new JTextField();
		emailClienteField.setBounds(57, 77, 223, 20);
		panelPessoa.add(emailClienteField);
		emailClienteField.setColumns(10);

		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEndereco.setBounds(10, 204, 452, 107);
		panelDados.add(panelEndereco);
		panelEndereco.setLayout(null);

		JLabel lblcidade = new JLabel("*Cidade:");
		lblcidade.setBounds(10, 24, 43, 14);
		panelEndereco.add(lblcidade);

		JLabel lblrua = new JLabel("*Rua:");
		lblrua.setBounds(10, 49, 29, 14);
		panelEndereco.add(lblrua);

		JLabel lblbairro = new JLabel("*Bairro:");
		lblbairro.setBounds(10, 74, 38, 14);
		panelEndereco.add(lblbairro);

		cidadeClienteField = new JTextField();
		cidadeClienteField.setBounds(63, 21, 132, 20);
		panelEndereco.add(cidadeClienteField);
		cidadeClienteField.setColumns(10);

		ruaClienteField = new JTextField();
		ruaClienteField.setBounds(63, 46, 132, 20);
		panelEndereco.add(ruaClienteField);
		ruaClienteField.setColumns(10);

		bairroClienteField = new JTextField();
		bairroClienteField.setBounds(63, 71, 132, 20);
		panelEndereco.add(bairroClienteField);
		bairroClienteField.setColumns(10);

		JLabel lblestado = new JLabel("*Estado:");
		lblestado.setBounds(205, 71, 43, 14);
		panelEndereco.add(lblestado);

		JLabel lblcomplemento = new JLabel("*Complemento:");
		lblcomplemento.setBounds(205, 24, 75, 14);
		panelEndereco.add(lblcomplemento);

		JLabel lblcep = new JLabel("*CEP:");
		lblcep.setBounds(205, 46, 29, 14);
		panelEndereco.add(lblcep);

		estadoClienteBox = new JComboBox();
		estadoClienteBox.setModel(new DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
				"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		estadoClienteBox.setSelectedIndex(15);
		estadoClienteBox.setMaximumRowCount(27);
		estadoClienteBox.setBounds(258, 68, 54, 20);
		panelEndereco.add(estadoClienteBox);

		complementoClienteField = new JTextField();
		complementoClienteField.setBounds(290, 21, 152, 20);
		panelEndereco.add(complementoClienteField);
		complementoClienteField.setColumns(10);

		JLabel lblnmero = new JLabel("*Número:");
		lblnmero.setBounds(336, 71, 47, 14);
		panelEndereco.add(lblnmero);

		numeroClienteField = new JTextField();
		numeroClienteField.setBounds(393, 68, 49, 20);
		panelEndereco.add(numeroClienteField);
		numeroClienteField.setColumns(10);

		try {
			javax.swing.text.MaskFormatter cep = new javax.swing.text.MaskFormatter("#####-###");
			cepClienteField = new javax.swing.JFormattedTextField(cep);
		} catch (Exception e) {
		}
		cepClienteField.setBounds(290, 46, 86, 20);
		panelEndereco.add(cepClienteField);
		cepClienteField.setColumns(10);

		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setBounds(10, 11, 45, 16);
		panelDados.add(lblCdigo);

		idClienteField = new JTextField();
		idClienteField.setBounds(65, 9, 53, 20);
		panelDados.add(idClienteField);
		idClienteField.setColumns(10);

		JLabel lblDataCadastro = new JLabel("Data Cadastro:");
		lblDataCadastro.setBounds(130, 12, 82, 16);
		panelDados.add(lblDataCadastro);

		dataCadastroField = new JTextField();
		dataCadastroField.setBounds(213, 9, 68, 20);
		panelDados.add(dataCadastroField);
		dataCadastroField.setColumns(10);

	}

	@Override
	public void novo() {

		nomeClienteField.setEnabled(true);
		cpfClienteField.setEnabled(true);
		rgClienteField.setEnabled(true);
		nascimentoClienteField.setEnabled(true);
		telefoneClienteField.setEnabled(true);
		emailClienteField.setEnabled(true);
		cidadeClienteField.setEnabled(true);
		ruaClienteField.setEnabled(true);
		bairroClienteField.setEnabled(true);
		complementoClienteField.setEnabled(true);
		numeroClienteField.setEnabled(true);
		cepClienteField.setEnabled(true);
		sexoClienteBox.setEnabled(true);
		estadoCivilClienteBox.setEnabled(true);
		estadoClienteBox.setEnabled(true);

	}

	@Override
	public void gravar() {
		try {
			verificaCamposObrigatorios();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campos Faltantes", JOptionPane.ERROR_MESSAGE);
		}
		
		Cliente cliente = obterCliente();
		try {
			this.clienteService.gravar(cliente);
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
			limpaCampos();
		} catch (BusinessException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			ex.printStackTrace();
		}
		

	}

	@Override
	public void cancelar() {
		limpaCampos();
		setDisableComponents();
	}

	@Override
	public void localizar() {
		FormBuscaCliente buscaCliente = new FormBuscaCliente(getClienteService());
		buscaCliente.setVisible(true);
	}

	@Override
	public void limparCampos() {
		limpaCampos();

	}

	@Override
	public void habilitarCampos() {
		// TODO Auto-generated method stub

	}

	private void verificaCamposObrigatorios() throws Exception {
		StringBuilder camposFaltantes = new StringBuilder();
		if (nomeClienteField.getText().isEmpty())
			camposFaltantes.append("Nome do Cliente.");

		if (telefoneClienteField.getText().isEmpty())
			camposFaltantes.append("Telefone.");
		if (cpfClienteField.getText().isEmpty())
			camposFaltantes.append("CPF.");
		if (rgClienteField.getText().isEmpty())
			camposFaltantes.append("RG.");
		if (cidadeClienteField.getText().isEmpty())
			camposFaltantes.append("Cidade.");
		if (ruaClienteField.getText().isEmpty())
			camposFaltantes.append("Rua.");
		if (bairroClienteField.getText().isEmpty())
			camposFaltantes.append("Bairro.");
		if (numeroClienteField.getText().isEmpty())
			camposFaltantes.append("Número.");

		if (camposFaltantes.length() > 0)
			throw new Exception("Campos Obrigatórios faltantes: " + camposFaltantes);

	}
	
	private void atualizarCliente(Cliente cliente) {
		
	}
	
	
	private Cliente obterCliente() {
		Date data = new Date();
		data = nascimentoClienteField.getDate();
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeClienteField.getText());
		cliente.setCpf(cpfClienteField.getText());
		cliente.setRg(rgClienteField.getText());
		cliente.setDataNascimento(formatarDate.format(data));
		cliente.setTelefone(telefoneClienteField.getText());
		cliente.setEmail(emailClienteField.getText());
		cliente.setSexo(sexoClienteBox.getSelectedItem().toString());
		cliente.setEstadoCivil(estadoCivilClienteBox.getSelectedItem().toString());
		Endereco endereco = new Endereco();
		endereco.setCidade(cidadeClienteField.getText());
		endereco.setRua(ruaClienteField.getText());
		endereco.setBairro(bairroClienteField.getText());
		endereco.setComplemento(complementoClienteField.getText());
		endereco.setNumero(Integer.parseInt(numeroClienteField.getText()));
		endereco.setCep(cepClienteField.getText());
		endereco.setEstado(estadoClienteBox.getSelectedItem().toString());
		cliente.setEndereco(endereco);
		
		return cliente;
		
		
	}
	

	public void limpaCampos() {
		nascimentoClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		telefoneClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		cpfClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		cepClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		idClienteField.setText(""); 
		cpfClienteField.setText("");
		telefoneClienteField.setText("");
		nomeClienteField.setText("");
		rgClienteField.setText("");
		emailClienteField.setText("");
		dataCadastroField.setText("");
		cidadeClienteField.setText("");
		cepClienteField.setText("");
		ruaClienteField.setText("");
		complementoClienteField.setText("");
		numeroClienteField.setText("");
		bairroClienteField.setText("");
		dataCadastroField.setText(formatarDate.format(date));
		sexoClienteBox.setSelectedIndex(0);
		estadoCivilClienteBox.setSelectedIndex(1);
		estadoClienteBox.setSelectedIndex(15);
		bairroClienteField.setText("");
		nascimentoClienteField.cleanup();
	}
	
	
	public ClienteService getClienteService() {
		if (clienteService == null) {
			clienteService = new ServiceLocator().loadService(ClienteService.class);
			System.out.println("ClienteService: " + clienteService);
		}
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
}
