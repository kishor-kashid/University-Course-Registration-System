/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StudentUI;

import business.admin;
import business.courseDirectory;
import business.student;
import business.studentDirectory;
import business.thirdParty;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class studentUpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel cardContainer;
    private studentDirectory studentHistory;
    private student userStudent;
    private courseDirectory courseHistory;
    private admin Admin;
    private thirdParty ThirdParty;

    public studentUpdateJPanel(JPanel cardContainer, studentDirectory studentHistory, student userStudent, courseDirectory courseHistory, admin Admin, thirdParty ThirdParty) {
        initComponents();
        this.cardContainer = cardContainer;
        this.studentHistory = studentHistory;
        this.userStudent = userStudent;
        this.courseHistory = courseHistory;
        this.Admin = Admin;
        this.ThirdParty = ThirdParty;
        
        
        txtSsignupid.setText(userStudent.getStudentID());
        
        populateStudentDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackupdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSsignupid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSsignupemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnSupdate = new javax.swing.JButton();
        btnLogoutupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSsignupname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSsignupphone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSkills = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBackupdate.setBackground(new java.awt.Color(102, 204, 255));
        btnBackupdate.setText("Back");
        btnBackupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupdateActionPerformed(evt);
            }
        });
        add(btnBackupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 93, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Profile");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 836, 43));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Student ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 168, 113, -1));

        txtSsignupid.setEditable(false);
        txtSsignupid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsignupidActionPerformed(evt);
            }
        });
        add(txtSsignupid, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 230, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Student Email:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 238, 113, -1));

        txtSsignupemail.setEnabled(false);
        txtSsignupemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsignupemailActionPerformed(evt);
            }
        });
        add(txtSsignupemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 226, 230, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 308, 113, -1));

        txtgender.setEnabled(false);
        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });
        add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 296, 230, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Higehst Qualification:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 378, -1, -1));

        txtQualification.setEnabled(false);
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });
        add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 366, 230, 40));

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 456, 120, -1));

        btnSupdate.setBackground(new java.awt.Color(51, 153, 255));
        btnSupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnSupdate.setText("Update");
        btnSupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupdateActionPerformed(evt);
            }
        });
        add(btnSupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 456, 120, -1));

        btnLogoutupdate.setBackground(new java.awt.Color(255, 204, 204));
        btnLogoutupdate.setText("Logout");
        btnLogoutupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutupdateActionPerformed(evt);
            }
        });
        add(btnLogoutupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 93, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Student Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 168, 80, -1));

        txtSsignupname.setEnabled(false);
        txtSsignupname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsignupnameActionPerformed(evt);
            }
        });
        add(txtSsignupname, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 156, 230, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Student Phone:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 238, -1, -1));

        txtSsignupphone.setEnabled(false);
        txtSsignupphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsignupphoneActionPerformed(evt);
            }
        });
        add(txtSsignupphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 226, 230, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Experience:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 308, 80, -1));

        txtExperience.setEnabled(false);
        add(txtExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 296, 230, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Skills:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 378, 80, -1));

        txtSkills.setEnabled(false);
        txtSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkillsActionPerformed(evt);
            }
        });
        add(txtSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 366, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupdateActionPerformed
        // TODO add your handling code here:
        cardContainer.remove(this);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.previous(cardContainer);
    }//GEN-LAST:event_btnBackupdateActionPerformed

    private void txtSsignupidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsignupidActionPerformed
        // TODO add your handling code here:
        //txtSsignupid.getText();
    }//GEN-LAST:event_txtSsignupidActionPerformed

    private void txtSsignupemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsignupemailActionPerformed
        // TODO add your handling code here:
        //txtSsignupemail.getText();
    }//GEN-LAST:event_txtSsignupemailActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String email = txtSsignupemail.getText();
        String phone = txtSsignupphone.getText();
         try{
            Integer.parseInt(txtSsignupphone.getText());
        }
        catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Please enter phone number in Integer only");
            return;
        }
        String gender = txtgender.getText();
        String qualification  = txtQualification.getText();
        String experience = txtExperience.getText();
        String skills = txtSkills.getText();

        userStudent.setEmailID(email);
        userStudent.setPhonenumber(phone);
        userStudent.setGender(gender);
        userStudent.setHighestQualification(qualification);
        userStudent.setExperience(experience);
        userStudent.setSkills(skills);

        JOptionPane.showMessageDialog(null, "Student data updated Successfully");
        
        txtSsignupid.setEnabled(false);
        txtSsignupname.setEnabled(false);
        txtSsignupemail.setEnabled(false);
        txtSsignupphone.setEnabled(false);
        txtgender.setEnabled(false);
        txtExperience.setEnabled(false);
        txtQualification.setEnabled(false);
        txtSkills.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnSupdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupdateActionPerformed
        // TODO add your handling code here:
        
        txtSsignupid.setEnabled(false);
        txtSsignupname.setEnabled(true);
        txtSsignupemail.setEnabled(true);
        txtSsignupphone.setEnabled(true);
        txtgender.setEnabled(true);
        txtExperience.setEnabled(true);
        txtQualification.setEnabled(true);
        txtSkills.setEnabled(true);

        btnSave.setEnabled(true);
        btnSupdate.setEnabled(false);
    }//GEN-LAST:event_btnSupdateActionPerformed

    private void btnLogoutupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutupdateActionPerformed
        // TODO add your handling code here:
        StudentLoginJPanel logOutPanel= new StudentLoginJPanel(cardContainer, studentHistory, courseHistory, Admin, ThirdParty);
        cardContainer.removeAll();
        cardContainer.add(logOutPanel);
    }//GEN-LAST:event_btnLogoutupdateActionPerformed

    private void txtSsignupnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsignupnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsignupnameActionPerformed

    private void txtSsignupphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsignupphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsignupphoneActionPerformed

    private void txtSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkillsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackupdate;
    private javax.swing.JButton btnLogoutupdate;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSupdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSkills;
    private javax.swing.JTextField txtSsignupemail;
    private javax.swing.JTextField txtSsignupid;
    private javax.swing.JTextField txtSsignupname;
    private javax.swing.JTextField txtSsignupphone;
    private javax.swing.JTextField txtgender;
    // End of variables declaration//GEN-END:variables

    private void populateStudentDetails() {
        
        txtSsignupname.setText(userStudent.getName());
        txtSsignupemail.setText(userStudent.getEmailID());
        txtSsignupphone.setText(userStudent.getPhonenumber());
        txtgender.setText(userStudent.getGender());
        txtExperience.setText(userStudent.getExperience());
        txtQualification.setText(userStudent.getHighestQualification());
        txtSkills.setText(userStudent.getSkills());
    }
}
