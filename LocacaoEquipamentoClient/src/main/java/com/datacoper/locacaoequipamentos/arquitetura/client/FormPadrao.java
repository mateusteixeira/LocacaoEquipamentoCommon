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

public class FormPadrao extends JInternalFrame{

	private static final long serialVersionUID = 1L;
	private IAcoes iAcoes;
	protected JPanel panelDados;
	protected JPanel panel;
	
	
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
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(2, 16, 87, 23);
		btnNovo.setPreferredSize(new Dimension(87, 23));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iAcoes.novo();
			}
		});
		panel.setLayout(null);
		panel.add(btnNovo);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(2, 50, 87, 23);
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iAcoes.gravar();
			}
		});
		btnGravar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(2, 84, 87, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iAcoes.cancelar();
			}
		});
		btnCancelar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnCancelar);
		
		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iAcoes.localizar();
			}
		});
		btnLocalizar.setBounds(2, 118, 87, 23);
		btnLocalizar.setPreferredSize(new Dimension(87, 23));
		panel.add(btnLocalizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(2, 152, 87, 23);
		panel.add(btnExcluir);
	}
	
	protected void setIAcoes(IAcoes iAcoes) {
		this.iAcoes = iAcoes;
	}
}
