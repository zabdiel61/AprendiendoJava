/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.mundopc;

/**
 *
 * @author jonat
 */
public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    public Raton() {
        this.idRaton = ++Raton.contadorRatones;
    }

    public Raton(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", DispositivoEntrada {").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }
}
