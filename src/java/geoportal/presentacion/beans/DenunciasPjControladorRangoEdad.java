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
public class DenunciasPjControladorRangoEdad {

    /**
     * Creates a new instance of DenunciasPjControladorRangoEdad
     */
    private CartesianChartModel rangoEdadGrafico2014;
    private CartesianChartModel rangoEdadGrafico2015;
    private ArrayList<DenunciasPj> lstDatosRangoEdad;
    private ArrayList<DenunciasPj> lstDatosDadoAnioRangoEdad;

    public CartesianChartModel getRangoEdadGrafico2014() {
        return rangoEdadGrafico2014;
    }

    public void setRangoEdadGrafico2014(CartesianChartModel rangoEdadGrafico2014) {
        this.rangoEdadGrafico2014 = rangoEdadGrafico2014;
    }

    public CartesianChartModel getRangoEdadGrafico2015() {
        return rangoEdadGrafico2015;
    }

    public void setRangoEdadGrafico2015(CartesianChartModel rangoEdadGrafico2015) {
        this.rangoEdadGrafico2015 = rangoEdadGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosRangoEdad() {
        return lstDatosRangoEdad;
    }

    public void setLstDatosRangoEdad(ArrayList<DenunciasPj> lstDatosRangoEdad) {
        this.lstDatosRangoEdad = lstDatosRangoEdad;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioRangoEdad() {
        return lstDatosDadoAnioRangoEdad;
    }

    public void setLstDatosDadoAnioRangoEdad(ArrayList<DenunciasPj> lstDatosDadoAnioRangoEdad) {
        this.lstDatosDadoAnioRangoEdad = lstDatosDadoAnioRangoEdad;
    }

    public DenunciasPjControladorRangoEdad() {
        reinit();
    }
    
    public void graficar() {
        rangoEdadGrafico2014 = initCategoryRangoEdad2014();
        rangoEdadGrafico2015 = initCategoryRangoEdad2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosRangoEdad = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryRangoEdad2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoEdad = FDenunciasPj.ObtenerDatosRangoEdad();
            ChartSeries rango = new ChartSeries();
           rango.setLabel("Rango de Edad");
            for (DenunciasPj lstDatosP1 : lstDatosRangoEdad) {
                lstDatosDadoAnioRangoEdad = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoEdad(2014, lstDatosP1.getRango_edad_victima());
                rango.set(lstDatosP1.getRango_edad_victima(), lstDatosDadoAnioRangoEdad.size());
            }
            model.addSeries(rango);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel initCategoryRangoEdad2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoEdad = FDenunciasPj.ObtenerDatosRangoEdad();
            ChartSeries rango = new ChartSeries();
           rango.setLabel("Rango de Edad");
            for (DenunciasPj lstDatosP1 : lstDatosRangoEdad) {
                lstDatosDadoAnioRangoEdad = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoEdad(2015, lstDatosP1.getRango_edad_victima());
                rango.set(lstDatosP1.getRango_edad_victima(), lstDatosDadoAnioRangoEdad.size());
            }
            model.addSeries(rango);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
