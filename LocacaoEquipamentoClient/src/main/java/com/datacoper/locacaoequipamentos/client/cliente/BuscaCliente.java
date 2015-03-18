/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.client.cliente;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.datacoper.locacaoequipamentos.common.model.Cliente;

public final class BuscaCliente extends javax.swing.JFrame {

    List<Cliente> lista = new ArrayList<Cliente>();
    int item = 0;
    String op;

    public BuscaCliente(String entrada, CadastroCliente cadCliente) {
        initComponents();
        setLocationRelativeTo(null);
        atualizaClientesAll();
        op = entrada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JRadioButton();
        Codigo = new javax.swing.JRadioButton();
        CPF = new javax.swing.JRadioButton();
        Telefone = new javax.swing.JRadioButton();
        CampoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Clientes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");
        setResizable(false);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Pesquisar por:");

        buttonGroup1.add(Nome);
        Nome.setSelected(true);
        Nome.setText("Nome");

        buttonGroup1.add(Codigo);
        Codigo.setText("Código");

        buttonGroup1.add(CPF);
        CPF.setText("CPF");

        buttonGroup1.add(Telefone);
        Telefone.setText("Telefone");

        CampoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesquisaActionPerformed(evt);
            }
        });
        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        Tabela_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(Tabela_Clientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addComponent(CampoPesquisa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nome)
                        .addGap(8, 8, 8)
                        .addComponent(Codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefone)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CPF)
                        .addComponent(Telefone)
                        .addComponent(Codigo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Nome)))
                .addGap(4, 4, 4)
                .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        item = Tabela_Clientes.getSelectedRow();
        if (item == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Cliente selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (op) {
//                case "relatorio":
//                    relatorio();
//                    break;
                case "editacliente":
                    telaNewCliente();
                    break;
//                case "newlocacao":
//                    newLocacao();
//                    break;
//                case "devolucao":
//                    try {
//                        devolucao();
//                    } catch (SQLException ex) {
//                        Logger.getLogger(BuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
//                    } catch (Exception ex) {
//                        Logger.getLogger(BuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    break;
                case "consulta":
                    ConsultaCliente p = new ConsultaCliente(lista.get(item));
                    p.setVisible(true);
                    break;
            }
            this.setVisible(false);
        }


    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void CampoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyPressed
    }//GEN-LAST:event_CampoPesquisaKeyPressed

    private void CampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesquisaActionPerformed

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
        String pesquisa;
        int id = 0;
        pesquisa = CampoPesquisa.getText();
        if (!"".equals(pesquisa)) {
            if (Nome.isSelected()) {
                id = 1;
            } else if (Codigo.isSelected()) {
                id = 2;
            } else if (CPF.isSelected()) {
                id = 3;
            } else if (Telefone.isSelected()) {
                id = 4;
            }
            atualizaClientesEsp(id, pesquisa);
        } else {
            atualizaClientesAll();
        }
    }//GEN-LAST:event_CampoPesquisaKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CPF;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JRadioButton Codigo;
    private javax.swing.JRadioButton Nome;
    private javax.swing.JTable Tabela_Clientes;
    private javax.swing.JRadioButton Telefone;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
//    public void relatorio() {
//        RelatorioCliente.setCliente(lista.get(item));
//    }

    public void telaNewCliente() {
        CadastroCliente.setCliente(lista.get(item));
    }

//    public void devolucao() throws SQLException, Exception {
//        Devolucao.setCliente(lista.get(item));
//    }
//
//    public void newLocacao() {
//        Locacoes.setCliente(lista.get(item));
//    }
    public void atualizaClientesAll() {
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Clientes.getModel();
        modelo.setNumRows(0);
        String temp[] = new String[4];
        lista.clear();
//
//        try {
//            lista = this.cadastroCliente.getClienteService().buscaClienteAll(2, 1);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//            Logger.getLogger(BuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //Joga para tabela
        for (int i = 0; i < lista.size(); i++) {
            temp[0] = String.valueOf(lista.get(i).getIdCliente());
            temp[1] = lista.get(i).getNome();
            temp[2] = lista.get(i).getCpf();
            temp[3] = lista.get(i).getTelefone();

            modelo.addRow(temp);
        }

    }

    public void atualizaClientesEsp(int id, String cont) {
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Clientes.getModel();
        modelo.setNumRows(0);
        String temp[] = new String[4];
        lista.clear();

//        try {
//            lista = this.cadastroCliente.getClienteService().buscaClienteEsp(2, 1, id, cont);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//            Logger.getLogger(BuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Joga para tabela
        for (int i = 0; i < lista.size(); i++) {
            temp[0] = String.valueOf(lista.get(i).getIdCliente());
            temp[1] = lista.get(i).getNome();
            temp[2] = lista.get(i).getCpf();
            temp[3] = lista.get(i).getTelefone();

            modelo.addRow(temp);
        }

    }

}
