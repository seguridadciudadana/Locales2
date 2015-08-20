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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorContrastesAgesionesPorSexo {

    /**
     * Creates a new instance of ControladorContrastesAgesionesPorSexo
     */
    //private CartesianChartModel gafico2010;
    private CartesianChartModel grafico2010;
    private CartesianChartModel grafico2011;
    private CartesianChartModel grafico2012;
    //private CartesianChartModel graficoContrastesHombres;
    //private CartesianChartModel graficoContrastesMujeres;

    private ArrayList<Vif_2010> lstDatosMujerHombre2010;
    private ArrayList<Vif_2010> lstDatosMujerMujer2010;
    private ArrayList<Vif_2010> lstDatosHombreHombre2010;
    private ArrayList<Vif_2010> lstDatosHombreMujer2010;

    private ArrayList<Vif_2011> lstDatosMujerHombre2011;
    private ArrayList<Vif_2011> lstDatosMujerMujer2011;
    private ArrayList<Vif_2011> lstDatosHombreHombre2011;
    private ArrayList<Vif_2011> lstDatosHombreMujer2011;

    private ArrayList<Vif_2012> lstDatosMujerHombre2012;
    private ArrayList<Vif_2012> lstDatosMujerMujer2012;
    private ArrayList<Vif_2012> lstDatosHombreHombre2012;
    private ArrayList<Vif_2012> lstDatosHombreMujer2012;

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

    public ArrayList<Vif_2010> getLstDatosMujerHombre2010() {
        return lstDatosMujerHombre2010;
    }

    public void setLstDatosMujerHombre2010(ArrayList<Vif_2010> lstDatosMujerHombre2010) {
        this.lstDatosMujerHombre2010 = lstDatosMujerHombre2010;
    }

    public ArrayList<Vif_2010> getLstDatosMujerMujer2010() {
        return lstDatosMujerMujer2010;
    }

    public void setLstDatosMujerMujer2010(ArrayList<Vif_2010> lstDatosMujerMujer2010) {
        this.lstDatosMujerMujer2010 = lstDatosMujerMujer2010;
    }

    public ArrayList<Vif_2010> getLstDatosHombreHombre2010() {
        return lstDatosHombreHombre2010;
    }

    public void setLstDatosHombreHombre2010(ArrayList<Vif_2010> lstDatosHombreHombre2010) {
        this.lstDatosHombreHombre2010 = lstDatosHombreHombre2010;
    }

    public ArrayList<Vif_2010> getLstDatosHombreMujer2010() {
        return lstDatosHombreMujer2010;
    }

    public void setLstDatosHombreMujer2010(ArrayList<Vif_2010> lstDatosHombreMujer2010) {
        this.lstDatosHombreMujer2010 = lstDatosHombreMujer2010;
    }

    public ArrayList<Vif_2011> getLstDatosMujerHombre2011() {
        return lstDatosMujerHombre2011;
    }

    public void setLstDatosMujerHombre2011(ArrayList<Vif_2011> lstDatosMujerHombre2011) {
        this.lstDatosMujerHombre2011 = lstDatosMujerHombre2011;
    }

    public ArrayList<Vif_2011> getLstDatosMujerMujer2011() {
        return lstDatosMujerMujer2011;
    }

    public void setLstDatosMujerMujer2011(ArrayList<Vif_2011> lstDatosMujerMujer2011) {
        this.lstDatosMujerMujer2011 = lstDatosMujerMujer2011;
    }

    public ArrayList<Vif_2011> getLstDatosHombreHombre2011() {
        return lstDatosHombreHombre2011;
    }

    public void setLstDatosHombreHombre2011(ArrayList<Vif_2011> lstDatosHombreHombre2011) {
        this.lstDatosHombreHombre2011 = lstDatosHombreHombre2011;
    }

    public ArrayList<Vif_2011> getLstDatosHombreMujer2011() {
        return lstDatosHombreMujer2011;
    }

    public void setLstDatosHombreMujer2011(ArrayList<Vif_2011> lstDatosHombreMujer2011) {
        this.lstDatosHombreMujer2011 = lstDatosHombreMujer2011;
    }

    public ArrayList<Vif_2012> getLstDatosMujerHombre2012() {
        return lstDatosMujerHombre2012;
    }

    public void setLstDatosMujerHombre2012(ArrayList<Vif_2012> lstDatosMujerHombre2012) {
        this.lstDatosMujerHombre2012 = lstDatosMujerHombre2012;
    }

    public ArrayList<Vif_2012> getLstDatosMujerMujer2012() {
        return lstDatosMujerMujer2012;
    }

    public void setLstDatosMujerMujer2012(ArrayList<Vif_2012> lstDatosMujerMujer2012) {
        this.lstDatosMujerMujer2012 = lstDatosMujerMujer2012;
    }

    public ArrayList<Vif_2012> getLstDatosHombreHombre2012() {
        return lstDatosHombreHombre2012;
    }

    public void setLstDatosHombreHombre2012(ArrayList<Vif_2012> lstDatosHombreHombre2012) {
        this.lstDatosHombreHombre2012 = lstDatosHombreHombre2012;
    }

    public ArrayList<Vif_2012> getLstDatosHombreMujer2012() {
        return lstDatosHombreMujer2012;
    }

    public void setLstDatosHombreMujer2012(ArrayList<Vif_2012> lstDatosHombreMujer2012) {
        this.lstDatosHombreMujer2012 = lstDatosHombreMujer2012;
    }

    @PostConstruct
    private void init() {
        graficar();
    }

    public void graficar() {
        //lineModel = initContrasteTipoViolencia();
        grafico2010 = AgresionesPorSexo2010();
//        grafico2011 = AgresionesPorSexo2011();
//        grafico2012 = AgresionesPorSexo2012();
        //graficoContrastesHombres = TipoViolenciaSexoHombres();
        //graficoContrastesMujeres = TipoViolenciaSexoMujeres();
    }

    public ControladorContrastesAgesionesPorSexo() {
        init();
    }

    private CartesianChartModel AgresionesPorSexo2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosMujerHombre2010 = FVif_2010.ObtenerDatosMujerHombre();
            lstDatosMujerMujer2010 = FVif_2010.ObtenerDatosMujerMujer();
            lstDatosHombreHombre2010 = FVif_2010.ObtenerDatosHombreHombre();
            lstDatosHombreMujer2010 = FVif_2010.ObtenerDatosHombreMujer();

            lstDatosMujerHombre2011 = FVif_2011.ObtenerDatosMujerHombre();
            lstDatosMujerMujer2011 = FVif_2011.ObtenerDatosMujerMujer();
            lstDatosHombreHombre2011 = FVif_2011.ObtenerDatosHombreHombre();
            lstDatosHombreMujer2011 = FVif_2011.ObtenerDatosHombreMujer();

            lstDatosMujerHombre2012 = FVif_2012.ObtenerDatosMujerHombre();
            lstDatosMujerMujer2012 = FVif_2012.ObtenerDatosMujerMujer();
            lstDatosHombreHombre2012 = FVif_2012.ObtenerDatosHombreHombre();
            lstDatosHombreMujer2012 = FVif_2012.ObtenerDatosHombreMujer();

            ChartSeries Agresiones2010 = new ChartSeries();
            Agresiones2010.setLabel("2010");
            Agresiones2010.set("Mujer --> Hombre", lstDatosMujerHombre2010.size());
            Agresiones2010.set("Mujer --> Mujer", lstDatosMujerMujer2010.size());
            Agresiones2010.set("Hombre --> Hombre", lstDatosHombreHombre2010.size());
            Agresiones2010.set("Hombre --> Mujer", lstDatosHombreMujer2010.size());

            ChartSeries Agresiones2011 = new ChartSeries();
            Agresiones2011.setLabel("2011");
            Agresiones2011.set("Mujer --> Hombre", lstDatosMujerHombre2011.size());
            Agresiones2011.set("Mujer --> Mujer", lstDatosMujerMujer2011.size());
            Agresiones2011.set("Hombre --> Hombre", lstDatosHombreHombre2011.size());
            Agresiones2011.set("Hombre --> Mujer", lstDatosHombreMujer2011.size());

            ChartSeries Agresiones2012 = new ChartSeries();
            Agresiones2012.setLabel("2012");
            Agresiones2012.set("Mujer --> Hombre", lstDatosMujerHombre2012.size());
            Agresiones2012.set("Mujer --> Mujer", lstDatosMujerMujer2012.size());
            Agresiones2012.set("Hombre --> Hombre", lstDatosHombreHombre2012.size());
            Agresiones2012.set("Hombre --> Mujer", lstDatosHombreMujer2012.size());

            model.addSeries(Agresiones2010);
            model.addSeries(Agresiones2011);
            model.addSeries(Agresiones2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
