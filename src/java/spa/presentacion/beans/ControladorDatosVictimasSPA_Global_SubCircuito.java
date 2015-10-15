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
public class ControladorDatosVictimasSPA_Global_SubCircuito {

    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPASubCircuitos;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstSubCircuito;
    private Global datoSel;
    private PieChartModel pieSubCircuito;
    private int anioSel;
    private ArrayList<String> lstSubCircuitos;
    private ArrayList<Global> lstSubCircuitoGlobal;

    public ArrayList<Global> getLstSubCircuitoGlobal() {
        return lstSubCircuitoGlobal;
    }

    public void setLstSubCircuitoGlobal(ArrayList<Global> lstSubCircuitoGlobal) {
        this.lstSubCircuitoGlobal = lstSubCircuitoGlobal;
    }

    

    public CartesianChartModel getLineSPASubCircuitos() {
        return lineSPASubCircuitos;
    }

    public void setLineSPASubCircuitos(CartesianChartModel lineSPASubCircuitos) {
        this.lineSPASubCircuitos = lineSPASubCircuitos;
    }

    public ArrayList<Global> getLstSubCircuito() {
        return lstSubCircuito;
    }

    public void setLstSubCircuito(ArrayList<Global> lstSubCircuito) {
        this.lstSubCircuito = lstSubCircuito;
    }

    public PieChartModel getPieSubCircuito() {
        return pieSubCircuito;
    }

    public void setPieSubCircuito(PieChartModel pieSubCircuito) {
        this.pieSubCircuito = pieSubCircuito;
    }

    public ArrayList<String> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<String> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
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
        this.lineSPASubCircuitos = graficaSubCircuitos(anioSel);
    }

    private void reinit() {
        this.init();
    }

    public ControladorDatosVictimasSPA_Global_SubCircuito() {
        this.reinit();
    }

    private CartesianChartModel graficaSubCircuitos(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstSubCircuitos = CircuitoSubcircuitoUrbano.obtenerSubcircuitoUrbano();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstSubCircuitoGlobal = FGlobal.ObtenerDatosDadoAnioDadoSubCircuito(anio, lstSubCircuitos.get(i));
                System.out.println(lstSubCircuitos.get(i) + "Dimension: " + lstSubCircuitoGlobal.size());
                anios.set(lstSubCircuitos.get(i), lstSubCircuitoGlobal.size());
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
