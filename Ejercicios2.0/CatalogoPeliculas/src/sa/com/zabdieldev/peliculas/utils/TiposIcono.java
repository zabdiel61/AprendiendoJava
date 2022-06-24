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
public class TiposIcono {

    public static void main(String[] args) {
        //default title and icon
        JOptionPane.showMessageDialog(
                null,
                "Informacion", "Mensaje De Informacion",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(
                null,
                "Advertencia",
                "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(
                null,
                "Error",
                "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(
                null,
                "Sin Icono", "Mensaje de Texto Plano",
                JOptionPane.PLAIN_MESSAGE);
    }
}
