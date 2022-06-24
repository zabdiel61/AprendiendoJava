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
public class Switch2 {

    public static void main(String[] args) {
        int replaced = JOptionPane.showConfirmDialog(null, "Replace existing selection?");
        String result = "?";
        switch (replaced) {
            case JOptionPane.CANCEL_OPTION:
                result = "Canceled";
                break;
            case JOptionPane.CLOSED_OPTION:
                result = "Closed";
                break;
            case JOptionPane.NO_OPTION:
                result = "No";
                break;
            case JOptionPane.YES_OPTION:
                result = "Yes";
                break;
            default:
 ;
        }
        System.out.println("Replace? " + result);
        System.out.println(replaced);
    }
}
