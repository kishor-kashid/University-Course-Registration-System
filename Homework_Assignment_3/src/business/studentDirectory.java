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
public class studentDirectory {
    
    private ArrayList<student> studentList;
    
    public studentDirectory(){
        this.studentList = new ArrayList<student>();
    }

    public ArrayList<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<student> studentList) {
        this.studentList = studentList;
    }
    
    public student addStudent(){
        student newStudent = new student();
        studentList.add(newStudent);
        return newStudent;
    }
    
    public boolean isStudUsernameUnique(String enteredUsername){
        
        for (student Student : studentList){
            String username = Student.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isStudIDUnique(String enteredID){
        
        for (student Student : studentList){
            String ID = Student.getStudentID();
            if (ID.equals(enteredID)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isEligibleForGraduation(student Student){
        int completedCourses = Student.getCompletedCourses().size();
        int ongoingCourses = Student.getOngoingCourses().size();
        if (completedCourses == 8 && ongoingCourses == 0){
            return true;
        }
        return false;
    }
    
    
}
