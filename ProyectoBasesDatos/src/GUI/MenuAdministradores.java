/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnogreibd
 */
public class MenuAdministradores extends javax.swing.JFrame {
    private MenuInicio padre;
    private proyectobasesdatos.ProyectoBasesDatos pr;
    private String dni;
   // private Inicio padre;
    
    /**
     *
     */
    public MenuAdministradores() {
        initComponents();
    }

    /**
     *
     * @param pr
     */
    public MenuAdministradores(proyectobasesdatos.ProyectoBasesDatos pr, MenuInicio padre) {
        this.pr = pr;
        this.padre=padre;
        initComponents();
    }


      

      public MenuAdministradores(proyectobasesdatos.ProyectoBasesDatos pr, String dni) {
        this.pr = pr;
        this.dni=dni;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Salir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        regalarEntradas = new javax.swing.JButton();
        trabajadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        Salir.setText("Salir");
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 400, 70, 30));

        jButton4.setText("Beneficios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        regalarEntradas.setText("Regalar Entradas");
        regalarEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regalarEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(regalarEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 190, 50));

        trabajadores.setText("Gestión de Empleados");
        trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadoresActionPerformed(evt);
            }
        });
        jPanel1.add(trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regalarEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regalarEntradasActionPerformed
        RegalarEntradas r= new RegalarEntradas(pr, this);
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_regalarEntradasActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BeneficiosAtracciones ba = new BeneficiosAtracciones(pr,this);
        ba.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        try {
            pr.getConexion().close();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdministradores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void trabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadoresActionPerformed
        MenuEmpleados me=new MenuEmpleados(pr, this);
        this.setVisible(false);
        me.setVisible(true);
    }//GEN-LAST:event_trabajadoresActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministradores().setVisible(true);
            }
        });        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regalarEntradas;
    private javax.swing.JButton trabajadores;
    // End of variables declaration//GEN-END:variables
}