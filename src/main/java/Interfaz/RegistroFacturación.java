package Interfaz;

import static Interfaz.Autenticación.Mu;
import Lógica.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroFacturación extends javax.swing.JFrame {

    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    private int filaSeleccionadaClientes;

    public RegistroFacturación() {
        initComponents();
        model.addColumn("Nombre del cliente");
        model.addColumn("Dirección del cliente");
        model.addColumn("NIT");
        listadeClientes.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreClienteFac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direcciónClienteFac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nitClienteFac = new javax.swing.JTextField();
        agregarNombreFacturación = new javax.swing.JButton();
        eliminardatoFacturación = new javax.swing.JButton();
        editarDatoFacturación = new javax.swing.JButton();
        modificarDatoFacturación = new javax.swing.JButton();
        regresarMenúUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadeClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("DATOS DE FACTURACIÓN");

        jLabel2.setText("Nombre completo:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("NIT:");

        agregarNombreFacturación.setText("Agregar");
        agregarNombreFacturación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNombreFacturaciónActionPerformed(evt);
            }
        });

        eliminardatoFacturación.setText("Eliminar");
        eliminardatoFacturación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminardatoFacturaciónActionPerformed(evt);
            }
        });

        editarDatoFacturación.setText("Editar");
        editarDatoFacturación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDatoFacturaciónActionPerformed(evt);
            }
        });

        modificarDatoFacturación.setText("Modificar");
        modificarDatoFacturación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDatoFacturaciónActionPerformed(evt);
            }
        });

        regresarMenúUsuario.setText("Regresar");
        regresarMenúUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMenúUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombreClienteFac, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(direcciónClienteFac, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nitClienteFac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarNombreFacturación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminardatoFacturación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarDatoFacturación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarDatoFacturación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regresarMenúUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregarNombreFacturación))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(eliminardatoFacturación))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direcciónClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarDatoFacturación))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(modificarDatoFacturación))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nitClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarMenúUsuario))
                .addGap(89, 89, 89))
        );

        listadeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listadeClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMenúUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMenúUsuarioActionPerformed
        this.setVisible(false);
        if (Mu == null) {
            Mu = new MenúUsuario();
        }
        Mu.setVisible(true);
        Mu.setLocationRelativeTo(null);
    }//GEN-LAST:event_regresarMenúUsuarioActionPerformed

    private void agregarNombreFacturaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNombreFacturaciónActionPerformed
        if (nombreClienteFac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar su nombre completo", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (direcciónClienteFac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe agregar la dirección de envío", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (nitClienteFac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe agregar su NIT", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        Cliente clienteusuario = new Cliente(nombreClienteFac.getText(), direcciónClienteFac.getText(), nitClienteFac.getText());
        listaClientes.add(clienteusuario);
        model.addRow(new Object[]{nombreClienteFac.getText(), direcciónClienteFac.getText(), nitClienteFac.getText()});
        listadeClientes.setModel(model);
        JOptionPane.showMessageDialog(this, "Datos de facturación agregados correctamente", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        nombreClienteFac.setText("");
        direcciónClienteFac.setText("");
        nitClienteFac.setText("");
    }//GEN-LAST:event_agregarNombreFacturaciónActionPerformed

    private void editarDatoFacturaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDatoFacturaciónActionPerformed
        if (listadeClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            /*Si alguna fila fue seleccionada, procede a enviar los datos de la fila a los TextFields
            para poder editarlos.*/
            filaSeleccionadaClientes = listadeClientes.getSelectedRow();
            nombreClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 0).toString());
            direcciónClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 1).toString());
            nitClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_editarDatoFacturaciónActionPerformed

    private void modificarDatoFacturaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDatoFacturaciónActionPerformed
        Cliente clienteSeleccionado = listaClientes.get(filaSeleccionadaClientes);
        //Colocar los nuevos datos de facturación en la tabla y el ArrayList.
        clienteSeleccionado.setNombreCompletoCliente(nombreClienteFac.getText().trim());
        clienteSeleccionado.setDirecciónCliente(direcciónClienteFac.getText().trim());
        clienteSeleccionado.setNITCliente(nitClienteFac.getText().trim());
        //Actualizar los datos en la tabla.
        nombreClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 0).toString());
        direcciónClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 1).toString());
        nitClienteFac.setText(listadeClientes.getValueAt(listadeClientes.getSelectedRow(), 2).toString());
        JOptionPane.showMessageDialog(null, "Tarjeta modificada correctamente", "Proceso exitoso", JOptionPane.INFORMATION_MESSAGE);
        //Limpiando los TextFields.
        nombreClienteFac.setText("");
        direcciónClienteFac.setText("");
        nitClienteFac.setText("");
    }//GEN-LAST:event_modificarDatoFacturaciónActionPerformed

    private void eliminardatoFacturaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminardatoFacturaciónActionPerformed
       int selectedRow = listadeClientes.getSelectedRow();
        //Validando que la fila si haya sido seleccionado.
        if (selectedRow != -1) {
            //Obteniendo el objeto correspondiente al Arraylist dependiendo de la fila seleccionada.
            Cliente cl = listaClientes.get(selectedRow);

            //Método para eliminar la fila seleccionada.
            listaClientes.remove(cl);

            //Actualizando la tabla sin el objeto que se eliminó previamente.
            DefaultTableModel modelo = (DefaultTableModel) listadeClientes.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(null, "Dato de facturación eliminado", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
            //Vaciando de nuevo los TextFields.
            nombreClienteFac.setText("");
            direcciónClienteFac.setText("");
            nitClienteFac.setText("");
        } else { //Si no se seleccionó ninguna fila mostrará un JOptionPane con el error.
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminardatoFacturaciónActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFacturación().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarNombreFacturación;
    private javax.swing.JTextField direcciónClienteFac;
    private javax.swing.JButton editarDatoFacturación;
    private javax.swing.JButton eliminardatoFacturación;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listadeClientes;
    private javax.swing.JButton modificarDatoFacturación;
    private javax.swing.JTextField nitClienteFac;
    private javax.swing.JTextField nombreClienteFac;
    private javax.swing.JButton regresarMenúUsuario;
    // End of variables declaration//GEN-END:variables
}
