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
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public final class Vif_2011ControladorDatosGeneral {

    /**
     * Creates a new instance of Vif_2011ControladorDatosGeneral
     */
    private CartesianChartModel lineModel1;
    private CartesianChartModel lineModel2;
    private ArrayList<Vif_2011> lstDatosControl1;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatosC;
    private ArrayList<Vif_2011> lstDatosDadoC;
    private ArrayList<Vif_2011> lstDatosS; //lstDatos7
    private ArrayList<Vif_2011> lstDatosDadoS; //lstDatos8

    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public CartesianChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

    public ArrayList<Vif_2011> getLstDatosControl1() {
        return lstDatosControl1;
    }

    public void setLstDatosControl1(ArrayList<Vif_2011> lstDatosControl1) {
        this.lstDatosControl1 = lstDatosControl1;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosC() {
        return lstDatosC;
    }

    public void setLstDatosC(ArrayList<Vif_2011> lstDatosC) {
        this.lstDatosC = lstDatosC;
    }

    public ArrayList<Vif_2011> getLstDatosDadoC() {
        return lstDatosDadoC;
    }

    public void setLstDatosDadoC(ArrayList<Vif_2011> lstDatosDadoC) {
        this.lstDatosDadoC = lstDatosDadoC;
    }

    public ArrayList<Vif_2011> getLstDatosS() {
        return lstDatosS;
    }

    public void setLstDatosS(ArrayList<Vif_2011> lstDatosS) {
        this.lstDatosS = lstDatosS;
    }

    public ArrayList<Vif_2011> getLstDatosDadoS() {
        return lstDatosDadoS;
    }

    public void setLstDatosDadoS(ArrayList<Vif_2011> lstDatosDadoS) {
        this.lstDatosDadoS = lstDatosDadoS;
    }

    public Vif_2011ControladorDatosGeneral() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.datoSel = new Vif_2011();
        this.lstDatosControl1 = new ArrayList<Vif_2011>();
        this.lstDatosS = new ArrayList<Vif_2011>();
        this.lstDatosDadoS = new ArrayList<Vif_2011>();
        this.lstDatosC = new ArrayList<Vif_2011>();
        this.lstDatosDadoC = new ArrayList<Vif_2011>();

        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModel1 = initCategorySubcircuito();
        lineModel2 = initCategoryCircuito();
    }

    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
//            lstDatosDadoS = FVif_2011.ObtenerDatosSubcircuito();
            lstDatosS = FVif_2011.ObtenerDatosSubcircuito();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("SubCircuito");
            for (int x = 0; x < lstDatosS.size(); x++) {
                lstDatosDadoS = FVif_2011.ObtenerDatosDadoSubcircuito(lstDatosS.get(x).getSubcircuito());
                SubCircuito.set(lstDatosS.get(x).getSubcircuito(), lstDatosDadoS.size());
            }

            model.addSeries(SubCircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosC = FVif_2011.ObtenerDatosCircuito();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2011.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());
            }
            model.addSeries(Circuito);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos() {
        try {
            this.lstDatosControl1 = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatosControl1.get(0);
            System.out.println(lstDatosControl1.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
