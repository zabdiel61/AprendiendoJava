/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Condicionales {

    public static void main(String[] args) {
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;

        if (resultado) {
            System.out.println("dentro de rango");
        } else {
            System.out.println("fuera de rango");
        }

        var vacaciones = false;
        var disDescanso = false;

        if (vacaciones || disDescanso) {
            System.out.println("padre puede asistir al juego del hijo");
        } else {
            System.out.println("el padre esta ocupado");
        }
    }
}
