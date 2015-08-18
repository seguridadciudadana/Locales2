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
public class ControladorVictimas2012Instruccion {

    /**
     * Creates a new instance of ControladorVictimas2012Instruccion
     */
    private CartesianChartModel instruccionGrafico;
    private ArrayList<Victimas_2012> lstDatosInstruccion;
    private ArrayList<Victimas_2012> lstDatosDadoInstruccion;

    public CartesianChartModel getInstruccionGrafico() {
        return instruccionGrafico;
    }

    public void setInstruccionGrafico(CartesianChartModel instruccionGrafico) {
        this.instruccionGrafico = instruccionGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosInstruccion() {
        return lstDatosInstruccion;
    }

    public void setLstDatosInstruccion(ArrayList<Victimas_2012> lstDatosInstruccion) {
        this.lstDatosInstruccion = lstDatosInstruccion;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoInstruccion() {
        return lstDatosDadoInstruccion;
    }

    public void setLstDatosDadoInstruccion(ArrayList<Victimas_2012> lstDatosDadoInstruccion) {
        this.lstDatosDadoInstruccion = lstDatosDadoInstruccion;
    }
        
    public ControladorVictimas2012Instruccion() {
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

        this.lstDatosDadoInstruccion = new ArrayList<Victimas_2012>();
        this.lstDatosInstruccion = new ArrayList<Victimas_2012>();
        this.init();

    }

    private CartesianChartModel initCategoryInstruccion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosInstruccion = FVictimas_2012.ObtenerDatosInstruccion();
            ChartSeries instruccion = new ChartSeries();
            instruccion.setLabel("Instruccion");
            for (Victimas_2012 lstDatosP1 : lstDatosInstruccion) {
                lstDatosDadoInstruccion = FVictimas_2012.ObtenerDatosDadoInstruccion(lstDatosP1.getInstruccio());
                instruccion.set(lstDatosP1.getInstruccio(), lstDatosDadoInstruccion.size());
            }
            model.addSeries(instruccion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
