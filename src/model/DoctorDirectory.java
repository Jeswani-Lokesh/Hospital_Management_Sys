/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Lokesh
 */
public class DoctorDirectory {
    
    private Set<Doctor> doctors = new HashSet<>();

    public DoctorDirectory() {
        
        House house = new House();
        Community community = new Community();
                    
        house.setHouseNum(49);
        house.setStreet("Horadan Way");
                    
        Map<String,String>communities=new HashMap<>();
        communities.put("Boston","Northeastern University");
        community.setCommunity(communities);
        house.setCommunity(community);
       
        Doctor d = new Doctor("Manish",Long.parseLong("9876543323"), "manish1995@gmail.com", 22, "Male", house, 1999, new Date(), DoctorSpecialization.DiagnosticRadiology,"123");
       
        this.doctors.add(d);
    }
    
    
    

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addNewDoctor(Person doctor)
    {
        doctors.add((Doctor) doctor);
    }
    public void deleteDoctor(Patient selectedPatient) {
        doctors.remove(selectedPatient);
    }
    
}
