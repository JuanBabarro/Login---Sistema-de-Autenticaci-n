package com.mycompany.igu;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.User;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Controladora control = null;
    User usr = null;

    public Principal() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BtnLogin = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaMensaje = new javax.swing.JTextArea();
        BtnLimpiar = new javax.swing.JButton();
        TxtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");

        TxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        BtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        BtnLogin.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(0, 0, 0));
        BtnLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Downloads\\candado-abierto.png")); // NOI18N
        BtnLogin.setText(" Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TxtAreaMensaje.setBackground(new java.awt.Color(255, 255, 255));
        TxtAreaMensaje.setColumns(20);
        TxtAreaMensaje.setForeground(new java.awt.Color(0, 0, 0));
        TxtAreaMensaje.setRows(5);
        jScrollPane1.setViewportView(TxtAreaMensaje);

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BtnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Downloads\\limpieza-de-datos.png")); // NOI18N
        BtnLimpiar.setText(" Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        TxtContraseña.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed

        String usuario = TxtUsuario.getText();
        String contrasenia = TxtContraseña.getText();

        if (usuario.isEmpty() || contrasenia.isEmpty()) {

            // Si algun campo esta vacio manda un mensaje de errror
            String mensajeError = "Todos los campos deben estar completos!";
            JOptionPane optionPane = new JOptionPane(mensajeError, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        } else {

            //String mensaje = control.validarUsuario(usuario, contrasenia);
            //TxtAreaMensaje.setText(mensaje);
            usr = control.validarUsuario(usuario, contrasenia);

            if (usr != null) {
                String rol = usr.getRol().getNombreRol();
                if (rol.equals("Admin")) {
                    Admin ad = new Admin(control, usr); // le pasamos la controladora para no generar muchas instancias  de la interfaz admin 
                    ad.setVisible(true);
                    ad.setLocationRelativeTo(null);
                    //this.setVisible(false);
                }
                if (rol.equals("User")) {
                    Usuario us = new Usuario(control, usr); // le pasamos la controladora para no generar muchas instancias  de la interfaz usuario
                    us.setVisible(true);
                    us.setLocationRelativeTo(null);
                    //this.setVisible(false);
                }
            }

        }

    }//GEN-LAST:event_BtnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextArea TxtAreaMensaje;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {

        TxtUsuario.setText("");
        TxtContraseña.setText("");
        TxtAreaMensaje.setText("");

    }

}
