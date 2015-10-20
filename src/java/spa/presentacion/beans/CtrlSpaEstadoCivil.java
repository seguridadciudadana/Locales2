/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class CtrlSpaEstadoCivil implements Serializable {

    /**
     * Creates a new instance of CtrlSpaEstadoCivil
     */
    private ArrayList<Global> lstEstCivil;
    private ArrayList<Global> lstEstCivilGenero;
    private CartesianChartModel graficaEstCvl;
    private CartesianChartModel graficaEstCvlGenero;
    private ArrayList<Global> lst;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public ArrayList<Global> getLst() {
        return lst;
    }

    public void setLst(ArrayList<Global> lst) {
        this.lst = lst;
    }

    public ArrayList<Global> getLstEstCivil() {
        return lstEstCivil;
    }

    public void setLstEstCivil(ArrayList<Global> lstEstCivil) {
        this.lstEstCivil = lstEstCivil;
    }

    public ArrayList<Global> getLstEstCivilGenero() {
        return lstEstCivilGenero;
    }

    public void setLstEstCivilGenero(ArrayList<Global> lstEstCivilGenero) {
        this.lstEstCivilGenero = lstEstCivilGenero;
    }

    public CartesianChartModel getGraficaEstCvl() {
        return graficaEstCvl;
    }

    public void setGraficaEstCvl(CartesianChartModel graficaEstCvl) {
        this.graficaEstCvl = graficaEstCvl;
    }

    public CartesianChartModel getGraficaEstCvlGenero() {
        return graficaEstCvlGenero;
    }

    public void setGraficaEstCvlGenero(CartesianChartModel graficaEstCvlGenero) {
        this.graficaEstCvlGenero = graficaEstCvlGenero;
    }

    public CtrlSpaEstadoCivil() {
        this.reinit();
    }

    private void reinit() {
        this.lst = new ArrayList<Global>();
        this.lstEstCivil = new ArrayList<Global>();
        this.lstEstCivilGenero = new ArrayList<Global>();
        this.graficar();

    }

    @PostConstruct
    public void graficar() {
        graficaEstCvl = graficaEstCvl(anioSel);
        graficaEstCvlGenero=graficaEstCvlGenero(anioSel);
    }

    private CartesianChartModel graficaEstCvl(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lst = FGlobal.ObtenerDatosDadoAnioEstadoCivl(anio);
            ChartSeries estCvl = new ChartSeries();
            estCvl.setLabel("Estado Civil");
            for (int i = 0; i < lst.size(); i++) {                
                estCvl.set(lst.get(i).getEstado_civil_victima(), FGlobal.ObtenerDatosDadoAnioDadoEstadoCivil(anio, lst.get(i).getEstado_civil_victima()).size());
            }

            model.addSeries(estCvl);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel graficaEstCvlGenero(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lst = FGlobal.ObtenerDatosDadoAnioEstadoCivl(anio);
            ChartSeries estCvl = new ChartSeries();
            estCvl.setLabel("Femenino");
            for (int i = 0; i < lst.size(); i++) {                
                estCvl.set(lst.get(i).getEstado_civil_victima(), FGlobal.ObtenerDatosDadoAnioDadoEstadoCivilGenero(anio, lst.get(i).getEstado_civil_victima(),"F").size());
            }
            
            ChartSeries estCvlM = new ChartSeries();
            estCvlM.setLabel("Masculino");
            for (int i = 0; i < lst.size(); i++) {                
                estCvlM.set(lst.get(i).getEstado_civil_victima(), FGlobal.ObtenerDatosDadoAnioDadoEstadoCivilGenero(anio, lst.get(i).getEstado_civil_victima(),"M").size());
            }

            model.addSeries(estCvl);
            model.addSeries(estCvlM);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
}
