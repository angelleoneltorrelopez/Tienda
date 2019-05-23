/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import base_datos.mysql;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class productos extends javax.swing.JFrame {

    DefaultTableModel model;  //atributo
    mysql con;
    Statement sent;
    ResultSet rs;
   String id;
   double total=0;
    public productos() {
        
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        inhabilitar();
        bloquearguardar();
        bloquearmodificar();
        bloquearactualizar();
        bloqueareliminar();
    }
    
void bloqueareliminar(){
    btneliminar.setEnabled(false);
}    

void bloquearguardar(){
        btnguardar.setEnabled(false);
    }

void bloquearactualizar(){
    btnactualizar.setEnabled(false);
}

void bloquearnuevo(){
    btnnuevo.setEnabled(false);
}

void bloquearmodificar(){
    btnmodificar.setEnabled(false);
}



void habilitareliminar(){
    btneliminar.setEnabled(true);
}


void habilitarmodificar(){
    btnmodificar.setEnabled(true);
}

void habilitarguardar(){
    btnguardar.setEnabled(true);
}

void habilitaractualizar(){
    btnactualizar.setEnabled(true);
}

void habilitarnuevo(){
    btnnuevo.setEnabled(true);
}

    void limpiar(){
        txtproducto.setText("");
        jTyyyy.setText("");
        jTmm.setText("");
        jTdd.setText("");
        txtprecio.setText("");
        txtgenerico.setText("");
        txtcodbarra.setText("");
    }
    
    void bloquear(){
       txtproducto.setEnabled(false);
       txtprecio.setEnabled(false);
       txtgenerico.setEnabled(false);
       jTyyyy.setEnabled(false);
        jTmm.setEnabled(false);
        jTdd.setEnabled(false); 
       txtcodbarra.setEnabled(false); 
    }
    
    void inhabilitar()
    {
       txtproducto.setEnabled(false);
       txtprecio.setEnabled(false);
       txtgenerico.setEnabled(false);
       jTyyyy.setEnabled(false);
        jTmm.setEnabled(false);
        jTdd.setEnabled(false); 
       txtcodbarra.setEnabled(false);
       txtproducto.setText("");
       txtprecio.setText("");
       jTyyyy.setText("");
        jTmm.setText("");
        jTdd.setText("");
       txtcodbarra.setText("");
       txtgenerico.setText("");
       
    }
   void habilitar()
   {
       txtproducto.setEnabled(true);
       txtprecio.setEnabled(true);
       txtgenerico.setEnabled(true);
       jTyyyy.setEnabled(true);
        jTmm.setEnabled(true);
        jTdd.setEnabled(true);
       txtcodbarra.setEnabled(true);
       txtcodbarra.requestFocus();
   
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        editable = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcodproveedor = new javax.swing.JLabel();
        lblproveedor = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        txtcodbarra = new javax.swing.JTextField();
        txtproducto = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtgenerico = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtbuscarproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbuscar = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        lbltelefono1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jTdd = new javax.swing.JTextField();
        jTyyyy = new javax.swing.JTextField();
        jTmm = new javax.swing.JTextField();
        lbldireccion1 = new javax.swing.JLabel();
        lbldireccion2 = new javax.swing.JLabel();
        lbldireccion3 = new javax.swing.JLabel();
        lbldireccion4 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        editable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras1.jpg"))); // NOI18N
        editable.setText("Modificar");
        editable.setToolTipText("");
        editable.setComponentPopupMenu(jTbuscar.getComponentPopupMenu());
        editable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editableActionPerformed(evt);
            }
        });
        jPopupMenu1.add(editable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Productos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 270, 29);

        lblcodproveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodproveedor.setText("Codigo de Barra:");
        jPanel1.add(lblcodproveedor);
        lblcodproveedor.setBounds(30, 50, 140, 30);

        lblproveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblproveedor.setText("Producto:");
        jPanel1.add(lblproveedor);
        lblproveedor.setBounds(360, 50, 80, 30);

        lbldireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion.setText("DD");
        jPanel1.add(lbldireccion);
        lbldireccion.setBounds(290, 130, 30, 30);

        txtcodbarra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcodbarra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodbarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodbarra);
        txtcodbarra.setBounds(170, 50, 180, 30);

        txtproducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtproducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtproducto);
        txtproducto.setBounds(450, 50, 280, 30);

        txtprecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtprecio);
        txtprecio.setBounds(170, 90, 90, 30);

        txtgenerico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtgenerico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtgenerico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtgenerico);
        txtgenerico.setBounds(450, 90, 280, 30);

        btnnuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.jpg"))); // NOI18N
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
        jPanel1.add(btnnuevo);
        btnnuevo.setBounds(860, 10, 80, 110);

        btncancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.jpg"))); // NOI18N
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
        jPanel1.add(btncancelar);
        btncancelar.setBounds(860, 140, 81, 107);

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.jpg"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorder(null);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar1.jpg"))); // NOI18N
        btnguardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar);
        btnguardar.setBounds(860, 260, 81, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Busqueda de registros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 310, 240, 30);

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
        txtbuscarproveedor.setBounds(80, 350, 290, 40);

        jTbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

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
        jScrollPane1.setBounds(20, 400, 840, 240);

        btnactualizar.setText("actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar);
        btnactualizar.setBounds(740, 130, 90, 23);

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar);
        btnmodificar.setBounds(740, 80, 90, 23);

        lbltelefono1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltelefono1.setText("Generico:");
        jPanel1.add(lbltelefono1);
        lbltelefono1.setBounds(360, 90, 80, 30);

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar);
        btneliminar.setBounds(740, 190, 69, 23);
        jPanel1.add(jTdd);
        jTdd.setBounds(290, 160, 40, 30);
        jPanel1.add(jTyyyy);
        jTyyyy.setBounds(170, 160, 59, 30);
        jPanel1.add(jTmm);
        jTmm.setBounds(240, 160, 40, 30);

        lbldireccion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion1.setText("Precio:");
        jPanel1.add(lbldireccion1);
        lbldireccion1.setBounds(110, 90, 60, 30);

        lbldireccion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion2.setText("Caducidad:");
        jPanel1.add(lbldireccion2);
        lbldireccion2.setBounds(70, 160, 90, 30);

        lbldireccion3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion3.setText("YYYY");
        jPanel1.add(lbldireccion3);
        lbldireccion3.setBounds(180, 130, 40, 30);

        lbldireccion4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion4.setText("MM");
        jPanel1.add(lbldireccion4);
        lbldireccion4.setBounds(240, 130, 30, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 40, 980, 650);

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

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
      limpiar();
      habilitar();
      habilitarguardar();
      bloquearactualizar();
      bloquearmodificar();
      bloqueareliminar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
      inhabilitar();
      habilitarnuevo();
      bloquearguardar();
      bloquearactualizar();
      bloquearmodificar();
      bloqueareliminar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
if (txtcodbarra.getText().equals("")||jTyyyy.getText().equals("")||txtproducto.getText().equals("")
                ||txtprecio.getText().equals("")||txtgenerico.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");
        }

else{
        try{
        try{
          con = new mysql();
      
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error: ");
      }
      
      //se obtienen los valores de los jTextField
                String producto = txtproducto.getText();
                String caducidad = jTyyyy.getText()+"-"+jTmm.getText()+"-"+jTdd.getText();
                String precio = txtprecio.getText();
                String generico = txtgenerico.getText();
                String codbarra = txtcodbarra.getText();
                int exis=0;
                
      //sentencias sql para insertar los datos en la base de datos
       String sql = "INSERT INTO `productos`(`codigo_barra`, `nombre_productos`, `generico`, `caducidad`, `precio`, `existencia`) VALUES ('"+codbarra+"','"+producto+"','"+generico+"','"+caducidad+"','"+precio+"','"+exis+"')";         
       
      //funcion para ejecutar la query
                con.ejecutar(sql);

               JOptionPane.showMessageDialog(null, "Producto: "+producto+" agregado.");
               
               //se limpian los campos de texto para seguir agregando mas datos
                limpiar();
                
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Producto no agregado.");
      }
        inhabilitar();
        limpiar();
        bloquearguardar();
        bloquearactualizar();
        bloquearmodificar();
        bloqueareliminar();
    }//GEN-LAST:event_btnguardarActionPerformed
    }
    private void txtbuscarproveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarproveedorKeyPressed
       
        try {
            // se comienza la conexion con la base de datos
        try {
                    con = new mysql();


                } catch (Exception ex) {
                    
                } 
        
        String prod= txtbuscarproveedor.getText();
        String sql ="SELECT * FROM productos WHERE nombre_productos LIKE '%"+prod+"%'";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+txtbuscarproveedor.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                      
        public boolean isCellEditable(int rowIndex, int vColIndex) {
          return false;
        }};
        this.jTbuscar.setModel(buscar);
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
          }
          buscar.addRow(fila);
 }
         
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_txtbuscarproveedorKeyPressed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
       
        //BOTON PARA MODIFICAR LOS DATOS DE UN PRODUCTOS EN LA BASE DE DATOS

 // validaciones para saber que no se deja algun campo en limpio
        if (txtproducto.getText().equals("")||jTyyyy.getText().equals("")||txtprecio.getText().equals("")
                ||txtgenerico.getText().equals("")||txtgenerico.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");

        }

        else

        {
    // por si se da clic antes de hacer la busqueda
    // se validan los textfield

    String producto = txtproducto.getText();
    String caducidad = jTyyyy.getText()+"-"+jTmm.getText()+"-"+jTdd.getText();
    String precio = txtprecio.getText();
    String generico = txtgenerico.getText();
    String codbarra = txtcodbarra.getText();
    

            try {
                //se crea la conexion y las consultas
                con = new mysql();
                
                int id2 = Integer.parseInt(id);
                // se crea la sentecia sql y se ejecuta para hacer la modificacion
                 String modifica = "UPDATE `productos` SET `nombre_productos`='"+producto+"',`caducidad`='"+caducidad+"',`precio`='"+precio+"',`generico`='"+generico+"',`codigo_barra`='"+codbarra+"' WHERE id_productos = '"+id2+"'";
                 con.ejecutar(modifica);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");


            } catch (Exception ex) {
                
            }
}
        inhabilitar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void editableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editableActionPerformed
      habilitar();
    }//GEN-LAST:event_editableActionPerformed

    private void txtbuscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarproveedorActionPerformed

    private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
      int Opcion=this.jTbuscar.getSelectedRow();
        //muestra el no. de renglon
       // JOptionPane.showMessageDialog(rootPane,Opcion);
        id =  jTbuscar.getValueAt(Opcion,0).toString();
        this.txtcodbarra.setText(this.jTbuscar.getValueAt(Opcion, 1).toString());
        this.txtproducto.setText(this.jTbuscar.getValueAt(Opcion, 2).toString());
        this.txtgenerico.setText(this.jTbuscar.getValueAt(Opcion, 3).toString());
        //this.txtcaducidad.setText(this.jTbuscar.getValueAt(Opcion, 4).toString());
        this.txtprecio.setText(this.jTbuscar.getValueAt(Opcion, 5).toString());
        
        
        bloquear();
        habilitarmodificar();
        habilitareliminar();
        bloquearguardar();
        bloquearactualizar();
    }//GEN-LAST:event_jTbuscarMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        habilitar();
        habilitaractualizar();
        bloquearguardar();
        bloquearnuevo();
        bloqueareliminar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        //BOTON PARA ELIMINAR LOS DATOS DE UN PRODUCTOS EN LA BASE DE DATOS
        int fila = jTbuscar.getSelectedRow();

            try {
                //se crea la conexion y las consultas
                con = new mysql();
                
               
                // se crea la sentecia sql y se ejecuta para hacer la Eliminacion
                 String eliminar = "DELETE FROM productos WHERE id_productos="+jTbuscar.getValueAt(fila, 0);
                 con.ejecutar(eliminar);
                JOptionPane.showMessageDialog(null, "Datos Eliminados");


            } catch (Exception ex) {
                
            }
        inhabilitar();
        bloqueareliminar();
        bloquearmodificar();
   
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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JMenuItem editable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbuscar;
    private javax.swing.JTextField jTdd;
    private javax.swing.JTextField jTmm;
    private javax.swing.JTextField jTyyyy;
    private javax.swing.JLabel lblcodproveedor;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldireccion1;
    private javax.swing.JLabel lbldireccion2;
    private javax.swing.JLabel lbldireccion3;
    private javax.swing.JLabel lbldireccion4;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblproveedor;
    private javax.swing.JLabel lbltelefono1;
    private javax.swing.JTextField txtbuscarproveedor;
    private javax.swing.JTextField txtcodbarra;
    private javax.swing.JTextField txtgenerico;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
