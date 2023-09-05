
package Telas;

import Classes.Consulta;
import Classes.ListaConsulta;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

    public class CadastroConsulta extends javax.swing.JFrame {

        public CadastroConsulta() {
            initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnTelainicial = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSim = new javax.swing.JCheckBox();
        btnNao = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Consulta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Paciente :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefone :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data da Consulta :");

        txtNome.setToolTipText("Digite o Nome Do Paciente");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCpf.setToolTipText("000.000.000-00");
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtTelefone.setToolTipText("(00)000000000");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtData.setToolTipText("00/00/0000");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Finaliza o Cadastro");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnTelainicial.setText("Tela Inicial");
        btnTelainicial.setToolTipText("Tela Inicial");
        btnTelainicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelainicialActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa os Campos do Cadastro");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnListagem.setText("Listagem");
        btnListagem.setToolTipText("Lista de Consultas");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Já era Paciente :");
        jLabel6.setToolTipText("Ja era Paciente");

        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnListagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(btnTelainicial)
                                .addGap(28, 28, 28)
                                .addComponent(btnLimpar)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(txtCpf)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtData)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnSim)
                    .addComponent(btnNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelainicial)
                    .addComponent(btnLimpar)
                    .addComponent(btnListagem)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
          
        ButtonGroup grupoNivelStress = new ButtonGroup();
        grupoNivelStress.add(btnSim);
        grupoNivelStress.add(btnNao);
        
        
          txtNome.setText("");
          txtCpf.setText("");
          txtTelefone.setText("");
          txtData.setText("");
          grupoNivelStress.clearSelection();
          
          
          
          txtNome.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnTelainicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelainicialActionPerformed
           TelaInicial telaInicial = new TelaInicial();
            telaInicial.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnTelainicialActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!emptyFields() && validateCPF(txtCpf.getText()) && validatePhone(txtTelefone.getText()) && validateDate(txtData.getText())) {
    Consulta consulta = new Consulta();
    
    consulta.setNome(txtNome.getText());
    consulta.setCpf(txtCpf.getText());
    consulta.setTelefone(txtTelefone.getText());
    consulta.setData(txtData.getText());
    JaePaciente();
        
    ListaConsulta.Adicionar(consulta);
    
    JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
            + "\nNome: " + txtNome.getText()
            + "\nCpf: " + txtCpf.getText()
            + "\nTelefone: " + txtTelefone.getText()
            + "\nData: " + txtData.getText()
            + "\nJa era Paciente: " + JaePaciente()
          
    );
        
    // Volta para a tela listagem
        Listagem telaListagem = new Listagem();
        telaListagem.setVisible(true);
        this.dispose(); 
} else {
    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente.");
}
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        Listagem telaListagem = new Listagem();
        telaListagem.setVisible(true);
    }//GEN-LAST:event_btnListagemActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JCheckBox btnNao;
    private javax.swing.JCheckBox btnSim;
    private javax.swing.JButton btnTelainicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

  private boolean emptyFields(){
     
     boolean empty = true; 
   
     if(txtNome.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome não pode ser vazio.");
     } else if(txtCpf.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Cpf não pode ser vazio.");
     } else if(txtTelefone.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Telefone não pode ser vazio.");
     } else if(txtData.getText().trim().isEmpty()){
         
        
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data não pode ser vazio.");
     } else{
         
         empty = false;
     }
     
     return empty;
  }
  
  // Validação de CPF

  private boolean validateCPF(String cpf) {
    if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") && !cpf.matches("\\d{11}")) {
        JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use o formato 999.999.999-99 ou 99999999999.");
        return false;
    }
    return true;
}

// Validação número de telefone
    private boolean validatePhone(String telefone) {
    if( !telefone.matches("\\(\\d{2}\\)\\d{9}") && !telefone.matches("\\d{11}")){
        JOptionPane.showMessageDialog(null, "Formato de TELEFONE inválido. Use o formato (XX)XXXXXXXXX.");
        return false;
    }
    return true;
}

// Validação de data
    private boolean validateDate(String date) {
    
    if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
       
    JOptionPane.showMessageDialog(null, "Formato da DATA inválido. Use o formato XX/XX/XXXX.");
        return false;
    }
    return true;
}
    
    private String JaePaciente() {
    if (btnSim.isSelected()) {
        return "Sim";
    } else if (btnNao.isSelected()) {
        return "Não";
    }else {
        return "Nenhum selecionado";
    }
}
}



