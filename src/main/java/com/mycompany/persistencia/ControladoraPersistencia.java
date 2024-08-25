package com.mycompany.persistencia;

import com.mycompany.logica.Rol;
import com.mycompany.logica.User;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    public List<User> traerUsuarios() {
        
        return usuJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public Rol traerRol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearUsuario(User usu) {
        usuJpa.create(usu);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User traerUsuario(int id_Usu) {
        return usuJpa.findUsuario(id_Usu);
    }
    
}
