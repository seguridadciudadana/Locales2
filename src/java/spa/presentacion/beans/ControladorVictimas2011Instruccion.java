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
public class ControladorVictimas2011Instruccion {

    /**
     * Creates a new instance of ControladorVictimas2011Instruccion
     */
    private CartesianChartModel instruccionGrafico;
    private ArrayList<Victimas_2011> lstDatosInstruccion;
    private ArrayList<Victimas_2011> lstDatosDadoInstruccion;

    public CartesianChartModel getInstruccionGrafico() {
        return instruccionGrafico;
    }

    public void setInstruccionGrafico(CartesianChartModel instruccionGrafico) {
        this.instruccionGrafico = instruccionGrafico;
    }

    public ArrayList<Victimas_2011> getLstDatosInstruccion() {
        return lstDatosInstruccion;
    }

    public void setLstDatosInstruccion(ArrayList<Victimas_2011> lstDatosInstruccion) {
        this.lstDatosInstruccion = lstDatosInstruccion;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoInstruccion() {
        return lstDatosDadoInstruccion;
    }

    public void setLstDatosDadoInstruccion(ArrayList<Victimas_2011> lstDatosDadoInstruccion) {
        this.lstDatosDadoInstruccion = lstDatosDadoInstruccion;
    }
    
    

    public ControladorVictimas2011Instruccion() {
        reinit();
    }
    
    public void graficar() {
        instruccionGrafico = initCategoryInstruccion();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoInstruccion = new ArrayList<Victimas_2011>();
        this.lstDatosInstruccion = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryInstruccion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosInstruccion = FVictimas_2011.ObtenerDatosInstruccion();
            ChartSeries instruccion = new ChartSeries();
            instruccion.setLabel("Instruccion");
            for (Victimas_2011 lstDatosP1 : lstDatosInstruccion) {
                lstDatosDadoInstruccion = FVictimas_2011.ObtenerDatosDadoInstruccion(lstDatosP1.getInstruccion());
                instruccion.set(lstDatosP1.getInstruccion(), lstDatosDadoInstruccion.size());
            }
            model.addSeries(instruccion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
