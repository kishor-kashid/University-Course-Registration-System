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
public class course {
    
    private String courseProfessorName;
    private String courseProfessorID;
    private String coursename;
    private String courseID;
    private String courseSemester;
    private String courseDescription;
    private String courseLanguage;
    private String courseRegion;
    private String courseScheduleDay;
    private String courseScheduleTime;
    private ArrayList<student> registeredOngoingStudents;
    private ArrayList<student> registeredPastStudents;
    private ArrayList<Double> courseRating;
    
    public course(){
        this.courseRating = new ArrayList<Double>();
        this.registeredOngoingStudents = new ArrayList<student>();
        this.registeredPastStudents = new ArrayList<student>();
    }

    public String getCourseProfessorName() {
        return courseProfessorName;
    }

    public void setCourseProfessorName(String courseProfessorName) {
        this.courseProfessorName = courseProfessorName;
    }

    public String getCourseProfessorID() {
        return courseProfessorID;
    }

    public void setCourseProfessorID(String courseProfessorID) {
        this.courseProfessorID = courseProfessorID;
    }
    
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getCourseRegion() {
        return courseRegion;
    }

    public void setCourseRegion(String courseRegion) {
        this.courseRegion = courseRegion;
    }

    public String getCourseScheduleDay() {
        return courseScheduleDay;
    }

    public void setCourseScheduleDay(String courseScheduleDay) {
        this.courseScheduleDay = courseScheduleDay;
    }

    public String getCourseScheduleTime() {
        return courseScheduleTime;
    }

    public void setCourseScheduleTime(String courseScheduleTime) {
        this.courseScheduleTime = courseScheduleTime;
    }

    public ArrayList<student> getRegisteredOngoingStudents() {
        return registeredOngoingStudents;
    }

    public void setRegisteredOngoingStudents(ArrayList<student> registeredOngoingStudents) {
        this.registeredOngoingStudents = registeredOngoingStudents;
    }

    public ArrayList<student> getRegisteredPastStudents() {
        return registeredPastStudents;
    }

    public void setRegisteredPastStudents(ArrayList<student> registeredPastStudents) {
        this.registeredPastStudents = registeredPastStudents;
    }
    
    public ArrayList<Double> getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(ArrayList<Double> courseRating) {
        this.courseRating = courseRating;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }
    
    
    
    
    
    
    public void addOngoingStudentToCourse(student Student){
        this.registeredOngoingStudents.add(Student);
    }
    
    public void addPastStudentToCourse(student Student){
        this.registeredPastStudents.add(Student);
        this.registeredOngoingStudents.remove(Student);
    }
    
    public void addCourseRating(Double rating){
        courseRating.add(rating);
    }
    
    public double getCourseRatingDouble(course Course){
        double averageRating = 0.0;
        for (double grades : courseRating){
            averageRating = averageRating + grades;
        }
        averageRating = averageRating / courseRating.size();
        return averageRating;
    }

    
    
    
}
