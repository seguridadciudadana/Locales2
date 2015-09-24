/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.presentacion.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import master.presentacion.beans.SesionUsuarioDataManager;
import org.primefaces.model.UploadedFile;
import recursos.Util;
import repositorio.logica.clases.Documento;
import repositorio.logica.funciones.FDocumento;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class DocumentoBean implements Serializable {

    private Documento objDocumento;
    private ArrayList<Documento> lstDocumento;
    private Documento documentoSel;
    @ManagedProperty(value = "#{sesionUsuarioDataManager}")
    private SesionUsuarioDataManager dm;
    private int estadoSel;
    private String nombreDocumento;
    private UploadedFile archivoDocumento;
    //cargar configuracion del  path
    java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("recursos.rutasMedia");
    
    
    /*
    * getters y setters
    */

    public Documento getObjDocumento() {
        return objDocumento;
    }

    public void setObjDocumento(Documento objDocumento) {
        this.objDocumento = objDocumento;
    }

    public ArrayList<Documento> getLstDocumento() {
        return lstDocumento;
    }

    public void setLstDocumento(ArrayList<Documento> lstDocumento) {
        this.lstDocumento = lstDocumento;
    }

    public Documento getDocumentoSel() {
        return documentoSel;
    }

    public void setDocumentoSel(Documento documentoSel) {
        this.documentoSel = documentoSel;
    }

    public SesionUsuarioDataManager getDm() {
        return dm;
    }

    public void setDm(SesionUsuarioDataManager dm) {
        this.dm = dm;
    }

    public int getEstadoSel() {
        return estadoSel;
    }

    public void setEstadoSel(int estadoSel) {
        this.estadoSel = estadoSel;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public UploadedFile getArchivoDocumento() {
        return archivoDocumento;
    }

    public void setArchivoDocumento(UploadedFile archivoDocumento) {
        this.archivoDocumento = archivoDocumento;
    }

    public ResourceBundle getConfiguracion() {
        return Configuracion;
    }

    public void setConfiguracion(ResourceBundle Configuracion) {
        this.Configuracion = Configuracion;
    }
    
    
    

    public DocumentoBean() {
    }

    
    /*
    * métodos 
    */
    
    public void cargarDocumento() {
        try {
            lstDocumento = FDocumento.obtenerDocumentos();
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }

    }
    
    
}
