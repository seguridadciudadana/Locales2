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
public class ControladorBarrios {

    /**
     * Creates a new instance of ControladorBarrios
     */
    private CartesianChartModel lineLocalesParroquias;
    private CartesianChartModel lineLocalesParroquias2;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoParroquia;
    private ArrayList<Locales> lstLocalesParroquias;
    private ArrayList<Locales> lstLocalesParroquia50;
    private ArrayList<Locales> lstLocalesParroquia55;
    private ArrayList<Locales> lstLocalesParroquia61;

    public CartesianChartModel getLineLocalesParroquias2() {
        return lineLocalesParroquias2;
    }

    public void setLineLocalesParroquias2(CartesianChartModel lineLocalesParroquias2) {
        this.lineLocalesParroquias2 = lineLocalesParroquias2;
    }

    public ArrayList<Locales> getLstLocalesParroquia50() {
        return lstLocalesParroquia50;
    }

    public void setLstLocalesParroquia50(ArrayList<Locales> lstLocalesParroquia50) {
        this.lstLocalesParroquia50 = lstLocalesParroquia50;
    }

    public ArrayList<Locales> getLstLocalesParroquia55() {
        return lstLocalesParroquia55;
    }

    public void setLstLocalesParroquia55(ArrayList<Locales> lstLocalesParroquia55) {
        this.lstLocalesParroquia55 = lstLocalesParroquia55;
    }

    public ArrayList<Locales> getLstLocalesParroquia61() {
        return lstLocalesParroquia61;
    }

    public void setLstLocalesParroquia61(ArrayList<Locales> lstLocalesParroquia61) {
        this.lstLocalesParroquia61 = lstLocalesParroquia61;
    }

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

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesParroquias = graficaParroquias();
        this.lineLocalesParroquias2=graficaParroquias2();
    }

    private void reinit() {
        this.init();
    }

    public ControladorBarrios() {
        this.reinit();
    }

    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesParroquias = FLocales.ObtenerDatosParroquia();
            ChartSeries Parroquias = new ChartSeries();
            Parroquias.setLabel("Parroquias");
            for (int i = 0; i < lstLocalesParroquias.size(); i++) {
                lstLocalesDadoParroquia = FLocales.ObtenerDatosDadoParroquia(lstLocalesParroquias.get(i).getParroquia());
                Parroquias.set(lstLocalesParroquias.get(i).getParroquia(), lstLocalesDadoParroquia.size());
            }
            model.addSeries(Parroquias);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficaParroquias2() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstLocalesParroquia50 = FLocales.ObtenerDatosDadoParroquia(50);
            lstLocalesParroquia55 = FLocales.ObtenerDatosDadoParroquia(55);
            lstLocalesParroquia61 = FLocales.ObtenerDatosDadoParroquia(61);

            ChartSeries parroquia = new ChartSeries();
            parroquia.setLabel("Parroquias");
            parroquia.set("Parroquia 50", lstLocalesParroquia50.size());
            parroquia.set("Parroquia 55", lstLocalesParroquia55.size());
            parroquia.set("Parroquia 61", lstLocalesParroquia61.size());

            model1.addSeries(parroquia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

}
