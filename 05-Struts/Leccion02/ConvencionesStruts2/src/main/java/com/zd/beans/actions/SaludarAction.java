package com.zd.beans.actions;


import org.apache.logging.log4j.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonat
 */
public class SaludarAction {

    Logger log = LogManager.getLogger(SaludarAction.class);

    private String saludosAtr;
    
    public String execute(){
        log.info("ejecutando metodo excute desde struts2");
        this.saludosAtr = "Hola edfkbngajkhs";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }

}
