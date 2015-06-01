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
import recursos.Util;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorEdades {

    /**
     * Creates a new instance of Vif_2012ControladorEdades
     */
    private CartesianChartModel graficaEdadSV;

    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatosRango1M;
    private ArrayList<Vif_2012> lstDatosRango1F;
    private ArrayList<Vif_2012> lstDatosRango2M;
    private ArrayList<Vif_2012> lstDatosRango2F;
    private ArrayList<Vif_2012> lstDatosRango3M;
    private ArrayList<Vif_2012> lstDatosRango3F;
    private ArrayList<Vif_2012> lstDatosRango4M;
    private ArrayList<Vif_2012> lstDatosRango4F;
    private ArrayList<Vif_2012> lstDatosRango5M;
    private ArrayList<Vif_2012> lstDatosRango5F;
    private ArrayList<Vif_2012> lstDatosRango6M;
    private ArrayList<Vif_2012> lstDatosRango6F;
    private ArrayList<Vif_2012> lstDatosRango7M;
    private ArrayList<Vif_2012> lstDatosRango7F;

    public CartesianChartModel getGraficaEdadSV() {
        return graficaEdadSV;
    }

    public void setGraficaEdadSV(CartesianChartModel graficaEdadSV) {
        this.graficaEdadSV = graficaEdadSV;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2012> getLstDatosRango1M() {
        return lstDatosRango1M;
    }

    public void setLstDatosRango1M(ArrayList<Vif_2012> lstDatosRango1M) {
        this.lstDatosRango1M = lstDatosRango1M;
    }

    public ArrayList<Vif_2012> getLstDatosRango1F() {
        return lstDatosRango1F;
    }

    public void setLstDatosRango1F(ArrayList<Vif_2012> lstDatosRango1F) {
        this.lstDatosRango1F = lstDatosRango1F;
    }

    public ArrayList<Vif_2012> getLstDatosRango2M() {
        return lstDatosRango2M;
    }

    public void setLstDatosRango2M(ArrayList<Vif_2012> lstDatosRango2M) {
        this.lstDatosRango2M = lstDatosRango2M;
    }

    public ArrayList<Vif_2012> getLstDatosRango2F() {
        return lstDatosRango2F;
    }

    public void setLstDatosRango2F(ArrayList<Vif_2012> lstDatosRango2F) {
        this.lstDatosRango2F = lstDatosRango2F;
    }

    public ArrayList<Vif_2012> getLstDatosRango3M() {
        return lstDatosRango3M;
    }

    public void setLstDatosRango3M(ArrayList<Vif_2012> lstDatosRango3M) {
        this.lstDatosRango3M = lstDatosRango3M;
    }

    public ArrayList<Vif_2012> getLstDatosRango3F() {
        return lstDatosRango3F;
    }

    public void setLstDatosRango3F(ArrayList<Vif_2012> lstDatosRango3F) {
        this.lstDatosRango3F = lstDatosRango3F;
    }

    public ArrayList<Vif_2012> getLstDatosRango4M() {
        return lstDatosRango4M;
    }

    public void setLstDatosRango4M(ArrayList<Vif_2012> lstDatosRango4M) {
        this.lstDatosRango4M = lstDatosRango4M;
    }

    public ArrayList<Vif_2012> getLstDatosRango4F() {
        return lstDatosRango4F;
    }

    public void setLstDatosRango4F(ArrayList<Vif_2012> lstDatosRango4F) {
        this.lstDatosRango4F = lstDatosRango4F;
    }

    public ArrayList<Vif_2012> getLstDatosRango5M() {
        return lstDatosRango5M;
    }

    public void setLstDatosRango5M(ArrayList<Vif_2012> lstDatosRango5M) {
        this.lstDatosRango5M = lstDatosRango5M;
    }

    public ArrayList<Vif_2012> getLstDatosRango5F() {
        return lstDatosRango5F;
    }

    public void setLstDatosRango5F(ArrayList<Vif_2012> lstDatosRango5F) {
        this.lstDatosRango5F = lstDatosRango5F;
    }

    public ArrayList<Vif_2012> getLstDatosRango6M() {
        return lstDatosRango6M;
    }

    public void setLstDatosRango6M(ArrayList<Vif_2012> lstDatosRango6M) {
        this.lstDatosRango6M = lstDatosRango6M;
    }

    public ArrayList<Vif_2012> getLstDatosRango6F() {
        return lstDatosRango6F;
    }

    public void setLstDatosRango6F(ArrayList<Vif_2012> lstDatosRango6F) {
        this.lstDatosRango6F = lstDatosRango6F;
    }

    public ArrayList<Vif_2012> getLstDatosRango7M() {
        return lstDatosRango7M;
    }

    public void setLstDatosRango7M(ArrayList<Vif_2012> lstDatosRango7M) {
        this.lstDatosRango7M = lstDatosRango7M;
    }

    public ArrayList<Vif_2012> getLstDatosRango7F() {
        return lstDatosRango7F;
    }

    public void setLstDatosRango7F(ArrayList<Vif_2012> lstDatosRango7F) {
        this.lstDatosRango7F = lstDatosRango7F;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        graficaEdadSV = graficaEdadSexoVictima();
    }

    private void reinit() {
        this.datoSel = new Vif_2012();
        this.lstDatosRango1F = new ArrayList<Vif_2012>();
        this.lstDatosRango1M = new ArrayList<Vif_2012>();
        this.lstDatosRango2F = new ArrayList<Vif_2012>();
        this.lstDatosRango2M = new ArrayList<Vif_2012>();
        this.lstDatosRango3F = new ArrayList<Vif_2012>();
        this.lstDatosRango3M = new ArrayList<Vif_2012>();
        this.lstDatosRango4F = new ArrayList<Vif_2012>();
        this.lstDatosRango4M = new ArrayList<Vif_2012>();
        this.lstDatosRango5F = new ArrayList<Vif_2012>();
        this.lstDatosRango5M = new ArrayList<Vif_2012>();
        this.lstDatosRango6F = new ArrayList<Vif_2012>();
        this.lstDatosRango6M = new ArrayList<Vif_2012>();
        this.lstDatosRango7F = new ArrayList<Vif_2012>();
        this.lstDatosRango7M = new ArrayList<Vif_2012>();
        this.cargarDatos();
        this.init();
    }

    public Vif_2012ControladorEdades() {
        this.reinit();
    }

    private CartesianChartModel graficaEdadSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosRango1F = FVif_2012.ObtenerDatosSexoVictimaEdad1("F");
            lstDatosRango1M = FVif_2012.ObtenerDatosSexoVictimaEdad1("M");
            lstDatosRango2F = FVif_2012.ObtenerDatosSexoVictimaEdad2("F");
            lstDatosRango2M = FVif_2012.ObtenerDatosSexoVictimaEdad2("M");
            lstDatosRango3F = FVif_2012.ObtenerDatosSexoVictimaEdad3("F");
            lstDatosRango3M = FVif_2012.ObtenerDatosSexoVictimaEdad3("M");
            lstDatosRango4F = FVif_2012.ObtenerDatosSexoVictimaEdad4("F");
            lstDatosRango4M = FVif_2012.ObtenerDatosSexoVictimaEdad4("M");
            lstDatosRango5F = FVif_2012.ObtenerDatosSexoVictimaEdad5("F");
            lstDatosRango5M = FVif_2012.ObtenerDatosSexoVictimaEdad5("M");
            lstDatosRango6F = FVif_2012.ObtenerDatosSexoVictimaEdad6("F");
            lstDatosRango6M = FVif_2012.ObtenerDatosSexoVictimaEdad6("M");
            lstDatosRango7F = FVif_2012.ObtenerDatosSexoVictimaEdad7("F");
            lstDatosRango7M = FVif_2012.ObtenerDatosSexoVictimaEdad7("M");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("0 - 18", lstDatosRango1M.size());
            Masculino.set("19 - 30", lstDatosRango2M.size());
            Masculino.set("31 - 40", lstDatosRango3M.size());
            Masculino.set("41 - 50", lstDatosRango4M.size());
            Masculino.set("51 - 60", lstDatosRango5M.size());
            Masculino.set("61 - 70", lstDatosRango6M.size());
            Masculino.set("71 - 90", lstDatosRango7M.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("0 - 18", lstDatosRango1F.size());
            Femenino.set("19 - 30", lstDatosRango2F.size());
            Femenino.set("31 - 40", lstDatosRango3F.size());
            Femenino.set("41 - 50", lstDatosRango4F.size());
            Femenino.set("51 - 60", lstDatosRango5F.size());
            Femenino.set("61 - 70", lstDatosRango6F.size());
            Femenino.set("71 - 90", lstDatosRango7F.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
