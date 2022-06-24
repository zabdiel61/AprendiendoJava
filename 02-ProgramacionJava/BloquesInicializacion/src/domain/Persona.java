/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author jonat
 */
public class Persona {
    private final int idPersona;
    
    private static int contadorPersonas;
    
    
    static {
        System.out.println("Ejecucion bloque statico");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona() {
        System.out.println("ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
