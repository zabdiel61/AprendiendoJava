/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.www.test;

import com.zd.www.dao.AlumnoDAO;
import com.zd.www.dao.AsignacionDAO;
import com.zd.www.dao.ContactoDAO;
import com.zd.www.dao.CursoDAO;
import com.zd.www.dao.DomicilioDAO;
import com.zd.www.domain.*;
import java.util.List;

/**
 *
 * @author jonat
 */
public class TestSga {
    
    public static void main(String[] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        System.out.println("Alumnos");
        imprimir(alumnoDAO.listar());
        
        System.out.println("********* ***************************");
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        System.out.println("Asignaciones");
        imprimir(asignacionDAO.listar());
        
        System.out.println("************************************");
        ContactoDAO contactoDAO = new ContactoDAO();
        System.out.println("Contactos");
        imprimir(contactoDAO.listar());
        
        System.out.println("************************************");
        CursoDAO cursoDAO = new CursoDAO();
        System.out.println("Cursos");
        imprimir(cursoDAO.listar());
        
        System.out.println("************************************");
        DomicilioDAO domicilioDAO = new DomicilioDAO();
        System.out.println("Domicilios");
        imprimir(domicilioDAO.listar());
        
    }
    
    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("valor = " + o);
        }
    }
    
}
