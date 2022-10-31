/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Patients;

import userinterface.SystemWorkArea.Patient.*;
import model.PatientDirectory;
import model.PersonDirectory;
import userinterface.SystemWorkArea.Doctor.*;
import userinterface.SystemWorkArea.Patient.SystemCreatePatient;
import userinterface.SystemWorkArea.Patient.SystemUpdatePatient;
import userinterface.SystemWorkArea.Patient.SystemViewPatient;

/**
 *
 * @author Lokesh
 */
public class HospitalPatientWorkPanel extends javax.swing.JPanel {

    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    /**
     * Creates new form SystemPatient
     */
    public HospitalPatientWorkPanel(PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
              
        HospitalViewPatient hospitalViewPatient = new HospitalViewPatient(patientDirectory,personDirectory);
        splitPane.setRightComponent(hospitalViewPatient );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnViewPatient = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnUpdatePatient = new javax.swing.JButton();
        patientWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(160, 132, 202));

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(102, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(150, 609));
        controlPanel.setVerifyInputWhenFocusTarget(false);

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnUpdatePatient.setText("Update Patient");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreatePatient, btnUpdatePatient, btnViewPatient});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreatePatient, btnUpdatePatient, btnViewPatient});

        splitPane.setLeftComponent(controlPanel);

        patientWorkArea.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout patientWorkAreaLayout = new javax.swing.GroupLayout(patientWorkArea);
        patientWorkArea.setLayout(patientWorkAreaLayout);
        patientWorkAreaLayout.setHorizontalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        patientWorkAreaLayout.setVerticalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(patientWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        HospitalCreatePatient hospitalCreatePatient = new HospitalCreatePatient(personDirectory, patientDirectory);
        splitPane.setRightComponent(hospitalCreatePatient);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        HospitalViewPatient hospitalViewPatient = new HospitalViewPatient(patientDirectory,personDirectory);
        splitPane.setRightComponent(hospitalViewPatient );
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
        HospitalUpdatePatient hospitalUpdatePatient = new HospitalUpdatePatient(personDirectory,patientDirectory);
        splitPane.setRightComponent(hospitalUpdatePatient);
    }//GEN-LAST:event_btnUpdatePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel patientWorkArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
