/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.DefaultRequestContext;
//import org.primefaces.model.chart.Axis;
//import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
//import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
//import org.primefaces.model.chart.LineChartModel;
//import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
//import vif.logica.clases.subcircuito;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped

public class Vif_2010Controlador1 implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
    private CartesianChartModel lineModel1;
    private CartesianChartModel lineModel2;
    private CartesianChartModel lineModel3;
    private CartesianChartModel lineModel4;
    private CartesianChartModel lineModel5;
    private CartesianChartModel lineModel6;
    private CartesianChartModel lineModel7;
    private CartesianChartModel lineModel8;

    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatosC;
    private ArrayList<Vif_2010> lstDatosCir;
    private ArrayList<Vif_2010> lstDatosDadoC;
    private ArrayList<Vif_2010> lstDatosMes;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatosFecha;
    private ArrayList<Vif_2010> lstDatos1;
    private ArrayList<Vif_2010> lstDatos2;
    private ArrayList<Vif_2010> lstDatos3;
    private ArrayList<Vif_2010> lstDatos4;
    private ArrayList<Vif_2010> lstDatos5;
    private ArrayList<Vif_2010> lstDatos6;
    private ArrayList<Vif_2010> lstDatos7;
    private ArrayList<Vif_2010> lstDatos8;
    private ArrayList<Vif_2010> lstDatosCopia;
    private ArrayList<Vif_2010> lstDatos9;
    private ArrayList<Vif_2010> lstDatos10;

    List<Integer> listaEdad = new ArrayList<Integer>();

    private String fecha1;
    private String fecha2;
    private Date date1;
    private Date date2;

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

    public CartesianChartModel getLineModel3() {
        return lineModel3;
    }

    public void setLineModel3(CartesianChartModel lineModel3) {
        this.lineModel3 = lineModel3;
    }

    public CartesianChartModel getLineModel4() {
        return lineModel4;
    }

    public void setLineModel4(CartesianChartModel lineModel4) {
        this.lineModel4 = lineModel4;
    }

    public CartesianChartModel getLineModel5() {
        return lineModel5;
    }

    public void setLineModel5(CartesianChartModel lineModel5) {
        this.lineModel5 = lineModel5;
    }

    public CartesianChartModel getLineModel6() {
        return lineModel6;
    }

    public void setLineModel6(CartesianChartModel lineModel6) {
        this.lineModel6 = lineModel6;
    }

    public CartesianChartModel getLineModel7() {
        return lineModel7;
    }

    public void setLineModel7(CartesianChartModel lineModel7) {
        this.lineModel7 = lineModel7;
    }

    public CartesianChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(CartesianChartModel lineModel8) {
        this.lineModel8 = lineModel8;
    }

    public ArrayList<Vif_2010> getLstDatos9() {
        return lstDatos9;
    }

    public void setLstDatos9(ArrayList<Vif_2010> lstDatos9) {
        this.lstDatos9 = lstDatos9;
    }

    public ArrayList<Vif_2010> getLstDatos10() {
        return lstDatos10;
    }

    public void setLstDatos10(ArrayList<Vif_2010> lstDatos10) {
        this.lstDatos10 = lstDatos10;
    }

    public ArrayList<Vif_2010> getLstDatosCir() {
        return lstDatosCir;
    }

    public void setLstDatosCir(ArrayList<Vif_2010> lstDatosCir) {
        this.lstDatosCir = lstDatosCir;
    }

    public ArrayList<Vif_2010> getLstDatosCopia() {
        return lstDatosCopia;
    }

    public void setLstDatosCopia(ArrayList<Vif_2010> lstDatosCopia) {
        this.lstDatosCopia = lstDatosCopia;
    }

    public ArrayList<Vif_2010> getLstDatosMes() {
        return lstDatosMes;
    }

    public void setLstDatosMes(ArrayList<Vif_2010> lstDatosMes) {
        this.lstDatosMes = lstDatosMes;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public ArrayList<Vif_2010> getLstDatosFecha() {
        return lstDatosFecha;
    }

    public void setLstDatosFecha(ArrayList<Vif_2010> lstDatosFecha) {
        this.lstDatosFecha = lstDatosFecha;
    }

    public ArrayList<Vif_2010> getLstDatosC() {
        return lstDatosC;
    }

    public void setLstDatosC(ArrayList<Vif_2010> lstDatosC) {
        this.lstDatosC = lstDatosC;
    }

    public ArrayList<Vif_2010> getLstDatosDadoC() {
        return lstDatosDadoC;
    }

    public void setLstDatosDadoC(ArrayList<Vif_2010> lstDatosDadoC) {
        this.lstDatosDadoC = lstDatosDadoC;
    }

    public ArrayList<Vif_2010> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2010> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

    public ArrayList<Vif_2010> getLstDatos8() {
        return lstDatos8;
    }

    public void setLstDatos8(ArrayList<Vif_2010> lstDatos8) {
        this.lstDatos8 = lstDatos8;
    }

    public ArrayList<Vif_2010> getLstDatos5() {
        return lstDatos5;
    }

    public void setLstDatos5(ArrayList<Vif_2010> lstDatos5) {
        this.lstDatos5 = lstDatos5;
    }

    public ArrayList<Vif_2010> getLstDatos6() {
        return lstDatos6;
    }

    public void setLstDatos6(ArrayList<Vif_2010> lstDatos6) {
        this.lstDatos6 = lstDatos6;
    }

    public ArrayList<Vif_2010> getLstDatos3() {
        return lstDatos3;
    }

    public void setLstDatos3(ArrayList<Vif_2010> lstDatos3) {
        this.lstDatos3 = lstDatos3;
    }

    public ArrayList<Vif_2010> getLstDatos4() {
        return lstDatos4;
    }

    public void setLstDatos4(ArrayList<Vif_2010> lstDatos4) {
        this.lstDatos4 = lstDatos4;
    }

    public List<Integer> getListaEdad() {
        return listaEdad;
    }

    public void setListaEdad(List<Integer> listaEdad) {
        this.listaEdad = listaEdad;
    }

    public ArrayList<Vif_2010> getLstDatos2() {
        return lstDatos2;
    }

    public void setLstDatos2(ArrayList<Vif_2010> lstDatos2) {
        this.lstDatos2 = lstDatos2;
    }

    public ArrayList<Vif_2010> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public Vif_2010 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2010 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public Vif_2010Controlador1() {
        this.reinit();
    }

    private void reinit() {
        this.objDatos = new Vif_2010();
        this.datoSel = new Vif_2010();
        this.lstDatos = new ArrayList<Vif_2010>();
        this.lstDatos1 = new ArrayList<Vif_2010>();
        this.listaEdad = new ArrayList<Integer>();
        this.lstDatos3 = new ArrayList<Vif_2010>();
        this.lstDatos4 = new ArrayList<Vif_2010>();
        this.lstDatos5 = new ArrayList<Vif_2010>();
        this.lstDatos6 = new ArrayList<Vif_2010>();
        this.lstDatos7 = new ArrayList<Vif_2010>();
        this.lstDatos8 = new ArrayList<Vif_2010>();
        this.lstDatosC = new ArrayList<Vif_2010>();
        this.lstDatosCopia = new ArrayList<Vif_2010>();
        this.lstDatosDadoC = new ArrayList<Vif_2010>();
        this.lstDatosFecha = new ArrayList<Vif_2010>();
        this.lstDatosMes = new ArrayList<Vif_2010>();
        this.lstDatosCir = new ArrayList<Vif_2010>();
        this.lstDatos9 = new ArrayList<Vif_2010>();
        this.lstDatos10 = new ArrayList<Vif_2010>();
        this.cargarDatos();
        this.init();
    }

    //Graficas
    public void grficar() {

        lineModel1 = initCategorySubcircuito();
        lineModel2 = initCategoryCircuito();
        lineModel3 = initCategoryModelSexo();
        lineModel4 = initCategoryModelSexoSub();
        lineModel5 = initCategoryModelSexoEdadA();
        lineModel6 = initCategoryModelSexoEdadV();
        lineModel7 = initCategoryModelSexoV();
        lineModel8 = initCategoryModelSexoSubV();

    }

    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos8 = FVif_2010.ObtenerDatosSubCircuito();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("SubCircuito");
            for (int x = 0; x < lstDatos8.size(); x++) {
                lstDatos7 = FVif_2010.ObtenerDatosDadoSubcircuito(lstDatos8.get(x).getSubcircuit());
                SubCircuito.set(lstDatos8.get(x).getSubcircuit(), lstDatos7.size());

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
            lstDatosC = FVif_2010.ObtenerDatosCircuito();

            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());

            }

            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexo() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries CircuitoSexoM = new ChartSeries();
            CircuitoSexoM.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatosMes = FVif_2010.ObtenerDatosDadoCircuitoSexo("M", lstDatos.get(i).getCircuito());
                CircuitoSexoM.set(lstDatos.get(i).getCircuito(), lstDatosMes.size());
            }

            ChartSeries CircuitoSexoF = new ChartSeries();
            CircuitoSexoF.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatosCir = FVif_2010.ObtenerDatosDadoCircuitoSexo("F", lstDatos.get(j).getCircuito());
                CircuitoSexoF.set(lstDatos.get(j).getCircuito(), lstDatosCir.size());
            }
            model.addSeries(CircuitoSexoM);
            model.addSeries(CircuitoSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoSub() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries SubCircuitoSexoM = new ChartSeries();
            SubCircuitoSexoM.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos2 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("M", lstDatos.get(i).getSubcircuit());
                SubCircuitoSexoM.set(lstDatos.get(i).getSubcircuit(), lstDatos2.size());
            }

            ChartSeries SubCircuitoSexoF = new ChartSeries();
            SubCircuitoSexoF.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos4 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("F", lstDatos.get(j).getSubcircuit());
                SubCircuitoSexoF.set(lstDatos.get(j).getSubcircuit(), lstDatos4.size());
            }
            model.addSeries(SubCircuitoSexoM);
            model.addSeries(SubCircuitoSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoEdadA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries EdadSexoM = new ChartSeries();
            EdadSexoM.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos6 = FVif_2010.ObtenerDatosDadoEdadSexo("M", lstDatos.get(i).getEdad__agre());
                EdadSexoM.set(lstDatos.get(i).getEdad__agre(), lstDatos6.size());
            }

            ChartSeries EdadSexoF = new ChartSeries();
            EdadSexoF.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos8 = FVif_2010.ObtenerDatosDadoEdadSexo("F", lstDatos.get(j).getEdad__agre());
                EdadSexoF.set(lstDatos.get(j).getEdad__agre(), lstDatos8.size());
            }
            model.addSeries(EdadSexoM);
            model.addSeries(EdadSexoF);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries CircuitoSexoMV = new ChartSeries();
            CircuitoSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos1 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("M", lstDatos.get(i).getCircuito());
                CircuitoSexoMV.set(lstDatos.get(i).getCircuito(), lstDatos1.size());
            }

            ChartSeries CircuitoSexoFV = new ChartSeries();
            CircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos3 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("F", lstDatos.get(j).getCircuito());
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

                lstDatos5 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("M", lstDatos.get(i).getSubcircuit());
                SubCircuitoSexoMV.set(lstDatos.get(i).getSubcircuit(), lstDatos5.size());
            }

            ChartSeries SubCircuitoSexoFV = new ChartSeries();
            SubCircuitoSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos7 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("F", lstDatos.get(j).getSubcircuit());
                SubCircuitoSexoFV.set(lstDatos.get(j).getSubcircuit(), lstDatos7.size());
            }
            model.addSeries(SubCircuitoSexoMV);
            model.addSeries(SubCircuitoSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryModelSexoEdadV() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries EdadSexoMV = new ChartSeries();
            EdadSexoMV.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {

                lstDatos9 = FVif_2010.ObtenerDatosDadoEdadSexoVictima("M", lstDatos.get(i).getEdad_victi());
                EdadSexoMV.set(lstDatos.get(i).getEdad_victi(), lstDatos9.size());
            }

            ChartSeries EdadSexoFV = new ChartSeries();
            EdadSexoFV.setLabel("Femenino");
            for (int j = 0; j < lstDatos.size(); j++) {

                lstDatos10 = FVif_2010.ObtenerDatosDadoEdadSexoVictima("F", lstDatos.get(j).getEdad_victi());
                EdadSexoFV.set(lstDatos.get(j).getEdad_victi(), lstDatos10.size());
            }
            model.addSeries(EdadSexoMV);
            model.addSeries(EdadSexoFV);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
