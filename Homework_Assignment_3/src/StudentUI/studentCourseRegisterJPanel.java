/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StudentUI;

import business.admin;
import business.course;
import business.courseDirectory;
import business.student;
import business.studentDirectory;
import business.thirdParty;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaush
 */
public class studentCourseRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form studentCourseRegisterJPanel
     */
    JPanel cardContainer;
    private studentDirectory studentHistory;
    private student userStudent;
    private courseDirectory courseHistory;
    private admin Admin;
    private thirdParty ThirdParty;

    public studentCourseRegisterJPanel(JPanel cardContainer, studentDirectory studentHistory, student userStudent, courseDirectory courseHistory, admin Admin, thirdParty ThirdParty) {
        initComponents();
        this.cardContainer = cardContainer;
        this.studentHistory = studentHistory;
        this.userStudent = userStudent;
        this.courseHistory = courseHistory;
        this.Admin = Admin;
        this.ThirdParty = ThirdParty;
        
        populatetableStudentCourses();

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
        tblstudentCourses = new javax.swing.JTable();
        btnRegister = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBackcourse = new javax.swing.JButton();
        btnLogoutcourse = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblstudentCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Professor ", "Region", "Language", "Day", "Time", "Semester", "Rating"
            }
        ));
        jScrollPane1.setViewportView(tblstudentCourses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 96, 655, 305));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 426, 121, -1));

        btnSearch.setText("Advanced Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 426, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Courses");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 25, 348, 38));

        btnBackcourse.setBackground(new java.awt.Color(102, 204, 255));
        btnBackcourse.setText("Back");
        btnBackcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackcourseActionPerformed(evt);
            }
        });
        add(btnBackcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 43, 95, -1));

        btnLogoutcourse.setBackground(new java.awt.Color(255, 204, 204));
        btnLogoutcourse.setText("Logout");
        btnLogoutcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutcourseActionPerformed(evt);
            }
        });
        add(btnLogoutcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 43, 95, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackcourseActionPerformed
        // TODO add your handling code here:
        cardContainer.remove(this);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.previous(cardContainer);
    }//GEN-LAST:event_btnBackcourseActionPerformed

    private void btnLogoutcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutcourseActionPerformed
        // TODO add your handling code here:
        StudentLoginJPanel logOutPanel= new StudentLoginJPanel(cardContainer, studentHistory, courseHistory, Admin, ThirdParty);
        cardContainer.removeAll();
        cardContainer.add(logOutPanel);

    }//GEN-LAST:event_btnLogoutcourseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        studentCourseAdvancedSearchJPanel StudentCourseAdvancedSearchPanel = new studentCourseAdvancedSearchJPanel(cardContainer, studentHistory, courseHistory, userStudent, Admin, ThirdParty);
        cardContainer.add("studentCourseAdvancedSearchJPanel", StudentCourseAdvancedSearchPanel);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.next(cardContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblstudentCourses.getSelectedRow();
        course selectedCourse = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        String courseID = (String) model.getValueAt(selectedRowIndex, 0);
        
        ArrayList<course> coursesList = courseHistory.getAvailableCourseList();
        ArrayList<course> studentOngoingCourseList = userStudent.getOngoingCourses();
        ArrayList<course> studentCompletedCourseList = userStudent.getCompletedCourses();
        
        //Check if student has already completed this course
        for (course Course : studentCompletedCourseList){
            if (Course.getCourseID().equals(courseID)){
                JOptionPane.showMessageDialog(this, "You have already completed this course");
                return;
                }
        }
        
        //Check if student has already registered this course
        for (course Course : studentOngoingCourseList){
            if (Course.getCourseID().equals(courseID)){
                JOptionPane.showMessageDialog(this, "You have already registered for this course");
                return;
                }
        }
        
        //register for course
        for (course Course : coursesList){
            if (Course.getCourseID().equals(courseID)){
                selectedCourse = Course;
                break;
                }
        }
        
        this.userStudent.addongoingCourses(selectedCourse);
        selectedCourse.addOngoingStudentToCourse(userStudent);
        
        JOptionPane.showMessageDialog(this, "Course registered successfully");
         
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackcourse;
    private javax.swing.JButton btnLogoutcourse;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstudentCourses;
    // End of variables declaration//GEN-END:variables

    private void populatetableStudentCourses() {
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> availableCourseList = courseHistory.getAvailableCourseList();
        
        for (course Course : availableCourseList){
            Object[] row = new Object[9];
            row[0] = Course.getCourseID();
            row[1] = Course.getCoursename();
            row[2] = Course.getCourseProfessorName();
            row[3] = Course.getCourseRegion();
            row[4] = Course.getCourseLanguage();
            row[5] = Course.getCourseScheduleDay();
            row[6] = Course.getCourseScheduleTime();
            row[7] = Course.getCourseSemester();
            row[8] = Course.getCourseRatingDouble(Course);
            
            model.addRow(row);
            
        }
    }
}