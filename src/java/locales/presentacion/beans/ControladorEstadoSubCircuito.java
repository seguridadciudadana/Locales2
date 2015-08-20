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
public final class ControladorEstadoSubCircuito {

    /**
     * Creates a new instance of ControladorEstadoSubCircuito
     */
    private CartesianChartModel lineLocalesSubCircuitos;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoSubCircuito;
    private ArrayList<Locales> lstLocalesSubCircuito;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoAbierto;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoCerrado;
    private ArrayList<Locales> lstLocalesDadoSubCircuitoSinEspecificar;

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

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoAbierto() {
        return lstLocalesDadoSubCircuitoAbierto;
    }

    public void setLstLocalesDadoSubCircuitoAbierto(ArrayList<Locales> lstLocalesDadoSubCircuitoAbierto) {
        this.lstLocalesDadoSubCircuitoAbierto = lstLocalesDadoSubCircuitoAbierto;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoCerrado() {
        return lstLocalesDadoSubCircuitoCerrado;
    }

    public void setLstLocalesDadoSubCircuitoCerrado(ArrayList<Locales> lstLocalesDadoSubCircuitoCerrado) {
        this.lstLocalesDadoSubCircuitoCerrado = lstLocalesDadoSubCircuitoCerrado;
    }

    public ArrayList<Locales> getLstLocalesDadoSubCircuitoSinEspecificar() {
        return lstLocalesDadoSubCircuitoSinEspecificar;
    }

    public void setLstLocalesDadoSubCircuitoSinEspecificar(ArrayList<Locales> lstLocalesDadoSubCircuitoSinEspecificar) {
        this.lstLocalesDadoSubCircuitoSinEspecificar = lstLocalesDadoSubCircuitoSinEspecificar;
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

    public ControladorEstadoSubCircuito() {
        this.reinit();

    }

    private CartesianChartModel graficaSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesSubCircuito = FLocales.ObtenerDatosSubCircuito();
            ChartSeries Abiertos = new ChartSeries();
            Abiertos.setLabel("Abiertos");
            for (int i = 0; i < lstLocalesSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoAbierto = FLocales.ObtenerDatosDadoEstadoSubcircuito("ABIERTO", lstLocalesSubCircuito.get(i).getSubcircuito());
                Abiertos.set(lstLocalesSubCircuito.get(i).getSubcircuito(), lstLocalesDadoSubCircuitoAbierto.size());
            }

            ChartSeries Cerrados = new ChartSeries();
            Cerrados.setLabel("Cerrados");
            for (int i = 0; i < lstLocalesSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoCerrado = FLocales.ObtenerDatosDadoEstadoSubcircuito("CERRADO", lstLocalesSubCircuito.get(i).getSubcircuito());
                Cerrados.set(lstLocalesSubCircuito.get(i).getSubcircuito(), lstLocalesDadoSubCircuitoCerrado.size());
            }

            ChartSeries SinEspecificar = new ChartSeries();
            SinEspecificar.setLabel("Sin Especificar");
            for (int i = 0; i < lstLocalesSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoSinEspecificar = FLocales.ObtenerDatosDadoEstadoSubcircuito("SIN ESPECIFICAR", lstLocalesSubCircuito.get(i).getSubcircuito());
                SinEspecificar.set(lstLocalesSubCircuito.get(i).getSubcircuito(), lstLocalesDadoSubCircuitoSinEspecificar.size());
            }

            model.addSeries(Cerrados);
            model.addSeries(Abiertos);
            model.addSeries(SinEspecificar);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
