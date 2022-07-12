/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.cliente.jpql;

import com.zd.sga.domain.Persona;
import com.zd.sga.domain.Usuario;
import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author jonat
 */
public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. consulta de todo los objetos de tipo persona
        log.debug("\n1.Consulta de todas las personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //2. consulta de la persona con id = ?
        log.debug("\n2. Consulta de la persona con id = ?");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
//        log.debug(persona);

        //3. consulta de la persona por nombre
        jpql = "select p from Persona p where p.nombre = 'Mario'";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //4. consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
//            log.debug("nombre: " + nombre + ", apellido: " + apellido + ", email: " + email);
        }

        //5. obtiene el objeto persona y el id, se crea un arreglo de tipo object con 2 columnas
        log.debug("\n.5 obtiene el objeto persona y el id, se crea un arreglo de tipo object con 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
//            log.debug("persona: " + persona + ", idPersona: " + idPersona);
        }

        //6. Consulta de todas las personas
        log.debug("\n6. Consulta de todas las personas");
        jpql = "select new com.zd.sga.domain.Persona( p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //7. Regresa el valor minimo y maximo del idPersona (scaler result)
        log.debug("\n6. CRegresa el valor minimo y maximo del idPersona (scaler result)");
        jpql = "select min(p.idPersona) as MindId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
//            log.debug("idMind: " + idMin + ", idMax: " + idMax + ", count: " + count);
        }

        //8. Cuenta los nombre de las personas que son distintos
        log.debug("\n8. Cuenta los nombre de las personas que son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
//        log.debug("no. de personas con nombre distinto: " + contador);

        //9. Concatena y convierte a mayusculas el nombre y apellido
        log.debug("\n9. Concatena y convierte a mayusculas el nombre y apellido");
        jpql = "select CONCAT(p.nombre, ' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for (String n : nombres) {
//            log.debug(n);
        }

        //10. Obtiene el objeto persona con id igual al parametro proporcionado
        log.debug("\n 10. Obtiene el objeto persona con id igual al parametro proporcionado");
        int idPersona = 5;
        jpql = "select p from Persona p where p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
//        log.debug(persona);

        //11. Obtiene las persona que contengan una letra A en el nombre sin importar si es mayus o minus
        log.debug("\n11. Obtiene las persona que contengan una letra A en el nombre sin importar si es mayus o minus");
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        String parametro = "%ar%";//es el caracter que urilizamos para la sentencia like 
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametro);
        personas = q.getResultList();
//        mostrarPersonas(personas);

        //12. uso de between
        log.debug("\n12. uso de between");
        jpql = "select p from Persona p where p.idPersona between 2 and 6";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //13. uso del ordenamiento
        log.debug("\n13. uso del ordenamiento");
        jpql = "select p from Persona p where p.idPersona > 1 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //14. Uso de subquery
        log.debug("\n14. Uso de subquery");
        jpql = "select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //15. Uso de join con lazy loading
        log.debug("\n15. Uso de join con lazy loading");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
//        mostrarUsuarios(usuarios);

        //16. Usp de left join con eager loading
        log.debug("\n16. Uso de left con eager loading");
        jpql = "select u from Usuario u left join fetch u.persona";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);

    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            log.debug(u);
        }

    }
}
