/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnogreibd
 */
public class ComprarEntradasAtracciones extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuComprasReservas padre;
    String dni;

    public ComprarEntradasAtracciones(proyectobasesdatos.ProyectoBasesDatos pr, MenuComprasReservas padre, String dni) {
        this.pr = pr;
        this.padre = padre;
        this.dni = dni;

        initComponents();
    }

    public ComprarEntradasAtracciones() {
        initComponents();
    }
    //String[] array = pr.getAtraccionesDAO().atraccionesActivas().toArray(new String[pr.getAtraccionesDAO().atraccionesActivas().size()]);  //MANOTE: hay que pasarle al toArray un array de la misma longitud para que no lo convierta en un array de Objects

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        String[] array = pr.getAtraccionesDAO().atraccionesActivas().toArray(new String[pr.getAtraccionesDAO().atraccionesActivas().size()]);  //MANOTE: hay que pasarle al toArray un array de la misma longitud para que no lo convierta en un array de Objects
        jComboBoxAtracciones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VipSi = new javax.swing.JRadioButton();
        VipNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        MensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jComboBoxAtracciones.setModel(new javax.swing.DefaultComboBoxModel<>(array));

        jLabel1.setText("Atracción");

        jLabel2.setText("VIP");

        buttonGroup.add(VipSi);
        VipSi.setText("Sí");

        buttonGroup.add(VipNo);
        VipNo.setText("No");

        jLabel3.setText("Fecha");

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jLabel4.setText("Comprar entrada para atracción");

        MensajeError.setVisible(false);
        MensajeError.setForeground(new java.awt.Color(255, 0, 51));
        MensajeError.setText("Debe cubrir todos los campos para poder comprar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Comprar)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxAtracciones, 0, 178, Short.MAX_VALUE)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VipSi)
                        .addGap(70, 70, 70)
                        .addComponent(VipNo)
                        .addGap(132, 132, 132))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(MensajeError)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VipSi)
                    .addComponent(VipNo))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(MensajeError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(Comprar))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);

    }//GEN-LAST:event_AtrasActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed

        Date date;
        date = jDateChooser.getDate();
        Object o = jComboBoxAtracciones.getSelectedItem();

        if (o == null || (!VipSi.isSelected() && !VipNo.isSelected()) || date == null) {
            MensajeError.setVisible(true);
        } else {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 1);
            Date hoy = cal.getTime();
            cal.add(Calendar.YEAR, 1);
            Date dentroDeUnAnho = cal.getTime();  //MANOTE: Se ha logrado tener la fecha del fin del día de hoy (no se puede comprar si ha pasado el día) y la del año que viene
            if (date.after(dentroDeUnAnho) || date.before(hoy)) {
                JOptionPane.showMessageDialog(rootPane, "Fecha inválida \n Antelación máxima para la compra de un año");
            } else {
                String vip, fecha, atraccion;
                atraccion = o.toString();

                if (VipSi.isSelected()) {
                    vip = "SI";
                } else {
                    vip = "NO";
                }
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                pr.getIrDAO().comprarEntrada(sqlDate, vip, dni, atraccion);
                MensajeError.setVisible(false);

                JOptionPane.showMessageDialog(rootPane, "Compra realizada");
                this.setVisible(false);
                padre.setVisible(true);

            }
        }
    }//GEN-LAST:event_ComprarActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarEntradasAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradasAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradasAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradasAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarEntradasAtracciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JRadioButton VipNo;
    private javax.swing.JRadioButton VipSi;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> jComboBoxAtracciones;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
