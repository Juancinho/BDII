/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class MenuBusquedas extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuUsuarios padre;
    
    public MenuBusquedas() {
        initComponents();
    }
    public MenuBusquedas(proyectobasesdatos.ProyectoBasesDatos pr, MenuUsuarios padre) {
        this.pr=pr;
        this.padre=padre;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        atraccionesPorAltura = new javax.swing.JButton();
        espectaculoPopular = new javax.swing.JButton();
        datos = new javax.swing.JButton();
        Lugares = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Búsquedas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atraccionesPorAltura.setBorderPainted(false);
        atraccionesPorAltura.setContentAreaFilled(false);
        atraccionesPorAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atraccionesPorAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(atraccionesPorAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, 80));

        espectaculoPopular.setBorderPainted(false);
        espectaculoPopular.setContentAreaFilled(false);
        espectaculoPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espectaculoPopularActionPerformed(evt);
            }
        });
        jPanel1.add(espectaculoPopular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 230, 80));

        datos.setBorderPainted(false);
        datos.setContentAreaFilled(false);
        datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosActionPerformed(evt);
            }
        });
        jPanel1.add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, 70));

        Lugares.setBorderPainted(false);
        Lugares.setContentAreaFilled(false);
        jPanel1.add(Lugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 230, 90));

        atras.setAlignmentY(0.0F);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busquedas.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void atraccionesPorAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atraccionesPorAlturaActionPerformed
        AtraccionesporAltura mu = new AtraccionesporAltura(pr,this);
        this.setVisible(false);        
               mu.setVisible(true);    }//GEN-LAST:event_atraccionesPorAlturaActionPerformed

    private void espectaculoPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espectaculoPopularActionPerformed
        EspectaculomasPopularAño mu = new EspectaculomasPopularAño(pr,this);
        this.setVisible(false);
        mu.setVisible(true);    }//GEN-LAST:event_espectaculoPopularActionPerformed

    private void datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosActionPerformed
       MenuConsultarDatos mu = new MenuConsultarDatos(pr,this);
        this.setVisible(false);
        mu.setVisible(true);
    }//GEN-LAST:event_datosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBusquedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBusquedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBusquedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBusquedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBusquedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lugares;
    private javax.swing.JButton atraccionesPorAltura;
    private javax.swing.JButton atras;
    private javax.swing.JButton datos;
    private javax.swing.JButton espectaculoPopular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
