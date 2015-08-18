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
        //pieModel = graficaAnioDenuncia();
        lineModelDiaDenunciaSexo=graficaDiaDenunciaSexoVictima();
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
        CartesianChartModel model = new CartesianChartModel();
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

            model.addSeries(femenino);
            model.addSeries(masculino);
            
        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel graficaAnioDenuncia() {
        PieChartModel semana = new PieChartModel();
        try {

            lstDatosLunes = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");

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
