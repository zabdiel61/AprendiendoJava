package sa.com.zabdieldev.peliculas.utils;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonat
 */
public class SentenciaWhile {

    public static void main(String[] args) {

        while (true) {
            try {
                String leer;
                double sueldo, mayor = 0, menor = 10000;
                int i = 1, contador = 0;

                while (i <= 5) {
                    leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
                    sueldo = Double.parseDouble(leer);
                    if (sueldo < 0) {
                        JOptionPane.showMessageDialog(null, "no se permiten valores negativos, vuelva a ingresarlo");
                        continue;
                    }
                    if (sueldo > 300) {
                        contador++;
                    }
                    if (sueldo > mayor) {
                        mayor = sueldo;
                    }
                    if (sueldo < menor) {
                        menor = sueldo;
                    }
                    i++;
                }
                JOptionPane.showMessageDialog(null,
                        " El sueldo Mayor es de $: "
                        + mayor
                        + "\nEl sueldo Menor es de $: "
                        + menor
                        + "\n"
                        + contador
                        + " Empleados tienen un sueldo mayor de $300");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en algun dato de entrada",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                String seleccion = (String) JOptionPane.showInputDialog(
                        null,
                        "Desea Salir",
                        "Seleccione una opcion",
                        JOptionPane.QUESTION_MESSAGE,
                        null, // null para icono defecto
                        new Object[]{"Si", "No"},
                        "si");
                if (seleccion.equals("Si")) {
                    System.exit(0);
                } //fin if
            }// fin catch
        } // fin main
    }// fin while
}
