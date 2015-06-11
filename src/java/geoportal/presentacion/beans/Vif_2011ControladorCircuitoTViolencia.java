/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorCircuitoTViolencia {
    private PieChartModel graficaTViolenciaCircuito;
    //private PieChartModel pieModel;
    //private PieChartModel model = new PieChartModel();

    private ArrayList<Vif_2011> lstDatos;
    private ArrayList<Vif_2011> lstDatosCircuito;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia2;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia3;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia4;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia5;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia6;
    private ArrayList<Vif_2011> lstDatosCircuitoTViolencia7;
    private Vif_2011 datoSel;
    private String circuito;
    private String valorSeleccionado;

    public PieChartModel getGraficaTViolenciaCircuito() {
        return graficaTViolenciaCircuito;
    }

    public void setGraficaTViolenciaCircuito(PieChartModel graficaTViolenciaCircuito) {
        this.graficaTViolenciaCircuito = graficaTViolenciaCircuito;
    }

    public ArrayList<Vif_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2011> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<Vif_2011> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia() {
        return lstDatosCircuitoTViolencia;
    }

    public void setLstDatosCircuitoTViolencia(ArrayList<Vif_2011> lstDatosCircuitoTViolencia) {
        this.lstDatosCircuitoTViolencia = lstDatosCircuitoTViolencia;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia2() {
        return lstDatosCircuitoTViolencia2;
    }

    public void setLstDatosCircuitoTViolencia2(ArrayList<Vif_2011> lstDatosCircuitoTViolencia2) {
        this.lstDatosCircuitoTViolencia2 = lstDatosCircuitoTViolencia2;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia3() {
        return lstDatosCircuitoTViolencia3;
    }

    public void setLstDatosCircuitoTViolencia3(ArrayList<Vif_2011> lstDatosCircuitoTViolencia3) {
        this.lstDatosCircuitoTViolencia3 = lstDatosCircuitoTViolencia3;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia4() {
        return lstDatosCircuitoTViolencia4;
    }

    public void setLstDatosCircuitoTViolencia4(ArrayList<Vif_2011> lstDatosCircuitoTViolencia4) {
        this.lstDatosCircuitoTViolencia4 = lstDatosCircuitoTViolencia4;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia5() {
        return lstDatosCircuitoTViolencia5;
    }

    public void setLstDatosCircuitoTViolencia5(ArrayList<Vif_2011> lstDatosCircuitoTViolencia5) {
        this.lstDatosCircuitoTViolencia5 = lstDatosCircuitoTViolencia5;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia6() {
        return lstDatosCircuitoTViolencia6;
    }

    public void setLstDatosCircuitoTViolencia6(ArrayList<Vif_2011> lstDatosCircuitoTViolencia6) {
        this.lstDatosCircuitoTViolencia6 = lstDatosCircuitoTViolencia6;
    }

    public ArrayList<Vif_2011> getLstDatosCircuitoTViolencia7() {
        return lstDatosCircuitoTViolencia7;
    }

    public void setLstDatosCircuitoTViolencia7(ArrayList<Vif_2011> lstDatosCircuitoTViolencia7) {
        this.lstDatosCircuitoTViolencia7 = lstDatosCircuitoTViolencia7;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getValorSeleccionado() {
        return valorSeleccionado;
    }

    public void setValorSeleccionado(String valorSeleccionado) {
        this.valorSeleccionado = valorSeleccionado;
    }
     public Vif_2011ControladorCircuitoTViolencia() {
        this.reinit();
    }
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2010();
        this.lstDatosCircuito = new ArrayList<Vif_2011>();
        this.datoSel = new Vif_2011();
        this.lstDatos = new ArrayList<Vif_2011>();
        this.lstDatosCircuitoTViolencia = new ArrayList<Vif_2011>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {

        graficaTViolenciaCircuito = pastelGrafica();
    }

    private PieChartModel pastelGrafica() {

        PieChartModel model = new PieChartModel();

        try {
            model = new PieChartModel();
            
                
                lstDatosCircuitoTViolencia = FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "FISICA Y PSICOLOGICA");
                lstDatosCircuitoTViolencia2 = FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "FISICA Y SEXUAL");
                lstDatosCircuitoTViolencia3 = FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "FISICA, PSICOLOGICA Y SEXUAL");
                lstDatosCircuitoTViolencia4 = FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "FISICA");
                lstDatosCircuitoTViolencia5 = FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "PSICOLOGICA");
                lstDatosCircuitoTViolencia6=FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado,"PSICOLOGICA Y SEXUAL");
                lstDatosCircuitoTViolencia7=FVif_2011.ObtenerDatosDadoCircuitoTipoViolencia(valorSeleccionado, "SEXUAL");

                model.set("FISICA Y PSICOLOGICA", lstDatosCircuitoTViolencia.size());
                model.set("FISICA Y SEXUAL", lstDatosCircuitoTViolencia2.size());
                model.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosCircuitoTViolencia3.size());
                model.set("FISICA", lstDatosCircuitoTViolencia4.size());
                model.set("PSICOLOGICA", lstDatosCircuitoTViolencia5.size());
                model.set("OSICOLOGICA Y SEXUAL", lstDatosCircuitoTViolencia6.size());
                model.set("SEXUAL", lstDatosCircuitoTViolencia7.size());
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {
            lstDatosCircuito = FVif_2011.ObtenerDatosCircuito();
            //lstDatos = FVif_2010.ObtenerDatos();
            //this.datoSel = lstDatos.get(0);
            //System.out.println(lstDatos.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
