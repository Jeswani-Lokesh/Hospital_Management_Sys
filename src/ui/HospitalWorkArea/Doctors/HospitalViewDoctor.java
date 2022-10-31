/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Doctors;

import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;
import model.PersonDirectory;

/**
 *
 * @author Lokesh
 */
public class HospitalViewDoctor extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    Doctor doctor;
    public HospitalViewDoctor(PersonDirectory personDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.doctorDirectory=doctorDirectory;
        this.personDirectory=personDirectory;
        populateData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        lblSearchDoctor = new javax.swing.JLabel();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Doctors");

        tblDoctorList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DoctorId", "Name", "Mobile No", "EmailId", "Age", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctorList);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblSearchDoctor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSearchDoctor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchDoctor.setText("Search Doctor by Name :");

        txtSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDoctorActionPerformed(evt);
            }
        });

        btnSearchDoctor.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblDoctorList.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorList.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex,0 );
        doctorDirectory.deleteDoctor(selectedPatient);

        JOptionPane.showMessageDialog(this, "Patient deleted successfully!");
        populateData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchDoctor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDoctorList;
    private javax.swing.JTextField txtSearchDoctor;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
       
            var x = doctorDirectory.getDoctors();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Id", "Doctor Name", "Specialization","Practising From", "Age","Gender","Contact Number" ,"Email", "Address", "City", "Community"}, 0);
            if(x!=null && !x.isEmpty())
            {
                x.forEach(doctor -> {
                
                String city = null;
                String community = null;              
                Map<String, String> communityMap = doctor.getHouse().getCommunity().getCommunity();            
                for(Map.Entry m: communityMap.entrySet()){  
                    city = m.getKey().toString();
                    community = m.getValue().toString();
                }  
                
                String practisingFromDate = null;
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                    practisingFromDate = simpleDateFormat.format(doctor.getPracticingFrom());
                } catch (Exception ex) {
                    System.out.println("Date is null");
                }
                    
                model.addRow(new Object[]
                {doctor.getDoctorId(),doctor.getName(),doctor.getDoctorSpecialization().toString() ,practisingFromDate,
                    doctor.getAge(),doctor.getGender(), doctor.getCellPhoneNumber(),doctor.getEmailId(),doctor.getHouse().getHouseNum()+" "+ doctor.getHouse().getStreet(),
                    city,community});

            });
                
            tblDoctorList.setModel(model);
            }
        
    }
}
