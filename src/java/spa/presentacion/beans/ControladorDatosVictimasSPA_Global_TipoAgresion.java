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
public class ControladorDatosVictimasSPA_Global_TipoAgresion {

    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPATipoAgresion13;
    private CartesianChartModel lineSPATipoAgresion14;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstTipoAgresion;
    private ArrayList<Global> lstTipoAgresion2013;
    private ArrayList<Global> lstTipoAgresion2014;
    private Global datoSel;
    private PieChartModel pieCircuito;

    public ArrayList<Global> getLstTipoAgresion2014() {
        return lstTipoAgresion2014;
    }

    public void setLstTipoAgresion2014(ArrayList<Global> lstTipoAgresion2014) {
        this.lstTipoAgresion2014 = lstTipoAgresion2014;
    }

    public CartesianChartModel getLineSPATipoAgresion13() {
        return lineSPATipoAgresion13;
    }

    public void setLineSPATipoAgresion13(CartesianChartModel lineSPATipoAgresion13) {
        this.lineSPATipoAgresion13 = lineSPATipoAgresion13;
    }

    public CartesianChartModel getLineSPATipoAgresion14() {
        return lineSPATipoAgresion14;
    }

    public void setLineSPATipoAgresion14(CartesianChartModel lineSPATipoAgresion14) {
        this.lineSPATipoAgresion14 = lineSPATipoAgresion14;
    }

    public ArrayList<Global> getLstTipoAgresion2013() {
        return lstTipoAgresion2013;
    }

    public void setLstTipoAgresion2013(ArrayList<Global> lstTipoAgresion2013) {
        this.lstTipoAgresion2013 = lstTipoAgresion2013;
    }

    public ArrayList<Global> getLstTipoAgresion() {
        return lstTipoAgresion;
    }

    public void setLstTipoAgresion(ArrayList<Global> lstTipoAgresion) {
        this.lstTipoAgresion = lstTipoAgresion;
    }

   

    private Global objSPA2013;

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

    public void setPieCircuito(PieChartModel pieCircuito) {
        this.pieCircuito = pieCircuito;
    }

    public Global getObjSPA2013() {
        return objSPA2013;
    }

    public void setObjSPA2013(Global objSPA2013) {
        this.objSPA2013 = objSPA2013;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        //lineModelCircuito = graficaCircuito();
        //lineModelSubCircuito = graficaSubcircuito();
        //GraficaCircuitoSexoVictima = graficaCircuitoSV();
        //lineModelSubcircuitoSexoVictima=graficaSubCircuitoSV();

        this.lineSPATipoAgresion13 = graficaTipoAgresion13();
        this.lineSPATipoAgresion14 = graficaTipoAgresion14();
        

    }

    private void reinit() {
        this.lstDatos = new ArrayList<Global>();

        //this.cargarDatos();
        this.init();
    }

    public ControladorDatosVictimasSPA_Global_TipoAgresion() {
        this.reinit();
    }

    private CartesianChartModel graficaTipoAgresion13() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FGlobal.ObtenerDatosDadoAnioTipoAgresion(2013);
            ChartSeries anio13 = new ChartSeries();
            anio13.setLabel("2013");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstTipoAgresion2013=FGlobal.ObtenerDatosDadoAnioDadoTipoAgresion(2013, lstDatos.get(i).getTipo_agresion());
                anio13.set(lstDatos.get(i).getTipo_agresion(), lstTipoAgresion2013.size());
            }
            model.addSeries(anio13);
        } catch (Exception e) {
              Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
     private CartesianChartModel graficaTipoAgresion14() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FGlobal.ObtenerDatosDadoAnioTipoAgresion(2014);
            ChartSeries anio14 = new ChartSeries();
            anio14.setLabel("2014");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstTipoAgresion2014=FGlobal.ObtenerDatosDadoAnioDadoTipoAgresion(2014, lstDatos.get(i).getTipo_agresion());
                anio14.set(lstDatos.get(i).getTipo_agresion(), lstTipoAgresion2014.size());
            }
            model.addSeries(anio14);
        } catch (Exception e) {
              Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
