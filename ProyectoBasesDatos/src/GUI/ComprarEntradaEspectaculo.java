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
public class ComprarEntradaEspectaculo extends javax.swing.JFrame {
    
    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuComprasReservas padre;
    String dni;
    
    public ComprarEntradaEspectaculo(proyectobasesdatos.ProyectoBasesDatos pr, MenuComprasReservas padre, String dni) {
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
        String[] array = pr.getEspectaculosDAO().espectaculosActivos().toArray(new String[pr.getEspectaculosDAO().espectaculosActivos().size()]);  //MANOTE: hay que pasarle al toArray un array de la misma longitud para que no lo convierta en un array de Objects
        jComboBoxEspectaculos = new javax.swing.JComboBox<>();
        Espectaculo = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        MensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Titulo.setText("Comprar Entrada para Espectáculo");

        jComboBoxEspectaculos.setModel(new javax.swing.DefaultComboBoxModel<>(array));

        Espectaculo.setText("Espectáculo");

        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("Fecha");

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        MensajeError.setForeground(new java.awt.Color(255, 0, 0));
        MensajeError.setText("Debe cubrir todos los campos para poder comprar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Espectaculo)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEspectaculos, 0, 190, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Comprar))
                            .addComponent(MensajeError))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Titulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espectaculo))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(MensajeError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar)
                    .addComponent(Atras))
                .addGap(32, 32, 32))
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
        Object o = jComboBoxEspectaculos.getSelectedItem();
        if (o == null || date == null) {
            MensajeError.setVisible(true);
        } else {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 1);
            Date hoy = cal.getTime();
            cal.add(Calendar.YEAR, 1);
            Date dentroDeUnAnho = cal.getTime();  //MANOTE: Se ha logrado tener la fecha del inicio del día de hoy (no se puede comprar antes de ese instante porque ya ha pasado) y la del año que viene
            if (date.after(dentroDeUnAnho) || date.before(hoy)) {
                JOptionPane.showMessageDialog(rootPane, "Fecha inválida \n Antelación máxima para la compra de un año");
            } else {
                String espectaculo;
                espectaculo = o.toString();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                pr.getAsistirDAO().comprarEntrada(sqlDate, dni, espectaculo);
                MensajeError.setVisible(false);

                JOptionPane.showMessageDialog(rootPane, "Compra realizada");
                this.setVisible(false);
                padre.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_ComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel Espectaculo;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> jComboBoxEspectaculos;
    private com.toedter.calendar.JDateChooser jDateChooser;
    // End of variables declaration//GEN-END:variables
}
