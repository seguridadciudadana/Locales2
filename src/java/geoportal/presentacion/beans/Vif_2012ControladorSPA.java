/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012_spa;
import geoportal.logica.funciones.FVif_2012_spa;
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
public class Vif_2012ControladorSPA {

    /**
     * Creates a new instance of Vif_2012ControladorSPA
     */
    private Vif_2012_spa objVif_2012_spa;
    private Vif_2012_spa objVif_2012_spaSel;
    private ArrayList<Vif_2012_spa> lstVif_2012_spa;
    private boolean mostrarActualizar;

    public Vif_2012_spa getObjVif_2012_spa() {
        return objVif_2012_spa;
    }

    public void setObjVif_2012_spa(Vif_2012_spa objVif_2012_spa) {
        this.objVif_2012_spa = objVif_2012_spa;
    }

    public Vif_2012_spa getObjVif_2012_spaSel() {
        return objVif_2012_spaSel;
    }

    public void setObjVif_2012_spaSel(Vif_2012_spa objVif_2012_spaSel) {
        this.objVif_2012_spaSel = objVif_2012_spaSel;
    }

    public ArrayList<Vif_2012_spa> getLstVif_2012_spa() {
        return lstVif_2012_spa;
    }

    public void setLstVif_2012_spa(ArrayList<Vif_2012_spa> lstVif_2012_spa) {
        this.lstVif_2012_spa = lstVif_2012_spa;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public Vif_2012ControladorSPA() {
        this.reinit();
    }

    private void reinit() {
        this.lstVif_2012_spa = new ArrayList<Vif_2012_spa>();
        this.objVif_2012_spa = new Vif_2012_spa();
        this.objVif_2012_spaSel = new Vif_2012_spa();
        this.obtenerDatosVif_2012_spa();
    }

    public void obtenerDatosVif_2012_spa() {
        try {
            this.lstVif_2012_spa = FVif_2012_spa.ObtenerDatos();
            this.objVif_2012_spaSel = lstVif_2012_spa.get(0);
            System.out.println(lstVif_2012_spa.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif_2012_spa dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif_2012_spa dice: " + e.getMessage());
        }

    }

}
