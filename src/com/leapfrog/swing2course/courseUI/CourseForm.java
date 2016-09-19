/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swing2course.courseUI;

import com.leapfrog.swing2course.dao.CourseDAO;
import com.leapfrog.swing2course.dao.impl.CourseDAOImpl;
import com.leapfrog.swing2course.entity.Course;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author apple
 */
public class CourseForm extends javax.swing.JFrame {

    private CourseDAO courseDAO = new CourseDAOImpl();

    public CourseForm() {
        initComponents();
        btnSave.setEnabled(false);
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
        txtId.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblFees = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtFees = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        cmbDurationType = new javax.swing.JComboBox<>();
        txtDuration = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        chkStatus = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblId.setText("ID");

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setText("Course Name ");

        lblFees.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFees.setText("Fees");

        lblDuration.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDuration.setText("Duration");

        cmbDurationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Duration", "Days", "Week", "Month", "Year" }));

        lblStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatus.setText("Status");

        chkStatus.setText("Active");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblId)
                    .addComponent(lblFees)
                    .addComponent(lblDuration)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkStatus)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFees)
                                .addGap(121, 121, 121)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDurationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFees)
                    .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(cmbDurationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(chkStatus))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/swing2course/resources/icons/1473950448_cloud-arrow-up.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonClick(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/swing2course/resources/icons/1473950372_floppy.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonClick(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/swing2course/resources/icons/1473950426_trash_bin.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonClick(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/swing2course/resources/icons/1473950397_sign-add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonClick(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonClick(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonClick(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonClick(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonClick(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnLast))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonClick
        txtId.setText("");
        txtCourseName.setText("");
        txtFees.setText("");
        txtDuration.setText("");
        cmbDurationType.setSelectedIndex(0);
        txtCourseName.setFocusable(true);
        btnSave.setEnabled(true);
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        txtId.setEnabled(false);


    }//GEN-LAST:event_addButtonClick

    private void resetMenu() {
        txtId.setText("");
        txtCourseName.setText("");
        txtFees.setText("");
        txtDuration.setText("");
        cmbDurationType.setSelectedIndex(0);
        txtCourseName.setFocusable(true);
        btnSave.setEnabled(false);
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
        txtId.setEnabled(false);
    }
    
    
    
    private void saveButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonClick
        Course course = new Course();
        course.setName(txtCourseName.getText());
        course.setFees(Double.parseDouble(txtFees.getText()));
        course.setDuration(Integer.parseInt(txtDuration.getText()));
        course.setDurationType(cmbDurationType.getSelectedItem().toString());
        course.setStatus(chkStatus.isSelected());

        try {
            if (courseDAO.insert(course) > 0) {
                JOptionPane.showMessageDialog(null, "Course Add Successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                resetMenu();

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonClick

    private void firstButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonClick
        try {
            Course c = courseDAO.getRecord("first",0);
            if (c != null) {
                txtId.setText(c.getId() + "");
                txtCourseName.setText(c.getName());
                txtFees.setText(c.getFees() + "");
                txtDuration.setText(c.getDuration() + "");
                cmbDurationType.setSelectedItem(c.getDurationType());
                chkStatus.setSelected(c.isStatus());

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_firstButtonClick

    private void lastButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonClick

        try {
            Course c = courseDAO.getRecord("last",0);
            if (c != null) {
                txtId.setText(c.getId() + "");
                txtCourseName.setText(c.getName());
                txtFees.setText(c.getFees() + "");
                txtDuration.setText(c.getDuration() + "");
                cmbDurationType.setSelectedItem(c.getDurationType());
                chkStatus.setSelected(c.isStatus());

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_lastButtonClick

    private void cancelButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonClick

        resetMenu();
    }//GEN-LAST:event_cancelButtonClick

    private void updateButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonClick
        txtId.setEnabled(true);
                btnAdd.setEnabled(false);


        Course course = new Course();
        course.setId(Integer.parseInt(txtId.getText()));
        course.setName(txtCourseName.getText());
        course.setFees(Double.parseDouble(txtFees.getText()));
        course.setDuration(Integer.parseInt(txtDuration.getText()));
        course.setDurationType(cmbDurationType.getSelectedItem().toString());
        course.setStatus(chkStatus.isSelected());

        try {
            if (courseDAO.update(course) > 0) {
                JOptionPane.showMessageDialog(null, "Course Update Successfully", "Updated", JOptionPane.INFORMATION_MESSAGE);
                resetMenu();

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonClick

    private void deleteButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonClick

        Course course = new Course();
        course.setId(Integer.parseInt(txtId.getText()));
        try{
        courseDAO.delete(course.getId());
        }
        catch(ClassNotFoundException ce){
            
        }
        catch(SQLException sq){
            
        }
        resetMenu();

    }//GEN-LAST:event_deleteButtonClick

    private void previousButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonClick

        try {
            Course c = courseDAO.getRecord("previous",Integer.parseInt(txtId.getText()));
            if (c != null) {
                txtId.setText(c.getId() + "");
                txtCourseName.setText(c.getName());
                txtFees.setText(c.getFees() + "");
                txtDuration.setText(c.getDuration() + "");
                cmbDurationType.setSelectedItem(c.getDurationType());
                chkStatus.setSelected(c.isStatus());

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_previousButtonClick

    private void nextButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonClick

         try {
            Course c = courseDAO.getRecord("next",Integer.parseInt(txtId.getText()));
            if (c != null) {
                txtId.setText(c.getId() + "");
                txtCourseName.setText(c.getName());
                txtFees.setText(c.getFees() + "");
                txtDuration.setText(c.getDuration() + "");
                cmbDurationType.setSelectedItem(c.getDurationType());
                chkStatus.setSelected(c.isStatus());

            }
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nextButtonClick

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkStatus;
    private javax.swing.JComboBox<String> cmbDurationType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFees;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFees;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
