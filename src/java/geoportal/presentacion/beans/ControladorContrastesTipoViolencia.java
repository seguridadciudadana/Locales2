/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorContrastesTipoViolencia {

    /**
     * Creates a new instance of ControladorContrastesTipoViolencia
     */
    private CartesianChartModel lineModel;
    private CartesianChartModel grafico2010;
    private CartesianChartModel grafico2011;
    private CartesianChartModel grafico2012;
    private CartesianChartModel graficoContrastesHombres;
    private CartesianChartModel graficoContrastesMujeres;

    //---------------------------2011----------------------------------
    private ArrayList<Vif_2011> lstDatosFisica_2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologica_2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosFisicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosPsicologica_2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosSexual_2011;

    private ArrayList<Vif_2011> lstDatosFisicaM2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaM2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualM2011;
    private ArrayList<Vif_2011> lstDatosFisicaSexualM2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaM2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexualM2011;
    private ArrayList<Vif_2011> lstDatosSexualM2011;

    private ArrayList<Vif_2011> lstDatosFisicaF2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaF2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualF2011;
    private ArrayList<Vif_2011> lstDatosFisicaSexualF2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaF2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexualF2011;
    private ArrayList<Vif_2011> lstDatosSexualF2011;

    //----------------------------2011---------------------------------
    // ---------------------------2012--------------------------------
    private ArrayList<Vif_2012> lstDatosSexual_2012;
    private ArrayList<Vif_2012> lstDatosFisica_2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologica_2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexual_2012;
    private ArrayList<Vif_2012> lstDatosFisicaSexual_2012;
    private ArrayList<Vif_2012> lstDatosPsicologica_2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaSexual_2012;

    private ArrayList<Vif_2012> lstDatosSexualM2012;
    private ArrayList<Vif_2012> lstDatosFisicaM2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaM2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexualM2012;
    private ArrayList<Vif_2012> lstDatosFisicaSexualM2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaM2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaSexualM2012;

    private ArrayList<Vif_2012> lstDatosSexualF2012;
    private ArrayList<Vif_2012> lstDatosFisicaF2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaF2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexualF2012;
    private ArrayList<Vif_2012> lstDatosFisicaSexualF2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaF2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaSexualF2012;

    // ----------------------------2012--------------------------------
    //-----------------------------2010--------------------------------
    private ArrayList<Vif_2010> lstDatosFisica_2010;
    private ArrayList<Vif_2010> lstDatosSexual_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosFisicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexual_2010;

    private ArrayList<Vif_2010> lstDatosFisicaM2010;
    private ArrayList<Vif_2010> lstDatosSexualM2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaM2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualM2010;
    private ArrayList<Vif_2010> lstDatosFisicaSexualM2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaM2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexualM2010;

    private ArrayList<Vif_2010> lstDatosFisicaF2010;
    private ArrayList<Vif_2010> lstDatosSexualF2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaF2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualF2010;
    private ArrayList<Vif_2010> lstDatosFisicaSexualF2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaF2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexualF2010;

    //----------------------------2010------------------------------------
    public CartesianChartModel getGraficoContrastesHombres() {
        return graficoContrastesHombres;
    }

    public void setGraficoContrastesHombres(CartesianChartModel graficoContrastesHombres) {
        this.graficoContrastesHombres = graficoContrastesHombres;
    }

    public CartesianChartModel getGraficoContrastesMujeres() {
        return graficoContrastesMujeres;
    }

    public void setGraficoContrastesMujeres(CartesianChartModel graficoContrastesMujeres) {
        this.graficoContrastesMujeres = graficoContrastesMujeres;
    }

    public CartesianChartModel getGrafico2010() {
        return grafico2010;
    }

    public void setGrafico2010(CartesianChartModel grafico2010) {
        this.grafico2010 = grafico2010;
    }

    public CartesianChartModel getGrafico2011() {
        return grafico2011;
    }

    public void setGrafico2011(CartesianChartModel grafico2011) {
        this.grafico2011 = grafico2011;
    }

    public CartesianChartModel getGrafico2012() {
        return grafico2012;
    }

    public void setGrafico2012(CartesianChartModel grafico2012) {
        this.grafico2012 = grafico2012;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaM2011() {
        return lstDatosFisicaM2011;
    }

    public void setLstDatosFisicaM2011(ArrayList<Vif_2011> lstDatosFisicaM2011) {
        this.lstDatosFisicaM2011 = lstDatosFisicaM2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaM2011() {
        return lstDatosFisicaPsicologicaM2011;
    }

    public void setLstDatosFisicaPsicologicaM2011(ArrayList<Vif_2011> lstDatosFisicaPsicologicaM2011) {
        this.lstDatosFisicaPsicologicaM2011 = lstDatosFisicaPsicologicaM2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexualM2011() {
        return lstDatosFisicaPsicologicaSexualM2011;
    }

    public void setLstDatosFisicaPsicologicaSexualM2011(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualM2011) {
        this.lstDatosFisicaPsicologicaSexualM2011 = lstDatosFisicaPsicologicaSexualM2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexualM2011() {
        return lstDatosFisicaSexualM2011;
    }

    public void setLstDatosFisicaSexualM2011(ArrayList<Vif_2011> lstDatosFisicaSexualM2011) {
        this.lstDatosFisicaSexualM2011 = lstDatosFisicaSexualM2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaM2011() {
        return lstDatosPsicologicaM2011;
    }

    public void setLstDatosPsicologicaM2011(ArrayList<Vif_2011> lstDatosPsicologicaM2011) {
        this.lstDatosPsicologicaM2011 = lstDatosPsicologicaM2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexualM2011() {
        return lstDatosPsicologicaSexualM2011;
    }

    public void setLstDatosPsicologicaSexualM2011(ArrayList<Vif_2011> lstDatosPsicologicaSexualM2011) {
        this.lstDatosPsicologicaSexualM2011 = lstDatosPsicologicaSexualM2011;
    }

    public ArrayList<Vif_2011> getLstDatosSexualM2011() {
        return lstDatosSexualM2011;
    }

    public void setLstDatosSexualM2011(ArrayList<Vif_2011> lstDatosSexualM2011) {
        this.lstDatosSexualM2011 = lstDatosSexualM2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaF2011() {
        return lstDatosFisicaF2011;
    }

    public void setLstDatosFisicaF2011(ArrayList<Vif_2011> lstDatosFisicaF2011) {
        this.lstDatosFisicaF2011 = lstDatosFisicaF2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaF2011() {
        return lstDatosFisicaPsicologicaF2011;
    }

    public void setLstDatosFisicaPsicologicaF2011(ArrayList<Vif_2011> lstDatosFisicaPsicologicaF2011) {
        this.lstDatosFisicaPsicologicaF2011 = lstDatosFisicaPsicologicaF2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexualF2011() {
        return lstDatosFisicaPsicologicaSexualF2011;
    }

    public void setLstDatosFisicaPsicologicaSexualF2011(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualF2011) {
        this.lstDatosFisicaPsicologicaSexualF2011 = lstDatosFisicaPsicologicaSexualF2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexualF2011() {
        return lstDatosFisicaSexualF2011;
    }

    public void setLstDatosFisicaSexualF2011(ArrayList<Vif_2011> lstDatosFisicaSexualF2011) {
        this.lstDatosFisicaSexualF2011 = lstDatosFisicaSexualF2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaF2011() {
        return lstDatosPsicologicaF2011;
    }

    public void setLstDatosPsicologicaF2011(ArrayList<Vif_2011> lstDatosPsicologicaF2011) {
        this.lstDatosPsicologicaF2011 = lstDatosPsicologicaF2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexualF2011() {
        return lstDatosPsicologicaSexualF2011;
    }

    public void setLstDatosPsicologicaSexualF2011(ArrayList<Vif_2011> lstDatosPsicologicaSexualF2011) {
        this.lstDatosPsicologicaSexualF2011 = lstDatosPsicologicaSexualF2011;
    }

    public ArrayList<Vif_2011> getLstDatosSexualF2011() {
        return lstDatosSexualF2011;
    }

    public void setLstDatosSexualF2011(ArrayList<Vif_2011> lstDatosSexualF2011) {
        this.lstDatosSexualF2011 = lstDatosSexualF2011;
    }

    public ArrayList<Vif_2012> getLstDatosSexualM2012() {
        return lstDatosSexualM2012;
    }

    public void setLstDatosSexualM2012(ArrayList<Vif_2012> lstDatosSexualM2012) {
        this.lstDatosSexualM2012 = lstDatosSexualM2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaM2012() {
        return lstDatosFisicaM2012;
    }

    public void setLstDatosFisicaM2012(ArrayList<Vif_2012> lstDatosFisicaM2012) {
        this.lstDatosFisicaM2012 = lstDatosFisicaM2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologicaM2012() {
        return lstDatosFisicaPsicologicaM2012;
    }

    public void setLstDatosFisicaPsicologicaM2012(ArrayList<Vif_2012> lstDatosFisicaPsicologicaM2012) {
        this.lstDatosFisicaPsicologicaM2012 = lstDatosFisicaPsicologicaM2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologicaSexualM2012() {
        return lstDatosFisicaPsicologicaSexualM2012;
    }

    public void setLstDatosFisicaPsicologicaSexualM2012(ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexualM2012) {
        this.lstDatosFisicaPsicologicaSexualM2012 = lstDatosFisicaPsicologicaSexualM2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaSexualM2012() {
        return lstDatosFisicaSexualM2012;
    }

    public void setLstDatosFisicaSexualM2012(ArrayList<Vif_2012> lstDatosFisicaSexualM2012) {
        this.lstDatosFisicaSexualM2012 = lstDatosFisicaSexualM2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologicaM2012() {
        return lstDatosPsicologicaM2012;
    }

    public void setLstDatosPsicologicaM2012(ArrayList<Vif_2012> lstDatosPsicologicaM2012) {
        this.lstDatosPsicologicaM2012 = lstDatosPsicologicaM2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologicaSexualM2012() {
        return lstDatosPsicologicaSexualM2012;
    }

    public void setLstDatosPsicologicaSexualM2012(ArrayList<Vif_2012> lstDatosPsicologicaSexualM2012) {
        this.lstDatosPsicologicaSexualM2012 = lstDatosPsicologicaSexualM2012;
    }

    public ArrayList<Vif_2012> getLstDatosSexualF2012() {
        return lstDatosSexualF2012;
    }

    public void setLstDatosSexualF2012(ArrayList<Vif_2012> lstDatosSexualF2012) {
        this.lstDatosSexualF2012 = lstDatosSexualF2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaF2012() {
        return lstDatosFisicaF2012;
    }

    public void setLstDatosFisicaF2012(ArrayList<Vif_2012> lstDatosFisicaF2012) {
        this.lstDatosFisicaF2012 = lstDatosFisicaF2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologicaF2012() {
        return lstDatosFisicaPsicologicaF2012;
    }

    public void setLstDatosFisicaPsicologicaF2012(ArrayList<Vif_2012> lstDatosFisicaPsicologicaF2012) {
        this.lstDatosFisicaPsicologicaF2012 = lstDatosFisicaPsicologicaF2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologicaSexualF2012() {
        return lstDatosFisicaPsicologicaSexualF2012;
    }

    public void setLstDatosFisicaPsicologicaSexualF2012(ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexualF2012) {
        this.lstDatosFisicaPsicologicaSexualF2012 = lstDatosFisicaPsicologicaSexualF2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaSexualF2012() {
        return lstDatosFisicaSexualF2012;
    }

    public void setLstDatosFisicaSexualF2012(ArrayList<Vif_2012> lstDatosFisicaSexualF2012) {
        this.lstDatosFisicaSexualF2012 = lstDatosFisicaSexualF2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologicaF2012() {
        return lstDatosPsicologicaF2012;
    }

    public void setLstDatosPsicologicaF2012(ArrayList<Vif_2012> lstDatosPsicologicaF2012) {
        this.lstDatosPsicologicaF2012 = lstDatosPsicologicaF2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologicaSexualF2012() {
        return lstDatosPsicologicaSexualF2012;
    }

    public void setLstDatosPsicologicaSexualF2012(ArrayList<Vif_2012> lstDatosPsicologicaSexualF2012) {
        this.lstDatosPsicologicaSexualF2012 = lstDatosPsicologicaSexualF2012;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaM2010() {
        return lstDatosFisicaM2010;
    }

    public void setLstDatosFisicaM2010(ArrayList<Vif_2010> lstDatosFisicaM2010) {
        this.lstDatosFisicaM2010 = lstDatosFisicaM2010;
    }

    public ArrayList<Vif_2010> getLstDatosSexualM2010() {
        return lstDatosSexualM2010;
    }

    public void setLstDatosSexualM2010(ArrayList<Vif_2010> lstDatosSexualM2010) {
        this.lstDatosSexualM2010 = lstDatosSexualM2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaM2010() {
        return lstDatosFisicaPsicologicaM2010;
    }

    public void setLstDatosFisicaPsicologicaM2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaM2010) {
        this.lstDatosFisicaPsicologicaM2010 = lstDatosFisicaPsicologicaM2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexualM2010() {
        return lstDatosFisicaPsicologicaSexualM2010;
    }

    public void setLstDatosFisicaPsicologicaSexualM2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualM2010) {
        this.lstDatosFisicaPsicologicaSexualM2010 = lstDatosFisicaPsicologicaSexualM2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexualM2010() {
        return lstDatosFisicaSexualM2010;
    }

    public void setLstDatosFisicaSexualM2010(ArrayList<Vif_2010> lstDatosFisicaSexualM2010) {
        this.lstDatosFisicaSexualM2010 = lstDatosFisicaSexualM2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaM2010() {
        return lstDatosPsicologicaM2010;
    }

    public void setLstDatosPsicologicaM2010(ArrayList<Vif_2010> lstDatosPsicologicaM2010) {
        this.lstDatosPsicologicaM2010 = lstDatosPsicologicaM2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexualM2010() {
        return lstDatosPsicologicaSexualM2010;
    }

    public void setLstDatosPsicologicaSexualM2010(ArrayList<Vif_2010> lstDatosPsicologicaSexualM2010) {
        this.lstDatosPsicologicaSexualM2010 = lstDatosPsicologicaSexualM2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaF2010() {
        return lstDatosFisicaF2010;
    }

    public void setLstDatosFisicaF2010(ArrayList<Vif_2010> lstDatosFisicaF2010) {
        this.lstDatosFisicaF2010 = lstDatosFisicaF2010;
    }

    public ArrayList<Vif_2010> getLstDatosSexualF2010() {
        return lstDatosSexualF2010;
    }

    public void setLstDatosSexualF2010(ArrayList<Vif_2010> lstDatosSexualF2010) {
        this.lstDatosSexualF2010 = lstDatosSexualF2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaF2010() {
        return lstDatosFisicaPsicologicaF2010;
    }

    public void setLstDatosFisicaPsicologicaF2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaF2010) {
        this.lstDatosFisicaPsicologicaF2010 = lstDatosFisicaPsicologicaF2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexualF2010() {
        return lstDatosFisicaPsicologicaSexualF2010;
    }

    public void setLstDatosFisicaPsicologicaSexualF2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualF2010) {
        this.lstDatosFisicaPsicologicaSexualF2010 = lstDatosFisicaPsicologicaSexualF2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexualF2010() {
        return lstDatosFisicaSexualF2010;
    }

    public void setLstDatosFisicaSexualF2010(ArrayList<Vif_2010> lstDatosFisicaSexualF2010) {
        this.lstDatosFisicaSexualF2010 = lstDatosFisicaSexualF2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaF2010() {
        return lstDatosPsicologicaF2010;
    }

    public void setLstDatosPsicologicaF2010(ArrayList<Vif_2010> lstDatosPsicologicaF2010) {
        this.lstDatosPsicologicaF2010 = lstDatosPsicologicaF2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexualF2010() {
        return lstDatosPsicologicaSexualF2010;
    }

    public void setLstDatosPsicologicaSexualF2010(ArrayList<Vif_2010> lstDatosPsicologicaSexualF2010) {
        this.lstDatosPsicologicaSexualF2010 = lstDatosPsicologicaSexualF2010;
    }

    public ArrayList<Vif_2011> getLstDatosSexual_2011() {
        return lstDatosSexual_2011;
    }

    public void setLstDatosSexual_2011(ArrayList<Vif_2011> lstDatosSexual_2011) {
        this.lstDatosSexual_2011 = lstDatosSexual_2011;
    }

    public ArrayList<Vif_2012> getLstDatosSexual_2012() {
        return lstDatosSexual_2012;
    }

    public void setLstDatosSexual_2012(ArrayList<Vif_2012> lstDatosSexual_2012) {
        this.lstDatosSexual_2012 = lstDatosSexual_2012;
    }

    public ArrayList<Vif_2010> getLstDatosSexual_2010() {
        return lstDatosSexual_2010;
    }

    public void setLstDatosSexual_2010(ArrayList<Vif_2010> lstDatosSexual_2010) {
        this.lstDatosSexual_2010 = lstDatosSexual_2010;
    }

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public ArrayList<Vif_2011> getLstDatosFisica_2011() {
        return lstDatosFisica_2011;
    }

    public void setLstDatosFisica_2011(ArrayList<Vif_2011> lstDatosFisica_2011) {
        this.lstDatosFisica_2011 = lstDatosFisica_2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologica_2011() {
        return lstDatosFisicaPsicologica_2011;
    }

    public void setLstDatosFisicaPsicologica_2011(ArrayList<Vif_2011> lstDatosFisicaPsicologica_2011) {
        this.lstDatosFisicaPsicologica_2011 = lstDatosFisicaPsicologica_2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexual_2011() {
        return lstDatosFisicaPsicologicaSexual_2011;
    }

    public void setLstDatosFisicaPsicologicaSexual_2011(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexual_2011) {
        this.lstDatosFisicaPsicologicaSexual_2011 = lstDatosFisicaPsicologicaSexual_2011;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexual_2011() {
        return lstDatosFisicaSexual_2011;
    }

    public void setLstDatosFisicaSexual_2011(ArrayList<Vif_2011> lstDatosFisicaSexual_2011) {
        this.lstDatosFisicaSexual_2011 = lstDatosFisicaSexual_2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologica_2011() {
        return lstDatosPsicologica_2011;
    }

    public void setLstDatosPsicologica_2011(ArrayList<Vif_2011> lstDatosPsicologica_2011) {
        this.lstDatosPsicologica_2011 = lstDatosPsicologica_2011;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexual_2011() {
        return lstDatosPsicologicaSexual_2011;
    }

    public void setLstDatosPsicologicaSexual_2011(ArrayList<Vif_2011> lstDatosPsicologicaSexual_2011) {
        this.lstDatosPsicologicaSexual_2011 = lstDatosPsicologicaSexual_2011;
    }

    public ArrayList<Vif_2012> getLstDatosFisica_2012() {
        return lstDatosFisica_2012;
    }

    public void setLstDatosFisica_2012(ArrayList<Vif_2012> lstDatosFisica_2012) {
        this.lstDatosFisica_2012 = lstDatosFisica_2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologica_2012() {
        return lstDatosFisicaPsicologica_2012;
    }

    public void setLstDatosFisicaPsicologica_2012(ArrayList<Vif_2012> lstDatosFisicaPsicologica_2012) {
        this.lstDatosFisicaPsicologica_2012 = lstDatosFisicaPsicologica_2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaPsicologicaSexual_2012() {
        return lstDatosFisicaPsicologicaSexual_2012;
    }

    public void setLstDatosFisicaPsicologicaSexual_2012(ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexual_2012) {
        this.lstDatosFisicaPsicologicaSexual_2012 = lstDatosFisicaPsicologicaSexual_2012;
    }

    public ArrayList<Vif_2012> getLstDatosFisicaSexual_2012() {
        return lstDatosFisicaSexual_2012;
    }

    public void setLstDatosFisicaSexual_2012(ArrayList<Vif_2012> lstDatosFisicaSexual_2012) {
        this.lstDatosFisicaSexual_2012 = lstDatosFisicaSexual_2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologica_2012() {
        return lstDatosPsicologica_2012;
    }

    public void setLstDatosPsicologica_2012(ArrayList<Vif_2012> lstDatosPsicologica_2012) {
        this.lstDatosPsicologica_2012 = lstDatosPsicologica_2012;
    }

    public ArrayList<Vif_2012> getLstDatosPsicologicaSexual_2012() {
        return lstDatosPsicologicaSexual_2012;
    }

    public void setLstDatosPsicologicaSexual_2012(ArrayList<Vif_2012> lstDatosPsicologicaSexual_2012) {
        this.lstDatosPsicologicaSexual_2012 = lstDatosPsicologicaSexual_2012;
    }

    public ArrayList<Vif_2010> getLstDatosFisica_2010() {
        return lstDatosFisica_2010;
    }

    public void setLstDatosFisica_2010(ArrayList<Vif_2010> lstDatosFisica_2010) {
        this.lstDatosFisica_2010 = lstDatosFisica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologica_2010() {
        return lstDatosFisicaPsicologica_2010;
    }

    public void setLstDatosFisicaPsicologica_2010(ArrayList<Vif_2010> lstDatosFisicaPsicologica_2010) {
        this.lstDatosFisicaPsicologica_2010 = lstDatosFisicaPsicologica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexual_2010() {
        return lstDatosFisicaPsicologicaSexual_2010;
    }

    public void setLstDatosFisicaPsicologicaSexual_2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexual_2010) {
        this.lstDatosFisicaPsicologicaSexual_2010 = lstDatosFisicaPsicologicaSexual_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexual_2010() {
        return lstDatosFisicaSexual_2010;
    }

    public void setLstDatosFisicaSexual_2010(ArrayList<Vif_2010> lstDatosFisicaSexual_2010) {
        this.lstDatosFisicaSexual_2010 = lstDatosFisicaSexual_2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologica_2010() {
        return lstDatosPsicologica_2010;
    }

    public void setLstDatosPsicologica_2010(ArrayList<Vif_2010> lstDatosPsicologica_2010) {
        this.lstDatosPsicologica_2010 = lstDatosPsicologica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexual_2010() {
        return lstDatosPsicologicaSexual_2010;
    }

    public void setLstDatosPsicologicaSexual_2010(ArrayList<Vif_2010> lstDatosPsicologicaSexual_2010) {
        this.lstDatosPsicologicaSexual_2010 = lstDatosPsicologicaSexual_2010;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel = initContrasteTipoViolencia();
        grafico2010 = TipoViolenciaSexo2010();
        grafico2011 = TipoViolenciaSexo2011();
        grafico2012 = TipoViolenciaSexo2012();
        graficoContrastesHombres = TipoViolenciaSexoHombres();
        graficoContrastesMujeres = TipoViolenciaSexoMujeres();
    }

    public ControladorContrastesTipoViolencia() {
        this.reinit();

    }

    private void reinit() {

        this.init();

    }

    private CartesianChartModel initContrasteTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisica_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologica_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologica_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual_2011 = FVif_2011.ObtenerDatosDadoTipoViolencia("SEXUAL");

            lstDatosFisica_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologica_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologica_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual_2012 = FVif_2012.ObtenerDatosDadoTipoViolencia("SEXUAL");

            lstDatosFisica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("SEXUAL");

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos 2011");
            Vif_2011.set("FISICA", lstDatosFisica_2011.size());
            Vif_2011.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologica_2011.size());
            Vif_2011.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual_2011.size());
            Vif_2011.set("FISICA Y SEXUAL", lstDatosFisicaSexual_2011.size());
            Vif_2011.set("PSICOLOGICA", lstDatosPsicologica_2011.size());
            Vif_2011.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual_2011.size());
            Vif_2011.set("SEXUAL", lstDatosSexual_2011.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos 2012");
            Vif_2012.set("FISICA", lstDatosFisica_2012.size());
            Vif_2012.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologica_2012.size());
            Vif_2012.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual_2012.size());
            Vif_2012.set("FISICA Y SEXUAL", lstDatosFisicaSexual_2012.size());
            Vif_2012.set("PSICOLOGICA", lstDatosPsicologica_2012.size());
            Vif_2012.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual_2012.size());
            Vif_2012.set("SEXUAL", lstDatosSexual_2012.size());

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010");
            Vif_2010.set("FISICA", lstDatosFisica_2010.size());
            Vif_2010.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologica_2010.size());
            Vif_2010.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual_2010.size());
            Vif_2010.set("FISICA Y SEXUAL", lstDatosFisicaSexual_2010.size());
            Vif_2010.set("PSICOLOGICA", lstDatosPsicologica_2010.size());
            Vif_2010.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual_2010.size());
            Vif_2010.set("SEXUAL", lstDatosSexual_2010.size());

            model.addSeries(Vif_2010);
            model.addSeries(Vif_2011);
            model.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    //-----------------------------2010------------------------------
    private CartesianChartModel TipoViolenciaSexo2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosFisicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            lstDatosFisicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Maculino");
            Masculino.set("FISICA", lstDatosFisicaM2010.size());
            Masculino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2010.size());
            Masculino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2010.size());
            Masculino.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2010.size());
            Masculino.set("PSICOLOGICA", lstDatosPsicologicaM2010.size());
            Masculino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2010.size());
            Masculino.set("SEXUAL", lstDatosSexualM2010.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("FISICA", lstDatosFisicaF2010.size());
            Femenino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2010.size());
            Femenino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2010.size());
            Femenino.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2010.size());
            Femenino.set("PSICOLOGICA", lstDatosPsicologicaF2010.size());
            Femenino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2010.size());
            Femenino.set("SEXUAL", lstDatosSexualF2010.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    //-----------------------------2011------------------------------
    private CartesianChartModel TipoViolenciaSexo2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosFisicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            lstDatosFisicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Maculino");
            Masculino.set("FISICA", lstDatosFisicaM2011.size());
            Masculino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2011.size());
            Masculino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2011.size());
            Masculino.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2011.size());
            Masculino.set("PSICOLOGICA", lstDatosPsicologicaM2011.size());
            Masculino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2011.size());
            Masculino.set("SEXUAL", lstDatosSexualM2011.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("FISICA", lstDatosFisicaF2011.size());
            Femenino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2011.size());
            Femenino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2011.size());
            Femenino.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2011.size());
            Femenino.set("PSICOLOGICA", lstDatosPsicologicaF2011.size());
            Femenino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2011.size());
            Femenino.set("SEXUAL", lstDatosSexualF2011.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    //-----------------------------2012------------------------------
    private CartesianChartModel TipoViolenciaSexo2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosFisicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            lstDatosFisicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Maculino");
            Masculino.set("FISICA", lstDatosFisicaM2012.size());
            Masculino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2012.size());
            Masculino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2012.size());
            Masculino.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2012.size());
            Masculino.set("PSICOLOGICA", lstDatosPsicologicaM2012.size());
            Masculino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2012.size());
            Masculino.set("SEXUAL", lstDatosSexualM2012.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("FISICA", lstDatosFisicaF2012.size());
            Femenino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2012.size());
            Femenino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2012.size());
            Femenino.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2012.size());
            Femenino.set("PSICOLOGICA", lstDatosPsicologicaF2012.size());
            Femenino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2012.size());
            Femenino.set("SEXUAL", lstDatosSexualF2012.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    //---------------------------------------------------------------MASCULINO-------------------------------------------------------------
    private CartesianChartModel TipoViolenciaSexoHombres() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosFisicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            lstDatosFisicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            lstDatosFisicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "M");
            lstDatosFisicaPsicologicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "M");
            lstDatosFisicaPsicologicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "M");
            lstDatosFisicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "M");
            lstDatosPsicologicaM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "M");
            lstDatosPsicologicaSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "M");
            lstDatosSexualM2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "M");

            ChartSeries Masculino2010 = new ChartSeries();
            Masculino2010.setLabel("2010");
            Masculino2010.set("FISICA", lstDatosFisicaM2010.size());
            Masculino2010.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2010.size());
            Masculino2010.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2010.size());
            Masculino2010.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2010.size());
            Masculino2010.set("PSICOLOGICA", lstDatosPsicologicaM2010.size());
            Masculino2010.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2010.size());
            Masculino2010.set("SEXUAL", lstDatosSexualM2010.size());

            ChartSeries Masculino2011 = new ChartSeries();
            Masculino2011.setLabel("2011");
            Masculino2011.set("FISICA", lstDatosFisicaM2011.size());
            Masculino2011.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2011.size());
            Masculino2011.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2011.size());
            Masculino2011.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2011.size());
            Masculino2011.set("PSICOLOGICA", lstDatosPsicologicaM2011.size());
            Masculino2011.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2011.size());
            Masculino2011.set("SEXUAL", lstDatosSexualM2011.size());

            ChartSeries Masculino2012 = new ChartSeries();
            Masculino2012.setLabel("2012");
            Masculino2012.set("FISICA", lstDatosFisicaM2012.size());
            Masculino2012.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaM2012.size());
            Masculino2012.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM2012.size());
            Masculino2012.set("FISICA Y SEXUAL", lstDatosFisicaSexualM2012.size());
            Masculino2012.set("PSICOLOGICA", lstDatosPsicologicaM2012.size());
            Masculino2012.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM2012.size());
            Masculino2012.set("SEXUAL", lstDatosSexualM2012.size());

            model.addSeries(Masculino2010);
            model.addSeries(Masculino2011);
            model.addSeries(Masculino2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    //-------------------------------------------------------------------FEMENINO-----------------------------------------------
    private CartesianChartModel TipoViolenciaSexoMujeres() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosFisicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2010 = FVif_2010.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            lstDatosFisicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2011 = FVif_2011.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            lstDatosFisicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA", "F");
            lstDatosFisicaPsicologicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y PSICOLOGICA", "F");
            lstDatosFisicaPsicologicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA, PSICOLOGICA Y SEXUAL", "F");
            lstDatosFisicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("FISICA Y SEXUAL", "F");
            lstDatosPsicologicaF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA", "F");
            lstDatosPsicologicaSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("PSICOLOGICA Y SEXUAL", "F");
            lstDatosSexualF2012 = FVif_2012.ObtenerDatosDadoTipoViolenciaSexo("SEXUAL", "F");

            ChartSeries Femenino2010 = new ChartSeries();
            Femenino2010.setLabel("2010");
            Femenino2010.set("FISICA", lstDatosFisicaF2010.size());
            Femenino2010.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2010.size());
            Femenino2010.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2010.size());
            Femenino2010.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2010.size());
            Femenino2010.set("PSICOLOGICA", lstDatosPsicologicaF2010.size());
            Femenino2010.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2010.size());
            Femenino2010.set("SEXUAL", lstDatosSexualF2010.size());

            ChartSeries Femenino2011 = new ChartSeries();
            Femenino2011.setLabel("2011");
            Femenino2011.set("FISICA", lstDatosFisicaF2011.size());
            Femenino2011.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2011.size());
            Femenino2011.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2011.size());
            Femenino2011.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2011.size());
            Femenino2011.set("PSICOLOGICA", lstDatosPsicologicaF2011.size());
            Femenino2011.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2011.size());
            Femenino2011.set("SEXUAL", lstDatosSexualF2011.size());

            ChartSeries Femenino2012 = new ChartSeries();
            Femenino2012.setLabel("2012");
            Femenino2012.set("FISICA", lstDatosFisicaF2012.size());
            Femenino2012.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologicaF2012.size());
            Femenino2012.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF2012.size());
            Femenino2012.set("FISICA Y SEXUAL", lstDatosFisicaSexualF2012.size());
            Femenino2012.set("PSICOLOGICA", lstDatosPsicologicaF2012.size());
            Femenino2012.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF2012.size());
            Femenino2012.set("SEXUAL", lstDatosSexualF2012.size());

            model.addSeries(Femenino2010);
            model.addSeries(Femenino2011);
            model.addSeries(Femenino2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
