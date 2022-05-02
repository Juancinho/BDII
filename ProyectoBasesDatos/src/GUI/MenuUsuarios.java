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

    private MenuInicio padre;
    private proyectobasesdatos.ProyectoBasesDatos pr;
    private String dni;

    public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, MenuInicio padre) {
        this.pr = pr;
        this.padre = padre;
        initComponents();

        Portada2.setVisible(false);

        Comprar.setEnabled(false);
        Cancelar.setEnabled(false);
        Puntuar.setEnabled(false);
    }


    /*public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, MenuInicio padre) {
        this.pr = pr;
        this.padre=padre;
        initComponents();
        Portada2.setVisible(false);
        Comprar.setEnabled(false);
        Cancelar.setEnabled(false);
        Puntuar.setEnabled(false);
    }*/
 /*public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, String dni) {


    public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, String dni, MenuInicio padre) {

        this.pr = pr;
        this.padre=padre;
        this.dni=dni;
        initComponents();

        Portada1.setVisible(false);
    }*/
    public void setDni(String dni) { //Cambia la visibilidad de los botones según se esté logueado o no
        if (dni != null) {
            this.dni = dni;
            Portada1.setVisible(false);
            Portada2.setVisible(true);
            Comprar.setEnabled(true);
            Cancelar.setEnabled(true);
            Puntuar.setEnabled(true);
        } else {
            this.dni = dni;
            Portada2.setVisible(false);
            Portada1.setVisible(true);
            Comprar.setEnabled(false);
            Cancelar.setEnabled(false);
            Puntuar.setEnabled(false);
        }


    }
          public MenuInicio getPadre() {
        return padre;
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
        Atras = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Puntuar = new javax.swing.JButton();
        Portada2 = new javax.swing.JLabel();
        Portada1 = new javax.swing.JLabel();


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

        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 20));

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

        Portada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada2.jpeg"))); // NOI18N
        jPanel1.add(Portada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        Portada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada.jpeg"))); // NOI18N
        jPanel1.add(Portada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuBusquedas menuBusquedas = new MenuBusquedas(pr, this);
        menuBusquedas.setVisible(true);
    }//GEN-LAST:event_BuscarActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
        // TODO add your handling code here:
        if (dni == null) {
            Acceso ac = new Acceso(pr, this);

            this.setVisible(false);
            ac.setVisible(true);
        } else {
            setDni(null);
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
        MenuComprasReservas mcr = new MenuComprasReservas(pr, this, dni);
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
        PuntuacionRestaurante pres = new PuntuacionRestaurante(pr, this);
        this.setVisible(false);
        pres.setVisible(true);
    }//GEN-LAST:event_PuntuarActionPerformed




    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JButton Atras;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Comprar;

    private javax.swing.JLabel Portada1;
    private javax.swing.JLabel Portada2;
    private javax.swing.JButton Puntuar;
    private javax.swing.JButton Salir;

    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
