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
public class ControladorDatosVictimasSPA_Global_Parentesco_Victima_Agresor {

    private ArrayList<Global> lstDatos;
    private CartesianChartModel lineSPAParentescoGlobal;
    private ArrayList<Global> lstDatosSF;
    private ArrayList<Global> lstParentesco;
    private ArrayList<Global> lstParentescoGlobal;
    private Global datoSel;
    private PieChartModel pieCircuito;
    private int anioSel;

    public CartesianChartModel getLineSPAParentescoGlobal() {
        return lineSPAParentescoGlobal;
    }

    public void setLineSPAParentescoGlobal(CartesianChartModel lineSPAParentescoGlobal) {
        this.lineSPAParentescoGlobal = lineSPAParentescoGlobal;
    }

    public ArrayList<Global> getLstParentesco() {
        return lstParentesco;
    }

    public void setLstParentesco(ArrayList<Global> lstParentesco) {
        this.lstParentesco = lstParentesco;
    }

    public ArrayList<Global> getLstParentescoGlobal() {
        return lstParentescoGlobal;
    }

    public void setLstParentescoGlobal(ArrayList<Global> lstParentescoGlobal) {
        this.lstParentescoGlobal = lstParentescoGlobal;
    }

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
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
        this.lineSPAParentescoGlobal = graficaParentescoGlobal(anioSel);
    }

    //public void graficar() {
    //lineModelCircuito = graficaCircuito();
    //lineModelSubCircuito = graficaSubcircuito();
    //GraficaCircuitoSexoVictima = graficaCircuitoSV();
    //lineModelSubcircuitoSexoVictima=graficaSubCircuitoSV();
    // this.lineSPATipoAgresion13 = graficaTipoAgresion13(anioSel);
    //   this.lineSPATipoAgresion14 = graficaTipoAgresion14();
    //}
    private void reinit() {

        this.init();
    }

    public ControladorDatosVictimasSPA_Global_Parentesco_Victima_Agresor() {
        this.reinit();
    }

    private CartesianChartModel graficaParentescoGlobal(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FGlobal.ObtenerDatosDadoAnioParentescoVictimaAgresor(anioSel);
            ChartSeries anio13 = new ChartSeries();

            for (int i = 0; i < lstDatos.size(); i++) {
                lstParentescoGlobal = FGlobal.ObtenerDatosDadoAnioDadoParentescoVictimaAgresor(anio, lstDatos.get(i).getParentesco_victima_agresor());
                anio13.set(lstDatos.get(i).getParentesco_victima_agresor(), lstParentescoGlobal.size());
            }
            model.addSeries(anio13);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    /* private CartesianChartModel graficaTipoAgresion14() {
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
     }*/
}
