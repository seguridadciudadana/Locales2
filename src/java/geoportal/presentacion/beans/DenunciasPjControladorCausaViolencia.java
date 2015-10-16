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
public class DenunciasPjControladorCausaViolencia {

    /**
     * Creates a new instance of DenunciasPjControladorCausaViolencia
     */
    private CartesianChartModel causaGrafico2014;
    private CartesianChartModel causaGrafico2015;
    private ArrayList<DenunciasPj> lstDatosCausaViolencia;
    private ArrayList<DenunciasPj> lstDatosDadoAnioCausaViolencia;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }
    

    private int AnioInteger;

    public CartesianChartModel getCausaGrafico2014() {
        return causaGrafico2014;
    }

    public void setCausaGrafico2014(CartesianChartModel causaGrafico2014) {
        this.causaGrafico2014 = causaGrafico2014;
    }

    public CartesianChartModel getCausaGrafico2015() {
        return causaGrafico2015;
    }

    public void setCausaGrafico2015(CartesianChartModel causaGrafico2015) {
        this.causaGrafico2015 = causaGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosCausaViolencia() {
        return lstDatosCausaViolencia;
    }

    public void setLstDatosCausaViolencia(ArrayList<DenunciasPj> lstDatosCausaViolencia) {
        this.lstDatosCausaViolencia = lstDatosCausaViolencia;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioCausaViolencia() {
        return lstDatosDadoAnioCausaViolencia;
    }

    public void setLstDatosDadoAnioCausaViolencia(ArrayList<DenunciasPj> lstDatosDadoAnioCausaViolencia) {
        this.lstDatosDadoAnioCausaViolencia = lstDatosDadoAnioCausaViolencia;
    }

    public int getAnioInteger() {
        return AnioInteger;
    }

    public void setAnioInteger(int AnioInteger) {
        this.AnioInteger = AnioInteger;
    }

    public DenunciasPjControladorCausaViolencia() {
        reinit();
    }

    public void graficar() {
        causaGrafico2014 = initCategoryCausa2014();
        causaGrafico2015 = initCategoryCausa2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCausaViolencia = new ArrayList<DenunciasPj>();

        this.init();

    }

    private CartesianChartModel initCategoryCausa2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosCausaViolencia = FDenunciasPj.ObtenerDatosCausaViolencia();
            ChartSeries causa = new ChartSeries();
            causa.setLabel("Causa Violencia");
            for (DenunciasPj lstDatosP1 : lstDatosCausaViolencia) {
                lstDatosDadoAnioCausaViolencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCausaViolencia(anioSel, lstDatosP1.getCausa_de_violencia());
                causa.set(lstDatosP1.getCausa_de_violencia(), lstDatosDadoAnioCausaViolencia.size());
            }
            model.addSeries(causa);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryCausa2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosCausaViolencia = FDenunciasPj.ObtenerDatosCausaViolencia();
            ChartSeries causa = new ChartSeries();
            causa.setLabel("Causa Violencia");
            for (DenunciasPj lstDatosP1 : lstDatosCausaViolencia) {
                lstDatosDadoAnioCausaViolencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCausaViolencia(2015, lstDatosP1.getCausa_de_violencia());
                causa.set(lstDatosP1.getCausa_de_violencia(), lstDatosDadoAnioCausaViolencia.size());
            }
            model.addSeries(causa);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
