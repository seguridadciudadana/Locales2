/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.DenunciasPj;
import geoportal.logica.funciones.FDenunciasPj;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class DenunciasPjContraladorCircuito {

    /**
     * Creates a new instance of DenunciasPjContraladorCircuito
     */
    private CartesianChartModel circuitoGrafico2014;
    private CartesianChartModel circuitoGrafico2015;
    private ArrayList<DenunciasPj> lstDatosCircuito;
    private ArrayList<DenunciasPj> lstDatosDadoAnioCircuito;
    private String Anio;
    private int AnioInteger;

    public CartesianChartModel getCircuitoGrafico2014() {
        return circuitoGrafico2014;
    }

    public void setCircuitoGrafico2014(CartesianChartModel circuitoGrafico2014) {
        this.circuitoGrafico2014 = circuitoGrafico2014;
    }

    public CartesianChartModel getCircuitoGrafico2015() {
        return circuitoGrafico2015;
    }

    public void setCircuitoGrafico2015(CartesianChartModel circuitoGrafico2015) {
        this.circuitoGrafico2015 = circuitoGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<DenunciasPj> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioCircuito() {
        return lstDatosDadoAnioCircuito;
    }

    public void setLstDatosDadoAnioCircuito(ArrayList<DenunciasPj> lstDatosDadoAnioCircuito) {
        this.lstDatosDadoAnioCircuito = lstDatosDadoAnioCircuito;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public int getAnioInteger() {
        return AnioInteger;
    }

    public void setAnioInteger(int AnioInteger) {
        this.AnioInteger = AnioInteger;
    }

    public DenunciasPjContraladorCircuito() {
        reinit();
    }

    public void graficar() {
        circuitoGrafico2014 = initCategoryCircuito2014();
        circuitoGrafico2015 = initCategoryCircuito2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCircuito = new ArrayList<DenunciasPj>();
        //this.lstDatosRelacion = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryCircuito2014() {

        CartesianChartModel model = new CartesianChartModel();
        try {
            AnioInteger = 2014;
            lstDatosCircuito = FDenunciasPj.ObtenerDatosCircuito();
            ChartSeries circuito = new ChartSeries();
            circuito.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCircuito) {
                lstDatosDadoAnioCircuito = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCircuito(AnioInteger, lstDatosP1.getCircuito());
                circuito.set(lstDatosP1.getCircuito(), lstDatosDadoAnioCircuito.size());
            }
            model.addSeries(circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryCircuito2015() {

        CartesianChartModel model = new CartesianChartModel();
        try {
            AnioInteger = 2015;
            lstDatosCircuito = FDenunciasPj.ObtenerDatosCircuito();
            ChartSeries circuito = new ChartSeries();
            circuito.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCircuito) {
                lstDatosDadoAnioCircuito = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCircuito(AnioInteger, lstDatosP1.getCircuito());
                circuito.set(lstDatosP1.getCircuito(), lstDatosDadoAnioCircuito.size());
            }
            model.addSeries(circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
