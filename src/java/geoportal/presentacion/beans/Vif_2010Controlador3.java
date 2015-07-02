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
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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

public class Vif_2010Controlador3 implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
    private CartesianChartModel lineModel3;
    private CartesianChartModel lineModel4;
    private CartesianChartModel lineModel5;
    private ArrayList<Vif_2010> lstDatosControl1;    
    private ArrayList<Vif_2010> lstDatos2;
    private ArrayList<Vif_2010> lstDatos4;
    private ArrayList<Vif_2010> lstDatos6;
    private ArrayList<Vif_2010> lstDatos8;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatosCir;
    private ArrayList<Vif_2010> lstDatosMes;
    
    public ArrayList<Vif_2010> getLstDatos8() {
        return lstDatos8;
    }

    public void setLstDatos8(ArrayList<Vif_2010> lstDatos8) {
        this.lstDatos8 = lstDatos8;
    }

    public ArrayList<Vif_2010> getLstDatos6() {
        return lstDatos6;
    }

    public void setLstDatos6(ArrayList<Vif_2010> lstDatos6) {
        this.lstDatos6 = lstDatos6;
    }

    public CartesianChartModel getLineModel4() {
        return lineModel4;
    }

    public void setLineModel4(CartesianChartModel lineModel4) {
        this.lineModel4 = lineModel4;
    }

    public CartesianChartModel getLineModel5() {
        return lineModel5;
    }

    public void setLineModel5(CartesianChartModel lineModel5) {
        this.lineModel5 = lineModel5;
    }

    public ArrayList<Vif_2010> getLstDatos4() {
        return lstDatos4;
    }

    public void setLstDatos4(ArrayList<Vif_2010> lstDatos4) {
        this.lstDatos4 = lstDatos4;
    }

    public ArrayList<Vif_2010> getLstDatos2() {
        return lstDatos2;
    }

    public void setLstDatos2(ArrayList<Vif_2010> lstDatos2) {
        this.lstDatos2 = lstDatos2;
    }

    public CartesianChartModel getLineModel3() {
        return lineModel3;
    }

    public void setLineModel3(CartesianChartModel lineModel3) {
        this.lineModel3 = lineModel3;
    }

    public ArrayList<Vif_2010> getLstDatosCir() {
        return lstDatosCir;
    }

    public void setLstDatosCir(ArrayList<Vif_2010> lstDatosCir) {
        this.lstDatosCir = lstDatosCir;
    }

    public ArrayList<Vif_2010> getLstDatosMes() {
        return lstDatosMes;
    }

    public void setLstDatosMes(ArrayList<Vif_2010> lstDatosMes) {
        this.lstDatosMes = lstDatosMes;
    }

    public ArrayList<Vif_2010> getLstDatosControl1() {
        return lstDatosControl1;
    }

    public void setLstDatosControl1(ArrayList<Vif_2010> lstDatosControl1) {
        this.lstDatosControl1 = lstDatosControl1;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public Vif_2010Controlador3() {
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
        
        this.lstDatosMes = new ArrayList<Vif_2010>();
        this.lstDatosCir = new ArrayList<Vif_2010>();
        this.lstDatos4 = new ArrayList<Vif_2010>();
        this.lstDatos2 = new ArrayList<Vif_2010>();
        this.lstDatos6 = new ArrayList<Vif_2010>();
        this.lstDatos8 = new ArrayList<Vif_2010>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {

        lineModel3 = initCategoryModelSexo();
        lineModel4 = initCategoryModelSexoSub();
        lineModel5 = initCategoryModelSexoEdadA();
    }

    /**
     *
     */
    private CartesianChartModel initCategoryModelSexo() {
        CartesianChartModel model = new CartesianChartModel();

        try {
            
            ChartSeries CircuitoSexoM = new ChartSeries();
            CircuitoSexoM.setLabel("Masculino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatosMes = FVif_2010.ObtenerDatosDadoCircuitoSexo("M", lstDatosControl11.getCircuito());
                CircuitoSexoM.set(lstDatosControl11.getCircuito(), lstDatosMes.size());
            }

            ChartSeries CircuitoSexoF = new ChartSeries();
            CircuitoSexoF.setLabel("Femenino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatosCir = FVif_2010.ObtenerDatosDadoCircuitoSexo("F", lstDatosControl11.getCircuito());
                CircuitoSexoF.set(lstDatosControl11.getCircuito(), lstDatosCir.size());
            }
            model.addSeries(CircuitoSexoM);
            model.addSeries(CircuitoSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoSub() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            
            ChartSeries SubCircuitoSexoM = new ChartSeries();
            SubCircuitoSexoM.setLabel("Masculino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatos2 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("M", lstDatosControl11.getSubcircuit());
                SubCircuitoSexoM.set(lstDatosControl11.getSubcircuit(), lstDatos2.size());
            }

            ChartSeries SubCircuitoSexoF = new ChartSeries();
            SubCircuitoSexoF.setLabel("Femenino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatos4 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("F", lstDatosControl11.getSubcircuit());
                SubCircuitoSexoF.set(lstDatosControl11.getSubcircuit(), lstDatos4.size());
            }
            model.addSeries(SubCircuitoSexoM);
            model.addSeries(SubCircuitoSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoEdadA() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            
            ChartSeries EdadSexoM = new ChartSeries();
            EdadSexoM.setLabel("Masculino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatos6 = FVif_2010.ObtenerDatosDadoEdadSexo("M", lstDatosControl11.getEdad__agre());
                EdadSexoM.set(lstDatosControl11.getEdad__agre(), lstDatos6.size());
            }

            ChartSeries EdadSexoF = new ChartSeries();
            EdadSexoF.setLabel("Femenino");
            for (Vif_2010 lstDatosControl11 : lstDatosControl1) {
                lstDatos8 = FVif_2010.ObtenerDatosDadoEdadSexo("F", lstDatosControl11.getEdad__agre());
                EdadSexoF.set(lstDatosControl11.getEdad__agre(), lstDatos8.size());
            }
            model.addSeries(EdadSexoM);
            model.addSeries(EdadSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
     try {

     this.lstDatosControl1 = FVif_2010.ObtenerDatos();
     // this.datoSel = lstDatosControl1.get(0);
     //System.out.println(lstDatosControl1.get(0).getId());

     } catch (Exception e) {
     Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
     System.out.println("private void cargarDatos dice: " + e.getMessage());
     }
     }
}
