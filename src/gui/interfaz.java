package gui;

import controlador.ControladorUsuarios;
import datechooser.controller.EventHandler;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdtorres
 */

public class interfaz extends javax.swing.JFrame {

    interfazAdministrador ventanaAdministrador;
    interfazGerente ventanaGerente;
    interfazOperario ventanaOperario;

    ControladorUsuarios controladorUsuarios;

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
                this.setLocationRelativeTo(null);

        
       ImageIcon Imagen = new ImageIcon("/gui/images/InterfazFondo.png");

        controladorUsuarios = new ControladorUsuarios();
        this.setLocationRelativeTo(null);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/if_key_172487.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/if_user_115781.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 20));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, 30));

        login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 150, 30));
        login.getAccessibleContext().setAccessibleName("nombreTexto");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/A+.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, 171));

        botonEntrar.setBackground(new java.awt.Color(255, 51, 102));
        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 120, 30));
        botonEntrar.getAccessibleContext().setAccessibleName("botonEntrar");
        botonEntrar.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/fondoFinal.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 470, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        //boton que indica el login
        entrar();
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrar();
        }
    }//GEN-LAST:event_passwordKeyPressed


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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

    private void entrar() {
        
        String nombre = login.getText();
        String contraseña = new String(password.getText());
      

        Usuario u = new Usuario();

        u = controladorUsuarios.consultarUsuario(nombre);

        String usuarioCorrecto = u.getLogin();
        String contraseñaCorrecta = u.getPassword();

        if (nombre.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) { //Valida que el usuario y contraseña sean correctos.
        if (u.getEstado().equals("activo")) { //valida que el usuario ingresado se encuentra activo.
            if (u.getTipo().equals("administrador") ) {

                ventanaAdministrador = new interfazAdministrador(u);
                ventanaAdministrador.setVisible(true);
            } else {
                if (u.getTipo().equals("gerente") ) {
                    ventanaGerente = new interfazGerente(u);
                    ventanaGerente.setVisible(true);
                } else {
                    if (u.getTipo().equals("operario") ) {
                        ventanaOperario = new interfazOperario(u);
                        ventanaOperario.setVisible(true);
                    }
                }
            }
            dispose();
        } else {
            
              Icon p = new ImageIcon(getClass().getResource("/gui/images/user (3).png"));
            JOptionPane.showMessageDialog(this, "El usuario no  esta activo","No puede ingresar",JOptionPane.INFORMATION_MESSAGE,p);
           password.setText("");
            login.setText(null);

        }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            login.setText(null);
            password.setText(null);

        }
    }
}
