/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alumnogreibd
 */
public class MenuEmpleados extends javax.swing.JFrame {

    private proyectobasesdatos.ProyectoBasesDatos pr;
    private MenuAdministradores padre;

    public MenuEmpleados() {
        initComponents();
    }

    public MenuEmpleados(proyectobasesdatos.ProyectoBasesDatos pr,MenuAdministradores padre) {
        initComponents();
        this.padre=padre;
        this.pr=pr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contratar = new javax.swing.JButton();
        despedir = new javax.swing.JButton();
        trabAtra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        trabEsp = new javax.swing.JButton();
        hosteleros = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contratar.setText("Contratar");
        contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarActionPerformed(evt);
            }
        });

        despedir.setText("Despedir");
        despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirActionPerformed(evt);
            }
        });

        trabAtra.setText("Trabajadores Atracciones");
        trabAtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabAtraActionPerformed(evt);
            }
        });

        jLabel1.setText("Listados:");

        trabEsp.setText("Trabajadores Espectáculos");
        trabEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabEspActionPerformed(evt);
            }
        });

        hosteleros.setText("Hosteleros");
        hosteleros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelerosActionPerformed(evt);
            }
        });

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel2.setText("Administración:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hosteleros)
                .addGap(74, 74, 74)
                .addComponent(atras)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(despedir))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(contratar)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trabEsp)
                            .addComponent(trabAtra, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(contratar)
                .addGap(18, 18, 18)
                .addComponent(despedir)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabAtra)
                .addGap(18, 18, 18)
                .addComponent(trabEsp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hosteleros)
                    .addComponent(atras))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarActionPerformed
        this.setVisible(false);
        AnhadirEmpleados e = new AnhadirEmpleados(pr, this);
        e.setVisible(true);
    }//GEN-LAST:event_contratarActionPerformed

    private void despedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirActionPerformed
        this.setVisible(false);
        DespedirEmpleados de = new DespedirEmpleados(pr, this);
        de.setVisible(true);
    }//GEN-LAST:event_despedirActionPerformed

    private void trabAtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabAtraActionPerformed
        TablaTrabajAtracc ta = new TablaTrabajAtracc(pr,this);
        this.setVisible(false);
        ta.setVisible(true);
    }//GEN-LAST:event_trabAtraActionPerformed

    private void trabEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabEspActionPerformed
        TablaTrabajEspec ta = new TablaTrabajEspec(pr,this);
        this.setVisible(false);
        ta.setVisible(true);    }//GEN-LAST:event_trabEspActionPerformed

    private void hostelerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelerosActionPerformed
        TablaHosteleros ta = new TablaHosteleros(pr,this);
        this.setVisible(false);
        ta.setVisible(true);
    }//GEN-LAST:event_hostelerosActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton contratar;
    private javax.swing.JButton despedir;
    private javax.swing.JButton hosteleros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton trabAtra;
    private javax.swing.JButton trabEsp;
    // End of variables declaration//GEN-END:variables
}
