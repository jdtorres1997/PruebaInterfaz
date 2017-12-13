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
public class CambioPassAdmin extends javax.swing.JFrame {
    ControladorUsuarios controladorUsuarios;
    Usuario usuarioActual;
    /**
     * Creates new form CambioPassAdmin
     */
    public CambioPassAdmin(Usuario u) {
        controladorUsuarios = new ControladorUsuarios();
        usuarioActual = u;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bloquear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        passNuevaUno = new javax.swing.JPasswordField();
        passNuevaDos = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Cambiar Contraseña");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cambiar Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 178, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Contraseña Nueva:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Repita la Contraseña Nueva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Login Usuario a Cambiar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        getContentPane().add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 59, 156, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 85, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 85, -1, -1));
        getContentPane().add(passNuevaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 114, 156, -1));
        getContentPane().add(passNuevaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 140, 156, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/key.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/key (2).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/pin-code (2).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/key (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 60, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/large (1).jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean existeUsuario = controladorUsuarios.existeUsuario(loginText.getText());
        if(existeUsuario){
            if(loginText.getText().equals("admin")){
                JOptionPane.showMessageDialog(this, "No puedes cambiar aqui la contraseña del administrador", "", JOptionPane.ERROR_MESSAGE);
            }else{
                desbloquear();
            }
        }else{
            JOptionPane.showMessageDialog(this, "El usuario que esta buscando no existe", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        bloquear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(passNuevaUno.getText().equals(passNuevaDos.getText())){
            Usuario u = new Usuario();
            u = controladorUsuarios.consultarUsuario(loginText.getText());
            u.setPassword(passNuevaUno.getText());
            boolean exito = controladorUsuarios.modifiarPassUsuario(u);    
            if(exito){
                JOptionPane.showMessageDialog(this, "Se cambio la contraseña exitosamente", "", JOptionPane.INFORMATION_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un error en la Base de Datos, comuniquese con los desarrolladores", "", JOptionPane.ERROR_MESSAGE); 
            }
            bloquear();
        }else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        interfazAdministrador ventana = new interfazAdministrador(usuarioActual);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    void bloquear(){
        loginText.setEditable(true);
        loginText.setEnabled(true);
        loginText.setText("");
        passNuevaUno.setText("");
        passNuevaDos.setText("");
        passNuevaUno.setEditable(false);
        passNuevaUno.setEnabled(false);
        passNuevaDos.setEditable(false);
        passNuevaDos.setEnabled(false);
        jButton1.setEnabled(false);
    }
    
    void desbloquear(){
        loginText.setEditable(false);
        loginText.setEnabled(false);
        passNuevaUno.setText("");
        passNuevaDos.setText("");
        passNuevaUno.setEditable(true);
        passNuevaUno.setEnabled(true);
        passNuevaDos.setEditable(true);
        passNuevaDos.setEnabled(true);
        jButton1.setEnabled(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginText;
    private javax.swing.JPasswordField passNuevaDos;
    private javax.swing.JPasswordField passNuevaUno;
    // End of variables declaration//GEN-END:variables
}
