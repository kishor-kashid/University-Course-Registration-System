/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import business.admin;
import business.student;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkapse
 */
public class ViewStudentRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudentRequestJPanel
     */
    
    private admin Admin;
    
    public ViewStudentRequestJPanel(admin Admin) {
        initComponents();
        this.Admin = Admin;
        
        populateTableAdminTranscriptRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdminGraduationRequest = new javax.swing.JTable();
        btnAdminAccept = new javax.swing.JButton();
        btnAdminReject = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAdminGraduationRequest.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAdminGraduationRequest);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 630, 260));

        btnAdminAccept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdminAccept.setText("Accept");
        btnAdminAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAcceptActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 330, 82, 31));

        btnAdminReject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdminReject.setText("Reject");
        btnAdminReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminRejectActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 330, 82, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAcceptActionPerformed
        // TODO add your handling code here:
       
         int selectedRowIndex = tblAdminGraduationRequest.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the student");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblAdminGraduationRequest.getModel();
        String studentID = (String) model.getValueAt(selectedRowIndex, 0);
        
        ArrayList<student> studentList = Admin.getTranscriptRequests();
        
        for (student Student : studentList){
            if (Student.getStudentID().equals(studentID)){
                Student.setIsEligibleForTranscript(true);
                Student.setTranscriptRequestStatus("Accepted");
                Admin.removeFromTranscriptRequest(Student);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Transcript request accepted");
        populateTableAdminTranscriptRequests();
  
    }//GEN-LAST:event_btnAdminAcceptActionPerformed

    private void btnAdminRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminRejectActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblAdminGraduationRequest.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the student");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblAdminGraduationRequest.getModel();
        String studentID = (String) model.getValueAt(selectedRowIndex, 0);
        
        ArrayList<student> studentList = Admin.getTranscriptRequests();
        
        for (student Student : studentList){
            if (Student.getStudentID().equals(studentID)){
                Student.setIsEligibleForTranscript(false);
                Admin.removeFromTranscriptRequest(Student);
                Student.setTranscriptRequestStatus("Rejected");
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Transcript request rejected");
        populateTableAdminTranscriptRequests();
        
    }//GEN-LAST:event_btnAdminRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAccept;
    private javax.swing.JButton btnAdminReject;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdminGraduationRequest;
    // End of variables declaration//GEN-END:variables

    private void populateTableAdminTranscriptRequests() {
        
        DefaultTableModel model = (DefaultTableModel) tblAdminGraduationRequest.getModel();
        model.setRowCount(0);
        
        ArrayList<student> studentList = Admin.getTranscriptRequests();
        
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
