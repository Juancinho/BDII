/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class Acceso extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private String dni;
    private MenuInicio padreAdministradores;
    private MenuUsuarios padreUsuarios;
    
    public Acceso() {
        initComponents();
        etiquetaFallo.setVisible(false);
    }

    public Acceso(proyectobasesdatos.ProyectoBasesDatos pr, MenuUsuarios padre) {
        this.pr = pr;
        this.padreUsuarios = padre;
        padreAdministradores=null;
        initComponents();
        AccesoAdministradores.setVisible(false);
        etiquetaFallo.setVisible(false);
    }
     
    public Acceso(proyectobasesdatos.ProyectoBasesDatos pr, MenuInicio padre) {
        this.pr = pr;
        this.padreAdministradores = padre;
        padreUsuarios=null;
        initComponents();
        AccesoUsuarios.setVisible(false);
        Registrarme.setVisible(false);
        Registrarme.setEnabled(false);
        etiquetaFallo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccesoAdministradores = new javax.swing.JLabel();
        AccesoUsuarios = new javax.swing.JLabel();
        DNI_Label = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        Contraseña_Label = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Registrarme = new javax.swing.JButton();
        Atrás = new javax.swing.JButton();
        etiquetaFallo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AccesoAdministradores.setText("Acceso Administradores");

        AccesoUsuarios.setText("Acceso Usuarios");

        DNI_Label.setText("DNI");

        DNI.setForeground(new java.awt.Color(204, 204, 204));
        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });

        Contraseña_Label.setText("Contraseña");

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

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

        etiquetaFallo.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaFallo.setText("Usuario o contraseña incorrectos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(AccesoUsuarios))
                            .addComponent(AccesoAdministradores)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(DNI_Label)
                        .addGap(40, 40, 40)
                        .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(etiquetaFallo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Contraseña_Label)
                        .addGap(20, 20, 20)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Entrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registrarme)
                .addGap(45, 45, 45)
                .addComponent(Atrás)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccesoUsuarios)
                    .addComponent(AccesoAdministradores))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(DNI_Label))
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Contraseña_Label))
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(etiquetaFallo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Atrás)
                        .addComponent(Registrarme)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        this.setVisible(false);
        if(padreUsuarios==null)
            padreAdministradores.setVisible(true);
        else
            padreUsuarios.setVisible(true);
    }//GEN-LAST:event_AtrásActionPerformed

    private void RegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeActionPerformed
        RegistroUsuarios mu = new RegistroUsuarios(pr, padreUsuarios, dni);
        this.setVisible(false);
        mu.setVisible(true);
    }//GEN-LAST:event_RegistrarmeActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        dni=DNI.getText();
        if(padreUsuarios!=null){
            if (pr.getDaoUsuarios().validarUsuario(dni, Contraseña.getText(), "Normal")) {
                this.setVisible(false);
                padreUsuarios.setDni(dni);
                padreUsuarios.setVisible(true);    
            }
            else etiquetaFallo.setVisible(true);
        }
        else{
            if (pr.getDaoUsuarios().validarUsuario(dni, Contraseña.getText(), "Administrador")) {
                MenuAdministradores ma = new MenuAdministradores(pr,padreAdministradores);
                this.setVisible(false);
                ma.setVisible(true);
            }
            else etiquetaFallo.setVisible(true);
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed

    }//GEN-LAST:event_DNIActionPerformed
    
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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccesoAdministradores;
    private javax.swing.JLabel AccesoUsuarios;
    private javax.swing.JButton Atrás;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Contraseña_Label;
    private javax.swing.JTextField DNI;
    private javax.swing.JLabel DNI_Label;
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Registrarme;
    private javax.swing.JLabel etiquetaFallo;
    // End of variables declaration//GEN-END:variables
}
