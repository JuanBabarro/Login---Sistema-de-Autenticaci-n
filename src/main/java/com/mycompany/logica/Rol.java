package com.mycompany.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_rol;
    
    @Basic
    private String nombreRol;
    private String descripcion;
    
    @OneToMany (mappedBy = "rol") //Un rol puede tener muchos usuarios asignados
    private List<User> listaIsuarios;

    
    public Rol() {
    }

    public Rol(int id_rol, String nombreRol, String descripcion, List<User> listaIsuarios) {
        this.id_rol = id_rol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaIsuarios = listaIsuarios;
    }

    public List<User> getListaIsuarios() {
        return listaIsuarios;
    }

    public void setListaIsuarios(List<User> listaIsuarios) {
        this.listaIsuarios = listaIsuarios;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
