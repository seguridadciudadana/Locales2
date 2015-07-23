/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.primefaces.context.DefaultRequestContext;
//import org.primefaces.model.chart.Axis;
//import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
//import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
//import org.primefaces.model.chart.LineChartModel;
//import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
//import vif.logica.clases.subcircuito;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorDatos {

    /**
     * Creates a new instance of Vif_2011ControladorDatos
     */
    private Vif_2011 objVif_2011;
    private Vif_2011 objVif_2011Sel;
    private ArrayList<Vif_2011> lstVif_2011;
    private boolean mostrarActualizar;

    public Vif_2011 getObjVif_2011() {
        return objVif_2011;
    }

    public void setObjVif_2011(Vif_2011 objVif_2011) {
        this.objVif_2011 = objVif_2011;
    }

    public Vif_2011 getObjVif_2011Sel() {
        return objVif_2011Sel;
    }

    public void setObjVif_2011Sel(Vif_2011 objVif_2011Sel) {
        this.objVif_2011Sel = objVif_2011Sel;
    }

    public ArrayList<Vif_2011> getLstVif_2011() {
        return lstVif_2011;
    }

    public void setLstVif_2011(ArrayList<Vif_2011> lstVif_2011) {
        this.lstVif_2011 = lstVif_2011;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public Vif_2011ControladorDatos() {
        this.reinit();
    }

    private void reinit() {
        this.lstVif_2011 = new ArrayList<Vif_2011>();
        this.objVif_2011 = new Vif_2011();
        this.objVif_2011Sel = new Vif_2011();
        this.obtenerDatosVif_2011();
    }

    public void obtenerDatosVif_2011() {
        try {
            this.lstVif_2011 = FVif_2011.ObtenerDatos();
            this.objVif_2011Sel = lstVif_2011.get(0);
            System.out.println(lstVif_2011.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif2011 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif2011 dice: " + e.getMessage());
        }

    }

}
