package jogo;
import javax.swing.JOptionPane;
import jogo.pergunta;
public class cartas extends javax.swing.JFrame {
    
    
    private Integer geral;

    public Integer getGeral() {
        return geral;
    }

    public void setGeral(Integer geral) {
        this.geral = geral;
    }
   
   
   
    
    public cartas() {
        initComponents();
  
    }
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        coracao = new javax.swing.JButton();
        losango = new javax.swing.JButton();
        arvore = new javax.swing.JButton();
        espada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Escolha uma das cartas");

        coracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download (1).jpg"))); // NOI18N
        coracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coracaoActionPerformed(evt);
            }
        });

        losango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download (1).jpg"))); // NOI18N
        losango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losangoActionPerformed(evt);
            }
        });

        arvore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download (1).jpg"))); // NOI18N
        arvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arvoreActionPerformed(evt);
            }
        });

        espada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download (1).jpg"))); // NOI18N
        espada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(coracao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(losango, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(arvore, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(espada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(espada, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(coracao, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(losango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arvore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void coracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coracaoActionPerformed
       
      int x = 0 +(int) (Math.random() * 3);
      if(x == 0){
          JOptionPane.showMessageDialog(rootPane, " Você eliminou Zero respostas");
         geral =0;
      }else if(x ==1){
        JOptionPane.showMessageDialog(rootPane, " Você eliminou uma resposta");
        geral =1;
      }else if(x==2){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou duas respostas");
       geral =2;
      }else if (x==3){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou tres respostas");
       geral =3;
      }
      pergunta.setTirar(geral);
      this.setVisible(false);
    }//GEN-LAST:event_coracaoActionPerformed

    private void losangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losangoActionPerformed
        int x = 0 +(int) (Math.random() * 3);
      if(x == 0){
          JOptionPane.showMessageDialog(rootPane, " Você eliminou Zero respostas");
         geral =0;
      }else if(x ==1){
        JOptionPane.showMessageDialog(rootPane, " Você eliminou uma resposta");
        geral =1;
      }else if(x==2){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou duas respostas");
       geral =2;
      }else if (x==3){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou tres respostas");
       geral =3;
      }    
      pergunta.setTirar(geral);
      this.setVisible(false);
    }//GEN-LAST:event_losangoActionPerformed

    private void arvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arvoreActionPerformed
       
      
        int x = 0 +(int) (Math.random() * 3);
      if(x == 0){
          JOptionPane.showMessageDialog(rootPane, " Você eliminou Zero respostas");
         geral =0;
      }else if(x ==1){
        JOptionPane.showMessageDialog(rootPane, " Você eliminou uma resposta");
        geral =1;
      }else if(x==2){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou duas respostas");
       geral =2;
      }else if (x==3){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou tres respostas");
       geral =3;
      }
      pergunta.setTirar(geral);
       this.setVisible(false);
    }//GEN-LAST:event_arvoreActionPerformed

    private void espadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espadaActionPerformed
          int x = 0 +(int) (Math.random() * 3);
      if(x == 0){
          JOptionPane.showMessageDialog(rootPane, " Você eliminou Zero respostas");
         geral =0;
      }else if(x ==1){
        JOptionPane.showMessageDialog(rootPane, " Você eliminou uma resposta");
        geral =1;
      }else if(x==2){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou duas respostas");
       geral =2;
      }else if (x==3){
       JOptionPane.showMessageDialog(rootPane, " Você eliminou tres respostas");
       geral =3;
      }
      pergunta.setTirar(geral);
       this.setVisible(false);
    }//GEN-LAST:event_espadaActionPerformed
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
            java.util.logging.Logger.getLogger(cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arvore;
    private javax.swing.JButton coracao;
    private javax.swing.JButton espada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton losango;
    // End of variables declaration//GEN-END:variables
}
