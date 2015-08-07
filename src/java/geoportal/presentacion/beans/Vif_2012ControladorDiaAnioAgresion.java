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
//        this.lineModelDiaAgresion = graficaDiaDenuncia();
//        this.lineModelDiaAgresionSexoVictima = graficaDiaAgresionSexoVictima();
//        this.lineModelMesesAgresion = graficaMesesAgresion();
//        this.lineModelMesesAgresionSexoVictima = graficaMesesAgresionSexoVictima();

    }

    public Vif_2012ControladorDiaAnioAgresion() {
        this.reinit();
        
    }

    
    
    
}
