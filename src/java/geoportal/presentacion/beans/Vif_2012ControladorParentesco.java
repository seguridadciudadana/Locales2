/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.funciones.FVif_2012;
import geoportal.logica.clases.Vif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorParentesco {

    /**
     * Creates a new instance of Vif_2012ControladorParentesco
     */
    private CartesianChartModel parentescoGrafico;
    private ArrayList<Vif_2012> lstDatosControl;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatosP;
    private ArrayList<Vif_2012> lstDatosDadoP;

    public CartesianChartModel getParentescoGrafico() {
        return parentescoGrafico;
    }

    public void setParentescoGrafico(CartesianChartModel parentescoGrafico) {
        this.parentescoGrafico = parentescoGrafico;
    }

    public ArrayList<Vif_2012> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2012> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatosP() {
        return lstDatosP;
    }

    public void setLstDatosP(ArrayList<Vif_2012> lstDatosP) {
        this.lstDatosP = lstDatosP;
    }

    public ArrayList<Vif_2012> getLstDatosDadoP() {
        return lstDatosDadoP;
    }

    public void setLstDatosDadoP(ArrayList<Vif_2012> lstDatosDadoP) {
        this.lstDatosDadoP = lstDatosDadoP;
    }

    public void graficar() {
        parentescoGrafico = initCategoryParentesco();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public Vif_2012ControladorParentesco() {
        this.reinit();
    }

    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2012>();
        this.lstDatosP = new ArrayList<Vif_2012>();
        this.lstDatosDadoP = new ArrayList<Vif_2012>();
        this.datoSel = new Vif_2012();

        this.init();
        this.cargarDatos();

    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosP = FVif_2012.ObtenerDatosParentesco();
            ChartSeries Parentesco = new ChartSeries();
            Parentesco.setLabel("Parentesco Victima - Agresor");
            for (Vif_2012 lstDatosP1 : lstDatosP) {
                lstDatosDadoP = FVif_2012.ObtenerDatosDadoParentesco(lstDatosP1.getPparentesco_victima_agresor());
                //TipoViolencia.set(lstDatosV.get(x).getPtipo_de_violencia(), lstDatosDadoV.size());
                Parentesco.set(lstDatosP1.getPparentesco_victima_agresor(), lstDatosDadoP.size());
            }
            model.addSeries(Parentesco);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getPid());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
