/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.connection;
//import database.Database;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
//import java.awt.Toolkit;
//import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

//import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
//import java.io.*;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author BLESSY
 */

public class AdminView extends javax.swing.JFrame {

//    static void openAdminView(JLabel username) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String id;
    private static String username;
    
    public AdminView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        conn=connection.getConnection();
        viewTable();
    }
    
    public void close() {
//        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    this.dispose();
    }
    
    public static void openAdminView(String username) {
        AdminView.username = username;
        main();
    }
    
    public static void main(String[] args) {
        openAdminView("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        dashboardSidePanel = new javax.swing.JLabel();
        insertSidePanel = new javax.swing.JPanel();
        insertSidePanel2 = new javax.swing.JLabel();
        deleteSidePanel = new javax.swing.JPanel();
        deleteSidePanel2 = new javax.swing.JLabel();
        logoutSidePanel2 = new javax.swing.JPanel();
        logoutSidePanel = new javax.swing.JLabel();
        viewSidePanel1 = new javax.swing.JPanel();
        viewSidePanel4 = new javax.swing.JLabel();
        viewSidePanel2 = new javax.swing.JPanel();
        viewSidePanel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        exportCsvButton1 = new javax.swing.JButton();
        UpdateButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 102, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        dashboardSidePanel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        dashboardSidePanel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardSidePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardSidePanel.setText("DASHBOARD");
        dashboardSidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardSidePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(dashboardSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 40));

        insertSidePanel.setBackground(new java.awt.Color(153, 153, 153));
        insertSidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertSidePanelMouseClicked(evt);
            }
        });

        insertSidePanel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        insertSidePanel2.setForeground(new java.awt.Color(255, 255, 255));
        insertSidePanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertSidePanel2.setText("INSERT");
        insertSidePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertSidePanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insertSidePanelLayout = new javax.swing.GroupLayout(insertSidePanel);
        insertSidePanel.setLayout(insertSidePanelLayout);
        insertSidePanelLayout.setHorizontalGroup(
            insertSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertSidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertSidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        insertSidePanelLayout.setVerticalGroup(
            insertSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertSidePanel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(insertSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, -1));

        deleteSidePanel.setBackground(new java.awt.Color(153, 153, 153));

        deleteSidePanel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        deleteSidePanel2.setForeground(new java.awt.Color(255, 255, 255));
        deleteSidePanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSidePanel2.setText("DELETE");
        deleteSidePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSidePanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deleteSidePanelLayout = new javax.swing.GroupLayout(deleteSidePanel);
        deleteSidePanel.setLayout(deleteSidePanelLayout);
        deleteSidePanelLayout.setHorizontalGroup(
            deleteSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteSidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteSidePanelLayout.setVerticalGroup(
            deleteSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteSidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteSidePanel2)
                .addContainerGap())
        );

        jPanel15.add(deleteSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 290, -1));

        logoutSidePanel2.setBackground(new java.awt.Color(153, 153, 153));
        logoutSidePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutSidePanel2MouseClicked(evt);
            }
        });

        logoutSidePanel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        logoutSidePanel.setForeground(new java.awt.Color(255, 255, 255));
        logoutSidePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutSidePanel.setText("LOGOUT");
        logoutSidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutSidePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout logoutSidePanel2Layout = new javax.swing.GroupLayout(logoutSidePanel2);
        logoutSidePanel2.setLayout(logoutSidePanel2Layout);
        logoutSidePanel2Layout.setHorizontalGroup(
            logoutSidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutSidePanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        logoutSidePanel2Layout.setVerticalGroup(
            logoutSidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutSidePanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.add(logoutSidePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 290, 40));

        viewSidePanel1.setBackground(new java.awt.Color(153, 153, 153));
        viewSidePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSidePanel1MouseClicked(evt);
            }
        });

        viewSidePanel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewSidePanel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewSidePanel4.setText("VIEW");
        viewSidePanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSidePanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewSidePanel1Layout = new javax.swing.GroupLayout(viewSidePanel1);
        viewSidePanel1.setLayout(viewSidePanel1Layout);
        viewSidePanel1Layout.setHorizontalGroup(
            viewSidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewSidePanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewSidePanel1Layout.setVerticalGroup(
            viewSidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewSidePanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel15.add(viewSidePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 290, 40));

        viewSidePanel2.setBackground(new java.awt.Color(153, 153, 153));
        viewSidePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSidePanel2MouseClicked(evt);
            }
        });

        viewSidePanel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewSidePanel5.setForeground(new java.awt.Color(255, 255, 255));
        viewSidePanel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewSidePanel5.setText("VIEW");
        viewSidePanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSidePanel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewSidePanel2Layout = new javax.swing.GroupLayout(viewSidePanel2);
        viewSidePanel2.setLayout(viewSidePanel2Layout);
        viewSidePanel2Layout.setHorizontalGroup(
            viewSidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSidePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewSidePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewSidePanel2Layout.setVerticalGroup(
            viewSidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewSidePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel15.add(viewSidePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pmkl_k.jpg"))); // NOI18N
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 289, 840));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VIEW [ADMIN]");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel7)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1260, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        exportCsvButton1.setText("Export File (.csv)");
        exportCsvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCsvButton1ActionPerformed(evt);
            }
        });

        UpdateButton1.setText("Update");
        UpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton1ActionPerformed(evt);
            }
        });

        ContentTable.setBackground(new java.awt.Color(204, 255, 204));
        ContentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Lengkap", "Nim", "Kelas", "Asal Daerah", "Email", "Umur", "Jenis Kelamin", "Tanggal Masuk", "Alasan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ContentTable.getTableHeader().setReorderingAllowed(false);
        ContentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ContentTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLOK I. Data Volunteer");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BLOK II. Keterangan Volunteer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(UpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exportCsvButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton1)
                    .addComponent(exportCsvButton1))
                .addGap(124, 124, 124))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1260, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardSidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanelMouseClicked
        // TODO add your handling code here:
        close();
        AdminDashboard.openAdminDashboard(username);
    }//GEN-LAST:event_dashboardSidePanelMouseClicked

    private void insertSidePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSidePanel2MouseClicked
        // TODO add your handling code here:
        close();
        AdminInsert.openAdminInsert(username);
    }//GEN-LAST:event_insertSidePanel2MouseClicked

    private void insertSidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSidePanelMouseClicked
        // TODO add your handling code here:
        close();
        AdminInsert.openAdminInsert(username);
    }//GEN-LAST:event_insertSidePanelMouseClicked

    private void deleteSidePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSidePanel2MouseClicked
        // TODO add your handling code here:
        close();
        AdminDelete.openAdminDelete(username);
    }//GEN-LAST:event_deleteSidePanel2MouseClicked

    private void logoutSidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutSidePanelMouseClicked
        // TODO add your handling code here:
        // Display a confirmation dialog
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        // Check the user's choice
        if (option == JOptionPane.YES_OPTION) {
            close();
            SignIn.openSignIn();
        }
    }//GEN-LAST:event_logoutSidePanelMouseClicked

    private void logoutSidePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutSidePanel2MouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        // Check the user's choice
        if (option == JOptionPane.YES_OPTION) {
            close();
            SignIn.openSignIn();
        }
    }//GEN-LAST:event_logoutSidePanel2MouseClicked

    private void viewSidePanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSidePanel4MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Anda sudah berada disini", "Sudah sampai", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_viewSidePanel4MouseClicked

    private void viewSidePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSidePanel1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Anda sudah berada disini", "Sudah sampai", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_viewSidePanel1MouseClicked

    private void viewSidePanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSidePanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSidePanel5MouseClicked

    private void viewSidePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSidePanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSidePanel2MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseClicked

    private void UpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton1ActionPerformed
        // TODO add your handling code here:
        AdminUpdate da = new AdminUpdate();
        da.data(this.id);
        System.out.println("id:" + this.id);
        da.setVisible(true);
    }//GEN-LAST:event_UpdateButton1ActionPerformed

    private void exportCsvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCsvButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv")); // Menambahkan filter file CSV
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Menambahkan ekstensi .csv jika belum ada
            if (!filePath.toLowerCase().endsWith(".csv")) {
                fileToSave = new File(filePath + ".csv");
            }

            try {
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);

                // Menulis judul kolom
                for (int i = 0; i < ContentTable.getColumnCount(); i++) {
                    bw.write(ContentTable.getColumnName(i) + ",");
                }
                bw.newLine();

                // Menulis data ke file
                for (int i = 0; i < ContentTable.getRowCount(); i++) {
                    for (int j = 0; j < ContentTable.getColumnCount(); j++) {
                        Object value = ContentTable.getValueAt(i, j);
                        if (value != null) {
                            bw.write(value.toString() + ",");
                        } else {
                            bw.write("NULL,");
                        }
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY SAVED", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);

                // Membuka file setelah penulisan selesai
                openFile(fileToSave.getAbsolutePath());
            } catch (IOException ex) {
                //                JOptionPane.showMessageDialog(this, "ERROR", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_exportCsvButton1ActionPerformed

    private void ContentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContentTableMouseClicked
        // TODO add your handling code here:
        
        int barisTampilan = ContentTable.rowAtPoint(evt.getPoint());
        int barisModel = ContentTable.convertRowIndexToModel(barisTampilan);

        DefaultTableModel dtm = (DefaultTableModel) ContentTable.getModel();
        String id = dtm.getValueAt(barisModel, 0).toString();
        String existId = dtm.getValueAt(ContentTable.getSelectedRow(), 0).toString();
        this.id=existId;
    }//GEN-LAST:event_ContentTableMouseClicked

    public void openFile(String file){
            try{
                File path = new File(file);
                Desktop.getDesktop().open(path);
            }catch(IOException ioe){
                System.out.println(ioe);
            }
    }
    
    private void openFile1(String filePath) {
    if (Desktop.isDesktopSupported()) {
        try {
            File file = new File(filePath);
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not open file: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
   private void viewTable() {
    DefaultTableModel tb = new DefaultTableModel();

    tb.addColumn("ID"); // Add the hidden column "ID"
    tb.addColumn("No");
    tb.addColumn("Nama Lengkap");
    tb.addColumn("NIM");
    tb.addColumn("Kelas");
    tb.addColumn("Asal Daerah");
    tb.addColumn("Email");
    tb.addColumn("Umur");
    tb.addColumn("Jenis Kelamin");
    tb.addColumn("Tanggal Masuk");
    tb.addColumn("Alasan");

    ContentTable.setModel(tb);

       try {
           // Mengambil data dari database
           Statement stat = conn.createStatement();
           ResultSet rs = stat.executeQuery("SELECT * FROM content");
           int i = 1;
           while (rs.next()) {
            tb.addRow(new Object[]{
                rs.getString("id"), // Add the ID value to the hidden column
                i, // Assuming 'i' is an incrementing integer for row number
                rs.getString("nama_lengkap"),
                rs.getString("nim"),
                rs.getString("kelas"),
                rs.getString("asal_daerah"),
                rs.getString("email"),
                rs.getString("umur"),
                rs.getString("jenis_kelamin"),
                rs.getString("tanggal_masuk"),
                rs.getString("alasan")
            });
            i++;
        }

           // Hide the "ID" column
            TableColumnModel columnModel = ContentTable.getColumnModel();
            TableColumn idColumn = columnModel.getColumn(0);
            columnModel.removeColumn(idColumn);

       } catch (Exception e) {
           System.out.println(e);
       }
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ContentTable;
    private javax.swing.JButton UpdateButton1;
    private javax.swing.JLabel dashboardSidePanel;
    private javax.swing.JPanel deleteSidePanel;
    private javax.swing.JLabel deleteSidePanel2;
    private javax.swing.JButton exportCsvButton1;
    private javax.swing.JPanel insertSidePanel;
    private javax.swing.JLabel insertSidePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutSidePanel;
    private javax.swing.JPanel logoutSidePanel2;
    private javax.swing.JPanel viewSidePanel1;
    private javax.swing.JPanel viewSidePanel2;
    private javax.swing.JLabel viewSidePanel4;
    private javax.swing.JLabel viewSidePanel5;
    // End of variables declaration//GEN-END:variables
}
