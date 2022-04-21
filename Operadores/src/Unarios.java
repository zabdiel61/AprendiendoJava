/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Unarios {

    public static void main(String[] args) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //incremento
        //1. preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa su calor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2.postincremento (simbilo o aprerador despues de la variable)
        var g = 5;
        var h = g++; // primero se utiliza el valor de la variable y despues se incrmenta
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1. predecremento (simbolo antes de la variable)
        var i = 2;
        var j = --i;//primero se decrementa la variable y despues se usa su calor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //2.postincremento (simbilo o aprerador despues de la variable)
        var k = 5;
        var l = k--; // primero se utiliza el valor de la variable y despues se decrmenta
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
