/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author jonat
 */
public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        int vol = this.ancho * this.alto * this.profundo;
        return vol;
    }
}
