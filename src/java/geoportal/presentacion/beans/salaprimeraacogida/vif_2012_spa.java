/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans.salaprimeraacogida;

import geoportal.logica.clases.Vif_2012_Sala_1acogida;
import geoportal.logica.funciones.FVif_2012_Sala_1acogida;
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
public class vif_2012_spa {

    /**
     * Creates a new instance of vif_2012_spa
     */
    private Vif_2012_Sala_1acogida objSpa_2012;
    private Vif_2012_Sala_1acogida objSpa_2012Sel;
    private ArrayList<Vif_2012_Sala_1acogida> lstSpa_2012;
    private boolean mostrarActualizar;

    public Vif_2012_Sala_1acogida getObjSpa_2012() {
        return objSpa_2012;
    }

    public void setObjSpa_2012(Vif_2012_Sala_1acogida objSpa_2012) {
        this.objSpa_2012 = objSpa_2012;
    }

    public Vif_2012_Sala_1acogida getObjSpa_2012Sel() {
        return objSpa_2012Sel;
    }

    public void setObjSpa_2012Sel(Vif_2012_Sala_1acogida objSpa_2012Sel) {
        this.objSpa_2012Sel = objSpa_2012Sel;
    }

    public ArrayList<Vif_2012_Sala_1acogida> getLstSpa_2012() {
        return lstSpa_2012;
    }

    public void setLstSpa_2012(ArrayList<Vif_2012_Sala_1acogida> lstSpa_2012) {
        this.lstSpa_2012 = lstSpa_2012;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public vif_2012_spa() {
        this.reinit();
    }

    public void reinit() {
        this.lstSpa_2012 = new ArrayList<Vif_2012_Sala_1acogida>();
        this.objSpa_2012 = new Vif_2012_Sala_1acogida();
        this.objSpa_2012Sel = new Vif_2012_Sala_1acogida();
        this.obtenerDatosSpa_2012();
    }

    public void obtenerDatosSpa_2012() {
        try {
            this.lstSpa_2012 = FVif_2012_Sala_1acogida.ObtenerDatos();
            this.objSpa_2012Sel = lstSpa_2012.get(0);
            System.out.println(lstSpa_2012.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosSpa_2012 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosSpa_2012 dice: " + e.getMessage());
        }

    }
}
