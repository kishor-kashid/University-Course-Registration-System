/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProfessorUI;

import business.course;
import business.courseDirectory;
import business.professorDirectory;
import business.student;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkapse
 */
public class ViewProfessorCoursePastStudentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProfessorCoursePastStudentsJPanel
     */
    JPanel cardContainer;
    private professorDirectory profHistory;
    private courseDirectory courseHistory;
    private course selectedCourse;
    
    public ViewProfessorCoursePastStudentsJPanel(JPanel cardContainer, professorDirectory profHistory, courseDirectory courseHistory, course selectedCourse) {
        initComponents();
        this.cardContainer = cardContainer;
        this.profHistory = profHistory;
        this.courseHistory = courseHistory;
        this.selectedCourse = selectedCourse;
        
        populateStudentDetailsTable();
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
        studentDetailsPane = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Semester", "Grades"
            }
        ));
        studentDetailsPane.setViewportView(tblStudentDetails);
        if (tblStudentDetails.getColumnModel().getColumnCount() > 0) {
            tblStudentDetails.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(studentDetailsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 214, 680, 283));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAST STUDENTS REGISTERED FOR COURSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

        btnBack.setBackground(new java.awt.Color(102, 204, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 94, 90, 40));

        btnLogOut.setBackground(new java.awt.Color(255, 204, 204));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 94, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardContainer.remove(this);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.previous(cardContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        ProfessorLoginJPanel logOutPanel= new ProfessorLoginJPanel(cardContainer, profHistory, courseHistory);
        cardContainer.removeAll();
        cardContainer.add(logOutPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane studentDetailsPane;
    private javax.swing.JTable tblStudentDetails;
    // End of variables declaration//GEN-END:variables

    private void populateStudentDetailsTable() {
        DefaultTableModel model = (DefaultTableModel) tblStudentDetails.getModel();
        model.setRowCount(0);
        
        ArrayList<student> studentList = selectedCourse.getRegisteredPastStudents();
        
        for (student Student : studentList){
            Object[] row = new Object[4];
            row[0] = Student.getStudentID();
            row[1] = Student.getName();
            Double grades = 0.0;
            ArrayList<course> studentCompletedcourses = Student.getCompletedCourses();
            for (course Course : studentCompletedcourses){
                if (Course.getCourseID().equals(selectedCourse.getCourseID())){
                    int index = studentCompletedcourses.indexOf(Course);
                    grades = Student.getCompletedCoursesGrades().get(index);
                    row[2] = Course.getCourseSemester();
                    break;
                }
            }
            row[3] = grades;
            
            model.addRow(row);
            
        }
    }
}
