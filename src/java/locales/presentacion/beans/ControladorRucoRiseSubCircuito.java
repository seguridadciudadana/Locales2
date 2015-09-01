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
public class ControladorRucoRiseSubCircuito {

    /**
     * Creates a new instance of ControladorRucoRiseSubCircuito
     */
    private CartesianChartModel lineLocalesSubCircuitos;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoSubCircuito;
    private ArrayList<Locales> lstLocalesSubCircuito;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoRUC;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoRISE;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoNinguno;

    public CartesianChartModel getLineLocalesSubCircuitos() {
        return lineLocalesSubCircuitos;
    }

    public void setLineLocalesSubCircuitos(CartesianChartModel lineLocalesSubCircuitos) {
        this.lineLocalesSubCircuitos = lineLocalesSubCircuitos;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuito() {
        return lstLocalesDadoSubCircuito;
    }

    public void setLstLocalesDadoSubCircuito(ArrayList<Locales> lstLocalesDadoSubCircuito) {
        this.lstLocalesDadoSubCircuito = lstLocalesDadoSubCircuito;
    }

    public ArrayList<Locales> getLstLocalesSubCircuito() {
        return lstLocalesSubCircuito;
    }

    public void setLstLocalesSubCircuito(ArrayList<Locales> lstLocalesSubCircuito) {
        this.lstLocalesSubCircuito = lstLocalesSubCircuito;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoRUC() {
        return lstLocalesDadoSubCircuitoRUC;
    }

    public void setLstLocalesDadoSubCircuitoRUC(ArrayList<Locales> lstLocalesDadoSubCircuitoRUC) {
        this.lstLocalesDadoSubCircuitoRUC = lstLocalesDadoSubCircuitoRUC;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoRISE() {
        return lstLocalesDadoSubCircuitoRISE;
    }

    public void setLstLocalesDadoSubCircuitoRISE(ArrayList<Locales> lstLocalesDadoSubCircuitoRISE) {
        this.lstLocalesDadoSubCircuitoRISE = lstLocalesDadoSubCircuitoRISE;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoNinguno() {
        return lstLocalesDadoSubCircuitoNinguno;
    }

    public void setLstLocalesDadoSubCircuitoNinguno(ArrayList<Locales> lstLocalesDadoSubCircuitoNinguno) {
        this.lstLocalesDadoSubCircuitoNinguno = lstLocalesDadoSubCircuitoNinguno;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesSubCircuitos = graficaSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public ControladorRucoRiseSubCircuito() {
        this.reinit();
    }
    
     private CartesianChartModel graficaSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstLocalesSubCircuito = FLocales.ObtenerDatosSubCircuito();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("RUC");
            for (Locales lstLocalesSubCircuito1 : lstLocalesSubCircuito) {
                lstLocalesDadoSubCircuitoRUC = FLocales.ObtenerDatosDadoRucoRiseSubcircuito("RUC", lstLocalesSubCircuito1.getSubcircuito());
                Ruc.set(lstLocalesSubCircuito1.getSubcircuito(), lstLocalesDadoSubCircuitoRUC.size());
            }

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("RISE");
            for (Locales lstLocalesSubCircuito1 : lstLocalesSubCircuito) {
                lstLocalesDadoSubCircuitoRISE = FLocales.ObtenerDatosDadoRucoRiseSubcircuito("RISE", lstLocalesSubCircuito1.getSubcircuito());
                Rise.set(lstLocalesSubCircuito1.getSubcircuito(), lstLocalesDadoSubCircuitoRISE.size());
            }

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            for (Locales lstLocalesSubCircuito1 : lstLocalesSubCircuito) {
                lstLocalesDadoSubCircuitoNinguno = FLocales.ObtenerDatosDadoRucoRiseSubcircuito("Ninguno", lstLocalesSubCircuito1.getSubcircuito());
                Ninguno.set(lstLocalesSubCircuito1.getSubcircuito(), lstLocalesDadoSubCircuitoNinguno.size());
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
