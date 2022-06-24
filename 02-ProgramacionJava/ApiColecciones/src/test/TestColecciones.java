package test;

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonat
 */
public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        
        miLista.forEach(dias -> {
            System.out.println(dias);
        });
        System.out.println("****************");
        imprimir(miLista);
        System.out.println("***************");
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo"); //desecha el duplicado
        
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Zabdiel");
        miMapa.put("valor2", "Zabdie");
        miMapa.put("valor3", "Zabdi");
        
        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
    }

    public static void imprimir(Collection coleccion){
        coleccion.forEach(action -> {
            System.out.println(action);
        });
    }
}
