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
public class DenunciasPjControladorCasosReincidencia {

    /**
     * Creates a new instance of DenunciasPjControladorCasosReincidencia
     */
    private CartesianChartModel casoRGrafico2014;
    private CartesianChartModel casoRGrafico2015;
    private ArrayList<DenunciasPj> lstDatosCasoReincidencia;
    private ArrayList<DenunciasPj> lstDatosDadoAnioCasoReincidencia;
    //private String Anio;
    private int AnioInteger;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }
    

    public CartesianChartModel getCasoRGrafico2014() {
        return casoRGrafico2014;
    }

    public void setCasoRGrafico2014(CartesianChartModel casoRGrafico2014) {
        this.casoRGrafico2014 = casoRGrafico2014;
    }

    public CartesianChartModel getCasoRGrafico2015() {
        return casoRGrafico2015;
    }

    public void setCasoRGrafico2015(CartesianChartModel casoRGrafico2015) {
        this.casoRGrafico2015 = casoRGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosCasoReincidencia() {
        return lstDatosCasoReincidencia;
    }

    public void setLstDatosCasoReincidencia(ArrayList<DenunciasPj> lstDatosCasoReincidencia) {
        this.lstDatosCasoReincidencia = lstDatosCasoReincidencia;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioCasoReincidencia() {
        return lstDatosDadoAnioCasoReincidencia;
    }

    public void setLstDatosDadoAnioCasoReincidencia(ArrayList<DenunciasPj> lstDatosDadoAnioCasoReincidencia) {
        this.lstDatosDadoAnioCasoReincidencia = lstDatosDadoAnioCasoReincidencia;
    }

    public int getAnioInteger() {
        return AnioInteger;
    }

    public void setAnioInteger(int AnioInteger) {
        this.AnioInteger = AnioInteger;
    }
    
        
    public DenunciasPjControladorCasosReincidencia() {
        reinit();
    }
    
    public void graficar() {
        casoRGrafico2014 = initCategoryCaso2014();
        casoRGrafico2015 = initCategoryCaso2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCasoReincidencia = new ArrayList<DenunciasPj>();
        //this.lstDatosRelacion = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryCaso2014() {

        CartesianChartModel model = new CartesianChartModel();
        //AnioInteger = 2014;
        try {
            
            lstDatosCasoReincidencia = FDenunciasPj.ObtenerDatosCasoReincidente();
            ChartSeries caso = new ChartSeries();
            caso.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCasoReincidencia) {
                lstDatosDadoAnioCasoReincidencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCasoReincidente(anioSel, lstDatosP1.getCaso_reincidente());
                caso.set(lstDatosP1.getCaso(), lstDatosDadoAnioCasoReincidencia.size());
            }
            model.addSeries(caso);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryCaso2015() {

        CartesianChartModel model = new CartesianChartModel();
        //AnioInteger = 2014;
        try {
            
            lstDatosCasoReincidencia = FDenunciasPj.ObtenerDatosCasoReincidente();
            ChartSeries caso = new ChartSeries();
            caso.setLabel("Circuito");
            for (DenunciasPj lstDatosP1 : lstDatosCasoReincidencia) {
                lstDatosDadoAnioCasoReincidencia = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioCasoReincidente(2015, lstDatosP1.getCaso_reincidente());
                caso.set(lstDatosP1.getCaso(), lstDatosDadoAnioCasoReincidencia.size());
            }
            model.addSeries(caso);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
