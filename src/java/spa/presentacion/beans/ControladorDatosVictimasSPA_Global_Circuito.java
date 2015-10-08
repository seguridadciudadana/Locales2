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
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Cristhian Moreno
 */
@ManagedBean
@RequestScoped
public class ControladorDatosVictimasSPA_Global_Circuito {
    
    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPACircuito13;
    private CartesianChartModel lineSPACircuito14;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstCircuito;
    private ArrayList<Global> lstCircuito2013;
    private ArrayList<Global> lstCircuito2014;
    private Global datoSel;
    private PieChartModel pieCircuito;

    public ArrayList<Global> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Global> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public CartesianChartModel getLineSPACircuito13() {
        return lineSPACircuito13;
    }

    public void setLineSPACircuito13(CartesianChartModel lineSPACircuito13) {
        this.lineSPACircuito13 = lineSPACircuito13;
    }

    public CartesianChartModel getLineSPACircuito14() {
        return lineSPACircuito14;
    }

    public void setLineSPACircuito14(CartesianChartModel lineSPACircuito14) {
        this.lineSPACircuito14 = lineSPACircuito14;
    }

    public ArrayList<Global> getLstDatosSF() {
        return lstDatosSF;
    }

    public void setLstDatosSF(ArrayList<Global> lstDatosSF) {
        this.lstDatosSF = lstDatosSF;
    }

    public ArrayList<Global> getLstCircuito() {
        return lstCircuito;
    }

    public void setLstCircuito(ArrayList<Global> lstCircuito) {
        this.lstCircuito = lstCircuito;
    }

    public ArrayList<Global> getLstCircuito2013() {
        return lstCircuito2013;
    }

    public void setLstCircuito2013(ArrayList<Global> lstCircuito2013) {
        this.lstCircuito2013 = lstCircuito2013;
    }

    public ArrayList<Global> getLstCircuito2014() {
        return lstCircuito2014;
    }

    public void setLstCircuito2014(ArrayList<Global> lstCircuito2014) {
        this.lstCircuito2014 = lstCircuito2014;
    }

    public Global getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Global datoSel) {
        this.datoSel = datoSel;
    }

    public PieChartModel getPieCircuito() {
        return pieCircuito;
    }

    public void setPieCircuito(PieChartModel pieCircuito) {
        this.pieCircuito = pieCircuito;
    }
    
     @PostConstruct
    public void init() {
        graficar();
    }
    public void graficar() {
        
        this.lineSPACircuito13 = graficaCircuito13();
        //this.lineSPACircuito14 = graficaCircuito14();
    }
    
    private void reinit() {
        this.lstDatos = new ArrayList<Global>();
        this.init();
    }

     public ControladorDatosVictimasSPA_Global_Circuito () {
     this.reinit();
     }
     
     
     private CartesianChartModel graficaCircuito13() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FGlobal.ObtenerDatosDadoAnioCircuito(2013);
            ChartSeries anio13 = new ChartSeries();
            anio13.setLabel("2013");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstCircuito2013=FGlobal.ObtenerDatosDadoAnioDadoCircuito(2013, lstDatos.get(i).getCircuito());
                anio13.set(lstDatos.get(i).getCircuito(), lstCircuito2013.size());
            }
            model.addSeries(anio13);
        } catch (Exception e) {
              Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    
}
