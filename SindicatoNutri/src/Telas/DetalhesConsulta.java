
package Telas;


import Classes.Consulta;
import javax.swing.JOptionPane;
import Telas.DetalhesConsulta;

    public class DetalhesConsulta extends javax.swing.JFrame {
        
        
    
    private Consulta consulta = new Consulta(); 

    public DetalhesConsulta(Consulta consulta) {
        initComponents();
        this.consulta = consulta;
        

        // Verifica se a consulta já foi realizada e marca a checkbox correspondente
        if (consulta.isConsultaRealizada()) {
            btnConsultaRealizada.setSelected(true);
            btnConsultaRealizada.setEnabled(false);
        }

        // Preenche a caixa de texto com o histórico da consulta, caso haja
        //jTextArea1.setText(consulta.getHistorico());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsultaRealizada = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        btnTelaInicial = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("  Detalhes da Consulta");
        jLabel1.setToolTipText("Detalhes da Consulta");

        btnConsultaRealizada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultaRealizada.setText("Consulta Realizada");
        btnConsultaRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaRealizadaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Receita e Observações");

        txtAreaTexto.setColumns(20);
        txtAreaTexto.setRows(5);
        txtAreaTexto.setToolTipText("Digite a Receita e as Observações Finais.");
        jScrollPane1.setViewportView(txtAreaTexto);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.setToolTipText("Finaliza a Consulta");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnTelaInicial.setText(" Tela Inicial");
        btnTelaInicial.setToolTipText("Tela Inicial");
        btnTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaInicialActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Tela Inicial");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConsultaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnTelaInicial)
                        .addGap(97, 97, 97)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultaRealizada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaInicial)
                    .addComponent(btnFinalizar)
                    .addComponent(btnLimpar))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnTelaInicialActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
              // Verifica se a consulta já foi realizada
              if (!consulta.isConsultaRealizada()) {
        if (!txtAreaTexto.getText().isEmpty()) {
            consulta.setHistorico(txtAreaTexto.getText());
            consulta.setConsultaRealizada(true);
            
            // Atualiza a tabela na instância de Listagem
            Listagem listagem = new Listagem();
            listagem.atualizarTabela();
               
                consulta.setHistorico(txtAreaTexto.getText());
                consulta.setConsultaRealizada(false);

                btnConsultaRealizada.setSelected(true);
                btnConsultaRealizada.setEnabled(false);
                
                txtAreaTexto.setEnabled(false);
                btnLimpar.setEnabled(false);
                btnFinalizar.setVisible(false);
            } else {
                
                JOptionPane.showMessageDialog(this, "Por favor, preencha a caixa de observações antes de finalizar a consulta.");
            }
               }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       txtAreaTexto.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultaRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaRealizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaRealizadaActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Consulta consulta = new Consulta();
            consulta.setNome("Nome");
            consulta.setCpf("Cpf");
            consulta.setTelefone("Telefone"); // Supondo que você tenha importado a classe Date
            consulta.setData("Data");
            consulta.setJaePaciente(true);
            consulta.setConsultaRealizada(true);
            consulta.setHistorico("");
            
             DetalhesConsulta detalhes = new DetalhesConsulta(consulta);
             detalhes.setVisible(true);

        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnConsultaRealizada;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaTexto;
    // End of variables declaration//GEN-END:variables


}