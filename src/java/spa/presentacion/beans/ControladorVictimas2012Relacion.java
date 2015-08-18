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
public class ControladorVictimas2012Relacion {

    /**
     * Creates a new instance of ControladorVictimas2012Relacion
     */
    
    private CartesianChartModel relacionGrafico;
    private ArrayList<Victimas_2012> lstDatosRelacion;
    private ArrayList<Victimas_2012> lstDatosDadoRelacion;

    public CartesianChartModel getRelacionGrafico() {
        return relacionGrafico;
    }

    public void setRelacionGrafico(CartesianChartModel relacionGrafico) {
        this.relacionGrafico = relacionGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosRelacion() {
        return lstDatosRelacion;
    }

    public void setLstDatosRelacion(ArrayList<Victimas_2012> lstDatosRelacion) {
        this.lstDatosRelacion = lstDatosRelacion;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoRelacion() {
        return lstDatosDadoRelacion;
    }

    public void setLstDatosDadoRelacion(ArrayList<Victimas_2012> lstDatosDadoRelacion) {
        this.lstDatosDadoRelacion = lstDatosDadoRelacion;
    }
    
        
    public ControladorVictimas2012Relacion() {
        reinit();
    }
    
    public void graficar() {
        relacionGrafico = initCategoryParentesco();
        
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }
    
    private void reinit() {

        this.lstDatosDadoRelacion = new ArrayList<Victimas_2012>();
        this.lstDatosRelacion = new ArrayList<Victimas_2012>();
        this.init();
        

    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosRelacion = FVictimas_2012.ObtenerDatosRelacion();
            ChartSeries relacion = new ChartSeries();
            relacion.setLabel("Parentesco Victima - Agresor");
            for (Victimas_2012 lstDatosP1 : lstDatosRelacion) {
                lstDatosDadoRelacion = FVictimas_2012.ObtenerDatosDadoRelacion(lstDatosP1.getRelacion_p());
                relacion.set(lstDatosP1.getRelacion_p(), lstDatosDadoRelacion.size());
            }
            model.addSeries(relacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
