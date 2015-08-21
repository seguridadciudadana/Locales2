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
public class DenunciasPjControladorCasos {

    /**
     * Creates a new instance of DenunciasPjControladorCasos
     */
    private CartesianChartModel casoGrafico2014;
    private CartesianChartModel casoGrafico2015;
    private ArrayList<DenunciasPj> lstDatosCaso;
    private ArrayList<DenunciasPj> lstDatosDadoAnioCaso;
    //private String Anio;
    private int AnioInteger;

    public CartesianChartModel getCasoGrafico2014() {
        return casoGrafico2014;
    }

    public void setCasoGrafico2014(CartesianChartModel casoGrafico2014) {
        this.casoGrafico2014 = casoGrafico2014;
    }

    public CartesianChartModel getCasoGrafico2015() {
        return casoGrafico2015;
    }

    public void setCasoGrafico2015(CartesianChartModel casoGrafico2015) {
        this.casoGrafico2015 = casoGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosCaso() {
        return lstDatosCaso;
    }

    public void setLstDatosCaso(ArrayList<DenunciasPj> lstDatosCaso) {
        this.lstDatosCaso = lstDatosCaso;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioCaso() {
        return lstDatosDadoAnioCaso;
    }

    public void setLstDatosDadoAnioCaso(ArrayList<DenunciasPj> lstDatosDadoAnioCaso) {
        this.lstDatosDadoAnioCaso = lstDatosDadoAnioCaso;
    }

    public int getAnioInteger() {
        return AnioInteger;
    }

    public void setAnioInteger(int AnioInteger) {
        this.AnioInteger = AnioInteger;
    }
    
    
    public DenunciasPjControladorCasos() {
        reinit();
    }
    
    public void graficar() {
        casoGrafico2014 = initCategoryCaso2014();
        casoGrafico2015 = initCategoryCaso2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCaso = new ArrayList<DenunciasPj>();
        //this.lstDatosRelacion = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryCaso2014() {

        CartesianChartModel model = new CartesianChartModel();
        //AnioInteger = 2014;
        try {
            
            lstDatosCaso = FDenunciasPj.ObtenerDatosCaso();
            ChartSeries caso = new ChartSeries();
            caso.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCaso) {
                lstDatosDadoAnioCaso = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCaso(2014, lstDatosP1.getCaso());
                caso.set(lstDatosP1.getCaso(), lstDatosDadoAnioCaso.size());
            }
            model.addSeries(caso);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryCaso2015() {

        CartesianChartModel model = new CartesianChartModel();
        //AnioInteger = 2015;
        try {
            
            lstDatosCaso = FDenunciasPj.ObtenerDatosCaso();
            ChartSeries caso = new ChartSeries();
            caso.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCaso) {
                lstDatosDadoAnioCaso = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCaso(2015, lstDatosP1.getCaso());
                caso.set(lstDatosP1.getCaso(), lstDatosDadoAnioCaso.size());
            }
            model.addSeries(caso);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
