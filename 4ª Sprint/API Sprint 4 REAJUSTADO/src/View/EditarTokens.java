/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Factory.ConnectionFactory;
import Helper.SelecionarCanalHelper;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;
import java.sql.SQLException;

/**
 *
 * @author nicol
 */
public class EditarTokens extends javax.swing.JFrame {


    Connection con = new ConnectionFactory().getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public EditarTokens() {
        initComponents();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        editTokenAlt = new javax.swing.JTextField();
        editRegistro = new javax.swing.JTextField();
        editIDConta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editCanal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar");
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(1365, 767));
        setMinimumSize(new java.awt.Dimension(850, 530));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(45, 18, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(920, 60));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setText("EDITE O CANAL:");
        jPanel7.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(1350, 300));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setText("Canal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel4.setText("Token:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setText("Id da conta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 231, 0, 0);
        jPanel8.add(jLabel5, gridBagConstraints);

        salvarButton.setBackground(new java.awt.Color(252, 121, 0));
        salvarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("SALVAR");
        salvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarButtonMouseClicked(evt);
            }
        });
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 164, 27, 403);
        jPanel8.add(salvarButton, gridBagConstraints);

        editTokenAlt.setBackground(new java.awt.Color(217, 217, 217));
        editTokenAlt.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editTokenAlt.setAutoscrolls(false);
        editTokenAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editTokenAltKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 368;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editTokenAlt, gridBagConstraints);

        editRegistro.setBackground(new java.awt.Color(217, 217, 217));
        editRegistro.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editRegistro.setAutoscrolls(false);
        editRegistro.setEnabled(false);
        editRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRegistroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 368;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editRegistro, gridBagConstraints);

        editIDConta.setBackground(new java.awt.Color(217, 217, 217));
        editIDConta.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editIDConta.setAutoscrolls(false);
        editIDConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editIDContaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 368;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editIDConta, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel6.setText("Registro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 231, 0, 0);
        jPanel8.add(jLabel6, gridBagConstraints);

        editCanal.setBackground(new java.awt.Color(217, 217, 217));
        editCanal.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editCanal.setAutoscrolls(false);
        editCanal.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 368;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editCanal, gridBagConstraints);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void salvarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarButtonMouseClicked
        String sql = "UPDATE configuracao_canais_token SET nome_canal_token=?, id_conta_token=?, token_canal=? WHERE id_canal_token=?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, editCanal.getText());
            stmt.setString(2, editIDConta.getText());
            stmt.setString(3, editTokenAlt.getText());
            stmt.setString(4, editRegistro.getText());
            
            stmt.executeUpdate();
            stmt.close();
            con.close();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_salvarButtonMouseClicked

    private void editRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editRegistroActionPerformed

    private void editIDContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editIDContaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sql = "UPDATE configuracao_canais_token SET nome_canal_token=?, id_conta_token=?, token_canal=? WHERE id_canal_token=?";
            try {
                stmt = con.prepareStatement(sql);
                stmt.setString(1, editCanal.getText());
                stmt.setString(2, editIDConta.getText());
                stmt.setString(3, editTokenAlt.getText());
                stmt.setString(4, editRegistro.getText());

                stmt.executeUpdate();
                stmt.close();
                con.close();


            } catch (SQLException e) {
                System.out.println(e);
            }
            this.dispose();
        }
    }//GEN-LAST:event_editIDContaKeyPressed

    private void editTokenAltKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editTokenAltKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sql = "UPDATE configuracao_canais_token SET nome_canal_token=?, id_conta_token=?, token_canal=? WHERE id_canal_token=?";
            try {
                stmt = con.prepareStatement(sql);
                stmt.setString(1, editCanal.getText());
                stmt.setString(2, editIDConta.getText());
                stmt.setString(3, editTokenAlt.getText());
                stmt.setString(4, editRegistro.getText());

                stmt.executeUpdate();
                stmt.close();
                con.close();


            } catch (SQLException e) {
                System.out.println(e);
            }
            this.dispose();
        }
    }//GEN-LAST:event_editTokenAltKeyPressed

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
            java.util.logging.Logger.getLogger(EditarTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarTokens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editCanal;
    private javax.swing.JTextField editIDConta;
    private javax.swing.JTextField editRegistro;
    private javax.swing.JTextField editTokenAlt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables

    public JTextField getEditCanal() {
        return editCanal;
    }

    public void setEditCanal(JTextField editCanal) {
        this.editCanal = editCanal;
    }

    public JTextField getEditIDConta() {
        return editIDConta;
    }

    public void setEditIDConta(JTextField editIDConta) {
        this.editIDConta = editIDConta;
    }

    public JTextField getEditRegistro() {
        return editRegistro;
    }

    public void setEditRegistro(JTextField editRegistro) {
        this.editRegistro = editRegistro;
    }

    public JTextField getEditTokenAlt() {
        return editTokenAlt;
    }

    public void setEditTokenAlt(JTextField editTokenAlt) {
        this.editTokenAlt = editTokenAlt;
    }


    
    
}
