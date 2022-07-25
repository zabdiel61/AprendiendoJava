package com.zd.www.dao;

import com.zd.www.domain.Domicilio;
import java.util.List;
import javax.persistence.Query;

public class DomicilioDAO extends GenericDAO {

    public List<Domicilio> listar() {
        String hql = "SELECT d FROM Domicilio d";
        em = getEntityManager();
        Query q = em.createQuery(hql);
        return q.getResultList();
    }

    public void insertar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Domicilio buscarPorId(Domicilio d) {
        em = getEntityManager();
        return em.find(Domicilio.class, d.getIdDomicilio());
    }

    public void eliminar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(d));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
