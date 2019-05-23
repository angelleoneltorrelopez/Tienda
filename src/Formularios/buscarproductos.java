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
public class buscarproductos extends javax.swing.JFrame {

    DefaultTableModel model;  //atributo
    conectar cc= new conectar();
    Connection cn = cc.conexion();
   String id;
   double total=0;
    public buscarproductos() {
        
        initComponents();
        cargarlistaproductos("");
        
    }
    
    String comparar(String cod)
    {
        String cant="";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM productos WHERE id_productos='"+cod+"'");
            while(rs.next())
            {
                cant=rs.getString(7);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(buscarproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
        
    }
    
    void cargarlistaproductos(String dato){
        String [] Titulo = {"Codigo","Descripcion","Precio","cantidad"};
        model=new DefaultTableModel(null,Titulo);
    String []Registro= new String[4];
    String mostrar="SELECT * FROM productos WHERE CONCAT (id_productos,codigo_barra,nombre_productos,generico) LIKE '%"+dato+"%'"; 
    Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs =st.executeQuery(mostrar);
            while(rs.next())
            {
                Registro[0]=rs.getString("id_productos");
                Registro[1]=rs.getString("nombre_productos");
                Registro[2]=rs.getString("precio");
                Registro[3]=rs.getString("existencia");
                model.addRow(Registro);
            }
            jTbuscar.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(buscarproductos.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1.setText("Registro de Productos");
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
       cargarlistaproductos(txtbuscarproveedor.getText());
    }//GEN-LAST:event_txtbuscarproveedorKeyPressed

    private void txtbuscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarproveedorActionPerformed

    private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
     
    }//GEN-LAST:event_jTbuscarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
         DefaultTableModel tabladet = (DefaultTableModel)     ventas.tbdet.getModel();
    String[]  dato=new String[5];
   
    int  fila = jTbuscar.getSelectedRow();
    
    
    if(fila==-1)
    {
        JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
    }
    else
    {
        String codins=jTbuscar.getValueAt(fila, 0).toString();
        String desins=jTbuscar.getValueAt(fila, 1).toString();
        String preins=jTbuscar.getValueAt(fila, 2).toString();
        int c=0;
        int j=0;
         String  cant=JOptionPane.showInputDialog("ingrese cantidad");
        if((cant.equals("")) || (cant.equals("0")))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar algun valor mayor que 0");
        }
        else
        {
            int canting=Integer.parseInt(cant);
             int comp=Integer.parseInt(comparar(codins));
             if(canting>comp)
             {
                 JOptionPane.showMessageDialog(this,"Ud. no cuenta con la cantidad apropiada");
             }
             else
             {
                   for(int i=0;i<ventas.tbdet.getRowCount();i++)
        {
            Object com=ventas.tbdet.getValueAt(i,0);
            if(codins.equals(com))
            {
                j=i;
                ventas.tbdet.setValueAt(cant, i, 3);
                c=c+1;
       
            }
   
        }
        if(c==0)
        {
           
      
            dato[0]=codins;
            dato[1]=desins;
            dato[2]=preins;
            dato[3]=cant;
            
            tabladet.addRow(dato);
        
            ventas.tbdet.setModel(tabladet);
            
            
        }
             }
  
        }

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
                new buscarproductos().setVisible(true);
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
