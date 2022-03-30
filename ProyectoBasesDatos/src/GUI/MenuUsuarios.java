/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class MenuUsuarios extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    
    public MenuUsuarios() {
        initComponents();
    }
      public MenuUsuarios(proyectobasesdatos.ProyectoBasesDatos pr) {
          this.pr = pr;
        initComponents();
    }
//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenúUsuarios = new javax.swing.JLabel();
        compraroreservar = new javax.swing.JButton();
        Puntuar = new javax.swing.JButton();
        cancelaciones = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenúUsuarios.setText("Menú Usuarios");

        compraroreservar.setText("Comprar o Reservar");
        compraroreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraroreservarActionPerformed(evt);
            }
        });

        Puntuar.setText("Puntuar Restaurantes");
        Puntuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntuarActionPerformed(evt);
            }
        });

        cancelaciones.setText("Cancelar Compra o Reserva");
        cancelaciones.setActionCommand("Cancelar Compras o Reservas");
        cancelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelacionesActionPerformed(evt);
            }
        });

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jButton3.setText("Búsquedas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(MenúUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(cancelaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Puntuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(atras))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(compraroreservar)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(MenúUsuarios)
                .addGap(25, 25, 25)
                .addComponent(compraroreservar)
                .addGap(18, 18, 18)
                .addComponent(cancelaciones)
                .addGap(18, 18, 18)
                .addComponent(Puntuar)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(atras)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelacionesActionPerformed
MenuCancelaciones mc= new MenuCancelaciones();
        this.setVisible(false);
        mc.setVisible(true);    }//GEN-LAST:event_cancelacionesActionPerformed

    private void PuntuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntuarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_PuntuarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        AccesoUsuario in = new AccesoUsuario();
       this.setVisible(false);
       in.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void compraroreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraroreservarActionPerformed
        MenuComprasReservas mc= new MenuComprasReservas();
        this.setVisible(false);
        mc.setVisible(true);
    }//GEN-LAST:event_compraroreservarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuBusquedas menuBusquedas = new MenuBusquedas(pr);
        menuBusquedas.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JLabel MenúUsuarios;
    private javax.swing.JButton Puntuar;
    private javax.swing.JButton atras;
    private javax.swing.JButton cancelaciones;
    private javax.swing.JButton compraroreservar;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
