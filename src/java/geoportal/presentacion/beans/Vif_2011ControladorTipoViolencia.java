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

    public Vif_2011ControladorTipoViolencia() {
    }

    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            //lstDatosS = FVif_2011.ObtenerDatosSubcircuito();
            lstDatosV = FVif_2011.ObtenerDatosTipoViolencia();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("Tipo de Violencia");
            for (int x = 0; x < lstDatosV.size(); x++) {
                //lstDatosDadoS = FVif_2011.ObtenerDatosDadoSubcircuito(lstDatosS.get(x).getSubcircuito());
                lstDatosDadoV=FVif_2011.ObtenerDatosDadoTipoViolencia(lstDatosV.get);
                SubCircuito.set(lstDatosS.get(x).getSubcircuito(), lstDatosDadoS.size());
            }
            model.addSeries(SubCircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
