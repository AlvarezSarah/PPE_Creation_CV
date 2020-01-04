/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.end;

import com.karimandco.auth.Utilisateur;
import com.karimandco.importexport.ImportExportCSV;
import com.karimandco.importexport.ImportExportJSON;
import com.karimandco.importexport.ImportExportXML;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class JFrameInterfaceUtilisateur extends javax.swing.JFrame {

    /**
     * Creates new form JFrameInterfaceUtilisateur
     */
    public JFrameInterfaceUtilisateur() {
        initComponents();
        creationDuCV3.setIdUtilisateur(Utilisateur.getInstance().getId());
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        creationDuCV1 = new com.karimandco.cv.CreationDuCV();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        creationDuCV3 = new com.karimandco.cv.CreationDuCV();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        panneauAdministration1 = new com.karimandco.admin.PanneauAdministration();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        choisirImage1 = new com.karimandco.image.ChoisirImage();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        voirPdf1 = new com.karimandco.pdf.VoirPdf();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCreaCV = new javax.swing.JMenu();
        jMenuVoirCV = new javax.swing.JMenu();
        jMenuChoisirImage = new javax.swing.JMenu();
        jMenuDeconnection = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenu();
        JSON = new javax.swing.JMenuItem();
        CSV = new javax.swing.JMenuItem();
        XML = new javax.swing.JMenuItem();
        Admin = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creationDuCV3, javax.swing.GroupLayout.DEFAULT_SIZE, 1475, Short.MAX_VALUE)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creationDuCV3, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(panneauAdministration1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panneauAdministration1, javax.swing.GroupLayout.PREFERRED_SIZE, 1648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panneauAdministration1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(choisirImage1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(choisirImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(choisirImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(voirPdf1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(voirPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(voirPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
        );

        jMenuCreaCV.setText("Création CV");
        jMenuCreaCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCreaCVMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCreaCV);

        jMenuVoirCV.setText("Voir CV PDF");
        jMenuVoirCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoirCVMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVoirCV);

        jMenuChoisirImage.setText("Ajouter Image de profil");
        jMenuChoisirImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuChoisirImageMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuChoisirImage);

        jMenuDeconnection.setText("Déconnection");
        jMenuDeconnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDeconnectionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuDeconnection);

        jMenuAdmin.setText("Espace Admin");

        JSON.setText("Donnée JSON");
        JSON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSONMouseClicked(evt);
            }
        });
        JSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSONActionPerformed(evt);
            }
        });
        jMenuAdmin.add(JSON);

        CSV.setText("Donnée CSV");
        CSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CSVMouseClicked(evt);
            }
        });
        CSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSVActionPerformed(evt);
            }
        });
        jMenuAdmin.add(CSV);

        XML.setText("Donnée XML");
        XML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMLMouseClicked(evt);
            }
        });
        XML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMLActionPerformed(evt);
            }
        });
        jMenuAdmin.add(XML);

        Admin.setText("Espace Administration");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jMenuAdmin.add(Admin);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 322, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 783, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(502, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JFrameCoAndAuth jFrameMain;
    public JFrameInterfaceUtilisateur jFrameInterface;
    public Integer statut = null;

    private void init(){
        creationDuCV3.show();
        voirPdf1.hide();
        choisirImage1.hide();
        panneauAdministration1.hide();
    }
    
    
    private void jMenuCreaCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreaCVMouseClicked
        creationDuCV3.show();
        voirPdf1.hide();
        choisirImage1.hide();
        panneauAdministration1.hide();
    }//GEN-LAST:event_jMenuCreaCVMouseClicked

    private void jMenuVoirCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoirCVMouseClicked
        voirPdf1.show();
        creationDuCV3.hide();
        choisirImage1.hide();
        panneauAdministration1.hide();

    }//GEN-LAST:event_jMenuVoirCVMouseClicked

    private void jMenuChoisirImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuChoisirImageMouseClicked
        choisirImage1.show();
        creationDuCV3.hide();
        voirPdf1.hide();
        panneauAdministration1.hide();
    }//GEN-LAST:event_jMenuChoisirImageMouseClicked

    private void jMenuDeconnectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDeconnectionMouseClicked
     this.jFrameMain = new JFrameCoAndAuth();
     Utilisateur.getInstance().setEstConnecte(false);
        System.out.println(Utilisateur.getInstance().getEstConnecte());
        jFrameMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuDeconnectionMouseClicked

    private void XMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMLMouseClicked
        
    }//GEN-LAST:event_XMLMouseClicked

    private void JSONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSONMouseClicked
        
    }//GEN-LAST:event_JSONMouseClicked

    private void CSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CSVMouseClicked
        
    }//GEN-LAST:event_CSVMouseClicked

    private void XMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XMLActionPerformed
        ImportExportXML objEXML = new ImportExportXML("src\\main\\java\\com\\karimandco\\importexport\\BddExporterXml.xml");
        objEXML.exportFichier();
        JOptionPane.showMessageDialog(this, "L'importation des données en format XML à été effectuée avec succès !", "IMPORTATION DES DONNEES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_XMLActionPerformed

    private void JSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSONActionPerformed
        ImportExportJSON objJSON = new ImportExportJSON("src\\main\\java\\com\\karimandco\\importexport\\BddExporterJson.json");
        objJSON.exportFichier();
        JOptionPane.showMessageDialog(this, "L'importation des données en format JSON à été effectuée avec succès !", "IMPORTATION DES DONNEES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JSONActionPerformed

    private void CSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSVActionPerformed
        ImportExportCSV objCSV = new ImportExportCSV("src\\main\\java\\com\\karimandco\\importexport\\BddExporterCsv.csv");
        objCSV.exportFichier();
        JOptionPane.showMessageDialog(this, "L'importation des données en format CSV à été effectuée avec succès !", "IMPORTATION DES DONNEES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CSVActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        panneauAdministration1.show();
        choisirImage1.hide();
        creationDuCV3.hide();
        voirPdf1.hide();
    }//GEN-LAST:event_AdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JFrameInterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInterfaceUtilisateur().setVisible(true);
            }
        });
    }

    public JMenu getjMenuEspaceAdmin() {
        return jMenuAdmin;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Admin;
    private javax.swing.JMenuItem CSV;
    private javax.swing.JMenuItem JSON;
    private javax.swing.JMenuItem XML;
    private com.karimandco.image.ChoisirImage choisirImage1;
    private com.karimandco.cv.CreationDuCV creationDuCV1;
    private com.karimandco.cv.CreationDuCV creationDuCV3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuChoisirImage;
    private javax.swing.JMenu jMenuCreaCV;
    private javax.swing.JMenu jMenuDeconnection;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuVoirCV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private com.karimandco.admin.PanneauAdministration panneauAdministration1;
    private com.karimandco.pdf.VoirPdf voirPdf1;
    // End of variables declaration//GEN-END:variables
}
