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
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorSubcircuitoTViolencia {
    private PieChartModel graficaTViolenciaSubCircuito;
    //private PieChartModel pieModel;
    //private PieChartModel model = new PieChartModel();

    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatosSubCircuito;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia2;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia3;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia4;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia5;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia6;
    private ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia7;
    private Vif_2012 datoSel;
    private String circuito;
    private String valorSSeleccionado;

    public PieChartModel getGraficaTViolenciaSubCircuito() {
        return graficaTViolenciaSubCircuito;
    }

    public void setGraficaTViolenciaSubCircuito(PieChartModel graficaTViolenciaSubCircuito) {
        this.graficaTViolenciaSubCircuito = graficaTViolenciaSubCircuito;
    }

    public ArrayList<Vif_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuito() {
        return lstDatosSubCircuito;
    }

    public void setLstDatosSubCircuito(ArrayList<Vif_2012> lstDatosSubCircuito) {
        this.lstDatosSubCircuito = lstDatosSubCircuito;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia() {
        return lstDatosSubCircuitoTViolencia;
    }

    public void setLstDatosSubCircuitoTViolencia(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia) {
        this.lstDatosSubCircuitoTViolencia = lstDatosSubCircuitoTViolencia;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia2() {
        return lstDatosSubCircuitoTViolencia2;
    }

    public void setLstDatosSubCircuitoTViolencia2(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia2) {
        this.lstDatosSubCircuitoTViolencia2 = lstDatosSubCircuitoTViolencia2;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia3() {
        return lstDatosSubCircuitoTViolencia3;
    }

    public void setLstDatosSubCircuitoTViolencia3(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia3) {
        this.lstDatosSubCircuitoTViolencia3 = lstDatosSubCircuitoTViolencia3;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia4() {
        return lstDatosSubCircuitoTViolencia4;
    }

    public void setLstDatosSubCircuitoTViolencia4(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia4) {
        this.lstDatosSubCircuitoTViolencia4 = lstDatosSubCircuitoTViolencia4;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia5() {
        return lstDatosSubCircuitoTViolencia5;
    }

    public void setLstDatosSubCircuitoTViolencia5(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia5) {
        this.lstDatosSubCircuitoTViolencia5 = lstDatosSubCircuitoTViolencia5;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia6() {
        return lstDatosSubCircuitoTViolencia6;
    }

    public void setLstDatosSubCircuitoTViolencia6(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia6) {
        this.lstDatosSubCircuitoTViolencia6 = lstDatosSubCircuitoTViolencia6;
    }

    public ArrayList<Vif_2012> getLstDatosSubCircuitoTViolencia7() {
        return lstDatosSubCircuitoTViolencia7;
    }

    public void setLstDatosSubCircuitoTViolencia7(ArrayList<Vif_2012> lstDatosSubCircuitoTViolencia7) {
        this.lstDatosSubCircuitoTViolencia7 = lstDatosSubCircuitoTViolencia7;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getValorSSeleccionado() {
        return valorSSeleccionado;
    }

    public void setValorSSeleccionado(String valorSSeleccionado) {
        this.valorSSeleccionado = valorSSeleccionado;
    }
    
    public Vif_2012ControladorSubcircuitoTViolencia() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2011();
        this.lstDatosSubCircuito = new ArrayList<Vif_2012>();
        this.datoSel = new Vif_2012();
        this.lstDatos = new ArrayList<Vif_2012>();
        this.lstDatosSubCircuitoTViolencia = new ArrayList<Vif_2012>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {

        graficaTViolenciaSubCircuito = pastelGrafica();
    }

    private PieChartModel pastelGrafica() {

        PieChartModel model = new PieChartModel();

        try {
            model = new PieChartModel();

            lstDatosSubCircuitoTViolencia = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "FISICA Y PSICOLOGICA");
            lstDatosSubCircuitoTViolencia2 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "FISICA Y SEXUAL");
            lstDatosSubCircuitoTViolencia3 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosSubCircuitoTViolencia4 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "FISICA");
            lstDatosSubCircuitoTViolencia5 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "PSICOLOGICA");
            lstDatosSubCircuitoTViolencia6 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "PSICOLOGICA Y SEXUAL");
            lstDatosSubCircuitoTViolencia7 = FVif_2012.ObtenerDatosDadoSubCircuitoTipoViolencia(valorSSeleccionado, "SEXUAL");


            model.set("FISICA Y PSICOLOGICA", lstDatosSubCircuitoTViolencia.size());
            model.set("FISICA Y SEXUAL", lstDatosSubCircuitoTViolencia2.size());
            model.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosSubCircuitoTViolencia3.size());
            model.set("FISICA", lstDatosSubCircuitoTViolencia4.size());
            model.set("PSICOLOGICA", lstDatosSubCircuitoTViolencia5.size());
            model.set("PSICOLOGICA Y SEXUAL", lstDatosSubCircuitoTViolencia6.size());
            model.set("SEXUAL", lstDatosSubCircuitoTViolencia7.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {
            lstDatosSubCircuito = FVif_2012.ObtenerDatosSubcircuito();
            //lstDatos = FVif_2011.ObtenerDatos();
            //this.datoSel = lstDatos.get(0);
            //System.out.println(lstDatos.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
