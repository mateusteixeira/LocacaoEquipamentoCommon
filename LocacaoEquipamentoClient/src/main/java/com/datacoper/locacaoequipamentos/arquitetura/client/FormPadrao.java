package com.datacoper.locacaoequipamentos.arquitetura.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import com.datacoper.locacaoequipamentos.client.cliente.FormCliente;
import com.datacoper.locacaoequipamentos.client.util.ViewMethods;

public abstract class FormPadrao extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	protected JPanel panelDados;
	protected JPanel panel;
	private JButton btnNovo;
	private JButton btnGravar;
	private JButton btnCancelar;
	private JButton btnLocalizar;
	private JButton btnLimpar;
	private JButton btnExcluir;

	public FormPadrao() {

		initComponents();
	}

	protected void initComponents() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		panelDados = new JPanel();
		getContentPane().add(panelDados, BorderLayout.CENTER);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setPreferredSize(new Dimension(90, 10));
		getContentPane().add(panel, BorderLayout.EAST);

		btnNovo = new JButton("Novo");
		btnNovo.setBounds(2, 16, 87, 23);
		btnNovo.setPreferredSize(new Dimension(87, 23));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novo();
			}
		});
		panel.setLayout(null);
		panel.add(btnNovo);

		btnGravar = new JButton("Gravar");
		btnGravar.setBounds(2, 50, 87, 23);
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gravar();
			}
		});
		btnGravar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnGravar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(2, 84, 87, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		btnCancelar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnCancelar);

		btnLocalizar = new JButton("Localizar");
		btnLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				localizar();
			}
		});
		btnLocalizar.setBounds(2, 118, 87, 23);
		btnLocalizar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnLocalizar);

		btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(2, 187, 87, 23);
		panel.add(btnExcluir);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setBounds(2, 152, 87, 23);
		panel.add(btnLimpar);

		btnLimpar.setEnabled(false);
		btnGravar.setEnabled(false);
		btnExcluir.setEnabled(false);
		btnCancelar.setEnabled(false);
	}

	public void novo() {
		ViewMethods.chaveadorCampos(this.panelDados, true);
		ViewMethods.limparCampos(panelDados);
		btnCancelar.setEnabled(true);
		btnGravar.setEnabled(true);
		btnLimpar.setEnabled(true);
		btnLocalizar.setEnabled(false);
		btnExcluir.setEnabled(false);
	}

	public abstract void gravar();

	public void cancelar() {
		ViewMethods.limparCampos(panelDados);
		ViewMethods.chaveadorCampos(this.panelDados, false);
	}

	public abstract void localizar();

	public abstract void limparCampos();

	public abstract void habilitarCampos();
	
	public abstract void excluir();
}
