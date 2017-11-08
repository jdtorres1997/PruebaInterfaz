/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorCliente;
import controlador.ControladorEventos;
import controlador.ControladorInscripcion;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Inscripcion;

/**
 *
 * @author Alexandra
 */
public class registrarPago extends javax.swing.JFrame {

    ControladorCliente controladorCliente;
    interfazOperario interfazOper;
    ControladorEventos controladorEvento;
    ControladorInscripcion controladorInscripcion;

    /**
     * Creates new form crearCliente
     */
    public registrarPago() {
        initComponents();
        controladorInscripcion = new ControladorInscripcion();
        controladorCliente = new ControladorCliente();

        controladorEvento = new ControladorEventos();
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
        CargarEventos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        eventoCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Evento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        CargarEventos.setText("Eventos");
        CargarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarEventosActionPerformed(evt);
            }
        });
        getContentPane().add(CargarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jButton1.setText("Registrar pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        getContentPane().add(eventoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificacion cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, -1));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Registrar Pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jButton2))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validar()) {
            Inscripcion in = new Inscripcion();
            in.setIdCliente(id_cliente.getText());
            in.setIdEvento(eventoCombo.getSelectedItem().toString());
            in.setPago("no");
            boolean seAgrego = controladorInscripcion.modificarInscripcion(in);
            if (seAgrego) {
                
                JOptionPane.showMessageDialog(this, "Se agrego el pago a la base de datos, ahora se encuentra inscrito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "Hubo un error al agregar el pago ", "", JOptionPane.INFORMATION_MESSAGE, p);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validar() {
        boolean rest = true;
        if (sololetras(id_cliente.getText()) || id_cliente.getText().equals("")) {
            rest = false;
            id_cliente.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Por favor verifique la identificación del cliente", "", JOptionPane.INFORMATION_MESSAGE);
            return rest;
        }

        if (!controladorCliente.existeCliente(id_cliente.getText())) {
            rest = false;
            JOptionPane.showMessageDialog(this, "El cliente no existe", "", JOptionPane.INFORMATION_MESSAGE);
            return rest;
        }
        if (!controladorInscripcion.existeInscripcion(id_cliente.getText(), eventoCombo.getSelectedItem().toString())) {
            rest = false;
            JOptionPane.showMessageDialog(this, "El cliente no se encuentra preinscrito a este evento", "", JOptionPane.INFORMATION_MESSAGE);
            return rest;
        }

        if (eventoCombo.getSelectedIndex() == -1) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));

            JOptionPane.showMessageDialog(this, " Debe buscar los eventos disponibles", "", JOptionPane.INFORMATION_MESSAGE, p);

            rest = false;
            return rest;
        }

        return rest;
    }

    public static boolean sololetras(String prueba) {
        boolean result = false;
        String comparacion = "!!#$%&/()=?¡*¨][_:;°¬|@·~½¬{[]}~─µ";
        for (int i = prueba.length() - 1; i >= 0; i--) {
            for (int j = comparacion.length() - 1; j >= 0; j--) {
                if (prueba.charAt(i) == comparacion.charAt(j)) {
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }

    public void limpiar() {

    }


    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        interfazOper = new interfazOperario();
        interfazOper.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CargarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarEventosActionPerformed
        eventoCombo.removeAllItems();
        ArrayList<String> ve = new ArrayList<String>();
        ve = controladorEvento.retornar();
        eventoCombo.addItem("");

        for (int i = 0; i < ve.size(); i++) {

            String item;
            item = ve.get(i);
            eventoCombo.addItem(item);
            item = "";
        }

    }//GEN-LAST:event_CargarEventosActionPerformed

    /**
     *
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
            java.util.logging.Logger.getLogger(registrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarEventos;
    private javax.swing.JComboBox<String> eventoCombo;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
