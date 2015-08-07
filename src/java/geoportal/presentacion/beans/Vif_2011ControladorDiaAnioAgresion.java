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
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorDiaAnioAgresion {

    private CartesianChartModel lineModelDiaDenuncia;
    private CartesianChartModel lineModelDiaDenunciaSexoVictima;
    private CartesianChartModel lineModelMesesDenuncia;
    private CartesianChartModel lineModelMesesDenunciaSexoVictima;
    private CartesianChartModel lineModelDiaAgresion;
    private CartesianChartModel lineModelDiaAgresionSexoVictima;
    private CartesianChartModel lineModelMesesAgresion;
    private CartesianChartModel lineModelMesesAgresionSexoVictima;
    private Vif_2011 objDatos;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatosLunes;
    private ArrayList<Vif_2011> lstDatosMartes;
    private ArrayList<Vif_2011> lstDatosMiercoles;
    private ArrayList<Vif_2011> lstDatosJueves;
    private ArrayList<Vif_2011> lstDatosViernes;
    private ArrayList<Vif_2011> lstDatosSabado;
    private ArrayList<Vif_2011> lstDatosDomingo;
    private ArrayList<Vif_2011> lstDatosLunesM;
    private ArrayList<Vif_2011> lstDatosMartesM;
    private ArrayList<Vif_2011> lstDatosMiercolesM;
    private ArrayList<Vif_2011> lstDatosJuevesM;
    private ArrayList<Vif_2011> lstDatosViernesM;
    private ArrayList<Vif_2011> lstDatosSabadoM;
    private ArrayList<Vif_2011> lstDatosDomingoM;
    private ArrayList<Vif_2011> lstDatosLunesF;
    private ArrayList<Vif_2011> lstDatosMartesF;
    private ArrayList<Vif_2011> lstDatosMiercolesF;
    private ArrayList<Vif_2011> lstDatosJuevesF;
    private ArrayList<Vif_2011> lstDatosViernesF;
    private ArrayList<Vif_2011> lstDatosSabadoF;
    private ArrayList<Vif_2011> lstDatosDomingoF;
    private ArrayList<Vif_2011> lstDatosEnero;
    private ArrayList<Vif_2011> lstDatosEneroM;
    private ArrayList<Vif_2011> lstDatosEneroF;
    private ArrayList<Vif_2011> lstDatosFebrero;
    private ArrayList<Vif_2011> lstDatosFebreroM;
    private ArrayList<Vif_2011> lstDatosFebreroF;
    private ArrayList<Vif_2011> lstDatosMarzo;
    private ArrayList<Vif_2011> lstDatosMarzoM;
    private ArrayList<Vif_2011> lstDatosMarzoF;
    private ArrayList<Vif_2011> lstDatosAbril;
    private ArrayList<Vif_2011> lstDatosAbrilM;
    private ArrayList<Vif_2011> lstDatosAbrilF;
    private ArrayList<Vif_2011> lstDatosMayo;
    private ArrayList<Vif_2011> lstDatosMayoM;
    private ArrayList<Vif_2011> lstDatosMayoF;
    private ArrayList<Vif_2011> lstDatosJunio;
    private ArrayList<Vif_2011> lstDatosJunioM;
    private ArrayList<Vif_2011> lstDatosJunioF;
    private ArrayList<Vif_2011> lstDatosJulio;
    private ArrayList<Vif_2011> lstDatosJulioM;
    private ArrayList<Vif_2011> lstDatosJulioF;
    private ArrayList<Vif_2011> lstDatosAgosto;
    private ArrayList<Vif_2011> lstDatosAgostoM;
    private ArrayList<Vif_2011> lstDatosAgostoF;
    private ArrayList<Vif_2011> lstDatosSeptiembre;
    private ArrayList<Vif_2011> lstDatosSeptiembreM;
    private ArrayList<Vif_2011> lstDatosSeptiembreF;
    private ArrayList<Vif_2011> lstDatosOctubre;
    private ArrayList<Vif_2011> lstDatosOctubreM;
    private ArrayList<Vif_2011> lstDatosOctubreF;
    private ArrayList<Vif_2011> lstDatosNoviembre;
    private ArrayList<Vif_2011> lstDatosNoviembreF;
    private ArrayList<Vif_2011> lstDatosNoviembreM;
    private ArrayList<Vif_2011> lstDatosDiciembre;
    private ArrayList<Vif_2011> lstDatosDiciembreM;
    private ArrayList<Vif_2011> lstDatosDiciembreF;

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

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
    }

    public CartesianChartModel getLineModelDiaDenunciaSexoVictima() {
        return lineModelDiaDenunciaSexoVictima;
    }

    public void setLineModelDiaDenunciaSexoVictima(CartesianChartModel lineModelDiaDenunciaSexoVictima) {
        this.lineModelDiaDenunciaSexoVictima = lineModelDiaDenunciaSexoVictima;
    }

    public CartesianChartModel getLineModelMesesDenuncia() {
        return lineModelMesesDenuncia;
    }

    public void setLineModelMesesDenuncia(CartesianChartModel lineModelMesesDenuncia) {
        this.lineModelMesesDenuncia = lineModelMesesDenuncia;
    }

    public CartesianChartModel getLineModelMesesDenunciaSexoVictima() {
        return lineModelMesesDenunciaSexoVictima;
    }

    public void setLineModelMesesDenunciaSexoVictima(CartesianChartModel lineModelMesesDenunciaSexoVictima) {
        this.lineModelMesesDenunciaSexoVictima = lineModelMesesDenunciaSexoVictima;
    }

    public Vif_2011 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2011 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Vif_2011> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Vif_2011> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Vif_2011> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Vif_2011> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Vif_2011> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Vif_2011> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Vif_2011> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Vif_2011> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Vif_2011> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Vif_2011> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Vif_2011> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public ArrayList<Vif_2011> getLstDatosLunesM() {
        return lstDatosLunesM;
    }

    public void setLstDatosLunesM(ArrayList<Vif_2011> lstDatosLunesM) {
        this.lstDatosLunesM = lstDatosLunesM;
    }

    public ArrayList<Vif_2011> getLstDatosMartesM() {
        return lstDatosMartesM;
    }

    public void setLstDatosMartesM(ArrayList<Vif_2011> lstDatosMartesM) {
        this.lstDatosMartesM = lstDatosMartesM;
    }

    public ArrayList<Vif_2011> getLstDatosMiercolesM() {
        return lstDatosMiercolesM;
    }

    public void setLstDatosMiercolesM(ArrayList<Vif_2011> lstDatosMiercolesM) {
        this.lstDatosMiercolesM = lstDatosMiercolesM;
    }

    public ArrayList<Vif_2011> getLstDatosJuevesM() {
        return lstDatosJuevesM;
    }

    public void setLstDatosJuevesM(ArrayList<Vif_2011> lstDatosJuevesM) {
        this.lstDatosJuevesM = lstDatosJuevesM;
    }

    public ArrayList<Vif_2011> getLstDatosViernesM() {
        return lstDatosViernesM;
    }

    public void setLstDatosViernesM(ArrayList<Vif_2011> lstDatosViernesM) {
        this.lstDatosViernesM = lstDatosViernesM;
    }

    public ArrayList<Vif_2011> getLstDatosSabadoM() {
        return lstDatosSabadoM;
    }

    public void setLstDatosSabadoM(ArrayList<Vif_2011> lstDatosSabadoM) {
        this.lstDatosSabadoM = lstDatosSabadoM;
    }

    public ArrayList<Vif_2011> getLstDatosDomingoM() {
        return lstDatosDomingoM;
    }

    public void setLstDatosDomingoM(ArrayList<Vif_2011> lstDatosDomingoM) {
        this.lstDatosDomingoM = lstDatosDomingoM;
    }

    public ArrayList<Vif_2011> getLstDatosLunesF() {
        return lstDatosLunesF;
    }

    public void setLstDatosLunesF(ArrayList<Vif_2011> lstDatosLunesF) {
        this.lstDatosLunesF = lstDatosLunesF;
    }

    public ArrayList<Vif_2011> getLstDatosMartesF() {
        return lstDatosMartesF;
    }

    public void setLstDatosMartesF(ArrayList<Vif_2011> lstDatosMartesF) {
        this.lstDatosMartesF = lstDatosMartesF;
    }

    public ArrayList<Vif_2011> getLstDatosMiercolesF() {
        return lstDatosMiercolesF;
    }

    public void setLstDatosMiercolesF(ArrayList<Vif_2011> lstDatosMiercolesF) {
        this.lstDatosMiercolesF = lstDatosMiercolesF;
    }

    public ArrayList<Vif_2011> getLstDatosJuevesF() {
        return lstDatosJuevesF;
    }

    public void setLstDatosJuevesF(ArrayList<Vif_2011> lstDatosJuevesF) {
        this.lstDatosJuevesF = lstDatosJuevesF;
    }

    public ArrayList<Vif_2011> getLstDatosViernesF() {
        return lstDatosViernesF;
    }

    public void setLstDatosViernesF(ArrayList<Vif_2011> lstDatosViernesF) {
        this.lstDatosViernesF = lstDatosViernesF;
    }

    public ArrayList<Vif_2011> getLstDatosSabadoF() {
        return lstDatosSabadoF;
    }

    public void setLstDatosSabadoF(ArrayList<Vif_2011> lstDatosSabadoF) {
        this.lstDatosSabadoF = lstDatosSabadoF;
    }

    public ArrayList<Vif_2011> getLstDatosDomingoF() {
        return lstDatosDomingoF;
    }

    public void setLstDatosDomingoF(ArrayList<Vif_2011> lstDatosDomingoF) {
        this.lstDatosDomingoF = lstDatosDomingoF;
    }

    public ArrayList<Vif_2011> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2011> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<Vif_2011> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<Vif_2011> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<Vif_2011> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<Vif_2011> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<Vif_2011> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
    }

    public ArrayList<Vif_2011> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<Vif_2011> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<Vif_2011> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<Vif_2011> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<Vif_2011> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
    }

    public ArrayList<Vif_2011> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<Vif_2011> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<Vif_2011> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<Vif_2011> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<Vif_2011> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<Vif_2011> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
    }

    public ArrayList<Vif_2011> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<Vif_2011> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<Vif_2011> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<Vif_2011> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<Vif_2011> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<Vif_2011> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
    }

    public ArrayList<Vif_2011> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<Vif_2011> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<Vif_2011> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<Vif_2011> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<Vif_2011> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<Vif_2011> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
    }

    public ArrayList<Vif_2011> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<Vif_2011> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<Vif_2011> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<Vif_2011> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<Vif_2011> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<Vif_2011> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
    }

    public ArrayList<Vif_2011> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<Vif_2011> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<Vif_2011> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<Vif_2011> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<Vif_2011> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
    }

    public ArrayList<Vif_2011> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<Vif_2011> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<Vif_2011> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<Vif_2011> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<Vif_2011> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<Vif_2011> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<Vif_2011> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<Vif_2011> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
    }

    public ArrayList<Vif_2011> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<Vif_2011> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<Vif_2011> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<Vif_2011> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<Vif_2011> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2011> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2011> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre() {
        return lstDatosDiciembre;
    }

    public void setLstDatosDiciembre(ArrayList<Vif_2011> lstDatosDiciembre) {
        this.lstDatosDiciembre = lstDatosDiciembre;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<Vif_2011> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<Vif_2011> lstDatosDiciembreF) {
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
        this.lineModelDiaAgresion = graficaDiaDenuncia();
        this.lineModelDiaAgresionSexoVictima = graficaDiaAgresionSexoVictima();
        this.lineModelMesesAgresion = graficaMesesAgresion();
        this.lineModelMesesAgresionSexoVictima = graficaMesesAgresionSexoVictima();

    }

    public Vif_2011ControladorDiaAnioAgresion() {
        this.reinit();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
            lstDatosLunes = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");

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
            lstDatosLunesM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosMartesM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMiercolesM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosJuevesM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosViernesM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosSabadoM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosDomingoM = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");

            //VICTIMAS DEL SEXO FEMENINO
            lstDatosLunesF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosMartesF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMiercolesF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosJuevesF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosViernesF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosSabadoF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosDomingoF = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");

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
            lstDatosEnero = FVif_2011.ObtenerDatosDadoMesAgresion("ENERO");
            lstDatosFebrero = FVif_2011.ObtenerDatosDadoMesAgresion("FEBRERO");
            lstDatosMarzo = FVif_2011.ObtenerDatosDadoMesAgresion("MARZO");
            lstDatosAbril = FVif_2011.ObtenerDatosDadoMesAgresion("ABRIL");
            lstDatosMayo = FVif_2011.ObtenerDatosDadoMesAgresion("MAYO");
            lstDatosJunio = FVif_2011.ObtenerDatosDadoMesAgresion("JUNIO");
            lstDatosJulio = FVif_2011.ObtenerDatosDadoMesAgresion("JULIO");
            lstDatosAgosto = FVif_2011.ObtenerDatosDadoMesAgresion("AGOSTO");
            lstDatosSeptiembre = FVif_2011.ObtenerDatosDadoMesAgresion("SEPTIEMBRE");
            lstDatosOctubre = FVif_2011.ObtenerDatosDadoMesAgresion("OCTUBRE");
            lstDatosNoviembre = FVif_2011.ObtenerDatosDadoMesAgresion("NOVIEMBRE");
            lstDatosDiciembre = FVif_2011.ObtenerDatosDadoMesAgresion("DICIEMBRE");

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
            lstDatosEneroM = FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "M");
            lstDatosFebreroM = FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "M");
            lstDatosMarzoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "M");
            lstDatosAbrilM = FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "M");
            lstDatosMayoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "M");
            lstDatosJunioM = FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "M");
            lstDatosJulioM = FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "M");
            lstDatosAgostoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "M");
            lstDatosSeptiembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "M");
            lstDatosNoviembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "M");

            lstDatosEneroF = FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "F");
            lstDatosFebreroF = FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "F");
            lstDatosMarzoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "F");
            lstDatosAbrilF = FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "F");
            lstDatosMayoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "F");
            lstDatosJunioF = FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "F");
            lstDatosJulioF = FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "F");
            lstDatosAgostoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "F");
            lstDatosSeptiembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "F");
            lstDatosNoviembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "F");

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
