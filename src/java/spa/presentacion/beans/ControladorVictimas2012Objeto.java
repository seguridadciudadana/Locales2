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
public class ControladorVictimas2012Objeto {

    /**
     * Creates a new instance of ControladorVictimas2012Objeto
     */
    
    private CartesianChartModel objetoGrafico;
    private ArrayList<Victimas_2012> lstDatosObjeto;
    private ArrayList<Victimas_2012> lstDatosDadoObjeto;

    public CartesianChartModel getObjetoGrafico() {
        return objetoGrafico;
    }

    public void setObjetoGrafico(CartesianChartModel objetoGrafico) {
        this.objetoGrafico = objetoGrafico;
    }

    public ArrayList<Victimas_2012> getLstDatosObjeto() {
        return lstDatosObjeto;
    }

    public void setLstDatosObjeto(ArrayList<Victimas_2012> lstDatosObjeto) {
        this.lstDatosObjeto = lstDatosObjeto;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoObjeto() {
        return lstDatosDadoObjeto;
    }

    public void setLstDatosDadoObjeto(ArrayList<Victimas_2012> lstDatosDadoObjeto) {
        this.lstDatosDadoObjeto = lstDatosDadoObjeto;
    }
    
    
    public ControladorVictimas2012Objeto() {
        reinit();
    }
    
    public void graficar() {
        objetoGrafico = initCategoryObjeto();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoObjeto = new ArrayList<Victimas_2012>();
        this.lstDatosObjeto = new ArrayList<Victimas_2012>();
        this.init();

    }

    private CartesianChartModel initCategoryObjeto() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosObjeto = FVictimas_2012.ObtenerDatosObjeto();
            ChartSeries objeto = new ChartSeries();
            objeto.setLabel("Objeto de Agresión");
            for (Victimas_2012 lstDatosP1 : lstDatosObjeto) {
                lstDatosDadoObjeto = FVictimas_2012.ObtenerDatosDadoObjeto(lstDatosP1.getObjeto_agr());
                objeto.set(lstDatosP1.getObjeto_agr(), lstDatosDadoObjeto.size());
            }
            model.addSeries(objeto);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
