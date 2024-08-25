package com.mycompany.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    
    @Id
   //Comentamos el Generated para poder usar el metodo buscarIdDelUltimoUsuario en el controlador y asi asignarlo sin necesitad del Generated
   //@GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private int id_usuario;
    
    @Basic
    private String nombreUsuario;
    private String contraseña;
    
    @ManyToOne // muchos usuarios pueden estar asignados a un rol
    @JoinColumn(name="fk_rol")
    private Rol rol;

    public User() {
    }

    public User(int id_usuario, String nombreUsuario, String contraseña, Rol rol) {
        this.id_usuario = id_usuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
