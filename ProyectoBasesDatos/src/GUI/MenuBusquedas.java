
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class MenuBusquedas extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuUsuarios padre;
    

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
        restaurantesTOP = new javax.swing.JButton();
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

        restaurantesTOP.setBorderPainted(false);
        restaurantesTOP.setContentAreaFilled(false);
        restaurantesTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantesTOPActionPerformed(evt);
            }
        });
        jPanel1.add(restaurantesTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 230, 90));

        atras.setAlignmentY(0.0F);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busquedas.png"))); // NOI18N
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

    private void restaurantesTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantesTOPActionPerformed
        RestaurantesTOP rt = new RestaurantesTOP(pr,this);
        this.setVisible(false);
        rt.setVisible(true);
    }//GEN-LAST:event_restaurantesTOPActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atraccionesPorAltura;
    private javax.swing.JButton atras;
    private javax.swing.JButton datos;
    private javax.swing.JButton espectaculoPopular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restaurantesTOP;
    // End of variables declaration//GEN-END:variables
}
