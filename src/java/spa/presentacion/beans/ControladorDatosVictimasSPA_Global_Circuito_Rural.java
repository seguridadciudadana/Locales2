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
import org.primefaces.model.chart.PieChartModel;
import recursos.CircuitoSubcircuitoRural;
import recursos.CircuitoSubcircuitoUrbano;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Cristhian Moreno
 */
@ManagedBean
@RequestScoped
public class ControladorDatosVictimasSPA_Global_Circuito_Rural {

    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPACircuitosRural;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstCircuitoRural;
    private ArrayList<Global> lstCircuitoGlobalRural;
    private Global datoSel;
    private PieChartModel pieCircuitoRural;
    private int anioSel;
    private ArrayList<String> lstCircuitosRural;

    public CartesianChartModel getLineSPACircuitosRural() {
        return lineSPACircuitosRural;
    }

    public void setLineSPACircuitosRural(CartesianChartModel lineSPACircuitosRural) {
        this.lineSPACircuitosRural = lineSPACircuitosRural;
    }

    public ArrayList<Global> getLstCircuitoRural() {
        return lstCircuitoRural;
    }

    public void setLstCircuitoRural(ArrayList<Global> lstCircuitoRural) {
        this.lstCircuitoRural = lstCircuitoRural;
    }

    public ArrayList<Global> getLstCircuitoGlobalRural() {
        return lstCircuitoGlobalRural;
    }

    public void setLstCircuitoGlobalRural(ArrayList<Global> lstCircuitoGlobalRural) {
        this.lstCircuitoGlobalRural = lstCircuitoGlobalRural;
    }

    public PieChartModel getPieCircuitoRural() {
        return pieCircuitoRural;
    }

    public void setPieCircuitoRural(PieChartModel pieCircuitoRural) {
        this.pieCircuitoRural = pieCircuitoRural;
    }

    public ArrayList<String> getLstCircuitosRural() {
        return lstCircuitosRural;
    }

    public void setLstCircuitosRural(ArrayList<String> lstCircuitosRural) {
        this.lstCircuitosRural = lstCircuitosRural;
    }


    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public ArrayList<Global> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Global> lstDatos) {
        this.lstDatos = lstDatos;
    }

   
    public ArrayList<Global> getLstDatosSF() {
        return lstDatosSF;
    }

    public void setLstDatosSF(ArrayList<Global> lstDatosSF) {
        this.lstDatosSF = lstDatosSF;
    }

    

    public Global getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Global datoSel) {
        this.datoSel = datoSel;
    }

   

    @PostConstruct
    public void init() {
        this.lineSPACircuitosRural = graficaCircuitoRural(anioSel);
    }

    private void reinit() {
        this.init();
    }

    public ControladorDatosVictimasSPA_Global_Circuito_Rural() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitoRural(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstCircuitosRural = CircuitoSubcircuitoRural.obtenerCircuitoRural();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstCircuitosRural.size(); i++) {
                lstCircuitoGlobalRural = FGlobal.ObtenerDatosDadoAnioDadoCircuito(2013, lstCircuitosRural.get(i));
                System.out.println(lstCircuitosRural.get(i) + "Dimension: " + lstCircuitoGlobalRural.size());
                anios.set(lstCircuitosRural.get(i), lstCircuitoGlobalRural.size());
            }

            model1.addSeries(anios);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

   /* private CartesianChartModel graficaCircuitosUrbanos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            this.lstDatos = FGlobal.ObtenerDatosDadoAnioCircuito(anioSel);
            ChartSeries anio13 = new ChartSeries();
//            anio13.setLabel("2013");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstCircuito2013 = FGlobal.ObtenerDatosDadoAnioDadoCircuito(anioSel, lstDatos.get(i).getCircuito());
                anio13.set(lstDatos.get(i).getCircuito(), lstCircuito2013.size());
            }
            model.addSeries(anio13);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }*/

}
