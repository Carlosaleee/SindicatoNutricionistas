
package Telas;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import Classes.Consulta;
import Classes.ListaConsulta;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Listagem extends javax.swing.JFrame {

    public Listagem() {
        initComponents();
        setTitle("Listagem");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNovaConsulta = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpane = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        btnTelaIniciaal = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Agendamento de Consultas");
        jLabel1.setToolTipText("Sistema de Agendamento de Consultas");

        btnNovaConsulta.setText("Nova Consulta");
        btnNovaConsulta.setToolTipText("Inicia um Novo Cadastro");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir ");
        btnExcluir.setToolTipText("Excluir Consulta");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar ");
        btnFinalizar.setToolTipText("Finalizar Consulta");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        String[] colunas = { "Nome", "Cpf", "Telefone","Data","Ja é Paciente","Consulta Realizada" };
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
        List<Consulta> listaCompleta = ListaConsulta.Listar();
        for(int i = 0; i < listaCompleta.size(); i++) {
            // Extraímos os dados
            Consulta consultaAtual = listaCompleta.get(i);

            // Montamos a linha
            String[] linha = {
                consultaAtual.getNome(),
                consultaAtual.getCpf(),
                consultaAtual.getTelefone(),
                consultaAtual.getData(),
                consultaAtual.isJaePaciente() ? "Sim" : "Não",
                consultaAtual.isConsultaRealizada() ? "Sim" : "Não"

            };
            tabelaModelo.addRow(linha);
        }
        tblListagem.setModel(tabelaModelo);
        jpane.setViewportView(tblListagem);

        btnTelaIniciaal.setText(" Tela Inicial");
        btnTelaIniciaal.setToolTipText("Tela Inicial");
        btnTelaIniciaal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaIniciaalActionPerformed(evt);
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
                        .addComponent(jpane)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnNovaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTelaIniciaal)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar)
                        .addGap(17, 17, 17))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpane, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta)
                    .addComponent(btnExcluir)
                    .addComponent(btnFinalizar)
                    .addComponent(btnTelaIniciaal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        
        CadastroConsulta telaCadastroConsulta = new CadastroConsulta();
        telaCadastroConsulta.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirConsulta(getPosicaoConsulta());
        atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
           
            Consulta consulta = new Consulta();
            consulta.setNome("Nome");
            consulta.setCpf("Cpf");
            consulta.setTelefone("Telefone"); // Supondo que você tenha importado a classe Date
            consulta.setData("Data");
            consulta.setJaePaciente(true);
            consulta.setConsultaRealizada(false);
            consulta.setHistorico("");
            
            DetalhesConsulta detalhes = new DetalhesConsulta(consulta);
            detalhes.setVisible(true);
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnTelaIniciaalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaIniciaalActionPerformed
         // Volta para a tela inicial
    TelaInicial telaInicial = new TelaInicial();
    telaInicial.setVisible(true);
    this.dispose(); // Fecha a tela de Listagem
    }//GEN-LAST:event_btnTelaIniciaalActionPerformed

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
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JButton btnTelaIniciaal;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jpane;
    private javax.swing.JTable tblListagem;
    // End of variables declaration//GEN-END:variables

      private int getPosicaoConsulta(){   
     
     int posConsulta = tblListagem.getSelectedRow();
     
     if(posConsulta == -1){
         JOptionPane.showMessageDialog(rootPane, "Selecione uma Consulta");
     }
     
     return posConsulta;
  }
    private void excluirConsulta(int posConsulta){
     
     if(posConsulta >= 0){
      
         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir?", 
                 "Exclusão de Consulta", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
       
         if(deletar == 0){

        ListaConsulta listaConsulta = new ListaConsulta();
        listaConsulta.remove(posConsulta);

                 atualizarTabela();
         }else{
             
            tblListagem.clearSelection();             
         }
     }  
  }
  
  public void atualizarTabela() {
    DefaultTableModel tabelaModelo = (DefaultTableModel) tblListagem.getModel();
    tabelaModelo.setRowCount(0); // Limpa os dados da tabela

    List<Consulta> listaCompleta = ListaConsulta.Listar();

    for (Consulta consultaAtual : listaCompleta) {
        Object[] linha = {
            consultaAtual.getNome(),
            consultaAtual.getCpf(),
            consultaAtual.getTelefone(),
            consultaAtual.getData(),
            consultaAtual.isJaePaciente() ? "Sim" : "Não",
            consultaAtual.isConsultaRealizada() ? "Sim" : "Não"
        };
        tabelaModelo.addRow(linha);
    }
}

}


  



