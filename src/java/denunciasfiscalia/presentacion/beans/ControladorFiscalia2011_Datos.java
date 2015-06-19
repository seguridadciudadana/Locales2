/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2011;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2011_Datos {

    /**
     * Creates a new instance of ControladorFiscalia2011_Datos
     */
    private ArrayList<Fiscalia_2011> lstDatos;
    private Fiscalia_2011 datoSel;

    public ArrayList<Fiscalia_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Fiscalia_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2011 datoSel) {
        this.datoSel = datoSel;
    }    
    
    
    public ControladorFiscalia2011_Datos() {
    }

}
