/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.managedbean;

import com.util.JsfUtil;
import java.util.ResourceBundle;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;

/**
 *
 * @author jonat
 */
@Named(value = "login")
@RequestScoped
public class Login {

    /**
     * Creates a new instance of Login
     */
    public Login() {
    }

    @ManagedProperty("#{language}")
    private Language idioma;

    private String nombre = "zabdiel";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Language getIdioma() {
        return idioma;
    }

    public void setIdioma(Language idioma) {
        this.idioma = idioma;
    }
    private String usuario;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String validar() {
        if (getUsuario().equals("Rafael") && getPassword().equals("Torres")) {
            // ResourceBundle resourceBundle = ResourceBundle.getBunndle("ResourceBundle", Locale.getDefault());
            JsfUtil.addSucessMessage(ResourceBundle.getBundle("/Bundle", idioma.getLocale()
            ).getString("LoginCorrecto"));
            return "login1";
        } else {

            JsfUtil.addErrorMessage(ResourceBundle.getBundle("/Bundle", idioma.getLocale()).
                    getString("LoginError"));
            return null;
        }
    }

}
