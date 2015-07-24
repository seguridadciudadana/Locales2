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
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorDiaAgresion {

    private CartesianChartModel lineModelDiaDenuncia;
    private Vif_2011 objDatos;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatos;
    private ArrayList<Vif_2011> lstDatos1;
    private ArrayList<Vif_2011> lstDatosLunes;
    private ArrayList<Vif_2011> lstDatosMartes;
    private ArrayList<Vif_2011> lstDatosMiercoles;
    private ArrayList<Vif_2011> lstDatosJueves;
    private ArrayList<Vif_2011> lstDatosViernes;
    private ArrayList<Vif_2011> lstDatosSabado;
    private ArrayList<Vif_2011> lstDatosDomingo;
    private PieChartModel pieModel;
    private CartesianChartModel lineModelDiaDenunciaSexoVictima;
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

    public CartesianChartModel getLineModelDiaDenunciaSexoVictima() {
        return lineModelDiaDenunciaSexoVictima;
    }

    public void setLineModelDiaDenunciaSexoVictima(CartesianChartModel lineModelDiaDenunciaSexoVictima) {
        this.lineModelDiaDenunciaSexoVictima = lineModelDiaDenunciaSexoVictima;
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

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
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

    public ArrayList<Vif_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2011> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2011> lstDatos1) {
        this.lstDatos1 = lstDatos1;
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

    public Vif_2011ControladorDiaAgresion() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.datoSel = new Vif_2011();
        this.lstDatos1 = new ArrayList<Vif_2011>();
        this.lstDatos = new ArrayList<Vif_2011>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModelDiaDenuncia = graficaDiaDenuncia();
        lineModelDiaDenunciaSexoVictima = graficaDiaDenunciaSexoVictima();
        pieModel = graficaAnioDenuncia();
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

    private PieChartModel graficaAnioDenuncia() {
        PieChartModel semana = new PieChartModel();
        try {

            lstDatosLunes = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            semana = new PieChartModel();
            semana.set("Lunes", lstDatosLunes.size());
            semana.set("Martes", lstDatosMartes.size());
            semana.set("Miercoles", lstDatosMiercoles.size());
            semana.set("Jueves", lstDatosJueves.size());
            semana.set("Viernes", lstDatosViernes.size());
            semana.set("Sabado", lstDatosSabado.size());
            semana.set("Domingo", lstDatosDomingo.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel graficaDiaDenunciaSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
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

            model.addSeries(Femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos() {
        try {

            this.lstDatos1 = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatos1.get(0);
            System.out.println(lstDatos1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
