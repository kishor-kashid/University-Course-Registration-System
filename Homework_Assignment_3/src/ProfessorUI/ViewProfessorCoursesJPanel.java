/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProfessorUI;

import business.course;
import business.courseDirectory;
import business.professor;
import business.professorDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkapse
 */
public class ViewProfessorCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProfessorCoursesJPanel
     */
    JPanel cardContainer;
    private professorDirectory profHistory;
    private courseDirectory courseHistory;
    private professor userProf;
    
    public ViewProfessorCoursesJPanel(JPanel cardContainer, professorDirectory profHistory, courseDirectory courseHistory, professor userProf) {
        initComponents();
        this.cardContainer = cardContainer;
        this.profHistory = profHistory;
        this.courseHistory = courseHistory;
        this.userProf = userProf;
        
        populateAlreadyCreatedCoursesTable();
        populateOngoingCurrentCoursesTable();
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
        btnMakeAvailable = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ongoingPane = new javax.swing.JScrollPane();
        tblOngoingCourses = new javax.swing.JTable();
        createdPane = new javax.swing.JScrollPane();
        tblCreatedCourses = new javax.swing.JTable();
        btnMakeCourseUnavailable = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnViewCurrentDetails = new javax.swing.JButton();
        btnViewCurrentDetails1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMakeAvailable.setText("Make Available");
        btnMakeAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeAvailableActionPerformed(evt);
            }
        });
        jPanel1.add(btnMakeAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 347, 132, 37));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("View Courses");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 798, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Already Created Courses");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 129, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Ongoing Current Courses");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 409, -1, 20));

        tblOngoingCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Course ID", "Semester", "Region", "Language", "Day", "Time"
            }
        ));
        ongoingPane.setViewportView(tblOngoingCourses);

        jPanel1.add(ongoingPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 435, 698, 140));

        tblCreatedCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Course ID", "Semester", "Region", "Language", "Day", "Time"
            }
        ));
        createdPane.setViewportView(tblCreatedCourses);

        jPanel1.add(createdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 159, 698, 170));

        btnMakeCourseUnavailable.setText("Make Unavailable");
        btnMakeCourseUnavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeCourseUnavailableActionPerformed(evt);
            }
        });
        jPanel1.add(btnMakeCourseUnavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 595, 132, 37));

        btnLogOut.setBackground(new java.awt.Color(255, 204, 204));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 69, 94, 30));

        btnViewCurrentDetails.setText("View Details");
        btnViewCurrentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCurrentDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewCurrentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 595, 132, 37));

        btnViewCurrentDetails1.setText("View Details");
        btnViewCurrentDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCurrentDetails1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewCurrentDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 347, 132, 37));

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

    private void btnMakeCourseUnavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeCourseUnavailableActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblOngoingCourses.getSelectedRow();
        boolean flag = false;
        course selectedCourse = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblOngoingCourses.getModel();
        String courseID = (String) model.getValueAt(selectedRowIndex, 1);
        
        ArrayList<course> courseList = userProf.getOngoingCourses();
        
        for (course Course : courseList){
            if (Course.getCourseID().equals(courseID)){
                selectedCourse = Course;
                int numberOfOngoingStudents = Course.getRegisteredOngoingStudents().size();
                if (numberOfOngoingStudents > 0){
                    flag = false;
                    JOptionPane.showMessageDialog(this, "There are students not graded for this course");
                    return;
                }
                else{
                    //courseHistory.removeFromAvailableCourse(Course);
                    //userProf.removeOngoingCourses(Course);
                    flag = true;
                    break;
                }
            }
        }
        
        courseHistory.removeFromAvailableCourse(selectedCourse);
        userProf.removeOngoingCourses(selectedCourse);
        populateAlreadyCreatedCoursesTable();
        populateOngoingCurrentCoursesTable();
        JOptionPane.showMessageDialog(this, "Course is now unavailable");
        
    }//GEN-LAST:event_btnMakeCourseUnavailableActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        ProfessorLoginJPanel logOutPanel= new ProfessorLoginJPanel(cardContainer, profHistory, courseHistory);
        cardContainer.removeAll();
        cardContainer.add(logOutPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMakeAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeAvailableActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCreatedCourses.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCreatedCourses.getModel();
        String courseID = (String) model.getValueAt(selectedRowIndex, 1);
        
        ArrayList<course> courseList = userProf.getCompletedCourses();
        ArrayList<course> ongoingcourseList = userProf.getOngoingCourses();
        
        for (course Course : courseList){
            if (Course.getCourseID().equals(courseID)){
                for (course ongoingCourse : ongoingcourseList){
                    if (ongoingCourse.getCourseID().equals(courseID)){
                        JOptionPane.showMessageDialog(this, "This course is already live");
                        return;
                    }
                }
                courseHistory.addToAvailableCourse(Course);
                userProf.addongoingCourses(Course);
                JOptionPane.showMessageDialog(this, "Course is now live");
                break;
            }
        }
        
        populateAlreadyCreatedCoursesTable();
        populateOngoingCurrentCoursesTable();
        
    }//GEN-LAST:event_btnMakeAvailableActionPerformed

    private void btnViewCurrentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCurrentDetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblOngoingCourses.getSelectedRow();
        course selectedCourse = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblOngoingCourses.getModel();
        String courseID = (String) model.getValueAt(selectedRowIndex, 1);
        
        ArrayList<course> courseList = userProf.getOngoingCourses();
        
        for (course Course : courseList){
            if (Course.getCourseID().equals(courseID)){
                selectedCourse = Course;
                break;
                }
        }
        
        ViewProfessorDetails3JPanel viewProfessorDetails2JPanel = new ViewProfessorDetails3JPanel(cardContainer, profHistory, courseHistory, selectedCourse);
        cardContainer.add("ProfessorLandingJPanel", viewProfessorDetails2JPanel);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.next(cardContainer);
    }//GEN-LAST:event_btnViewCurrentDetailsActionPerformed

    private void btnViewCurrentDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCurrentDetails1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCreatedCourses.getSelectedRow();
        course selectedCourse = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCreatedCourses.getModel();
        String courseID = (String) model.getValueAt(selectedRowIndex, 1);
        
        ArrayList<course> courseList = userProf.getCompletedCourses();
        
        for (course Course : courseList){
            if (Course.getCourseID().equals(courseID)){
                selectedCourse = Course;
                break;
                }
        }
        
        ViewProfessorCoursePastStudentsJPanel viewProfessorCoursePastStudentsPanel = new ViewProfessorCoursePastStudentsJPanel(cardContainer, profHistory, courseHistory, selectedCourse);
        cardContainer.add("ViewProfessorCoursePastStudentsJPanel", viewProfessorCoursePastStudentsPanel);
        CardLayout layout = (CardLayout) cardContainer.getLayout();
        layout.next(cardContainer);
        
    }//GEN-LAST:event_btnViewCurrentDetails1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMakeAvailable;
    private javax.swing.JButton btnMakeCourseUnavailable;
    private javax.swing.JButton btnViewCurrentDetails;
    private javax.swing.JButton btnViewCurrentDetails1;
    private javax.swing.JScrollPane createdPane;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane ongoingPane;
    private javax.swing.JTable tblCreatedCourses;
    private javax.swing.JTable tblOngoingCourses;
    // End of variables declaration//GEN-END:variables

    private void populateAlreadyCreatedCoursesTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCreatedCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = userProf.getCompletedCourses();
        
        for (course Course : courseList){
            Object[] row = new Object[7];
            row[0] = Course.getCoursename();
            row[1] = Course.getCourseID();
            row[2] = Course.getCourseSemester();
            row[3] = Course.getCourseRegion();
            row[4] = Course.getCourseLanguage();
            row[5] = Course.getCourseScheduleDay();
            row[6] = Course.getCourseScheduleTime();
            
            model.addRow(row);
            
        }
    }

    private void populateOngoingCurrentCoursesTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOngoingCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = userProf.getOngoingCourses();
        
        for (course Course : courseList){
            Object[] row = new Object[7];
            row[0] = Course.getCoursename();
            row[1] = Course.getCourseID();
            row[2] = Course.getCourseSemester();
            row[3] = Course.getCourseRegion();
            row[4] = Course.getCourseLanguage();
            row[5] = Course.getCourseScheduleDay();
            row[6] = Course.getCourseScheduleTime();
            
            model.addRow(row);
            
        }
        
    }
}
