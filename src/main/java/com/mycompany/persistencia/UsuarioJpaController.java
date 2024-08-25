/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.logica.Rol;
import com.mycompany.logica.User;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JuanC
 */
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public UsuarioJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public void create(User usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol = usuario.getRol();
            if (rol != null) {
                rol = em.getReference(rol.getClass(), rol.getId_rol());
                usuario.setRol(rol);
            }
            em.persist(usuario);
            if (rol != null) {
                rol.getListaIsuarios().add(usuario);
                rol = em.merge(rol);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(User usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User persistentUsuario = em.find(User.class, usuario.getId_usuario());
            Rol rolOld = persistentUsuario.getRol();
            Rol rolNew = usuario.getRol();
            if (rolNew != null) {
                rolNew = em.getReference(rolNew.getClass(), rolNew.getId_rol());
                usuario.setRol(rolNew);
            }
            usuario = em.merge(usuario);
            if (rolOld != null && !rolOld.equals(rolNew)) {
                rolOld.getListaIsuarios().remove(usuario);
                rolOld = em.merge(rolOld);
            }
            if (rolNew != null && !rolNew.equals(rolOld)) {
                rolNew.getListaIsuarios().add(usuario);
                rolNew = em.merge(rolNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = usuario.getId_usuario();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User usuario;
            try {
                usuario = em.getReference(User.class, id);
                usuario.getId_usuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            Rol rol = usuario.getRol();
            if (rol != null) {
                rol.getListaIsuarios().remove(usuario);
                rol = em.merge(rol);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<User> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<User> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<User> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public User findUsuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<User> rt = cq.from(User.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
