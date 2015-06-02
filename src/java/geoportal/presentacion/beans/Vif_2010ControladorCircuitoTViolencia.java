/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.util.ArrayList;
import javafx.scene.chart.PieChart;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorCircuitoTViolencia {

    private CartesianChartModel graficaTViolenciaCircuito;
    private PieChartModel pieModel;

    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatosCircuito;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia2;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia3;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia4;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia5;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia6;
    private ArrayList<Vif_2010> lstDatosCircuitoTViolencia7;
    private Vif_2010 datoSel;
    private String circuito;

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia2() {
        return lstDatosCircuitoTViolencia2;
    }

    public void setLstDatosCircuitoTViolencia2(ArrayList<Vif_2010> lstDatosCircuitoTViolencia2) {
        this.lstDatosCircuitoTViolencia2 = lstDatosCircuitoTViolencia2;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia3() {
        return lstDatosCircuitoTViolencia3;
    }

    public void setLstDatosCircuitoTViolencia3(ArrayList<Vif_2010> lstDatosCircuitoTViolencia3) {
        this.lstDatosCircuitoTViolencia3 = lstDatosCircuitoTViolencia3;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia4() {
        return lstDatosCircuitoTViolencia4;
    }

    public void setLstDatosCircuitoTViolencia4(ArrayList<Vif_2010> lstDatosCircuitoTViolencia4) {
        this.lstDatosCircuitoTViolencia4 = lstDatosCircuitoTViolencia4;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia5() {
        return lstDatosCircuitoTViolencia5;
    }

    public void setLstDatosCircuitoTViolencia5(ArrayList<Vif_2010> lstDatosCircuitoTViolencia5) {
        this.lstDatosCircuitoTViolencia5 = lstDatosCircuitoTViolencia5;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia6() {
        return lstDatosCircuitoTViolencia6;
    }

    public void setLstDatosCircuitoTViolencia6(ArrayList<Vif_2010> lstDatosCircuitoTViolencia6) {
        this.lstDatosCircuitoTViolencia6 = lstDatosCircuitoTViolencia6;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia7() {
        return lstDatosCircuitoTViolencia7;
    }

    public void setLstDatosCircuitoTViolencia7(ArrayList<Vif_2010> lstDatosCircuitoTViolencia7) {
        this.lstDatosCircuitoTViolencia7 = lstDatosCircuitoTViolencia7;
    }
    
    
    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }
    

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
    
    
    public CartesianChartModel getGraficaTViolenciaCircuito() {
        return graficaTViolenciaCircuito;
    }

    public void setGraficaTViolenciaCircuito(CartesianChartModel graficaTViolenciaCircuito) {
        this.graficaTViolenciaCircuito = graficaTViolenciaCircuito;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2010> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<Vif_2010> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<Vif_2010> getLstDatosCircuitoTViolencia() {
        return lstDatosCircuitoTViolencia;
    }

    public void setLstDatosCircuitoTViolencia(ArrayList<Vif_2010> lstDatosCircuitoTViolencia) {
        this.lstDatosCircuitoTViolencia = lstDatosCircuitoTViolencia;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public Vif_2010ControladorCircuitoTViolencia() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2010();
        this.datoSel = new Vif_2010();
        this.lstDatos = new ArrayList<Vif_2010>();
        
        this.lstDatosCircuito = new ArrayList<Vif_2010>();
        this.lstDatosCircuitoTViolencia = new ArrayList<Vif_2010>();
        
        this.init();
        this.cargarDatos();

    }

    public void graficar() {

        this.pastelGrafica();
        //lineModel4 = initCategoryModelSexoSub();
        //lineModel5 = initCategoryModelSexoEdadA();
    }
    
    private void pastelGrafica() {
        //CartesianChartModel model = new CartesianChartModel();
        //PieChartModel model =new PieChartModel();

        try {
            pieModel=new PieChartModel();
            lstDatosCircuito=FVif_2010.ObtenerDatosCircuito();
            //for (int i = 0; i < lstDatos.size(); i++) {

                lstDatosCircuitoTViolencia = FVif_2010.ObtenerDatosDadoCircuitoTipoViolencia(this.circuito,"FISICA Y PSICOLOGICA");
                lstDatosCircuitoTViolencia2 = FVif_2010.ObtenerDatosDadoCircuitoTipoViolencia(this.circuito,"FISICA Y SEXUAL");
                lstDatosCircuitoTViolencia3 = FVif_2010.ObtenerDatosDadoCircuitoTipoViolencia(this.circuito,"FISICA, PSICOLOGICA Y SEXUAL");
                lstDatosCircuitoTViolencia4 = FVif_2010.ObtenerDatosDadoCircuitoTipoViolencia(this.circuito,"FISICA");
                lstDatosCircuitoTViolencia5 = FVif_2010.ObtenerDatosDadoCircuitoTipoViolencia(this.circuito,"PSICOLOGICA");              
                pieModel.set("FISICA Y PSICOLOGICA", lstDatosCircuitoTViolencia.size());
                pieModel.set("FISICA Y SEXUAL", lstDatosCircuitoTViolencia2.size());
                pieModel.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosCircuitoTViolencia3.size());
                pieModel.set("FISICA", lstDatosCircuitoTViolencia4.size());
                pieModel.set("PSICOLOGICA", lstDatosCircuitoTViolencia5.size());
            //}

            

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        //return model;

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
