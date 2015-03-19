package com.datacoper.locacaoequipamentos.arquitetura.client;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class FormPadraoPesquisa extends JDialog {

	private long tempo;

	public FormPadraoPesquisa() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panelFundo = new JPanel();
		panelFundo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelFundo, BorderLayout.CENTER);
		panelFundo.setLayout(new BorderLayout(0, 0));

		JPanel panelCampos = new JPanel();
		panelCampos.setBorder(new TitledBorder(null, "Filtro de Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFundo.add(panelCampos, BorderLayout.NORTH);
		GridBagLayout gbl_panelCampos = new GridBagLayout();
		gbl_panelCampos.columnWidths = new int[] { 87, 481 };
		gbl_panelCampos.rowHeights = new int[] { 28, 20 };
		gbl_panelCampos.columnWeights = new double[] { 0.0, 0.0 };
		gbl_panelCampos.rowWeights = new double[] { 0.0, 0.0 };
		panelCampos.setLayout(gbl_panelCampos);

		JLabel lblPesquisarPor = new JLabel("Pesquisar por:");
		lblPesquisarPor.setPreferredSize(new Dimension(40, 14));
		lblPesquisarPor.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_lblPesquisarPor = new GridBagConstraints();
		gbc_lblPesquisarPor.ipady = 2;
		gbc_lblPesquisarPor.ipadx = 2;
		gbc_lblPesquisarPor.anchor = GridBagConstraints.EAST;
		gbc_lblPesquisarPor.fill = GridBagConstraints.BOTH;
		gbc_lblPesquisarPor.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesquisarPor.gridx = 0;
		gbc_lblPesquisarPor.gridy = 0;
		panelCampos.add(lblPesquisarPor, gbc_lblPesquisarPor);

		panelComboBox = new JPanel();
		panelComboBox.setBackground(UIManager.getColor("control"));
		panelComboBox.setSize(new Dimension(50, 50));
		panelComboBox.setPreferredSize(new Dimension(80, 10));
		GridBagConstraints gbc_panelComboBox = new GridBagConstraints();
		gbc_panelComboBox.fill = GridBagConstraints.BOTH;
		gbc_panelComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_panelComboBox.gridx = 1;
		gbc_panelComboBox.gridy = 0;
		panelCampos.add(panelComboBox, gbc_panelComboBox);

		FieldPesquisa = new JTextField();
		

		GridBagConstraints gbc_FieldPesquisa = new GridBagConstraints();
		gbc_FieldPesquisa.gridwidth = 2;
		gbc_FieldPesquisa.fill = GridBagConstraints.BOTH;
		gbc_FieldPesquisa.insets = new Insets(0, 0, 0, 5);
		gbc_FieldPesquisa.gridx = 0;
		gbc_FieldPesquisa.gridy = 1;
		panelCampos.add(FieldPesquisa, gbc_FieldPesquisa);
		FieldPesquisa.setColumns(2);

		JPanel panelButtons = new JPanel();
		panelFundo.add(panelButtons, BorderLayout.SOUTH);
		FlowLayout flowLayout = (FlowLayout) panelButtons.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);

		btnOk = new JButton("Ok");
		btnOk.setPreferredSize(new Dimension(75, 23));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnCancelar = new JButton("Cancelar");
		panelButtons.add(btnCancelar);
		panelButtons.add(btnOk);

		JPanel panelTable = new JPanel();
		panelFundo.add(panelTable, BorderLayout.CENTER);
		panelTable.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTable.add(scrollPane);
		
		pesquisar(null);
		table = new JTable(getTableModel());
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					getSelectedRow(table.getSelectedRow());
				}
			}
		});
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);
//		List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
//		sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
//		sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
//		sorter.setSortKeys(sortKeys);

		scrollPane.setViewportView(table);
		panelComboBox.add(getComboBox());

		FieldPesquisa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String pesquisa = FieldPesquisa.getText();
				pesquisar(pesquisa);
				table.setModel((getTableModel()));
				table.revalidate();
				table.repaint();
			}
		});
		setSize(820, 460);
		setResizable(false);
		setLocationRelativeTo(null);
		setModal(true);

	}

	private static final long serialVersionUID = 1L;
	private JButton btnOk;
	private JButton btnCancelar;
	private JTextField FieldPesquisa;
	private JTable table;
	private ButtonGroup buttonGroup;
	private JPanel panelComboBox;

	public abstract void ok();

	public abstract void cancelar();

	public abstract void getSelectedRow(int selectedRow);

	public abstract JComboBox getComboBox();

	public abstract TableModel getTableModel();

	public abstract void pesquisar(String pesquisa);

}
