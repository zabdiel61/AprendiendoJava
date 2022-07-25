package com.zd.www.dao;

import static com.zd.www.dao.GenericDAO.em;
import com.zd.www.domain.Curso;
import java.util.List;
import javax.persistence.Query;

public class CursoDAO extends GenericDAO {

    public List<Curso> listar() {
        String hql = "SELECT c FROM Curso c";
        em = getEntityManager();
        Query q = em.createQuery(hql);
        return q.getResultList();
    }

    public void insertar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curso);
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

    public void modificar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
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

    public Curso buscarPorId(Curso curso) {
        em = getEntityManager();
        return em.find(Curso.class, curso.getIdCurso());
    }

    public void eliminar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(curso));
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
