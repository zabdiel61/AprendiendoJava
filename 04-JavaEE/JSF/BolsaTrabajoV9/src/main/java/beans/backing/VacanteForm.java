/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.backing;

import beans.helper.ColoniaHelper;
import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
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

    private boolean comentarioEnviado;

    @Inject
    private ColoniaHelper coloniaHelper;

    Logger log = LogManager.getRootLogger();

    public VacanteForm() {
        log.info("Creando vacanteForm");
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("juan")) {
            if (this.candidato.getApellido().equals("perez")) {
                String msg = "Gracias, pero Juan ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            log.info("Entrando al caso de exito");
            return "exito";
        } else {
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }

    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        //objeto para acceder a los componenetes de jsf
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        //getnewValue regresa un tipo Long
        int nuevoCodigoPostal = ((Long) valueChangeEvent.getNewValue()).intValue();

        UIInput coloniaIdInputText = (UIInput) uIViewRoot.findComponent("vacanteForm:coloniaId");
        int coloniaId = this.coloniaHelper.getColoniaIdPorCodigoPostal(nuevoCodigoPostal);
        coloniaIdInputText.setValue(coloniaId);
        coloniaIdInputText.setSubmittedValue(coloniaId);

        UIInput ciudadInputText = (UIInput) uIViewRoot.findComponent("vacanteForm:ciudad");
        String nuevaCiudad = "Ciudad de Mexico";
        ciudadInputText.setValue(nuevaCiudad);
        ciudadInputText.setSubmittedValue(nuevaCiudad);

        facesContext.renderResponse();
    }

    public void ocultarComentario(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public ColoniaHelper getColoniaHelper() {
        return coloniaHelper;
    }

    public void setColoniaHelper(ColoniaHelper coloniaHelper) {
        this.coloniaHelper = coloniaHelper;
    }

}
