/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2011;
import denunciasfiscalia.logica.funciones.FFiscalia_2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2011_EstadisticasGenerales {

    /**
     * Creates a new instance of ControladorFiscalia2011_EstadisticasGenerales
     */
    private ArrayList<Fiscalia_2011> lstDatos;
    private ArrayList<Fiscalia_2011> lstDatos1;
    private Fiscalia_2011 datoSel;
    private Fiscalia_2011 objFiscalia_2011;
    private ArrayList<Fiscalia_2011> lstDatosDadoViolencia;
    private ArrayList<Fiscalia_2011> lstDatosDadoCircuito;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineCircuito;
    private PieChartModel pieViolencia;

    public PieChartModel getPieViolencia() {
        return pieViolencia;
    }

    public void setPieViolencia(PieChartModel pieViolencia) {
        this.pieViolencia = pieViolencia;
    }

    public ArrayList<Fiscalia_2011> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Fiscalia_2011> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<Fiscalia_2011> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public CartesianChartModel getLineCircuito() {
        return lineCircuito;
    }

    public void setLineCircuito(CartesianChartModel lineCircuito) {
        this.lineCircuito = lineCircuito;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoViolencia() {
        return lstDatosDadoViolencia;
    }

    public void setLstDatosDadoViolencia(ArrayList<Fiscalia_2011> lstDatosDadoViolencia) {
        this.lstDatosDadoViolencia = lstDatosDadoViolencia;
    }

    public ArrayList<Fiscalia_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Fiscalia_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public Fiscalia_2011 getObjFiscalia_2011() {
        return objFiscalia_2011;
    }

    public void setObjFiscalia_2011(Fiscalia_2011 objFiscalia_2011) {
        this.objFiscalia_2011 = objFiscalia_2011;
    }

    public void grficar() {
        lineCircuito = initCircuito();
        lineTipoViolencia = initTipoViolencia();
        pieViolencia=pieViolencia();

    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public ControladorFiscalia2011_EstadisticasGenerales() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Fiscalia_2011>();
        this.lstDatos1 = new ArrayList<Fiscalia_2011>();
        this.lstDatosDadoViolencia = new ArrayList<Fiscalia_2011>();
        this.lstDatosDadoCircuito = new ArrayList<Fiscalia_2011>();
        this.objFiscalia_2011 = new Fiscalia_2011();
        this.datoSel = new Fiscalia_2011();

        this.cargarDatos();
        this.init();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FFiscalia_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    private CartesianChartModel initTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            for (int i = 0; i < lstDatos1.size(); i++) {
                lstDatosDadoViolencia = FFiscalia_2011.ObtenerDatosDadoTipoAgresion(lstDatos1.get(i).getTipo_agresion());
                Violencia.set(lstDatos1.get(i).getTipo_agresion(), lstDatosDadoViolencia.size());
            }

            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Tipos de Violencia");
            for (int i = 0; i < lstDatos1.size(); i++) {
                lstDatosDadoCircuito = FFiscalia_2011.ObtenerDatosDadoCircuito(lstDatos1.get(i).getCircuito());
                Circuito.set(lstDatos1.get(i).getCircuito(), lstDatosDadoCircuito.size());
            }
            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
//            lstDatosFisica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica");

            for (int i = 0; i < lstDatos1.size(); i++) {
                lstDatosDadoViolencia = FFiscalia_2011.ObtenerDatosDadoTipoAgresion(lstDatos1.get(i).getTipo_agresion());
                pieModel.set(lstDatos1.get(i).getTipo_agresion(), lstDatosDadoViolencia.size());
            }
//            pieModel.set("Fisica", lstDatosFisica.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

}
