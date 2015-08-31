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
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorFechaDenuncia {

    /**
     * Creates a new instance of Vif_2010ControladorFechaDenuncia
     */
    private CartesianChartModel lineModelDiaDenuncia;
    private CartesianChartModel lineModelDiaDenunciaSexo;
    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatos1;
    private ArrayList<Vif_2010> lstDatosLunes;
    private ArrayList<Vif_2010> lstDatosMartes;
    private ArrayList<Vif_2010> lstDatosMiercoles;
    private ArrayList<Vif_2010> lstDatosJueves;
    private ArrayList<Vif_2010> lstDatosViernes;
    private ArrayList<Vif_2010> lstDatosSabado;
    private ArrayList<Vif_2010> lstDatosDomingo;
    private ArrayList<Vif_2010> lstDatosLunesM;
    private ArrayList<Vif_2010> lstDatosMartesM;
    private ArrayList<Vif_2010> lstDatosMiercolesM;
    private ArrayList<Vif_2010> lstDatosJuevesM;
    private ArrayList<Vif_2010> lstDatosViernesM;
    private ArrayList<Vif_2010> lstDatosSabadoM;
    private ArrayList<Vif_2010> lstDatosDomingoM;
    private ArrayList<Vif_2010> lstDatosLunesF;
    private ArrayList<Vif_2010> lstDatosMartesF;
    private ArrayList<Vif_2010> lstDatosMiercolesF;
    private ArrayList<Vif_2010> lstDatosJuevesF;
    private ArrayList<Vif_2010> lstDatosViernesF;
    private ArrayList<Vif_2010> lstDatosSabadoF;
    private ArrayList<Vif_2010> lstDatosDomingoF;

    private CartesianChartModel lineModelMesDenuncia;
    private CartesianChartModel lineModelMesDenunciaSexo;
    private ArrayList<Vif_2010> lstDatosEnero;
    private ArrayList<Vif_2010> lstDatosFebrero;
    private ArrayList<Vif_2010> lstDatosMarzo;
    private ArrayList<Vif_2010> lstDatosAbril;
    private ArrayList<Vif_2010> lstDatosMayo;
    private ArrayList<Vif_2010> lstDatosJunio;
    private ArrayList<Vif_2010> lstDatosJulio;
    private ArrayList<Vif_2010> lstDatosAgosto;
    private ArrayList<Vif_2010> lstDatosSeptiembre;
    private ArrayList<Vif_2010> lstDatosOctubre;
    private ArrayList<Vif_2010> lstDatosNoviembre;
    private ArrayList<Vif_2010> lstDatosDiciembre;

    private ArrayList<Vif_2010> lstDatosEneroF;
    private ArrayList<Vif_2010> lstDatosFebreroF;
    private ArrayList<Vif_2010> lstDatosMarzoF;
    private ArrayList<Vif_2010> lstDatosAbrilF;
    private ArrayList<Vif_2010> lstDatosMayoF;
    private ArrayList<Vif_2010> lstDatosJunioF;
    private ArrayList<Vif_2010> lstDatosJulioF;
    private ArrayList<Vif_2010> lstDatosAgostoF;
    private ArrayList<Vif_2010> lstDatosSeptiembreF;
    private ArrayList<Vif_2010> lstDatosOctubreF;
    private ArrayList<Vif_2010> lstDatosNoviembreF;
    private ArrayList<Vif_2010> lstDatosDiciembreF;

    private ArrayList<Vif_2010> lstDatosEneroM;
    private ArrayList<Vif_2010> lstDatosFebreroM;
    private ArrayList<Vif_2010> lstDatosMarzoM;
    private ArrayList<Vif_2010> lstDatosAbrilM;
    private ArrayList<Vif_2010> lstDatosMayoM;
    private ArrayList<Vif_2010> lstDatosJunioM;
    private ArrayList<Vif_2010> lstDatosJulioM;
    private ArrayList<Vif_2010> lstDatosAgostoM;
    private ArrayList<Vif_2010> lstDatosSeptiembreM;
    private ArrayList<Vif_2010> lstDatosOctubreM;
    private ArrayList<Vif_2010> lstDatosNoviembreM;
    private ArrayList<Vif_2010> lstDatosDiciembreM;

    public CartesianChartModel getLineModelMesDenuncia() {
        return lineModelMesDenuncia;
    }

    public void setLineModelMesDenuncia(CartesianChartModel lineModelMesDenuncia) {
        this.lineModelMesDenuncia = lineModelMesDenuncia;
    }

    public CartesianChartModel getLineModelMesDenunciaSexo() {
        return lineModelMesDenunciaSexo;
    }

    public void setLineModelMesDenunciaSexo(CartesianChartModel lineModelMesDenunciaSexo) {
        this.lineModelMesDenunciaSexo = lineModelMesDenunciaSexo;
    }

    public ArrayList<Vif_2010> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2010> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<Vif_2010> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<Vif_2010> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
    }

    public ArrayList<Vif_2010> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<Vif_2010> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
    }

    public ArrayList<Vif_2010> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<Vif_2010> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
    }

    public ArrayList<Vif_2010> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<Vif_2010> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
    }

    public ArrayList<Vif_2010> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<Vif_2010> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
    }

    public ArrayList<Vif_2010> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<Vif_2010> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
    }

    public ArrayList<Vif_2010> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<Vif_2010> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<Vif_2010> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
    }

    public ArrayList<Vif_2010> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<Vif_2010> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<Vif_2010> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembre() {
        return lstDatosDiciembre;
    }

    public void setLstDatosDiciembre(ArrayList<Vif_2010> lstDatosDiciembre) {
        this.lstDatosDiciembre = lstDatosDiciembre;
    }

    public ArrayList<Vif_2010> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<Vif_2010> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<Vif_2010> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<Vif_2010> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<Vif_2010> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<Vif_2010> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<Vif_2010> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<Vif_2010> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<Vif_2010> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<Vif_2010> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<Vif_2010> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<Vif_2010> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<Vif_2010> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<Vif_2010> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<Vif_2010> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<Vif_2010> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<Vif_2010> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<Vif_2010> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<Vif_2010> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2010> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<Vif_2010> lstDatosDiciembreF) {
        this.lstDatosDiciembreF = lstDatosDiciembreF;
    }

    public ArrayList<Vif_2010> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<Vif_2010> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<Vif_2010> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<Vif_2010> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<Vif_2010> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<Vif_2010> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<Vif_2010> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<Vif_2010> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<Vif_2010> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<Vif_2010> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<Vif_2010> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<Vif_2010> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<Vif_2010> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<Vif_2010> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<Vif_2010> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<Vif_2010> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<Vif_2010> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<Vif_2010> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<Vif_2010> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2010> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<Vif_2010> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
    }

    public CartesianChartModel getLineModelDiaDenunciaSexo() {
        return lineModelDiaDenunciaSexo;
    }

    public void setLineModelDiaDenunciaSexo(CartesianChartModel lineModelDiaDenunciaSexo) {
        this.lineModelDiaDenunciaSexo = lineModelDiaDenunciaSexo;
    }

    public Vif_2010 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2010 objDatos) {
        this.objDatos = objDatos;
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

    public ArrayList<Vif_2010> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Vif_2010> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Vif_2010> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Vif_2010> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Vif_2010> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Vif_2010> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Vif_2010> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Vif_2010> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Vif_2010> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Vif_2010> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Vif_2010> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Vif_2010> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Vif_2010> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public ArrayList<Vif_2010> getLstDatosLunesM() {
        return lstDatosLunesM;
    }

    public void setLstDatosLunesM(ArrayList<Vif_2010> lstDatosLunesM) {
        this.lstDatosLunesM = lstDatosLunesM;
    }

    public ArrayList<Vif_2010> getLstDatosMartesM() {
        return lstDatosMartesM;
    }

    public void setLstDatosMartesM(ArrayList<Vif_2010> lstDatosMartesM) {
        this.lstDatosMartesM = lstDatosMartesM;
    }

    public ArrayList<Vif_2010> getLstDatosMiercolesM() {
        return lstDatosMiercolesM;
    }

    public void setLstDatosMiercolesM(ArrayList<Vif_2010> lstDatosMiercolesM) {
        this.lstDatosMiercolesM = lstDatosMiercolesM;
    }

    public ArrayList<Vif_2010> getLstDatosJuevesM() {
        return lstDatosJuevesM;
    }

    public void setLstDatosJuevesM(ArrayList<Vif_2010> lstDatosJuevesM) {
        this.lstDatosJuevesM = lstDatosJuevesM;
    }

    public ArrayList<Vif_2010> getLstDatosViernesM() {
        return lstDatosViernesM;
    }

    public void setLstDatosViernesM(ArrayList<Vif_2010> lstDatosViernesM) {
        this.lstDatosViernesM = lstDatosViernesM;
    }

    public ArrayList<Vif_2010> getLstDatosSabadoM() {
        return lstDatosSabadoM;
    }

    public void setLstDatosSabadoM(ArrayList<Vif_2010> lstDatosSabadoM) {
        this.lstDatosSabadoM = lstDatosSabadoM;
    }

    public ArrayList<Vif_2010> getLstDatosDomingoM() {
        return lstDatosDomingoM;
    }

    public void setLstDatosDomingoM(ArrayList<Vif_2010> lstDatosDomingoM) {
        this.lstDatosDomingoM = lstDatosDomingoM;
    }

    public ArrayList<Vif_2010> getLstDatosLunesF() {
        return lstDatosLunesF;
    }

    public void setLstDatosLunesF(ArrayList<Vif_2010> lstDatosLunesF) {
        this.lstDatosLunesF = lstDatosLunesF;
    }

    public ArrayList<Vif_2010> getLstDatosMartesF() {
        return lstDatosMartesF;
    }

    public void setLstDatosMartesF(ArrayList<Vif_2010> lstDatosMartesF) {
        this.lstDatosMartesF = lstDatosMartesF;
    }

    public ArrayList<Vif_2010> getLstDatosMiercolesF() {
        return lstDatosMiercolesF;
    }

    public void setLstDatosMiercolesF(ArrayList<Vif_2010> lstDatosMiercolesF) {
        this.lstDatosMiercolesF = lstDatosMiercolesF;
    }

    public ArrayList<Vif_2010> getLstDatosJuevesF() {
        return lstDatosJuevesF;
    }

    public void setLstDatosJuevesF(ArrayList<Vif_2010> lstDatosJuevesF) {
        this.lstDatosJuevesF = lstDatosJuevesF;
    }

    public ArrayList<Vif_2010> getLstDatosViernesF() {
        return lstDatosViernesF;
    }

    public void setLstDatosViernesF(ArrayList<Vif_2010> lstDatosViernesF) {
        this.lstDatosViernesF = lstDatosViernesF;
    }

    public ArrayList<Vif_2010> getLstDatosSabadoF() {
        return lstDatosSabadoF;
    }

    public void setLstDatosSabadoF(ArrayList<Vif_2010> lstDatosSabadoF) {
        this.lstDatosSabadoF = lstDatosSabadoF;
    }

    public ArrayList<Vif_2010> getLstDatosDomingoF() {
        return lstDatosDomingoF;
    }

    public void setLstDatosDomingoF(ArrayList<Vif_2010> lstDatosDomingoF) {
        this.lstDatosDomingoF = lstDatosDomingoF;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.datoSel = new Vif_2010();
        this.lstDatos1 = new ArrayList<Vif_2010>();
        this.lstDatos = new ArrayList<Vif_2010>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModelDiaDenuncia = graficaDiaDenuncia();
        lineModelDiaDenunciaSexo = graficaDiaDenunciaSexoVictima();
        lineModelMesDenuncia = graficaMesesDenuncia();
        lineModelMesDenunciaSexo = graficaMesesDenunciaSexoVictima();
    }

    public Vif_2010ControladorFechaDenuncia() {
        this.reinit();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
            lstDatosLunes = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");

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

    private CartesianChartModel graficaDiaDenunciaSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            lstDatosLunesM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosMartesM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMiercolesM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosJuevesM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosViernesM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosSabadoM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosDomingoM = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");

            masculino.set("Lunes", lstDatosLunesM.size());
            masculino.set("Martes", lstDatosMartesM.size());
            masculino.set("Miercoles", lstDatosMiercolesM.size());
            masculino.set("Jueves", lstDatosJuevesM.size());
            masculino.set("Viernes", lstDatosViernesM.size());
            masculino.set("Sabado", lstDatosSabadoM.size());
            masculino.set("Domingo", lstDatosDomingoM.size());

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            lstDatosLunesF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosMartesF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMiercolesF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosJuevesF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosViernesF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosSabadoF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosDomingoF = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");

            femenino.set("Lunes", lstDatosLunesF.size());
            femenino.set("Martes", lstDatosMartesF.size());
            femenino.set("Miercoles", lstDatosMiercolesF.size());
            femenino.set("Jueves", lstDatosJuevesF.size());
            femenino.set("Viernes", lstDatosViernesF.size());
            femenino.set("Sabado", lstDatosSabadoF.size());
            femenino.set("Domingo", lstDatosDomingoF.size());

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
        }
        return model1;
    }

    private CartesianChartModel graficaMesesDenuncia() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            this.lstDatosEnero = FVif_2010.ObtenerDatosDadoMesDenuncia("ENERO");
            this.lstDatosFebrero = FVif_2010.ObtenerDatosDadoMesDenuncia("FEBRERO");
            this.lstDatosMarzo = FVif_2010.ObtenerDatosDadoMesDenuncia("MARZO");
            this.lstDatosAbril = FVif_2010.ObtenerDatosDadoMesDenuncia("ABRIL");
            this.lstDatosMayo = FVif_2010.ObtenerDatosDadoMesDenuncia("MAYO");
            this.lstDatosJunio = FVif_2010.ObtenerDatosDadoMesDenuncia("JUNIO");
            this.lstDatosJulio = FVif_2010.ObtenerDatosDadoMesDenuncia("JULIO");
            this.lstDatosAgosto = FVif_2010.ObtenerDatosDadoMesDenuncia("AGOSTO");
            this.lstDatosSeptiembre = FVif_2010.ObtenerDatosDadoMesDenuncia("SEPTIEMBRE");
            this.lstDatosOctubre = FVif_2010.ObtenerDatosDadoMesDenuncia("OCTUBRE");
            this.lstDatosNoviembre = FVif_2010.ObtenerDatosDadoMesDenuncia("NOVIEMBRE");
            this.lstDatosDiciembre = FVif_2010.ObtenerDatosDadoMesDenuncia("DICIEMBRE");

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

    private CartesianChartModel graficaMesesDenunciaSexoVictima() {
        CartesianChartModel model3 = new CartesianChartModel();
        try {
            this.lstDatosEneroM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("ENERO", "M");
            this.lstDatosFebreroM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("FEBRERO", "M");
            this.lstDatosMarzoM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("MARZO", "M");
            this.lstDatosAbrilM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("ABRIL", "M");
            this.lstDatosMayoM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("MAYO", "M");
            this.lstDatosJunioM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("JUNIO", "M");
            this.lstDatosJulioM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("JULIO", "M");
            this.lstDatosAgostoM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("AGOSTO", "M");
            this.lstDatosSeptiembreM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("SEPTIEMBRE", "M");
            this.lstDatosOctubreM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("OCTUBRE", "M");
            this.lstDatosNoviembreM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("NOVIEMBRE", "M");
            this.lstDatosDiciembreM = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("DICIEMBRE", "M");

            this.lstDatosEneroF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("ENERO", "F");
            this.lstDatosFebreroF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("FEBRERO", "F");
            this.lstDatosMarzoF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("MARZO", "F");
            this.lstDatosAbrilF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("ABRIL", "F");
            this.lstDatosMayoF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("MAYO", "F");
            this.lstDatosJunioF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("JUNIO", "F");
            this.lstDatosJulioF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("JULIO", "F");
            this.lstDatosAgostoF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("AGOSTO", "F");
            this.lstDatosSeptiembreF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("SEPTIEMBRE", "F");
            this.lstDatosOctubreF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("OCTUBRE", "F");
            this.lstDatosNoviembreF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("NOVIEMBRE", "F");
            this.lstDatosDiciembreF = FVif_2010.ObtenerDatosDadoMesDenunciaSexoVictima("DICIEMBRE", "F");

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

    public void cargarDatos() {
        try {

            this.lstDatos1 = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatos1.get(0);
            System.out.println(lstDatos1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
