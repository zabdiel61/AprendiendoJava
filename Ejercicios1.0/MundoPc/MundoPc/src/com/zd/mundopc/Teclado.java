/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.mundopc;

/**
 *
 * @author jonat
 */
public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado() {
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public Teclado(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", DispositivoEntrada {").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }

}
