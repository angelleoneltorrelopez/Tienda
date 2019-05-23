/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import base_datos.conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class pago_clientes extends javax.swing.JFrame {
    DefaultTableModel model;  //atributo
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    public pago_clientes() {
        
        initComponents();
        inhabilitar();
        habilitar();
        
         limpiar();
         mostrarclientes("");
        
    }
    
    void descontarcantidad(String codi,String can)
    {
       double des = Double.parseDouble(can);
       String cap="";
       double desfinal;
       String consul="SELECT * FROM boleta WHERE  num_bol='"+codi+"'";
         try {
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(consul);
            while(rs.next())
            {
                cap= rs.getString(6);
              
              
            }
            
            
        } catch (Exception e) {
        }
         
                
        desfinal=Double.parseDouble(cap)-des;
        
        String modi="UPDATE boleta SET total_pagar='"+desfinal+"' WHERE num_bol='"+codi+"'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    void mostrarclientes(String valor)
    {
        String[]titulos={"Codigo","Codigo Cliente","Nombres","Total Boleta","Fecha","Total a Pagar",} ;  
        String []Registros= new String[6];
        model=new DefaultTableModel(null,titulos);
        String Sql="SELECT * FROM boleta WHERE CONCAT(cod_cli,nom_clie) LIKE '%"+valor+"%'";
       
        try {
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(Sql);
             while(rs.next())
             {
                 Registros[0]=rs.getString("num_bol");  
                 Registros[1]=rs.getString("cod_cli");  
                 Registros[2]=rs.getString("nom_clie");  
                 Registros[3]=rs.getString("pre_tot");  
                 Registros[4]=rs.getString("fecha");
                 Registros[5]=rs.getString("total_pagar");
                 //Registros[6]=txtpago.getText();
                 model.addRow(Registros);
             } 
             tabcliente.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(pago_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    void limpiar(){
        txtcliente.setText("");
        txtnofactura.setText("");
        txtfecha.setText("");
        
        txtpago.setText("");
        txttotalfactura.setText("");
    }
    
    void inhabilitar()
    {
       
        txttotalfactura.setEnabled(false);
        txtcliente.setEnabled(false);
        
      
        txttotalfactura.setText("");
        txtcliente.setText("");
        
        
        
        
        
    }
    void habilitar()
    {
       
        txtcliente.setEnabled(true);
    }
    
   
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlpagoproveedores = new javax.swing.JPanel();
        lblrotulo = new javax.swing.JLabel();
        lblcliente = new javax.swing.JLabel();
        lbltotalfactura = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        txttotalfactura = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtnofactura = new javax.swing.JTextField();
        lblpago = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        lblnofactura = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabcliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlpagoproveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(0, null, null, java.awt.Color.black, java.awt.Color.black));
        pnlpagoproveedores.setLayout(null);

        lblrotulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblrotulo.setText("Pago De Clientes");
        pnlpagoproveedores.add(lblrotulo);
        lblrotulo.setBounds(70, 30, 370, 29);

        lblcliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcliente.setText("Buscar Cliente:");
        pnlpagoproveedores.add(lblcliente);
        lblcliente.setBounds(90, 210, 120, 20);

        lbltotalfactura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltotalfactura.setText("TOTAL");
        pnlpagoproveedores.add(lbltotalfactura);
        lbltotalfactura.setBounds(760, 70, 60, 30);

        txtcliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });
        txtcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtclienteKeyPressed(evt);
            }
        });
        pnlpagoproveedores.add(txtcliente);
        txtcliente.setBounds(220, 210, 670, 30);

        txttotalfactura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttotalfactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotalfactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlpagoproveedores.add(txttotalfactura);
        txttotalfactura.setBounds(680, 100, 210, 60);

        btnnuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/canstock24580037.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setBorder(null);
        btnnuevo.setBorderPainted(false);
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo1.jpg"))); // NOI18N
        btnnuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        pnlpagoproveedores.add(btnnuevo);
        btnnuevo.setBounds(150, 80, 80, 90);

        btncancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel-512.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(null);
        btncancelar.setBorderPainted(false);
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar1.jpg"))); // NOI18N
        btncancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        pnlpagoproveedores.add(btncancelar);
        btncancelar.setBounds(310, 80, 80, 89);

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart.png"))); // NOI18N
        btnsalir.setText("Atras");
        btnsalir.setBorder(null);
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras1.jpg"))); // NOI18N
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        pnlpagoproveedores.add(btnsalir);
        btnsalir.setBounds(60, 79, 90, 90);

        txtnofactura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnofactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnofactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnofacturaActionPerformed(evt);
            }
        });
        pnlpagoproveedores.add(txtnofactura);
        txtnofactura.setBounds(220, 350, 430, 30);

        lblpago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpago.setText("Monto a pagar:");
        pnlpagoproveedores.add(lblpago);
        lblpago.setBounds(90, 400, 150, 30);

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfecha.setText("Fecha:");
        pnlpagoproveedores.add(lblfecha);
        lblfecha.setBounds(660, 350, 60, 30);

        txtfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlpagoproveedores.add(txtfecha);
        txtfecha.setBounds(720, 350, 170, 30);

        lblnofactura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnofactura.setText("No. de Factura:");
        pnlpagoproveedores.add(lblnofactura);
        lblnofactura.setBounds(90, 350, 150, 30);

        txtpago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });
        txtpago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpagoKeyPressed(evt);
            }
        });
        pnlpagoproveedores.add(txtpago);
        txtpago.setBounds(220, 400, 160, 50);

        tabcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabcliente);

        pnlpagoproveedores.add(jScrollPane1);
        jScrollPane1.setBounds(90, 260, 800, 70);

        jButton1.setText("guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlpagoproveedores.add(jButton1);
        jButton1.setBounds(230, 140, 71, 23);

        getContentPane().add(pnlpagoproveedores);
        pnlpagoproveedores.setBounds(60, -10, 1030, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantinicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1940, 1020);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1169)/2, (screenSize.height-520)/2, 1169, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed

    }//GEN-LAST:event_txtclienteActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
      limpiar();
      habilitar();
      
      
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        new inicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtnofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnofacturaActionPerformed

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoActionPerformed

    private void txtclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclienteKeyPressed
   mostrarclientes(txtcliente.getText());
       
    }//GEN-LAST:event_txtclienteKeyPressed

    private void tabclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabclienteMouseClicked
        String numbol="",total="",fecha="",tot="";
        int fila = tabcliente.getSelectedRow();
    try {
        if(fila==-1)
        {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
                  
        }
        else
        {
         numbol =  (String)tabcliente.getValueAt(fila, 0);
         total =  (String)tabcliente.getValueAt(fila, 3);
         tot =  (String)tabcliente.getValueAt(fila, 5);
         fecha =  (String)tabcliente.getValueAt(fila, 4);
         
         txtnofactura.setDisabledTextColor(Color.blue);
         txtnofactura.setText(numbol);
         txttotalfactura.setDisabledTextColor(Color.blue);
         txttotalfactura.setText(tot);
         txtfecha.setDisabledTextColor(Color.blue);
         txtfecha.setText(fecha);
                 
        }
    } catch (Exception e) {
    }
    }//GEN-LAST:event_tabclienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       double total;
       
     
     String  tot = txttotalfactura.getText();
     String  pag = txtpago.getText();
     String  bol = txtnofactura.getText();
     
     double des = Double.parseDouble(tot);
     double pagar = Double.parseDouble(pag); 
     //int codi=Integer.parseInt(bol);
     
     total=des-pagar;
   
     
    
     String modi="UPDATE boleta SET total_pagar='"+total+"' WHERE num_bol='"+bol+"'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (Exception e) {
        }
     
   
           limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagoKeyPressed
        mostrarclientes(txtpago.getText());
    }//GEN-LAST:event_txtpagoKeyPressed

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
            java.util.logging.Logger.getLogger(pago_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblnofactura;
    private javax.swing.JLabel lblpago;
    private javax.swing.JLabel lblrotulo;
    private javax.swing.JLabel lbltotalfactura;
    private javax.swing.JPanel pnlpagoproveedores;
    private javax.swing.JTable tabcliente;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnofactura;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txttotalfactura;
    // End of variables declaration//GEN-END:variables
}
