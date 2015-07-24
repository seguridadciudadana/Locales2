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
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorLocalesCircuitos {

    /**
     * Creates a new instance of ControladorLocalesCircuitos
     */
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstCircuitos;
    private ArrayList<Locales> lstDadoCircuitos;
    private ArrayList<Locales> lstSubCircuitos;
    private ArrayList<Locales> lstDadoSubcircuitos;
    private CartesianChartModel lineModel_Circuito;
    private CartesianChartModel lineModel_Subcircuito;
    private Locales LocalesSel;

    public Locales getLocalesSel() {
        return LocalesSel;
    }

    public void setLocalesSel(Locales LocalesSel) {
        this.LocalesSel = LocalesSel;
    }

    public ArrayList<Locales> getLstDadoCircuitos() {
        return lstDadoCircuitos;
    }

    public void setLstDadoCircuitos(ArrayList<Locales> lstDadoCircuitos) {
        this.lstDadoCircuitos = lstDadoCircuitos;
    }

    public ArrayList<Locales> getLstDadoSubcircuitos() {
        return lstDadoSubcircuitos;
    }

    public void setLstDadoSubcircuitos(ArrayList<Locales> lstDadoSubcircuitos) {
        this.lstDadoSubcircuitos = lstDadoSubcircuitos;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Locales> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<Locales> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Locales> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public CartesianChartModel getLineModel_Circuito() {
        return lineModel_Circuito;
    }

    public void setLineModel_Circuito(CartesianChartModel lineModel_Circuito) {
        this.lineModel_Circuito = lineModel_Circuito;
    }

    public CartesianChartModel getLineModel_Subcircuito() {
        return lineModel_Subcircuito;
    }

    public void setLineModel_Subcircuito(CartesianChartModel lineModel_Subcircuito) {
        this.lineModel_Subcircuito = lineModel_Subcircuito;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel_Circuito = graficaCircuito();
        lineModel_Subcircuito = graficaSubCircuito();
    }

    private void reinit() {
        this.obtenerDatosLocales();
        this.init();
    }

    public ControladorLocalesCircuitos() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuitos = FLocales.ObtenerDatosCircuito();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitos = FLocales.ObtenerDatosDadoCircuito(lstCircuitos.get(i).getCircuito());
                Circuito.set(lstCircuitos.get(i).getCircuito(), lstDadoCircuitos.size());
            }
            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficaSubCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstSubCircuitos = FLocales.ObtenerDatosSubCircuito();
            ChartSeries Subcircuito = new ChartSeries();
            Subcircuito.setLabel("Subcircuito");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstDadoSubcircuitos = FLocales.ObtenerDatosDadoSubcircuito(lstSubCircuitos.get(i).getSubcircuito());
                Subcircuito.set(lstSubCircuitos.get(i).getSubcircuito(), lstDadoSubcircuitos.size());
            }
            model.addSeries(Subcircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void obtenerDatosLocales() {
        try {

            this.lstLocales = FLocales.ObtenerDatos();
            this.LocalesSel = lstLocales.get(0);
            System.out.println(lstLocales.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosLocales dice: " + e.getMessage());
            System.out.println("public void obtenerDatosLocales dice: " + e.getMessage());
        }

    }
}
