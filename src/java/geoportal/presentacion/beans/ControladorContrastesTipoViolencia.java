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
    private ArrayList<Vif_2011> lstDatosFisica_2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologica_2011;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosFisicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosPsicologica_2011;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexual_2011;
    private ArrayList<Vif_2011> lstDatosSexual_2011;
    private ArrayList<Vif_2012> lstDatosSexual_2012;
    private ArrayList<Vif_2010> lstDatosSexual_2010;
    private ArrayList<Vif_2012> lstDatosFisica_2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologica_2012;
    private ArrayList<Vif_2012> lstDatosFisicaPsicologicaSexual_2012;
    private ArrayList<Vif_2012> lstDatosFisicaSexual_2012;
    private ArrayList<Vif_2012> lstDatosPsicologica_2012;
    private ArrayList<Vif_2012> lstDatosPsicologicaSexual_2012;

    private ArrayList<Vif_2010> lstDatosFisica_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosFisicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexual_2010;

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

}
