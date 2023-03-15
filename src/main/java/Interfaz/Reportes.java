package Interfaz;

import static Interfaz.Autenticación.Ma;
import static Interfaz.Cotización.listaEnvios;
import static Interfaz.Cotización.paqtotales;
import static Interfaz.Cotización.ventaregionm;
import static Interfaz.Cotización.ventaregionno;
import static Interfaz.Cotización.ventaregionnoc;
import static Interfaz.Cotización.ventaregionnt;
import static Interfaz.Cotización.ventaregionso;
import static Interfaz.Cotización.ventaregionsoc;
import static Interfaz.Regiones.listaRegiones;
import static Interfaz.Regiones.region1;
import static Interfaz.Regiones.region2;
import static Interfaz.Regiones.region3;
import static Interfaz.Regiones.region4;
import static Interfaz.Regiones.region5;
import static Interfaz.Regiones.region6;
import static Interfaz.Regiones.regionm;
import static Interfaz.Regiones.regionno;
import static Interfaz.Regiones.regionnoc;
import static Interfaz.Regiones.regionnt;
import static Interfaz.Regiones.regionso;
import static Interfaz.Regiones.regionsoc;
import static Interfaz.RegistroUsuario.listaUsuarios;
import java.util.Arrays;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public final class Reportes extends javax.swing.JFrame {

    public static MenúAdmin RegMa;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    Double sumaTotales = 0.0;
    int sumaVentasRealizadas = 0;


    public Reportes() {
        initComponents();
        for (int i = 0; i < listaEnvios.size(); i++) {
            sumaTotales += Double.parseDouble(listaEnvios.get(i).getTotalEnvio());
        }
        model.addColumn("Correo");
        model.addColumn("Nombre");
        model.addColumn("Ventas");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            sumaVentasRealizadas += listaUsuarios.get(i).getVenta();
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            model.addRow(new Object[]{listaUsuarios.get(i).getCorreo(), listaUsuarios.get(i).getNombre(), sumaVentasRealizadas});
        }
        listadeUsuariosV.setModel(model);
        model2.addColumn("Código");
        model2.addColumn("Región");
        model2.addColumn("Ventas");
        model2.addRow(new Object[]{regionm, region1, ventaregionm});
        model2.addRow(new Object[]{regionnt, region2, ventaregionnt});
        model2.addRow(new Object[]{regionno, region3, ventaregionno});
        model2.addRow(new Object[]{regionso, region4, ventaregionso});
        model2.addRow(new Object[]{regionsoc, region5, ventaregionsoc});
        model2.addRow(new Object[]{regionnoc, region6, ventaregionnoc});
        for (int i = 0; i < listaRegiones.size(); i++) {
            model2.addRow(new Object[]{listaRegiones.get(i).getAgcódigoRegión(), listaRegiones.get(i).getAgcódigoRegión(), sumaVentasRealizadas});
        }
        listadeRegionesV.setModel(model2);
        TableModel modelo = listadeRegionesV.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(modelo);
        listadeRegionesV.setRowSorter(sorter);
        int columnIndexToSort = 2;
        sorter.setSortKeys(Arrays.asList(new RowSorter.SortKey(columnIndexToSort,SortOrder.DESCENDING)));
        ventasTotales.setText(String.valueOf(sumaTotales));
        paqTotales.setText(String.valueOf(paqtotales));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadeUsuariosV = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadeRegionesV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        paqTotales = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ventasTotales = new javax.swing.JTextField();
        regresarmenuadmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listadeUsuariosV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listadeUsuariosV);

        listadeRegionesV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listadeRegionesV);

        jLabel1.setText("Usuarios con más compras realizadas");

        jLabel2.setText("Regiones con más ventas realizadas");

        jLabel3.setText("Paquetes enviados:");

        jLabel4.setText("Total ventas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ventasTotales, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(paqTotales, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addGap(288, 288, 288)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paqTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ventasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        regresarmenuadmin.setText("Regresar");
        regresarmenuadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarmenuadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarmenuadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(regresarmenuadmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarmenuadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarmenuadminActionPerformed
        this.setVisible(false);
        Ma = new MenúAdmin();
        Ma.setVisible(true);
        Ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_regresarmenuadminActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listadeRegionesV;
    private javax.swing.JTable listadeUsuariosV;
    private javax.swing.JTextField paqTotales;
    private javax.swing.JButton regresarmenuadmin;
    private javax.swing.JTextField ventasTotales;
    // End of variables declaration//GEN-END:variables
}
