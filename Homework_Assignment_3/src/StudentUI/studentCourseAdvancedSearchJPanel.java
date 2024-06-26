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
 * @author User
 */
public class studentCourseAdvancedSearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form studentCourseAdvancedSearchJPanel
     */
    
    JPanel cardContainer;
    private studentDirectory studentHistory;
    private student userStudent;
    private courseDirectory courseHistory;
    private admin Admin;
    private String searchBy;
    private thirdParty ThirdParty;

    studentCourseAdvancedSearchJPanel(JPanel cardContainer, studentDirectory studentHistory, courseDirectory courseHistory, student userStudent, admin Admin, thirdParty ThirdParty) {
        initComponents();
        
        this.cardContainer = cardContainer;
        this.studentHistory = studentHistory;
        this.userStudent = userStudent;
        this.courseHistory = courseHistory;
        this.Admin = Admin;
        this.searchBy = " ";
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbSearchCourseBy = new javax.swing.JComboBox<>();
        btnSelect = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudentCourses = new javax.swing.JTable();
        btnRegister = new javax.swing.JButton();
        btnBackcourse = new javax.swing.JButton();
        btnLogoutcourse = new javax.swing.JButton();
        cbSearch = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Search Course By ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 78, 100, -1));

        cbSearchCourseBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Course Name", "Professor Name", "Language", "Region" }));
        cbSearchCourseBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchCourseByActionPerformed(evt);
            }
        });
        add(cbSearchCourseBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 75, 282, -1));

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 75, 97, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 122, 97, -1));

        tblstudentCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Professor ", "Region", "Language", "Day", "Time", "Semester", "Rating"
            }
        ));
        jScrollPane1.setViewportView(tblstudentCourses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 171, 655, 267));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 458, -1, -1));

        btnBackcourse.setBackground(new java.awt.Color(102, 204, 255));
        btnBackcourse.setText("Back");
        btnBackcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackcourseActionPerformed(evt);
            }
        });
        add(btnBackcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 27, 95, -1));

        btnLogoutcourse.setBackground(new java.awt.Color(255, 204, 204));
        btnLogoutcourse.setText("Logout");
        btnLogoutcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutcourseActionPerformed(evt);
            }
        });
        add(btnLogoutcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 25, 87, 28));

        add(cbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 122, 282, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cbSearchCourseByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchCourseByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSearchCourseByActionPerformed

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
        
        ArrayList<course> courseList = courseHistory.getAvailableCourseList();
        ArrayList<course> studentOngoingCourseList = userStudent.getOngoingCourses();
        ArrayList<course> studentCompletedCourseList = userStudent.getCompletedCourses();
        
        for (course Course : studentCompletedCourseList){
            if (Course.getCourseID().equals(courseID)){
                JOptionPane.showMessageDialog(this, "You have already completed this course");
                return;
                }
        }
        
        for (course Course : studentOngoingCourseList){
            if (Course.getCourseID().equals(courseID)){
                JOptionPane.showMessageDialog(this, "You have already registered for this course");
                return;
                }
        }
        
        for (course Course : courseList){
            if (Course.getCourseID().equals(courseID)){
                selectedCourse = Course;
                break;
                }
        }
        
        this.userStudent.addongoingCourses(selectedCourse);
        selectedCourse.addOngoingStudentToCourse(userStudent);
        
        JOptionPane.showMessageDialog(this, "Course registered successfully");
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        Object searchBySelected = cbSearch.getSelectedItem();
        String searchBySelectedString = searchBySelected.toString();
        
        if (this.searchBy.equals("Course Name")){
            populateTableCoursesByCourseName(searchBySelectedString);
        }
        
        if (this.searchBy.equals("Professor Name")){
            populateTableCoursesByProfessorName(searchBySelectedString);
        }
        
        if (this.searchBy.equals("Language")){
            populateTableCoursesByLanguage(searchBySelectedString);
        }
        
        if (this.searchBy.equals("Region")){
            populateTableCoursesByRegion(searchBySelectedString);
        }
        
        cbSearch.removeAllItems();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        
        Object searchBySelected = cbSearchCourseBy.getSelectedItem();
        String searchBySelectedString = searchBySelected.toString();
        this.searchBy = searchBySelectedString;
        
        if (searchBySelectedString.equals(" ")){
            JOptionPane.showMessageDialog(this, "Please select category to search");
            return;
        }
        
        if (searchBySelectedString.equals("Course Name")){
            //populateTableCoursesByCourseName();
            ArrayList<String> courseList = courseHistory.getUniqueCoursenameList();
            for (String Coursename : courseList){
                cbSearch.addItem(Coursename);
            }
        }
        
        if (searchBySelectedString.equals("Professor Name")){
            //populateTableCoursesByProfessorName();
            ArrayList<String> courseList = courseHistory.getUniqueProfnameList();
            for (String Profname : courseList){
                cbSearch.addItem(Profname);
            }
        }
        
        if (searchBySelectedString.equals("Language")){
            //populateTableCoursesByLanguage();
            ArrayList<String> courseList = courseHistory.getUniqueLanguageList();
            for (String language : courseList){
                cbSearch.addItem(language);
            }
        }
        
        if (searchBySelectedString.equals("Region")){
            //populateTableCoursesByRegion();
            ArrayList<String> courseList = courseHistory.getUniqueRegionList();
            for (String region : courseList){
                cbSearch.addItem(region);
            }
        }
         
    }//GEN-LAST:event_btnSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackcourse;
    private javax.swing.JButton btnLogoutcourse;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JComboBox<String> cbSearchCourseBy;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstudentCourses;
    // End of variables declaration//GEN-END:variables

    private void populateTableCoursesByCourseName(String coursename) {
        
        //search by course name
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = courseHistory.serachCourseByCoursename(coursename);
        
        for (course Course : courseList){
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

    private void populateTableCoursesByProfessorName(String professorName) {
        
        //search by professorname
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = courseHistory.serachCourseByProfessorName(professorName);
        
        for (course Course : courseList){
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

    private void populateTableCoursesByLanguage(String language) {
        
        //search by language
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = courseHistory.serachCourseByLanguage(language);
        
        for (course Course : courseList){
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

    private void populateTableCoursesByRegion(String region) {
        
        //search by region
        DefaultTableModel model = (DefaultTableModel) tblstudentCourses.getModel();
        model.setRowCount(0);
        
        ArrayList<course> courseList = courseHistory.serachCourseByRegion(region);
        
        for (course Course : courseList){
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
