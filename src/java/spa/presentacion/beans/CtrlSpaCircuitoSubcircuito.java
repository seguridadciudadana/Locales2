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
import javax.inject.Named;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.CircuitosSubcircuitos;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped

public class CtrlSpaCircuitoSubcircuito implements Serializable{

    /**
     * Creates a new instance of CtrlSpaCircuitoSubcircuito
     */
    private ArrayList<Global> lstCircuitos;
    private ArrayList<Global> lstSubcircuitos;
    private CartesianChartModel graficaCircuito;
    private CartesianChartModel graficaSubcircuito;
    private ArrayList<String> lst;
    private int anioSel;

    /*
     ** Get y Set
     */
    public ArrayList<String> getLst() {
        return lst;
    }

    public void setLst(ArrayList<String> lst) {
        this.lst = lst;
    }

    public ArrayList<Global> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Global> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<Global> getLstSubcircuitos() {
        return lstSubcircuitos;
    }

    public void setLstSubcircuitos(ArrayList<Global> lstSubcircuitos) {
        this.lstSubcircuitos = lstSubcircuitos;
    }

    public CartesianChartModel getGraficaCircuito() {
        return graficaCircuito;
    }

    public void setGraficaCircuito(CartesianChartModel graficaCircuito) {
        this.graficaCircuito = graficaCircuito;
    }

    public CartesianChartModel getGraficaSubcircuito() {
        return graficaSubcircuito;
    }

    public void setGraficaSubcircuito(CartesianChartModel graficaSubcircuito) {
        this.graficaSubcircuito = graficaSubcircuito;
    }

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    /*
     ** Constructor
     */
    public CtrlSpaCircuitoSubcircuito() {
        this.reinit();

    }

    private void reinit() {
        this.lstCircuitos = new ArrayList<Global>();
        this.lstSubcircuitos = new ArrayList<Global>();
        this.graficar();

    }

    @PostConstruct
    public void graficar() {
        graficaCircuito=graficoCircuitos(anioSel);
        graficaSubcircuito=graficoSubcircuitos(anioSel);

    }

    private CartesianChartModel graficoCircuitos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lst = CircuitosSubcircuitos.obtenerCircuitosUrbanos();
            ChartSeries circuitos = new ChartSeries();
            
            circuitos.setLabel("Circuito");
            
            for (String lst1 : lst) {
                lstCircuitos = FGlobal.ObtenerDatosDadoAnioDadoCircuito(anio, lst1);
                circuitos.set(lst1, lstCircuitos.size());
            }
            
            model.addSeries(circuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel graficoSubcircuitos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lst = CircuitosSubcircuitos.obtenerSubcircuitosUrbanos();
            ChartSeries subcircuitos = new ChartSeries();
            
            subcircuitos.setLabel("Subcircuito");
            
            for (String lst1 : lst) {
                lstSubcircuitos = FGlobal.ObtenerDatosDadoAnioDadoSubCircuito(anio, lst1);
                subcircuitos.set(lst1, lstSubcircuitos.size());
            }
            
            model.addSeries(subcircuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
