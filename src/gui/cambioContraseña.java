/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorUsuarios;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Usuario;

/**
 *
 * @author Alexandra
 */
public class cambioContraseña extends javax.swing.JFrame {

    interfazAdministrador interfazAdmin;
    ControladorUsuarios controladorUsuarios;
    private String login;
    
    /**
     * Creates new form cambioContraseña
     */
    public cambioContraseña(String l) {
       initComponents();
       login = l;
       controladorUsuarios = new ControladorUsuarios();
       interfazAdmin = new interfazAdministrador(controladorUsuarios.consultarUsuario(login));
       this.setLocationRelativeTo(null);
       this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anterior = new javax.swing.JPasswordField();
        nueva = new javax.swing.JPasswordField();
        confirmarNueva = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 65, 99, -1));

        nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaActionPerformed(evt);
            }
        });
        getContentPane().add(nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 103, 99, -1));
        getContentPane().add(confirmarNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 150, 99, -1));

        jLabel1.setText("Contraseña Anterior");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 68, -1, -1));

        jLabel2.setText("Contraseña Nueva");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 106, -1, -1));

        jLabel3.setText("Confirmación Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 153, -1, -1));

        jButton1.setText("Cambiar Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 188, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Cambiar Contraseña");

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/fondoCambioPass.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 31, 460, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Usuario u = new Usuario();

        u = controladorUsuarios.consultarUsuario(login);
        if (u.getTipo().equals("administrador") ) {
            interfazAdministrador ventanaAdministrador = new interfazAdministrador(u);
            ventanaAdministrador.setVisible(true);
        } else {
            if (u.getTipo().equals("gerente") ) {
                interfazGerente ventanaGerente = new interfazGerente(u);
                ventanaGerente.setVisible(true);
            }else {
                if (u.getTipo().equals("operario") ) {
                    interfazOperario ventanaOperario = new interfazOperario(u);
                    ventanaOperario.setVisible(true);
                }
            }
        }
        
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          if (validarDatos()) {
                Usuario u = new Usuario();
                u = controladorUsuarios.consultarUsuario(login);
                System.out.printf(u.getPassword());

              if(anterior.getText().equals(u.getPassword()))  {
                u.setPassword(nueva.getText());
                System.out.printf(u.getPassword());

                controladorUsuarios.modifiarPassUsuario(u);
                Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "La contraseña ha sido cambiada correctamente.", "", JOptionPane.INFORMATION_MESSAGE); 
                limpiar();
              }else{
                JOptionPane.showMessageDialog(this, "La contraseña anterior no es correcta", "", JOptionPane.ERROR_MESSAGE);
                limpiar();
              }
              
          }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField anterior;
    private javax.swing.JPasswordField confirmarNueva;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nueva;
    // End of variables declaration//GEN-END:variables

    private boolean validarDatos() {

        boolean rest = true;

        if (anterior.getText().equals("") || nueva.getText().equals("")|| 
            confirmarNueva.getText().equals("")) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios", "", JOptionPane.INFORMATION_MESSAGE, p); 
            rest = false;
            return rest;
        }
        
        if(!nueva.getText().equals(confirmarNueva.getText())){
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            nueva.setBackground(Color.RED);
            confirmarNueva.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Deben coincidir las contraseñas", "", JOptionPane.INFORMATION_MESSAGE, p); 
            nueva.setBackground(Color.WHITE);
            confirmarNueva.setBackground(Color.WHITE);
            rest = false;
            return rest;
            
        }
        return rest;
        
    }
    public void limpiar(){
        anterior.setText("");
        nueva.setText("");
        confirmarNueva.setText("");
    }
}
