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
public class DoctorHistory {
     private ArrayList<Doctor> doctorhistory;

    public ArrayList<Doctor> getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(ArrayList<Doctor> doctorhistory) {
        this.doctorhistory = doctorhistory;
    }
    
    public DoctorHistory(){        
        doctorhistory = new  ArrayList<Doctor>();
     }
   
    
    public Doctor addNewDoctor(){
        Doctor doctor = new Doctor();
        doctorhistory.add(doctor);
        return doctor ; 
    }
   public void deleteDoctor(Doctor doctor){
       doctorhistory.remove(doctor);
       
   }
   
   public void updateDoctor(Doctor doctor , int rowIndex){
       doctorhistory.set(rowIndex,doctor);
   }

}