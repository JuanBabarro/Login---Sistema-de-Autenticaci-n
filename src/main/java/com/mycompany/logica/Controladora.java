package com.mycompany.logica;

import com.mycompany.igu.Usuario;
import com.mycompany.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = null;

    //Creamos este constructor para evitar el error de no reconocer usuarios
    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public User validarUsuario(String usuario, String contrasenia) {

        // String mensaje = "";
        User usr = null;
        List<User> listaUsuario = controlPersis.traerUsuarios();

        for (User usu : listaUsuario) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContraseña().equals(contrasenia)) {
                    //mensaje = "Usuario y contraseña correctos. ¡Bienvenido/a!";
                    usr = usu;
                    return usr;
                } else {
                    //mensaje = "¡Contraseña incorrecta!";
                    usr = usu;
                    return usr;
                }
            } else {
                //Este mensaje no tiene que tener return ya que genera conflicto en el TextArea
                //mensaje = "¡Usuario no encontrado!";
                usr = null;
                //return usr;
            }
        }

        return usr; //mensaje;

    }

    public String validarRol(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<User> traerUsuarios() {

        List<User> listaUsuario = controlPersis.traerUsuarios();
        return listaUsuario;

    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();

    }

    public void crearUsuario(String nombreUsuario, String contrasenia, String rol) {

        //Creamos el nuevo usuario
        User usu = new User();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContraseña(contrasenia);

        //Creamos el rol del nuevo usuario
        Rol r = new Rol();
        r = this.traerRol(rol);

        //Agregamos el rol al nuevo usuario
        if (rol != null) {
            usu.setRol(r);
        }
        
        //Creamos este metodo para solucionar el problema de ID duplicado ya que hicimos registros en la BD anteriormente
        int id = this.buscarUltimaIdUsuarios(); 
        usu.setId_usuario(id+1);
        
        controlPersis.crearUsuario(usu);

    }

    private Rol traerRol(String rol) {
       List<Rol> listaRoles = controlPersis.traerRoles();
       
       for(Rol roles : listaRoles){
           if(roles.getNombreRol().equals(rol))
               return roles;
       }
       return null;

    }

    private int buscarUltimaIdUsuarios() {
        List<User> listaUsuarios = this.traerUsuarios();
        User usu = listaUsuarios.get(listaUsuarios.size()-1);
        return usu.getId_usuario();
               
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public User traerUsuario(int id_Usu) {
         User usuario = controlPersis.traerUsuario(id_Usu);
         return usuario;
    }

    public void modificarUser(User usuario, String nombreUsuario, String contrasenia, String rol) {
            
    }

}
