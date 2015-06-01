/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.funciones.FVif_2012_2;
import geoportal.logica.clases.Vif_2012_2;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012_2ControladorParentescoVictimas {

    /**
     * Creates a new instance of Vif_2012_2ControladorParentescoVictimas
     */
    
    private CartesianChartModel lineModel;
    private ArrayList<Vif_2012_2> lstDatosControl;
    private Vif_2012_2 datoSel;
    private ArrayList<Vif_2012_2> lstDatosP;
    private ArrayList<Vif_2012_2> lstDatosDadoP;

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public ArrayList<Vif_2012_2> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2012_2> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2012_2 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012_2 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012_2> getLstDatosP() {
        return lstDatosP;
    }

    public void setLstDatosP(ArrayList<Vif_2012_2> lstDatosP) {
        this.lstDatosP = lstDatosP;
    }

    public ArrayList<Vif_2012_2> getLstDatosDadoP() {
        return lstDatosDadoP;
    }

    public void setLstDatosDadoP(ArrayList<Vif_2012_2> lstDatosDadoP) {
        this.lstDatosDadoP = lstDatosDadoP;
    }
    
    
    
    
    public Vif_2012_2ControladorParentescoVictimas() {
    }
    
}
