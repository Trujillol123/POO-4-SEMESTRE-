/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import TiendaZapatos.DAOCategoriasImpl;
import TiendaZapatos.DAOMarcaImpl;
import TiendaZapatos.DAOProveedoresImpl;
import TiendaZapatos.DAOTallaImpl;
import TiendaZapatos.dashboard;
import interfaces.DAOCategoria;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.categoria;
import models.marca;
import models.proveedor;
import models.talla;

/**
 *
 * @author cland
 */
public class NewZapato extends javax.swing.JPanel {

    /**
     * Creates new form UpZapato
     */
    public NewZapato() {
        initComponents();
        initStyles ();
        obtenerTallas ();
        cargarCategorias ();
        cargarTallas ();
        cargarMarcas();
        cargarProveedores ();
        obtenerMarcas();
        obtenerCategorias ();
        obtenerProveedores ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        lblCategoria15 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtZapatoid20 = new javax.swing.JTextField();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtZapatoid21 = new javax.swing.JTextField();
        combocategoria = new javax.swing.JComboBox<>();
        txtZapatoid22 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        combomarcas = new javax.swing.JComboBox<>();
        combotallas = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblCategoria16 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtZapatoid23 = new javax.swing.JTextField();
        comboproveedores = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        lblCategoria17 = new javax.swing.JLabel();
        txtNombre5 = new javax.swing.JTextField();
        btnSubir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton1");

        Background.setBackground(new java.awt.Color(255, 153, 153));
        Background.setPreferredSize(new java.awt.Dimension(888, 405));

        lblCategoria15.setText("CATEGORIA");

        jLabel42.setText("TALLA");

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      ", "BLANCO", "NEGRO", "ROSADO", "AZUL OSCURO", "GRIS", "AZUL CLARO", "VERDE ", "ROJO", "LILA", "MORADO", " " }));

        jLabel43.setText("NOMBRE");

        jLabel44.setText("COLOR");

        combocategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocategoriaActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLimpiar.setText("LIMPIAR");

        jLabel41.setText("CANTIDAD");

        jLabel45.setText("DESCRIPCION");

        Titulo.setText("SUBIR NUEVO PRODUCTO");

        lblCategoria16.setText("PROVEEDOR");

        jLabel47.setText("PRECIO");

        jLabel48.setText("ZAPATO ID");

        lblCategoria17.setText("MARCA");

        btnSubir.setText("SUBIR");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combocategoria, 0, 274, Short.MAX_VALUE)
                            .addComponent(lblCategoria17, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combomarcas, 0, 274, Short.MAX_VALUE)
                            .addComponent(lblCategoria16, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboproveedores, 0, 274, Short.MAX_VALUE)
                            .addComponent(txtZapatoid20))
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZapatoid21, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZapatoid23, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combotallas, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZapatoid22, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(txtNombre5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(txtZapatoid20)
                        .addGap(0, 0, 0)
                        .addComponent(lblCategoria15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(combocategoria)
                        .addGap(0, 0, 0)
                        .addComponent(lblCategoria17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(combomarcas)
                        .addGap(0, 0, 0)
                        .addComponent(lblCategoria16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(comboproveedores))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(txtZapatoid21)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(txtZapatoid23)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(combotallas)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox28)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(txtZapatoid22))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
    }
    
    
    private void combocategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocategoriaActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        dashboard.getInstance().showJpanel(new GestionProductos());
    }//GEN-LAST:event_btnAtrasActionPerformed

    public List<talla> obtenerTallas() {
         DAOTallaImpl daoTalla = new DAOTallaImpl();
        List<talla> tallas = new ArrayList<>(); // Crear una lista para almacenar las tallas

        try {
            tallas = daoTalla.getallTallas(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las tallas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return tallas; // Retornar la lista de tallas
    }
  
    private void cargarTallas() {
        List<talla> listatalla = obtenerTallas(); // Método que obtiene las tallas
        for (talla t : listatalla) {
            combotallas.addItem(t); // Agregar cada marca al JComboBox
        }
    }
    
    public List<marca> obtenerMarcas() {
        DAOMarcaImpl daoMarca = new DAOMarcaImpl();
        List<marca> marcas = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            marcas = daoMarca.getAllMarcas(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return marcas; // Retornar la lista de marcas
    }

    private void cargarMarcas() {
        List<marca> listaMarcas = obtenerMarcas(); // Método que obtiene las marcas
        for (marca m : listaMarcas) {
            combomarcas.addItem(m); // Agregar cada marca al JComboBox
        }
    }
    
    public List<categoria> obtenerCategorias() {
        DAOCategoriasImpl daocategoria = new DAOCategoriasImpl();
        List<categoria> categorias = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            categorias = daocategoria.getallCategorias(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return categorias; // Retornar la lista de marcas
    }

    private void cargarCategorias() {
        List<categoria> listaCategorias = obtenerCategorias(); // Método que obtiene las marcas
        for (categoria c : listaCategorias) {
            combocategoria.addItem(c); // Agregar cada marca al JComboBox
        }
    }
    
    public List<proveedor> obtenerProveedores() {
        DAOProveedoresImpl daoProveedor = new DAOProveedoresImpl();
        List<proveedor> proveedores = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            proveedores = daoProveedor.getAllProveedores(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return proveedores; // Retornar la lista de marcas
    }
    private void cargarProveedores() {
    comboproveedores.addItem(new proveedor(0, "")); // Agregar un valor en blanco o por defecto
    
    List<proveedor> listaproveedor = obtenerProveedores(); // Método que obtiene los proveedores
    for (proveedor p : listaproveedor) {
        comboproveedores.addItem(p); // Agregar cada proveedor al JComboBox
    }
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JComboBox<categoria> combocategoria;
    private javax.swing.JComboBox<marca> combomarcas;
    private javax.swing.JComboBox<proveedor> comboproveedores;
    private javax.swing.JComboBox<talla> combotallas;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCategoria15;
    private javax.swing.JLabel lblCategoria16;
    private javax.swing.JLabel lblCategoria17;
    private javax.swing.JTextField txtNombre5;
    private javax.swing.JTextField txtZapatoid20;
    private javax.swing.JTextField txtZapatoid21;
    private javax.swing.JTextField txtZapatoid22;
    private javax.swing.JTextField txtZapatoid23;
    // End of variables declaration//GEN-END:variables
}
