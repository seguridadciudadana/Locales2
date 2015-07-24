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
public class ControladorActividadEconomica {

    /**
     * Creates a new instance of ControladorActividadEconomica
     */
    private ArrayList<Locales> lstLocales;
    private Locales LocalesSel;
    private ArrayList<Locales> lstTipoEstablecimiento;
    private ArrayList<Locales> lstDadoTipoEstablecimiento;
    private CartesianChartModel lineTipoEstablecimiento;

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public Locales getLocalesSel() {
        return LocalesSel;
    }

    public void setLocalesSel(Locales LocalesSel) {
        this.LocalesSel = LocalesSel;
    }

    public ArrayList<Locales> getLstTipoEstablecimiento() {
        return lstTipoEstablecimiento;
    }

    public void setLstTipoEstablecimiento(ArrayList<Locales> lstTipoEstablecimiento) {
        this.lstTipoEstablecimiento = lstTipoEstablecimiento;
    }

    public ArrayList<Locales> getLstDadoTipoEstablecimiento() {
        return lstDadoTipoEstablecimiento;
    }

    public void setLstDadoTipoEstablecimiento(ArrayList<Locales> lstDadoTipoEstablecimiento) {
        this.lstDadoTipoEstablecimiento = lstDadoTipoEstablecimiento;
    }

    public CartesianChartModel getLineTipoEstablecimiento() {
        return lineTipoEstablecimiento;
    }

    public void setLineTipoEstablecimiento(CartesianChartModel lineTipoEstablecimiento) {
        this.lineTipoEstablecimiento = lineTipoEstablecimiento;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineTipoEstablecimiento = graficaTipoEstablecimiento();
    }

    private void reinit() {
        this.obtenerDatosLocales();
        this.init();
    }

    public ControladorActividadEconomica() {
        this.reinit();
    }

    private CartesianChartModel graficaTipoEstablecimiento() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstTipoEstablecimiento = FLocales.ObtenerDatosEstadoEstablecimiento();
            ChartSeries Tipo = new ChartSeries();
            Tipo.setLabel("Tipo de Establecimiento");
            for (int i = 0; i < lstTipoEstablecimiento.size(); i++) {
                lstTipoEstablecimiento = FLocales.ObtenerDatosDadoTipoEstablecimiento(lstTipoEstablecimiento.get(i).getTipo_de_establecimiento());
                Tipo.set(lstTipoEstablecimiento.get(i).getTipo_de_establecimiento(), lstDadoTipoEstablecimiento.size());
            }
            model.addSeries(Tipo);

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
