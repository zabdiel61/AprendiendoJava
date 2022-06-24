/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author jonat
 */
public class TestClasesAbstractas {

    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        figura.dibujar();
    }
}
