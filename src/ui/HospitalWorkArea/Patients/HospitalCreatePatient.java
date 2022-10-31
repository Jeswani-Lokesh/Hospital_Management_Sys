/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Patients;

import userinterface.SystemWorkArea.Patient.*;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lokesh
 */
public class HospitalCreatePatient extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    public HospitalCreatePatient(PersonDirectory personDirectory,PatientDirectory patientDirectory) {
        initComponents();
        initCityCmbx();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnCreatePatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtCellPhoneNo = new javax.swing.JTextField();
        lblCellPhoneNo = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        comboCity = new javax.swing.JComboBox<>();
        comboState = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        txtHouseNo = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Patient");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age :");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender :");

        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHeight.setText("Height :");

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWeight.setText("Weight :");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contact Information");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Personal Information");

        lblHouseNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHouseNo.setText("House No :");

        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStreet.setText("Street :");

        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City :");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblState.setText("State :");

        txtCellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNoActionPerformed(evt);
            }
        });

        lblCellPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCellPhoneNo.setText("Cell Phone Number :");

        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailID.setText("Email ID :");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });

        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NY", "MA", "CA", "TX" }));

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunity.setText("Community :");

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblEmailID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboCity, 0, 171, Short.MAX_VALUE)
                                        .addComponent(txtHouseNo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStreet)
                                        .addComponent(comboState, 0, 169, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(lblHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAge)
                                        .addComponent(comboGender, 0, 155, Short.MAX_VALUE)))))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreatePatient)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeight)
                    .addComponent(lblGender)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeight))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHouseNo)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStreet)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblState)
                        .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCellPhoneNo)
                    .addComponent(txtCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID))
                .addGap(18, 18, 18)
                .addComponent(btnCreatePatient)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
       
        try{
            if(EmpytyFieldValidation()){

                if(RegexValidation()){
                    
                    String name = txtName.getText();
                    long cellPhoneNumber = Long.parseLong(txtCellPhoneNo.getText());
                    String emailId = txtEmailID.getText();
                    int age = Integer.parseInt( txtAge.getText());
                    String gender = comboGender.getSelectedItem().toString();
                    
                    House house = new House();
                    Community community = new Community();
                    
                    house.setHouseNum(Integer.parseInt(txtHouseNo.getText()));
                    house.setStreet(txtStreet.getText());
                    
                    Map<String,String>communities=new HashMap<>();
                    communities.put(comboCity.getSelectedItem().toString(),comboCommunity.getSelectedItem().toString());
                    community.setCommunity(communities);
                    house.setCommunity(community);
                    
                    float height = Float.parseFloat(txtHeight.getText());
                    float weight = Float.parseFloat(txtWeight.getText());
                    
                    Random random=new Random();
                    int patientID=random.nextInt((9999 - 100) + 1) + 10;
                     
                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1)+ 10);
                    
                    Person patient = new Patient(name,cellPhoneNumber,emailId,age,gender,house,patientID ,height ,weight, password);
                    personDirectory.addNewPerson(patient);
                    patientDirectory.addNewPatient(patient);
                    
                    JOptionPane.showMessageDialog(this,"Patient Registered Successfully.Your New Patient Id is:"+patientID+" and password: "+password+",Please save this Patient Id for furture appointments.");
                                    

                }
                else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data. Please check over the red fields to know more.");
                    emptyValidationStatus=true;
                }   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
            if(personDirectory.getPersonDirectory().size()>0)
            personDirectory.getPersonDirectory().remove(personDirectory.getPersonDirectory().size() - 1);
            if(patientDirectory.getPatients().size()>0)
            patientDirectory.getPatients().remove(patientDirectory.getPatients().size() - 1);
        }
        
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtCellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNoActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
        initCommunityCmbx();
    }//GEN-LAST:event_comboCityItemStateChanged

    private boolean RegexValidation() {
        if(!txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        
        
        if(!txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("Pleae enter only numbers");
            validationCheck=false;
        }
        
        if(txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtHeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHeight.setToolTipText("Pleae enter only numbers");
            validationCheck=false;
        }
        
        if(txtHeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtWeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtWeight.setToolTipText("Pleae enter only numbers");
            validationCheck=false;
        }
        
        if(txtWeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtEmailID.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEmailID.setToolTipText("Please enter a valid Email Address in the form abc@xyy.com");
            validationCheck=false;
        }
        
        if(txtEmailID.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtCellPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCellPhoneNo.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }
        
        if(txtCellPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtName.getText().equals(null) || txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtName.getText().equals(null) && !txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
       
        if(txtAge.getText().equals(null) || txtAge.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtAge.getText().equals(null) && !txtAge.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
         if(txtHeight.getText().equals(null) || txtHeight.getText().trim().isEmpty())
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHeight.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
         if(!txtHeight.getText().equals(null) && !txtHeight.getText().trim().isEmpty())
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(txtWeight.getText().equals(null) || txtWeight.getText().trim().isEmpty())
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtWeight.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
         if(!txtWeight.getText().equals(null) && !txtWeight.getText().trim().isEmpty())
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            
        }
         
        if(txtHouseNo.getText().equals(null) || txtHouseNo.getText().trim().isEmpty())
        {
            txtHouseNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHouseNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHouseNo.getText().equals(null) && !txtHouseNo.getText().trim().isEmpty())
        {
            txtHouseNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        
        if(txtStreet.getText().equals(null)|| txtStreet.getText().trim().isEmpty())
        {
            txtStreet.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtStreet.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtStreet.getText().equals(null) && !txtStreet.getText().trim().isEmpty())
        {
            txtStreet.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
        }
        
        if(txtCellPhoneNo.getText().equals(null) || txtCellPhoneNo.getText().trim().isEmpty())
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCellPhoneNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtCellPhoneNo.getText().equals(null) && !txtCellPhoneNo.getText().trim().isEmpty())
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }
    
    private void initCommunityCmbx() {
        comboCommunity.removeAllItems();
        int count = 0;
        var selectedCity=comboCity.getSelectedItem().toString();
        City city=City.valueOf(selectedCity);
        Community community=new Community();
        community.setLstCommunity();
        String[] communities=community.getLstCommunity().get(city);
            for (String community_ : communities) {
                comboCommunity.addItem(communities[count++]);
            }
    }
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
       initCommunityCmbx();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNo;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNo;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
