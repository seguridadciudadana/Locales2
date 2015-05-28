/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
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
public class Vif_2012ControladorDatos {

    /**
     * Creates a new instance of Vif_2012ControladorDatos
     */
    private Vif_2012 objVif_2012;
    private Vif_2012 objVif_2012Sel;
    private ArrayList<Vif_2012> lstVif_2012;
    private boolean mostrarActualizar;

    public Vif_2012 getObjVif_2012() {
        return objVif_2012;
    }

    public void setObjVif_2012(Vif_2012 objVif_2012) {
        this.objVif_2012 = objVif_2012;
    }

    public Vif_2012 getObjVif_2012Sel() {
        return objVif_2012Sel;
    }

    public void setObjVif_2012Sel(Vif_2012 objVif_2012Sel) {
        this.objVif_2012Sel = objVif_2012Sel;
    }

    public ArrayList<Vif_2012> getLstVif_2012() {
        return lstVif_2012;
    }

    public void setLstVif_2012(ArrayList<Vif_2012> lstVif_2012) {
        this.lstVif_2012 = lstVif_2012;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public Vif_2012ControladorDatos() {
        this.reinit();
    }

    public void reinit() {
        this.lstVif_2012 = new ArrayList<Vif_2012>();
        this.objVif_2012 = new Vif_2012();
        this.objVif_2012Sel = new Vif_2012();

        this.obtenerDatosVif_2012();
    }

    public void obtenerDatosVif_2012() {
        try {
            this.lstVif_2012 = FVif_2012.ObtenerDatos();
            this.objVif_2012Sel = lstVif_2012.get(0);
            System.out.println(lstVif_2012.get(0).getPid());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif2012 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif2012 dice: " + e.getMessage());
        }

    }

}
