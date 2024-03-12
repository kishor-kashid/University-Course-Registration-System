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
public class courseDirectory {
    
    private ArrayList<course> courseList;
    private ArrayList<course> availableCourseList;
    
    private ArrayList<String> uniqueCoursenames;
    private ArrayList<String> uniqueProfnames;
    private ArrayList<String> uniqueRegions;
    private ArrayList<String> uniqueLanguages;
    
    public courseDirectory(){
        
        this.courseList = new ArrayList<course>();
        this.availableCourseList = new ArrayList<course>();
        this.uniqueCoursenames = new ArrayList<String>();
        this.uniqueProfnames = new ArrayList<String>();
        this.uniqueLanguages = new ArrayList<String>();
        this.uniqueRegions = new ArrayList<String>();
        
    }

    public ArrayList<course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<course> getAvailableCourseList() {
        return availableCourseList;
    }

    public void setAvailableCourseList(ArrayList<course> availableCourseList) {
        this.availableCourseList = availableCourseList;
    }
    
    
    
    
    public course addCourse(){
        course newCourse = new course();
        courseList.add(newCourse);
        return newCourse;
    }
    
    /*
    public void deleteCourse(course Course){
        courseList.remove(Course);
    }
    */
    
    public void addToAvailableCourse(course Course){
        availableCourseList.add(Course);
    }
    
    public void removeFromAvailableCourse(course Course){
        availableCourseList.remove(Course);
    }
    
    public boolean isCourseIDUnique(String enteredID){
        
        for (course Course : courseList){
            String ID = Course.getCourseID();
            if (ID.equals(enteredID)){
                return false;
            }
        }
        
        return true;
    }
    
    public ArrayList<course> serachCourseByCoursename(String coursename){
        
        ArrayList<course> coursesToReturn = new ArrayList<>();
        for (course Course : availableCourseList){
            String Coursename = Course.getCoursename();
            if (Coursename.equals(coursename)){
                coursesToReturn.add(Course);
            }
        }
        return coursesToReturn;
        
    }
    
    public ArrayList<course> serachCourseByProfessorName(String professorName){
        
        ArrayList<course> coursesToReturn = new ArrayList<>();
        for (course Course : availableCourseList){
            String ProfessorName = Course.getCourseProfessorName();
            if (ProfessorName.equals(professorName)){
                coursesToReturn.add(Course);
            }
        }
        return coursesToReturn;
        
    }
    
    public ArrayList<course> serachCourseByLanguage(String language){
        
        ArrayList<course> coursesToReturn = new ArrayList<>();
        for (course Course : availableCourseList){
            String Language = Course.getCourseLanguage();
            if (Language.equals(language)){
                coursesToReturn.add(Course);
            }
        }
        return coursesToReturn;
        
    }
    
    public ArrayList<course> serachCourseByRegion(String region){
        
        ArrayList<course> coursesToReturn = new ArrayList<>();
        for (course Course : availableCourseList){
            String Region = Course.getCourseRegion();
            if (Region.equals(region)){
                coursesToReturn.add(Course);
            }
        }
        return coursesToReturn;
        
    }
    
    
    public ArrayList<String> getUniqueCoursenameList(){
        
        for (course Course : availableCourseList){
            String Coursename = Course.getCoursename();
            if (uniqueCoursenames.indexOf(Coursename) <0){
                uniqueCoursenames.add(Coursename);
            }
        }
        return uniqueCoursenames;
        
    }
    
    public ArrayList<String> getUniqueProfnameList(){
        
        for (course Course : availableCourseList){
            String Profname = Course.getCourseProfessorName();
            if (uniqueProfnames.indexOf(Profname) <0){
                uniqueProfnames.add(Profname);
            }
        }
        return uniqueProfnames;
        
    }
    
    public ArrayList<String> getUniqueRegionList(){
        
        for (course Course : availableCourseList){
            String region = Course.getCourseRegion();
            if (uniqueRegions.indexOf(region) <0){
                uniqueRegions.add(region);
            }
        }
        return uniqueRegions;
        
    }
    
    public ArrayList<String> getUniqueLanguageList(){
        
        for (course Course : availableCourseList){
            String language = Course.getCourseLanguage();
            if (uniqueLanguages.indexOf(language) <0){
                uniqueLanguages.add(language);
            }
        }
        return uniqueLanguages;
        
    }
    
}
