package com.datacoper.locacaoequipamentos.client.cliente;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.datacoper.locacaoequipamentos.common.exception.BusinessException;
import com.datacoper.locacaoequipamentos.common.model.Cliente;
import com.datacoper.locacaoequipamentos.common.model.Endereco;
import com.datacoper.locacaoequipamentos.common.service.ClienteService;
import com.datacoper.locacaoequipamentos.common.service.ServiceLocator;

public class FormCadastroCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JTextField idClienteField;
	private JTextField dataCadastroClienteField;
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
	private JButton adicionarButton;
	private JButton editarButton;
	private JButton excluirButton;
	SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date(System.currentTimeMillis());
	private ClienteService clienteService;

	public FormCadastroCliente() {
		setBounds(100, 100, 634, 480);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Pessoa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 36, 601, 132);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblnome = new JLabel("*Nome:");
		lblnome.setBounds(10, 21, 37, 14);
		panel.add(lblnome);

		JLabel lblcpf = new JLabel("*CPF:");
		lblcpf.setBounds(10, 46, 46, 14);
		panel.add(lblcpf);

		JLabel lblNewLabel_1 = new JLabel("*RG:");
		lblNewLabel_1.setBounds(10, 71, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lbldatanascimento = new JLabel("*DataNascimento:");
		lbldatanascimento.setBounds(10, 101, 97, 14);
		panel.add(lbldatanascimento);

		nomeClienteField = new JTextField();
		nomeClienteField.setBounds(57, 18, 227, 20);
		panel.add(nomeClienteField);
		nomeClienteField.setColumns(10);

		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
			cpfClienteField = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e) {
		}
		cpfClienteField.setBounds(57, 43, 227, 20);
		panel.add(cpfClienteField);
		cpfClienteField.setColumns(10);

		rgClienteField = new JTextField();
		rgClienteField.setBounds(57, 71, 227, 20);
		panel.add(rgClienteField);
		rgClienteField.setColumns(10);

		nascimentoClienteField = new com.toedter.calendar.JDateChooser();
		nascimentoClienteField.setBounds(110, 95, 86, 20);
		panel.add(nascimentoClienteField);

		JLabel lbltelefone = new JLabel("Telefone:");
		lbltelefone.setBounds(309, 21, 59, 14);
		panel.add(lbltelefone);

		JLabel lblE = new JLabel("E-mail:");
		lblE.setBounds(309, 46, 46, 14);
		panel.add(lblE);

		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(309, 74, 28, 14);
		panel.add(lblNewLabel_2);

		sexoClienteBox = new JComboBox();
		sexoClienteBox.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		sexoClienteBox.setSelectedIndex(0);
		sexoClienteBox.setMaximumRowCount(3);
		sexoClienteBox.setBounds(340, 73, 86, 20);
		panel.add(sexoClienteBox);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(436, 76, 65, 14);
		panel.add(lblEstadoCivil);

		estadoCivilClienteBox = new JComboBox();
		estadoCivilClienteBox.setModel(new DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", " Viúvo(a)", " Divorciado(a)" }));
		estadoCivilClienteBox.setSelectedIndex(0);
		estadoCivilClienteBox.setMaximumRowCount(3);
		estadoCivilClienteBox.setBounds(500, 73, 91, 20);
		panel.add(estadoCivilClienteBox);
		try {
			javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)####-####");
			telefoneClienteField = new javax.swing.JFormattedTextField(telefone);
		} catch (Exception e) {
		}

		telefoneClienteField.setBounds(360, 18, 125, 20);
		panel.add(telefoneClienteField);
		telefoneClienteField.setColumns(10);

		emailClienteField = new JTextField();
		emailClienteField.setBounds(360, 43, 231, 20);
		panel.add(emailClienteField);
		emailClienteField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);

		idClienteField = new JTextField();
		idClienteField.setBackground(SystemColor.control);
		idClienteField.setBounds(58, 8, 86, 20);
		getContentPane().add(idClienteField);
		idClienteField.setColumns(10);

		JLabel lblDataCadastro = new JLabel("Data Cadastro:");
		lblDataCadastro.setBounds(170, 11, 86, 14);
		getContentPane().add(lblDataCadastro);

		dataCadastroClienteField = new JTextField();
		dataCadastroClienteField.setBackground(SystemColor.control);
		dataCadastroClienteField.setBounds(266, 8, 86, 20);
		getContentPane().add(dataCadastroClienteField);
		dataCadastroClienteField.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 179, 601, 111);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblcidade = new JLabel("*Cidade:");
		lblcidade.setBounds(10, 21, 46, 14);
		panel_1.add(lblcidade);

		JLabel lblrua = new JLabel("*Rua:");
		lblrua.setBounds(10, 46, 46, 14);
		panel_1.add(lblrua);

		JLabel lblbairro = new JLabel("*Bairro:");
		lblbairro.setBounds(10, 71, 46, 14);
		panel_1.add(lblbairro);

		cidadeClienteField = new JTextField();
		cidadeClienteField.setBounds(59, 18, 227, 20);
		panel_1.add(cidadeClienteField);
		cidadeClienteField.setColumns(10);

		ruaClienteField = new JTextField();
		ruaClienteField.setBounds(59, 43, 227, 20);
		panel_1.add(ruaClienteField);
		ruaClienteField.setColumns(10);

		bairroClienteField = new JTextField();
		bairroClienteField.setBounds(59, 71, 227, 20);
		panel_1.add(bairroClienteField);
		bairroClienteField.setColumns(10);

		JLabel lblestado = new JLabel("*Estado:");
		lblestado.setBounds(309, 21, 46, 14);
		panel_1.add(lblestado);

		JLabel lblcomplemento = new JLabel("*Complemento:");
		lblcomplemento.setBounds(309, 46, 75, 14);
		panel_1.add(lblcomplemento);

		JLabel lblcep = new JLabel("*CEP:");
		lblcep.setBounds(447, 71, 46, 14);
		panel_1.add(lblcep);

		estadoClienteBox = new JComboBox();
		estadoClienteBox.setModel(new DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
				"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		estadoClienteBox.setSelectedIndex(15);
		estadoClienteBox.setMaximumRowCount(27);
		estadoClienteBox.setBounds(392, 18, 46, 20);
		panel_1.add(estadoClienteBox);

		complementoClienteField = new JTextField();
		complementoClienteField.setBounds(392, 43, 199, 20);
		panel_1.add(complementoClienteField);
		complementoClienteField.setColumns(10);

		JLabel lblnmero = new JLabel("*Número:");
		lblnmero.setBounds(309, 71, 52, 14);
		panel_1.add(lblnmero);

		numeroClienteField = new JTextField();
		numeroClienteField.setBounds(391, 68, 46, 20);
		panel_1.add(numeroClienteField);
		numeroClienteField.setColumns(10);

		try {
			javax.swing.text.MaskFormatter cep = new javax.swing.text.MaskFormatter("#####-###");
			cepClienteField = new javax.swing.JFormattedTextField(cep);
		} catch (Exception e) {
		}
		cepClienteField.setBounds(487, 68, 104, 20);
		panel_1.add(cepClienteField);
		cepClienteField.setColumns(10);

		adicionarButton = new JButton("Adicionar");
		adicionarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarAction();
			}
		});
		adicionarButton.setBounds(522, 297, 89, 23);
		getContentPane().add(adicionarButton);

		editarButton = new JButton("Editar");
		editarButton.setBounds(409, 297, 89, 23);
		getContentPane().add(editarButton);

		excluirButton = new JButton("Excluir");
		excluirButton.setBounds(290, 297, 89, 23);
		getContentPane().add(excluirButton);

		this.clienteService = getClienteService();

	}

	protected void adicionarAction() {
		String cpf, telefone, nome, rg, sexo, estadoCivil, dataCadastro, dataNascimento, email = null;
		String cidade, rua, bairro, estado, cep, complemento = null;
		int numero, id = 0;
		Cliente c = new Cliente();
		Date data = new Date();
		data = nascimentoClienteField.getDate();
		if (nascimentoClienteField.getDate() == null) {
			cpfClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
			JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Data de Nascimento de forma correta", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		} else if (numeroClienteField.getText().equals("")) {
			numeroClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
			JOptionPane.showMessageDialog(null, "Por favor, preencha o campo número crretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			// if(!nomeClienteField.getText().isEmpty() ||
			// !cpfClienteField.getText().isEmpty())
			if (!idClienteField.getText().isEmpty())
				id = Integer.valueOf(idClienteField.getText());
			dataNascimento = formatarDate.format(data);
			cpf = cpfClienteField.getText();
			telefone = telefoneClienteField.getText();
			nome = nomeClienteField.getText();
			rg = rgClienteField.getText();
			email = emailClienteField.getText();
			sexo = (String) sexoClienteBox.getSelectedItem();
			estadoCivil = (String) estadoCivilClienteBox.getSelectedItem();
			dataCadastro = formatarDate.format(date);
			cidade = cidadeClienteField.getText();
			rua = ruaClienteField.getText();
			complemento = complementoClienteField.getText();
			numero = Integer.parseInt(numeroClienteField.getText());
			estado = (String) estadoClienteBox.getSelectedItem();
			bairro = bairroClienteField.getText();
			cep = cepClienteField.getText();
			//

			c.setNome(nome);
			c.setCpf(cpf);
			c.setRg(rg);
			c.setDataCadastro(dataCadastro);
			c.setEstadoCivil(estadoCivil);
			c.setSexo(sexo);
			c.setEmail(email);
			c.setTelefone(telefone);
			c.setDataNascimento(dataNascimento);
			Endereco end = new Endereco();
			end.setEstado(estado);
			end.setCidade(cidade);
			end.setRua(rua);
			end.setBairro(bairro);
			end.setCep(cep);
			end.setNumero(numero);
			end.setComplemento(complemento);
			c.setEndereco(end);
		}

		if (adicionarButton.getText().equals("Adicionar")) {

			try {
				this.clienteService.gravar(c);
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				atualizaCampos();
			} catch (BusinessException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				ex.printStackTrace();
			}

		} else if (adicionarButton.getText().equals("Editar Cliente")) {
			c.setIdCliente(id);
			boolean gravado = false;
			try {
				// gravado = this.clienteService.updateCliente(c);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}

			if (gravado) // Cadastra o Cliente
			{
				JOptionPane.showMessageDialog(null, "Cliente Editado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				atualizaCampos();
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possivel editar este Cliente", "Erro", JOptionPane.ERROR_MESSAGE);
			}

		} else if (adicionarButton.getText().equals("Excluir Cliente")) {
			c.setIdCliente(id);
			boolean gravado = false;
			try {
				// gravado = this.clienteService.excluir(c);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

			}

			if (gravado) // Cadastra o Cliente
			{
				JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				atualizaCampos();
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possivel excluir este Cliente", "Erro", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void atualizaCampos() {
		nascimentoClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		telefoneClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		cpfClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		cepClienteField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		idClienteField.setText(""); // Depois criar metodo para pegar o prox id
									// a ser cadastrado
		cpfClienteField.setText("");
		telefoneClienteField.setText("");
		nomeClienteField.setText("");
		rgClienteField.setText("");
		emailClienteField.setText("");
		dataCadastroClienteField.setText("");
		cidadeClienteField.setText("");
		cepClienteField.setText("");
		ruaClienteField.setText("");
		complementoClienteField.setText("");
		numeroClienteField.setText("");
		bairroClienteField.setText("");
		dataCadastroClienteField.setText(formatarDate.format(date));
		sexoClienteBox.setSelectedIndex(0);
		estadoCivilClienteBox.setSelectedIndex(1);
		estadoClienteBox.setSelectedIndex(15);
		adicionarButton.setText("Adicionar");
		editarButton.setVisible(true);
		excluirButton.setVisible(true);
		editarButton.setText("Editar");
		excluirButton.setText("Excluir");
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
