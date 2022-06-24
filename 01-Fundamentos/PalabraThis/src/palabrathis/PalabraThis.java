/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author jonat
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre:" + persona.nombre);
        System.out.println("persona nombre:" + persona.apellido);
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this= " + this);
        new Imprimir().imprimir(this);
    }
    
    
}

class Imprimir {
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
        System.out.println("this en el objeto actual= " + this);
    }
}
