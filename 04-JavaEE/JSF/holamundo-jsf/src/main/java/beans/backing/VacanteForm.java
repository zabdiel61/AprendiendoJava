/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.*;

/**
 *
 * @author jonat
 */
@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar(){
        if (this.candidato.getNombre().equals("juan")) {
            return "exito";
        } else{
            return "fallo";
        }
    }
}
