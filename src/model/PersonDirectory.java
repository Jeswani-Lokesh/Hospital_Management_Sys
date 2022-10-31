/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lokesh
 */
public class PersonDirectory {
    
    /*
    Person Directory contains an ArrayList of all the Person_.
     */
    List<Person> persons = new ArrayList<>();

//    Adding dummy data for testing purpose
    public PersonDirectory() {
        
        House house = new House();
        Community community = new Community();
        Map<String, String> CityCommunityMap = new HashMap<>();
        CityCommunityMap.put("Boston", "Prudential");
        community.setCommunity(CityCommunityMap);
        
        house.setCommunity(community);
        house.setHouseNum(49 );
        house.setStreet("Horadan Way");
        
        
        
        Person person = new Person("Mohan",Long.parseLong("9892066899"),"mohan1960@gmail.com",49,"Male",house,"123");

        persons.add(person);
    }
    
    public List<Person> getPersonDirectory() {
        return persons;
    }
    
    public void setPersonDirectory(List<Person> persons) {
        this.persons = persons;
    }
    
    public void addNewPerson(Person person)
    {
        persons.add(person);
    }     
        
}
