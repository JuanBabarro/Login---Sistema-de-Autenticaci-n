package com.mycompany.logica;

import com.mycompany.logica.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-30T23:15:41", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> id_usuario;
    public static volatile SingularAttribute<User, String> nombreUsuario;
    public static volatile SingularAttribute<User, Rol> rol;
    public static volatile SingularAttribute<User, String> contraseña;

}