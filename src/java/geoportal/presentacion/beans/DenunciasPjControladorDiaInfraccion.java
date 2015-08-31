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
public class DenunciasPjControladorDiaInfraccion {

    /**
     * Creates a new instance of DenunciasPjControladorDiaInfraccion
     */
    private CartesianChartModel diaGrafico2014;
    private CartesianChartModel diaGrafico2015;
    private ArrayList<DenunciasPj> lstDatosDiaInfraccion;
    private ArrayList<DenunciasPj> lstDatosDadoAnioDiaInfraccion;

    public CartesianChartModel getDiaGrafico2014() {
        return diaGrafico2014;
    }

    public void setDiaGrafico2014(CartesianChartModel diaGrafico2014) {
        this.diaGrafico2014 = diaGrafico2014;
    }

    public CartesianChartModel getDiaGrafico2015() {
        return diaGrafico2015;
    }

    public void setDiaGrafico2015(CartesianChartModel diaGrafico2015) {
        this.diaGrafico2015 = diaGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosDiaInfraccion() {
        return lstDatosDiaInfraccion;
    }

    public void setLstDatosDiaInfraccion(ArrayList<DenunciasPj> lstDatosDiaInfraccion) {
        this.lstDatosDiaInfraccion = lstDatosDiaInfraccion;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioDiaInfraccion() {
        return lstDatosDadoAnioDiaInfraccion;
    }

    public void setLstDatosDadoAnioDiaInfraccion(ArrayList<DenunciasPj> lstDatosDadoAnioDiaInfraccion) {
        this.lstDatosDadoAnioDiaInfraccion = lstDatosDadoAnioDiaInfraccion;
    }

    public DenunciasPjControladorDiaInfraccion() {
        reinit();
    }
    
    public void graficar() {
        diaGrafico2014 = initCategoryDia2014();
        diaGrafico2015 = initCategoryDia2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDiaInfraccion = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryDia2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosDiaInfraccion = FDenunciasPj.ObtenerDatosDiaInfraccion();
            ChartSeries dias = new ChartSeries();
           dias.setLabel("Dia Infracción");
            for (DenunciasPj lstDatosP1 : lstDatosDiaInfraccion) {
                lstDatosDadoAnioDiaInfraccion = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioDiaInfraccion(2014, lstDatosP1.getDia_infraccion());
                dias.set(lstDatosP1.getDia_infraccion(), lstDatosDadoAnioDiaInfraccion.size());
            }
            model.addSeries(dias);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel initCategoryDia2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosDiaInfraccion = FDenunciasPj.ObtenerDatosDiaInfraccion();
            ChartSeries dias = new ChartSeries();
           dias.setLabel("Dia Infracción");
            for (DenunciasPj lstDatosP1 : lstDatosDiaInfraccion) {
                lstDatosDadoAnioDiaInfraccion = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioDiaInfraccion(2015, lstDatosP1.getDia_infraccion());
                dias.set(lstDatosP1.getDia_infraccion(), lstDatosDadoAnioDiaInfraccion.size());
            }
            model.addSeries(dias);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
