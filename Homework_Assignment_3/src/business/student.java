/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class student {
    
    private String name;
    private String studentID;
    private String emailID;
    private String username;
    private String password;
    private ArrayList<course> completedCourses;
    private ArrayList<course> ongoingCourses;
    private ArrayList<course> ratedCourses;
    private ArrayList<Double> completedCoursesGrades;
    private boolean isTranscriptRequested;
    private boolean isEligibleForTranscript;
    private boolean isGraduationCertRequested;
    private boolean isEligibleForGraduation;
    private String gradduationCertRequestStatus;
    private String transcriptRequestStatus;
    private String phonenumber;
    private String Gender;
    private String HighestQualification;
    private String Experience;
    private String Skills;
    
    
    public student(){
        this.completedCourses = new ArrayList<course>();
        this.ongoingCourses = new ArrayList<course>();
        this.completedCoursesGrades = new ArrayList<Double>();
        this.ratedCourses = new ArrayList<course>();
        this.isTranscriptRequested = false;
        this.isEligibleForTranscript = false;
        this.isGraduationCertRequested = false;
        this.isEligibleForGraduation = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<course> getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(ArrayList<course> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public ArrayList<course> getOngoingCourses() {
        return ongoingCourses;
    }

    public void setOngoingCourses(ArrayList<course> ongoingCourses) {
        this.ongoingCourses = ongoingCourses;
    }

    public ArrayList<Double> getCompletedCoursesGrades() {
        return completedCoursesGrades;
    }

    public void setCompletedCoursesGrades(ArrayList<Double> completedCoursesGrades) {
        this.completedCoursesGrades = completedCoursesGrades;
    }

    public ArrayList<course> getRatedCourses() {
        return ratedCourses;
    }

    public void setRatedCourses(ArrayList<course> ratedCourses) {
        this.ratedCourses = ratedCourses;
    }

    public boolean isIsTranscriptRequested() {
        return isTranscriptRequested;
    }

    public void setIsTranscriptRequested(boolean isTranscriptRequested) {
        this.isTranscriptRequested = isTranscriptRequested;
    }

    public boolean isIsEligibleForTranscript() {
        return isEligibleForTranscript;
    }

    public void setIsEligibleForTranscript(boolean isEligibleForTranscript) {
        this.isEligibleForTranscript = isEligibleForTranscript;
    }

    public boolean isIsGraduationCertRequested() {
        return isGraduationCertRequested;
    }

    public void setIsGraduationCertRequested(boolean isGraduationCertRequested) {
        this.isGraduationCertRequested = isGraduationCertRequested;
    }

    public boolean isIsEligibleForGraduation() {
        return isEligibleForGraduation;
    }

    public void setIsEligibleForGraduation(boolean isEligibleForGraduation) {
        this.isEligibleForGraduation = isEligibleForGraduation;
    }

    public String getGradduationCertRequestStatus() {
        return gradduationCertRequestStatus;
    }

    public void setGradduationCertRequestStatus(String gradduationCertRequestStatus) {
        this.gradduationCertRequestStatus = gradduationCertRequestStatus;
    }

    public String getTranscriptRequestStatus() {
        return transcriptRequestStatus;
    }

    public void setTranscriptRequestStatus(String transcriptRequestStatus) {
        this.transcriptRequestStatus = transcriptRequestStatus;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getHighestQualification() {
        return HighestQualification;
    }

    public void setHighestQualification(String HighestQualification) {
        this.HighestQualification = HighestQualification;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    
    

    
    
    
    public void addcompletedCourses(course Course){
        this.completedCourses.add(Course);
        this.ongoingCourses.remove(Course);
    }
    
    public void addongoingCourses(course Course){
        this.ongoingCourses.add(Course);
    }
    
    public void addCompletedCoursesGrades(Double grade){
        this.completedCoursesGrades.add(grade);
    }
    
    public void addRatedCourses(course Course){
        this.ratedCourses.add(Course);
    }
    
    public double getCourseGrades(course Course){
        int index = 0;
        for (course iteratingCourse : this.completedCourses){
            if (iteratingCourse.getCourseID().equals(Course.getCourseID())){
                break;
            }
            index = index+1 ;
        }
        return (this.completedCoursesGrades.get(index));
    }
    
    public double getStudentOverallGrade(student Student){
        double grades = 0.0;
        for (double gradesAchieved : this.completedCoursesGrades){
            grades = grades + gradesAchieved;
        }
        return (grades / this.completedCoursesGrades.size());
    }
    
}
