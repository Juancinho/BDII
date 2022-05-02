/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectobasesdatos.VisitanteResumen;

/**
 *
 * @author alumnogreibd
 */
public class RegalarEntradas extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuAdministradores padre;
    //private String dni;

    public RegalarEntradas(proyectobasesdatos.ProyectoBasesDatos pr, MenuAdministradores padre) {
        this.pr = pr;
        this.padre = padre;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IntroducirLimite = new javax.swing.JTextField();
        Regalar = new javax.swing.JButton();
        Info2 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regalar.setText("Regalar entradas");
        Regalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegalarActionPerformed(evt);
            }
        });

        Info2.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("C059", 2, 24)); // NOI18N
        Titulo.setText("Regalar Entradas");

        Info.setText("Introduzca el número de visitantes que más han gastado a los que quiere regalar una entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Info2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regalar)
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(Info)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(IntroducirLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info2)
                .addGap(46, 46, 46)
                .addComponent(IntroducirLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(Regalar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegalarActionPerformed

        ArrayList<VisitanteResumen> afortunados;
        afortunados = buscarMasGastadores(IntroducirLimite.getText());

                for (VisitanteResumen afortunado : afortunados) {
                    pr.getIrDAO().regalarEntrada(afortunado.getDNI()); //Envío el DNI para regalar
                }
                JOptionPane.showMessageDialog(rootPane, "Entradas regaladas con éxito a " + afortunados.size() + " persona/s (para su atracción favorita)");
                this.setVisible(false);
                padre.setVisible(true);
            
        
    }//GEN-LAST:event_RegalarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Info2;
    private javax.swing.JTextField IntroducirLimite;
    private javax.swing.JButton Regalar;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

    public ArrayList<VisitanteResumen> buscarMasGastadores(String limite) {

        ArrayList<VisitanteResumen> m;
        Integer limit = 10000; //Si el campo esta vacio, ponemos un limite alto

        if (!IntroducirLimite.getText().isBlank()) {
            if (isInteger(IntroducirLimite.getText())) {    //Si no se pudiera transformar a entero, muestra los 10000
                limit = Integer.parseInt(limite);
            }
        }
        m = pr.getVisitantesDAO().listarPersonasConMasGasto(limit);
        return m;
    }

//Función para saber si el dato introducido se puede pasar a Integer (código proveniente de stackoverflow)
    public boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
