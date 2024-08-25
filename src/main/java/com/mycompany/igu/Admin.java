package com.mycompany.igu;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.User;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    Controladora control = null;
    User usr;

    public Admin(Controladora control, User usr) { //Pasamos controladora para no crear muchas instancias y pasamos Usuario para tener el nombre del TxtBienvenida
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BtnCrearUsuario = new javax.swing.JButton();
        BtnBorrarUsuario = new javax.swing.JButton();
        BtnRecargarTabla = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEditarUsuario = new javax.swing.JButton();
        TxtBienvenida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAdmin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        BtnCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnCrearUsuario.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnCrearUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\agregar-contacto.png")); // NOI18N
        BtnCrearUsuario.setText("Crear Nuevo Usuario");
        BtnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearUsuarioActionPerformed(evt);
            }
        });

        BtnBorrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnBorrarUsuario.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnBorrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnBorrarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\eliminar.png")); // NOI18N
        BtnBorrarUsuario.setText("Borrar Usuario");
        BtnBorrarUsuario.setMargin(new java.awt.Insets(2, 14, 3, 50));
        BtnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarUsuarioActionPerformed(evt);
            }
        });

        BtnRecargarTabla.setBackground(new java.awt.Color(255, 255, 255));
        BtnRecargarTabla.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnRecargarTabla.setForeground(new java.awt.Color(0, 0, 0));
        BtnRecargarTabla.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\actualizar.png")); // NOI18N
        BtnRecargarTabla.setText("Recargar Tabla");
        BtnRecargarTabla.setMargin(new java.awt.Insets(2, 14, 3, 45));
        BtnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargarTablaActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(0, 0, 0));
        BtnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\salida-de-emergencia.png")); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setMargin(new java.awt.Insets(2, 14, 3, 120));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEditarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnEditarUsuario.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnEditarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnEditarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\Login\\imagenes\\perfil.png")); // NOI18N
        BtnEditarUsuario.setText("Editar Usuario");
        BtnEditarUsuario.setAlignmentX(0.1F);
        BtnEditarUsuario.setMargin(new java.awt.Insets(1, 14, 3, 55));
        BtnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarUsuarioActionPerformed(evt);
            }
        });

        TxtBienvenida.setBackground(new java.awt.Color(204, 204, 204));
        TxtBienvenida.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        TxtBienvenida.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtBienvenida))
                    .addComponent(BtnCrearUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRecargarTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBorrarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(BtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema Administrador de Usuarios");

        TablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaAdmin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        TxtBienvenida.setText("Bienvenido: " + this.usr.getNombreUsuario());
        TxtBienvenida.setEditable(false);
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioActionPerformed
        CrearUser nuevoUsuario = new CrearUser(control);
        nuevoUsuario.setVisible(true);
        nuevoUsuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnCrearUsuarioActionPerformed

    private void BtnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarUsuarioActionPerformed

        //Validamos que la tabla tenga elementos
        if (TablaAdmin.getRowCount() > 0) {
            //Controlamos que se haya selecionado un elementos
            if (TablaAdmin.getSelectedRow() != -1) {
                //Obtenemos el id del elemento seleccionado
                int id_usuario = Integer.parseInt(String.valueOf(TablaAdmin.getValueAt(TablaAdmin.getSelectedRow(), 0)));
                //Llamo al metodo borrar
                control.borrarUsuario(id_usuario);

                mostrarMensaje("Se borró el usuario correctamente", "Info", "Eliminacion correcta");
                cargarTabla();
            } else {
                mostrarMensaje("No seleccionó ningún registro", "Error", "Error al borrar");
            }
        } else {
            mostrarMensaje("La tabla esta vacía", "Error", "Tabla vacía");

        }
    }//GEN-LAST:event_BtnBorrarUsuarioActionPerformed

    private void BtnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_BtnRecargarTablaActionPerformed

    private void BtnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarUsuarioActionPerformed
        //Validamos que la tabla tenga elementos
        if (TablaAdmin.getRowCount() > 0) {
            //Controlamos que se haya selecionado un elementos
            if (TablaAdmin.getSelectedRow() != -1) {
                //Obtenemos el id del elemento seleccionado
                int id_usuario = Integer.parseInt(String.valueOf(TablaAdmin.getValueAt(TablaAdmin.getSelectedRow(), 0)));
                //Llamo a la ventana de edición
                ModificarUser mu = new ModificarUser(control, id_usuario);
                mu.setVisible(true);
                mu.setLocationRelativeTo(null);
                
                
            } else {
                mostrarMensaje("No seleccionó ningún registro", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("La tabla esta vacía", "Error", "Tabla vacía");

        }
    }//GEN-LAST:event_BtnEditarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarUsuario;
    private javax.swing.JButton BtnCrearUsuario;
    private javax.swing.JButton BtnEditarUsuario;
    private javax.swing.JButton BtnRecargarTabla;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablaAdmin;
    private javax.swing.JTextField TxtBienvenida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

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

        TablaAdmin.setModel(modeloTabla);
    }

}
