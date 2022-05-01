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
public class CancelarEntradaAtraccion extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuCancelaciones padre;
    String dni;

    public CancelarEntradaAtraccion(proyectobasesdatos.ProyectoBasesDatos pr, MenuCancelaciones padre, String dni) {
        this.pr = pr;
        this.padre = padre;
        this.dni = dni;
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

        Titulo = new javax.swing.JLabel();
        jComboBoxAtracciones = new javax.swing.JComboBox<>();
        Atraccion = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        CancelarCompra = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        MensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Titulo.setText("Cancelar Entrada Atracción");

        String[] array = pr.getAtraccionesDAO().atraccionesActivas().toArray(new String[pr.getAtraccionesDAO().atraccionesActivas().size()]);  //MANOTE: hay que pasarle al toArray un array de la misma longitud para que no lo convierta en un array de Objects
        jComboBoxAtracciones.setModel(new javax.swing.DefaultComboBoxModel<>(array));

        Atraccion.setText("Atracción");

        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("Fecha");
        Fecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CancelarCompra.setText("Cancelar compra");
        CancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCompraActionPerformed(evt);
            }
        });

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        MensajeError.setForeground(new java.awt.Color(255, 51, 51));
        MensajeError.setText("Debe cubrir todos los campos para poder cancelar una compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Atraccion))
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxAtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(MensajeError)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarCompra)
                        .addGap(37, 37, 37)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atraccion))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(MensajeError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarCompra)
                    .addComponent(atras))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void CancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCompraActionPerformed
        Date date;
        date = jDateChooser.getDate();
        Object o = jComboBoxAtracciones.getSelectedItem();
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
                String atraccion;
                atraccion = o.toString();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                if (!pr.getIrDAO().hayEntradaComprada(sqlDate, dni, atraccion)) {
                    MensajeError.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "La entrada indicada no fue adquirida por el usuario actual \n No se puede cancelar la compra");
                } else {
                    pr.getIrDAO().cancelarCompra(sqlDate, dni, atraccion);
                    MensajeError.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Cancelación realizada");
                    this.setVisible(false);
                    padre.setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_CancelarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atraccion;
    private javax.swing.JButton CancelarCompra;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox<String> jComboBoxAtracciones;
    private com.toedter.calendar.JDateChooser jDateChooser;
    // End of variables declaration//GEN-END:variables
}
