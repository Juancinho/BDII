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
public class CancelarEntradaEspectaculo extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuCancelaciones padre;
    String dni;
    
    public CancelarEntradaEspectaculo(proyectobasesdatos.ProyectoBasesDatos pr, MenuCancelaciones padre, String dni) {
        this.pr = pr;
        this.padre = padre;
        this.dni = dni;
        initComponents();
        MensajeError.setVisible(false);
    }
    
    public CancelarEntradaEspectaculo() {
        initComponents();
        MensajeError.setVisible(false);
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
        String[] array = pr.getEspectaculosDAO().espectaculosActivos().toArray(new String[pr.getEspectaculosDAO().espectaculosActivos().size()]);  //MANOTE: hay que pasarle al toArray un array de la misma longitud para que no lo convierta en un array de Objects
        jComboBoxEspectaculos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CancelarEntrada = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        MensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cancelar Entrada Espectáculo");

        jComboBoxEspectaculos.setModel(new javax.swing.DefaultComboBoxModel<>(array));

        jLabel2.setText("Espectáculo");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CancelarEntrada.setText("Cancelar");
        CancelarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarEntradaActionPerformed(evt);
            }
        });

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        MensajeError.setForeground(new java.awt.Color(255, 0, 0));
        MensajeError.setText("Debe cubrir todos los campos para poder cancelar la compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(CancelarEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atras)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEspectaculos, 0, 212, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MensajeError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(MensajeError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarEntrada)
                    .addComponent(Atras))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void CancelarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarEntradaActionPerformed
        // TODO add your handling code here:
        Date date;
        date = jDateChooser.getDate();
        Object o = jComboBoxEspectaculos.getSelectedItem();
        if (o == null || date == null) {
            MensajeError.setVisible(true);
        } else {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 1);  //MANOTE: No se puede cancelar la compra el mismo día del evento (por cuestiones de administarción del parque)
            Date hoy = cal.getTime();
            if (date.before(hoy)) {
                MensajeError.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Fecha anterior a la actual \n No se puede cancelar la compra");
            } else {
                String espectaculo;
                espectaculo = o.toString();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                if (!pr.getAsistirDAO().hayEntradaComprada(sqlDate, dni, espectaculo)) {
                    MensajeError.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "La entrada indicada no fue adquirida por el usuario actual \n No se puede cancelar la compra");
                } else {
                    pr.getAsistirDAO().cancelarCompra(sqlDate, dni, espectaculo);
                    MensajeError.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Cancelación realizada");
                    this.setVisible(false);
                    padre.setVisible(true);
                }
            }
        }
        
    }//GEN-LAST:event_CancelarEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(CancelarEntradaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelarEntradaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelarEntradaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelarEntradaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelarEntradaEspectaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton CancelarEntrada;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JComboBox<String> jComboBoxEspectaculos;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
