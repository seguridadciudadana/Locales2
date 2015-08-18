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
public class ControladorVictimas2012Estado {

    /**
     * Creates a new instance of ControladorVictimas2012Estado
     */
    
     private CartesianChartModel estadoGrafico;
    private ArrayList<Victimas_2012> lstDatosEstado;
    private ArrayList<Victimas_2012> lstDatosDadoEstado;

    public CartesianChartModel getEstadoGrafico() {
        return estadoGrafico;
    }

    public void setEstadoGrafico(CartesianChartModel estadoGrafico) {
        this.estadoGrafico = estadoGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosEstado() {
        return lstDatosEstado;
    }

    public void setLstDatosEstado(ArrayList<Victimas_2012> lstDatosEstado) {
        this.lstDatosEstado = lstDatosEstado;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoEstado() {
        return lstDatosDadoEstado;
    }

    public void setLstDatosDadoEstado(ArrayList<Victimas_2012> lstDatosDadoEstado) {
        this.lstDatosDadoEstado = lstDatosDadoEstado;
    }
    
    
    public ControladorVictimas2012Estado() {
        reinit();
    }
    
    public void graficar() {
        estadoGrafico = initCategoryEstado();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoEstado = new ArrayList<Victimas_2012>();
        this.lstDatosEstado = new ArrayList<Victimas_2012>();
        this.init();

    }

    private CartesianChartModel initCategoryEstado() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEstado = FVictimas_2012.ObtenerDatosEstado();
            ChartSeries estado = new ChartSeries();
            estado.setLabel("Estado de Consiencia Agresor");
            for (Victimas_2012 lstDatosP1 : lstDatosEstado) {
                lstDatosDadoEstado = FVictimas_2012.ObtenerDatosDadoEstado(lstDatosP1.getEstado_de_());
                estado.set(lstDatosP1.getEstado_de_(), lstDatosDadoEstado.size());
            }
            model.addSeries(estado);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
