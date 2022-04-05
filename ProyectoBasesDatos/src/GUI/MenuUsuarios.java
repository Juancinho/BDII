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
public class MenuUsuarios extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private String dni;
   // private Inicio padre;
    
    /**
     *
     */
    public MenuUsuarios() {
        initComponents();
    }

    /**
     *
     * @param pr
     */
    public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr) {
        this.pr = pr;
        initComponents();
        jLabel1.setVisible(false);
        Comprar.setEnabled(false);
        Cancelar.setEnabled(false);
        Puntuar.setEnabled(false);
    }


      

      public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, String dni) {
          this.pr = pr;
          this.dni=dni;

        initComponents();
        jLabel2.setVisible(false);
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
        Buscar = new javax.swing.JButton();
        Acceder = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Puntuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        Buscar.setActionCommand("Buscar");
        Buscar.setBorderPainted(false);
        Buscar.setContentAreaFilled(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        Acceder.setActionCommand("Acceder");
        Acceder.setBorderPainted(false);
        Acceder.setContentAreaFilled(false);
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });
        jPanel1.add(Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 140, 30));

        Comprar.setActionCommand("Comprar");
        Comprar.setBorderPainted(false);
        Comprar.setContentAreaFilled(false);
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        jPanel1.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, 30));

        Salir.setActionCommand("Salir");
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 400, 70, 30));

        Cancelar.setActionCommand("Cancelar");
        Cancelar.setBorderPainted(false);
        Cancelar.setContentAreaFilled(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 130, 40));

        Puntuar.setActionCommand("Puntuar");
        Puntuar.setBorderPainted(false);
        Puntuar.setContentAreaFilled(false);
        Puntuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Puntuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntuarActionPerformed(evt);
            }
        });
        jPanel1.add(Puntuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuBusquedas menuBusquedas = new MenuBusquedas(pr,this);
        menuBusquedas.setVisible(true);
    }//GEN-LAST:event_BuscarActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
        // TODO add your handling code here:
        if(dni==null){
            AccesoUsuario ac= new AccesoUsuario(pr,this);
            this.setVisible(false);
            ac.setVisible(true);
        }
        else{
            MenuUsuarios mu = new MenuUsuarios(pr);
            mu.setVisible(true);
        }
    }//GEN-LAST:event_AccederActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        try {
            pr.getConexion().close();
        } catch (SQLException ex) {
            Logger.getLogger(MenuUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        // TODO add your handling code here:
        MenuComprasReservas mcr= new MenuComprasReservas(pr, this, dni);
        this.setVisible(false);
        mcr.setVisible(true);
    }//GEN-LAST:event_ComprarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        MenuCancelaciones mc = new MenuCancelaciones(pr, this, dni);
        this.setVisible(false);
        mc.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void PuntuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntuarActionPerformed
        // TODO add your handling code here:
        PuntuacionRestaurante pres = new PuntuacionRestaurante(pr,this);
        this.setVisible(false);
        pres.setVisible(true);
    }//GEN-LAST:event_PuntuarActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarios().setVisible(true);
            }
        });        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Puntuar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
