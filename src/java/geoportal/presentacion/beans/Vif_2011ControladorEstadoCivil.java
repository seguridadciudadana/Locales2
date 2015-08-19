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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorEstadoCivil {

    private CartesianChartModel graficaEstadoCivilVictima;
    private ArrayList<Vif_2011> lstDatosDivorciado;
    private ArrayList<Vif_2011> lstDatosCasado;
    private ArrayList<Vif_2011> lstDatosViudo;
    private ArrayList<Vif_2011> lstDatosUnionLibre;
    private ArrayList<Vif_2011> lstDatosUnionHecho;
    private ArrayList<Vif_2011> lstDatosSoltero;
    private ArrayList<Vif_2011> lstDatosNa;
    private CartesianChartModel graficaEstadoCivilSexoVictima;
    private ArrayList<Vif_2011> lstDatosDivorciadoM;
    private ArrayList<Vif_2011> lstDatosCasadoM;
    private ArrayList<Vif_2011> lstDatosViudoM;
    private ArrayList<Vif_2011> lstDatosUnionLibreM;
    private ArrayList<Vif_2011> lstDatosUnionHechoM;
    private ArrayList<Vif_2011> lstDatosSolteroM;
    private ArrayList<Vif_2011> lstDatosNaM;
    private ArrayList<Vif_2011> lstDatosDivorciadoF;
    private ArrayList<Vif_2011> lstDatosCasadoF;
    private ArrayList<Vif_2011> lstDatosViudoF;
    private ArrayList<Vif_2011> lstDatosUnionLibreF;
    private ArrayList<Vif_2011> lstDatosUnionHechoF;
    private ArrayList<Vif_2011> lstDatosSolteroF;
    private ArrayList<Vif_2011> lstDatosNaF;

    public CartesianChartModel getGraficaEstadoCivilSexoVictima() {
        return graficaEstadoCivilSexoVictima;
    }

    public void setGraficaEstadoCivilSexoVictima(CartesianChartModel graficaEstadoCivilSexoVictima) {
        this.graficaEstadoCivilSexoVictima = graficaEstadoCivilSexoVictima;
    }

    public ArrayList<Vif_2011> getLstDatosDivorciadoM() {
        return lstDatosDivorciadoM;
    }

    public void setLstDatosDivorciadoM(ArrayList<Vif_2011> lstDatosDivorciadoM) {
        this.lstDatosDivorciadoM = lstDatosDivorciadoM;
    }

    public ArrayList<Vif_2011> getLstDatosCasadoM() {
        return lstDatosCasadoM;
    }

    public void setLstDatosCasadoM(ArrayList<Vif_2011> lstDatosCasadoM) {
        this.lstDatosCasadoM = lstDatosCasadoM;
    }

    public ArrayList<Vif_2011> getLstDatosViudoM() {
        return lstDatosViudoM;
    }

    public void setLstDatosViudoM(ArrayList<Vif_2011> lstDatosViudoM) {
        this.lstDatosViudoM = lstDatosViudoM;
    }

    public ArrayList<Vif_2011> getLstDatosUnionLibreM() {
        return lstDatosUnionLibreM;
    }

    public void setLstDatosUnionLibreM(ArrayList<Vif_2011> lstDatosUnionLibreM) {
        this.lstDatosUnionLibreM = lstDatosUnionLibreM;
    }

    public ArrayList<Vif_2011> getLstDatosUnionHechoM() {
        return lstDatosUnionHechoM;
    }

    public void setLstDatosUnionHechoM(ArrayList<Vif_2011> lstDatosUnionHechoM) {
        this.lstDatosUnionHechoM = lstDatosUnionHechoM;
    }

    public ArrayList<Vif_2011> getLstDatosSolteroM() {
        return lstDatosSolteroM;
    }

    public void setLstDatosSolteroM(ArrayList<Vif_2011> lstDatosSolteroM) {
        this.lstDatosSolteroM = lstDatosSolteroM;
    }

    public ArrayList<Vif_2011> getLstDatosNaM() {
        return lstDatosNaM;
    }

    public void setLstDatosNaM(ArrayList<Vif_2011> lstDatosNaM) {
        this.lstDatosNaM = lstDatosNaM;
    }

    public ArrayList<Vif_2011> getLstDatosDivorciadoF() {
        return lstDatosDivorciadoF;
    }

    public void setLstDatosDivorciadoF(ArrayList<Vif_2011> lstDatosDivorciadoF) {
        this.lstDatosDivorciadoF = lstDatosDivorciadoF;
    }

    public ArrayList<Vif_2011> getLstDatosCasadoF() {
        return lstDatosCasadoF;
    }

    public void setLstDatosCasadoF(ArrayList<Vif_2011> lstDatosCasadoF) {
        this.lstDatosCasadoF = lstDatosCasadoF;
    }

    public ArrayList<Vif_2011> getLstDatosViudoF() {
        return lstDatosViudoF;
    }

    public void setLstDatosViudoF(ArrayList<Vif_2011> lstDatosViudoF) {
        this.lstDatosViudoF = lstDatosViudoF;
    }

    public ArrayList<Vif_2011> getLstDatosUnionLibreF() {
        return lstDatosUnionLibreF;
    }

    public void setLstDatosUnionLibreF(ArrayList<Vif_2011> lstDatosUnionLibreF) {
        this.lstDatosUnionLibreF = lstDatosUnionLibreF;
    }

    public ArrayList<Vif_2011> getLstDatosUnionHechoF() {
        return lstDatosUnionHechoF;
    }

    public void setLstDatosUnionHechoF(ArrayList<Vif_2011> lstDatosUnionHechoF) {
        this.lstDatosUnionHechoF = lstDatosUnionHechoF;
    }

    public ArrayList<Vif_2011> getLstDatosSolteroF() {
        return lstDatosSolteroF;
    }

    public void setLstDatosSolteroF(ArrayList<Vif_2011> lstDatosSolteroF) {
        this.lstDatosSolteroF = lstDatosSolteroF;
    }

    public ArrayList<Vif_2011> getLstDatosNaF() {
        return lstDatosNaF;
    }

    public void setLstDatosNaF(ArrayList<Vif_2011> lstDatosNaF) {
        this.lstDatosNaF = lstDatosNaF;
    }

    public CartesianChartModel getGraficaEstadoCivilVictima() {
        return graficaEstadoCivilVictima;
    }

    public void setGraficaEstadoCivilVictima(CartesianChartModel graficaEstadoCivilVictima) {
        this.graficaEstadoCivilVictima = graficaEstadoCivilVictima;
    }

    public ArrayList<Vif_2011> getLstDatosDivorciado() {
        return lstDatosDivorciado;
    }

    public void setLstDatosDivorciado(ArrayList<Vif_2011> lstDatosDivorciado) {
        this.lstDatosDivorciado = lstDatosDivorciado;
    }

    public ArrayList<Vif_2011> getLstDatosCasado() {
        return lstDatosCasado;
    }

    public void setLstDatosCasado(ArrayList<Vif_2011> lstDatosCasado) {
        this.lstDatosCasado = lstDatosCasado;
    }

    public ArrayList<Vif_2011> getLstDatosViudo() {
        return lstDatosViudo;
    }

    public void setLstDatosViudo(ArrayList<Vif_2011> lstDatosViudo) {
        this.lstDatosViudo = lstDatosViudo;
    }

    public ArrayList<Vif_2011> getLstDatosUnionLibre() {
        return lstDatosUnionLibre;
    }

    public void setLstDatosUnionLibre(ArrayList<Vif_2011> lstDatosUnionLibre) {
        this.lstDatosUnionLibre = lstDatosUnionLibre;
    }

    public ArrayList<Vif_2011> getLstDatosUnionHecho() {
        return lstDatosUnionHecho;
    }

    public void setLstDatosUnionHecho(ArrayList<Vif_2011> lstDatosUnionHecho) {
        this.lstDatosUnionHecho = lstDatosUnionHecho;
    }

    public ArrayList<Vif_2011> getLstDatosSoltero() {
        return lstDatosSoltero;
    }

    public void setLstDatosSoltero(ArrayList<Vif_2011> lstDatosSoltero) {
        this.lstDatosSoltero = lstDatosSoltero;
    }

    public ArrayList<Vif_2011> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2011> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public Vif_2011ControladorEstadoCivil() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCasado = new ArrayList<Vif_2011>();
        this.lstDatosDivorciado = new ArrayList<Vif_2011>();
        this.lstDatosNa = new ArrayList<Vif_2011>();
        this.lstDatosSoltero = new ArrayList<Vif_2011>();
        this.lstDatosUnionHecho = new ArrayList<Vif_2011>();
        this.lstDatosUnionLibre = new ArrayList<Vif_2011>();
        this.lstDatosViudo = new ArrayList<Vif_2011>();

        this.init();

    }

    public void graficar() {
        graficaEstadoCivilVictima = initCategoryEstadoVictima();
        graficaEstadoCivilSexoVictima=initCategoryEstadoCivilSexoVictima();
    }

    /**
     *
     */
    private CartesianChartModel initCategoryEstadoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCasado = FVif_2011.ObtenerDatosVictimaCasados();
            lstDatosDivorciado = FVif_2011.ObtenerDatosVictimaDivorciado();
            lstDatosNa = FVif_2011.ObtenerDatosVictimaNa();
            lstDatosSoltero = FVif_2011.ObtenerDatosVictimaSoltero();
            lstDatosUnionHecho = FVif_2011.ObtenerDatosVictimaUnionHecho();
            lstDatosUnionLibre = FVif_2011.ObtenerDatosVictimaUnionLibre();
            lstDatosViudo = FVif_2011.ObtenerDatosVictimaViudo();
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil");
            EstadoCivil.set("Casad@", lstDatosCasado.size());
            EstadoCivil.set("Divorciad@", lstDatosDivorciado.size());
            EstadoCivil.set("NA", lstDatosNa.size());
            EstadoCivil.set("Solter@", lstDatosSoltero.size());
            EstadoCivil.set("Union de Hecho", lstDatosUnionHecho.size());
            EstadoCivil.set("Union Libre", lstDatosUnionLibre.size());
            EstadoCivil.set("Viud@", lstDatosViudo.size());

            model.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryEstadoCivilSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatosCasadoF = FVif_2011.ObtenerDatosVictimaCasadosDadoSexo("F");
            lstDatosDivorciadoF = FVif_2011.ObtenerDatosVictimaDivorciadoDadoSexo("F");
            lstDatosNaF = FVif_2011.ObtenerDatosEstadoVictimaNaDadoSexo("F");
            lstDatosSolteroF = FVif_2011.ObtenerDatosVictimaSolteroDadoSexo("F");
            lstDatosUnionHechoF = FVif_2011.ObtenerDatosVictimaUnionHechoDadoSexo("F");
            lstDatosUnionLibreF = FVif_2011.ObtenerDatosVictimaUnionLibreDadoSexo("F");
            lstDatosViudoF = FVif_2011.ObtenerDatosVictimaViudoDadoSexo("F");

            lstDatosCasadoM = FVif_2011.ObtenerDatosVictimaCasadosDadoSexo("M");
            lstDatosDivorciadoM = FVif_2011.ObtenerDatosVictimaDivorciadoDadoSexo("M");
            lstDatosNaM = FVif_2011.ObtenerDatosEstadoVictimaNaDadoSexo("M");
            lstDatosSolteroM = FVif_2011.ObtenerDatosVictimaSolteroDadoSexo("M");
            lstDatosUnionHechoM = FVif_2011.ObtenerDatosVictimaUnionHechoDadoSexo("M");
            lstDatosUnionLibreM = FVif_2011.ObtenerDatosVictimaUnionLibreDadoSexo("M");
            lstDatosViudoM = FVif_2011.ObtenerDatosVictimaViudoDadoSexo("M");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Casad@", lstDatosCasadoM.size());
            Masculino.set("Divorciad@", lstDatosDivorciadoM.size());
            Masculino.set("NA", lstDatosNaM.size());
            Masculino.set("Solter@", lstDatosSolteroM.size());
            Masculino.set("Union de Hecho", lstDatosUnionHechoM.size());
            Masculino.set("Union Libre", lstDatosUnionLibreM.size());
            Masculino.set("Viud@", lstDatosViudoM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("Casad@", lstDatosCasadoF.size());
            Femenino.set("Divorciad@", lstDatosDivorciadoF.size());
            Femenino.set("NA", lstDatosNaF.size());
            Femenino.set("Solter@", lstDatosSolteroF.size());
            Femenino.set("Union de Hecho", lstDatosUnionHechoF.size());
            Femenino.set("Union Libre", lstDatosUnionLibreF.size());
            Femenino.set("Viud@", lstDatosViudoF.size());

            model1.addSeries(Femenino);
            model1.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

}
