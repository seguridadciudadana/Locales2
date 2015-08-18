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
public class ControladorVictimas2012EstadoCivil {

    /**
     * Creates a new instance of ControladorVictimas2012EstadoCivil
     */
    
    private CartesianChartModel estadoCivilGrafico;
    private ArrayList<Victimas_2012> lstDatosEstadoCivil;
    private ArrayList<Victimas_2012> lstDatosDadoEstadoCivil;

    public CartesianChartModel getEstadoCivilGrafico() {
        return estadoCivilGrafico;
    }

    public void setEstadoCivilGrafico(CartesianChartModel estadoCivilGrafico) {
        this.estadoCivilGrafico = estadoCivilGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosEstadoCivil() {
        return lstDatosEstadoCivil;
    }

    public void setLstDatosEstadoCivil(ArrayList<Victimas_2012> lstDatosEstadoCivil) {
        this.lstDatosEstadoCivil = lstDatosEstadoCivil;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoEstadoCivil() {
        return lstDatosDadoEstadoCivil;
    }

    public void setLstDatosDadoEstadoCivil(ArrayList<Victimas_2012> lstDatosDadoEstadoCivil) {
        this.lstDatosDadoEstadoCivil = lstDatosDadoEstadoCivil;
    }
        
    public ControladorVictimas2012EstadoCivil() {
        reinit();
    }
    
    public void graficar() {
        estadoCivilGrafico = initCategoryEstadoCivil();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoEstadoCivil = new ArrayList<Victimas_2012>();
        this.lstDatosEstadoCivil = new ArrayList<Victimas_2012>();
        this.init();

    }

    private CartesianChartModel initCategoryEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEstadoCivil = FVictimas_2012.ObtenerDatosEstadoCivil();
            ChartSeries estado = new ChartSeries();
            estado.setLabel("Estado Civil Victima - Agresor");
            for (Victimas_2012 lstDatosP1 : lstDatosEstadoCivil) {
                lstDatosDadoEstadoCivil = FVictimas_2012.ObtenerDatosDadoEstadoCivil(lstDatosP1.getEstado_civ());
                estado.set(lstDatosP1.getEstado_civ(), lstDatosDadoEstadoCivil.size());
            }
            model.addSeries(estado);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
