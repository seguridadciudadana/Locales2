/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.funciones.FVif_2012;
import geoportal.logica.clases.Vif_2012;
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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorParentesco {

    /**
     * Creates a new instance of Vif_2012ControladorParentesco
     */
    private CartesianChartModel parentescoGrafico;
    private CartesianChartModel lineEstadoCivil;
    private ArrayList<Vif_2012> lstDatosControl;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatosP;
    private ArrayList<Vif_2012> lstDatosEC;
    private ArrayList<Vif_2012> lstDatosDadoP;
    private ArrayList<Vif_2012> lstDatosDadoEC;
    private PieChartModel pieEstadoCivil;

    public PieChartModel getPieEstadoCivil() {
        return pieEstadoCivil;
    }

    public void setPieEstadoCivil(PieChartModel pieEstadoCivil) {
        this.pieEstadoCivil = pieEstadoCivil;
    }

    public CartesianChartModel getLineEstadoCivil() {
        return lineEstadoCivil;
    }

    public void setLineEstadoCivil(CartesianChartModel lineEstadoCivil) {
        this.lineEstadoCivil = lineEstadoCivil;
    }

    public ArrayList<Vif_2012> getLstDatosEC() {
        return lstDatosEC;
    }

    public void setLstDatosEC(ArrayList<Vif_2012> lstDatosEC) {
        this.lstDatosEC = lstDatosEC;
    }

    public ArrayList<Vif_2012> getLstDatosDadoEC() {
        return lstDatosDadoEC;
    }

    public void setLstDatosDadoEC(ArrayList<Vif_2012> lstDatosDadoEC) {
        this.lstDatosDadoEC = lstDatosDadoEC;
    }

    public CartesianChartModel getParentescoGrafico() {
        return parentescoGrafico;
    }

    public void setParentescoGrafico(CartesianChartModel parentescoGrafico) {
        this.parentescoGrafico = parentescoGrafico;
    }

    public ArrayList<Vif_2012> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2012> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatosP() {
        return lstDatosP;
    }

    public void setLstDatosP(ArrayList<Vif_2012> lstDatosP) {
        this.lstDatosP = lstDatosP;
    }

    public ArrayList<Vif_2012> getLstDatosDadoP() {
        return lstDatosDadoP;
    }

    public void setLstDatosDadoP(ArrayList<Vif_2012> lstDatosDadoP) {
        this.lstDatosDadoP = lstDatosDadoP;
    }

    public void graficar() {
        parentescoGrafico = initCategoryParentesco();
        lineEstadoCivil = initEstadoCivil();
        pieEstadoCivil=pieEstadoCivil();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public Vif_2012ControladorParentesco() {
        this.reinit();
    }

    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2012>();
        this.lstDatosP = new ArrayList<Vif_2012>();
        this.lstDatosDadoP = new ArrayList<Vif_2012>();
        this.datoSel = new Vif_2012();

        this.init();
        this.cargarDatos();

    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosP = FVif_2012.ObtenerDatosParentesco();
            ChartSeries Parentesco = new ChartSeries();
            Parentesco.setLabel("Parentesco Victima - Agresor");
            for (Vif_2012 lstDatosP1 : lstDatosP) {
                lstDatosDadoP = FVif_2012.ObtenerDatosDadoParentesco(lstDatosP1.getPparentesco_victima_agresor());
                Parentesco.set(lstDatosP1.getPparentesco_victima_agresor(), lstDatosDadoP.size());
            }
            model.addSeries(Parentesco);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEC = FVif_2012.ObtenerDatosEstadoCivil();
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil de las Víctimas");
            for (int i = 0; i < lstDatosEC.size(); i++) {
                lstDatosDadoEC = FVif_2012.ObtenerDatosDadoEstadoCivil(lstDatosEC.get(i).getPestado_civil_victima());
                EstadoCivil.set(lstDatosEC.get(i).getPestado_civil_victima(), lstDatosDadoEC.size());
            }
            model.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieEstadoCivil() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            for (int j = 0; j < lstDatosEC.size(); j++) {
                lstDatosDadoEC = FVif_2012.ObtenerDatosDadoEstadoCivil(lstDatosEC.get(j).getPestado_civil_victima());
                pieModel.set(lstDatosEC.get(j).getPestado_civil_victima(), lstDatosDadoEC.size());
            }
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getPid());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
