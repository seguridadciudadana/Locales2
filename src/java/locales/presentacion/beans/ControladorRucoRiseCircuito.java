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
public class ControladorRucoRiseCircuito {

    private CartesianChartModel lineLocalesCircuitos;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoCircuito;
    private ArrayList<Locales> lstLocalesCircuito;
    private ArrayList<Locales> lstLocalesDadoCircuitoRUC;
    private ArrayList<Locales> lstLocalesDadoCircuitoRISE;
    private ArrayList<Locales> lstLocalesDadoCircuitoNinguno;

    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuito() {
        return lstLocalesDadoCircuito;
    }

    public void setLstLocalesDadoCircuito(ArrayList<Locales> lstLocalesDadoCircuito) {
        this.lstLocalesDadoCircuito = lstLocalesDadoCircuito;
    }

    public ArrayList<Locales> getLstLocalesCircuito() {
        return lstLocalesCircuito;
    }

    public void setLstLocalesCircuito(ArrayList<Locales> lstLocalesCircuito) {
        this.lstLocalesCircuito = lstLocalesCircuito;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoRUC() {
        return lstLocalesDadoCircuitoRUC;
    }

    public void setLstLocalesDadoCircuitoRUC(ArrayList<Locales> lstLocalesDadoCircuitoRUC) {
        this.lstLocalesDadoCircuitoRUC = lstLocalesDadoCircuitoRUC;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoRISE() {
        return lstLocalesDadoCircuitoRISE;
    }

    public void setLstLocalesDadoCircuitoRISE(ArrayList<Locales> lstLocalesDadoCircuitoRISE) {
        this.lstLocalesDadoCircuitoRISE = lstLocalesDadoCircuitoRISE;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoNinguno() {
        return lstLocalesDadoCircuitoNinguno;
    }

    public void setLstLocalesDadoCircuitoNinguno(ArrayList<Locales> lstLocalesDadoCircuitoNinguno) {
        this.lstLocalesDadoCircuitoNinguno = lstLocalesDadoCircuitoNinguno;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesCircuitos = graficaCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public ControladorRucoRiseCircuito() {
        this.reinit();
    }
    
     private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstLocalesCircuito = FLocales.ObtenerDatosCircuito();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("RUC");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoRUC = FLocales.ObtenerDatosDadoRucoRiseCircuito("RUC", lstLocalesCircuito.get(i).getCircuito());
                Ruc.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoRUC.size());
            }

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("RISE");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoRISE = FLocales.ObtenerDatosDadoRucoRiseCircuito("RISE", lstLocalesCircuito.get(i).getCircuito());
                Rise.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoRISE.size());
            }

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoNinguno = FLocales.ObtenerDatosDadoRucoRiseCircuito("Ninguno", lstLocalesCircuito.get(i).getCircuito());
                Ninguno.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoNinguno.size());
            }

            model.addSeries(Ruc);
            model.addSeries(Rise);
            model.addSeries(Ninguno);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }


}
