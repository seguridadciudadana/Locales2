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
public class ControladorVictimas2011Objeto {

    /**
     * Creates a new instance of ControladorVictimas2011Objeto
     */
    
    private CartesianChartModel objetoGrafico;
    private ArrayList<Victimas_2011> lstDatosObjeto;
    private ArrayList<Victimas_2011> lstDatosDadoObjeto;

    public CartesianChartModel getObjetoGrafico() {
        return objetoGrafico;
    }

    public void setObjetoGrafico(CartesianChartModel objetoGrafico) {
        this.objetoGrafico = objetoGrafico;
    }

    public ArrayList<Victimas_2011> getLstDatosObjeto() {
        return lstDatosObjeto;
    }

    public void setLstDatosObjeto(ArrayList<Victimas_2011> lstDatosObjeto) {
        this.lstDatosObjeto = lstDatosObjeto;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoObjeto() {
        return lstDatosDadoObjeto;
    }

    public void setLstDatosDadoObjeto(ArrayList<Victimas_2011> lstDatosDadoObjeto) {
        this.lstDatosDadoObjeto = lstDatosDadoObjeto;
    }
    
    
    public ControladorVictimas2011Objeto() {
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

        this.lstDatosDadoObjeto = new ArrayList<Victimas_2011>();
        this.lstDatosObjeto = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategoryObjeto() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosObjeto = FVictimas_2011.ObtenerDatosObjeto();
            ChartSeries objeto = new ChartSeries();
            objeto.setLabel("Objeto de Agresión");
            for (Victimas_2011 lstDatosP1 : lstDatosObjeto) {
                lstDatosDadoObjeto = FVictimas_2011.ObtenerDatosDadoObjeto(lstDatosP1.getObjeto_de());
                objeto.set(lstDatosP1.getObjeto_de(), lstDatosDadoObjeto.size());
            }
            model.addSeries(objeto);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
