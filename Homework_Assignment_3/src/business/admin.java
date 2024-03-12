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
public class admin {
    
    private String username;
    private String password;
    private ArrayList<student> transcriptRequests;
    
    public admin(){
        this.transcriptRequests = new ArrayList<student>();
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

    public ArrayList<student> getTranscriptRequests() {
        return transcriptRequests;
    }

    public void setTranscriptRequests(ArrayList<student> transcriptRequests) {
        this.transcriptRequests = transcriptRequests;
    }

    
    
    
    
    
    public void addStudentTranscriptRequest(student Student){
        this.transcriptRequests.add(Student);
    }
    
    public void removeFromTranscriptRequest(student Student){
        this.transcriptRequests.remove(Student);
    }
    
    
}
