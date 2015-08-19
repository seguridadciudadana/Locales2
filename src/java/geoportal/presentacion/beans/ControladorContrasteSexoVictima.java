/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif2012;
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
public class ControladorContrasteSexoVictima {

    /**
     * Creates a new instance of ControladorContrasteSexoVictima
     */
    private ArrayList<Vif_2010> lstDatos2010;
    private ArrayList<Vif_2011> lstDatos2011;
    private ArrayList<Vif_2012> lstDatos2012;
    private ArrayList<Vif_2010> lstDatosHombres2010;
    private ArrayList<Vif_2010> lstDatosMujeres2010;

    private ArrayList<Vif_2011> lstDatosHombres2011;
    private ArrayList<Vif_2011> lstDatosMujeres2011;

    private ArrayList<Vif_2012> lstDatosHombres2012;
    private ArrayList<Vif_2012> lstDatosMujeres2012;

    private CartesianChartModel ModelContrastesDia;
    private CartesianChartModel lineHombres;
    private CartesianChartModel lineMujeres;
    private CartesianChartModel lineHombres2011;
    private CartesianChartModel lineMujeres2011;
    private CartesianChartModel lineHombres2012;
    private CartesianChartModel lineMujeres2012;
    // private CartesianChartModel lineDomingo;

    public CartesianChartModel getLineHombres2011() {
        return lineHombres2011;
    }

    public void setLineHombres2011(CartesianChartModel lineHombres2011) {
        this.lineHombres2011 = lineHombres2011;
    }

    public CartesianChartModel getLineMujeres2011() {
        return lineMujeres2011;
    }

    public void setLineMujeres2011(CartesianChartModel lineMujeres2011) {
        this.lineMujeres2011 = lineMujeres2011;
    }

    public CartesianChartModel getLineHombres2012() {
        return lineHombres2012;
    }

    public void setLineHombres2012(CartesianChartModel lineHombres2012) {
        this.lineHombres2012 = lineHombres2012;
    }

    public CartesianChartModel getLineMujeres2012() {
        return lineMujeres2012;
    }

    public void setLineMujeres2012(CartesianChartModel lineMujeres2012) {
        this.lineMujeres2012 = lineMujeres2012;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public ArrayList<Vif_2011> getLstDatos2011() {
        return lstDatos2011;
    }

    public void setLstDatos2011(ArrayList<Vif_2011> lstDatos2011) {
        this.lstDatos2011 = lstDatos2011;
    }

    public ArrayList<Vif_2012> getLstDatos2012() {
        return lstDatos2012;
    }

    public void setLstDatos2012(ArrayList<Vif_2012> lstDatos2012) {
        this.lstDatos2012 = lstDatos2012;
    }

    public ArrayList<Vif_2010> getLstDatosHombres2010() {
        return lstDatosHombres2010;
    }

    public void setLstDatosHombres2010(ArrayList<Vif_2010> lstDatosHombres2010) {
        this.lstDatosHombres2010 = lstDatosHombres2010;
    }

    public ArrayList<Vif_2010> getLstDatosMujeres2010() {
        return lstDatosMujeres2010;
    }

    public void setLstDatosMujeres2010(ArrayList<Vif_2010> lstDatosMujeres2010) {
        this.lstDatosMujeres2010 = lstDatosMujeres2010;
    }

    public ArrayList<Vif_2011> getLstDatosHombres2011() {
        return lstDatosHombres2011;
    }

    public void setLstDatosHombres2011(ArrayList<Vif_2011> lstDatosHombres2011) {
        this.lstDatosHombres2011 = lstDatosHombres2011;
    }

    public ArrayList<Vif_2011> getLstDatosMujeres2011() {
        return lstDatosMujeres2011;
    }

    public void setLstDatosMujeres2011(ArrayList<Vif_2011> lstDatosMujeres2011) {
        this.lstDatosMujeres2011 = lstDatosMujeres2011;
    }

    public ArrayList<Vif_2012> getLstDatosHombres2012() {
        return lstDatosHombres2012;
    }

    public void setLstDatosHombres2012(ArrayList<Vif_2012> lstDatosHombres2012) {
        this.lstDatosHombres2012 = lstDatosHombres2012;
    }

    public ArrayList<Vif_2012> getLstDatosMujeres2012() {
        return lstDatosMujeres2012;
    }

    public void setLstDatosMujeres2012(ArrayList<Vif_2012> lstDatosMujeres2012) {
        this.lstDatosMujeres2012 = lstDatosMujeres2012;
    }

    public CartesianChartModel getModelContrastesDia() {
        return ModelContrastesDia;
    }

    public void setModelContrastesDia(CartesianChartModel ModelContrastesDia) {
        this.ModelContrastesDia = ModelContrastesDia;
    }

    public CartesianChartModel getLineHombres() {
        return lineHombres;
    }

    public void setLineHombres(CartesianChartModel lineHombres) {
        this.lineHombres = lineHombres;
    }

    public CartesianChartModel getLineMujeres() {
        return lineMujeres;
    }

    public void setLineMujeres(CartesianChartModel lineMujeres) {
        this.lineMujeres = lineMujeres;
    }

    public ControladorContrasteSexoVictima() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        ModelContrastesDia = initGraficoContrastesDias();

//        lineHombres = initHombres();
//        lineMujeres = initMujeres();
//        lineHombres2011 = initHombres2011();
//        lineMujeres2011 = initMujeres2011();
//        lineHombres2012 = initHombres2012();
//        lineMujeres2012 = initMujeres2012();
//        lineDomingo = initDomingo();

    }

    private void reinit() {
        this.lstDatosHombres2010 = new ArrayList<Vif_2010>();
        this.lstDatosMujeres2010 = new ArrayList<Vif_2010>();
        this.lstDatosHombres2011 = new ArrayList<Vif_2011>();
        this.lstDatosMujeres2011 = new ArrayList<Vif_2011>();
        this.lstDatosHombres2012 = new ArrayList<Vif_2012>();
        this.lstDatosMujeres2012 = new ArrayList<Vif_2012>();

        this.init();

    }

    private CartesianChartModel initGraficoContrastesDias() {
        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosHombres2010 = FVif_2010.ObtenerDatosVictimaHombre();
            lstDatosMujeres2010 = FVif_2010.ObtenerDatosVictimaMujer();

            lstDatosHombres2011 = FVif_2011.ObtenerDatosVictimaHombre();
            lstDatosMujeres2011 = FVif_2011.ObtenerDatosVictimaMujer();

            lstDatosHombres2012 = FVif_2012.ObtenerDatosVictimaHombre();
            lstDatosMujeres2012 = FVif_2012.ObtenerDatosVictimaMujer();

            ChartSeries Hombres = new ChartSeries();
            Hombres.setLabel("Masculino");
            Hombres.set("2010", lstDatosHombres2010.size());
            Hombres.set("2011", lstDatosHombres2011.size());
            Hombres.set("2012", lstDatosHombres2012.size());

            ChartSeries Mujeres = new ChartSeries();
            Mujeres.setLabel("Femenino");
            Mujeres.set("2010", lstDatosMujeres2010.size());
            Mujeres.set("2011", lstDatosMujeres2011.size());
            Mujeres.set("2012", lstDatosMujeres2012.size());

            

            
            model.addSeries(Hombres);
            model.addSeries(Mujeres);
            

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
