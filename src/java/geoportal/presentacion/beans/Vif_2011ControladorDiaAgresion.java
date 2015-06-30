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
        pieModel = graficaAnioDenuncia();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries semana = new ChartSeries();
            semana.setLabel("Dia de la Agresión");
            lstDatosLunes = FVif_2011.ObtenerDatosDadoDiaAgresion(0);
            lstDatosMartes = FVif_2011.ObtenerDatosDadoDiaAgresion(1);
            lstDatosMiercoles = FVif_2011.ObtenerDatosDadoDiaAgresion(2);
            lstDatosJueves = FVif_2011.ObtenerDatosDadoDiaAgresion(3);
            lstDatosViernes = FVif_2011.ObtenerDatosDadoDiaAgresion(4);
            lstDatosSabado = FVif_2011.ObtenerDatosDadoDiaAgresion(5);
            lstDatosDomingo = FVif_2011.ObtenerDatosDadoDiaAgresion(6);

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

            lstDatosLunes = FVif_2011.ObtenerDatosDadoDiaAgresion(1);
            lstDatosMartes = FVif_2011.ObtenerDatosDadoDiaAgresion(2);
            lstDatosMiercoles = FVif_2011.ObtenerDatosDadoDiaAgresion(3);
            lstDatosJueves = FVif_2011.ObtenerDatosDadoDiaAgresion(4);
            lstDatosViernes = FVif_2011.ObtenerDatosDadoDiaAgresion(5);
            lstDatosSabado = FVif_2011.ObtenerDatosDadoDiaAgresion(6);
            lstDatosDomingo = FVif_2011.ObtenerDatosDadoDiaAgresion(0);

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

            this.lstDatos1 = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatos1.get(0);
            System.out.println(lstDatos1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
