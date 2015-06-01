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
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorDenunciaAnio {

    /**
     * Creates a new instance of Vif_2012ControladorDenunciaAnio
     */
    private CartesianChartModel graficoAnio;
    private CartesianChartModel graficaAnioSV;

    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatos11;
    private ArrayList<Vif_2012> lstDatos12;
    private ArrayList<Vif_2012> lstDatos13;
    private ArrayList<Vif_2012> lstDatos14;
    private ArrayList<Vif_2012> lstDatos15;
    private ArrayList<Vif_2012> lstDatos16;
    private ArrayList<Vif_2012> lstDatos17;
    private ArrayList<Vif_2012> lstDatos18;
    private ArrayList<Vif_2012> lstDatos19;
    private ArrayList<Vif_2012> lstDatos20;
    private ArrayList<Vif_2012> lstDatos21;
    private ArrayList<Vif_2012> lstDatos22;
    private ArrayList<Vif_2012> lstDatosEneroM;
    private ArrayList<Vif_2012> lstDatosEneroF;
    private ArrayList<Vif_2012> lstDatosFebreroM;
    private ArrayList<Vif_2012> lstDatosFebreroF;
    private ArrayList<Vif_2012> lstDatosEnero;
    private ArrayList<Vif_2012> lstDatosEnero1;
    private ArrayList<Vif_2012> lstDatosMarzoM;
    private ArrayList<Vif_2012> lstDatosMarzoF;
    private ArrayList<Vif_2012> lstDatosAbrilM;
    private ArrayList<Vif_2012> lstDatosAbrilF;
    private ArrayList<Vif_2012> lstDatosMayoM;
    private ArrayList<Vif_2012> lstDatosMayoF;
    private ArrayList<Vif_2012> lstDatosJunioM;
    private ArrayList<Vif_2012> lstDatosJunioF;
    private ArrayList<Vif_2012> lstDatosJulioM;
    private ArrayList<Vif_2012> lstDatosJulioF;
    private ArrayList<Vif_2012> lstDatosAgostoM;
    private ArrayList<Vif_2012> lstDatosAgostoF;
    private ArrayList<Vif_2012> lstDatosSeptiembreM;
    private ArrayList<Vif_2012> lstDatosSeptiembreF;
    private ArrayList<Vif_2012> lstDatosOctubreM;
    private ArrayList<Vif_2012> lstDatosOctubreF;
    private ArrayList<Vif_2012> lstDatosNoviembreM;
    private ArrayList<Vif_2012> lstDatosNoviembreF;
    private ArrayList<Vif_2012> lstDatosDiciembreM;
    private ArrayList<Vif_2012> lstDatosDiciembreF;

    public CartesianChartModel getGraficoAnio() {
        return graficoAnio;
    }

    public void setGraficoAnio(CartesianChartModel graficoAnio) {
        this.graficoAnio = graficoAnio;
    }

    public CartesianChartModel getGraficaAnioSV() {
        return graficaAnioSV;
    }

    public void setGraficaAnioSV(CartesianChartModel graficaAnioSV) {
        this.graficaAnioSV = graficaAnioSV;
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

    public ArrayList<Vif_2012> getLstDatos11() {
        return lstDatos11;
    }

    public void setLstDatos11(ArrayList<Vif_2012> lstDatos11) {
        this.lstDatos11 = lstDatos11;
    }

    public ArrayList<Vif_2012> getLstDatos12() {
        return lstDatos12;
    }

    public void setLstDatos12(ArrayList<Vif_2012> lstDatos12) {
        this.lstDatos12 = lstDatos12;
    }

    public ArrayList<Vif_2012> getLstDatos13() {
        return lstDatos13;
    }

    public void setLstDatos13(ArrayList<Vif_2012> lstDatos13) {
        this.lstDatos13 = lstDatos13;
    }

    public ArrayList<Vif_2012> getLstDatos14() {
        return lstDatos14;
    }

    public void setLstDatos14(ArrayList<Vif_2012> lstDatos14) {
        this.lstDatos14 = lstDatos14;
    }

    public ArrayList<Vif_2012> getLstDatos15() {
        return lstDatos15;
    }

    public void setLstDatos15(ArrayList<Vif_2012> lstDatos15) {
        this.lstDatos15 = lstDatos15;
    }

    public ArrayList<Vif_2012> getLstDatos16() {
        return lstDatos16;
    }

    public void setLstDatos16(ArrayList<Vif_2012> lstDatos16) {
        this.lstDatos16 = lstDatos16;
    }

    public ArrayList<Vif_2012> getLstDatos17() {
        return lstDatos17;
    }

    public void setLstDatos17(ArrayList<Vif_2012> lstDatos17) {
        this.lstDatos17 = lstDatos17;
    }

    public ArrayList<Vif_2012> getLstDatos18() {
        return lstDatos18;
    }

    public void setLstDatos18(ArrayList<Vif_2012> lstDatos18) {
        this.lstDatos18 = lstDatos18;
    }

    public ArrayList<Vif_2012> getLstDatos19() {
        return lstDatos19;
    }

    public void setLstDatos19(ArrayList<Vif_2012> lstDatos19) {
        this.lstDatos19 = lstDatos19;
    }

    public ArrayList<Vif_2012> getLstDatos20() {
        return lstDatos20;
    }

    public void setLstDatos20(ArrayList<Vif_2012> lstDatos20) {
        this.lstDatos20 = lstDatos20;
    }

    public ArrayList<Vif_2012> getLstDatos21() {
        return lstDatos21;
    }

    public void setLstDatos21(ArrayList<Vif_2012> lstDatos21) {
        this.lstDatos21 = lstDatos21;
    }

    public ArrayList<Vif_2012> getLstDatos22() {
        return lstDatos22;
    }

    public void setLstDatos22(ArrayList<Vif_2012> lstDatos22) {
        this.lstDatos22 = lstDatos22;
    }

    public ArrayList<Vif_2012> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<Vif_2012> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<Vif_2012> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<Vif_2012> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<Vif_2012> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<Vif_2012> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<Vif_2012> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<Vif_2012> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<Vif_2012> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2012> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<Vif_2012> getLstDatosEnero1() {
        return lstDatosEnero1;
    }

    public void setLstDatosEnero1(ArrayList<Vif_2012> lstDatosEnero1) {
        this.lstDatosEnero1 = lstDatosEnero1;
    }

    public ArrayList<Vif_2012> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<Vif_2012> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<Vif_2012> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<Vif_2012> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<Vif_2012> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<Vif_2012> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<Vif_2012> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<Vif_2012> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<Vif_2012> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<Vif_2012> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<Vif_2012> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<Vif_2012> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<Vif_2012> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<Vif_2012> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<Vif_2012> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<Vif_2012> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<Vif_2012> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<Vif_2012> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<Vif_2012> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<Vif_2012> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<Vif_2012> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<Vif_2012> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<Vif_2012> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<Vif_2012> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<Vif_2012> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<Vif_2012> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<Vif_2012> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<Vif_2012> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<Vif_2012> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<Vif_2012> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2012> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2012> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<Vif_2012> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<Vif_2012> lstDatosDiciembreF) {
        this.lstDatosDiciembreF = lstDatosDiciembreF;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public Vif_2012ControladorDenunciaAnio() {
        this.reinit();

    }

    private void reinit() {
        this.datoSel = new Vif_2012();
        this.lstDatos11 = new ArrayList<Vif_2012>();
        this.lstDatos12 = new ArrayList<Vif_2012>();
        this.lstDatos13 = new ArrayList<Vif_2012>();
        this.lstDatos14 = new ArrayList<Vif_2012>();
        this.lstDatos15 = new ArrayList<Vif_2012>();
        this.lstDatos16 = new ArrayList<Vif_2012>();
        this.lstDatos17 = new ArrayList<Vif_2012>();
        this.lstDatos18 = new ArrayList<Vif_2012>();
        this.lstDatos19 = new ArrayList<Vif_2012>();
        this.lstDatos20 = new ArrayList<Vif_2012>();
        this.lstDatos21 = new ArrayList<Vif_2012>();
        this.lstDatos22 = new ArrayList<Vif_2012>();
        this.lstDatosEnero = new ArrayList<Vif_2012>();
        this.lstDatosEnero1 = new ArrayList<Vif_2012>();
        this.lstDatosEneroF = new ArrayList<Vif_2012>();
        this.lstDatosEneroM = new ArrayList<Vif_2012>();
        this.lstDatosFebreroF = new ArrayList<Vif_2012>();
        this.lstDatosFebreroM = new ArrayList<Vif_2012>();
        this.lstDatosMarzoF = new ArrayList<Vif_2012>();
        this.lstDatosMarzoM = new ArrayList<Vif_2012>();
        this.lstDatosAbrilF = new ArrayList<Vif_2012>();
        this.lstDatosAbrilM = new ArrayList<Vif_2012>();
        this.lstDatosMayoF = new ArrayList<Vif_2012>();
        this.lstDatosMayoM = new ArrayList<Vif_2012>();
        this.lstDatosJunioF = new ArrayList<Vif_2012>();
        this.lstDatosJunioM = new ArrayList<Vif_2012>();
        this.lstDatosJulioF = new ArrayList<Vif_2012>();
        this.lstDatosJulioM = new ArrayList<Vif_2012>();
        this.lstDatosAgostoF = new ArrayList<Vif_2012>();
        this.lstDatosAgostoM = new ArrayList<Vif_2012>();
        this.lstDatosSeptiembreF = new ArrayList<Vif_2012>();
        this.lstDatosSeptiembreM = new ArrayList<Vif_2012>();
        this.lstDatosOctubreF = new ArrayList<Vif_2012>();
        this.lstDatosOctubreM = new ArrayList<Vif_2012>();
        this.lstDatosNoviembreF = new ArrayList<Vif_2012>();
        this.lstDatosNoviembreM = new ArrayList<Vif_2012>();
        this.lstDatosDiciembreF = new ArrayList<Vif_2012>();
        this.lstDatosDiciembreM = new ArrayList<Vif_2012>();

        this.cargarDatos();
        this.init();
    }

    public void graficar() {
        graficoAnio = graficaAño();
        graficaAnioSV = graficaSexoVictima();
    }

    private CartesianChartModel graficaAño() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Año = new ChartSeries();
            Año.setLabel("Año 2012");
            lstDatos11 = FVif_2012.ObtenerDatosEnero();
            lstDatos12 = FVif_2012.ObtenerDatosFebrero();
            lstDatos13 = FVif_2012.ObtenerDatosMarzo();
            lstDatos14 = FVif_2012.ObtenerDatosAbril();
            lstDatos15 = FVif_2012.ObtenerDatosMayo();
            lstDatos16 = FVif_2012.ObtenerDatosJunio();
            lstDatos17 = FVif_2012.ObtenerDatosJulio();
            lstDatos18 = FVif_2012.ObtenerDatosAgosto();
            lstDatos19 = FVif_2012.ObtenerDatosSeptiembre();
            lstDatos20 = FVif_2012.ObtenerDatosOctubre();
            lstDatos21 = FVif_2012.ObtenerDatosNoviembre();
            lstDatos22 = FVif_2012.ObtenerDatosDiciembre();

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

    private CartesianChartModel graficaSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEneroM = FVif_2012.ObtenerDatosSexoVictimaEnero("M");
            lstDatosEneroF = FVif_2012.ObtenerDatosSexoVictimaEnero("F");
            lstDatosFebreroM = FVif_2012.ObtenerDatosSexoVictimaFebrero("M");
            lstDatosFebreroF = FVif_2012.ObtenerDatosSexoVictimaFebrero("F");
            lstDatosMarzoM = FVif_2012.ObtenerDatosSexoVictimaMarzo("M");
            lstDatosMarzoF = FVif_2012.ObtenerDatosSexoVictimaMarzo("F");
            lstDatosAbrilM = FVif_2012.ObtenerDatosSexoVictimaAbril("M");
            lstDatosAbrilF = FVif_2012.ObtenerDatosSexoVictimaAbril("F");
            lstDatosMayoM = FVif_2012.ObtenerDatosSexoVictimaMayo("M");
            lstDatosMayoF = FVif_2012.ObtenerDatosSexoVictimaMayo("F");
            lstDatosJunioM = FVif_2012.ObtenerDatosSexoVictimaJunio("M");
            lstDatosJunioF = FVif_2012.ObtenerDatosSexoVictimaJunio("F");
            lstDatosJulioM = FVif_2012.ObtenerDatosSexoVictimaJulio("M");
            lstDatosJulioF = FVif_2012.ObtenerDatosSexoVictimaJulio("F");
            lstDatosAgostoM = FVif_2012.ObtenerDatosSexoVictimaAgosto("M");
            lstDatosAgostoF = FVif_2012.ObtenerDatosSexoVictimaAgosto("F");
            lstDatosSeptiembreM = FVif_2012.ObtenerDatosSexoVictimaSeptiembre("M");
            lstDatosSeptiembreF = FVif_2012.ObtenerDatosSexoVictimaSeptiembre("F");
            lstDatosOctubreM = FVif_2012.ObtenerDatosSexoVictimaOctubre("M");
            lstDatosOctubreF = FVif_2012.ObtenerDatosSexoVictimaOctubre("F");
            lstDatosNoviembreM = FVif_2012.ObtenerDatosSexoVictimaNoviembre("M");
            lstDatosNoviembreF = FVif_2012.ObtenerDatosSexoVictimaNoviembre("F");
            lstDatosDiciembreM = FVif_2012.ObtenerDatosSexoVictimaDiciembre("M");
            lstDatosDiciembreF = FVif_2012.ObtenerDatosSexoVictimaDiciembre("F");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Femenino");
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
            Femenino.setLabel("Masculino");
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

            this.lstDatos = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
