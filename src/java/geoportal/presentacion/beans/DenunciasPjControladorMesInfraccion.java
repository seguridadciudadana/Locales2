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
public class DenunciasPjControladorMesInfraccion {

    /**
     * Creates a new instance of DenunciasPjControladorMesInfraccion
     */
    private CartesianChartModel mesesGrafico2014;
    private CartesianChartModel mesesGrafico2015;
    private ArrayList<DenunciasPj> lstDatosMesInfraccion;
    private ArrayList<DenunciasPj> lstDatosDadoAnioMesInfraccion;

    public CartesianChartModel getMesesGrafico2014() {
        return mesesGrafico2014;
    }

    public void setMesesGrafico2014(CartesianChartModel mesesGrafico2014) {
        this.mesesGrafico2014 = mesesGrafico2014;
    }

    public CartesianChartModel getMesesGrafico2015() {
        return mesesGrafico2015;
    }

    public void setMesesGrafico2015(CartesianChartModel mesesGrafico2015) {
        this.mesesGrafico2015 = mesesGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosMesInfraccion() {
        return lstDatosMesInfraccion;
    }

    public void setLstDatosMesInfraccion(ArrayList<DenunciasPj> lstDatosMesInfraccion) {
        this.lstDatosMesInfraccion = lstDatosMesInfraccion;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioMesInfraccion() {
        return lstDatosDadoAnioMesInfraccion;
    }

    public void setLstDatosDadoAnioMesInfraccion(ArrayList<DenunciasPj> lstDatosDadoAnioMesInfraccion) {
        this.lstDatosDadoAnioMesInfraccion = lstDatosDadoAnioMesInfraccion;
    }

    public DenunciasPjControladorMesInfraccion() {
        reinit();
    }

    public void graficar() {
        mesesGrafico2014 = initCategoryMeses2014();
        mesesGrafico2015 = initCategoryMeses2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosMesInfraccion = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryMeses2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosMesInfraccion = FDenunciasPj.ObtenerDatosMeses();
            ChartSeries mes = new ChartSeries();
            mes.setLabel("Mes");
            for (DenunciasPj lstDatosP1 : lstDatosMesInfraccion) {
                lstDatosDadoAnioMesInfraccion = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioMesInfraccion(2014, lstDatosP1.getMes_infraccion());
                mes.set(lstDatosP1.getMes_infraccion(), lstDatosDadoAnioMesInfraccion.size());
            }
            model.addSeries(mes);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryMeses2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosMesInfraccion = FDenunciasPj.ObtenerDatosMeses();
            ChartSeries mes = new ChartSeries();
            mes.setLabel("Mes");
            for (DenunciasPj lstDatosP1 : lstDatosMesInfraccion) {
                lstDatosDadoAnioMesInfraccion = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioMesInfraccion(2015, lstDatosP1.getMes_infraccion());
                mes.set(lstDatosP1.getMes_infraccion(), lstDatosDadoAnioMesInfraccion.size());
            }
            model.addSeries(mes);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
