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
import recursos.Distancia;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorRangosDistancias {

    /**
     * Creates a new instance of ControladorRangosDistancias
     */
    private ArrayList<String> lstDistancias;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstDadoRango;
    private CartesianChartModel lineLOcales;

    public ArrayList<String> getLstDistancias() {
        return lstDistancias;
    }

    public void setLstDistancias(ArrayList<String> lstDistancias) {
        this.lstDistancias = lstDistancias;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstDadoRango() {
        return lstDadoRango;
    }

    public void setLstDadoRango(ArrayList<Locales> lstDadoRango) {
        this.lstDadoRango = lstDadoRango;
    }

    public CartesianChartModel getLineLOcales() {
        return lineLOcales;
    }

    public void setLineLOcales(CartesianChartModel lineLOcales) {
        this.lineLOcales = lineLOcales;
    }

    @PostConstruct
    private void graficar() {
        this.lineLOcales = graficaDistancias();

    }

    public ControladorRangosDistancias() {
        this.graficar();
    }

    private CartesianChartModel graficaDistancias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDistancias = Distancia.obtenerDistancias();
            lstLocales = FLocales.ObtenerDatos();
            ChartSeries distancias = new ChartSeries();
            distancias.setLabel("Distancias");
            for (int i = 0; i < lstDistancias.size(); i++) {
                for (int j = 0; j < lstLocales.size(); j++) {

                    System.out.println(lstDistancias.get(i));
                    lstDadoRango = FLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(i));
                    System.out.println(FLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(i)));
                    distancias.set(lstDistancias.get(i), lstDadoRango.size());
                }
            }
            model.addSeries(distancias);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

}
