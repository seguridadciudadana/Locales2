/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
 * @author servidor
 */
@ManagedBean
@RequestScoped

public class Vif_2010Controlador implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
    private CartesianChartModel lineModel1;
    private CartesianChartModel lineModel2;
   
    private ArrayList<Vif_2010> lstDatosControl1;
    private Vif_2010 datoSel;
    
    private ArrayList<Vif_2010> lstDatosC;
    
    private ArrayList<Vif_2010> lstDatosDadoC;
    
    private ArrayList<Vif_2010> lstDatos7;
    private ArrayList<Vif_2010> lstDatos8;
    
    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public CartesianChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

      
    public ArrayList<Vif_2010> getLstDatosC() {
        return lstDatosC;
    }

    public void setLstDatosC(ArrayList<Vif_2010> lstDatosC) {
        this.lstDatosC = lstDatosC;
    }

    public ArrayList<Vif_2010> getLstDatosDadoC() {
        return lstDatosDadoC;
    }

    public void setLstDatosDadoC(ArrayList<Vif_2010> lstDatosDadoC) {
        this.lstDatosDadoC = lstDatosDadoC;
    }

    public ArrayList<Vif_2010> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2010> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

    public ArrayList<Vif_2010> getLstDatos8() {
        return lstDatos8;
    }

    public void setLstDatos8(ArrayList<Vif_2010> lstDatos8) {
        this.lstDatos8 = lstDatos8;
    }
    

    public ArrayList<Vif_2010> getLstDatosControl1() {
        return lstDatosControl1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatosControl1) {
        this.lstDatosControl1 = lstDatosControl1;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public Vif_2010Controlador() {
        this.reinit();
    }
    
     @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2010();
        this.datoSel = new Vif_2010();
        this.lstDatosControl1 = new ArrayList<Vif_2010>();
        this.lstDatos7 = new ArrayList<Vif_2010>();
        this.lstDatos8 = new ArrayList<Vif_2010>();
        this.lstDatosC = new ArrayList<Vif_2010>();
        this.lstDatosDadoC = new ArrayList<Vif_2010>();
        
        this.init();
        this.cargarDatos();

    }
    
    public void graficar(){
        lineModel1 = initCategorySubcircuito();
        lineModel2 = initCategoryCircuito();
        
}

    /**
     *
     */
    
    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos8 = FVif_2010.ObtenerDatosSubCircuito();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("SubCircuito");
            for (int x = 0; x < lstDatos8.size(); x++) {
                lstDatos7 = FVif_2010.ObtenerDatosDadoSubcircuito(lstDatos8.get(x).getSubcircuit());
                SubCircuito.set(lstDatos8.get(x).getSubcircuit(), lstDatos7.size());

            }

            model.addSeries(SubCircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosC = FVif_2010.ObtenerDatosCircuito();

            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());

            }

            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

   
    public void cargarDatos() {
        try {

            this.lstDatosControl1 = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatosControl1.get(0);
            System.out.println(lstDatosControl1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
