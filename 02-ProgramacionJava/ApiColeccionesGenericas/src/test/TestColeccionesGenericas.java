/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jonat
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
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

        String elemento1 = miLista.get(0);
        System.out.println("elemento1 = " + elemento1);

        System.out.println("****************");
        imprimir(miLista);
        System.out.println("***************");
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo"); //desecha el duplicado

        imprimir(miSet);
        System.out.println("**************");
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Zabdiel");
        miMapa.put("valor2", "Zabdie");
        miMapa.put("valor3", "Zabdi");
        miMapa.put("valor3", "Zabd");

        String elemento = miMapa.get("valor3");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(action -> {
            System.out.println(action);
        });
    }
}
