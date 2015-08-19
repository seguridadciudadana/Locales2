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
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorEstadoCivil {

    private CartesianChartModel graficaEstadoCivilVictima;
    private ArrayList<Vif_2010> lstDatosDivorciado;
    private ArrayList<Vif_2010> lstDatosCasado;
    private ArrayList<Vif_2010> lstDatosViudo;
    private ArrayList<Vif_2010> lstDatosUnionLibre;
    private ArrayList<Vif_2010> lstDatosUnionHecho;
    private ArrayList<Vif_2010> lstDatosSoltero;
    private ArrayList<Vif_2010> lstDatosNa;

    private CartesianChartModel graficaEstadoCivilVictimaSexo;
    private ArrayList<Vif_2010> lstDatosDivorciadoM;
    private ArrayList<Vif_2010> lstDatosCasadoM;
    private ArrayList<Vif_2010> lstDatosViudoM;
    private ArrayList<Vif_2010> lstDatosUnionLibreM;
    private ArrayList<Vif_2010> lstDatosUnionHechoM;
    private ArrayList<Vif_2010> lstDatosSolteroM;
    private ArrayList<Vif_2010> lstDatosNaM;

    private ArrayList<Vif_2010> lstDatosDivorciadoF;
    private ArrayList<Vif_2010> lstDatosCasadoF;
    private ArrayList<Vif_2010> lstDatosViudoF;
    private ArrayList<Vif_2010> lstDatosUnionLibreF;
    private ArrayList<Vif_2010> lstDatosUnionHechoF;
    private ArrayList<Vif_2010> lstDatosSolteroF;
    private ArrayList<Vif_2010> lstDatosNaF;

    public CartesianChartModel getGraficaEstadoCivilVictimaSexo() {
        return graficaEstadoCivilVictimaSexo;
    }

    public void setGraficaEstadoCivilVictimaSexo(CartesianChartModel graficaEstadoCivilVictimaSexo) {
        this.graficaEstadoCivilVictimaSexo = graficaEstadoCivilVictimaSexo;
    }

    public ArrayList<Vif_2010> getLstDatosDivorciadoM() {
        return lstDatosDivorciadoM;
    }

    public void setLstDatosDivorciadoM(ArrayList<Vif_2010> lstDatosDivorciadoM) {
        this.lstDatosDivorciadoM = lstDatosDivorciadoM;
    }

    public ArrayList<Vif_2010> getLstDatosCasadoM() {
        return lstDatosCasadoM;
    }

    public void setLstDatosCasadoM(ArrayList<Vif_2010> lstDatosCasadoM) {
        this.lstDatosCasadoM = lstDatosCasadoM;
    }

    public ArrayList<Vif_2010> getLstDatosViudoM() {
        return lstDatosViudoM;
    }

    public void setLstDatosViudoM(ArrayList<Vif_2010> lstDatosViudoM) {
        this.lstDatosViudoM = lstDatosViudoM;
    }

    public ArrayList<Vif_2010> getLstDatosUnionLibreM() {
        return lstDatosUnionLibreM;
    }

    public void setLstDatosUnionLibreM(ArrayList<Vif_2010> lstDatosUnionLibreM) {
        this.lstDatosUnionLibreM = lstDatosUnionLibreM;
    }

    public ArrayList<Vif_2010> getLstDatosUnionHechoM() {
        return lstDatosUnionHechoM;
    }

    public void setLstDatosUnionHechoM(ArrayList<Vif_2010> lstDatosUnionHechoM) {
        this.lstDatosUnionHechoM = lstDatosUnionHechoM;
    }

    public ArrayList<Vif_2010> getLstDatosSolteroM() {
        return lstDatosSolteroM;
    }

    public void setLstDatosSolteroM(ArrayList<Vif_2010> lstDatosSolteroM) {
        this.lstDatosSolteroM = lstDatosSolteroM;
    }

    public ArrayList<Vif_2010> getLstDatosNaM() {
        return lstDatosNaM;
    }

    public void setLstDatosNaM(ArrayList<Vif_2010> lstDatosNaM) {
        this.lstDatosNaM = lstDatosNaM;
    }

    public ArrayList<Vif_2010> getLstDatosDivorciadoF() {
        return lstDatosDivorciadoF;
    }

    public void setLstDatosDivorciadoF(ArrayList<Vif_2010> lstDatosDivorciadoF) {
        this.lstDatosDivorciadoF = lstDatosDivorciadoF;
    }

    public ArrayList<Vif_2010> getLstDatosCasadoF() {
        return lstDatosCasadoF;
    }

    public void setLstDatosCasadoF(ArrayList<Vif_2010> lstDatosCasadoF) {
        this.lstDatosCasadoF = lstDatosCasadoF;
    }

    public ArrayList<Vif_2010> getLstDatosViudoF() {
        return lstDatosViudoF;
    }

    public void setLstDatosViudoF(ArrayList<Vif_2010> lstDatosViudoF) {
        this.lstDatosViudoF = lstDatosViudoF;
    }

    public ArrayList<Vif_2010> getLstDatosUnionLibreF() {
        return lstDatosUnionLibreF;
    }

    public void setLstDatosUnionLibreF(ArrayList<Vif_2010> lstDatosUnionLibreF) {
        this.lstDatosUnionLibreF = lstDatosUnionLibreF;
    }

    public ArrayList<Vif_2010> getLstDatosUnionHechoF() {
        return lstDatosUnionHechoF;
    }

    public void setLstDatosUnionHechoF(ArrayList<Vif_2010> lstDatosUnionHechoF) {
        this.lstDatosUnionHechoF = lstDatosUnionHechoF;
    }

    public ArrayList<Vif_2010> getLstDatosSolteroF() {
        return lstDatosSolteroF;
    }

    public void setLstDatosSolteroF(ArrayList<Vif_2010> lstDatosSolteroF) {
        this.lstDatosSolteroF = lstDatosSolteroF;
    }

    public ArrayList<Vif_2010> getLstDatosNaF() {
        return lstDatosNaF;
    }

    public void setLstDatosNaF(ArrayList<Vif_2010> lstDatosNaF) {
        this.lstDatosNaF = lstDatosNaF;
    }

    public CartesianChartModel getGraficaEstadoCivilVictima() {
        return graficaEstadoCivilVictima;
    }

    public void setGraficaEstadoCivilVictima(CartesianChartModel graficaEstadoCivilVictima) {
        this.graficaEstadoCivilVictima = graficaEstadoCivilVictima;
    }

    public ArrayList<Vif_2010> getLstDatosDivorciado() {
        return lstDatosDivorciado;
    }

    public void setLstDatosDivorciado(ArrayList<Vif_2010> lstDatosDivorciado) {
        this.lstDatosDivorciado = lstDatosDivorciado;
    }

    public ArrayList<Vif_2010> getLstDatosCasado() {
        return lstDatosCasado;
    }

    public void setLstDatosCasado(ArrayList<Vif_2010> lstDatosCasado) {
        this.lstDatosCasado = lstDatosCasado;
    }

    public ArrayList<Vif_2010> getLstDatosViudo() {
        return lstDatosViudo;
    }

    public void setLstDatosViudo(ArrayList<Vif_2010> lstDatosViudo) {
        this.lstDatosViudo = lstDatosViudo;
    }

    public ArrayList<Vif_2010> getLstDatosUnionLibre() {
        return lstDatosUnionLibre;
    }

    public void setLstDatosUnionLibre(ArrayList<Vif_2010> lstDatosUnionLibre) {
        this.lstDatosUnionLibre = lstDatosUnionLibre;
    }

    public ArrayList<Vif_2010> getLstDatosUnionHecho() {
        return lstDatosUnionHecho;
    }

    public void setLstDatosUnionHecho(ArrayList<Vif_2010> lstDatosUnionHecho) {
        this.lstDatosUnionHecho = lstDatosUnionHecho;
    }

    public ArrayList<Vif_2010> getLstDatosSoltero() {
        return lstDatosSoltero;
    }

    public void setLstDatosSoltero(ArrayList<Vif_2010> lstDatosSoltero) {
        this.lstDatosSoltero = lstDatosSoltero;
    }

    public ArrayList<Vif_2010> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2010> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public Vif_2010ControladorEstadoCivil() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCasado = new ArrayList<Vif_2010>();
        this.lstDatosDivorciado = new ArrayList<Vif_2010>();
        this.lstDatosNa = new ArrayList<Vif_2010>();
        this.lstDatosSoltero = new ArrayList<Vif_2010>();
        this.lstDatosUnionHecho = new ArrayList<Vif_2010>();
        this.lstDatosUnionLibre = new ArrayList<Vif_2010>();
        this.lstDatosViudo = new ArrayList<Vif_2010>();

        this.init();

    }

    public void graficar() {
        graficaEstadoCivilVictima = initCategoryEstadoVictima();
        graficaEstadoCivilVictimaSexo = initCategoryEstadoVictimaSexo();
    }

    private CartesianChartModel initCategoryEstadoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCasado = FVif_2010.ObtenerDatosVictimaCasados();
            lstDatosDivorciado = FVif_2010.ObtenerDatosVictimaDivorciado();
            lstDatosNa = FVif_2010.ObtenerDatosVictimaNa();
            lstDatosSoltero = FVif_2010.ObtenerDatosVictimaSoltero();
            lstDatosUnionHecho = FVif_2010.ObtenerDatosVictimaUnionHecho();
            lstDatosUnionLibre = FVif_2010.ObtenerDatosVictimaUnionLibre();
            lstDatosViudo = FVif_2010.ObtenerDatosVictimaViudo();

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

    private CartesianChartModel initCategoryEstadoVictimaSexo() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatosCasadoM = FVif_2010.ObtenerDatosVictimaCasadosDadoSexo("M");
            lstDatosDivorciadoM = FVif_2010.ObtenerDatosVictimaDivorciadoDadoSexo("M");
            lstDatosNaM = FVif_2010.ObtenerDatosVictimaNaDadoSexo("M");
            lstDatosSolteroM = FVif_2010.ObtenerDatosVictimaSolteroDadoSexo("M");
            lstDatosUnionHechoM = FVif_2010.ObtenerDatosVictimaUnionHechoDadoSexo("M");
            lstDatosUnionLibreM = FVif_2010.ObtenerDatosVictimaUnionLibreDadoSexo("M");
            lstDatosViudoM = FVif_2010.ObtenerDatosVictimaViudoDadoSexo("M");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Casad@", lstDatosCasadoM.size());
            Masculino.set("Divorciad@", lstDatosDivorciadoM.size());
            Masculino.set("NA", lstDatosNaM.size());
            Masculino.set("Solter@", lstDatosSolteroM.size());
            Masculino.set("Union de Hecho", lstDatosUnionHechoM.size());
            Masculino.set("Union Libre", lstDatosUnionLibreM.size());
            Masculino.set("Viud@", lstDatosViudoM.size());

            lstDatosCasadoF = FVif_2010.ObtenerDatosVictimaCasadosDadoSexo("F");
            lstDatosDivorciadoF = FVif_2010.ObtenerDatosVictimaDivorciadoDadoSexo("F");
            lstDatosNaF = FVif_2010.ObtenerDatosVictimaNaDadoSexo("F");
            lstDatosSolteroF = FVif_2010.ObtenerDatosVictimaSolteroDadoSexo("F");
            lstDatosUnionHechoF = FVif_2010.ObtenerDatosVictimaUnionHechoDadoSexo("F");
            lstDatosUnionLibreF = FVif_2010.ObtenerDatosVictimaUnionLibreDadoSexo("F");
            lstDatosViudoF = FVif_2010.ObtenerDatosVictimaViudoDadoSexo("F");

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
