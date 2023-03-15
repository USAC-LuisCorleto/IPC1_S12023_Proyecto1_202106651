package Interfaz;

import static Interfaz.Autenticación.Ma;
import Lógica.Región;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Regiones extends javax.swing.JFrame {

    public static String regionm = "M";
    public static String regionnt = "NT";
    public static String regionno = "NO";
    public static String regionso = "SO";
    public static String regionsoc = "SOC";
    public static String regionnoc = "NOC";
    public static String region1 = "Metropolitana";
    public static double region1est = 35.00;
    public static String region2 = "Norte";
    public static String region3 = "NorOriente";
    public static String region4 = "SurOriente";
    public static String region5 = "SurOccidente";
    public static String region6 = "NorOccidente";
    public static ArrayList<Región> listaRegiones = new ArrayList<>();

    public Regiones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboboxRegiones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regresarmenu = new javax.swing.JButton();
        regionmostrar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mostrarprecioest = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mostrarprecioesp = new javax.swing.JTextField();
        mostrarRegión = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        agregarRegión = new javax.swing.JButton();
        eliminarRegión = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        agregarcodRegión = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("REGIONES");

        comboboxRegiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "NT", "NO", "SO", "SOC", "NOC" }));
        comboboxRegiones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboboxRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxRegionesActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione alguna región");

        jLabel3.setText("Región:");

        regresarmenu.setText("Regresar");
        regresarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarmenuActionPerformed(evt);
            }
        });

        regionmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionmostrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio estándar:");

        mostrarprecioest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarprecioestActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio especial:");

        mostrarprecioesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarprecioespActionPerformed(evt);
            }
        });

        mostrarRegión.setText("Mostrar");
        mostrarRegión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRegiónActionPerformed(evt);
            }
        });

        jLabel7.setText("Q.");

        jLabel8.setText("Q.");

        agregarRegión.setText("Agregar");
        agregarRegión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRegiónActionPerformed(evt);
            }
        });

        eliminarRegión.setText("Eliminar");
        eliminarRegión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegiónActionPerformed(evt);
            }
        });

        jLabel6.setText("Código región:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(comboboxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(agregarcodRegión, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(regionmostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addComponent(mostrarprecioest, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mostrarprecioesp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regresarmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(eliminarRegión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarRegión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarRegión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regionmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarRegión))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarprecioest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(agregarRegión))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarprecioesp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(eliminarRegión))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarcodRegión, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarmenu))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxRegionesActionPerformed

    }//GEN-LAST:event_comboboxRegionesActionPerformed

    private void regionmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionmostrarActionPerformed


    }//GEN-LAST:event_regionmostrarActionPerformed

    private void mostrarRegiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRegiónActionPerformed
        String nombreregion = comboboxRegiones.getSelectedItem().toString();
        if (regionm.equals(nombreregion)) {
            regionmostrar.setText(region1);
            mostrarprecioest.setText("35.00");
            mostrarprecioesp.setText("25.00");
            agregarcodRegión.setText("M");
        } else if (regionnt.equals(nombreregion)) {
            regionmostrar.setText(region2);
            mostrarprecioest.setText("68.50");
            mostrarprecioesp.setText("45.55");
            agregarcodRegión.setText("NT");
        } else if (regionno.equals(nombreregion)) {
            regionmostrar.setText(region3);
            mostrarprecioest.setText("58.68");
            mostrarprecioesp.setText("35.48");
            agregarcodRegión.setText("NO");
        } else if (regionso.equals(nombreregion)) {
            regionmostrar.setText(region4);
            mostrarprecioest.setText("38.68");
            mostrarprecioesp.setText("32.48");
            agregarcodRegión.setText("SO");
        } else if (regionsoc.equals(nombreregion)) {
            regionmostrar.setText(region5);
            mostrarprecioest.setText("34.00");
            mostrarprecioesp.setText("29.00");
            agregarcodRegión.setText("SOC");
        } else if (regionnoc.equals(nombreregion)) {
            regionmostrar.setText(region6);
            mostrarprecioest.setText("44.50");
            mostrarprecioesp.setText("40.00");
            agregarcodRegión.setText("NOC");
        } else {
            for (int i = 0; i < listaRegiones.size(); i++) {
                if (listaRegiones.get(i).getAgcódigoRegión().equals(nombreregion)) {
                    regionmostrar.setText(listaRegiones.get(i).getAgnombreRegión());
                    mostrarprecioest.setText(listaRegiones.get(i).getAgprecioEstándar());
                    mostrarprecioesp.setText(listaRegiones.get(i).getAgPrecioEspecial());
                    agregarcodRegión.setText(listaRegiones.get(i).getAgcódigoRegión());
                }
            }
        }
    }//GEN-LAST:event_mostrarRegiónActionPerformed

    private void regresarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarmenuActionPerformed
        this.setVisible(false);
        if (Ma == null) {
            Ma = new MenúAdmin();
        }
        Ma.setVisible(true);
        Ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_regresarmenuActionPerformed

    private void mostrarprecioestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarprecioestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarprecioestActionPerformed

    private void mostrarprecioespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarprecioespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarprecioespActionPerformed

    private void eliminarRegiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegiónActionPerformed
        String regionAEliminar = comboboxRegiones.getSelectedItem().toString();
        for (Región region : listaRegiones) {
            if (region.getAgcódigoRegión().equals(regionAEliminar)) {
                listaRegiones.remove(region);
                break;
            }
        }
        comboboxRegiones.removeItemAt(comboboxRegiones.getSelectedIndex());
        JOptionPane.showMessageDialog(this, "Región Eliminada", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
        regionmostrar.setText("");
        mostrarprecioest.setText("");
        mostrarprecioesp.setText("");
        agregarcodRegión.setText("");
    }//GEN-LAST:event_eliminarRegiónActionPerformed

    private void agregarRegiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRegiónActionPerformed

        if (mostrarRegión.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (mostrarprecioest.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (mostrarprecioesp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        String codigoRegion = agregarcodRegión.getText();
        for (Región r : listaRegiones) {
            if (r.getAgcódigoRegión().equals(codigoRegion)) {
                JOptionPane.showMessageDialog(this, "El código de región ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                this.setVisible(true);
                return;
            }
        }
        Región reg = new Región(agregarcodRegión.getText(), regionmostrar.getText(), mostrarprecioest.getText(), mostrarprecioesp.getText());
        listaRegiones.add(reg);
        comboboxRegiones.addItem(codigoRegion);
        JOptionPane.showMessageDialog(this, "Región agregada correctamente", "Proceso exitoso", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        regionmostrar.setText("");
        mostrarprecioest.setText("");
        mostrarprecioesp.setText("");
        agregarcodRegión.setText("");
    }//GEN-LAST:event_agregarRegiónActionPerformed

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
            java.util.logging.Logger.getLogger(Regiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarRegión;
    private javax.swing.JTextField agregarcodRegión;
    public javax.swing.JComboBox<String> comboboxRegiones;
    private javax.swing.JButton eliminarRegión;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mostrarRegión;
    private javax.swing.JTextField mostrarprecioesp;
    private javax.swing.JTextField mostrarprecioest;
    private javax.swing.JTextField regionmostrar;
    private javax.swing.JButton regresarmenu;
    // End of variables declaration//GEN-END:variables
}