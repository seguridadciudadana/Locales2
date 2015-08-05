/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.AuxtblFechas2010;
import geoportal.logica.funciones.FAuxtblFechas2010;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorFechaAgresion {

    /**
     * Creates a new instance of Vif_2010ControladorFechaAgresion
     */
    private CartesianChartModel lineModelDia;
    private CartesianChartModel lineModelMes;
    private CartesianChartModel lineModelDiaSV;
    private CartesianChartModel lineModelMesSV;

    private ArrayList<AuxtblFechas2010> lstDatos;
    private ArrayList<AuxtblFechas2010> lstDatosLunes;
    private ArrayList<AuxtblFechas2010> lstDatosMartes;
    private ArrayList<AuxtblFechas2010> lstDatosMiercoles;
    private ArrayList<AuxtblFechas2010> lstDatosJueves;
    private ArrayList<AuxtblFechas2010> lstDatosViernes;
    private ArrayList<AuxtblFechas2010> lstDatosSabado;
    private ArrayList<AuxtblFechas2010> lstDatosDomingo;
    private ArrayList<AuxtblFechas2010> lstDatosLunesM;
    private ArrayList<AuxtblFechas2010> lstDatosMartesM;
    private ArrayList<AuxtblFechas2010> lstDatosMiercolesM;
    private ArrayList<AuxtblFechas2010> lstDatosJuevesM;
    private ArrayList<AuxtblFechas2010> lstDatosViernesM;
    private ArrayList<AuxtblFechas2010> lstDatosSabadoM;
    private ArrayList<AuxtblFechas2010> lstDatosDomingoM;
    private ArrayList<AuxtblFechas2010> lstDatosLunesF;
    private ArrayList<AuxtblFechas2010> lstDatosMartesF;
    private ArrayList<AuxtblFechas2010> lstDatosMiercolesF;
    private ArrayList<AuxtblFechas2010> lstDatosJuevesF;
    private ArrayList<AuxtblFechas2010> lstDatosViernesF;
    private ArrayList<AuxtblFechas2010> lstDatosSabadoF;
    private ArrayList<AuxtblFechas2010> lstDatosDomingoF;

    private ArrayList<AuxtblFechas2010> lstDatosEnero;
    private ArrayList<AuxtblFechas2010> lstDatosFebrero;
    private ArrayList<AuxtblFechas2010> lstDatosMarzo;
    private ArrayList<AuxtblFechas2010> lstDatosAbril;
    private ArrayList<AuxtblFechas2010> lstDatosMayo;
    private ArrayList<AuxtblFechas2010> lstDatosJunio;
    private ArrayList<AuxtblFechas2010> lstDatosJulio;
    private ArrayList<AuxtblFechas2010> lstDatosAgosto;
    private ArrayList<AuxtblFechas2010> lstDatosSeptiembre;
    private ArrayList<AuxtblFechas2010> lstDatosOctubre;
    private ArrayList<AuxtblFechas2010> lstDatosNoviembre;
    private ArrayList<AuxtblFechas2010> lstDatosDiciembre;

    private ArrayList<AuxtblFechas2010> lstDatosEneroF;
    private ArrayList<AuxtblFechas2010> lstDatosFebreroF;
    private ArrayList<AuxtblFechas2010> lstDatosMarzoF;
    private ArrayList<AuxtblFechas2010> lstDatosAbrilF;
    private ArrayList<AuxtblFechas2010> lstDatosMayoF;
    private ArrayList<AuxtblFechas2010> lstDatosJunioF;
    private ArrayList<AuxtblFechas2010> lstDatosJulioF;
    private ArrayList<AuxtblFechas2010> lstDatosAgostoF;
    private ArrayList<AuxtblFechas2010> lstDatosSeptiembreF;
    private ArrayList<AuxtblFechas2010> lstDatosOctubreF;
    private ArrayList<AuxtblFechas2010> lstDatosNoviembreF;
    private ArrayList<AuxtblFechas2010> lstDatosDiciembreF;

    private ArrayList<AuxtblFechas2010> lstDatosEneroM;
    private ArrayList<AuxtblFechas2010> lstDatosFebreroM;
    private ArrayList<AuxtblFechas2010> lstDatosMarzoM;
    private ArrayList<AuxtblFechas2010> lstDatosAbrilM;
    private ArrayList<AuxtblFechas2010> lstDatosMayoM;
    private ArrayList<AuxtblFechas2010> lstDatosJunioM;
    private ArrayList<AuxtblFechas2010> lstDatosJulioM;
    private ArrayList<AuxtblFechas2010> lstDatosAgostoM;
    private ArrayList<AuxtblFechas2010> lstDatosSeptiembreM;
    private ArrayList<AuxtblFechas2010> lstDatosOctubreM;
    private ArrayList<AuxtblFechas2010> lstDatosNoviembreM;
    private ArrayList<AuxtblFechas2010> lstDatosDiciembreM;

    public CartesianChartModel getLineModelDia() {
        return lineModelDia;
    }

    public void setLineModelDia(CartesianChartModel lineModelDia) {
        this.lineModelDia = lineModelDia;
    }

    public CartesianChartModel getLineModelMes() {
        return lineModelMes;
    }

    public void setLineModelMes(CartesianChartModel lineModelMes) {
        this.lineModelMes = lineModelMes;
    }

    public CartesianChartModel getLineModelDiaSV() {
        return lineModelDiaSV;
    }

    public void setLineModelDiaSV(CartesianChartModel lineModelDiaSV) {
        this.lineModelDiaSV = lineModelDiaSV;
    }

    public CartesianChartModel getLineModelMesSV() {
        return lineModelMesSV;
    }

    public void setLineModelMesSV(CartesianChartModel lineModelMesSV) {
        this.lineModelMesSV = lineModelMesSV;
    }

    public ArrayList<AuxtblFechas2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<AuxtblFechas2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<AuxtblFechas2010> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<AuxtblFechas2010> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<AuxtblFechas2010> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<AuxtblFechas2010> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<AuxtblFechas2010> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<AuxtblFechas2010> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<AuxtblFechas2010> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosLunesM() {
        return lstDatosLunesM;
    }

    public void setLstDatosLunesM(ArrayList<AuxtblFechas2010> lstDatosLunesM) {
        this.lstDatosLunesM = lstDatosLunesM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMartesM() {
        return lstDatosMartesM;
    }

    public void setLstDatosMartesM(ArrayList<AuxtblFechas2010> lstDatosMartesM) {
        this.lstDatosMartesM = lstDatosMartesM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMiercolesM() {
        return lstDatosMiercolesM;
    }

    public void setLstDatosMiercolesM(ArrayList<AuxtblFechas2010> lstDatosMiercolesM) {
        this.lstDatosMiercolesM = lstDatosMiercolesM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJuevesM() {
        return lstDatosJuevesM;
    }

    public void setLstDatosJuevesM(ArrayList<AuxtblFechas2010> lstDatosJuevesM) {
        this.lstDatosJuevesM = lstDatosJuevesM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosViernesM() {
        return lstDatosViernesM;
    }

    public void setLstDatosViernesM(ArrayList<AuxtblFechas2010> lstDatosViernesM) {
        this.lstDatosViernesM = lstDatosViernesM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSabadoM() {
        return lstDatosSabadoM;
    }

    public void setLstDatosSabadoM(ArrayList<AuxtblFechas2010> lstDatosSabadoM) {
        this.lstDatosSabadoM = lstDatosSabadoM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDomingoM() {
        return lstDatosDomingoM;
    }

    public void setLstDatosDomingoM(ArrayList<AuxtblFechas2010> lstDatosDomingoM) {
        this.lstDatosDomingoM = lstDatosDomingoM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosLunesF() {
        return lstDatosLunesF;
    }

    public void setLstDatosLunesF(ArrayList<AuxtblFechas2010> lstDatosLunesF) {
        this.lstDatosLunesF = lstDatosLunesF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMartesF() {
        return lstDatosMartesF;
    }

    public void setLstDatosMartesF(ArrayList<AuxtblFechas2010> lstDatosMartesF) {
        this.lstDatosMartesF = lstDatosMartesF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMiercolesF() {
        return lstDatosMiercolesF;
    }

    public void setLstDatosMiercolesF(ArrayList<AuxtblFechas2010> lstDatosMiercolesF) {
        this.lstDatosMiercolesF = lstDatosMiercolesF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJuevesF() {
        return lstDatosJuevesF;
    }

    public void setLstDatosJuevesF(ArrayList<AuxtblFechas2010> lstDatosJuevesF) {
        this.lstDatosJuevesF = lstDatosJuevesF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosViernesF() {
        return lstDatosViernesF;
    }

    public void setLstDatosViernesF(ArrayList<AuxtblFechas2010> lstDatosViernesF) {
        this.lstDatosViernesF = lstDatosViernesF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSabadoF() {
        return lstDatosSabadoF;
    }

    public void setLstDatosSabadoF(ArrayList<AuxtblFechas2010> lstDatosSabadoF) {
        this.lstDatosSabadoF = lstDatosSabadoF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDomingoF() {
        return lstDatosDomingoF;
    }

    public void setLstDatosDomingoF(ArrayList<AuxtblFechas2010> lstDatosDomingoF) {
        this.lstDatosDomingoF = lstDatosDomingoF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<AuxtblFechas2010> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<AuxtblFechas2010> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<AuxtblFechas2010> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<AuxtblFechas2010> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<AuxtblFechas2010> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<AuxtblFechas2010> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<AuxtblFechas2010> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<AuxtblFechas2010> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<AuxtblFechas2010> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<AuxtblFechas2010> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<AuxtblFechas2010> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDiciembre() {
        return lstDatosDiciembre;
    }

    public void setLstDatosDiciembre(ArrayList<AuxtblFechas2010> lstDatosDiciembre) {
        this.lstDatosDiciembre = lstDatosDiciembre;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<AuxtblFechas2010> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<AuxtblFechas2010> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<AuxtblFechas2010> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<AuxtblFechas2010> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<AuxtblFechas2010> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<AuxtblFechas2010> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<AuxtblFechas2010> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<AuxtblFechas2010> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<AuxtblFechas2010> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<AuxtblFechas2010> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<AuxtblFechas2010> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<AuxtblFechas2010> lstDatosDiciembreF) {
        this.lstDatosDiciembreF = lstDatosDiciembreF;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<AuxtblFechas2010> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<AuxtblFechas2010> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<AuxtblFechas2010> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<AuxtblFechas2010> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<AuxtblFechas2010> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<AuxtblFechas2010> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<AuxtblFechas2010> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<AuxtblFechas2010> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<AuxtblFechas2010> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<AuxtblFechas2010> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<AuxtblFechas2010> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<AuxtblFechas2010> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<AuxtblFechas2010> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();

    }

    public void graficar() {
        this.lineModelDia = graficaDiaAgresion();
        this.lineModelDiaSV = graficaDiaAgresionSV();
        this.lineModelMes = graficaMesesAgresion();
        this.lineModelMesSV=graficaMesesAgresionSV();

    }

    public Vif_2010ControladorFechaAgresion() {
        this.reinit();

    }

    private CartesianChartModel graficaDiaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosLunes = FAuxtblFechas2010.ObtenerDatosDadoMesDia("lunes");
            lstDatosMartes = FAuxtblFechas2010.ObtenerDatosDadoMesDia("martes");
            lstDatosMiercoles = FAuxtblFechas2010.ObtenerDatosDadoMesDia("miércoles");
            lstDatosJueves = FAuxtblFechas2010.ObtenerDatosDadoMesDia("jueves");
            lstDatosViernes = FAuxtblFechas2010.ObtenerDatosDadoMesDia("viernes");
            lstDatosSabado = FAuxtblFechas2010.ObtenerDatosDadoMesDia("sábado");
            lstDatosDomingo = FAuxtblFechas2010.ObtenerDatosDadoMesDia("domingo");

            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
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

    private CartesianChartModel graficaDiaAgresionSV() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatosLunesM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "lunes");
            lstDatosMartesM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "martes");
            lstDatosMiercolesM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "miércoles");
            lstDatosJuevesM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "jueves");
            lstDatosViernesM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "viernes");
            lstDatosSabadoM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "sábado");
            lstDatosDomingoM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "domingo");

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Dia de la Agresión");
            masculino.set("Lunes", lstDatosLunesM.size());
            masculino.set("Martes", lstDatosMartesM.size());
            masculino.set("Miercoles", lstDatosMiercolesM.size());
            masculino.set("Jueves", lstDatosJuevesM.size());
            masculino.set("Viernes", lstDatosViernesM.size());
            masculino.set("Sabado", lstDatosSabadoM.size());
            masculino.set("Domingo", lstDatosDomingoM.size());

            lstDatosLunesF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "lunes");
            lstDatosMartesF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "martes");
            lstDatosMiercolesF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "miércoles");
            lstDatosJuevesF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "jueves");
            lstDatosViernesF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "viernes");
            lstDatosSabadoF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "sábado");
            lstDatosDomingoF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "domingo");

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            femenino.set("Lunes", lstDatosLunesF.size());
            femenino.set("Martes", lstDatosMartesF.size());
            femenino.set("Miercoles", lstDatosMiercolesF.size());
            femenino.set("Jueves", lstDatosJuevesF.size());
            femenino.set("Viernes", lstDatosViernesF.size());
            femenino.set("Sabado", lstDatosSabadoF.size());
            femenino.set("Domingo", lstDatosDomingoF.size());

            model2.addSeries(femenino);
            model2.addSeries(masculino);            
        } catch (Exception e) {
        }
        return model2;
    }

    private CartesianChartModel graficaMesesAgresion() {
        CartesianChartModel model4 = new CartesianChartModel();
        try {
            lstDatosEnero = FAuxtblFechas2010.ObtenerDatosDadoMesDia("enero");
            lstDatosFebrero = FAuxtblFechas2010.ObtenerDatosDadoMesDia("febrero");
            lstDatosMarzo = FAuxtblFechas2010.ObtenerDatosDadoMesDia("marzo");
            lstDatosAbril = FAuxtblFechas2010.ObtenerDatosDadoMesDia("abril");
            lstDatosMayo = FAuxtblFechas2010.ObtenerDatosDadoMesDia("mayo");
            lstDatosJunio = FAuxtblFechas2010.ObtenerDatosDadoMesDia("junio");
            lstDatosJulio = FAuxtblFechas2010.ObtenerDatosDadoMesDia("julio");
            lstDatosAgosto = FAuxtblFechas2010.ObtenerDatosDadoMesDia("agosto");
            lstDatosSeptiembre = FAuxtblFechas2010.ObtenerDatosDadoMesDia("septiembre");
            lstDatosOctubre = FAuxtblFechas2010.ObtenerDatosDadoMesDia("octubre");
            lstDatosNoviembre = FAuxtblFechas2010.ObtenerDatosDadoMesDia("noviembre");
            lstDatosDiciembre = FAuxtblFechas2010.ObtenerDatosDadoMesDia("diciembre");

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

            model4.addSeries(Meses);

        } catch (Exception e) {
        }
        return model4;
    }

    private CartesianChartModel graficaMesesAgresionSV() {
        CartesianChartModel model3 = new CartesianChartModel();
        try {
            lstDatosEneroM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "enero");
            lstDatosFebreroM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "febrero");
            lstDatosMarzoM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "marzo");
            lstDatosAbrilM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "abril");
            lstDatosMayoM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "mayo");
            lstDatosJunioM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "junio");
            lstDatosJulioM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "julio");
            lstDatosAgostoM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "agosto");
            lstDatosSeptiembreM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "septiembre");
            lstDatosOctubreM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "octubre");
            lstDatosNoviembreM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "noviembre");
            lstDatosDiciembreM = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("M", "diciembre");

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            masculino.set("Enero", lstDatosEnero.size());
            masculino.set("Febrero", lstDatosFebrero.size());
            masculino.set("Marzo", lstDatosMarzo.size());
            masculino.set("Abril", lstDatosAbril.size());
            masculino.set("Mayo", lstDatosMayo.size());
            masculino.set("Junio", lstDatosJunio.size());
            masculino.set("Julio", lstDatosJulio.size());
            masculino.set("Agosto", lstDatosAgosto.size());
            masculino.set("Septiembre", lstDatosSeptiembre.size());
            masculino.set("Octubre", lstDatosOctubre.size());
            masculino.set("Noviembre", lstDatosNoviembre.size());
            masculino.set("Diciembre", lstDatosDiciembre.size());

            lstDatosEneroF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "enero");
            lstDatosFebreroF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "febrero");
            lstDatosMarzoF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "marzo");
            lstDatosAbrilF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "abril");
            lstDatosMayoF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "mayo");
            lstDatosJunioF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "junio");
            lstDatosJulioF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "julio");
            lstDatosAgostoF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "agosto");
            lstDatosSeptiembreF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "septiembre");
            lstDatosOctubreF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "octubre");
            lstDatosNoviembreF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "noviembre");
            lstDatosDiciembreF = FAuxtblFechas2010.ObtenerDatosDadoMesDiaSexo("F", "diciembre");

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            femenino.set("Enero", lstDatosEnero.size());
            femenino.set("Febrero", lstDatosFebrero.size());
            femenino.set("Marzo", lstDatosMarzo.size());
            femenino.set("Abril", lstDatosAbril.size());
            femenino.set("Mayo", lstDatosMayo.size());
            femenino.set("Junio", lstDatosJunio.size());
            femenino.set("Julio", lstDatosJulio.size());
            femenino.set("Agosto", lstDatosAgosto.size());
            femenino.set("Septiembre", lstDatosSeptiembre.size());
            femenino.set("Octubre", lstDatosOctubre.size());
            femenino.set("Noviembre", lstDatosNoviembre.size());
            femenino.set("Diciembre", lstDatosDiciembre.size());

            model3.addSeries(femenino);
            model3.addSeries(masculino);
            

        } catch (Exception e) {
        }
        return model3;
    }
    
    
    
    
    
    

}
