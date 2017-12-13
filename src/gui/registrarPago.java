/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import static com.itextpdf.text.pdf.PdfDictionary.FONT;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.ControladorCliente;
import controlador.ControladorEventos;
import controlador.ControladorInscripcion;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Evento;
import logica.Inscripcion;
import logica.Pdf;
import logica.Usuario;

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
    public registrarPago(Usuario u) {
        initComponents();
        controladorInscripcion = new ControladorInscripcion();
        controladorCliente = new ControladorCliente();
        this.setLocationRelativeTo(null);
        controladorEvento = new ControladorEventos();
        interfazOper = new interfazOperario(u);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CargarEventos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        eventoCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        costoEvento = new javax.swing.JTextField();
        capacidadEvento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        disponible = new javax.swing.JButton();
        cambio = new javax.swing.JTextField();
        pagar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cupo disponible");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Evento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        CargarEventos.setText("Eventos");
        CargarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarEventosActionPerformed(evt);
            }
        });
        getContentPane().add(CargarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jButton1.setText("Registrar pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, -1));

        eventoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoComboActionPerformed(evt);
            }
        });
        getContentPane().add(eventoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificacion cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jButton2))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Costo del evento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, 20));

        costoEvento.setEditable(false);
        costoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoEventoActionPerformed(evt);
            }
        });
        getContentPane().add(costoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 120, -1));

        capacidadEvento.setEditable(false);
        capacidadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadEventoActionPerformed(evt);
            }
        });
        getContentPane().add(capacidadEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/cashier-machine.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/coins (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 70, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/credit-card (1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 60, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/credit-card (2).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/money.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 70, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/money-bag.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 60, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/graph (1).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/pay-per-click.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 70, 70));

        disponible.setText("Cupo Disponible?");
        disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibleActionPerformed(evt);
            }
        });
        getContentPane().add(disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, -1));

        cambio.setEnabled(false);
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        getContentPane().add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 120, -1));

        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Dinero dado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jButton4.setText("Cambio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/aao.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String anterior = "";
    String otra = "";
    int t = 0;
    int num = 0;
    int respuesta = -1;
    boolean saber = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validar()) {
            Inscripcion in = new Inscripcion();
            in.setIdCliente(id_cliente.getText());
            in.setIdEvento(eventoCombo.getSelectedItem().toString());
            in.setPago("no");

            boolean seAgrego = controladorInscripcion.modificarInscripcion(in);
            if (seAgrego) {

                respuesta = quitarCapacidad(eventoCombo.getSelectedItem().toString());
                t = 1;
                JOptionPane.showMessageDialog(this, "Se agrego el pago al sistema, ahora se encuentra inscrito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                //IMPRIMIR RECIBO
                try {
                    String nombreDocumento = id_cliente.getText() + "-Evento-" + eventoCombo.getSelectedItem().toString();
                    String identificacionCliente = id_cliente.getText();

                    String evento = eventoCombo.getSelectedItem().toString();
                    String costo = costoEvento.getText();
                    String pago = pagar.getText();
                    String cambioPago = cambio.getText();
                    Pdf pdf = new Pdf();
                    pdf.createPdf(nombreDocumento, identificacionCliente, evento, costo, pago, cambioPago);
                    limpiar();
                } catch (Exception e) {

                }
                //  limpiar();
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
        if (pagar.getText().equals("")) {
            pagar.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Por favor digite cuando dinero da el cliente", "", JOptionPane.INFORMATION_MESSAGE);
            pagar.setBackground(Color.WHITE);
            rest = false;
            return rest;

        }
        if (cambio.getText().equals("")) {
            cambio.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe saber cuanto dinero debe devolver al cliente", "", JOptionPane.INFORMATION_MESSAGE);
            rest = false;
            return rest;

        }
        if (eventoCombo.getSelectedIndex() == -1) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));

            JOptionPane.showMessageDialog(this, " Debe buscar los eventos disponibles", "", JOptionPane.INFORMATION_MESSAGE, p);

            rest = false;
            return rest;
        }
        if (!controladorCliente.existeCliente(id_cliente.getText())) {
            rest = false;
            JOptionPane.showMessageDialog(this, "El cliente no existe", "", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            return rest;
        }
        if (!controladorInscripcion.existeInscripcion(id_cliente.getText(), eventoCombo.getSelectedItem().toString())) {
            rest = false;
            JOptionPane.showMessageDialog(this, "El cliente no se encuentra preinscrito a este evento", "", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            return rest;
        }
        if ((controladorInscripcion.existeInscripcion(id_cliente.getText(), eventoCombo.getSelectedItem().toString())) && (controladorInscripcion.consultarInscripcion(id_cliente.getText(), eventoCombo.getSelectedItem().toString()).getPago().equals("si"))) {
            rest = false;
            JOptionPane.showMessageDialog(this, "El cliente ya realizó el pago para este evento", "", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            return rest;
        }

        if (capacidadEvento.getText().equals("0") && respuesta != 0) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));

            JOptionPane.showMessageDialog(this, " Debe saber el cupo disponible", "", JOptionPane.INFORMATION_MESSAGE, p);

            rest = false;
            return rest;

        }
        if (respuesta == 0) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, " No hay mas capacidad para el evento", "", JOptionPane.INFORMATION_MESSAGE, p);
            limpiar();
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
        id_cliente.setText("");
        eventoCombo.removeAllItems();
        id_cliente.setBackground(Color.white);
        costoEvento.setText("");
        capacidadEvento.setText("");
        cambio.setText("");
        pagar.setText("");

    }


    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        costoEvento.setText(String.valueOf(0));
        capacidadEvento.setText(String.valueOf(0));
        //    eventoCombo.setSelectedIndex(-1);


    }//GEN-LAST:event_CargarEventosActionPerformed

    private void eventoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoComboActionPerformed

        if (eventoCombo.getSelectedIndex() != -1) {

            Evento ev = new Evento();
            ev = controladorEvento.consultarEvento(eventoCombo.getSelectedItem().toString());
            costoEvento.setText(String.valueOf(ev.getCosto()));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_eventoComboActionPerformed

    private int quitarCapacidad(String combo) { //quita cupos dependiendo del eveento

        Evento even = new Evento();
        even = controladorEvento.consultarEvento(combo);

        if (even.getIdentificacion().equals(anterior)) {
            num = num - 1;
            System.out.println(num);
            System.out.println("uno");

        }
        if (anterior.equals("")) {
            anterior = combo;
            num = even.getCapacidad() - 1;
            System.out.println(num);
            System.out.println("dos");
        }
        if (!even.getIdentificacion().equals(anterior)) {
            anterior = combo;
            num = even.getCapacidad() - 1;
            System.out.println(num);
            System.out.println("tres");

        }
        return num;

    }
    private void capacidadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadEventoActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed

        Evento eve = new Evento();
        eve = controladorEvento.consultarEvento(eventoCombo.getSelectedItem().toString());

        if (otra.equals(eve.getIdentificacion()) && respuesta > 0) {
            capacidadEvento.setText(String.valueOf(respuesta));
        }

        if (otra.equals("")) {
            otra = eventoCombo.getSelectedItem().toString();
            capacidadEvento.setText(String.valueOf(eve.getCapacidad()));

        }
        if (!otra.equals(eve.getIdentificacion())) {

            capacidadEvento.setText(String.valueOf(eve.getCapacidad()));
            otra = eventoCombo.getSelectedItem().toString();
        }
        if (t == 0) {
            capacidadEvento.setText(String.valueOf(eve.getCapacidad()));

        }

    }//GEN-LAST:event_disponibleActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioActionPerformed

    private void costoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoEventoActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int dineroPagar = 0;
        if (!pagar.getText().equals("")) {
            dineroPagar = Integer.parseInt(pagar.getText());
        }

        int dineroCostoEvento = 0;
        if (!costoEvento.getText().equals("")) {
            dineroCostoEvento = Integer.parseInt(costoEvento.getText());
        }

        int cambiar = dineroPagar - dineroCostoEvento;
        if (cambiar < 0) {
            pagar.setText("");
            JOptionPane.showMessageDialog(this, "El dinero dado debe ser por lo menos el precio del evento", "", JOptionPane.ERROR_MESSAGE );

        } else {
            cambio.setText(String.valueOf(cambiar));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarEventos;
    private javax.swing.JTextField cambio;
    private javax.swing.JTextField capacidadEvento;
    private javax.swing.JTextField costoEvento;
    private javax.swing.JButton disponible;
    private javax.swing.JComboBox<String> eventoCombo;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pagar;
    // End of variables declaration//GEN-END:variables
}
