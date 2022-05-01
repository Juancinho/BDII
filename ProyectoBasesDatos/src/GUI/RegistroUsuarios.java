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

/**
 *
 * @author alumnogreibd
 */
public class RegistroUsuarios extends javax.swing.JFrame {

    private MenuUsuarios padre;
    private proyectobasesdatos.ProyectoBasesDatos pr;
    private String dni;



    public RegistroUsuarios(proyectobasesdatos.ProyectoBasesDatos pr, MenuUsuarios padre, String dni) {
        this.pr = pr;
        this.padre = padre;
        this.dni = dni;
        initComponents();
        aviso.setVisible(false);
        avisoContra.setVisible(false);
        avisoCorreo.setVisible(false);
        avisoRepetir.setVisible(false);
        avisoTel.setVisible(false);
        avisoDNI.setVisible(false);
        avisoFecha.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JLabel();
        MADA = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameapellidos = new javax.swing.JTextField();
        nacionalidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correoelectro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Registrarme = new javax.swing.JButton();
        Atrás = new javax.swing.JButton();
        Contraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        aviso = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        avisoDNI = new javax.swing.JLabel();
        avisoTel = new javax.swing.JLabel();
        avisoCorreo = new javax.swing.JLabel();
        avisoContra = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        avisoRepetir = new javax.swing.JLabel();
        repetirContra = new javax.swing.JPasswordField();
        avisoFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Registro.setText("Registro");

        MADA.setText("DNI");

        DNI.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Nombre");

        nameapellidos.setForeground(new java.awt.Color(204, 204, 204));

        nacionalidad.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Nacionalidad");

        jLabel3.setText("Correo");

        correoelectro.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("Teléfono");

        telefono.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("Fecha Nacimiento");

        Registrarme.setText("Registrarme");
        Registrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeActionPerformed(evt);
            }
        });

        Atrás.setText("Atrás");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });

        Contraseña.setText("Contraseña");

        aviso.setForeground(new java.awt.Color(255, 51, 51));
        aviso.setText("Todos los campos son obligatorios");

        avisoDNI.setForeground(new java.awt.Color(255, 51, 51));
        avisoDNI.setText("Formato Incorrecto");

        avisoTel.setForeground(new java.awt.Color(255, 51, 51));
        avisoTel.setText("Formato Incorrecto");

        avisoCorreo.setForeground(new java.awt.Color(255, 51, 51));
        avisoCorreo.setText("Formato Incorrecto");

        avisoContra.setForeground(new java.awt.Color(255, 51, 51));
        avisoContra.setText("Tamaño Max.  8 caracteres");

        jLabel8.setText("Repetir Contraseña");

        avisoRepetir.setForeground(new java.awt.Color(255, 51, 51));
        avisoRepetir.setText("Las contraseñas no coinciden");

        avisoFecha.setForeground(new java.awt.Color(255, 0, 51));
        avisoFecha.setText("Fecha Incorrecta, debe ser mayor de 3 años");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(Registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(MADA))
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Contraseña))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(repetirContra, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avisoRepetir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Registrarme)
                                .addGap(128, 128, 128)
                                .addComponent(Atrás))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avisoContra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(avisoDNI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(avisoFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameapellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacionalidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correoelectro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(avisoTel)
                                    .addComponent(avisoCorreo))))
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aviso)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MADA)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoDNI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoelectro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(avisoCorreo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(avisoTel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contraseña)
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avisoContra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(repetirContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(avisoRepetir))
                        .addGap(18, 18, 18)
                        .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Registrarme)
                            .addComponent(Atrás))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avisoFecha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        this.setVisible(false);
        padre.setVisible(true);

    }//GEN-LAST:event_AtrásActionPerformed

    private void RegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeActionPerformed
        int error = 0;
        aviso.setVisible(false);
        avisoContra.setVisible(false);
        avisoCorreo.setVisible(false);
        avisoRepetir.setVisible(false);
        avisoTel.setVisible(false);
        avisoDNI.setVisible(false);
        avisoFecha.setVisible(false);

        Date date = jDateChooser1.getDate();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 1);
        Date hoy = cal.getTime();
        cal.add(Calendar.YEAR, -3);
        Date tresAños = cal.getTime();
        if (!DNI.getText().isBlank() && !nameapellidos.getText().isBlank() && !nacionalidad.getText().isBlank() && !contraseña.getText().isBlank() && !telefono.getText().isBlank() && date != null && !repetirContra.getText().isBlank()) {
            if (DNI.getText().length() != 9) {
                avisoDNI.setVisible(true);
                error = 1;
            }
            if (telefono.getText().length() != 9) {
                avisoTel.setVisible(true);
                error = 1;
            }
            if (!correoelectro.getText().contains("@")) {
                avisoCorreo.setVisible(true);
                error = 1;
            }
            if (contraseña.getText().length() > 8) {
                avisoContra.setVisible(true);
                error = 1;
            }
            if (!repetirContra.getText().equals(contraseña.getText())) {
                avisoRepetir.setVisible(true);
                error = 1;
            }
            if (date.after(tresAños)) {
                avisoFecha.setVisible(true);
                error = 1;
            }
            if (error == 0) {
                try {
                    dni = DNI.getText();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    pr.getDaoUsuarios().registrarUsuario(dni, nameapellidos.getText(), nacionalidad.getText(), correoelectro.getText(), contraseña.getText(), telefono.getText(), sqlDate);
                    this.setVisible(false);
                    padre.setDni(dni);
                    padre.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        } else {
            aviso.setVisible(true);
        }


    }//GEN-LAST:event_RegistrarmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JTextField DNI;
    private javax.swing.JLabel MADA;
    private javax.swing.JButton Registrarme;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel avisoContra;
    private javax.swing.JLabel avisoCorreo;
    private javax.swing.JLabel avisoDNI;
    private javax.swing.JLabel avisoFecha;
    private javax.swing.JLabel avisoRepetir;
    private javax.swing.JLabel avisoTel;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correoelectro;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField nameapellidos;
    private javax.swing.JPasswordField repetirContra;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
