/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorTipoViolencia {

    /**
     * Creates a new instance of Vif_2012ControladorTipoViolencia
     */
    private CartesianChartModel lineModel;
    private ArrayList<Vif_2012> lstDatosControl;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatosV;
    private ArrayList<Vif_2012> lstDatosDadoV;
    private PieChartModel pieTipoViolencia;

    public PieChartModel getPieTipoViolencia() {
        return pieTipoViolencia;
    }

    public void setPieTipoViolencia(PieChartModel pieTipoViolencia) {
        this.pieTipoViolencia = pieTipoViolencia;
    }

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
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

    public ArrayList<Vif_2012> getLstDatosV() {
        return lstDatosV;
    }

    public void setLstDatosV(ArrayList<Vif_2012> lstDatosV) {
        this.lstDatosV = lstDatosV;
    }

    public ArrayList<Vif_2012> getLstDatosDadoV() {
        return lstDatosDadoV;
    }

    public void setLstDatosDadoV(ArrayList<Vif_2012> lstDatosDadoV) {
        this.lstDatosDadoV = lstDatosDadoV;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel = initCategoryTipoViolencia();
        pieTipoViolencia=pieTipoViolencia();
    }

    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2012>();
        this.lstDatosV = new ArrayList<Vif_2012>();
        this.lstDatosDadoV = new ArrayList<Vif_2012>();
        this.datoSel = new Vif_2012();

        this.init();
        this.cargarDatos();

    }

    public Vif_2012ControladorTipoViolencia() {
        this.reinit();
    }

    private CartesianChartModel initCategoryTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosV = FVif_2012.ObtenerDatosTipoViolencia();
            ChartSeries TipoViolencia = new ChartSeries();
            TipoViolencia.setLabel("Tipo de Violencia");
            for (int x = 0; x < lstDatosV.size(); x++) {
                lstDatosDadoV = FVif_2012.ObtenerDatosDadoTipoViolencia(lstDatosV.get(x).getPtipo_de_violencia());
                TipoViolencia.set(lstDatosV.get(x).getPtipo_de_violencia(), lstDatosDadoV.size());
            }
            model.addSeries(TipoViolencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

   private PieChartModel pieTipoViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            for (int x = 0; x < lstDatosV.size(); x++) {
                lstDatosDadoV = FVif_2012.ObtenerDatosDadoTipoViolencia(lstDatosV.get(x).getPtipo_de_violencia());
                pieModel.set(lstDatosV.get(x).getPtipo_de_violencia(), lstDatosDadoV.size());
            }
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
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
