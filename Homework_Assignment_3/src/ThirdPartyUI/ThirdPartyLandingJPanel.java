/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ThirdPartyUI;

import business.student;
import business.thirdParty;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkapse
 */
public class ThirdPartyLandingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPartyLandingJPanel
     */
    JPanel cardContainer;
    private thirdParty ThirdParty;
    
    public ThirdPartyLandingJPanel(JPanel cardContainer, thirdParty ThirdParty) {
        initComponents();
        this.cardContainer = cardContainer;
        this.ThirdParty = ThirdParty;
        
        populateTableGraduationRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblThirdPartyGraduationRequest = new javax.swing.JTable();
        btnDoNotAuthorize = new javax.swing.JButton();
        btnAuthorize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblThirdPartyGraduationRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "No of Completed Courses", "Overall Grades"
            }
        ));
        jScrollPane1.setViewportView(tblThirdPartyGraduationRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 102, 630, 260));

        btnDoNotAuthorize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoNotAuthorize.setText("Don't Authorize");
        btnDoNotAuthorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoNotAuthorizeActionPerformed(evt);
            }
        });
        add(btnDoNotAuthorize, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 422, 140, 39));

        btnAuthorize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAuthorize.setText("Authorize");
        btnAuthorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorizeActionPerformed(evt);
            }
        });
        add(btnAuthorize, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 422, 140, 39));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Note: For student to be eligible for graduation, he/she must have completed 8 courses.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 384, 630, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Authorize Student for Grduation Eligibility");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 790, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoNotAuthorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoNotAuthorizeActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblThirdPartyGraduationRequest.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the student");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblThirdPartyGraduationRequest.getModel();
        String studentID = (String) model.getValueAt(selectedRowIndex, 0);
        
        ArrayList<student> studentList = ThirdParty.getGraduationRequests();
        
        for (student Student : studentList){
            if (Student.getStudentID().equals(studentID)){
                Student.setIsEligibleForGraduation(false);
                Student.setGradduationCertRequestStatus("Rejected");
                ThirdParty.removeFromGraduationRequest(Student);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Graduation Certificate request rejected");
        populateTableGraduationRequests();

    }//GEN-LAST:event_btnDoNotAuthorizeActionPerformed

    private void btnAuthorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorizeActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblThirdPartyGraduationRequest.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the student");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblThirdPartyGraduationRequest.getModel();
        String studentID = (String) model.getValueAt(selectedRowIndex, 0);
        
        ArrayList<student> studentList = ThirdParty.getGraduationRequests();
        
        for (student Student : studentList){
            if (Student.getStudentID().equals(studentID)){
                Student.setIsEligibleForGraduation(true);
                Student.setGradduationCertRequestStatus("Accepted");
                ThirdParty.removeFromGraduationRequest(Student);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Graduation Certificate request accepted");
        populateTableGraduationRequests();

    }//GEN-LAST:event_btnAuthorizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthorize;
    private javax.swing.JButton btnDoNotAuthorize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThirdPartyGraduationRequest;
    // End of variables declaration//GEN-END:variables

    private void populateTableGraduationRequests() {
        
        
        DefaultTableModel model = (DefaultTableModel) tblThirdPartyGraduationRequest.getModel();
        model.setRowCount(0);
        
        ArrayList<student> studentList = ThirdParty.getGraduationRequests();
        
        for (student Student : studentList){
            Object[] row = new Object[4];
            row[0] = Student.getStudentID();
            row[1] = Student.getName();
            row[2] = Student.getCompletedCourses().size();
            row[3] = Student.getStudentOverallGrade(Student);
            
            model.addRow(row);

        }
    }
}
