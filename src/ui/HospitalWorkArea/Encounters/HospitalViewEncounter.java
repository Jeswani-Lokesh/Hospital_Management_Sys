/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Encounters;

import userinterface.SystemWorkArea.Encounters.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author Lokesh
 */
public class HospitalViewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    PatientDirectory patientDirectory;
 
    
    public HospitalViewEncounter(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        populateEncountersData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchEncounters = new javax.swing.JTextField();
        lblSearchEnctounter = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSearchEncounter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncountersList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtSearchEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEncountersActionPerformed(evt);
            }
        });

        lblSearchEnctounter.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchEnctounter.setText("Search Encounter By Patient Id :");

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Encounters");

        btnSearchEncounter.setText("Search");
        btnSearchEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEncounterActionPerformed(evt);
            }
        });

        tblEncountersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EncounterId", "Date", "Patient ID", "Doctor ID", "Blood Pressure", "Pulse", "Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncountersList);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSearchEnctounter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchEnctounter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEncountersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEncountersActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

               
        
                 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchEncounter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchEnctounter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncountersList;
    private javax.swing.JTextField txtSearchEncounters;
    // End of variables declaration//GEN-END:variables

    
    private void populateEncountersData() {
        try{
   
            var patients = patientDirectory.getPatients();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "PatientID","EncounterID" ,"Encounter Date", "PatientName","DoctorID","Date Of Vitals", "Blood Pressure","Pulse","Temperature"}, 0);
            if(patients!=null && !patients.isEmpty())
            {
                
                for(Patient patient: patients){
                    int patientId=0;
                    int doctorId =0;
                    int encounterId =0;
                    String encounterDate = null;
                    String dateOfVitals = null;
                    String patientName=patient.getName();
                    
                    int bloodpressure = 0;
                    int pulse =0;
                    int temperature =0;
                    
                    System.out.println(patient.getPatientHistoryMap().entrySet());
                    
                    for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatientHistoryMap().entrySet())
                    {
                        patientId= pair.getKey();       
                        
                        ArrayList<Encounter> encounters = pair.getValue().getPatientEncounterHistory();
                        
                        for(Encounter e: encounters){
                            encounterId = e.getEncounterId();
                         
                            VitalSigns vitalSigns = null;  
                            doctorId = e.getDoctorId();
                            Map<Date, VitalSigns> vitalSignMap = e.getPatientEncounter();
                            
                            for(Map.Entry m: vitalSignMap.entrySet()){  
                                            
                                 try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                    encounterDate = simpleDateFormat.format((Date)m.getKey());
                                } catch (Exception ex) {
                                    System.out.println("Date is null");
                                    System.out.println(ex);
                                }
                                
                                vitalSigns = (VitalSigns) m.getValue();
                            }

                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                dateOfVitals = simpleDateFormat.format(vitalSigns.getDateOfVitals());
                             
                            } catch (Exception ex) {
                               System.out.println("Date is null");
                            }
                            
                            bloodpressure = vitalSigns.getBloodPressure();
                            pulse = vitalSigns.getPulse();
                            temperature = vitalSigns.getTemperature();
                            
                            model.addRow(new Object[]
                            {patientId,encounterId,encounterDate,patientName,doctorId,dateOfVitals,bloodpressure,pulse,temperature});
                            
                        }
                        
                    } 
             
                }
                
            tblEncountersList.setModel(model);
            }
            
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
