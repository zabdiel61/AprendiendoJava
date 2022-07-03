/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jonat
 */
@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;
    
    Logger log = LogManager.getRootLogger();

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar(){
        if (this.candidato.getNombre().equals("juan")) {
            log.info("Entrando al caso de exito");
            return "exito";
        } else{
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }
}
