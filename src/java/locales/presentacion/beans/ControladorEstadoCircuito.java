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
public class ControladorEstadoCircuito {

    /**
     * Creates a new instance of ControladorEstadoCircuito
     */
    private CartesianChartModel lineLocalesCircuitos;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoCircuito;
    private ArrayList<Locales> lstLocalesCircuito;
    private ArrayList<Locales> lstLocalesDadoCircuitoAbierto;
    private ArrayList<Locales> lstLocalesDadoCircuitoCerrado;
    private ArrayList<Locales> lstLocalesDadoCircuitoSinEspecificar;

    public ArrayList<Locales> getLstLocalesDadoCircuitoAbierto() {
        return lstLocalesDadoCircuitoAbierto;
    }

    public void setLstLocalesDadoCircuitoAbierto(ArrayList<Locales> lstLocalesDadoCircuitoAbierto) {
        this.lstLocalesDadoCircuitoAbierto = lstLocalesDadoCircuitoAbierto;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoCerrado() {
        return lstLocalesDadoCircuitoCerrado;
    }

    public void setLstLocalesDadoCircuitoCerrado(ArrayList<Locales> lstLocalesDadoCircuitoCerrado) {
        this.lstLocalesDadoCircuitoCerrado = lstLocalesDadoCircuitoCerrado;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoSinEspecificar() {
        return lstLocalesDadoCircuitoSinEspecificar;
    }

    public void setLstLocalesDadoCircuitoSinEspecificar(ArrayList<Locales> lstLocalesDadoCircuitoSinEspecificar) {
        this.lstLocalesDadoCircuitoSinEspecificar = lstLocalesDadoCircuitoSinEspecificar;
    }

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

    public ControladorEstadoCircuito() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            //lstLocalesCircuito = FLocales.ObtenerDatosEstadoEstablecimiento();
            lstLocalesCircuito=FLocales.ObtenerDatosCircuito();
            ChartSeries Abiertos = new ChartSeries();
            Abiertos.setLabel("Abiertos");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                //lstLocalesDadoCircuito = FLocales.ObtenerDatosDadoCircuito(lstLocalesCircuito.get(i).getCircuito());
                lstLocalesDadoCircuitoAbierto=FLocales.ObtenerDatosDadoEstadoCircuito("ABIERTO", lstLocalesCircuito.get(i).getCircuito());
                Abiertos.set(lstLocalesCircuito.get(i).getCircuito(),lstLocalesDadoCircuitoAbierto.size());
            }
            
            ChartSeries Cerrados = new ChartSeries();
            Cerrados.setLabel("Cerrados");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                //lstLocalesDadoCircuito = FLocales.ObtenerDatosDadoCircuito(lstLocalesCircuito.get(i).getCircuito());
                lstLocalesDadoCircuitoCerrado=FLocales.ObtenerDatosDadoEstadoCircuito("CERRADO", lstLocalesCircuito.get(i).getCircuito());
                Cerrados.set(lstLocalesCircuito.get(i).getCircuito(),lstLocalesDadoCircuitoCerrado.size());
            }
            
            
            model.addSeries(Cerrados);
            model.addSeries(Abiertos);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
