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
public class ControladorVictimas2011Estado {

    /**
     * Creates a new instance of ControladorVictimas2011Estado
     */
    private CartesianChartModel estadoGrafico;
    private ArrayList<Victimas_2011> lstDatosEstado;
    private ArrayList<Victimas_2011> lstDatosDadoEstado;

    public CartesianChartModel getEstadoGrafico() {
        return estadoGrafico;
    }

    public void setEstadoGrafico(CartesianChartModel estadoGrafico) {
        this.estadoGrafico = estadoGrafico;
    }

    public ArrayList<Victimas_2011> getLstDatosEstado() {
        return lstDatosEstado;
    }

    public void setLstDatosEstado(ArrayList<Victimas_2011> lstDatosEstado) {
        this.lstDatosEstado = lstDatosEstado;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoEstado() {
        return lstDatosDadoEstado;
    }

    public void setLstDatosDadoEstado(ArrayList<Victimas_2011> lstDatosDadoEstado) {
        this.lstDatosDadoEstado = lstDatosDadoEstado;
    }

    public ControladorVictimas2011Estado() {
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

        this.lstDatosDadoEstado = new ArrayList<Victimas_2011>();
        this.lstDatosEstado = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryEstado() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEstado = FVictimas_2011.ObtenerDatosEstado();
            ChartSeries estado = new ChartSeries();
            estado.setLabel("Parentesco Victima - Agresor");
            for (Victimas_2011 lstDatosP1 : lstDatosEstado) {
                lstDatosDadoEstado = FVictimas_2011.ObtenerDatosDadoEstado(lstDatosP1.getEstado_de());
                estado.set(lstDatosP1.getEstado_de(), lstDatosDadoEstado.size());
            }
            model.addSeries(estado);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
