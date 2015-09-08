/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans.reincidentes;

import geoportal.logica.clases.VictimasReincidentes2010;
import geoportal.logica.funciones.FVictimasReincidentes;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorReincidentes2010 {

    private CartesianChartModel lineReincidencias;
    private CartesianChartModel lineReincidenciasSV;
    private ArrayList<VictimasReincidentes2010> lstDatos;
    private ArrayList<VictimasReincidentes2010> lstDatosDadoReincidencia;
    private ArrayList<VictimasReincidentes2010> lstDatosDadoReincidenciaSM;
    private ArrayList<VictimasReincidentes2010> lstDatosDadoReincidenciaSF;
    private ArrayList<VictimasReincidentes2010> lstDatosReincidencia;

    public CartesianChartModel getLineReincidencias() {
        return lineReincidencias;
    }

    public void setLineReincidencias(CartesianChartModel lineReincidencias) {
        this.lineReincidencias = lineReincidencias;
    }

    public CartesianChartModel getLineReincidenciasSV() {
        return lineReincidenciasSV;
    }

    public void setLineReincidenciasSV(CartesianChartModel lineReincidenciasSV) {
        this.lineReincidenciasSV = lineReincidenciasSV;
    }

    public ArrayList<VictimasReincidentes2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VictimasReincidentes2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VictimasReincidentes2010> getLstDatosDadoReincidencia() {
        return lstDatosDadoReincidencia;
    }

    public void setLstDatosDadoReincidencia(ArrayList<VictimasReincidentes2010> lstDatosDadoReincidencia) {
        this.lstDatosDadoReincidencia = lstDatosDadoReincidencia;
    }

    public ArrayList<VictimasReincidentes2010> getLstDatosDadoReincidenciaSM() {
        return lstDatosDadoReincidenciaSM;
    }

    public void setLstDatosDadoReincidenciaSM(ArrayList<VictimasReincidentes2010> lstDatosDadoReincidenciaSM) {
        this.lstDatosDadoReincidenciaSM = lstDatosDadoReincidenciaSM;
    }

    public ArrayList<VictimasReincidentes2010> getLstDatosDadoReincidenciaSF() {
        return lstDatosDadoReincidenciaSF;
    }

    public void setLstDatosDadoReincidenciaSF(ArrayList<VictimasReincidentes2010> lstDatosDadoReincidenciaSF) {
        this.lstDatosDadoReincidenciaSF = lstDatosDadoReincidenciaSF;
    }

    public ArrayList<VictimasReincidentes2010> getLstDatosReincidencia() {
        return lstDatosReincidencia;
    }

    public void setLstDatosReincidencia(ArrayList<VictimasReincidentes2010> lstDatosReincidencia) {
        this.lstDatosReincidencia = lstDatosReincidencia;
    }
    
    

    public ControladorReincidentes2010() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();


    }

    public void graficar() {
        lineReincidencias = initReincidencias2010();   
        lineReincidenciasSV=initReincidencias2010SV();
    }

    
    private CartesianChartModel initReincidencias2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            //lstDatos = FReincidencias2010.ObtenerDatos();
            lstDatos=FVictimasReincidentes.ObtenerDatos();
            ChartSeries Reincidencias = new ChartSeries();            
            Reincidencias.setLabel("Reincidencias");
            for (int i=0;i<lstDatos.size();i++) {
                lstDatosDadoReincidencia = FVictimasReincidentes.ObtenerDatosDadoReincidencias(lstDatos.get(i).getReincidencia());
                Reincidencias.set(lstDatos.get(i).getReincidencia(), lstDatosDadoReincidencia.size());
            }
            model.addSeries(Reincidencias);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel initReincidencias2010SV() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            //lstDatos = FReincidencias2010.ObtenerDatos();
            lstDatos=FVictimasReincidentes.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();            
            Masculino.setLabel("Masculino");
            for (int i=0;i<lstDatos.size();i++) {
                lstDatosDadoReincidenciaSM = FVictimasReincidentes.ObtenerDatosDadoReincidenciasSexo(lstDatos.get(i).getReincidencia(), "M");
                Masculino.set(lstDatos.get(i).getReincidencia(), lstDatosDadoReincidenciaSM.size());
            }
            
            ChartSeries Femenino = new ChartSeries();            
            Femenino.setLabel("Femenino");
            for (int i=0;i<lstDatos.size();i++) {
                lstDatosDadoReincidenciaSF = FVictimasReincidentes.ObtenerDatosDadoReincidenciasSexo(lstDatos.get(i).getReincidencia(), "F");
                Femenino.set(lstDatos.get(i).getReincidencia(), lstDatosDadoReincidenciaSF.size());
            }
            
model1.addSeries(Femenino);
            model1.addSeries(Masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }
    
}
