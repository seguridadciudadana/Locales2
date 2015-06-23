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
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorDiaAgresion {

    /**
     * Creates a new instance of Vif_2010ControladorDiaAgresion
     */
    private CartesianChartModel lineModelDiaDenuncia;
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

    private PieChartModel pieModel;

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
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

    public ArrayList<Vif_2010> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
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

    public Vif_2010ControladorDiaAgresion() {
        this.reinit();

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
        pieModel = graficaAnioDenuncia();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
            lstDatosLunes = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMartes = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMiercoles = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosViernes = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosSabado = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosDomingo = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");

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

            lstDatosLunes = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMartes = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMiercoles = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosViernes = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosSabado = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosDomingo = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");

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
