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
public class DenunciasPjControladorRangoEdadAgresor {

    /**
     * Creates a new instance of DenunciasPjControladorRangoEdadAgresor
     */
    private CartesianChartModel rangoEdadAgresorGrafico2014;
    private CartesianChartModel rangoEdadAgresorGrafico2015;
    private ArrayList<DenunciasPj> lstDatosRangoEdadAgresor;
    private ArrayList<DenunciasPj> lstDatosDadoAnioRangoEdadAgresor;

    public CartesianChartModel getRangoEdadAgresorGrafico2014() {
        return rangoEdadAgresorGrafico2014;
    }

    public void setRangoEdadAgresorGrafico2014(CartesianChartModel rangoEdadAgresorGrafico2014) {
        this.rangoEdadAgresorGrafico2014 = rangoEdadAgresorGrafico2014;
    }

    public CartesianChartModel getRangoEdadAgresorGrafico2015() {
        return rangoEdadAgresorGrafico2015;
    }

    public void setRangoEdadAgresorGrafico2015(CartesianChartModel rangoEdadAgresorGrafico2015) {
        this.rangoEdadAgresorGrafico2015 = rangoEdadAgresorGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosRangoEdadAgresor() {
        return lstDatosRangoEdadAgresor;
    }

    public void setLstDatosRangoEdadAgresor(ArrayList<DenunciasPj> lstDatosRangoEdadAgresor) {
        this.lstDatosRangoEdadAgresor = lstDatosRangoEdadAgresor;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioRangoEdadAgresor() {
        return lstDatosDadoAnioRangoEdadAgresor;
    }

    public void setLstDatosDadoAnioRangoEdadAgresor(ArrayList<DenunciasPj> lstDatosDadoAnioRangoEdadAgresor) {
        this.lstDatosDadoAnioRangoEdadAgresor = lstDatosDadoAnioRangoEdadAgresor;
    }

    public DenunciasPjControladorRangoEdadAgresor() {
        reinit();
    }
    
    public void graficar() {
        rangoEdadAgresorGrafico2014 = initCategoryRangoEdadAgresor2014();
        rangoEdadAgresorGrafico2015 = initCategoryRangoEdadAgresor2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosRangoEdadAgresor = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryRangoEdadAgresor2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoEdadAgresor = FDenunciasPj.ObtenerDatosRangoEdadAgresor();
            ChartSeries rango = new ChartSeries();
           rango.setLabel("Rango de Edad");
            for (DenunciasPj lstDatosP1 : lstDatosRangoEdadAgresor) {
                lstDatosDadoAnioRangoEdadAgresor = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoEdadAgresor(2014, lstDatosP1.getRango_edad_agresor());
                rango.set(lstDatosP1.getRango_edad_agresor(), lstDatosDadoAnioRangoEdadAgresor.size());
            }
            model.addSeries(rango);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel initCategoryRangoEdadAgresor2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoEdadAgresor = FDenunciasPj.ObtenerDatosRangoEdadAgresor();
            ChartSeries rango = new ChartSeries();
           rango.setLabel("Rango de Edad");
            for (DenunciasPj lstDatosP1 : lstDatosRangoEdadAgresor) {
                lstDatosDadoAnioRangoEdadAgresor = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoEdadAgresor(2015, lstDatosP1.getRango_edad_agresor());
                rango.set(lstDatosP1.getRango_edad_agresor(), lstDatosDadoAnioRangoEdadAgresor.size());
            }
            model.addSeries(rango);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
