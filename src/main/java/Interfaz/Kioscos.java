package Interfaz;

import static Interfaz.Autenticación.Ma;
import static Interfaz.Regiones.listaRegiones;
import Lógica.Kiosco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kioscos extends javax.swing.JFrame {

    public static MenúAdmin RegMa;
    //Array dinámico de tipo "Objeto Kiosco"
    public static ArrayList<Kiosco> listaKioscos = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    boolean mostrarDialogo = false;
    boolean regionValida = false;
    private int filaSeleccionada;
    public static String codRegiónLista;

    public Kioscos() {
        initComponents();
        model.addColumn("Código Kiosco");
        model.addColumn("Nombre Kiosco");
        model.addColumn("Código Región");
        listadeKioscos.setModel(model);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codKiosco = new javax.swing.JTextField();
        NombreKiosco = new javax.swing.JTextField();
        codRegión = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regresarkioscos = new javax.swing.JButton();
        agregarKiosco = new javax.swing.JButton();
        eliminarKiosco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadeKioscos = new javax.swing.JTable();
        modificarKiosco = new javax.swing.JButton();
        editarKiosco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kioscos");

        jLabel1.setText("Código del Kiosco:");

        jLabel2.setText("Nombre del Kiosco:");

        jLabel3.setText("Código de la región:");

        codKiosco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codKioscoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel4.setText("KIOSCOS");

        jLabel5.setText("Llene la información correspondiente");

        regresarkioscos.setText("Regresar");
        regresarkioscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarkioscosActionPerformed(evt);
            }
        });

        agregarKiosco.setText("Agregar");
        agregarKiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarKioscoActionPerformed(evt);
            }
        });

        eliminarKiosco.setText("Eliminar");
        eliminarKiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarKioscoActionPerformed(evt);
            }
        });

        listadeKioscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listadeKioscos);

        modificarKiosco.setText("Modificar");
        modificarKiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarKioscoActionPerformed(evt);
            }
        });

        editarKiosco.setText("Editar");
        editarKiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarKioscoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(NombreKiosco)
                            .addComponent(codRegión)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regresarkioscos, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(agregarKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel5)))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codKiosco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreKiosco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codRegión, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(agregarKiosco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarKiosco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarKiosco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarKiosco)
                        .addGap(12, 12, 12)
                        .addComponent(regresarkioscos)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarkioscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarkioscosActionPerformed
        this.setVisible(false);
        if (Ma == null) {
            Ma = new MenúAdmin();
        }
        Ma.setVisible(true);
        Ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_regresarkioscosActionPerformed

    private void agregarKioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarKioscoActionPerformed
        /*Verificaciones para los TextFields, el código solo va en mayúsculas
        y debe llevar por lo menos un número para un mejor control de los códigos.
        Las Regiones únicamente pueden ser las quemadas o las ya agregadas, de lo contrrario
        mostrará un JOptionPane con el error de que la región no fue encontrada.
        Los TextFields no pueden estar vacíos.*/
        boolean encontrado = false;
        for (int i = 0; i < listaRegiones.size(); i++) {
            if (codRegión.getText().equals(listaRegiones.get(i).getAgcódigoRegión())) {
                encontrado = true;
                break;
            }
        }
        if (codRegión.getText().equals(Regiones.regionm) || codRegión.getText().equals(Regiones.regionnt) || codRegión.getText().equals(Regiones.regionno) || codRegión.getText().equals(Regiones.regionso) || codRegión.getText().equals(Regiones.regionsoc) || codRegión.getText().equals(Regiones.regionnoc)) {
            encontrado = true;
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Esta región no se encuentra disponible", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (NombreKiosco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del Kiosco", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (codKiosco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el código del Kiosco", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (codRegión.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el código de la región", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (!codKiosco.getText().matches(".*[0-9].*") || !codKiosco.getText().matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(this, "El código debe tener al menos un número y solo letras mayúsculas", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }

        //Llenado del objeto
        Kiosco kioscos = new Kiosco(codKiosco.getText(), NombreKiosco.getText(), codRegión.getText());
        //Agregándolo al ArrayList.
        listaKioscos.add(kioscos);
        //Agregándolo a la tabla listadeKioscos.
        model.addRow(new Object[]{codKiosco.getText(), NombreKiosco.getText(), codRegión.getText()});
        listadeKioscos.setModel(model);
        JOptionPane.showMessageDialog(this, "Kiosco agregado correctamente", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        //Vaciando los TextFields.
        codKiosco.setText("");
        NombreKiosco.setText("");
        codRegión.setText("");
    }//GEN-LAST:event_agregarKioscoActionPerformed

    private void codKioscoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKioscoKeyTyped
        //Limitando los caracteres del TextField a 4.
        if (codKiosco.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_codKioscoKeyTyped

    private void eliminarKioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarKioscoActionPerformed
        //Obteniendo la fila seleccionada.
        int selectedRow = listadeKioscos.getSelectedRow();
        //Validando que la fila si haya sido seleccionado.
        if (selectedRow != -1) {
            //Obteniendo el objeto correspondiente al Arraylist dependiendo de la fila seleccionada.
            Kiosco kiosco = listaKioscos.get(selectedRow);

            //Método para eliminar la fila seleccionada.
            listaKioscos.remove(kiosco);

            //Actualizando la tabla sin el objeto que se eliminó previamente.
            DefaultTableModel modelo = (DefaultTableModel) listadeKioscos.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(null, "Kiosco eliminado correctamente", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
            //Vaciando de nuevo los TextFields.
            codKiosco.setText("");
            NombreKiosco.setText("");
            codRegión.setText("");
        } else { //Si no se seleccionó ninguna fila mostrará un JOptionPane con el error.
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarKioscoActionPerformed

    private void modificarKioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarKioscoActionPerformed
        //Condiciones para las validaciones anteriores.
        if (!codRegión.getText().equals("M") && !codRegión.getText().equals("NT") && !codRegión.getText().equals("NO") && !codRegión.getText().equals("SO") && !codRegión.getText().equals("SOC") && !codRegión.getText().equals("NOC")) {
            JOptionPane.showMessageDialog(this, "Esta región no se encuentra disponible", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (NombreKiosco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del Kiosco", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (codKiosco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el código del Kiosco", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (codRegión.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el código de la región", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (!codKiosco.getText().matches(".*[0-9].*") || !codKiosco.getText().matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(this, "El código debe tener al menos un número y solo letras mayúsculas", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        Kiosco kioscoSeleccionado = listaKioscos.get(filaSeleccionada);
        //Colocar el nuevo Kiosco modificado en la tabla y en el ArrayList.
        kioscoSeleccionado.setCódigoKiosco(codKiosco.getText().trim());
        kioscoSeleccionado.setNombreKioscos(NombreKiosco.getText().trim());
        kioscoSeleccionado.setCódigoRegión(codRegión.getText().trim());
        //Actualizar los datos en la tabla.
        listadeKioscos.setValueAt(codKiosco.getText().trim(), filaSeleccionada, 0);
        listadeKioscos.setValueAt(NombreKiosco.getText().trim(), filaSeleccionada, 1);
        listadeKioscos.setValueAt(codRegión.getText().trim(), filaSeleccionada, 2);
        JOptionPane.showMessageDialog(null, "Kiosco modificado correctamente", "Proceso exitoso", JOptionPane.INFORMATION_MESSAGE);
        //Limpiando los TextFields.
        codKiosco.setText("");
        NombreKiosco.setText("");
        codRegión.setText("");
    }//GEN-LAST:event_modificarKioscoActionPerformed

    private void editarKioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarKioscoActionPerformed
        //Verificando si alguna fila no fue seleccionada.
        if (listadeKioscos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            /*Si alguna fila fue seleccionada, procede a enviar los datos de la fila a los TextFields
            para poder editarlos.*/
            filaSeleccionada = listadeKioscos.getSelectedRow();
            codKiosco.setText(listadeKioscos.getValueAt(listadeKioscos.getSelectedRow(), 0).toString());
            NombreKiosco.setText(listadeKioscos.getValueAt(listadeKioscos.getSelectedRow(), 1).toString());
            codRegión.setText(listadeKioscos.getValueAt(listadeKioscos.getSelectedRow(), 2).toString());
        }

    }//GEN-LAST:event_editarKioscoActionPerformed

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
            java.util.logging.Logger.getLogger(Kioscos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kioscos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kioscos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kioscos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kioscos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreKiosco;
    private javax.swing.JButton agregarKiosco;
    private javax.swing.JTextField codKiosco;
    private javax.swing.JTextField codRegión;
    private javax.swing.JButton editarKiosco;
    private javax.swing.JButton eliminarKiosco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listadeKioscos;
    private javax.swing.JButton modificarKiosco;
    private javax.swing.JButton regresarkioscos;
    // End of variables declaration//GEN-END:variables
}
