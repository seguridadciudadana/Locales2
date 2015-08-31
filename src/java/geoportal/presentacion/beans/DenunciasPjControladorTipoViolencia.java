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
public class DenunciasPjControladorTipoViolencia {

    /**
     * Creates a new instance of DenunciasPjControladorTipoViolencia
     */
    private CartesianChartModel tipoViolenciaGrafico2014;
    private CartesianChartModel tipoViolenciaGrafico2015;
    private ArrayList<DenunciasPj> lstDatosTipoViolencia;
    private ArrayList<DenunciasPj> lstDatosDadoAnioTipoViolencia;

    public CartesianChartModel getTipoViolenciaGrafico2014() {
        return tipoViolenciaGrafico2014;
    }

    public void setTipoViolenciaGrafico2014(CartesianChartModel tipoViolenciaGrafico2014) {
        this.tipoViolenciaGrafico2014 = tipoViolenciaGrafico2014;
    }

    public CartesianChartModel getTipoViolenciaGrafico2015() {
        return tipoViolenciaGrafico2015;
    }

    public void setTipoViolenciaGrafico2015(CartesianChartModel tipoViolenciaGrafico2015) {
        this.tipoViolenciaGrafico2015 = tipoViolenciaGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosTipoViolencia() {
        return lstDatosTipoViolencia;
    }

    public void setLstDatosTipoViolencia(ArrayList<DenunciasPj> lstDatosTipoViolencia) {
        this.lstDatosTipoViolencia = lstDatosTipoViolencia;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioTipoViolencia() {
        return lstDatosDadoAnioTipoViolencia;
    }

    public void setLstDatosDadoAnioTipoViolencia(ArrayList<DenunciasPj> lstDatosDadoAnioTipoViolencia) {
        this.lstDatosDadoAnioTipoViolencia = lstDatosDadoAnioTipoViolencia;
    }

    public DenunciasPjControladorTipoViolencia() {
        reinit();
    }

    public void graficar() {
        tipoViolenciaGrafico2014 = initCategoryTipoViolencia2014();
        tipoViolenciaGrafico2015 = initCategoryTipoViolencia2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosTipoViolencia = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryTipoViolencia2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosTipoViolencia = FDenunciasPj.ObtenerDatosTipoViolencia();
            ChartSeries tipoViolencia = new ChartSeries();
            tipoViolencia.setLabel("Tipo Violencia");
            for (DenunciasPj lstDatosP1 : lstDatosTipoViolencia) {
                lstDatosDadoAnioTipoViolencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioTipoViolencia(2014, lstDatosP1.getTipo_de_violencia());
                tipoViolencia.set(lstDatosP1.getTipo_de_violencia(), lstDatosDadoAnioTipoViolencia.size());
            }
            model.addSeries(tipoViolencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryTipoViolencia2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosTipoViolencia = FDenunciasPj.ObtenerDatosTipoViolencia();
            ChartSeries tipoViolencia = new ChartSeries();
            tipoViolencia.setLabel("Tipo Violencia");
            for (DenunciasPj lstDatosP1 : lstDatosTipoViolencia) {
                lstDatosDadoAnioTipoViolencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioTipoViolencia(2015, lstDatosP1.getTipo_de_violencia());
                tipoViolencia.set(lstDatosP1.getTipo_de_violencia(), lstDatosDadoAnioTipoViolencia.size());
            }
            model.addSeries(tipoViolencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
