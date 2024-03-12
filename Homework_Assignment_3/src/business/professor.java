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
public class professor {
    
    private String name;
    private String professorID;
    private String emailID;
    private String username;
    private String password;
    private ArrayList<course> completedCourses;
    private ArrayList<course> ongoingCourses;
    private String phonenumber;
    private String Gender;
    private String HighestQualification;
    private String Experience;
    private String Skills;
    
    public professor(){
        this.completedCourses = new ArrayList<course>();
        this.ongoingCourses = new ArrayList<course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
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
    
    
    
    
    
    public void removeOngoingCourses(course Course){
        this.ongoingCourses.remove(Course);
    }
    
    public void addongoingCourses(course Course){
        this.ongoingCourses.add(Course);
    }
    
    public void addCourses(course Course){
        this.completedCourses.add(Course);
    }
    
}
