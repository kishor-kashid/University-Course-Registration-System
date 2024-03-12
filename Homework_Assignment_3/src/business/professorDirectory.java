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
public class professorDirectory {
    
    private ArrayList<professor> professorList;
    
    public professorDirectory(){
        this.professorList = new ArrayList<professor>();
    }

    public ArrayList<professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<professor> professorList) {
        this.professorList = professorList;
    }
    
    public professor addProfessor(){
        professor newProfessor = new professor();
        professorList.add(newProfessor);
        return newProfessor;
    }
    
    public boolean isProfUsernameUnique(String enteredUsername){
        
        for (professor Professor : professorList){
            String username = Professor.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isProfIDUnique(String enteredID){
        
        for (professor Professor : professorList){
            String ID = Professor.getProfessorID();
            if (ID.equals(enteredID)){
                return false;
            }
        }
        
        return true;
    }
    
    public professor serachByProfessorName(String professorName){
        
        for (professor Professor : professorList){
            String ProfessorName = Professor.getName();
            if (ProfessorName.equals(professorName)){
                return Professor;
            }
        }
        
        return null;
    }
    
    
}
