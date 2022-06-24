/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author jonat
 */
public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    protected static int contadorCliente;
    
    public Cliente(){
        this.idCliente = ++Cliente.contadorCliente;
    }

    public Cliente(String nombre, Date fechaRegistro, boolean vip) {
//        super(nombre);
        this();
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
//        super(nombre, genero, edad, direccion);
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", Persona {").append(super.toString()).append("}");
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }

    
}
