/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ThirdPartyUI;

import business.thirdParty;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pranavkapse
 */
public class ThirdPartyLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPartyLoginJPanel
     */
    JPanel cardContainer;
    private thirdParty ThirdParty;
    
    public ThirdPartyLoginJPanel(JPanel cardContainer, thirdParty ThirdParty) {
        
        initComponents();
        this.cardContainer = cardContainer;
        this.ThirdParty = ThirdParty;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblThirdPartyLoginPage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 279, 197, 40));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setText("Username");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 141, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 176, 197, 40));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 244, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 102, 255));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 359, 106, 36));

        lblThirdPartyLoginPage.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblThirdPartyLoginPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThirdPartyLoginPage.setText("Welcome Back To Login Portal");
        add(lblThirdPartyLoginPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 717, 61));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        
       
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        if (ThirdParty.getUsername().equals(username) && ThirdParty.getPassword().equals(password)){
            ThirdPartyLandingJPanel thirdPartyLandingJPanel = new ThirdPartyLandingJPanel(cardContainer, ThirdParty);
            cardContainer.add("ThirdPartyLandingJPanel", thirdPartyLandingJPanel);
            CardLayout layout = (CardLayout) cardContainer.getLayout();
            layout.next(cardContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblThirdPartyLoginPage;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
