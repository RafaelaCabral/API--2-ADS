/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FAQController;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class FAQ extends javax.swing.JFrame {

    private final FAQController controller;

    /**
     * Creates new form FAQ
     */
    public FAQ() {
        initComponents();
        controller = new FAQController(this);
        colocarIcone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pergunta1 = new javax.swing.JLabel();
        Pergunta2 = new javax.swing.JLabel();
        Pergunta3 = new javax.swing.JLabel();
        Pergunta4 = new javax.swing.JLabel();
        Pergunta5 = new javax.swing.JLabel();
        Pergunta6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAQ");
        setMaximumSize(new java.awt.Dimension(1365, 767));
        setMinimumSize(new java.awt.Dimension(850, 530));
        setPreferredSize(new java.awt.Dimension(940, 665));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(45, 18, 75));
        jPanel4.setPreferredSize(new java.awt.Dimension(920, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 472, 0, 468);
        jPanel6.add(jLabel1, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERGUNTAS FREQUENTES:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 446, 0, 0);
        jPanel7.add(jLabel2, gridBagConstraints);

        Pergunta1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta1.setText("Como configurar um canal?");
        Pergunta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta1MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 495, 0, 0);
        jPanel7.add(Pergunta1, gridBagConstraints);

        Pergunta2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta2.setText("Como usuário, eu posso configurar canais ilimitados? ");
        Pergunta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta2MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 495, 176, 252);
        jPanel7.add(Pergunta2, gridBagConstraints);

        Pergunta3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta3.setText("Como editar um canal?");
        Pergunta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta3MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 495, 0, 0);
        jPanel7.add(Pergunta3, gridBagConstraints);

        Pergunta4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta4.setText("Como excluir um canal?");
        Pergunta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta4MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 495, 0, 0);
        jPanel7.add(Pergunta4, gridBagConstraints);

        Pergunta5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta5.setText("Quem pode excluir meu cadastro?");
        Pergunta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta5MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 495, 0, 0);
        jPanel7.add(Pergunta5, gridBagConstraints);

        Pergunta6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        Pergunta6.setText("Eu posso cadastrar um canal? ");
        Pergunta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pergunta6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pergunta6MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 495, 0, 0);
        jPanel7.add(Pergunta6, gridBagConstraints);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Pergunta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta1MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Para configurar um canal, siga o passo a passo:\n Usuário > Selecione um canal > Configure seu canal\n");

        Pergunta1.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta1MouseClicked

    private void Pergunta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta1MouseEntered
        Pergunta1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta1MouseEntered

    private void Pergunta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta2MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Sim, não há limite de registros de canais.");

        Pergunta2.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta2MouseClicked

    private void Pergunta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta2MouseEntered
        Pergunta2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta2MouseEntered

    private void Pergunta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta3MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Para editar um canal, siga o passoa a passo:\n Usuário > Canais ativos > Selecione um canal já configurado > Edite o canal\n");

        Pergunta3.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta3MouseClicked

    private void Pergunta3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta3MouseEntered
        Pergunta3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta3MouseEntered

    private void Pergunta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta4MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Para excluir um canal configurado, siga o passo a passo:\n Usuário > Canais ativos > Selecione um canal > Excluir canal\n");

        Pergunta4.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta4MouseClicked

    private void Pergunta4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta4MouseEntered
        Pergunta4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta4MouseEntered

    private void Pergunta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta5MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Apenas o usuário que configurou o canal");

        Pergunta5.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta5MouseClicked

    private void Pergunta5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta5MouseEntered
        Pergunta5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta5MouseEntered

    private void Pergunta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta6MouseClicked
        JFrame jFrame = new  JFrame();
        JOptionPane.showMessageDialog(jFrame, "Não, apenas o admnistrador pode cadastrar um canal e apenas ele pode excluir o mesmo.");

        Pergunta6.setForeground(Color.red);
    }//GEN-LAST:event_Pergunta6MouseClicked

    private void Pergunta6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pergunta6MouseEntered
        Pergunta6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Pergunta6MouseEntered

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
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pergunta1;
    private javax.swing.JLabel Pergunta2;
    private javax.swing.JLabel Pergunta3;
    private javax.swing.JLabel Pergunta4;
    private javax.swing.JLabel Pergunta5;
    private javax.swing.JLabel Pergunta6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

    public void colocarIcone() {
        try {
           URL caminhoIcone = getClass().getResource("/View/Imagens/logotrack.png");
           Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
           this.setIconImage(iconeTitulo);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
