/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011_spa;
import geoportal.logica.funciones.FVif_2011_spa;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2011_spaControlador {

    /**
     * Creates a new instance of Vif_2011_spaControlador
     */
    private Vif_2011_spa objVif_2011_spa;
    private Vif_2011_spa objVif_2011_spaSel;
    private ArrayList<Vif_2011_spa> lstVif_2011_spa;
    private boolean mostrarActualizar;

    public Vif_2011_spa getObjVif_2011_spa() {
        return objVif_2011_spa;
    }

    public void setObjVif_2011_spa(Vif_2011_spa objVif_2011_spa) {
        this.objVif_2011_spa = objVif_2011_spa;
    }

    public Vif_2011_spa getObjVif_2011_spaSel() {
        return objVif_2011_spaSel;
    }

    public void setObjVif_2011_spaSel(Vif_2011_spa objVif_2011_spaSel) {
        this.objVif_2011_spaSel = objVif_2011_spaSel;
    }

    public ArrayList<Vif_2011_spa> getLstVif_2011_spa() {
        return lstVif_2011_spa;
    }

    public void setLstVif_2011_spa(ArrayList<Vif_2011_spa> lstVif_2011_spa) {
        this.lstVif_2011_spa = lstVif_2011_spa;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public Vif_2011_spaControlador() {
        this.reinit();
    }

    private void reinit() {
        this.objVif_2011_spa = new Vif_2011_spa();
        this.lstVif_2011_spa = new ArrayList<Vif_2011_spa>();
        this.objVif_2011_spaSel = new Vif_2011_spa();
        
        this.obtenerDatosVif_2011_spa();
    }

    public void obtenerDatosVif_2011_spa() {
        try {
            this.lstVif_2011_spa = FVif_2011_spa.ObtenerDatos();
            this.objVif_2011_spaSel = lstVif_2011_spa.get(0);
            System.out.println(lstVif_2011_spa.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif_2011_spa dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif_2011_spa dice: " + e.getMessage());
        }

    }

}
