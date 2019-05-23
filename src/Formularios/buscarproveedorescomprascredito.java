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
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author julio
 */
public class buscarproveedorescomprascredito extends javax.swing.JFrame {

    DefaultTableModel model;  //atributo
    conectar cc= new conectar();
    Connection cn = cc.conexion();
   String id;
   double total=0;
    public buscarproveedorescomprascredito() {
        
        initComponents();
       mostrarproveedor("");
       
    }
    
    void mostrarproveedor(String valor)
    {
        String[]titulos={"Codigo","Nombres","NIT","Direccion"} ;  
        String []Registros= new String[9];
        model=new DefaultTableModel(null,titulos);
        String Sql="SELECT * FROM proveedores WHERE CONCAT(id_prov,nombre_prov,nit_prov,direccion_prov,telefono_prov) LIKE '%"+valor+"%'";
       
        try {
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(Sql);
             while(rs.next())
             {
                 Registros[0]=rs.getString("id_prov");  
                 Registros[1]=rs.getString("nombre_prov");  
                 Registros[2]=rs.getString("nit_prov");  
                 Registros[3]=rs.getString("direccion_prov");  
                 Registros[4]=rs.getString("telefono_prov");   
                 Registros[5]=rs.getString("email_prov");  
                 model.addRow(Registros);
             } 
             jTbuscar.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(buscarproveedorescomprascredito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscarproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registro de proveedores");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 270, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Busqueda de registros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 240, 30);

        txtbuscarproveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscarproveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbuscarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarproveedorActionPerformed(evt);
            }
        });
        txtbuscarproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarproveedorKeyPressed(evt);
            }
        });
        jPanel1.add(txtbuscarproveedor);
        txtbuscarproveedor.setBounds(60, 110, 290, 40);

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

        jButton1.setText("enviar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 120, 93, 23);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 160, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 580, 390);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-623)/2, (screenSize.height-453)/2, 623, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarproveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarproveedorKeyPressed
       mostrarproveedor(txtbuscarproveedor.getText());
    }//GEN-LAST:event_txtbuscarproveedorKeyPressed

    private void txtbuscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarproveedorActionPerformed

    private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
     
    }//GEN-LAST:event_jTbuscarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    String cod="",nom="",nit="",dir="";
    int fila = jTbuscar.getSelectedRow();
    try {
        if(fila==-1)
        {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
                  
        }
        else
        {
         cod =  (String)jTbuscar.getValueAt(fila, 0);
         nom =  (String)jTbuscar.getValueAt(fila, 1);
         nit =  (String)jTbuscar.getValueAt(fila, 2);
         dir=  (String)jTbuscar.getValueAt(fila,3);
         comprascredito.txtcod.setDisabledTextColor(Color.blue);
         comprascredito.txtcod.setText(cod);
         comprascredito.txtcliente.setDisabledTextColor(Color.blue);
         comprascredito.txtcliente.setText(nom);
         comprascredito.txtnit.setDisabledTextColor(Color.blue);
         comprascredito.txtnit.setText(nit);
         comprascredito.txtdireccion.setDisabledTextColor(Color.blue);
         comprascredito.txtdireccion.setText(dir);
         this.dispose();
         
        }
    } catch (Exception e) {
    }
    
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
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
                new buscarproveedorescomprascredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTbuscar;
    private javax.swing.JTextField txtbuscarproveedor;
    // End of variables declaration//GEN-END:variables
}
