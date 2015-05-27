/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorTipoViolencia {

    /**
     * Creates a new instance of Vif_2011ControladorTipoViolencia
     */
    private CartesianChartModel lineModel;
    private ArrayList<Vif_2011> lstDatosControl;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatosV;
    private ArrayList<Vif_2011> lstDatosDadoV;

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public ArrayList<Vif_2011> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2011> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosV() {
        return lstDatosV;
    }

    public void setLstDatosV(ArrayList<Vif_2011> lstDatosV) {
        this.lstDatosV = lstDatosV;
    }

    public ArrayList<Vif_2011> getLstDatosDadoV() {
        return lstDatosDadoV;
    }

    public void setLstDatosDadoV(ArrayList<Vif_2011> lstDatosDadoV) {
        this.lstDatosDadoV = lstDatosDadoV;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel = initCategoryTipoViolencia();
    }

    public Vif_2011ControladorTipoViolencia() {
        this.reinit();
    }

    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2011>();
        this.lstDatosV = new ArrayList<Vif_2011>();
        this.lstDatosDadoV = new ArrayList<Vif_2011>();
        this.datoSel = new Vif_2011();

        this.init();
        this.cargarDatos();

    }

    private CartesianChartModel initCategoryTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            
            lstDatosV = FVif_2011.ObtenerDatosTipoViolencia();
            ChartSeries TipoViolencia = new ChartSeries();
            TipoViolencia.setLabel("Tipo de Violencia");
            for (int x = 0; x < lstDatosV.size(); x++) {
                lstDatosDadoV = FVif_2011.ObtenerDatosDadoTipoViolencia(lstDatosV.get(x).getTipo_de_violencia());
                TipoViolencia.set(lstDatosV.get(x).getTipo_de_violencia(), lstDatosDadoV.size());
            }
            model.addSeries(TipoViolencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
