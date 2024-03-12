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
public class thirdParty {
    
    private String username;
    private String password;
    private ArrayList<student> graduationRequests;
    
    public thirdParty(){
        this.graduationRequests = new ArrayList<student>();
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

    public ArrayList<student> getGraduationRequests() {
        return graduationRequests;
    }

    public void setGraduationRequests(ArrayList<student> graduationRequests) {
        this.graduationRequests = graduationRequests;
    }
    
    
    
    
    
    public void addStudentGraduationRequest(student Student){
        this.graduationRequests.add(Student);
    }
    
    public void removeFromGraduationRequest(student Student){
        this.graduationRequests.remove(Student);
    }
    
}
