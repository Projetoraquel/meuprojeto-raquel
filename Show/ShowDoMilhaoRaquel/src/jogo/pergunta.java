package jogo;

import audio.Audio;
import dao.PerguntaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelo.Jogador;
import modelo.ManipularImagem;
import modelo.Pergunta;
import modelo.jogoCompleto;
import jogo.cartas;

public class pergunta extends javax.swing.JFrame {

    private Jogador jogador;
    private Integer nivel;
    private Double premio;
    private Double agora;
    private jogoCompleto completo;
    private Double e;
    private Double t;
    private Integer confirmar;
    private static Integer tirar;

    public static Integer getTirar() {
        return tirar;
    }

    public static void setTirar(Integer tirar) {
        pergunta.tirar = tirar;
    }


    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    Audio audio = new Audio();
    List<Pergunta> perguntas;//perguntas do jogo
    Pergunta perguntaatual;//que esta sendo exibida
    // jogoCompleto completo;

    ButtonGroup bg1;

    public pergunta() {
        initComponents();
        tirar =0;
        bg1 = new ButtonGroup();
        bg1.add(rd1);
        bg1.add(rd2);
        bg1.add(rd3);
        bg1.add(rd4);
        confirmar = 0;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblpergunta = new javax.swing.JLabel();
        nomejogadordatelapergunta = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pular = new javax.swing.JButton();
        botaoconfirma = new javax.swing.JButton();
        cartasbotao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        errar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acertar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblpergunta.setForeground(new java.awt.Color(255, 0, 102));
        lblpergunta.setText("PERGUNTA");

        nomejogadordatelapergunta.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        nomejogadordatelapergunta.setForeground(new java.awt.Color(255, 0, 102));
        nomejogadordatelapergunta.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(255, 0, 102));

        jButton1.setForeground(new java.awt.Color(255, 0, 255));
        jButton1.setText("Parar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pular.setForeground(new java.awt.Color(255, 0, 204));
        pular.setText("Pular");
        pular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pularActionPerformed(evt);
            }
        });

        botaoconfirma.setForeground(new java.awt.Color(255, 0, 204));
        botaoconfirma.setText("Confirmar");
        botaoconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconfirmaActionPerformed(evt);
            }
        });

        cartasbotao.setForeground(new java.awt.Color(255, 0, 204));
        cartasbotao.setText("Cartas");
        cartasbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartasbotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(pular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botaoconfirma)
                .addGap(33, 33, 33)
                .addComponent(cartasbotao)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(pular)
                    .addComponent(botaoconfirma)
                    .addComponent(cartasbotao))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        errar.setText("jLabel4");

        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("ERRAR");

        parar.setText("jLabel5");

        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("PARAR");

        acertar.setText("jLabel6");

        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("ACERTAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errar)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acertar)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errar)
                    .addComponent(parar)
                    .addComponent(acertar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblfoto.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd4)
                            .addComponent(rd3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd2)
                            .addComponent(rd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomejogadordatelapergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rd2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(rd3)
                        .addGap(34, 34, 34)
                        .addComponent(rd4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomejogadordatelapergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //começar o jogo
        
        completo = new jogoCompleto();
        completo.setJogador(jogador);

        nomejogadordatelapergunta.setText(jogador.getNome());
        ManipularImagem.exibiImagemLabel(jogador.getImagem(), lblfoto);

        //buscar as perguntas do niivel 1 
        PerguntaDAO dao = new PerguntaDAO();
        premio = 2000.00;
        perguntas = dao.listarNivel1();
        nivel = 1;
        // colocar a primeira que aparece no perguntaatual
        perguntaatual = perguntas.get(0);//primeira pergunta da lista embaralhado
        lblpergunta.setText(perguntaatual.getEnunciado());
        rd1.setText(perguntaatual.getA());
        rd2.setText(perguntaatual.getB());
        rd3.setText(perguntaatual.getC());
        rd4.setText(perguntaatual.getD());
          
           
        errar.setText("0");
        parar.setText("0");
        acertar.setText(premio.toString());


    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        fim tela = new fim();
        tela.setCompleto(completo);
        tela.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconfirmaActionPerformed
        
        if (rd1.isSelected() || rd2.isSelected() || rd3.isSelected() || rd4.isSelected() == true) {
            confirmar++;
            Double acertou = 0.0;

            if (rd1.isSelected() == true && perguntaatual.getCerta().equals("A")) {
                audio.tocar("certa.wav");
                JOptionPane.showMessageDialog(rootPane, "Acertou");
                acertou = premio;

            } else if (rd2.isSelected() == true && perguntaatual.getCerta().equals("B")) {
                audio.tocar("certa.wav");
                JOptionPane.showMessageDialog(rootPane, "Acertou");
                acertou = premio;

            } else if (rd3.isSelected() == true && perguntaatual.getCerta().equals("C")) {
                audio.tocar("certa.wav");
                JOptionPane.showMessageDialog(rootPane, "Acertou");
                acertou = premio;

            } else if (rd4.isSelected() == true && perguntaatual.getCerta().equals("D")) {
                audio.tocar("certa.wav");
                JOptionPane.showMessageDialog(rootPane, "Acertou");
                acertou = premio;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Errou");
                completo.setGanhos(e);
                fim tela = new fim();
                tela.setCompleto(completo);
                tela.setVisible(true);
                this.setVisible(false);
            }

            agora = completo.getGanhos() + acertou;
            completo.setGanhos(agora);

            perguntas.remove(0);// elimina a pergunta que esta sendo exibida

            if (confirmar == 5 && nivel == 1) {
                PerguntaDAO dao = new PerguntaDAO();
                perguntas = dao.listarNivel2();
                nivel = 2;
                premio = 10000.00;
                confirmar = 0;
            }
            if (confirmar == 5 && nivel == 2) {
                PerguntaDAO dao = new PerguntaDAO();
                perguntas = dao.listarNivel3();
                nivel = 3;
                premio = 25000.00;
                confirmar = 0;
            }
            if (confirmar == 5 && nivel == 3) {
                PerguntaDAO dao = new PerguntaDAO();
                perguntas = dao.listarNivel4();
                nivel = 4;
                premio = 50000.00;
                confirmar = 0;
            }
            if (confirmar == 5 && nivel == 4) {
                PerguntaDAO dao = new PerguntaDAO();
                perguntas = dao.listarNivel5();
                nivel = 5;
                premio = 565000.00;
                confirmar = 0;
            }
            if (perguntas.size() == 0 && nivel == 5) {
                completo.setGanhos(t);
                fim tela = new fim();
                tela.setCompleto(completo);
                tela.setVisible(true);
                this.setVisible(false);
            } else {

                perguntaatual = perguntas.get(0);
                lblpergunta.setText(perguntaatual.getEnunciado());
                rd1.setText(perguntaatual.getA());
                rd2.setText(perguntaatual.getB());
                rd3.setText(perguntaatual.getC());
                rd4.setText(perguntaatual.getD());
          
                //desmarcar as alternativas

                e = agora / 2;
                errar.setText(e.toString());
                parar.setText(agora.toString());
                t = premio + agora;
                acertar.setText(t.toString());

                if (t == 1000000.00) {
                    pular.setEnabled(false);
                }

                if (t == 1000000.00) {
                    cartasbotao.setEnabled(false);
                }
                
                bg1.clearSelection();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma opção");

        }
    }//GEN-LAST:event_botaoconfirmaActionPerformed

    private void cartasbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartasbotaoActionPerformed
        
        cartas tela = new cartas();
        tela.setVisible(true);
        cartasbotao.setEnabled(false);
            
              
    }//GEN-LAST:event_cartasbotaoActionPerformed

    private void pularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pularActionPerformed
        perguntas.remove(0);

        if (perguntas.size() == 0 && nivel == 1) {
            PerguntaDAO dao = new PerguntaDAO();
            perguntas = dao.listarNivel2();
            nivel = 2;
            premio = 10000.00;
        }
        if (perguntas.size() == 0 && nivel == 2) {
            PerguntaDAO dao = new PerguntaDAO();
            perguntas = dao.listarNivel3();
            nivel = 3;
            premio = 25000.00;
        }
        if (perguntas.size() == 0 && nivel == 3) {
            PerguntaDAO dao = new PerguntaDAO();
            perguntas = dao.listarNivel4();
            nivel = 4;
            premio = 50000.00;
        }
        if (perguntas.size() == 0 && nivel == 4) {
            PerguntaDAO dao = new PerguntaDAO();
            perguntas = dao.listarNivel5();
            nivel = 5;
            premio = 565000.00;
        }
        if (perguntas.size() == 0 && nivel == 5) {
            fim tela = new fim();
            tela.setVisible(true);
            this.setVisible(false);

        } else {

            perguntaatual = perguntas.get(0);
            lblpergunta.setText(perguntaatual.getEnunciado());
            rd1.setText(perguntaatual.getA());
            rd2.setText(perguntaatual.getB());
            rd3.setText(perguntaatual.getC());
            rd4.setText(perguntaatual.getD());
                      
         

            pular.setEnabled(false);
        }

    }//GEN-LAST:event_pularActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         if (tirar== 1) {
            
            if (perguntaatual.getCerta().equals("A")) {
                rd2.setEnabled(false);
               
            } else if (perguntaatual.getCerta().equals("B")) {
                rd1.setEnabled(false);
                
               
            } else if (perguntaatual.getCerta().equals("C")) {
                rd4.setEnabled(false);
                
               
            } else if (perguntaatual.getCerta().equals("D")) {
                rd3.setEnabled(false);
               
              
            }

        } else if (tirar == 2) {
            if (perguntaatual.getCerta().equals("A")) {
                rd2.setEnabled(false);
                rd3.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("B")) {
                rd1.setEnabled(false);
                rd3.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("C")) {
                rd4.setEnabled(false);
                rd2.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("D")) {
                rd3.setEnabled(false);
                rd1.setEnabled(false);
                
            }

        } else if (tirar == 3) {
            if (perguntaatual.getCerta().equals("A")) {
                rd2.setEnabled(false);
                rd3.setEnabled(false);
                rd4.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("B")) {
                rd1.setEnabled(false);
                rd3.setEnabled(false);
                rd4.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("C")) {
                rd4.setEnabled(false);
                rd2.setEnabled(false);
                rd1.setEnabled(false);
                
            } else if (perguntaatual.getCerta().equals("D")) {
                rd3.setEnabled(false);
                rd2.setEnabled(false);
                rd1.setEnabled(false);
                
            }
           
        }else {
                   
            rd1.setEnabled(true);
            rd2.setEnabled(true);
            rd3.setEnabled(true);
            rd4.setEnabled(true);
                
            }
         tirar= 0;
    }//GEN-LAST:event_formWindowGainedFocus

    
    
    
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
            java.util.logging.Logger.getLogger(pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pergunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertar;
    private javax.swing.JButton botaoconfirma;
    private javax.swing.JButton cartasbotao;
    private javax.swing.JLabel errar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblpergunta;
    private javax.swing.JLabel nomejogadordatelapergunta;
    private javax.swing.JLabel parar;
    private javax.swing.JButton pular;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    // End of variables declaration//GEN-END:variables

}
