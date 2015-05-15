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
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2010Controlador2 {

    private CartesianChartModel graficoAño;
    private CartesianChartModel graficaEnero;
    private CartesianChartModel graficaFebrero;
    private CartesianChartModel graficaMarzo;
    private CartesianChartModel graficaAbril;
    private CartesianChartModel graficaMayo;
    private CartesianChartModel graficaJunio;
    private CartesianChartModel graficaJulio;
    private CartesianChartModel graficaAgosto;
    private CartesianChartModel graficaSeptiembre;
    private CartesianChartModel graficaOctubre;
    private CartesianChartModel graficaNoviembre;
    private CartesianChartModel graficaDiciembre;

    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatos11;
    private ArrayList<Vif_2010> lstDatos12;
    private ArrayList<Vif_2010> lstDatos13;
    private ArrayList<Vif_2010> lstDatos14;
    private ArrayList<Vif_2010> lstDatos15;
    private ArrayList<Vif_2010> lstDatos16;
    private ArrayList<Vif_2010> lstDatos17;
    private ArrayList<Vif_2010> lstDatos18;
    private ArrayList<Vif_2010> lstDatos19;
    private ArrayList<Vif_2010> lstDatos20;
    private ArrayList<Vif_2010> lstDatos21;
    private ArrayList<Vif_2010> lstDatos22;
    private ArrayList<Vif_2010> lstDatosEneroM;
    private ArrayList<Vif_2010> lstDatosEneroF;
    private ArrayList<Vif_2010> lstDatosFebreroM;
    private ArrayList<Vif_2010> lstDatosFebreroF;
    private ArrayList<Vif_2010> lstDatosEnero;
    private ArrayList<Vif_2010> lstDatosEnero1;
    private ArrayList<Vif_2010> lstDatosMarzoM;
    private ArrayList<Vif_2010> lstDatosMarzoF;
    private ArrayList<Vif_2010> lstDatosAbrilM;
    private ArrayList<Vif_2010> lstDatosAbrilF;
    private ArrayList<Vif_2010> lstDatosMayoM;
    private ArrayList<Vif_2010> lstDatosMayoF;
    private ArrayList<Vif_2010> lstDatosJunioM;
    private ArrayList<Vif_2010> lstDatosJunioF;
    private ArrayList<Vif_2010> lstDatosJulioM;
    private ArrayList<Vif_2010> lstDatosJulioF;
    private ArrayList<Vif_2010> lstDatosAgostoM;
    private ArrayList<Vif_2010> lstDatosAgostoF;
    private ArrayList<Vif_2010> lstDatosSeptiembreM;
    private ArrayList<Vif_2010> lstDatosSeptiembreF;
    private ArrayList<Vif_2010> lstDatosOctubreM;
    private ArrayList<Vif_2010> lstDatosOctubreF;
    private ArrayList<Vif_2010> lstDatosNoviembreM;
    private ArrayList<Vif_2010> lstDatosNoviembreF;
    private ArrayList<Vif_2010> lstDatosDiciembreM;
    private ArrayList<Vif_2010> lstDatosDiciembreF;

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public ArrayList<Vif_2010> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<Vif_2010> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<Vif_2010> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<Vif_2010> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<Vif_2010> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<Vif_2010> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<Vif_2010> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<Vif_2010> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<Vif_2010> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<Vif_2010> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<Vif_2010> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<Vif_2010> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<Vif_2010> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<Vif_2010> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<Vif_2010> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<Vif_2010> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<Vif_2010> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<Vif_2010> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<Vif_2010> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<Vif_2010> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<Vif_2010> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<Vif_2010> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<Vif_2010> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<Vif_2010> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<Vif_2010> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<Vif_2010> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2010> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2010> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<Vif_2010> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<Vif_2010> lstDatosDiciembreF) {
        this.lstDatosDiciembreF = lstDatosDiciembreF;
    }
    
    
    public ArrayList<Vif_2010> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<Vif_2010> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<Vif_2010> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<Vif_2010> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
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

    public CartesianChartModel getGraficoAño() {
        return graficoAño;
    }

    public void setGraficoAño(CartesianChartModel graficoAño) {
        this.graficoAño = graficoAño;
    }

    public CartesianChartModel getGraficaEnero() {
        return graficaEnero;
    }

    public void setGraficaEnero(CartesianChartModel graficaEnero) {
        this.graficaEnero = graficaEnero;
    }

    public CartesianChartModel getGraficaFebrero() {
        return graficaFebrero;
    }

    public void setGraficaFebrero(CartesianChartModel graficaFebrero) {
        this.graficaFebrero = graficaFebrero;
    }

    public CartesianChartModel getGraficaMarzo() {
        return graficaMarzo;
    }

    public void setGraficaMarzo(CartesianChartModel graficaMarzo) {
        this.graficaMarzo = graficaMarzo;
    }

    public CartesianChartModel getGraficaAbril() {
        return graficaAbril;
    }

    public void setGraficaAbril(CartesianChartModel graficaAbril) {
        this.graficaAbril = graficaAbril;
    }

    public CartesianChartModel getGraficaMayo() {
        return graficaMayo;
    }

    public void setGraficaMayo(CartesianChartModel graficaMayo) {
        this.graficaMayo = graficaMayo;
    }

    public CartesianChartModel getGraficaJunio() {
        return graficaJunio;
    }

    public void setGraficaJunio(CartesianChartModel graficaJunio) {
        this.graficaJunio = graficaJunio;
    }

    public CartesianChartModel getGraficaJulio() {
        return graficaJulio;
    }

    public void setGraficaJulio(CartesianChartModel graficaJulio) {
        this.graficaJulio = graficaJulio;
    }

    public CartesianChartModel getGraficaAgosto() {
        return graficaAgosto;
    }

    public void setGraficaAgosto(CartesianChartModel graficaAgosto) {
        this.graficaAgosto = graficaAgosto;
    }

    public CartesianChartModel getGraficaSeptiembre() {
        return graficaSeptiembre;
    }

    public void setGraficaSeptiembre(CartesianChartModel graficaSeptiembre) {
        this.graficaSeptiembre = graficaSeptiembre;
    }

    public CartesianChartModel getGraficaOctubre() {
        return graficaOctubre;
    }

    public void setGraficaOctubre(CartesianChartModel graficaOctubre) {
        this.graficaOctubre = graficaOctubre;
    }

    public CartesianChartModel getGraficaNoviembre() {
        return graficaNoviembre;
    }

    public void setGraficaNoviembre(CartesianChartModel graficaNoviembre) {
        this.graficaNoviembre = graficaNoviembre;
    }

    public CartesianChartModel getGraficaDiciembre() {
        return graficaDiciembre;
    }

    public void setGraficaDiciembre(CartesianChartModel graficaDiciembre) {
        this.graficaDiciembre = graficaDiciembre;
    }

    public ArrayList<Vif_2010> getLstDatos11() {
        return lstDatos11;
    }

    public void setLstDatos11(ArrayList<Vif_2010> lstDatos11) {
        this.lstDatos11 = lstDatos11;
    }

    public ArrayList<Vif_2010> getLstDatos12() {
        return lstDatos12;
    }

    public void setLstDatos12(ArrayList<Vif_2010> lstDatos12) {
        this.lstDatos12 = lstDatos12;
    }

    public ArrayList<Vif_2010> getLstDatos13() {
        return lstDatos13;
    }

    public void setLstDatos13(ArrayList<Vif_2010> lstDatos13) {
        this.lstDatos13 = lstDatos13;
    }

    public ArrayList<Vif_2010> getLstDatos14() {
        return lstDatos14;
    }

    public void setLstDatos14(ArrayList<Vif_2010> lstDatos14) {
        this.lstDatos14 = lstDatos14;
    }

    public ArrayList<Vif_2010> getLstDatos15() {
        return lstDatos15;
    }

    public void setLstDatos15(ArrayList<Vif_2010> lstDatos15) {
        this.lstDatos15 = lstDatos15;
    }

    public ArrayList<Vif_2010> getLstDatos16() {
        return lstDatos16;
    }

    public void setLstDatos16(ArrayList<Vif_2010> lstDatos16) {
        this.lstDatos16 = lstDatos16;
    }

    public ArrayList<Vif_2010> getLstDatos17() {
        return lstDatos17;
    }

    public void setLstDatos17(ArrayList<Vif_2010> lstDatos17) {
        this.lstDatos17 = lstDatos17;
    }

    public ArrayList<Vif_2010> getLstDatos18() {
        return lstDatos18;
    }

    public void setLstDatos18(ArrayList<Vif_2010> lstDatos18) {
        this.lstDatos18 = lstDatos18;
    }

    public ArrayList<Vif_2010> getLstDatos19() {
        return lstDatos19;
    }

    public void setLstDatos19(ArrayList<Vif_2010> lstDatos19) {
        this.lstDatos19 = lstDatos19;
    }

    public ArrayList<Vif_2010> getLstDatos20() {
        return lstDatos20;
    }

    public void setLstDatos20(ArrayList<Vif_2010> lstDatos20) {
        this.lstDatos20 = lstDatos20;
    }

    public ArrayList<Vif_2010> getLstDatos21() {
        return lstDatos21;
    }

    public void setLstDatos21(ArrayList<Vif_2010> lstDatos21) {
        this.lstDatos21 = lstDatos21;
    }

    public ArrayList<Vif_2010> getLstDatos22() {
        return lstDatos22;
    }

    public void setLstDatos22(ArrayList<Vif_2010> lstDatos22) {
        this.lstDatos22 = lstDatos22;
    }

    public ArrayList<Vif_2010> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<Vif_2010> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<Vif_2010> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<Vif_2010> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<Vif_2010> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<Vif_2010> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<Vif_2010> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<Vif_2010> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<Vif_2010> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2010> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<Vif_2010> getLstDatosEnero1() {
        return lstDatosEnero1;
    }

    public void setLstDatosEnero1(ArrayList<Vif_2010> lstDatosEnero1) {
        this.lstDatosEnero1 = lstDatosEnero1;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public Vif_2010Controlador2() {
        this.reinit();
    }

    private void reinit() {
        this.datoSel = new Vif_2010();
        this.lstDatos11 = new ArrayList<Vif_2010>();
        this.lstDatos12 = new ArrayList<Vif_2010>();
        //this.lstDatos13 = new ArrayList<Integer>();
        this.lstDatos13 = new ArrayList<Vif_2010>();
        this.lstDatos14 = new ArrayList<Vif_2010>();
        this.lstDatos15 = new ArrayList<Vif_2010>();
        this.lstDatos16 = new ArrayList<Vif_2010>();
        this.lstDatos17 = new ArrayList<Vif_2010>();
        this.lstDatos18 = new ArrayList<Vif_2010>();
        this.lstDatos19 = new ArrayList<Vif_2010>();
        this.lstDatos20 = new ArrayList<Vif_2010>();
        this.lstDatos21 = new ArrayList<Vif_2010>();
        this.lstDatos22 = new ArrayList<Vif_2010>();
        this.lstDatosEnero = new ArrayList<Vif_2010>();
        this.lstDatosEnero1 = new ArrayList<Vif_2010>();
        this.lstDatosEneroF = new ArrayList<Vif_2010>();
        this.lstDatosEneroM = new ArrayList<Vif_2010>();
        this.lstDatosFebreroF = new ArrayList<Vif_2010>();
        this.lstDatosFebreroM = new ArrayList<Vif_2010>();
        this.lstDatosMarzoF = new ArrayList<Vif_2010>();
        this.lstDatosMarzoM = new ArrayList<Vif_2010>();
        this.lstDatosAbrilF = new ArrayList<Vif_2010>();
        this.lstDatosAbrilM = new ArrayList<Vif_2010>();
        this.lstDatosMayoF = new ArrayList<Vif_2010>();
        this.lstDatosMayoM = new ArrayList<Vif_2010>();
        this.lstDatosJunioF = new ArrayList<Vif_2010>();
        this.lstDatosJunioM = new ArrayList<Vif_2010>();
        this.lstDatosJulioF = new ArrayList<Vif_2010>();
        this.lstDatosJulioM = new ArrayList<Vif_2010>();
        this.lstDatosAgostoF = new ArrayList<Vif_2010>();
        this.lstDatosAgostoM = new ArrayList<Vif_2010>();
        this.lstDatosSeptiembreF = new ArrayList<Vif_2010>();
        this.lstDatosSeptiembreM = new ArrayList<Vif_2010>();
        this.lstDatosOctubreF = new ArrayList<Vif_2010>();
        this.lstDatosOctubreM = new ArrayList<Vif_2010>();
        this.lstDatosNoviembreF = new ArrayList<Vif_2010>();
        this.lstDatosNoviembreM = new ArrayList<Vif_2010>();
        this.lstDatosDiciembreF = new ArrayList<Vif_2010>();
        this.lstDatosDiciembreM = new ArrayList<Vif_2010>();

        this.cargarDatos();
        this.init();
    }

    public void graficar() {
        graficoAño = graficaAño();
        graficaEnero = graficaEnero2010();
    }

    private CartesianChartModel graficaAño() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries Año = new ChartSeries();
            Año.setLabel("Año 2010");
            lstDatos11 = FVif_2010.ObtenerDatosEnero();
            lstDatos12 = FVif_2010.ObtenerDatosFebrero();
            lstDatos13 = FVif_2010.ObtenerDatosMarzo();
            lstDatos14 = FVif_2010.ObtenerDatosAbril();
            lstDatos15 = FVif_2010.ObtenerDatosMayo();
            lstDatos16 = FVif_2010.ObtenerDatosJunio();
            lstDatos17 = FVif_2010.ObtenerDatosJulio();
            lstDatos18 = FVif_2010.ObtenerDatosAgosto();
            lstDatos19 = FVif_2010.ObtenerDatosSeptiembre();
            lstDatos20 = FVif_2010.ObtenerDatosOctubre();
            lstDatos21 = FVif_2010.ObtenerDatosNoviembre();
            lstDatos22 = FVif_2010.ObtenerDatosDiciembre();

            Año.set("Enero", lstDatos11.size());
            Año.set("Febrero", lstDatos12.size());
            Año.set("Marzo", lstDatos13.size());
            Año.set("Abril", lstDatos14.size());
            Año.set("Mayo", lstDatos15.size());
            Año.set("Junio", lstDatos16.size());
            Año.set("Julio", lstDatos17.size());
            Año.set("Agosto", lstDatos18.size());
            Año.set("Septiembre", lstDatos19.size());
            Año.set("Octubre", lstDatos20.size());
            Año.set("Noviembre", lstDatos21.size());
            Año.set("Diciembre", lstDatos22.size());

            model.addSeries(Año);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel graficaEnero2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEneroM = FVif_2010.ObtenerDatosSexoAgresorEneroMasculino();
            lstDatosEneroF = FVif_2010.ObtenerDatosSexoAgresorEneroFemenino();
            lstDatosFebreroM = FVif_2010.ObtenerDatosSexoAgresorFebreroMasculino();
            lstDatosFebreroF = FVif_2010.ObtenerDatosSexoAgresorFebreroFemenino();
            lstDatosMarzoM = FVif_2010.ObtenerDatosSexoAgresorMarzo("M");
            lstDatosMarzoF = FVif_2010.ObtenerDatosSexoAgresorMarzo("F");
            lstDatosAbrilM = FVif_2010.ObtenerDatosSexoAgresorAbril("M");
            lstDatosAbrilF = FVif_2010.ObtenerDatosSexoAgresorAbril("F");
            lstDatosMayoM = FVif_2010.ObtenerDatosSexoAgresorMayo("M");
            lstDatosMayoF = FVif_2010.ObtenerDatosSexoAgresorMayo("F");
            lstDatosJunioM = FVif_2010.ObtenerDatosSexoAgresorJunio("M");
            lstDatosJunioF = FVif_2010.ObtenerDatosSexoAgresorJunio("F");
            lstDatosJulioM = FVif_2010.ObtenerDatosSexoAgresorJulio("M");
            lstDatosJulioF = FVif_2010.ObtenerDatosSexoAgresorJulio("F");
            lstDatosAgostoM = FVif_2010.ObtenerDatosSexoAgresorAgosto("M");
            lstDatosAgostoF = FVif_2010.ObtenerDatosSexoAgresorAgosto("F");
            lstDatosSeptiembreM = FVif_2010.ObtenerDatosSexoAgresorSeptiembre("M");
            lstDatosSeptiembreF = FVif_2010.ObtenerDatosSexoAgresorSeptiembre("F");
            lstDatosOctubreM = FVif_2010.ObtenerDatosSexoAgresorOctubre("M");
            lstDatosOctubreF = FVif_2010.ObtenerDatosSexoAgresorOctubre("F");
            lstDatosNoviembreM = FVif_2010.ObtenerDatosSexoAgresorNoviembre("M");
            lstDatosNoviembreF = FVif_2010.ObtenerDatosSexoAgresorNoviembre("F");
            lstDatosDiciembreM = FVif_2010.ObtenerDatosSexoAgresorDiciembre("M");
            lstDatosDiciembreF = FVif_2010.ObtenerDatosSexoAgresorDiciembre("F");
            
            
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Enero", lstDatosEneroM.size());
            Masculino.set("Febrero", lstDatosFebreroM.size());
            Masculino.set("Marzo", lstDatosMarzoM.size());
            Masculino.set("Abril", lstDatosAbrilM.size());
            Masculino.set("Mayo", lstDatosMayoM.size());
            Masculino.set("Junio", lstDatosJunioM.size());
            Masculino.set("Julio", lstDatosJulioM.size());
            Masculino.set("Agosto", lstDatosAgostoM.size());
            Masculino.set("Septiembre", lstDatosSeptiembreM.size());
            Masculino.set("Octubre", lstDatosOctubreM.size());
            Masculino.set("Noviembre", lstDatosNoviembreM.size());
            Masculino.set("Diciembre", lstDatosDiciembreM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("Enero", lstDatosEneroF.size());
            Femenino.set("Febrero", lstDatosFebreroF.size());
            Femenino.set("Marzo", lstDatosMarzoF.size());
            Femenino.set("Abril", lstDatosAbrilF.size());
            Femenino.set("Mayo", lstDatosMayoF.size());
            Femenino.set("Junio", lstDatosJunioF.size());
            Femenino.set("Julio", lstDatosJulioF.size());
            Femenino.set("Agosto", lstDatosAgostoF.size());
            Femenino.set("Septiembre", lstDatosSeptiembreF.size());
            Femenino.set("Octubre", lstDatosOctubreF.size());
            Femenino.set("Noviembre", lstDatosNoviembreF.size());
            Femenino.set("Diciembre", lstDatosDiciembreF.size());


            model.addSeries(Masculino);
            model.addSeries(Femenino);

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
