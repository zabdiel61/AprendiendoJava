/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.model;

/**
 *
 * @author jonat
 */
public class Colonia {

    private int coloniaId;
    private String nombrecolonia;
    private int codigoPostal;

    public Colonia(int coloniaId, String nombrecolonia, int codigoPostal) {
        this.coloniaId = coloniaId;
        this.nombrecolonia = nombrecolonia;
        this.codigoPostal = codigoPostal;
    }

    public Colonia() {
    }

    public int getColoniaId() {
        return coloniaId;
    }

    public void setColoniaId(int coloniaId) {
        this.coloniaId = coloniaId;
    }

    public String getNombrecolonia() {
        return nombrecolonia;
    }

    public void setNombrecolonia(String nombrecolonia) {
        this.nombrecolonia = nombrecolonia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
