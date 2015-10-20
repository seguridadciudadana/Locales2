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
public class CtrlSpaCircSubcSexoVictima implements Serializable {

    /**
     * Creates a new instance of CtrlSpaCircSubcSexoVictima
     */
    private int anioSel;
    private ArrayList<String> lst;
    private ArrayList<Global> lstCircuitos;
    private ArrayList<Global> lstSubcircuitos;
    private CartesianChartModel graficaCircuito;
    private CartesianChartModel graficaSubcircuito;

    /*
     *** Métodos de acceso
     */
    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

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

    /*
     ** Operaciones
     */
    public CtrlSpaCircSubcSexoVictima() {
        this.reinit();
    }

    private void reinit() {
        this.lstCircuitos = new ArrayList<Global>();
        this.lstSubcircuitos = new ArrayList<Global>();
        this.graficar();

    }

    @PostConstruct
    public void graficar() {
        graficaCircuito = graficoCircuitos(anioSel);
        graficaSubcircuito = graficoSubcircuitos(anioSel);

    }

    private CartesianChartModel graficoCircuitos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lst = CircuitosSubcircuitos.obtenerCircuitosUrbanos();
            ChartSeries masculino = new ChartSeries();

            masculino.setLabel("Masculino");
            for(int i=0;i<lst.size();i++){
                lstCircuitos=FGlobal.ObtenerDatosDadoAnioCircuitoSexo(anio, lst.get(i), "M");
                masculino.set(lst.get(i), lstCircuitos.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            for (String lst1 : lst) {
                lstCircuitos = FGlobal.ObtenerDatosDadoAnioCircuitoSexo(anio, lst1, "F");
                femenino.set(lst1, lstCircuitos.size());
            }

            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoSubcircuitos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lst = CircuitosSubcircuitos.obtenerSubcircuitosUrbanos();
            ChartSeries masculino = new ChartSeries();

            masculino.setLabel("Masculino");
            for (String lst1 : lst) {
                lstCircuitos = FGlobal.ObtenerDatosDadoAnioSubcircuitoSexo(anio, lst1, "M");
                masculino.set(lst1, lstCircuitos.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            for (String lst1 : lst) {
                lstCircuitos = FGlobal.ObtenerDatosDadoAnioSubcircuitoSexo(anio, lst1, "F");
                femenino.set(lst1, lstCircuitos.size());
            }

            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
