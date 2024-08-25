package com.mycompany.igu;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Usuario extends javax.swing.JFrame {
    
    Controladora control = null;
    User usr = null;
    
    public Usuario(Controladora control, User usr) { //Pasamos controladora para no crear muchas instancias y pasamos Usuario para tener el nombre del TxtBienvenida
        initComponents();
        this.control = control;
        this.usr = usr;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        BtnSalir = new javax.swing.JButton();
        BtnRecargarTabla = new javax.swing.JButton();
        TxtBienvenida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de Usuarios Registrados");

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        BtnSalir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(0, 0, 0));
        BtnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\salida-de-emergencia.png")); // NOI18N
        BtnSalir.setText(" Salir");
        BtnSalir.setMargin(new java.awt.Insets(2, 14, 3, 80));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnRecargarTabla.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnRecargarTabla.setForeground(new java.awt.Color(0, 0, 0));
        BtnRecargarTabla.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\actualizar.png")); // NOI18N
        BtnRecargarTabla.setText("Recargar Tabla");
        BtnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargarTablaActionPerformed(evt);
            }
        });

        TxtBienvenida.setBackground(new java.awt.Color(204, 204, 204));
        TxtBienvenida.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        TxtBienvenida.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnRecargarTabla)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(TxtBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TxtBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        TxtBienvenida.setText("Bienvenido/a " + usr.getNombreUsuario());
    }//GEN-LAST:event_formWindowOpened

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_BtnRecargarTablaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRecargarTabla;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JTextField TxtBienvenida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecemos los nombres de las columnas
        String titulos[] = {"ID", "USUARIO", "ROL"};
        modeloTabla.setColumnIdentifiers(titulos);

        //traer de la base de datos la lista de usuarios
        List<User> listausuarios = control.traerUsuarios();
        
        if (listausuarios != null) {
            for (User usu : listausuarios) {
                
                Object[] objeto = {usu.getId_usuario(), usu.getNombreUsuario(), usu.getRol().getNombreRol()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        TablaUsuario.setModel(modeloTabla);
    }
}
