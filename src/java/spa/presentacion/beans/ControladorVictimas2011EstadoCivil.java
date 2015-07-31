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
public class ControladorVictimas2011EstadoCivil {

    /**
     * Creates a new instance of ControladorVictimas2011EstadoCivil
     */
    private CartesianChartModel estadoCivilGrafico;
    private ArrayList<Victimas_2011> lstDatosEstadoCivil;
    private ArrayList<Victimas_2011> lstDatosDadoEstadoCivil;

    public CartesianChartModel getEstadoCivilGrafico() {
        return estadoCivilGrafico;
    }

    public void setEstadoCivilGrafico(CartesianChartModel estadoCivilGrafico) {
        this.estadoCivilGrafico = estadoCivilGrafico;
    }

    public ArrayList<Victimas_2011> getLstDatosEstadoCivil() {
        return lstDatosEstadoCivil;
    }

    public void setLstDatosEstadoCivil(ArrayList<Victimas_2011> lstDatosEstadoCivil) {
        this.lstDatosEstadoCivil = lstDatosEstadoCivil;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoEstadoCivil() {
        return lstDatosDadoEstadoCivil;
    }

    public void setLstDatosDadoEstadoCivil(ArrayList<Victimas_2011> lstDatosDadoEstadoCivil) {
        this.lstDatosDadoEstadoCivil = lstDatosDadoEstadoCivil;
    }
    
    
    public ControladorVictimas2011EstadoCivil() {
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

        this.lstDatosDadoEstadoCivil = new ArrayList<Victimas_2011>();
        this.lstDatosEstadoCivil = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEstadoCivil = FVictimas_2011.ObtenerDatosEstadoCivil();
            ChartSeries estado = new ChartSeries();
            estado.setLabel("Parentesco Victima - Agresor");
            for (Victimas_2011 lstDatosP1 : lstDatosEstadoCivil) {
                lstDatosDadoEstadoCivil = FVictimas_2011.ObtenerDatosDadoEstadoCivil(lstDatosP1.getEstado_civ());
                estado.set(lstDatosP1.getEstado_civ(), lstDatosDadoEstadoCivil.size());
            }
            model.addSeries(estado);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
