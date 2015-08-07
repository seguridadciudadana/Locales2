/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

@ManagedBean
@RequestScoped
public class Vif_2012ControladorDiaAnioAgresion {

    private CartesianChartModel lineModelDiaAgresion;
    private CartesianChartModel lineModelDiaAgresionSexoVictima;
    private CartesianChartModel lineModelMesesAgresion;
    private CartesianChartModel lineModelMesesAgresionSexoVictima;
    private Vif_2012 objDatos;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatosLunes;
    private ArrayList<Vif_2012> lstDatosMartes;
    private ArrayList<Vif_2012> lstDatosMiercoles;
    private ArrayList<Vif_2012> lstDatosJueves;
    private ArrayList<Vif_2012> lstDatosViernes;
    private ArrayList<Vif_2012> lstDatosSabado;
    private ArrayList<Vif_2012> lstDatosDomingo;
    private ArrayList<Vif_2012> lstDatosLunesM;
    private ArrayList<Vif_2012> lstDatosMartesM;
    private ArrayList<Vif_2012> lstDatosMiercolesM;
    private ArrayList<Vif_2012> lstDatosJuevesM;
    private ArrayList<Vif_2012> lstDatosViernesM;
    private ArrayList<Vif_2012> lstDatosSabadoM;
    private ArrayList<Vif_2012> lstDatosDomingoM;
    private ArrayList<Vif_2012> lstDatosLunesF;
    private ArrayList<Vif_2012> lstDatosMartesF;
    private ArrayList<Vif_2012> lstDatosMiercolesF;
    private ArrayList<Vif_2012> lstDatosJuevesF;
    private ArrayList<Vif_2012> lstDatosViernesF;
    private ArrayList<Vif_2012> lstDatosSabadoF;
    private ArrayList<Vif_2012> lstDatosDomingoF;
    private ArrayList<Vif_2012> lstDatosEnero;
    private ArrayList<Vif_2012> lstDatosEneroM;
    private ArrayList<Vif_2012> lstDatosEneroF;
    private ArrayList<Vif_2012> lstDatosFebrero;
    private ArrayList<Vif_2012> lstDatosFebreroM;
    private ArrayList<Vif_2012> lstDatosFebreroF;
    private ArrayList<Vif_2012> lstDatosMarzo;
    private ArrayList<Vif_2012> lstDatosMarzoM;
    private ArrayList<Vif_2012> lstDatosMarzoF;
    private ArrayList<Vif_2012> lstDatosAbril;
    private ArrayList<Vif_2012> lstDatosAbrilM;
    private ArrayList<Vif_2012> lstDatosAbrilF;
    private ArrayList<Vif_2012> lstDatosMayo;
    private ArrayList<Vif_2012> lstDatosMayoM;
    private ArrayList<Vif_2012> lstDatosMayoF;
    private ArrayList<Vif_2012> lstDatosJunio;
    private ArrayList<Vif_2012> lstDatosJunioM;
    private ArrayList<Vif_2012> lstDatosJunioF;
    private ArrayList<Vif_2012> lstDatosJulio;
    private ArrayList<Vif_2012> lstDatosJulioM;
    private ArrayList<Vif_2012> lstDatosJulioF;
    private ArrayList<Vif_2012> lstDatosAgosto;
    private ArrayList<Vif_2012> lstDatosAgostoM;
    private ArrayList<Vif_2012> lstDatosAgostoF;
    private ArrayList<Vif_2012> lstDatosSeptiembre;
    private ArrayList<Vif_2012> lstDatosSeptiembreM;
    private ArrayList<Vif_2012> lstDatosSeptiembreF;
    private ArrayList<Vif_2012> lstDatosOctubre;
    private ArrayList<Vif_2012> lstDatosOctubreM;
    private ArrayList<Vif_2012> lstDatosOctubreF;
    private ArrayList<Vif_2012> lstDatosNoviembre;
    private ArrayList<Vif_2012> lstDatosNoviembreF;
    private ArrayList<Vif_2012> lstDatosNoviembreM;
    private ArrayList<Vif_2012> lstDatosDiciembre;
    private ArrayList<Vif_2012> lstDatosDiciembreM;
    private ArrayList<Vif_2012> lstDatosDiciembreF;

    public CartesianChartModel getLineModelDiaAgresion() {
        return lineModelDiaAgresion;
    }

    public void setLineModelDiaAgresion(CartesianChartModel lineModelDiaAgresion) {
        this.lineModelDiaAgresion = lineModelDiaAgresion;
    }

    public CartesianChartModel getLineModelDiaAgresionSexoVictima() {
        return lineModelDiaAgresionSexoVictima;
    }

    public void setLineModelDiaAgresionSexoVictima(CartesianChartModel lineModelDiaAgresionSexoVictima) {
        this.lineModelDiaAgresionSexoVictima = lineModelDiaAgresionSexoVictima;
    }

    public CartesianChartModel getLineModelMesesAgresion() {
        return lineModelMesesAgresion;
    }

    public void setLineModelMesesAgresion(CartesianChartModel lineModelMesesAgresion) {
        this.lineModelMesesAgresion = lineModelMesesAgresion;
    }

    public CartesianChartModel getLineModelMesesAgresionSexoVictima() {
        return lineModelMesesAgresionSexoVictima;
    }

    public void setLineModelMesesAgresionSexoVictima(CartesianChartModel lineModelMesesAgresionSexoVictima) {
        this.lineModelMesesAgresionSexoVictima = lineModelMesesAgresionSexoVictima;
    }

    public Vif_2012 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2012 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Vif_2012> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Vif_2012> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Vif_2012> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Vif_2012> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Vif_2012> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Vif_2012> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Vif_2012> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Vif_2012> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Vif_2012> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Vif_2012> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Vif_2012> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Vif_2012> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Vif_2012> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public ArrayList<Vif_2012> getLstDatosLunesM() {
        return lstDatosLunesM;
    }

    public void setLstDatosLunesM(ArrayList<Vif_2012> lstDatosLunesM) {
        this.lstDatosLunesM = lstDatosLunesM;
    }

    public ArrayList<Vif_2012> getLstDatosMartesM() {
        return lstDatosMartesM;
    }

    public void setLstDatosMartesM(ArrayList<Vif_2012> lstDatosMartesM) {
        this.lstDatosMartesM = lstDatosMartesM;
    }

    public ArrayList<Vif_2012> getLstDatosMiercolesM() {
        return lstDatosMiercolesM;
    }

    public void setLstDatosMiercolesM(ArrayList<Vif_2012> lstDatosMiercolesM) {
        this.lstDatosMiercolesM = lstDatosMiercolesM;
    }

    public ArrayList<Vif_2012> getLstDatosJuevesM() {
        return lstDatosJuevesM;
    }

    public void setLstDatosJuevesM(ArrayList<Vif_2012> lstDatosJuevesM) {
        this.lstDatosJuevesM = lstDatosJuevesM;
    }

    public ArrayList<Vif_2012> getLstDatosViernesM() {
        return lstDatosViernesM;
    }

    public void setLstDatosViernesM(ArrayList<Vif_2012> lstDatosViernesM) {
        this.lstDatosViernesM = lstDatosViernesM;
    }

    public ArrayList<Vif_2012> getLstDatosSabadoM() {
        return lstDatosSabadoM;
    }

    public void setLstDatosSabadoM(ArrayList<Vif_2012> lstDatosSabadoM) {
        this.lstDatosSabadoM = lstDatosSabadoM;
    }

    public ArrayList<Vif_2012> getLstDatosDomingoM() {
        return lstDatosDomingoM;
    }

    public void setLstDatosDomingoM(ArrayList<Vif_2012> lstDatosDomingoM) {
        this.lstDatosDomingoM = lstDatosDomingoM;
    }

    public ArrayList<Vif_2012> getLstDatosLunesF() {
        return lstDatosLunesF;
    }

    public void setLstDatosLunesF(ArrayList<Vif_2012> lstDatosLunesF) {
        this.lstDatosLunesF = lstDatosLunesF;
    }

    public ArrayList<Vif_2012> getLstDatosMartesF() {
        return lstDatosMartesF;
    }

    public void setLstDatosMartesF(ArrayList<Vif_2012> lstDatosMartesF) {
        this.lstDatosMartesF = lstDatosMartesF;
    }

    public ArrayList<Vif_2012> getLstDatosMiercolesF() {
        return lstDatosMiercolesF;
    }

    public void setLstDatosMiercolesF(ArrayList<Vif_2012> lstDatosMiercolesF) {
        this.lstDatosMiercolesF = lstDatosMiercolesF;
    }

    public ArrayList<Vif_2012> getLstDatosJuevesF() {
        return lstDatosJuevesF;
    }

    public void setLstDatosJuevesF(ArrayList<Vif_2012> lstDatosJuevesF) {
        this.lstDatosJuevesF = lstDatosJuevesF;
    }

    public ArrayList<Vif_2012> getLstDatosViernesF() {
        return lstDatosViernesF;
    }

    public void setLstDatosViernesF(ArrayList<Vif_2012> lstDatosViernesF) {
        this.lstDatosViernesF = lstDatosViernesF;
    }

    public ArrayList<Vif_2012> getLstDatosSabadoF() {
        return lstDatosSabadoF;
    }

    public void setLstDatosSabadoF(ArrayList<Vif_2012> lstDatosSabadoF) {
        this.lstDatosSabadoF = lstDatosSabadoF;
    }

    public ArrayList<Vif_2012> getLstDatosDomingoF() {
        return lstDatosDomingoF;
    }

    public void setLstDatosDomingoF(ArrayList<Vif_2012> lstDatosDomingoF) {
        this.lstDatosDomingoF = lstDatosDomingoF;
    }

    public ArrayList<Vif_2012> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2012> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
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

    public ArrayList<Vif_2012> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<Vif_2012> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
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

    public ArrayList<Vif_2012> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<Vif_2012> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
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

    public ArrayList<Vif_2012> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<Vif_2012> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
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

    public ArrayList<Vif_2012> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<Vif_2012> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
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

    public ArrayList<Vif_2012> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<Vif_2012> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
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

    public ArrayList<Vif_2012> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<Vif_2012> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
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

    public ArrayList<Vif_2012> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<Vif_2012> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
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

    public ArrayList<Vif_2012> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<Vif_2012> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
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

    public ArrayList<Vif_2012> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<Vif_2012> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
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

    public ArrayList<Vif_2012> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<Vif_2012> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2012> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2012> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembre() {
        return lstDatosDiciembre;
    }

    public void setLstDatosDiciembre(ArrayList<Vif_2012> lstDatosDiciembre) {
        this.lstDatosDiciembre = lstDatosDiciembre;
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
        this.graficar();
    }

    private void reinit() {
        this.init();
    }

    public void graficar() {
        this.lineModelDiaAgresion = graficaDiaAgresion();
        this.lineModelDiaAgresionSexoVictima = graficaDiaAgresionSexoVictima();
        this.lineModelMesesAgresion = graficaMesesAgresion();
        this.lineModelMesesAgresionSexoVictima = graficaMesesAgresionSexoVictima();
    }

    public Vif_2012ControladorDiaAnioAgresion() {
        this.reinit();

    }

    private CartesianChartModel graficaDiaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
            lstDatosLunes = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            semana.set("Lunes", lstDatosLunes.size());
            semana.set("Martes", lstDatosMartes.size());
            semana.set("Miercoles", lstDatosMiercoles.size());
            semana.set("Jueves", lstDatosJueves.size());
            semana.set("Viernes", lstDatosViernes.size());
            semana.set("Sabado", lstDatosSabado.size());
            semana.set("Domingo", lstDatosDomingo.size());

            model.addSeries(semana);
        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel graficaDiaAgresionSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            //victimas sexo masculino
            lstDatosLunesM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosMartesM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMiercolesM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosJuevesM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosViernesM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosSabadoM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosDomingoM = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");

            //VICTIMAS DEL SEXO FEMENINO
            lstDatosLunesF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosMartesF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMiercolesF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosJuevesF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosViernesF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosSabadoF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosDomingoF = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Victimas Sexo Masculino");
            Masculino.set("Lunes", lstDatosLunesM.size());
            Masculino.set("Martes", lstDatosMartesM.size());
            Masculino.set("Miercoles", lstDatosMiercolesM.size());
            Masculino.set("Jueves", lstDatosJuevesM.size());
            Masculino.set("Viernes", lstDatosViernesM.size());
            Masculino.set("Sabado", lstDatosSabadoM.size());
            Masculino.set("Domingo", lstDatosDomingoM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Victimas Sexo Femenino");
            Femenino.set("Lunes", lstDatosLunesF.size());
            Femenino.set("Martes", lstDatosMartesF.size());
            Femenino.set("Miercoles", lstDatosMiercolesF.size());
            Femenino.set("Jueves", lstDatosJuevesF.size());
            Femenino.set("Viernes", lstDatosViernesF.size());
            Femenino.set("Sabado", lstDatosSabadoF.size());
            Femenino.set("Domingo", lstDatosDomingoF.size());

            model1.addSeries(Femenino);
            model1.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficaMesesAgresion() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatosEnero = FVif_2012.ObtenerDatosDadoMesAgresion("ENERO");
            lstDatosFebrero = FVif_2012.ObtenerDatosDadoMesAgresion("FEBRERO");
            lstDatosMarzo = FVif_2012.ObtenerDatosDadoMesAgresion("MARZO");
            lstDatosAbril = FVif_2012.ObtenerDatosDadoMesAgresion("ABRIL");
            lstDatosMayo = FVif_2012.ObtenerDatosDadoMesAgresion("MAYO");
            lstDatosJunio = FVif_2012.ObtenerDatosDadoMesAgresion("JUNIO");
            lstDatosJulio = FVif_2012.ObtenerDatosDadoMesAgresion("JULIO");
            lstDatosAgosto = FVif_2012.ObtenerDatosDadoMesAgresion("AGOSTO");
            lstDatosSeptiembre = FVif_2012.ObtenerDatosDadoMesAgresion("SEPTIEMBRE");
            lstDatosOctubre = FVif_2012.ObtenerDatosDadoMesAgresion("OCTUBRE");
            lstDatosNoviembre = FVif_2012.ObtenerDatosDadoMesAgresion("NOVIEMBRE");
            lstDatosDiciembre = FVif_2012.ObtenerDatosDadoMesAgresion("DICIEMBRE");

            ChartSeries Meses = new ChartSeries();
            Meses.setLabel("Meses");
            Meses.set("Enero", lstDatosEnero.size());
            Meses.set("Febrero", lstDatosFebrero.size());
            Meses.set("Marzo", lstDatosMarzo.size());
            Meses.set("Abril", lstDatosAbril.size());
            Meses.set("Mayo", lstDatosMayo.size());
            Meses.set("Junio", lstDatosJunio.size());
            Meses.set("Julio", lstDatosJulio.size());
            Meses.set("Agosto", lstDatosAgosto.size());
            Meses.set("Septiembre", lstDatosSeptiembre.size());
            Meses.set("Octubre", lstDatosOctubre.size());
            Meses.set("Noviembre", lstDatosNoviembre.size());
            Meses.set("Diciembre", lstDatosDiciembre.size());

            model2.addSeries(Meses);

        } catch (Exception e) {
        }
        return model2;
    }
    
    private CartesianChartModel graficaMesesAgresionSexoVictima() {
        CartesianChartModel model3 = new CartesianChartModel();
        try {
            lstDatosEneroM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("ENERO", "M");
            lstDatosFebreroM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("FEBRERO", "M");
            lstDatosMarzoM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("MARZO", "M");
            lstDatosAbrilM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("ABRIL", "M");
            lstDatosMayoM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("MAYO", "M");
            lstDatosJunioM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("JUNIO", "M");
            lstDatosJulioM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("JULIO", "M");
            lstDatosAgostoM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("AGOSTO", "M");
            lstDatosSeptiembreM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubreM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("OCTUBRE", "M");
            lstDatosNoviembreM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembreM = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("DICIEMBRE", "M");

            lstDatosEneroF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("ENERO", "F");
            lstDatosFebreroF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("FEBRERO", "F");
            lstDatosMarzoF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("MARZO", "F");
            lstDatosAbrilF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("ABRIL", "F");
            lstDatosMayoF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("MAYO", "F");
            lstDatosJunioF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("JUNIO", "F");
            lstDatosJulioF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("JULIO", "F");
            lstDatosAgostoF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("AGOSTO", "F");
            lstDatosSeptiembreF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubreF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("OCTUBRE", "F");
            lstDatosNoviembreF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembreF = FVif_2012.ObtenerDatosDadoMesAgresionSexoVictima("DICIEMBRE", "F");

            ChartSeries Meses1 = new ChartSeries();
            Meses1.setLabel("Masculino");
            Meses1.set("Enero", lstDatosEneroM.size());
            Meses1.set("Febrero", lstDatosFebreroM.size());
            Meses1.set("Marzo", lstDatosMarzoM.size());
            Meses1.set("Abril", lstDatosAbrilM.size());
            Meses1.set("Mayo", lstDatosMayoM.size());
            Meses1.set("Junio", lstDatosJunioM.size());
            Meses1.set("Julio", lstDatosJulioM.size());
            Meses1.set("Agosto", lstDatosAgostoM.size());
            Meses1.set("Septiembre", lstDatosSeptiembreM.size());
            Meses1.set("Octubre", lstDatosOctubreM.size());
            Meses1.set("Noviembre", lstDatosNoviembreM.size());
            Meses1.set("Diciembre", lstDatosDiciembreM.size());

            ChartSeries Meses2 = new ChartSeries();
            Meses2.setLabel("Femenino");
            Meses2.set("Enero", lstDatosEneroF.size());
            Meses2.set("Febrero", lstDatosFebreroF.size());
            Meses2.set("Marzo", lstDatosMarzoF.size());
            Meses2.set("Abril", lstDatosAbrilF.size());
            Meses2.set("Mayo", lstDatosMayoF.size());
            Meses2.set("Junio", lstDatosJunioF.size());
            Meses2.set("Julio", lstDatosJulioF.size());
            Meses2.set("Agosto", lstDatosAgostoF.size());
            Meses2.set("Septiembre", lstDatosSeptiembreF.size());
            Meses2.set("Octubre", lstDatosOctubreF.size());
            Meses2.set("Noviembre", lstDatosNoviembreF.size());
            Meses2.set("Diciembre", lstDatosDiciembreF.size());

            model3.addSeries(Meses2);
            model3.addSeries(Meses1);

        } catch (Exception e) {
        }
        return model3;
    }
    
    
}
