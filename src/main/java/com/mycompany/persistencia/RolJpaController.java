/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import com.mycompany.logica.Rol;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.logica.User;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JuanC
 */
public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public RolJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public void create(Rol rol) {
        if (rol.getListaIsuarios() == null) {
            rol.setListaIsuarios(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedListaIsuarios = new ArrayList<User>();
            for (User listaIsuariosUsuarioToAttach : rol.getListaIsuarios()) {
                listaIsuariosUsuarioToAttach = em.getReference(listaIsuariosUsuarioToAttach.getClass(), listaIsuariosUsuarioToAttach.getId_usuario());
                attachedListaIsuarios.add(listaIsuariosUsuarioToAttach);
            }
            rol.setListaIsuarios(attachedListaIsuarios);
            em.persist(rol);
            for (User listaIsuariosUsuario : rol.getListaIsuarios()) {
                Rol oldRolOfListaIsuariosUsuario = listaIsuariosUsuario.getRol();
                listaIsuariosUsuario.setRol(rol);
                listaIsuariosUsuario = em.merge(listaIsuariosUsuario);
                if (oldRolOfListaIsuariosUsuario != null) {
                    oldRolOfListaIsuariosUsuario.getListaIsuarios().remove(listaIsuariosUsuario);
                    oldRolOfListaIsuariosUsuario = em.merge(oldRolOfListaIsuariosUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId_rol());
            List<User> listaIsuariosOld = persistentRol.getListaIsuarios();
            List<User> listaIsuariosNew = rol.getListaIsuarios();
            List<User> attachedListaIsuariosNew = new ArrayList<User>();
            for (User listaIsuariosNewUsuarioToAttach : listaIsuariosNew) {
                listaIsuariosNewUsuarioToAttach = em.getReference(listaIsuariosNewUsuarioToAttach.getClass(), listaIsuariosNewUsuarioToAttach.getId_usuario());
                attachedListaIsuariosNew.add(listaIsuariosNewUsuarioToAttach);
            }
            listaIsuariosNew = attachedListaIsuariosNew;
            rol.setListaIsuarios(listaIsuariosNew);
            rol = em.merge(rol);
            for (User listaIsuariosOldUsuario : listaIsuariosOld) {
                if (!listaIsuariosNew.contains(listaIsuariosOldUsuario)) {
                    listaIsuariosOldUsuario.setRol(null);
                    listaIsuariosOldUsuario = em.merge(listaIsuariosOldUsuario);
                }
            }
            for (User listaIsuariosNewUsuario : listaIsuariosNew) {
                if (!listaIsuariosOld.contains(listaIsuariosNewUsuario)) {
                    Rol oldRolOfListaIsuariosNewUsuario = listaIsuariosNewUsuario.getRol();
                    listaIsuariosNewUsuario.setRol(rol);
                    listaIsuariosNewUsuario = em.merge(listaIsuariosNewUsuario);
                    if (oldRolOfListaIsuariosNewUsuario != null && !oldRolOfListaIsuariosNewUsuario.equals(rol)) {
                        oldRolOfListaIsuariosNewUsuario.getListaIsuarios().remove(listaIsuariosNewUsuario);
                        oldRolOfListaIsuariosNewUsuario = em.merge(oldRolOfListaIsuariosNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId_rol();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
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
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId_rol();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<User> listaIsuarios = rol.getListaIsuarios();
            for (User listaIsuariosUsuario : listaIsuarios) {
                listaIsuariosUsuario.setRol(null);
                listaIsuariosUsuario = em.merge(listaIsuariosUsuario);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
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

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
