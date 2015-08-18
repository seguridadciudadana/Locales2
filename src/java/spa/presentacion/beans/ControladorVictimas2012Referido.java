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
public class ControladorVictimas2012Referido {

    /**
     * Creates a new instance of ControladorVictimas2012Referido
     */
    
     private CartesianChartModel referidoGrafico;
    private ArrayList<Victimas_2012> lstDatosReferido;
    private ArrayList<Victimas_2012> lstDatosDadoReferido;

    public CartesianChartModel getReferidoGrafico() {
        return referidoGrafico;
    }

    public void setReferidoGrafico(CartesianChartModel referidoGrafico) {
        this.referidoGrafico = referidoGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosReferido() {
        return lstDatosReferido;
    }

    public void setLstDatosReferido(ArrayList<Victimas_2012> lstDatosReferido) {
        this.lstDatosReferido = lstDatosReferido;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoReferido() {
        return lstDatosDadoReferido;
    }

    public void setLstDatosDadoReferido(ArrayList<Victimas_2012> lstDatosDadoReferido) {
        this.lstDatosDadoReferido = lstDatosDadoReferido;
    }
    
    
    public ControladorVictimas2012Referido() {
        reinit();
    }
    
    public void graficar() {
        referidoGrafico = initCategoryReferido();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoReferido = new ArrayList<Victimas_2012>();
        this.lstDatosReferido = new ArrayList<Victimas_2012>();
        this.init();

    }

    private CartesianChartModel initCategoryReferido() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosReferido = FVictimas_2012.ObtenerDatosReferido();
            ChartSeries referido= new ChartSeries();
            referido.setLabel("Referido");
            for (Victimas_2012 lstDatosP1 : lstDatosReferido) {
                lstDatosDadoReferido = FVictimas_2012.ObtenerDatosDadoReferido(lstDatosP1.getReferido());
                referido.set(lstDatosP1.getReferido(), lstDatosDadoReferido.size());
            }
            model.addSeries(referido);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
