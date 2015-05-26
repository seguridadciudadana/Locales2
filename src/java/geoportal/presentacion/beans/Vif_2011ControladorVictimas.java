/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.io.Serializable;
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
public class Vif_2011ControladorVictimas {

    /**
     * Creates a new instance of Vif_2011ControladorVictimas
     */
    private CartesianChartModel lineModel_Victima_Circuito; //lineModel6
    private CartesianChartModel lineModel_Victima_Subcircuito;
    private CartesianChartModel lineModel8;
    private Vif_2011 objDatos;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatos;
    private ArrayList<Vif_2011> lstDatosFecha;
    private ArrayList<Vif_2011> lstDatos1;
    private ArrayList<Vif_2011> lstDatos3;
    private ArrayList<Vif_2011> lstDatos5;
    private ArrayList<Vif_2011> lstDatos7;
    private ArrayList<Vif_2011> lstDatosCopia;
    private ArrayList<Vif_2011> lstDatos9;
    private ArrayList<Vif_2011> lstDatos10;
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

    public Vif_2011 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2011 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2011> getLstDatosFecha() {
        return lstDatosFecha;
    }

    public void setLstDatosFecha(ArrayList<Vif_2011> lstDatosFecha) {
        this.lstDatosFecha = lstDatosFecha;
    }

    public ArrayList<Vif_2011> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2011> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Vif_2011> getLstDatos3() {
        return lstDatos3;
    }

    public void setLstDatos3(ArrayList<Vif_2011> lstDatos3) {
        this.lstDatos3 = lstDatos3;
    }

    public ArrayList<Vif_2011> getLstDatos5() {
        return lstDatos5;
    }

    public void setLstDatos5(ArrayList<Vif_2011> lstDatos5) {
        this.lstDatos5 = lstDatos5;
    }

    public ArrayList<Vif_2011> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2011> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

    public ArrayList<Vif_2011> getLstDatosCopia() {
        return lstDatosCopia;
    }

    public void setLstDatosCopia(ArrayList<Vif_2011> lstDatosCopia) {
        this.lstDatosCopia = lstDatosCopia;
    }

    public ArrayList<Vif_2011> getLstDatos9() {
        return lstDatos9;
    }

    public void setLstDatos9(ArrayList<Vif_2011> lstDatos9) {
        this.lstDatos9 = lstDatos9;
    }

    public ArrayList<Vif_2011> getLstDatos10() {
        return lstDatos10;
    }

    public void setLstDatos10(ArrayList<Vif_2011> lstDatos10) {
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
        grficar();
    }

    private void reinit() {
        this.objDatos = new Vif_2011();
        this.datoSel = new Vif_2011();
        this.lstDatos = new ArrayList<Vif_2011>();
        this.lstDatos1 = new ArrayList<Vif_2011>();
        this.listaEdad = new ArrayList<Integer>();
        this.lstDatos3 = new ArrayList<Vif_2011>();
        this.lstDatos5 = new ArrayList<Vif_2011>();
        this.lstDatos7 = new ArrayList<Vif_2011>();
        this.lstDatosCopia = new ArrayList<Vif_2011>();
        this.lstDatosFecha = new ArrayList<Vif_2011>();
        this.lstDatos9 = new ArrayList<Vif_2011>();
        this.lstDatos10 = new ArrayList<Vif_2011>();
        this.cargarDatos();
        this.init();
    }

    //Graficas
    public void grficar() {

        lineModel_Victima_Circuito = initCategoryModelSexoV();
        lineModel_Victima_Subcircuito = initCategoryModelSexoSubV();
        //lineModel8 = initCategoryModelSexoSubV();

    }

    public Vif_2011ControladorVictimas() {
        this.reinit();
    }

    private CartesianChartModel initCategoryModelSexoV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries CircuitoSexoMV = new ChartSeries();
            CircuitoSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos1 = FVif_2011.ObtenerDatosDadoCircuitoSexoVictima("M", lstDatos.get(i).getCircuito());
                CircuitoSexoMV.set(lstDatos.get(i).getCircuito(), lstDatos1.size());
            }

            ChartSeries CircuitoSexoFV = new ChartSeries();
            CircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos3 = FVif_2011.ObtenerDatosDadoCircuitoSexoVictima("F", lstDatos.get(j).getCircuito());
                CircuitoSexoFV.set(lstDatos.get(j).getCircuito(), lstDatos3.size());
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
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos5 = FVif_2011.ObtenerDatosDadoSubCircuitoSexoVictima("M", lstDatos.get(i).getSubcircuito());
                SubCircuitoSexoMV.set(lstDatos.get(i).getSubcircuito(), lstDatos5.size());
            }

            ChartSeries SubCircuitoSexoFV = new ChartSeries();
            SubCircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos7 = FVif_2011.ObtenerDatosDadoSubCircuitoSexoVictima("F", lstDatos.get(j).getSubcircuito());
                SubCircuitoSexoFV.set(lstDatos.get(j).getSubcircuito(), lstDatos7.size());
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

            this.lstDatos = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
