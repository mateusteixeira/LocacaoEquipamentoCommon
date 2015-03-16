package com.datacoper.locacaoequipamentos.client.cliente;


import com.datacoper.locacaoequipamentos.common.model.Cliente;
import javax.swing.table.DefaultTableModel;

public class ConsultaCliente extends javax.swing.JFrame {

    Cliente cliente = new Cliente();

    public ConsultaCliente(Cliente cli) {
        initComponents();
        setLocationRelativeTo(null);
        cliente = cli;
        preenche();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CampoID_Cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoDataCad_Cliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        CampoCEP_Cliente = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("#####-###");
            CampoCEP_Cliente = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        jLabel14 = new javax.swing.JLabel();
        CampoNumero_Cliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CampoRua_Cliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CampoCidade_Cliente = new javax.swing.JTextField();
        Campoestado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        CampoBairro_Cliente = new javax.swing.JTextField();
        CampoComplemento_Cliente1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoCPF_Cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CampoNome_Cliente = new javax.swing.JTextField();
        CampoRG_Cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CampoEmail_Cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoTelefone_Cliente = new javax.swing.JTextField();
        CampoSexo = new javax.swing.JTextField();
        CampoNascimento = new javax.swing.JTextField();
        CampoEstadocivil = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Consultar Cliente");

        PanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Clientes"));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1097, 448));

        jLabel5.setText("Código:");

        CampoID_Cliente.setEditable(false);

        jLabel7.setText("Data do Cadastro:");

        CampoDataCad_Cliente.setEditable(false);
        CampoDataCad_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataCad_ClienteActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel12.setText("Rua:");

        CampoCEP_Cliente.setEditable(false);
        CampoCEP_Cliente.setToolTipText("Insira o CEP de residência do Cliente.");
        CampoCEP_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setText(" Número:");

        CampoNumero_Cliente.setEditable(false);
        CampoNumero_Cliente.setToolTipText("Insira o número da residência do Cliente. *(Obrigatório)");
        CampoNumero_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel13.setText("CEP:");

        CampoRua_Cliente.setEditable(false);
        CampoRua_Cliente.setToolTipText("Insira o nome da rua de residência do Cliente. *(Obrigatório)");
        CampoRua_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel15.setText("Cidade:");

        CampoCidade_Cliente.setEditable(false);
        CampoCidade_Cliente.setToolTipText("Insira a cidade de residência do Cliente. *(Obrigatório)");
        CampoCidade_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Campoestado.setEditable(false);
        Campoestado.setToolTipText("Insira o complemento da residência do Cliente.");
        Campoestado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setText("Complemento: ");

        jLabel17.setText("Estado:");

        jLabel28.setText("Bairro:");

        CampoBairro_Cliente.setEditable(false);
        CampoBairro_Cliente.setToolTipText("Insira o bairro de residência do Cliente. *(Obrigatório)");
        CampoBairro_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CampoComplemento_Cliente1.setEditable(false);
        CampoComplemento_Cliente1.setToolTipText("Insira o complemento da residência do Cliente.");
        CampoComplemento_Cliente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel28)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(CampoBairro_Cliente))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel15)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(CampoCidade_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel12)
                        .add(18, 18, 18)
                        .add(CampoRua_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel16)
                            .add(jLabel13))
                        .add(4, 4, 4)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(CampoCEP_Cliente)
                                .add(20, 20, 20)
                                .add(jLabel14)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(CampoNumero_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(CampoComplemento_Cliente1)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Campoestado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel15)
                    .add(CampoCidade_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel17)
                    .add(Campoestado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CampoRua_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12)
                    .add(jLabel16)
                    .add(CampoComplemento_Cliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13)
                            .add(jLabel28)
                            .add(CampoBairro_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel14)
                                .add(CampoNumero_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(CampoCEP_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        jPanel2.setMaximumSize(new java.awt.Dimension(1073, 468));
        jPanel2.setMinimumSize(new java.awt.Dimension(1073, 468));

        jLabel3.setText("RG:");

        jLabel2.setText("CPF:");

        CampoCPF_Cliente.setEditable(false);
        CampoCPF_Cliente.setToolTipText("Insira o CPF do Cliente. *(Obrigatório)");
        CampoCPF_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setText("Nome:");

        CampoNome_Cliente.setEditable(false);
        CampoNome_Cliente.setToolTipText("Insira o nome completo do Cliente. *(Obrigatório)");
        CampoNome_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CampoRG_Cliente.setEditable(false);
        CampoRG_Cliente.setToolTipText("Insira o RG do Cliente, somente números. *(Obrigatório)");
        CampoRG_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setText("Sexo:");

        jLabel8.setText("Data de Nascimento:");

        jLabel9.setText("Estado Civil:");

        jLabel11.setText("E-mail:");

        CampoEmail_Cliente.setEditable(false);
        CampoEmail_Cliente.setToolTipText("Insira o e-mail do Cliente.");
        CampoEmail_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel10.setText("Telefone:");

        CampoTelefone_Cliente.setEditable(false);
        CampoTelefone_Cliente.setToolTipText("Insira o número do telefone do Cliente. *(Obrigatório)");
        CampoTelefone_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CampoSexo.setEditable(false);
        CampoSexo.setToolTipText("Insira o número do telefone do Cliente. *(Obrigatório)");
        CampoSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CampoNascimento.setEditable(false);
        CampoNascimento.setToolTipText("Insira o número do telefone do Cliente. *(Obrigatório)");
        CampoNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CampoEstadocivil.setEditable(false);
        CampoEstadocivil.setToolTipText("Insira o número do telefone do Cliente. *(Obrigatório)");
        CampoEstadocivil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                                .add(CampoRG_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jLabel1))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(CampoNome_Cliente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .add(CampoCPF_Cliente))))
                        .add(18, 18, Short.MAX_VALUE)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel10)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(CampoSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(CampoEstadocivil))
                            .add(CampoTelefone_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(CampoEmail_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 246, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(417, 417, 417))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(CampoNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(CampoTelefone_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(32, 32, 32)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel9)
                            .add(CampoEstadocivil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(CampoNome_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel2)
                                    .add(CampoCPF_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel3)
                                    .add(CampoRG_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel11)
                                    .add(CampoEmail_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel4)
                                    .add(CampoSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .add(9, 9, 9)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(CampoNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PanelPrincipalLayout = new org.jdesktop.layout.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .add(PanelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel5)
                        .add(18, 18, 18)
                        .add(CampoID_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel7)
                        .add(18, 18, 18)
                        .add(CampoDataCad_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(379, 379, 379))
                    .add(PanelPrincipalLayout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 655, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(PanelPrincipalLayout.createSequentialGroup()
                        .add(PanelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelPrincipalLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(PanelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(CampoID_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(CampoDataCad_Cliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(PanelPrincipal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 688, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(PanelPrincipal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 383, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDataCad_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataCad_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataCad_ClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField CampoBairro_Cliente;
    private static javax.swing.JTextField CampoCEP_Cliente;
    private static javax.swing.JTextField CampoCPF_Cliente;
    private static javax.swing.JTextField CampoCidade_Cliente;
    private static javax.swing.JTextField CampoComplemento_Cliente1;
    private static javax.swing.JTextField CampoDataCad_Cliente;
    private static javax.swing.JTextField CampoEmail_Cliente;
    private static javax.swing.JTextField CampoEstadocivil;
    private static javax.swing.JTextField CampoID_Cliente;
    private static javax.swing.JTextField CampoNascimento;
    private static javax.swing.JTextField CampoNome_Cliente;
    private static javax.swing.JTextField CampoNumero_Cliente;
    private static javax.swing.JTextField CampoRG_Cliente;
    private static javax.swing.JTextField CampoRua_Cliente;
    private static javax.swing.JTextField CampoSexo;
    private static javax.swing.JTextField CampoTelefone_Cliente;
    private static javax.swing.JTextField Campoestado;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void preenche() {
        CampoBairro_Cliente.setText(cliente.getEndereco().getBairro());
        CampoCEP_Cliente.setText(cliente.getEndereco().getCep());
        CampoCPF_Cliente.setText(cliente.getCpf());
        CampoCidade_Cliente.setText(cliente.getEndereco().getCidade());
        CampoComplemento_Cliente1.setText(cliente.getEndereco().getComplemento());
        CampoDataCad_Cliente.setText(cliente.getDataCadastro());
        CampoEmail_Cliente.setText(cliente.getEmail());
        CampoEstadocivil.setText(cliente.getEstadoCivil());
        CampoID_Cliente.setText(String.valueOf(cliente.getIdCliente()));
        CampoNascimento.setText(cliente.getDataNascimento());
        CampoNome_Cliente.setText(cliente.getNome());
        CampoNumero_Cliente.setText(String.valueOf(cliente.getEndereco().getNumero()));
        CampoRG_Cliente.setText(cliente.getRg());
        CampoRua_Cliente.setText(cliente.getEndereco().getRua());
        CampoSexo.setText(cliente.getSexo());
        CampoTelefone_Cliente.setText(cliente.getTelefone());
        Campoestado.setText(cliente.getEndereco().getEstado());

    }
}
