/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lokesh
 */
public class PersonHistory {
    private ArrayList<Person> personhistory;

    public ArrayList<Person> getPersonhistory() {
        return personhistory;
    }

    public void setPersonhistory(ArrayList<Person> personhistory) {
        this.personhistory = personhistory;
    }
    
    public PersonHistory(){        
        personhistory = new  ArrayList<Person>();
     }
   
    
    public Person addNewPerson(){
        Person person = new Person();
        personhistory.add(person);
        return person ; 
    }
   public void deletePerson(Person person){
       personhistory.remove(person);
       
   }
   
   public void updatePerson(Person person , int rowIndex){
       personhistory.set(rowIndex,person);
   }
    
}
