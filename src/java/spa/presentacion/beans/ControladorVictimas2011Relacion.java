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
public class ControladorVictimas2011Relacion {

    /**
     * Creates a new instance of ControladorVictimas2011Relacion
     */
    private CartesianChartModel relacionGrafico;
    private ArrayList<Victimas_2011> lstDatosRelacion;
    private ArrayList<Victimas_2011> lstDatosDadoRelacion;

    public ArrayList<Victimas_2011> getLstDatosRelacion() {
        return lstDatosRelacion;
    }

    public void setLstDatosRelacion(ArrayList<Victimas_2011> lstDatosRelacion) {
        this.lstDatosRelacion = lstDatosRelacion;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoRelacion() {
        return lstDatosDadoRelacion;
    }

    public void setLstDatosDadoRelacion(ArrayList<Victimas_2011> lstDatosDadoRelacion) {
        this.lstDatosDadoRelacion = lstDatosDadoRelacion;
    }

    public CartesianChartModel getRelacionGrafico() {
        return relacionGrafico;
    }

    public void setRelacionGrafico(CartesianChartModel relacionGrafico) {
        this.relacionGrafico = relacionGrafico;
    }
      
    
    
    public ControladorVictimas2011Relacion() {
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

        this.lstDatosDadoRelacion = new ArrayList<Victimas_2011>();
        this.lstDatosRelacion = new ArrayList<Victimas_2011>();
        this.init();
        

    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosRelacion = FVictimas_2011.ObtenerDatosRelacion();
            ChartSeries relacion = new ChartSeries();
            relacion.setLabel("Parentesco Victima - Agresor");
            for (Victimas_2011 lstDatosP1 : lstDatosRelacion) {
                lstDatosDadoRelacion = FVictimas_2011.ObtenerDatosDadoRelacion(lstDatosP1.getRelacion_d());
                relacion.set(lstDatosP1.getRelacion_d(), lstDatosDadoRelacion.size());
            }
            model.addSeries(relacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
