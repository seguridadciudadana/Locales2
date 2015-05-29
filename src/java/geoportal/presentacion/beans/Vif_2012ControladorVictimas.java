/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import java.util.List;
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
public class Vif_2012ControladorVictimas {

    /**
     * Creates a new instance of Vif_2012ControladorVictimas
     */
    private CartesianChartModel lineModel_Victima_Circuito; //lineModel6
    private CartesianChartModel lineModel_Victima_Subcircuito;
    private CartesianChartModel lineModel8;
    private Vif_2012 objDatos;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatosFecha;
    private ArrayList<Vif_2012> lstDatos1;
    private ArrayList<Vif_2012> lstDatos3;
    private ArrayList<Vif_2012> lstDatos5;
    private ArrayList<Vif_2012> lstDatos7;
    private ArrayList<Vif_2012> lstDatosCopia;
    private ArrayList<Vif_2012> lstDatos9;
    private ArrayList<Vif_2012> lstDatos10;
    List<Integer> listaEdad = new ArrayList<Integer>();

    public CartesianChartModel getLineModel_Victima_Circuito() {
        return lineModel_Victima_Circuito;
    }

    public void setLineModel_Victima_Circuito(CartesianChartModel lineModel_Victima_Circuito) {
        this.lineModel_Victima_Circuito = lineModel_Victima_Circuito;
    }

    public CartesianChartModel getLineModel_Victima_Subcircuito() {
        return lineModel_Victima_Subcircuito;
    }

    public void setLineModel_Victima_Subcircuito(CartesianChartModel lineModel_Victima_Subcircuito) {
        this.lineModel_Victima_Subcircuito = lineModel_Victima_Subcircuito;
    }

    public CartesianChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(CartesianChartModel lineModel8) {
        this.lineModel8 = lineModel8;
    }

    public Vif_2012 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2012 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2012> getLstDatosFecha() {
        return lstDatosFecha;
    }

    public void setLstDatosFecha(ArrayList<Vif_2012> lstDatosFecha) {
        this.lstDatosFecha = lstDatosFecha;
    }

    public ArrayList<Vif_2012> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2012> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Vif_2012> getLstDatos3() {
        return lstDatos3;
    }

    public void setLstDatos3(ArrayList<Vif_2012> lstDatos3) {
        this.lstDatos3 = lstDatos3;
    }

    public ArrayList<Vif_2012> getLstDatos5() {
        return lstDatos5;
    }

    public void setLstDatos5(ArrayList<Vif_2012> lstDatos5) {
        this.lstDatos5 = lstDatos5;
    }

    public ArrayList<Vif_2012> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2012> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

    public ArrayList<Vif_2012> getLstDatosCopia() {
        return lstDatosCopia;
    }

    public void setLstDatosCopia(ArrayList<Vif_2012> lstDatosCopia) {
        this.lstDatosCopia = lstDatosCopia;
    }

    public ArrayList<Vif_2012> getLstDatos9() {
        return lstDatos9;
    }

    public void setLstDatos9(ArrayList<Vif_2012> lstDatos9) {
        this.lstDatos9 = lstDatos9;
    }

    public ArrayList<Vif_2012> getLstDatos10() {
        return lstDatos10;
    }

    public void setLstDatos10(ArrayList<Vif_2012> lstDatos10) {
        this.lstDatos10 = lstDatos10;
    }

    public List<Integer> getListaEdad() {
        return listaEdad;
    }

    public void setListaEdad(List<Integer> listaEdad) {
        this.listaEdad = listaEdad;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

   private void reinit() {
        this.objDatos = new Vif_2012();
        this.datoSel = new Vif_2012();
        this.lstDatos = new ArrayList<Vif_2012>();
        this.lstDatos1 = new ArrayList<Vif_2012>();
        this.listaEdad = new ArrayList<Integer>();
        this.lstDatos3 = new ArrayList<Vif_2012>();
        this.lstDatos5 = new ArrayList<Vif_2012>();
        this.lstDatos7 = new ArrayList<Vif_2012>();
        this.lstDatosCopia = new ArrayList<Vif_2012>();
        this.lstDatosFecha = new ArrayList<Vif_2012>();
        this.lstDatos9 = new ArrayList<Vif_2012>();
        this.lstDatos10 = new ArrayList<Vif_2012>();
        this.cargarDatos();
        this.init();
    }
    public void graficar() {

        lineModel_Victima_Circuito = initCategoryModelSexoV();
        lineModel_Victima_Subcircuito = initCategoryModelSexoSubV();
        //lineModel8 = initCategoryModelSexoSubV();

    }

    public Vif_2012ControladorVictimas() {
        this.reinit();
    }

    private CartesianChartModel initCategoryModelSexoV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries CircuitoSexoMV = new ChartSeries();
            CircuitoSexoMV.setLabel("Masculino");
            for (Vif_2012 lstDato : lstDatos) {
                lstDatos1 = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", lstDato.getPcircuito());
                CircuitoSexoMV.set(lstDato.getPcircuito(), lstDatos1.size());
            }
            ChartSeries CircuitoSexoFV = new ChartSeries();
            CircuitoSexoFV.setLabel("Femenino");
            for (Vif_2012 lstDato : lstDatos) {
                lstDatos3 = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", lstDato.getPcircuito());
                CircuitoSexoFV.set(lstDato.getPcircuito(), lstDatos3.size());
            }
            model.addSeries(CircuitoSexoMV);
            model.addSeries(CircuitoSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryModelSexoSubV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries SubCircuitoSexoMV = new ChartSeries();
            SubCircuitoSexoMV.setLabel("Masculino");
            for (Vif_2012 lstDato : lstDatos) {
                lstDatos5 = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", lstDato.getPsubcircuito());
                SubCircuitoSexoMV.set(lstDato.getPsubcircuito(), lstDatos5.size());
            }

            ChartSeries SubCircuitoSexoFV = new ChartSeries();
            SubCircuitoSexoFV.setLabel("Femenino");
            for (Vif_2012 lstDato : lstDatos) {
                lstDatos7 = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", lstDato.getPsubcircuito());
                SubCircuitoSexoFV.set(lstDato.getPsubcircuito(), lstDatos7.size());
            }
            model.addSeries(SubCircuitoSexoMV);
            model.addSeries(SubCircuitoSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
