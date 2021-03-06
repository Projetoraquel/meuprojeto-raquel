/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplointerface;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EmissoraTela extends javax.swing.JFrame {

    /**
     * Creates new form EmissoraTela
     */
     List<Emissora> Lista;
     Integer posicao;
    public EmissoraTela() {
        initComponents();
        Lista = new ArrayList<Emissora>();
        posicao = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caixa1 = new javax.swing.JTextField();
        caixa2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        caixa3 = new javax.swing.JComboBox();
        cadastro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnanterior = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();
        btprimeiro = new javax.swing.JButton();
        btnproximo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btmconsultar = new javax.swing.JButton();
        btmexcluir = new javax.swing.JButton();
        btmatualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Exibição");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        caixa3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "aberta", "fechada" }));
        caixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa3ActionPerformed(evt);
            }
        });

        cadastro.setText("CADASTRO");
        cadastro.setActionCommand("CADASTRAR");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NAVEGAÇÃO"));

        btnanterior.setText("anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btnultimo.setText("ultimo");
        btnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimoActionPerformed(evt);
            }
        });

        btprimeiro.setText("primeiro");
        btprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprimeiroActionPerformed(evt);
            }
        });

        btnproximo.setText("proximo");
        btnproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btprimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnanterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnproximo)
                .addGap(18, 18, 18)
                .addComponent(btnultimo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnanterior)
                    .addComponent(btnultimo)
                    .addComponent(btprimeiro)
                    .addComponent(btnproximo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Emissora");

        btmconsultar.setText("CONSULTAR");
        btmconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmconsultarActionPerformed(evt);
            }
        });

        btmexcluir.setText("EXCLUIR");
        btmexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmexcluirActionPerformed(evt);
            }
        });

        btmatualizar.setText("ATUALIZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btmconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmatualizar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastro)
                    .addComponent(btmconsultar)
                    .addComponent(btmexcluir)
                    .addComponent(btmatualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       caixa1.setText(null);
       caixa2.setText(null);
       caixa3.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "apagou *-* ");
        Limpar();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
        Emissora obj = new Emissora();
        obj.setNome(caixa1.getText());
        obj.setEndereco(caixa2.getText());
        if(caixa3.getSelectedItem().toString().equals("Aberta") == true){
            obj.setTv(true);
        }else{
            obj.setTv(false);
        }
        Lista.add(obj);
        Limpar();
    }//GEN-LAST:event_cadastroActionPerformed

    private void btprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprimeiroActionPerformed
          if (Lista.size()>0){
        // TODO add your handling code here:
        posicao = 0;
        Emissora elemento = Lista.get(0);
        caixa1.setText(elemento.getNome());
        caixa2.setText(elemento.getEndereco());
        if (elemento.isTv() == true){
            caixa3.setSelectedIndex(1);
        }else{
            caixa3.setSelectedIndex(2);
        }
    }//GEN-LAST:event_btprimeiroActionPerformed
    }
    private void caixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixa3ActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        // TODO add your handling code here:
        if (posicao != 0){
        if (Lista.size() > 0 ){
        posicao = posicao - 1;
        Emissora elemento = Lista.get(posicao);
        caixa1.setText(elemento.getNome());
        caixa2.setText(elemento.getEndereco());
        if (elemento.isTv() == true){
            caixa3.setSelectedIndex(1);
        }else{
            caixa3.setSelectedIndex(2);
        
    }
             
        }
        }else {
            JOptionPane.showMessageDialog(this, "Nao possui anterior !!");
        }
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void btnproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproximoActionPerformed
        // TODO add your handling code here:
        if (Lista.size() > 0){
        posicao = posicao + 1;
        Emissora elemento = Lista.get(posicao);
        caixa1.setText(elemento.getNome());
        caixa2.setText(elemento.getEndereco());
        if (elemento.isTv() == true){
            caixa3.setSelectedIndex(1);
        }else{
            caixa3.setSelectedIndex(2);
        }
    }                                
    }//GEN-LAST:event_btnproximoActionPerformed

    private void btnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimoActionPerformed
        // TODO add your handling code here:
        if (Lista.size() > 0){
        posicao = Lista.size() - 1;
        Emissora elemento = Lista.get(posicao);
        caixa1.setText(elemento.getNome());
        caixa2.setText(elemento.getEndereco());
        if (elemento.isTv() == true){
            caixa3.setSelectedIndex(1);
        }else{ 
            caixa3.setSelectedIndex(2);
        }
    }
    }//GEN-LAST:event_btnultimoActionPerformed

    private void btmexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmexcluirActionPerformed
        // TODO add your handling code here:
        Lista.remove(Lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btmexcluirActionPerformed

    private void btmconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmconsultarActionPerformed
        // TODO add your handling code here:
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        boolean encontrou = false;
        
        for (Emissora emissora : Lista){
            if (nome.equals(emissora.getNome())){ 
                encontrou = true;
                break;
            }
        }
            if (encontrou == true){
                JOptionPane.showMessageDialog(null,"Encontrou !!");
            }else {
                JOptionPane.showMessageDialog(null,"Não encontrou");
            }
            //System.out.println(emissora.getNome());
          
        
      
        
    }//GEN-LAST:event_btmconsultarActionPerformed
    private void Limpar()
    {
       caixa1.setText("");
       caixa2.setText("");
       caixa3.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmissoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmatualizar;
    private javax.swing.JButton btmconsultar;
    private javax.swing.JButton btmexcluir;
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnproximo;
    private javax.swing.JButton btnultimo;
    private javax.swing.JButton btprimeiro;
    private javax.swing.JButton cadastro;
    private javax.swing.JTextField caixa1;
    private javax.swing.JTextField caixa2;
    private javax.swing.JComboBox caixa3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
