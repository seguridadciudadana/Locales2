/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2012;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012Frecuencia {

    /**
     * Creates a new instance of ControladorVictimas2012Frecuencia
     */
    private CartesianChartModel graficaFrecuenciaAgresion;
    private ArrayList<Victimas_2012> lstDatosFrecuenciaPrimera;
    private ArrayList<Victimas_2012> lstDatosFrecuenciaSubsecuente;
    private ArrayList<Victimas_2012> lstDatosFrecuenciaNa;

    public CartesianChartModel getGraficaFrecuenciaAgresion() {
        return graficaFrecuenciaAgresion;
    }

    public void setGraficaFrecuenciaAgresion(CartesianChartModel graficaFrecuenciaAgresion) {
        this.graficaFrecuenciaAgresion = graficaFrecuenciaAgresion;
    }

    public ArrayList<Victimas_2012> getLstDatosFrecuenciaPrimera() {
        return lstDatosFrecuenciaPrimera;
    }

    public void setLstDatosFrecuenciaPrimera(ArrayList<Victimas_2012> lstDatosFrecuenciaPrimera) {
        this.lstDatosFrecuenciaPrimera = lstDatosFrecuenciaPrimera;
    }

    public ArrayList<Victimas_2012> getLstDatosFrecuenciaSubsecuente() {
        return lstDatosFrecuenciaSubsecuente;
    }

    public void setLstDatosFrecuenciaSubsecuente(ArrayList<Victimas_2012> lstDatosFrecuenciaSubsecuente) {
        this.lstDatosFrecuenciaSubsecuente = lstDatosFrecuenciaSubsecuente;
    }

    public ArrayList<Victimas_2012> getLstDatosFrecuenciaNa() {
        return lstDatosFrecuenciaNa;
    }

    public void setLstDatosFrecuenciaNa(ArrayList<Victimas_2012> lstDatosFrecuenciaNa) {
        this.lstDatosFrecuenciaNa = lstDatosFrecuenciaNa;
    }
    
    
    public ControladorVictimas2012Frecuencia() {
        reinit();
    }
    
     
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosFrecuenciaNa = new ArrayList<Victimas_2012>();
        this.lstDatosFrecuenciaSubsecuente = new ArrayList<Victimas_2012>();
        //this.lstDatosFrecuenciaNa = new ArrayList<Victimas_2012>();
        
        this.init();

    }

    public void graficar() {
        graficaFrecuenciaAgresion= initCategoryFrecuenciaAgresion();
        // lineModel2 = initCategoryCircuito();
        //pieModel = graficaDenunciasCircuito();
    }

    /**
     *
     */
   private CartesianChartModel initCategoryFrecuenciaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFrecuenciaNa = FVictimas_2012.ObtenerDatosFrecuencia();
            ChartSeries frecuencia = new ChartSeries();
            frecuencia.setLabel("Frecuencia");
            for (Victimas_2012 lstDatosP1 : lstDatosFrecuenciaNa) {
                lstDatosFrecuenciaPrimera = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion(lstDatosP1.getFrecuencia());
                frecuencia.set(lstDatosP1.getFrecuencia(), lstDatosFrecuenciaPrimera.size());
            }
            model.addSeries(frecuencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
