/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorDiaDenuncia {

    /**
     * Creates a new instance of Vif_2012ControladorDiaDenuncia
     */
    private CartesianChartModel lineModelDiaDenuncia;
    private Vif_2012 objDatos;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatosLunes;
    private ArrayList<Vif_2012> lstDatosMartes;
    private ArrayList<Vif_2012> lstDatosMiercoles;
    private ArrayList<Vif_2012> lstDatosJueves;
    private ArrayList<Vif_2012> lstDatosViernes;
    private ArrayList<Vif_2012> lstDatosSabado;
    private ArrayList<Vif_2012> lstDatosDomingo;

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
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

    public ArrayList<Vif_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2012> lstDatos) {
        this.lstDatos = lstDatos;
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

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        //lineModelCircuitoViolencia = graficaCircuitoViolencia();
        lineModelDiaDenuncia = graficaDiaDenuncia();
    }

    private void reinit() {
        this.datoSel = new Vif_2012();
        this.lstDatos = new ArrayList<Vif_2012>();

        this.lstDatosLunes = new ArrayList<Vif_2012>();
        this.lstDatosMartes = new ArrayList<Vif_2012>();
        this.lstDatosMiercoles = new ArrayList<Vif_2012>();
        this.lstDatosJueves = new ArrayList<Vif_2012>();
        this.lstDatosViernes = new ArrayList<Vif_2012>();
        this.lstDatosSabado = new ArrayList<Vif_2012>();
        this.lstDatosDomingo = new ArrayList<Vif_2012>();

        this.cargarDatos();
        this.init();
    }

    public Vif_2012ControladorDiaDenuncia() {
        this.reinit();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            //lstDatos24MayoF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "24 DE MAYO");
            lstDatosLunes = FVif_2012.ObtenerDatosDiaDenuncia(0);
            lstDatosMartes = FVif_2012.ObtenerDatosDiaDenuncia(1);
            lstDatosMiercoles = FVif_2012.ObtenerDatosDiaDenuncia(2);
            lstDatosJueves = FVif_2012.ObtenerDatosDiaDenuncia(3);
            lstDatosViernes = FVif_2012.ObtenerDatosDiaDenuncia(4);
            lstDatosSabado = FVif_2012.ObtenerDatosDiaDenuncia(5);
            lstDatosDomingo = FVif_2012.ObtenerDatosDiaDenuncia(6);

            ChartSeries Semana = new ChartSeries();
            Semana.setLabel("Semana");
            //Fisica.set("24 DE MAYO", lstDatos24MayoFisica.size());
            Semana.set("Lunes", lstDatosLunes.size());
            Semana.set("Martes", lstDatosMartes.size());
            Semana.set("Miercoles", lstDatosMiercoles.size());
            Semana.set("Jueves", lstDatosJueves.size());
            Semana.set("Viernes", lstDatosViernes.size());
            Semana.set("Sabado", lstDatosSabado.size());
            Semana.set("Domingo", lstDatosDomingo.size());

            model.addSeries(Semana);

        } catch (Exception e) {
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
