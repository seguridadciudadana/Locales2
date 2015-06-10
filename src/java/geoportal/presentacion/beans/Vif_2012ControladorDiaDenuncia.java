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
import org.primefaces.model.chart.PieChartModel;
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
    private PieChartModel pieModel;
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

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
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
        pieModel = graficaSemanaDenuncia();

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
        this.lstDatosLunesM = new ArrayList<Vif_2012>();
        this.lstDatosMartesM = new ArrayList<Vif_2012>();
        this.lstDatosMiercolesM = new ArrayList<Vif_2012>();
        this.lstDatosJuevesM = new ArrayList<Vif_2012>();
        this.lstDatosViernesM = new ArrayList<Vif_2012>();
        this.lstDatosSabadoM = new ArrayList<Vif_2012>();
        this.lstDatosDomingoM = new ArrayList<Vif_2012>();
        this.lstDatosLunesF = new ArrayList<Vif_2012>();
        this.lstDatosMartesF = new ArrayList<Vif_2012>();
        this.lstDatosMiercolesF = new ArrayList<Vif_2012>();
        this.lstDatosJuevesF = new ArrayList<Vif_2012>();
        this.lstDatosViernesF = new ArrayList<Vif_2012>();
        this.lstDatosSabadoF = new ArrayList<Vif_2012>();
        this.lstDatosDomingoF = new ArrayList<Vif_2012>();
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
            lstDatosLunes = FVif_2012.ObtenerDatosDiaDenuncia(1);
            lstDatosMartes = FVif_2012.ObtenerDatosDiaDenuncia(2);
            lstDatosMiercoles = FVif_2012.ObtenerDatosDiaDenuncia(3);
            lstDatosJueves = FVif_2012.ObtenerDatosDiaDenuncia(4);
            lstDatosViernes = FVif_2012.ObtenerDatosDiaDenuncia(5);
            lstDatosSabado = FVif_2012.ObtenerDatosDiaDenuncia(6);
            lstDatosDomingo = FVif_2012.ObtenerDatosDiaDenuncia(0);

            //victimas sexo masculino
            lstDatosLunesM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(1, "M");
            lstDatosMartesM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(2, "M");
            lstDatosMiercolesM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(3, "M");
            lstDatosJuevesM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(4, "M");
            lstDatosViernesM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(5, "M");
            lstDatosSabadoM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(6, "M");
            lstDatosDomingoM = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(0, "M");
            lstDatosLunesF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(1, "F");
            lstDatosMartesF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(2, "F");
            lstDatosMiercolesF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(3, "F");
            lstDatosJuevesF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(4, "F");
            lstDatosViernesF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(5, "F");
            lstDatosSabadoF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(6, "F");
            lstDatosDomingoF = FVif_2012.ObtenerDatosDiaDenunciaSexoVictima(0, "F");

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
            Femenino.setLabel("VictiFas Sexo FeFenino");
            Femenino.set("Lunes", lstDatosLunesF.size());
            Femenino.set("Fartes", lstDatosMartesF.size());
            Femenino.set("Fiercoles", lstDatosMiercolesF.size());
            Femenino.set("Jueves", lstDatosJuevesF.size());
            Femenino.set("Viernes", lstDatosViernesF.size());
            Femenino.set("Sabado", lstDatosSabadoF.size());
            Femenino.set("DoFingo", lstDatosDomingoF.size());

//            model.addSeries(Semana);
            model.addSeries(Femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel graficaSemanaDenuncia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            pieModel.set("Lunes", lstDatosLunes.size());
            pieModel.set("Martes", lstDatosMartes.size());
            pieModel.set("Miercoles", lstDatosMiercoles.size());
            pieModel.set("Jueves", lstDatosJueves.size());
            pieModel.set("Viernes", lstDatosViernes.size());
            pieModel.set("Sabado", lstDatosSabado.size());
            pieModel.set("Domingo", lstDatosDomingo.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
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
