/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorUsuarios;
import javax.swing.JOptionPane;
import logica.Usuario;

/**
 *
 * @author Alexandra
 */
public class interfazModificarUsuarios extends javax.swing.JFrame {
    ControladorUsuarios controladorUsuarios;

    /**
     * Creates new form crearUsuarios
     */
    public interfazModificarUsuarios() {
        initComponents();
        controladorUsuarios = new ControladorUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        radioUsuarios = new javax.swing.ButtonGroup();
        radioEstados = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        radioGerente = new javax.swing.JRadioButton();
        radioOperario = new javax.swing.JRadioButton();
        radioActivo = new javax.swing.JRadioButton();
        radioInactivo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Tipo de usuario:");

        jLabel5.setText("Nombres completos:");

        jLabel6.setText("Apellidos completos:");

        jLabel8.setText("Telefono:");

        jLabel10.setText("Estado:");

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        radioUsuarios.add(radioGerente);
        radioGerente.setText("Gerente");

        radioUsuarios.add(radioOperario);
        radioOperario.setText("Operario");
        radioOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOperarioActionPerformed(evt);
            }
        });

        radioEstados.add(radioActivo);
        radioActivo.setText("Activo");

        radioEstados.add(radioInactivo);
        radioInactivo.setText("Inactivo");
        radioInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInactivoActionPerformed(evt);
            }
        });

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(84, 84, 84)
                        .addComponent(radioActivo)
                        .addGap(10, 10, 10)
                        .addComponent(radioInactivo)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGerente)
                                .addGap(18, 18, 18)
                                .addComponent(radioOperario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(radioGerente)
                    .addComponent(radioOperario))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioInactivo)
                        .addComponent(radioActivo)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void radioOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOperarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOperarioActionPerformed

    private void radioInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInactivoActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Usuario u = new Usuario();
       
       // Validamos los datos
       validarDatos();
       
       u.setLogin(nombreUsuario.getText());
       if(radioGerente.isSelected())
            u.setTipo("gerente");
       else if (radioOperario.isSelected())
           u.setTipo("operario");
       u.setNombre(nombres.getText());
       u.setApellido(apellidos.getText());
       u.setTelefono( Long.parseLong(telefono.getText()));
       if(radioActivo.isSelected())
            u.setEstado("activo");
       else if (radioInactivo.isSelected())
           u.setEstado("inactivo");
       
       boolean seModifico = controladorUsuarios.modificarUsuario(u);
       
       if(seModifico){
           JOptionPane.showMessageDialog(this, "Se modifico  la base de datos");
       }else{
           JOptionPane.showMessageDialog(this, "Hubo un error al modificar");
       }
       
       //limpiardatos();

    }//GEN-LAST:event_jButton1ActionPerformed
 private void validarDatos() {
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String nombre = nombreUsuario.getText();
   

        Usuario u = new Usuario();

        u = controladorUsuarios.consultarUsuario(nombre);
        nombres.setText(u.getNombre());
        apellidos.setText(u.getApellido());
        telefono.setText(Long.toString(u.getTelefono()));
        if(u.getEstado().equals("activo"))
            radioActivo.setSelected(true);
        else if(u.getEstado().equals("inactivo"))
            radioInactivo.setSelected(true);
         if (u.getTipo().equals("gerente"))
             radioGerente.setSelected(true);
         else if(u.getTipo().equals("operario"))
             radioOperario.setSelected(true);
         
            


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazModificarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField nombres;
    private javax.swing.JRadioButton radioActivo;
    private javax.swing.ButtonGroup radioEstados;
    private javax.swing.JRadioButton radioGerente;
    private javax.swing.JRadioButton radioInactivo;
    private javax.swing.JRadioButton radioOperario;
    private javax.swing.ButtonGroup radioUsuarios;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

   
}
