/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnogreibd
 */
public class AnhadirEmpleados extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuAdministradores padre;

    public AnhadirEmpleados() {
        initComponents();
    }

    public AnhadirEmpleados(proyectobasesdatos.ProyectoBasesDatos pr) {
        this.pr = pr;

        initComponents();
        anhadir.setEnabled(false);
        aviso.setVisible(false);
        avisoDNI.setVisible(false);
        avisoFecha.setVisible(false);
        avisoTel.setVisible(false);
        jComboBoxAtraccion.setEnabled(false);
        jComboBoxEspectaculo.setEnabled(false);
        jComboBoxRestaurante.setEnabled(false);
    }

    public AnhadirEmpleados(proyectobasesdatos.ProyectoBasesDatos pr, MenuAdministradores padre) {
        this.pr = pr;
        this.padre = padre;
        initComponents();
        anhadir.setEnabled(false);
        aviso.setVisible(false);
        avisoDNI.setVisible(false);
        avisoFecha.setVisible(false);
        avisoTel.setVisible(false);
        jComboBoxAtraccion.setEnabled(false);
        jComboBoxEspectaculo.setEnabled(false);
        jComboBoxRestaurante.setEnabled(false);
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
        dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        String[] array = pr.getAtraccionesDAO().atraccionesActivas().toArray(new String[pr.getAtraccionesDAO().atraccionesActivas().size()]);
        jComboBoxAtraccion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        String[] array2 = pr.getEspectaculosDAO().espectaculosActivos().toArray(new String[pr.getEspectaculosDAO().espectaculosActivos().size()]);
        jComboBoxEspectaculo = new javax.swing.JComboBox<>();
        trabajadorAtra = new javax.swing.JRadioButton();
        trabajadorEsp = new javax.swing.JRadioButton();
        Hostelero = new javax.swing.JRadioButton();
        anhadir = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        String[] array3 = pr.getHosteleriaDAO().establecimientosActivos().toArray(new String[pr.getHosteleriaDAO().establecimientosActivos().size()]);
        jComboBoxRestaurante = new javax.swing.JComboBox<>();
        telefono = new javax.swing.JTextField();
        aviso = new javax.swing.JLabel();
        avisoDNI = new javax.swing.JLabel();
        avisoTel = new javax.swing.JLabel();
        avisoFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setLabelFor(dni);
        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Fecha de Nacimiento:");

        jLabel6.setText("Atracción:");

        jComboBoxAtraccion.setModel(new javax.swing.DefaultComboBoxModel<>(array));

        jLabel7.setText("Espectáculo:");

        jComboBoxEspectaculo.setModel(new javax.swing.DefaultComboBoxModel<>(array2));

        trabajadorAtra.setText("Trabajador Atracción");
        trabajadorAtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorAtraActionPerformed(evt);
            }
        });

        trabajadorEsp.setText("Trabajador Espectáculo");
        trabajadorEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorEspActionPerformed(evt);
            }
        });

        Hostelero.setText("Hostelero");
        Hostelero.setActionCommand("Administrador");
        Hostelero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HosteleroActionPerformed(evt);
            }
        });

        anhadir.setText("Añadir");
        anhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhadirActionPerformed(evt);
            }
        });

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel8.setText("Restaurante:");

        jComboBoxRestaurante.setModel(new javax.swing.DefaultComboBoxModel<>(array3));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        aviso.setForeground(new java.awt.Color(255, 51, 51));
        aviso.setText("Todos los campos son obligatorios");

        avisoDNI.setForeground(new java.awt.Color(255, 51, 51));
        avisoDNI.setText("Formato DNI incorrecto");

        avisoTel.setForeground(new java.awt.Color(255, 51, 51));
        avisoTel.setText("Fomato de teléfono incorrecto");

        avisoFecha.setForeground(new java.awt.Color(255, 51, 51));
        avisoFecha.setText("Fecha de nacimiento incorrecta");

        jLabel9.setText("Salario:");

        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });

        jLabel10.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(anhadir)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(atras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(trabajadorEsp)
                                        .addGap(27, 27, 27)
                                        .addComponent(Hostelero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))))
                            .addComponent(avisoDNI)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(avisoTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avisoFecha)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(trabajadorAtra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(aviso))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avisoDNI)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avisoTel)
                    .addComponent(avisoFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabajadorEsp)
                    .addComponent(Hostelero)
                    .addComponent(trabajadorAtra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anhadir)
                    .addComponent(atras))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void trabajadorAtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorAtraActionPerformed
        if (trabajadorAtra.isSelected() && !Hostelero.isSelected()) {
            jComboBoxAtraccion.setEnabled(true);
            anhadir.setEnabled(true);
        } else {
            jComboBoxAtraccion.setEnabled(false);
            if (!trabajadorEsp.isSelected() && !Hostelero.isSelected()) {
                anhadir.setEnabled(false);
            }
        }

    }//GEN-LAST:event_trabajadorAtraActionPerformed

    private void trabajadorEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorEspActionPerformed
        if (trabajadorEsp.isSelected() && !Hostelero.isSelected()) {
            jComboBoxEspectaculo.setEnabled(true);
            anhadir.setEnabled(true);
        } else {
            jComboBoxEspectaculo.setEnabled(false);
            if (!trabajadorAtra.isSelected() && !Hostelero.isSelected()) {
                anhadir.setEnabled(false);
            }
        }
    }//GEN-LAST:event_trabajadorEspActionPerformed

    private void HosteleroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HosteleroActionPerformed
        if (Hostelero.isSelected()) {
            jComboBoxRestaurante.setEnabled(true);
            jComboBoxAtraccion.setEnabled(false);
            jComboBoxEspectaculo.setEnabled(false);
            anhadir.setEnabled(true);
        } else {
            jComboBoxRestaurante.setEnabled(false);
            if (trabajadorAtra.isSelected()) {
                jComboBoxAtraccion.setEnabled(true);

            }
            if (trabajadorEsp.isSelected()) {
                jComboBoxEspectaculo.setEnabled(true);

            }
            if (!trabajadorAtra.isSelected() && !trabajadorEsp.isSelected()) {
                anhadir.setEnabled(false);
            }
        }
    }//GEN-LAST:event_HosteleroActionPerformed

    private void anhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhadirActionPerformed
        int error = 0;
        aviso.setVisible(false);
        avisoDNI.setVisible(false);
        avisoFecha.setVisible(false);
        avisoTel.setVisible(false);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 1);

        cal.add(Calendar.YEAR, -16);
        Date fecha = cal.getTime();
        if (!dni.getText().isBlank() && !salario.getText().isBlank() && !nombre.getText().isBlank() && !direccion.getText().isBlank() && !telefono.getText().isBlank() && !fechaNacimiento.getDate().toString().isBlank()) {
            if (dni.getText().length() != 9) {
                avisoDNI.setVisible(true);
                error = 1;
            }
            if (telefono.getText().length() != 9) {
                avisoTel.setVisible(true);
                error = 1;
            }
            if (!fechaNacimiento.getDate().before(fecha)) {
                avisoFecha.setVisible(true);
                error = 1;
            }
            if (error == 0) {
                try {
                    anhadirEmpleado();
                } catch (SQLException ex) {
                    Logger.getLogger(AnhadirEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else
            aviso.setVisible(true);
    }//GEN-LAST:event_anhadirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioActionPerformed

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
            java.util.logging.Logger.getLogger(AnhadirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnhadirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnhadirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnhadirEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnhadirEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Hostelero;
    private javax.swing.JButton anhadir;
    private javax.swing.JButton atras;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel avisoDNI;
    private javax.swing.JLabel avisoFecha;
    private javax.swing.JLabel avisoTel;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JComboBox<String> jComboBoxAtraccion;
    private javax.swing.JComboBox<String> jComboBoxEspectaculo;
    private javax.swing.JComboBox<String> jComboBoxRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefono;
    private javax.swing.JRadioButton trabajadorAtra;
    private javax.swing.JRadioButton trabajadorEsp;
    // End of variables declaration//GEN-END:variables

    public void anhadirEmpleado() throws SQLException {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 1);
        Date hoy = cal.getTime();
        java.sql.Date hoy2 = new java.sql.Date(hoy.getTime());
        Date nacimiento = fechaNacimiento.getDate();
        java.sql.Date nacimiento2 = new java.sql.Date(nacimiento.getTime());
        Float sueldo = Float.parseFloat(salario.getText());
        if (!Hostelero.isSelected()) {
            if (trabajadorAtra.isSelected() && trabajadorEsp.isSelected()) {
                pr.getTrabajadoresDAO().anhadirTrabajadorAtraEsp(dni.getText(), nombre.getText(), direccion.getText(), telefono.getText(), hoy2, nacimiento2, jComboBoxAtraccion.getSelectedItem().toString(), jComboBoxEspectaculo.getSelectedItem().toString(), sueldo);
            } else if (trabajadorAtra.isSelected() && !trabajadorEsp.isSelected()) {
                pr.getTrabajadoresDAO().anhadirTrabajadorAtra(dni.getText(), nombre.getText(), direccion.getText(), telefono.getText(), hoy2, nacimiento2, jComboBoxAtraccion.getSelectedItem().toString(), sueldo);

            } else if (!trabajadorAtra.isSelected() && trabajadorEsp.isSelected()) {
                pr.getTrabajadoresDAO().anhadirTrabajadorEsp(dni.getText(), nombre.getText(), direccion.getText(), telefono.getText(), hoy2, nacimiento2, jComboBoxEspectaculo.getSelectedItem().toString(), sueldo);

            } else {
                pr.getTrabajadoresDAO().anhadirTrabajador(dni.getText(), nombre.getText(), direccion.getText(), telefono.getText(), hoy2, nacimiento2);
            }
            JOptionPane.showMessageDialog(rootPane, "Trabajador añadido");
        } else {
            pr.getHostelerosDAO().anhadirHostelero(dni.getText(), nombre.getText(), direccion.getText(), telefono.getText(), hoy2, nacimiento2, jComboBoxRestaurante.getSelectedItem().toString());
            JOptionPane.showMessageDialog(rootPane, "Hostelero añadido");
        }

    }
}
