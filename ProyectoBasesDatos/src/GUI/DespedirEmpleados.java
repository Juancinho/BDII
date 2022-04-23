/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class DespedirEmpleados extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuEmpleados padre;

    public DespedirEmpleados() {
        initComponents();
    }

    public DespedirEmpleados(proyectobasesdatos.ProyectoBasesDatos pr, MenuEmpleados padre) {
        this.pr = pr;
        this.padre = padre;
        initComponents();
        limiteVacio.setVisible(false);
        limiteMax.setVisible(false);
        ModeloTablaHosteleros th = (ModeloTablaHosteleros) tablaHosteleros.getModel();
        th.setFilas(pr.getHostelerosDAO().getHosteleros());
        ModeloTablaTrabajadores tt = (ModeloTablaTrabajadores) tablaTrabajadores.getModel();
        tt.setFilas(pr.getTrabajadoresDAO().getTrabajadores());
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        despedirTrab = new javax.swing.JButton();
        despedirRecientes = new javax.swing.JButton();
        limite = new javax.swing.JTextField();
        limiteVacio = new javax.swing.JLabel();
        limiteMax = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHosteleros = new javax.swing.JTable();
        despedirHost = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tablaTrabajadores.setModel(new ModeloTablaTrabajadores()
        );
        jScrollPane2.setViewportView(tablaTrabajadores);

        despedirTrab.setText("Despedir");
        despedirTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirTrabActionPerformed(evt);
            }
        });

        despedirRecientes.setLabel("Despedir Recientes");
        despedirRecientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirRecientesActionPerformed(evt);
            }
        });

        limiteVacio.setForeground(new java.awt.Color(255, 0, 51));
        limiteVacio.setText("Introduce límite");

        limiteMax.setForeground(new java.awt.Color(255, 0, 51));
        limiteMax.setText("Limite max. 5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(despedirRecientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(despedirTrab)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limiteVacio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limiteMax)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limiteMax)
                    .addComponent(limiteVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(despedirTrab)
                    .addComponent(despedirRecientes)
                    .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Trabajadores", jPanel1);

        tablaHosteleros.setModel(new ModeloTablaHosteleros());
        jScrollPane1.setViewportView(tablaHosteleros);

        despedirHost.setText("Despedir");
        despedirHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirHostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(despedirHost)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(despedirHost)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hosteleros", jPanel2);

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atras)
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atras)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void despedirHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirHostActionPerformed
        despedirHostelero();
    }//GEN-LAST:event_despedirHostActionPerformed

    private void despedirTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirTrabActionPerformed
        despedirTrabajador();    }//GEN-LAST:event_despedirTrabActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void despedirRecientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirRecientesActionPerformed

        int lim;
        limiteVacio.setVisible(false);
        limiteMax.setVisible(false);
        if (limite.getText().isBlank()) {
            limiteVacio.setVisible(true);
        } else {
            lim = Integer.parseInt(limite.getText());
            if (lim > 5) {
                limiteMax.setVisible(true);

            } else {

                despedirRecientes();
            }
        }

    }//GEN-LAST:event_despedirRecientesActionPerformed

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
            java.util.logging.Logger.getLogger(DespedirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DespedirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DespedirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DespedirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DespedirEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton despedirHost;
    private javax.swing.JButton despedirRecientes;
    private javax.swing.JButton despedirTrab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField limite;
    private javax.swing.JLabel limiteMax;
    private javax.swing.JLabel limiteVacio;
    private javax.swing.JTable tablaHosteleros;
    private javax.swing.JTable tablaTrabajadores;
    // End of variables declaration//GEN-END:variables
public void despedirHostelero() {
        pr.getHostelerosDAO().despedirHostelero(tablaHosteleros.getValueAt(tablaHosteleros.getSelectedRow(), 0).toString());
        ModeloTablaHosteleros t = (ModeloTablaHosteleros) tablaHosteleros.getModel();
        t.setFilas(pr.getHostelerosDAO().getHosteleros());

    }

    public void despedirTrabajador() {
        pr.getTrabajadoresDAO().despedirTrabajador(tablaTrabajadores.getValueAt(tablaTrabajadores.getSelectedRow(), 0).toString());
        ModeloTablaTrabajadores t = (ModeloTablaTrabajadores) tablaTrabajadores.getModel();
        t.setFilas(pr.getTrabajadoresDAO().getTrabajadores());

    }

    public void despedirRecientes() {
        int lim = Integer.parseInt(limite.getText());
        for (int i = 0; i < lim; i++) {
            pr.getTrabajadoresDAO().despedirRecientes(lim);
        }
        ModeloTablaTrabajadores t = (ModeloTablaTrabajadores) tablaTrabajadores.getModel();
        t.setFilas(pr.getTrabajadoresDAO().getTrabajadores());
    }

}
