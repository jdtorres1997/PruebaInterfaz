/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEventos;
import controlador.ControladorSedes;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Evento;

/**
 *
 * @author Alexandra
 */
public class interfazModificarEvento extends javax.swing.JFrame {
    ControladorEventos controladorEvento;
    ControladorSedes controladorSede;
    interfazGerente gerente;
    /**
     * Creates new form interfazModificarEvento
     */
    public interfazModificarEvento() {
        initComponents();
        controladorEvento = new ControladorEventos();
        controladorSede = new ControladorSedes();
        gerente = new interfazGerente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ide = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        capacidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        sedeCombo = new javax.swing.JComboBox<>();
        buscarIde = new javax.swing.JButton();
        buscarSede = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/edit.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Identificacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sede");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ubicacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Capacidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 20));

        ide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ideActionPerformed(evt);
            }
        });
        getContentPane().add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, -1));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 150, -1));
        getContentPane().add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));
        getContentPane().add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Hora");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, -1));

        getContentPane().add(sedeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, -1));

        buscarIde.setText("Buscar Evento");
        buscarIde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdeActionPerformed(evt);
            }
        });
        getContentPane().add(buscarIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        buscarSede.setText("buscar Sede");
        buscarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSedeActionPerformed(evt);
            }
        });
        getContentPane().add(buscarSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jButton3.setText("Modificar Evento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText(" Modificar Evento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jButton1))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/calendar (3).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/alarm-clock.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 70, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appartment (1).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 70, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/placeholder.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 70, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/notepad.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/team.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 80));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/k (3).png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/eye (1).png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 70, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandra\\Desktop\\pinkkk.jpg")); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 460, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSedeActionPerformed
      sedeCombo.removeAllItems();
        ArrayList<String> ve= new ArrayList<String>();
              ve = controladorSede.retornar();
                sedeCombo.addItem("");

              for (int i = 0; i < ve.size(); i++) {
                  
                  String item;
                  item = ve.get(i);
                  sedeCombo.addItem(item);
                  item ="";
                  
		}
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarSedeActionPerformed

    private void ideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ideActionPerformed

    private void buscarIdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdeActionPerformed

        if(controladorEvento.existeEvento(ide.getText())){
            Evento ev= new Evento();
            ev = controladorEvento.consultarEvento(ide.getText());
            
            nombre.setText(ev.getNombre());
            sedeCombo.addItem(ev.getSede());
            fecha.setText(ev.getFecha());
            hora.setText(ev.getFecha());
            ubicacion.setText(ev.getUbicacion());
            capacidad.setText(String.valueOf(ev.getCapacidad()));
                 
        }
        else {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/wrongUser.png"));
            JOptionPane.showMessageDialog(this, "El evento no existe, digite otro por favor","",JOptionPane.INFORMATION_MESSAGE,p);
              
      }


            // TODO add your handling code here:
    }//GEN-LAST:event_buscarIdeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        Evento ev = new Evento();
        if(validar()){
        if(controladorEvento.existeEvento(ide.getText())){
            ev.setIdentificacion(ide.getText());
            ev.setNombre(nombre.getText());
            ev.setSede(sedeCombo.getSelectedItem().toString());
            ev.setFecha(fecha.getText());
            ev.setHora(hora.getText());
            ev.setUbicacion(ubicacion.getText());
            ev.setCapacidad(Integer.parseInt(capacidad.getText()));
            
                 boolean seModifico = controladorEvento.modificarEvento(ev);

                 if(seModifico){
                     JOptionPane.showMessageDialog(this, "Se modifico en la base de datos");
                     limpiar();

                 }else{
                      Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                     JOptionPane.showMessageDialog(this, "Hubo un error al modificar","",JOptionPane.INFORMATION_MESSAGE,p);
                 }
             
        }
        
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        gerente.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validar(){
        
        boolean rest = true;
        boolean num =true;
        boolean letras =true;
        
       if(ide.getText().equals("")){
           ide.setBackground(Color.RED);
           rest=false;
       }
        if(nombre.getText().equals("")){
            nombre.setBackground(Color.RED);
             rest=false;

        }
        if(fecha.getText().equals("")){
            fecha.setBackground(Color.RED);
            rest=false;

        }
        if(hora.getText().equals("")){
            hora.setBackground(Color.RED);
            rest=false;
        }
        if(ubicacion.getText().equals("")){
            ubicacion.setBackground(Color.RED);
            rest= false;
        }
        if(capacidad.getText().equals("")){
            capacidad.setBackground(Color.RED);
            rest=false;
        }
       
       
      if(sedeCombo.getSelectedIndex()==-1){
       Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));        
       JOptionPane.showMessageDialog(this, "se debe buscar sedes disponibles", "", JOptionPane.INFORMATION_MESSAGE, p); 
            rest = false;
            return rest;
      }
        
       
        if (!isNumeric(capacidad.getText())){
            num=false;
        }
         if(this.sololetras(ide.getText())|| this.sololetras(nombre.getText()) || 
            this.sololetras(fecha.getText()) || this.sololetras(hora.getText())){
             letras=false;
            
         }

           if (!rest) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Por favor verifique la informacion", "", JOptionPane.INFORMATION_MESSAGE, p);
            ide.setBackground(Color.WHITE);
            nombre.setBackground(Color.WHITE);
            fecha.setBackground(Color.WHITE);
            hora.setBackground(Color.WHITE);
            ubicacion.setBackground(Color.WHITE);
            capacidad.setBackground(Color.WHITE);
            return rest;
        }
           if(!num){
             Icon p = new ImageIcon(getClass().getResource("/gui/images/phone.png"));
            JOptionPane.showMessageDialog(this, "La capacidad debe ser un dato numerico", "", JOptionPane.INFORMATION_MESSAGE, p);
            capacidad.setBackground(Color.WHITE);
            capacidad.setText("");
            rest = false;
            return rest;
           }
           if(!letras){
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Los campos no deben tener caracteres especiales", "", JOptionPane.INFORMATION_MESSAGE, p);
            limpiar();
            rest=false;
            return rest;
           
           }
        
      
       return rest; 
    }
    public void limpiar(){
        ide.setBackground(Color.WHITE);
        nombre.setBackground(Color.WHITE);
        fecha.setBackground(Color.WHITE);
        hora.setBackground(Color.WHITE);
        ubicacion.setBackground(Color.WHITE);
        capacidad.setBackground(Color.WHITE);
        sedeCombo.setSelectedIndex(0);
        ide.setText("");
        nombre.setText("");
        fecha.setText("");
        hora.setText("");
        ubicacion.setText("");
        capacidad.setText("");
        
    }
        private boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
       public static boolean sololetras(String prueba) {
        boolean result = false;
        String comparacion = "!!$%&/()=?¡*¨][_:;°¬|@·~½¬{[]}~µ";
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
            java.util.logging.Logger.getLogger(interfazModificarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazModificarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazModificarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazModificarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazModificarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarIde;
    private javax.swing.JButton buscarSede;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField ide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> sedeCombo;
    private javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
