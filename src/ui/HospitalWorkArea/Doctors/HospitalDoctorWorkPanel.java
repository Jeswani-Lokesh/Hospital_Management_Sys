/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Doctors;

import model.DoctorDirectory;
import model.PersonDirectory;

/**
 *
 * @author Lokesh
 */
public class HospitalDoctorWorkPanel extends javax.swing.JPanel {

    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    /**
     * Creates new form SystemPatient
     */
    public HospitalDoctorWorkPanel(PersonDirectory personDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
              
        HospitalViewDoctor hospitalViewDoctor = new HospitalViewDoctor(personDirectory,doctorDirectory);
        splitPane.setRightComponent(hospitalViewDoctor );
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
        btnViewDoctor = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnUpdateDoctor = new javax.swing.JButton();
        patientWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(160, 132, 202));

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(150, 609));
        controlPanel.setVerifyInputWhenFocusTarget(false);

        btnViewDoctor.setText("View Doctors");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnUpdateDoctor.setText("Update Doctor");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateDoctor, btnUpdateDoctor, btnViewDoctor});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateDoctor, btnUpdateDoctor, btnViewDoctor});

        splitPane.setLeftComponent(controlPanel);

        patientWorkArea.setBackground(new java.awt.Color(255, 255, 255));

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

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        HospitalCreateDoctor hospitalCreateDoctor = new HospitalCreateDoctor(personDirectory, doctorDirectory);
        splitPane.setRightComponent(hospitalCreateDoctor);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        HospitalViewDoctor hospitalViewDoctor = new HospitalViewDoctor(personDirectory,doctorDirectory);
        splitPane.setRightComponent(hospitalViewDoctor );
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        // TODO add your handling code here:
        HospitalUpdateDoctor hospitalUpdateDoctor = new HospitalUpdateDoctor(personDirectory,doctorDirectory);
        splitPane.setRightComponent(hospitalUpdateDoctor);
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnUpdateDoctor;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel patientWorkArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
