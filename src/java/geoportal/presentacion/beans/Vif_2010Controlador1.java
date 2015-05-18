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

public class Vif_2010Controlador1 implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
    
   
    private CartesianChartModel lineModel6;
    private CartesianChartModel lineModel7;
    private CartesianChartModel lineModel8;

    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
    
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatosFecha;
    private ArrayList<Vif_2010> lstDatos1;
    
    private ArrayList<Vif_2010> lstDatos3;
    
    private ArrayList<Vif_2010> lstDatos5;
    
    private ArrayList<Vif_2010> lstDatos7;
        
    private ArrayList<Vif_2010> lstDatosCopia;
    private ArrayList<Vif_2010> lstDatos9;
    private ArrayList<Vif_2010> lstDatos10;

    List<Integer> listaEdad = new ArrayList<Integer>();

    private String fecha1;
    private String fecha2;
    private Date date1;
    private Date date2;

    public ArrayList<Vif_2010> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2010> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

       

    public CartesianChartModel getLineModel6() {
        return lineModel6;
    }

    public void setLineModel6(CartesianChartModel lineModel6) {
        this.lineModel6 = lineModel6;
    }

    public CartesianChartModel getLineModel7() {
        return lineModel7;
    }

    public void setLineModel7(CartesianChartModel lineModel7) {
        this.lineModel7 = lineModel7;
    }

    public CartesianChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(CartesianChartModel lineModel8) {
        this.lineModel8 = lineModel8;
    }

    public ArrayList<Vif_2010> getLstDatos9() {
        return lstDatos9;
    }

    public void setLstDatos9(ArrayList<Vif_2010> lstDatos9) {
        this.lstDatos9 = lstDatos9;
    }

    public ArrayList<Vif_2010> getLstDatos10() {
        return lstDatos10;
    }

    public void setLstDatos10(ArrayList<Vif_2010> lstDatos10) {
        this.lstDatos10 = lstDatos10;
    }

    
    public ArrayList<Vif_2010> getLstDatosCopia() {
        return lstDatosCopia;
    }

    public void setLstDatosCopia(ArrayList<Vif_2010> lstDatosCopia) {
        this.lstDatosCopia = lstDatosCopia;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public ArrayList<Vif_2010> getLstDatosFecha() {
        return lstDatosFecha;
    }

    public void setLstDatosFecha(ArrayList<Vif_2010> lstDatosFecha) {
        this.lstDatosFecha = lstDatosFecha;
    }

    
    public ArrayList<Vif_2010> getLstDatos5() {
        return lstDatos5;
    }

    public void setLstDatos5(ArrayList<Vif_2010> lstDatos5) {
        this.lstDatos5 = lstDatos5;
    }

    

    public ArrayList<Vif_2010> getLstDatos3() {
        return lstDatos3;
    }

    public void setLstDatos3(ArrayList<Vif_2010> lstDatos3) {
        this.lstDatos3 = lstDatos3;
    }

    

    public List<Integer> getListaEdad() {
        return listaEdad;
    }

    public void setListaEdad(List<Integer> listaEdad) {
        this.listaEdad = listaEdad;
    }

    

    public ArrayList<Vif_2010> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public Vif_2010 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2010 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public Vif_2010Controlador1() {
        this.reinit();
    }

    private void reinit() {
        this.objDatos = new Vif_2010();
        this.datoSel = new Vif_2010();
        this.lstDatos = new ArrayList<Vif_2010>();
        this.lstDatos1 = new ArrayList<Vif_2010>();
        this.listaEdad = new ArrayList<Integer>();
        this.lstDatos3 = new ArrayList<Vif_2010>();
        
        this.lstDatos5 = new ArrayList<Vif_2010>();
        
        this.lstDatos7 = new ArrayList<Vif_2010>();
        
        
        this.lstDatosCopia = new ArrayList<Vif_2010>();
        
        this.lstDatosFecha = new ArrayList<Vif_2010>();
        
        this.lstDatos9 = new ArrayList<Vif_2010>();
        this.lstDatos10 = new ArrayList<Vif_2010>();
        this.cargarDatos();
        this.init();
    }

    //Graficas
    public void grficar() {

        
        
        lineModel6 = initCategoryModelSexoEdadV();
        lineModel7 = initCategoryModelSexoV();
        lineModel8 = initCategoryModelSexoSubV();

    }

    
    

    private CartesianChartModel initCategoryModelSexoV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries CircuitoSexoMV = new ChartSeries();
            CircuitoSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos1 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("M", lstDatos.get(i).getCircuito());
                CircuitoSexoMV.set(lstDatos.get(i).getCircuito(), lstDatos1.size());
            }

            ChartSeries CircuitoSexoFV = new ChartSeries();
            CircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos3 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("F", lstDatos.get(j).getCircuito());
                CircuitoSexoFV.set(lstDatos.get(j).getCircuito(), lstDatos3.size());
            }
            model.addSeries(CircuitoSexoMV);
            model.addSeries(CircuitoSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoSubV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries SubCircuitoSexoMV = new ChartSeries();
            SubCircuitoSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos5 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("M", lstDatos.get(i).getSubcircuit());
                SubCircuitoSexoMV.set(lstDatos.get(i).getSubcircuit(), lstDatos5.size());
            }

            ChartSeries SubCircuitoSexoFV = new ChartSeries();
            SubCircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos7 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("F", lstDatos.get(j).getSubcircuit());
                SubCircuitoSexoFV.set(lstDatos.get(j).getSubcircuit(), lstDatos7.size());
            }
            model.addSeries(SubCircuitoSexoMV);
            model.addSeries(SubCircuitoSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoEdadV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries EdadSexoMV = new ChartSeries();
            EdadSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos9 = FVif_2010.ObtenerDatosDadoEdadSexoVictima("M", lstDatos.get(i).getEdad_victi());
                EdadSexoMV.set(lstDatos.get(i).getEdad_victi(), lstDatos9.size());
            }

            ChartSeries EdadSexoFV = new ChartSeries();
            EdadSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos10 = FVif_2010.ObtenerDatosDadoEdadSexoVictima("F", lstDatos.get(j).getEdad_victi());
                EdadSexoFV.set(lstDatos.get(j).getEdad_victi(), lstDatos10.size());
            }
            model.addSeries(EdadSexoMV);
            model.addSeries(EdadSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
