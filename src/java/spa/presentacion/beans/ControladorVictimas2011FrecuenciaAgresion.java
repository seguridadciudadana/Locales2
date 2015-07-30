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
import spa.logica.clases.Victimas_2011;
import spa.logica.funciones.FVictimas_2011;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2011FrecuenciaAgresion {

    /**
     * Creates a new instance of ControladorVictimas2011FrecuenciaAgresion
     */
    private CartesianChartModel graficaFrecuenciaAgresion;
    private ArrayList<Victimas_2011> lstDatosFrecuenciaPrimera;
    private ArrayList<Victimas_2011> lstDatosFrecuenciaSubsecuente;
    private ArrayList<Victimas_2011> lstDatosFrecuenciaNa;

    public CartesianChartModel getGraficaFrecuenciaAgresion() {
        return graficaFrecuenciaAgresion;
    }

    public void setGraficaFrecuenciaAgresion(CartesianChartModel graficaFrecuenciaAgresion) {
        this.graficaFrecuenciaAgresion = graficaFrecuenciaAgresion;
    }

    
    public ArrayList<Victimas_2011> getLstDatosFrecuenciaPrimera() {
        return lstDatosFrecuenciaPrimera;
    }

    public void setLstDatosFrecuenciaPrimera(ArrayList<Victimas_2011> lstDatosFrecuenciaPrimera) {
        this.lstDatosFrecuenciaPrimera = lstDatosFrecuenciaPrimera;
    }

    public ArrayList<Victimas_2011> getLstDatosFrecuenciaSubsecuente() {
        return lstDatosFrecuenciaSubsecuente;
    }

    public void setLstDatosFrecuenciaSubsecuente(ArrayList<Victimas_2011> lstDatosFrecuenciaSubsecuente) {
        this.lstDatosFrecuenciaSubsecuente = lstDatosFrecuenciaSubsecuente;
    }

    public ArrayList<Victimas_2011> getLstDatosFrecuenciaNa() {
        return lstDatosFrecuenciaNa;
    }

    public void setLstDatosFrecuenciaNa(ArrayList<Victimas_2011> lstDatosFrecuenciaNa) {
        this.lstDatosFrecuenciaNa = lstDatosFrecuenciaNa;
    }
    
    
    public ControladorVictimas2011FrecuenciaAgresion() {
        reinit();
        
    }
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosFrecuenciaPrimera = new ArrayList<Victimas_2011>();
        this.lstDatosFrecuenciaSubsecuente = new ArrayList<Victimas_2011>();
        this.lstDatosFrecuenciaNa = new ArrayList<Victimas_2011>();
        
        this.init();

    }

    public void graficar() {
        graficaFrecuenciaAgresion= initCategoryFRecuenciaAgresion();
        // lineModel2 = initCategoryCircuito();
        //pieModel = graficaDenunciasCircuito();
    }

    /**
     *
     */
    private CartesianChartModel initCategoryFRecuenciaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFrecuenciaPrimera = FVictimas_2011.ObtenerDatosFrecuenciaPrimera();
            lstDatosFrecuenciaSubsecuente = FVictimas_2011.ObtenerDatosFrecuenciaSubsecuente();
            lstDatosFrecuenciaNa = FVictimas_2011.ObtenerDatosFrecuenciaNA();
            
            ChartSeries Frecuencia = new ChartSeries();
            Frecuencia.setLabel("Frecuencia");
            Frecuencia.set("Primera", lstDatosFrecuenciaPrimera.size());
            Frecuencia.set("Subsecuente", lstDatosFrecuenciaSubsecuente.size());
            Frecuencia.set("N/A", lstDatosFrecuenciaNa.size());
            

            model.addSeries(Frecuencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
