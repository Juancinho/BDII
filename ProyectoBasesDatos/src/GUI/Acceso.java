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
    
   

    public Acceso(proyectobasesdatos.ProyectoBasesDatos pr, MenuUsuarios padre) {
        this.pr = pr;
        this.padreUsuarios = padre;
        padreAdministradores=null;
        initComponents();
        AccesoAdministradores.setVisible(false);
        etiquetaFallo.setVisible(false);
        cambiarContraseña.setVisible(false);
        cambiarContraseña.setEnabled(false);
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
    
    public MenuInicio getPadreAdministradores(){
        return padreAdministradores;
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
        cambiarContraseña = new javax.swing.JButton();
        Registrarme = new javax.swing.JButton();
        Atrás = new javax.swing.JButton();
        etiquetaFallo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccesoAdministradores.setText("Acceso Administradores");
        getContentPane().add(AccesoAdministradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        AccesoUsuarios.setText("Acceso Usuarios");
        getContentPane().add(AccesoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        DNI_Label.setText("DNI");
        getContentPane().add(DNI_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 91, -1, -1));

        DNI.setForeground(new java.awt.Color(204, 204, 204));
        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });
        getContentPane().add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 88, 247, -1));

        Contraseña_Label.setText("Contraseña");
        getContentPane().add(Contraseña_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 141, -1, -1));

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 232, -1, -1));

        cambiarContraseña.setText("CambiarContraseña");
        cambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        Registrarme.setText("Registrarme");
        Registrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeActionPerformed(evt);
            }
        });
        getContentPane().add(Registrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 232, -1, -1));

        Atrás.setText("Atrás");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });
        getContentPane().add(Atrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 232, -1, -1));

        etiquetaFallo.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaFallo.setText("Usuario o contraseña incorrectos");
        getContentPane().add(etiquetaFallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 138, 247, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

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

    private void cambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaActionPerformed
        CambiarContraseña cc= new CambiarContraseña(pr,this);
        this.setVisible(false);
        cc.setVisible(true);
    }//GEN-LAST:event_cambiarContraseñaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

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
    private javax.swing.JButton cambiarContraseña;
    private javax.swing.JLabel etiquetaFallo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
