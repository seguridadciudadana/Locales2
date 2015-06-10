/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif2012;
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
public class ControladorContrastesDiaAgresion {

    /**
     * Creates a new instance of ControladorContrastesDiaAgresion
     */
    private ArrayList<Vif_2010> lstDatosLunes2010;
    private ArrayList<Vif_2010> lstDatosMartes2010;
    private ArrayList<Vif_2010> lstDatosMiercoles2010;
    private ArrayList<Vif_2010> lstDatosJueves2010;
    private ArrayList<Vif_2010> lstDatosViernes2010;
    private ArrayList<Vif_2010> lstDatosSabado2010;
    private ArrayList<Vif_2010> lstDatosDomingo2010;
    private ArrayList<Vif_2011> lstDatosLunes2011;
    private ArrayList<Vif_2011> lstDatosMartes2011;
    private ArrayList<Vif_2011> lstDatosMiercoles2011;
    private ArrayList<Vif_2011> lstDatosJueves2011;
    private ArrayList<Vif_2011> lstDatosViernes2011;
    private ArrayList<Vif_2011> lstDatosSabado2011;
    private ArrayList<Vif_2011> lstDatosDomingo2011;
    private ArrayList<Vif2012> lstDatosLunes2012;
    private ArrayList<Vif2012> lstDatosMartes2012;
    private ArrayList<Vif2012> lstDatosMiercoles2012;
    private ArrayList<Vif2012> lstDatosJueves2012;
    private ArrayList<Vif2012> lstDatosViernes2012;
    private ArrayList<Vif2012> lstDatosSabado2012;
    private ArrayList<Vif2012> lstDatosDomingo2012;
    private CartesianChartModel ModelContrastesDia;

    public ArrayList<Vif2012> getLstDatosLunes2012() {
        return lstDatosLunes2012;
    }

    public void setLstDatosLunes2012(ArrayList<Vif2012> lstDatosLunes2012) {
        this.lstDatosLunes2012 = lstDatosLunes2012;
    }

    public ArrayList<Vif2012> getLstDatosMartes2012() {
        return lstDatosMartes2012;
    }

    public void setLstDatosMartes2012(ArrayList<Vif2012> lstDatosMartes2012) {
        this.lstDatosMartes2012 = lstDatosMartes2012;
    }

    public ArrayList<Vif2012> getLstDatosMiercoles2012() {
        return lstDatosMiercoles2012;
    }

    public void setLstDatosMiercoles2012(ArrayList<Vif2012> lstDatosMiercoles2012) {
        this.lstDatosMiercoles2012 = lstDatosMiercoles2012;
    }

    public ArrayList<Vif2012> getLstDatosJueves2012() {
        return lstDatosJueves2012;
    }

    public void setLstDatosJueves2012(ArrayList<Vif2012> lstDatosJueves2012) {
        this.lstDatosJueves2012 = lstDatosJueves2012;
    }

    public ArrayList<Vif2012> getLstDatosViernes2012() {
        return lstDatosViernes2012;
    }

    public void setLstDatosViernes2012(ArrayList<Vif2012> lstDatosViernes2012) {
        this.lstDatosViernes2012 = lstDatosViernes2012;
    }

    public ArrayList<Vif2012> getLstDatosSabado2012() {
        return lstDatosSabado2012;
    }

    public void setLstDatosSabado2012(ArrayList<Vif2012> lstDatosSabado2012) {
        this.lstDatosSabado2012 = lstDatosSabado2012;
    }

    public ArrayList<Vif2012> getLstDatosDomingo2012() {
        return lstDatosDomingo2012;
    }

    public void setLstDatosDomingo2012(ArrayList<Vif2012> lstDatosDomingo2012) {
        this.lstDatosDomingo2012 = lstDatosDomingo2012;
    }

    public ArrayList<Vif_2010> getLstDatosLunes2010() {
        return lstDatosLunes2010;
    }

    public void setLstDatosLunes2010(ArrayList<Vif_2010> lstDatosLunes2010) {
        this.lstDatosLunes2010 = lstDatosLunes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMartes2010() {
        return lstDatosMartes2010;
    }

    public void setLstDatosMartes2010(ArrayList<Vif_2010> lstDatosMartes2010) {
        this.lstDatosMartes2010 = lstDatosMartes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles2010() {
        return lstDatosMiercoles2010;
    }

    public void setLstDatosMiercoles2010(ArrayList<Vif_2010> lstDatosMiercoles2010) {
        this.lstDatosMiercoles2010 = lstDatosMiercoles2010;
    }

    public ArrayList<Vif_2010> getLstDatosJueves2010() {
        return lstDatosJueves2010;
    }

    public void setLstDatosJueves2010(ArrayList<Vif_2010> lstDatosJueves2010) {
        this.lstDatosJueves2010 = lstDatosJueves2010;
    }

    public ArrayList<Vif_2010> getLstDatosViernes2010() {
        return lstDatosViernes2010;
    }

    public void setLstDatosViernes2010(ArrayList<Vif_2010> lstDatosViernes2010) {
        this.lstDatosViernes2010 = lstDatosViernes2010;
    }

    public ArrayList<Vif_2010> getLstDatosSabado2010() {
        return lstDatosSabado2010;
    }

    public void setLstDatosSabado2010(ArrayList<Vif_2010> lstDatosSabado2010) {
        this.lstDatosSabado2010 = lstDatosSabado2010;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo2010() {
        return lstDatosDomingo2010;
    }

    public void setLstDatosDomingo2010(ArrayList<Vif_2010> lstDatosDomingo2010) {
        this.lstDatosDomingo2010 = lstDatosDomingo2010;
    }

    public ArrayList<Vif_2011> getLstDatosLunes2011() {
        return lstDatosLunes2011;
    }

    public void setLstDatosLunes2011(ArrayList<Vif_2011> lstDatosLunes2011) {
        this.lstDatosLunes2011 = lstDatosLunes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMartes2011() {
        return lstDatosMartes2011;
    }

    public void setLstDatosMartes2011(ArrayList<Vif_2011> lstDatosMartes2011) {
        this.lstDatosMartes2011 = lstDatosMartes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles2011() {
        return lstDatosMiercoles2011;
    }

    public void setLstDatosMiercoles2011(ArrayList<Vif_2011> lstDatosMiercoles2011) {
        this.lstDatosMiercoles2011 = lstDatosMiercoles2011;
    }

    public ArrayList<Vif_2011> getLstDatosJueves2011() {
        return lstDatosJueves2011;
    }

    public void setLstDatosJueves2011(ArrayList<Vif_2011> lstDatosJueves2011) {
        this.lstDatosJueves2011 = lstDatosJueves2011;
    }

    public ArrayList<Vif_2011> getLstDatosViernes2011() {
        return lstDatosViernes2011;
    }

    public void setLstDatosViernes2011(ArrayList<Vif_2011> lstDatosViernes2011) {
        this.lstDatosViernes2011 = lstDatosViernes2011;
    }

    public ArrayList<Vif_2011> getLstDatosSabado2011() {
        return lstDatosSabado2011;
    }

    public void setLstDatosSabado2011(ArrayList<Vif_2011> lstDatosSabado2011) {
        this.lstDatosSabado2011 = lstDatosSabado2011;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo2011() {
        return lstDatosDomingo2011;
    }

    public void setLstDatosDomingo2011(ArrayList<Vif_2011> lstDatosDomingo2011) {
        this.lstDatosDomingo2011 = lstDatosDomingo2011;
    }

    public CartesianChartModel getModelContrastesDia() {
        return ModelContrastesDia;
    }

    public void setModelContrastesDia(CartesianChartModel ModelContrastesDia) {
        this.ModelContrastesDia = ModelContrastesDia;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        ModelContrastesDia = initGraficoContrastesDias();

    }

    private void reinit() {
        this.lstDatosLunes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMartes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMiercoles2010 = new ArrayList<Vif_2010>();
        this.lstDatosJueves2010 = new ArrayList<Vif_2010>();
        this.lstDatosViernes2010 = new ArrayList<Vif_2010>();
        this.lstDatosSabado2010 = new ArrayList<Vif_2010>();
        this.lstDatosDomingo2010 = new ArrayList<Vif_2010>();
        this.lstDatosLunes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMartes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMiercoles2011 = new ArrayList<Vif_2011>();
        this.lstDatosJueves2011 = new ArrayList<Vif_2011>();
        this.lstDatosViernes2011 = new ArrayList<Vif_2011>();
        this.lstDatosSabado2011 = new ArrayList<Vif_2011>();
        this.lstDatosDomingo2011 = new ArrayList<Vif_2011>();
        this.lstDatosLunes2012 = new ArrayList<Vif2012>();
        this.lstDatosMartes2012 = new ArrayList<Vif2012>();
        this.lstDatosMiercoles2012 = new ArrayList<Vif2012>();
        this.lstDatosJueves2012 = new ArrayList<Vif2012>();
        this.lstDatosViernes2012 = new ArrayList<Vif2012>();
        this.lstDatosSabado2012 = new ArrayList<Vif2012>();
        this.lstDatosDomingo2012 = new ArrayList<Vif2012>();
        this.init();

    }

    private CartesianChartModel initGraficoContrastesDias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(0);
            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(1);
            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(2);
            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(3);
            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(4);
            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(5);
            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion(6);
            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(0);
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(1);
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(2);
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(3);
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(4);
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(5);
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion(6);
            /*lstDatosLunes2012 = FVif2012.ObtenerDatosDadoDiaAgresion(1);
             lstDatosMartes2012 = FVif2012.ObtenerDatosDadoDiaAgresion(2);
             lstDatosMiercoles2012 = FVif2012.ObtenerDatosDadoDiaAgresion(3);
             lstDatosJueves2012 = FVif2012.ObtenerDatosDadoDiaAgresion(4);
             lstDatosViernes2012 = FVif2012.ObtenerDatosDadoDiaAgresion(5);
             lstDatosSabado2012 = FVif2012.ObtenerDatosDadoDiaAgresion(6);
             lstDatosDomingo2012 = FVif2012.ObtenerDatosDadoDiaAgresion(0);*/
            lstDatosLunes2012 = FVif2012.ObtenerDatosDiaDenuncia(0);
            lstDatosMartes2012 = FVif2012.ObtenerDatosDiaDenuncia(1);
            lstDatosMiercoles2012 = FVif2012.ObtenerDatosDiaDenuncia(2);
            lstDatosJueves2012 = FVif2012.ObtenerDatosDiaDenuncia(3);
            lstDatosViernes2012 = FVif2012.ObtenerDatosDiaDenuncia(4);
            lstDatosSabado2012 = FVif2012.ObtenerDatosDiaDenuncia(5);
            lstDatosDomingo2012 = FVif2012.ObtenerDatosDiaDenuncia(6);

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos del 2010");
            Vif_2010.set("Lunes", lstDatosLunes2010.size());
            Vif_2010.set("Martes", lstDatosMartes2010.size());
            Vif_2010.set("Miercoles", lstDatosMiercoles2010.size());
            Vif_2010.set("Jueves", lstDatosJueves2010.size());
            Vif_2010.set("Viernes", lstDatosViernes2010.size());
            Vif_2010.set("Sabado", lstDatosSabado2010.size());
            Vif_2010.set("Domingo", lstDatosDomingo2010.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos del 2011");
            Vif_2011.set("Lunes", lstDatosLunes2011.size());
            Vif_2011.set("Martes", lstDatosMartes2011.size());
            Vif_2011.set("Miercoles", lstDatosMiercoles2011.size());
            Vif_2011.set("Jueves", lstDatosJueves2011.size());
            Vif_2011.set("Viernes", lstDatosViernes2011.size());
            Vif_2011.set("Sabado", lstDatosSabado2011.size());
            Vif_2011.set("Domingo", lstDatosDomingo2011.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos del 2012");
            Vif_2012.set("Lunes", lstDatosLunes2012.size());
            Vif_2012.set("Martes", lstDatosMartes2012.size());
            Vif_2012.set("Miercoles", lstDatosMiercoles2012.size());
            Vif_2012.set("Jueves", lstDatosJueves2012.size());
            Vif_2012.set("Viernes", lstDatosViernes2012.size());
            Vif_2012.set("Sabado", lstDatosSabado2012.size());
            Vif_2012.set("Domingo", lstDatosDomingo2012.size());

            model.addSeries(Vif_2010);
            model.addSeries(Vif_2011);
            model.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public ControladorContrastesDiaAgresion() {
        this.reinit();
    }

}
