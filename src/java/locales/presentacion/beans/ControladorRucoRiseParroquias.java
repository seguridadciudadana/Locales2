/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorRucoRiseParroquias {

    private CartesianChartModel lineLocalesParroquias;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoParroquia;
    private ArrayList<Locales> lstLocalesParroquias;
    private ArrayList<Locales> lstLocalesDadoParroquiaRUC;
    private ArrayList<Locales> lstLocalesDadoParroquia50RUC;
    private ArrayList<Locales> lstLocalesDadoParroquia55RUC;
    private ArrayList<Locales> lstLocalesDadoParroquia61RUC;
    private ArrayList<Locales> lstLocalesDadoParroquiaRISE;
    private ArrayList<Locales> lstLocalesDadoParroquia50RISE;
    private ArrayList<Locales> lstLocalesDadoParroquia55RISE;
    private ArrayList<Locales> lstLocalesDadoParroquia61RISE;
    private ArrayList<Locales> lstLocalesDadoParroquiaNinguno;
    private ArrayList<Locales> lstLocalesDadoParroquia50Ninguno;
    private ArrayList<Locales> lstLocalesDadoParroquia55Ninguno;
    private ArrayList<Locales> lstLocalesDadoParroquia61Ninguno;

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia() {
        return lstLocalesDadoParroquia;
    }

    public void setLstLocalesDadoParroquia(ArrayList<Locales> lstLocalesDadoParroquia) {
        this.lstLocalesDadoParroquia = lstLocalesDadoParroquia;
    }

    public ArrayList<Locales> getLstLocalesParroquias() {
        return lstLocalesParroquias;
    }

    public void setLstLocalesParroquias(ArrayList<Locales> lstLocalesParroquias) {
        this.lstLocalesParroquias = lstLocalesParroquias;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaRUC() {
        return lstLocalesDadoParroquiaRUC;
    }

    public void setLstLocalesDadoParroquiaRUC(ArrayList<Locales> lstLocalesDadoParroquiaRUC) {
        this.lstLocalesDadoParroquiaRUC = lstLocalesDadoParroquiaRUC;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia50RUC() {
        return lstLocalesDadoParroquia50RUC;
    }

    public void setLstLocalesDadoParroquia50RUC(ArrayList<Locales> lstLocalesDadoParroquia50RUC) {
        this.lstLocalesDadoParroquia50RUC = lstLocalesDadoParroquia50RUC;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55RUC() {
        return lstLocalesDadoParroquia55RUC;
    }

    public void setLstLocalesDadoParroquia55RUC(ArrayList<Locales> lstLocalesDadoParroquia55RUC) {
        this.lstLocalesDadoParroquia55RUC = lstLocalesDadoParroquia55RUC;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61RUC() {
        return lstLocalesDadoParroquia61RUC;
    }

    public void setLstLocalesDadoParroquia61RUC(ArrayList<Locales> lstLocalesDadoParroquia61RUC) {
        this.lstLocalesDadoParroquia61RUC = lstLocalesDadoParroquia61RUC;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaRISE() {
        return lstLocalesDadoParroquiaRISE;
    }

    public void setLstLocalesDadoParroquiaRISE(ArrayList<Locales> lstLocalesDadoParroquiaRISE) {
        this.lstLocalesDadoParroquiaRISE = lstLocalesDadoParroquiaRISE;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia50RISE() {
        return lstLocalesDadoParroquia50RISE;
    }

    public void setLstLocalesDadoParroquia50RISE(ArrayList<Locales> lstLocalesDadoParroquia50RISE) {
        this.lstLocalesDadoParroquia50RISE = lstLocalesDadoParroquia50RISE;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55RISE() {
        return lstLocalesDadoParroquia55RISE;
    }

    public void setLstLocalesDadoParroquia55RISE(ArrayList<Locales> lstLocalesDadoParroquia55RISE) {
        this.lstLocalesDadoParroquia55RISE = lstLocalesDadoParroquia55RISE;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61RISE() {
        return lstLocalesDadoParroquia61RISE;
    }

    public void setLstLocalesDadoParroquia61RISE(ArrayList<Locales> lstLocalesDadoParroquia61RISE) {
        this.lstLocalesDadoParroquia61RISE = lstLocalesDadoParroquia61RISE;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaNinguno() {
        return lstLocalesDadoParroquiaNinguno;
    }

    public void setLstLocalesDadoParroquiaNinguno(ArrayList<Locales> lstLocalesDadoParroquiaNinguno) {
        this.lstLocalesDadoParroquiaNinguno = lstLocalesDadoParroquiaNinguno;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia50Ninguno() {
        return lstLocalesDadoParroquia50Ninguno;
    }

    public void setLstLocalesDadoParroquia50Ninguno(ArrayList<Locales> lstLocalesDadoParroquia50Ninguno) {
        this.lstLocalesDadoParroquia50Ninguno = lstLocalesDadoParroquia50Ninguno;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55Ninguno() {
        return lstLocalesDadoParroquia55Ninguno;
    }

    public void setLstLocalesDadoParroquia55Ninguno(ArrayList<Locales> lstLocalesDadoParroquia55Ninguno) {
        this.lstLocalesDadoParroquia55Ninguno = lstLocalesDadoParroquia55Ninguno;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61Ninguno() {
        return lstLocalesDadoParroquia61Ninguno;
    }

    public void setLstLocalesDadoParroquia61Ninguno(ArrayList<Locales> lstLocalesDadoParroquia61Ninguno) {
        this.lstLocalesDadoParroquia61Ninguno = lstLocalesDadoParroquia61Ninguno;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesParroquias = graficaParroquias();

    }

    private void reinit() {
        this.init();
    }

    public ControladorRucoRiseParroquias() {
        this.reinit();
    }

    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesParroquias = FLocales.ObtenerDatosParroquia();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("Presentan RUC");
            lstLocalesDadoParroquia50RUC = FLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 50);
            lstLocalesDadoParroquia50RUC = FLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 55);
            lstLocalesDadoParroquia50RUC = FLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 61);

            Ruc.set("Parroquia 55", lstLocalesDadoParroquia50RUC.size());
            Ruc.set("Parroquia 50", lstLocalesDadoParroquia50RUC.size());
            Ruc.set("Parroquia 61", lstLocalesDadoParroquia50RUC.size());

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("Presentan RISE");
            lstLocalesDadoParroquia50RISE = FLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 50);
            lstLocalesDadoParroquia55RISE = FLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 55);
            lstLocalesDadoParroquia61RISE = FLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 61);
            Rise.set("Parroquia 55", lstLocalesDadoParroquia55RISE.size());
            Rise.set("Parroquia 50", lstLocalesDadoParroquia50RISE.size());
            Rise.set("Parroquia 61", lstLocalesDadoParroquia61RISE.size());

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            lstLocalesDadoParroquia50Ninguno = FLocales.ObtenerDatosDadoRucoRiseParroquias("Ninguno", 50);
            lstLocalesDadoParroquia55Ninguno = FLocales.ObtenerDatosDadoRucoRiseParroquias("Ninguno", 55);
            lstLocalesDadoParroquia61Ninguno = FLocales.ObtenerDatosDadoRucoRiseParroquias("Ninguno", 61);
            Ninguno.set("Parroquia 55", lstLocalesDadoParroquia55Ninguno.size());
            Ninguno.set("Parroquia 50", lstLocalesDadoParroquia50Ninguno.size());
            Ninguno.set("Parroquia 61", lstLocalesDadoParroquia61Ninguno.size());

            model.addSeries(Ruc);
            model.addSeries(Rise);
            model.addSeries(Ninguno);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
