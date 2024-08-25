package com.mycompany.logica;

import com.mycompany.logica.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-30T23:15:41", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Integer> id_rol;
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile ListAttribute<Rol, User> listaIsuarios;

}