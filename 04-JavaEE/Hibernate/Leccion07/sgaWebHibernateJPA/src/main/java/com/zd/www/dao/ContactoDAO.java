package com.zd.www.dao;

import static com.zd.www.dao.GenericDAO.em;
import com.zd.www.domain.Contacto;
import java.util.List;
import javax.persistence.Query;

public class ContactoDAO extends GenericDAO {

    public List<Contacto> listar() {
        String hql = "SELECT c FROM Contacto c";
        em = getEntityManager();
        Query q = em.createQuery(hql);
        return q.getResultList();
    }

    public void insertar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
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

    public void modificar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contacto);
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

    public Contacto buscarPorId(Contacto contacto) {
        em = getEntityManager();
        return em.find(Contacto.class, contacto.getIdContacto());
    }

    public void eliminar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
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
