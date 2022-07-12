package com.zd.sga.cliente.criteria;

import com.zd.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import org.apache.logging.log4j.*;

public class PruebaApiCriteria {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;

        //query utilizando el API de criteria
        //1. consulta de todas las personas
        //1. el objeto em crea una instancia de la clase cb
        cb = em.getCriteriaBuilder();

        //2. se crea un Objeto criteriQuery
        criteriaQuery = cb.createQuery(Persona.class);

        //3. creamos el objeto raiz del query
        fromPersona = criteriaQuery.from(Persona.class);

        //4. seleccionamos lo necesario del from
        criteriaQuery.select(fromPersona);

        //5. creamos el query typesafe
        query = em.createQuery(criteriaQuery);

        //6. ejecutamos la consulta
        personas = query.getResultList();

//        mostrarPersonas(personas);
        //2- a. Consulta de la persona con id = 1
        //jpql = "slect p form Persona p where p.idPersona = 1"
        log.debug("\n2-a. Consulta de la persona con id = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug(persona);

        //2-b. onsulta de la persona con id = 1
        log.debug("\n2-a. Consulta de la persona con id = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);

        //la clase predicate permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<>();

        //verficamos si tenemos criterios que agregar
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));

        //se agregan los criterios
        if (criterios.isEmpty()) {
            throw new RuntimeException("sin criterios");
        } else if (criterios.size() == 1) {
            criteriaQuery.where(criterios.get(0));
        } else {
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        //se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);

    }

    static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }
}
