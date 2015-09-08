/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.poi.hssf.record.formula.functions.Char;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorEdades {

    private CartesianChartModel graficaEdadSV;

    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatosRango1M;
    private ArrayList<Vif_2010> lstDatosRango1F;
    private ArrayList<Vif_2010> lstDatosRango2M;
    private ArrayList<Vif_2010> lstDatosRango2F;
    private ArrayList<Vif_2010> lstDatosRango3M;
    private ArrayList<Vif_2010> lstDatosRango3F;
    private ArrayList<Vif_2010> lstDatosRango4M;
    private ArrayList<Vif_2010> lstDatosRango4F;
    private ArrayList<Vif_2010> lstDatosRango5M;
    private ArrayList<Vif_2010> lstDatosRango5F;
    private ArrayList<Vif_2010> lstDatosRango6M;
    private ArrayList<Vif_2010> lstDatosRango6F;
    private ArrayList<Vif_2010> lstDatosRango7M;
    private ArrayList<Vif_2010> lstDatosRango7F;
    private ArrayList<Vif_2010> lstDatosRangoNaM;
    private ArrayList<Vif_2010> lstDatosRangoNaF;
    private ArrayList<Vif_2010> lstDatosRangoNa;
    private ArrayList<Vif_2010> lstDatosRango1;
    private ArrayList<Vif_2010> lstDatosRango2;
    private ArrayList<Vif_2010> lstDatosRango3;
    private ArrayList<Vif_2010> lstDatosRango4;
    private ArrayList<Vif_2010> lstDatosRango5;
    private ArrayList<Vif_2010> lstDatosRango6;
    private ArrayList<Vif_2010> lstDatosRango7;
    private CartesianChartModel graficaEdadesSexoVictima;

    public ArrayList<Vif_2010> getLstDatosRangoNa() {
        return lstDatosRangoNa;
    }

    public void setLstDatosRangoNa(ArrayList<Vif_2010> lstDatosRangoNa) {
        this.lstDatosRangoNa = lstDatosRangoNa;
    }

    public ArrayList<Vif_2010> getLstDatosRango1() {
        return lstDatosRango1;
    }

    public void setLstDatosRango1(ArrayList<Vif_2010> lstDatosRango1) {
        this.lstDatosRango1 = lstDatosRango1;
    }

    public ArrayList<Vif_2010> getLstDatosRango2() {
        return lstDatosRango2;
    }

    public void setLstDatosRango2(ArrayList<Vif_2010> lstDatosRango2) {
        this.lstDatosRango2 = lstDatosRango2;
    }

    public ArrayList<Vif_2010> getLstDatosRango3() {
        return lstDatosRango3;
    }

    public void setLstDatosRango3(ArrayList<Vif_2010> lstDatosRango3) {
        this.lstDatosRango3 = lstDatosRango3;
    }

    public ArrayList<Vif_2010> getLstDatosRango4() {
        return lstDatosRango4;
    }

    public void setLstDatosRango4(ArrayList<Vif_2010> lstDatosRango4) {
        this.lstDatosRango4 = lstDatosRango4;
    }

    public ArrayList<Vif_2010> getLstDatosRango5() {
        return lstDatosRango5;
    }

    public void setLstDatosRango5(ArrayList<Vif_2010> lstDatosRango5) {
        this.lstDatosRango5 = lstDatosRango5;
    }

    public ArrayList<Vif_2010> getLstDatosRango6() {
        return lstDatosRango6;
    }

    public void setLstDatosRango6(ArrayList<Vif_2010> lstDatosRango6) {
        this.lstDatosRango6 = lstDatosRango6;
    }

    public ArrayList<Vif_2010> getLstDatosRango7() {
        return lstDatosRango7;
    }

    public void setLstDatosRango7(ArrayList<Vif_2010> lstDatosRango7) {
        this.lstDatosRango7 = lstDatosRango7;
    }

    public CartesianChartModel getGraficaEdadesSexoVictima() {
        return graficaEdadesSexoVictima;
    }

    public void setGraficaEdadesSexoVictima(CartesianChartModel graficaEdadesSexoVictima) {
        this.graficaEdadesSexoVictima = graficaEdadesSexoVictima;
    }

    public ArrayList<Vif_2010> getLstDatosRangoNaM() {
        return lstDatosRangoNaM;
    }

    public void setLstDatosRangoNaM(ArrayList<Vif_2010> lstDatosRangoNaM) {
        this.lstDatosRangoNaM = lstDatosRangoNaM;
    }

    public ArrayList<Vif_2010> getLstDatosRangoNaF() {
        return lstDatosRangoNaF;
    }

    public void setLstDatosRangoNaF(ArrayList<Vif_2010> lstDatosRangoNaF) {
        this.lstDatosRangoNaF = lstDatosRangoNaF;
    }

    public CartesianChartModel getGraficaEdadSV() {
        return graficaEdadSV;
    }

    public void setGraficaEdadSV(CartesianChartModel graficaEdadSV) {
        this.graficaEdadSV = graficaEdadSV;
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

    public ArrayList<Vif_2010> getLstDatosRango1M() {
        return lstDatosRango1M;
    }

    public void setLstDatosRango1M(ArrayList<Vif_2010> lstDatosRango1M) {
        this.lstDatosRango1M = lstDatosRango1M;
    }

    public ArrayList<Vif_2010> getLstDatosRango1F() {
        return lstDatosRango1F;
    }

    public void setLstDatosRango1F(ArrayList<Vif_2010> lstDatosRango1F) {
        this.lstDatosRango1F = lstDatosRango1F;
    }

    public ArrayList<Vif_2010> getLstDatosRango2M() {
        return lstDatosRango2M;
    }

    public void setLstDatosRango2M(ArrayList<Vif_2010> lstDatosRango2M) {
        this.lstDatosRango2M = lstDatosRango2M;
    }

    public ArrayList<Vif_2010> getLstDatosRango2F() {
        return lstDatosRango2F;
    }

    public void setLstDatosRango2F(ArrayList<Vif_2010> lstDatosRango2F) {
        this.lstDatosRango2F = lstDatosRango2F;
    }

    public ArrayList<Vif_2010> getLstDatosRango3M() {
        return lstDatosRango3M;
    }

    public void setLstDatosRango3M(ArrayList<Vif_2010> lstDatosRango3M) {
        this.lstDatosRango3M = lstDatosRango3M;
    }

    public ArrayList<Vif_2010> getLstDatosRango3F() {
        return lstDatosRango3F;
    }

    public void setLstDatosRango3F(ArrayList<Vif_2010> lstDatosRango3F) {
        this.lstDatosRango3F = lstDatosRango3F;
    }

    public ArrayList<Vif_2010> getLstDatosRango4M() {
        return lstDatosRango4M;
    }

    public void setLstDatosRango4M(ArrayList<Vif_2010> lstDatosRango4M) {
        this.lstDatosRango4M = lstDatosRango4M;
    }

    public ArrayList<Vif_2010> getLstDatosRango4F() {
        return lstDatosRango4F;
    }

    public void setLstDatosRango4F(ArrayList<Vif_2010> lstDatosRango4F) {
        this.lstDatosRango4F = lstDatosRango4F;
    }

    public ArrayList<Vif_2010> getLstDatosRango5M() {
        return lstDatosRango5M;
    }

    public void setLstDatosRango5M(ArrayList<Vif_2010> lstDatosRango5M) {
        this.lstDatosRango5M = lstDatosRango5M;
    }

    public ArrayList<Vif_2010> getLstDatosRango5F() {
        return lstDatosRango5F;
    }

    public void setLstDatosRango5F(ArrayList<Vif_2010> lstDatosRango5F) {
        this.lstDatosRango5F = lstDatosRango5F;
    }

    public ArrayList<Vif_2010> getLstDatosRango6M() {
        return lstDatosRango6M;
    }

    public void setLstDatosRango6M(ArrayList<Vif_2010> lstDatosRango6M) {
        this.lstDatosRango6M = lstDatosRango6M;
    }

    public ArrayList<Vif_2010> getLstDatosRango6F() {
        return lstDatosRango6F;
    }

    public void setLstDatosRango6F(ArrayList<Vif_2010> lstDatosRango6F) {
        this.lstDatosRango6F = lstDatosRango6F;
    }

    public ArrayList<Vif_2010> getLstDatosRango7M() {
        return lstDatosRango7M;
    }

    public void setLstDatosRango7M(ArrayList<Vif_2010> lstDatosRango7M) {
        this.lstDatosRango7M = lstDatosRango7M;
    }

    public ArrayList<Vif_2010> getLstDatosRango7F() {
        return lstDatosRango7F;
    }

    public void setLstDatosRango7F(ArrayList<Vif_2010> lstDatosRango7F) {
        this.lstDatosRango7F = lstDatosRango7F;
    }

    public Vif_2010ControladorEdades() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        graficaEdadSV = graficaEdadSexoVictima();
        graficaEdadesSexoVictima=graficaEdadesSexoVictima();
        
    }

    private void reinit() {
        this.datoSel = new Vif_2010();
        this.lstDatosRango1F = new ArrayList<Vif_2010>();
        this.lstDatosRango1M = new ArrayList<Vif_2010>();
        this.lstDatosRango2F = new ArrayList<Vif_2010>();
        this.lstDatosRango2M = new ArrayList<Vif_2010>();
        this.lstDatosRango3F = new ArrayList<Vif_2010>();
        this.lstDatosRango3M = new ArrayList<Vif_2010>();
        this.lstDatosRango4F = new ArrayList<Vif_2010>();
        this.lstDatosRango4M = new ArrayList<Vif_2010>();
        this.lstDatosRango5F = new ArrayList<Vif_2010>();
        this.lstDatosRango5M = new ArrayList<Vif_2010>();
        this.lstDatosRango6F = new ArrayList<Vif_2010>();
        this.lstDatosRango6M = new ArrayList<Vif_2010>();
        this.lstDatosRango7F = new ArrayList<Vif_2010>();
        this.lstDatosRango7M = new ArrayList<Vif_2010>();
        this.lstDatosRangoNaF = new ArrayList<Vif_2010>();
        this.lstDatosRangoNaM = new ArrayList<Vif_2010>();
        this.cargarDatos();
        this.init();
    }

    private CartesianChartModel graficaEdadSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosRango1F = FVif_2010.ObtenerDatosSexoVictimaEdad1("F");
            lstDatosRango1M = FVif_2010.ObtenerDatosSexoVictimaEdad1("M");
            lstDatosRango2F = FVif_2010.ObtenerDatosSexoVictimaEdad2("F");
            lstDatosRango2M = FVif_2010.ObtenerDatosSexoVictimaEdad2("M");
            lstDatosRango3F = FVif_2010.ObtenerDatosSexoVictimaEdad3("F");
            lstDatosRango3M = FVif_2010.ObtenerDatosSexoVictimaEdad3("M");
            lstDatosRango4F = FVif_2010.ObtenerDatosSexoVictimaEdad4("F");
            lstDatosRango4M = FVif_2010.ObtenerDatosSexoVictimaEdad4("M");
            lstDatosRango5F = FVif_2010.ObtenerDatosSexoVictimaEdad5("F");
            lstDatosRango5M = FVif_2010.ObtenerDatosSexoVictimaEdad5("M");
            lstDatosRango6F = FVif_2010.ObtenerDatosSexoVictimaEdad6("F");
            lstDatosRango6M = FVif_2010.ObtenerDatosSexoVictimaEdad6("M");
            lstDatosRango7F = FVif_2010.ObtenerDatosSexoVictimaEdad7("F");
            lstDatosRango7M = FVif_2010.ObtenerDatosSexoVictimaEdad7("M");
            lstDatosRangoNaF = FVif_2010.ObtenerDatosSexoVictimaEdadNa("F");
            lstDatosRangoNaM = FVif_2010.ObtenerDatosSexoVictimaEdadNa("M");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("desde 0 hasta 12", lstDatosRango1M.size());
            Masculino.set("desde 12 hasta 18", lstDatosRango2M.size());
            Masculino.set("desde 18 hasta 30", lstDatosRango3M.size());
            Masculino.set("desde 30 hasta 40", lstDatosRango4M.size());
            Masculino.set("desde 40 hasta 50", lstDatosRango5M.size());
            Masculino.set("desde 50 hasta 65", lstDatosRango6M.size());
            Masculino.set("mayores de 65", lstDatosRango7M.size());
            Masculino.set("NA", lstDatosRangoNaM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("desde 0 hasta 12", lstDatosRango1F.size());
            Femenino.set("desde 12 hasta 18", lstDatosRango2F.size());
            Femenino.set("desde 18 hasta 30", lstDatosRango3F.size());
            Femenino.set("desde 30 hasta 40", lstDatosRango4F.size());
            Femenino.set("desde 40 hasta 50", lstDatosRango5F.size());
            Femenino.set("desde 50 hasta 65", lstDatosRango6F.size());
            Femenino.set("mayores de 65", lstDatosRango7F.size());
            Femenino.set("NA", lstDatosRangoNaF.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel graficaEdadesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries edades = new ChartSeries();
            edades.setLabel("Edades");
            this.lstDatosRango1 = FVif_2010.obtenerEdadRango1();
            this.lstDatosRango2 = FVif_2010.obtenerEdadRango2();
            this.lstDatosRango3 = FVif_2010.obtenerEdadRango3();
            this.lstDatosRango4 = FVif_2010.obtenerEdadRango4();
            this.lstDatosRango5 = FVif_2010.obtenerEdadRango5();
            this.lstDatosRango6 = FVif_2010.obtenerEdadRango6();
            this.lstDatosRango7 = FVif_2010.obtenerEdadRango7();
            this.lstDatosRangoNa = FVif_2010.obtenerEdadRangoNA();

            edades.set("desde 0 hasta 12", lstDatosRango1.size());
            edades.set("desde 12 hasta 18", lstDatosRango2.size());
            edades.set("desde 18 hasta 30", lstDatosRango3.size());
            edades.set("desde 30 hasta 40", lstDatosRango4.size());
            edades.set("desde 40 hasta 50", lstDatosRango5.size());
            edades.set("desde 50 hasta 65", lstDatosRango6.size());
            edades.set("mayores de 65", lstDatosRango7.size());
            edades.set("NA", lstDatosRangoNa.size());
            
            model.addSeries(edades);
        } catch (Exception e) {
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
