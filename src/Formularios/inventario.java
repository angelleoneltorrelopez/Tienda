/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import base_datos.conectar;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inventario extends javax.swing.JFrame {

    DefaultTableModel model;  //atributo
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    public inventario() {
        
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        mostrarinventario();
        tabla.setEnabled(false);
        
    }
    
 void mostrarinventario()
    {
        
        DefaultTableModel tabla= new DefaultTableModel();
        String[]titulos={"Codigo","Codigo Barra","Nombres Produto","Generico","Caducidad","Precio","Existencia"} ;
        tabla.setColumnIdentifiers(titulos);
        this.tabla.setModel(tabla);
        String consulta= "SELECT * FROM productos";
        String []Datos= new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("id_productos");
                Datos[1]=rs.getString("codigo_barra");
                Datos[2]=rs.getString("nombre_productos");
                Datos[3]=rs.getString("generico");
                Datos[4]=rs.getString("caducidad");
                Datos[5]=rs.getString("precio");
                Datos[6]=rs.getString("existencia");
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inventario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 20, 120, 29);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 80, 840, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 30, 980, 650);

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
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
        getContentPane().add(btnsalir);
        btnsalir.setBounds(30, 50, 90, 99);

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantinicio.jpg"))); // NOI18N
        getContentPane().add(lblfondo);
        lblfondo.setBounds(-30, 0, 1360, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
new inicio().setVisible(true);
dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
