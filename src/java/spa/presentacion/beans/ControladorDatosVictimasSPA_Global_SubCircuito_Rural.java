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
public class ControladorDatosVictimasSPA_Global_SubCircuito_Rural {

    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPASubCircuitosRural;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstSubCircuitoRural;
    private Global datoSel;
    private PieChartModel pieSubCircuitoRural;
    private int anioSel;
    private ArrayList<String> lstSubCircuitosRural;
    private ArrayList<Global> lstSubCircuitoGlobalRural;

    public CartesianChartModel getLineSPASubCircuitosRural() {
        return lineSPASubCircuitosRural;
    }

    public void setLineSPASubCircuitosRural(CartesianChartModel lineSPASubCircuitosRural) {
        this.lineSPASubCircuitosRural = lineSPASubCircuitosRural;
    }

    public ArrayList<Global> getLstSubCircuitoRural() {
        return lstSubCircuitoRural;
    }

    public void setLstSubCircuitoRural(ArrayList<Global> lstSubCircuitoRural) {
        this.lstSubCircuitoRural = lstSubCircuitoRural;
    }

    public PieChartModel getPieSubCircuitoRural() {
        return pieSubCircuitoRural;
    }

    public void setPieSubCircuitoRural(PieChartModel pieSubCircuitoRural) {
        this.pieSubCircuitoRural = pieSubCircuitoRural;
    }

    public ArrayList<String> getLstSubCircuitosRural() {
        return lstSubCircuitosRural;
    }

    public void setLstSubCircuitosRural(ArrayList<String> lstSubCircuitosRural) {
        this.lstSubCircuitosRural = lstSubCircuitosRural;
    }

    public ArrayList<Global> getLstSubCircuitoGlobalRural() {
        return lstSubCircuitoGlobalRural;
    }

    public void setLstSubCircuitoGlobalRural(ArrayList<Global> lstSubCircuitoGlobalRural) {
        this.lstSubCircuitoGlobalRural = lstSubCircuitoGlobalRural;
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
        this.lineSPASubCircuitosRural = graficaSubCircuitosRural(anioSel);
    }

    private void reinit() {
        this.init();
    }

    public ControladorDatosVictimasSPA_Global_SubCircuito_Rural() {
        this.reinit();
    }

    private CartesianChartModel graficaSubCircuitosRural(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstSubCircuitosRural = CircuitoSubcircuitoRural.obtenerSubcircuitoRural();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstSubCircuitosRural.size(); i++) {
                lstSubCircuitoGlobalRural = FGlobal.ObtenerDatosDadoAnioDadoSubCircuito(2013, lstSubCircuitosRural.get(i));
                System.out.println(lstSubCircuitosRural.get(i) + "Dimension: " + lstSubCircuitoGlobalRural.size());
                anios.set(lstSubCircuitosRural.get(i), lstSubCircuitoGlobalRural.size());
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
