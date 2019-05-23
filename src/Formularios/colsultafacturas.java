/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import base_datos.mysql;
import base_datos.conectar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author julio
 */
public class colsultafacturas extends javax.swing.JFrame {

    DefaultTableModel model;  //atributo
    conectar cc= new conectar();
    Connection cn = cc.conexion();
   String id;
   double total=0;
    public colsultafacturas() {
        
        initComponents();
       cargartodasfacturas();
        this.setLocation(25,15 );
       
    }
    
    void cargartodasfacturas()
    {
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"NUMERO","COD. CLIENTE","NOMBRE CLIENTE","NIT CLIENTE","SUBTOTAL","IVA","TOTAL","FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.jTbuscar.setModel(tabla);
        String consulta= "SELECT * FROM factura";
        String []Datos= new String [8];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("num_fac");
                Datos[1]=rs.getString("cod_cli");
                Datos[2]=rs.getString("nom_clie");
                Datos[3]=rs.getString("nit_cli");
                Datos[4]=rs.getString("subtotal");
                Datos[5]=rs.getString("iva");
                Datos[6]=rs.getString("total");
                Datos[7]=rs.getString("fec_fac");
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(colsultafacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        editable = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbuscar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        rdbnnumero = new javax.swing.JRadioButton();
        rdbntodos = new javax.swing.JRadioButton();
        btnver = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        editable.setText("Modificar");
        editable.setToolTipText("");
        editable.setComponentPopupMenu(jPopupMenu1);
        editable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editableActionPerformed(evt);
            }
        });
        jPopupMenu1.add(editable);
        jPopupMenu1.add(jSeparator1);

        jPopupMenu1.getAccessibleContext().setAccessibleParent(jTbuscar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consulta Facturas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 270, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Busqueda de registros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 240, 30);

        txtbuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });
        jPanel1.add(txtbuscar);
        txtbuscar.setBounds(170, 110, 280, 30);

        jTbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTbuscar.setCellSelectionEnabled(true);
        jTbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbuscar);
        jTbuscar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 560, 140);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 170, 90, 30);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar);
        btnbuscar.setBounds(480, 100, 65, 23);

        rdbnnumero.setSelected(true);
        rdbnnumero.setText("Mostrar  por Nº:");
        rdbnnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnnumeroActionPerformed(evt);
            }
        });
        jPanel1.add(rdbnnumero);
        rdbnnumero.setBounds(50, 110, 110, 30);

        rdbntodos.setText("Mostrar todas:");
        rdbntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbntodosActionPerformed(evt);
            }
        });
        jPanel1.add(rdbntodos);
        rdbntodos.setBounds(50, 150, 110, 30);

        btnver.setText("ver");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel1.add(btnver);
        btnver.setBounds(480, 50, 49, 23);

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar);
        btneliminar.setBounds(480, 130, 69, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 580, 390);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-623)/2, (screenSize.height-453)/2, 623, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
      
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void editableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editableActionPerformed
    
    }//GEN-LAST:event_editableActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
     
    }//GEN-LAST:event_jTbuscarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      String num=txtbuscar.getText();
    
    String consulta="";
    if(rdbnnumero.isSelected()==true)
    {
        consulta= "SELECT * FROM factura WHERE num_fac='"+num+"'";
    }
    
    if(rdbntodos.isSelected()==true)
    {
        consulta= "SELECT * FROM factura ";
    }
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"NUMERO","COD. CLIENTE","NOMBRE CLIENTE","NIT CLIENTE","SUBTOTAL","IVA","TOTAL","FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.jTbuscar.setModel(tabla);
        
        String []Datos= new String [8];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("num_fac");
                Datos[1]=rs.getString("cod_cli");
                Datos[2]=rs.getString("nom_clie");
                Datos[3]=rs.getString("nit_cli");
                Datos[4]=rs.getString("subtotal");
                Datos[5]=rs.getString("iva");
                Datos[6]=rs.getString("total");
                Datos[7]=rs.getString("fec_fac");
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(colsultafacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void rdbnnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnnumeroActionPerformed
        // TODO add your handling code here:
        if(rdbnnumero.isSelected()==true)
        {
            txtbuscar.setEnabled(true);
            txtbuscar.requestFocus();
            
            

        }
    }//GEN-LAST:event_rdbnnumeroActionPerformed

    private void rdbntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbntodosActionPerformed
        // TODO add your handling code here:
        if(rdbntodos.isSelected()==true)
        {
            txtbuscar.setText("");
            txtbuscar.setEnabled(false);
            cargartodasfacturas();
        }

    }//GEN-LAST:event_rdbntodosActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        int filasele= jTbuscar.getSelectedRow();
    if(filasele==-1)
    {
        JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
    }
    else
    {
           detallefactura detalle = new detallefactura();
    detalle.toFront();
    detalle.setVisible(true);
        String numfac=jTbuscar.getValueAt(filasele, 0).toString();
        String cod=jTbuscar.getValueAt(filasele, 1).toString();
        String nomclie=jTbuscar.getValueAt(filasele, 2).toString();
        String nit=jTbuscar.getValueAt(filasele, 3).toString();
        String subtotal=jTbuscar.getValueAt(filasele, 4).toString();
        String iva=jTbuscar.getValueAt(filasele, 5).toString();
        String total=jTbuscar.getValueAt(filasele, 6).toString();
        String fecha=jTbuscar.getValueAt(filasele, 7).toString();
        
        detallefactura.txtfac.setText(numfac);
        detallefactura.txtcod.setText(cod);
        detallefactura.txtnom.setText(nomclie);
        detallefactura.txtnit.setText(nit);
        detallefactura.txtsub.setText(subtotal);
        detallefactura.txtiva.setText(iva);
        detallefactura.txttot.setText(total);
        detallefactura.txtfecha.setText(fecha);
        
        DefaultTableModel model = (DefaultTableModel) detallefactura.tbdetalle.getModel();
        String ver="SELECT * FROM detfactura WHERE num_fac='"+numfac+"'";
        String []datos= new String[5]   ;
        try {
                Statement st = cn.createStatement();
                ResultSet rs= st.executeQuery(ver);
                while(rs.next())
                {
                    datos[0]=rs.getString("cod_pro");
                    datos[1]=rs.getString("des_pro");
                    datos[2]=rs.getString("cant_pro");
                    datos[3]=rs.getString("pre_unit");
                    datos[4]=rs.getString("pre_tot");
                    model.addRow(datos);
                    
                }
                detallefactura.tbdetalle.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(colsultafacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_btnverActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       int fila=jTbuscar.getSelectedRow();
    if(fila>=0)
    {
        String cod=jTbuscar.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM factura WHERE num_fac='"+cod+"'");
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(colsultafacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargartodasfacturas();
        
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colsultafacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnver;
    private javax.swing.JMenuItem editable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JTable jTbuscar;
    private javax.swing.JRadioButton rdbnnumero;
    private javax.swing.JRadioButton rdbntodos;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
