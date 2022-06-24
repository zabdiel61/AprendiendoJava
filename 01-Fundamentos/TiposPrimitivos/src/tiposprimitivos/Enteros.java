/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author zabdiel
 */
public class Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        tipos de numeros primitivos enteros: byte, short, int, long
         */
        //byte
        byte numeroByte = 10;
        System.out.println("valor minimo Byte = " + Byte.MIN_VALUE); //-127
        System.out.println("valor maximo Byte = " + Byte.MAX_VALUE); //127 

        byte numeroByte2 = (byte) 129; //perdida de precision

        //short
        short numeroShort = 10;
        System.out.println("valor minimo de short = " + Short.MIN_VALUE);
        System.out.println("valor maximo de short = " + Short.MAX_VALUE);

        short numeroShort2 = (short) 32768; //perdida de precision

        //int
        int numeroInt = 10;
        System.out.println("valor minimo de int = " + Integer.MIN_VALUE);
        System.out.println("valor maximo de int = " + Integer.MAX_VALUE);

        int numeroint2 = (int)2147483648L; //Long
        System.out.println("numeroint2 = " + numeroint2); //sale como negativo por la perdida de precision 
        
        //long
        long numeroLong = 10;
        System.out.println("valor minimo de Long = " + Long.MIN_VALUE);
        System.out.println("valor maximo de Long = " + Long.MAX_VALUE);

        long numeroLong3 = (long)9223372036854775807L; //esto equivale a un tipo long
        long numeroLong2 = (long)9223372036854775808F; //muy grande, por eso solo se puede con un tipo flotante
        System.out.println("numeroint2 = " + numeroint2); //sale como negativo por la perdida de precision 
    }

}
