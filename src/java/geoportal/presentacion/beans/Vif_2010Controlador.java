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

public class Vif_2010Controlador implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
   /* private LineChartModel lineModel1;
    private LineChartModel lineModel2;
    
    //private CartesianChartModel lineModel1;
    private ArrayList<Vif_2010> lstDatosC;
    private ArrayList<Vif_2010> lstDatosCir;
    private ArrayList<Vif_2010> lstDatosDadoC;
    private ArrayList<Vif_2010> lstDatosMes;
    //private CartesianChartModel lineModel2;
    private LineChartModel lineModel3;
    private LineChartModel lineModel4;
    private LineChartModel lineModel5;
    
     private LineChartModel lineModel6;
    private LineChartModel lineModel7;
    private LineChartModel lineModel8;*/

    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
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
    private ArrayList<Vif_2010> lstDatos11;
    private ArrayList<Vif_2010> lstDatos12;
    private ArrayList<Vif_2010> lstDatos13;
    private ArrayList<Vif_2010> lstDatos14;
    private ArrayList<Vif_2010> lstDatos15;
    private ArrayList<Vif_2010> lstDatos16;
    private ArrayList<Vif_2010> lstDatos17;
    private ArrayList<Vif_2010> lstDatos18;
    private ArrayList<Vif_2010> lstDatos19;
    private ArrayList<Vif_2010> lstDatos20;

    List<Integer> listaEdad = new ArrayList<Integer>();

    
    private String valorSSeleccionada;
    private String fecha1;
    private String fecha2;
    private Date date1;
    private Date date2;

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

    public ArrayList<Vif_2010> getLstDatos11() {
        return lstDatos11;
    }

    public void setLstDatos11(ArrayList<Vif_2010> lstDatos11) {
        this.lstDatos11 = lstDatos11;
    }

    public ArrayList<Vif_2010> getLstDatos12() {
        return lstDatos12;
    }

    public void setLstDatos12(ArrayList<Vif_2010> lstDatos12) {
        this.lstDatos12 = lstDatos12;
    }

    public ArrayList<Vif_2010> getLstDatos13() {
        return lstDatos13;
    }

    public void setLstDatos13(ArrayList<Vif_2010> lstDatos13) {
        this.lstDatos13 = lstDatos13;
    }

    public ArrayList<Vif_2010> getLstDatos14() {
        return lstDatos14;
    }

    public void setLstDatos14(ArrayList<Vif_2010> lstDatos14) {
        this.lstDatos14 = lstDatos14;
    }

    public ArrayList<Vif_2010> getLstDatos15() {
        return lstDatos15;
    }

    public void setLstDatos15(ArrayList<Vif_2010> lstDatos15) {
        this.lstDatos15 = lstDatos15;
    }

    public ArrayList<Vif_2010> getLstDatos16() {
        return lstDatos16;
    }

    public void setLstDatos16(ArrayList<Vif_2010> lstDatos16) {
        this.lstDatos16 = lstDatos16;
    }

    public ArrayList<Vif_2010> getLstDatos17() {
        return lstDatos17;
    }

    public void setLstDatos17(ArrayList<Vif_2010> lstDatos17) {
        this.lstDatos17 = lstDatos17;
    }

    public ArrayList<Vif_2010> getLstDatos18() {
        return lstDatos18;
    }

    public void setLstDatos18(ArrayList<Vif_2010> lstDatos18) {
        this.lstDatos18 = lstDatos18;
    }

    public ArrayList<Vif_2010> getLstDatos19() {
        return lstDatos19;
    }

    public void setLstDatos19(ArrayList<Vif_2010> lstDatos19) {
        this.lstDatos19 = lstDatos19;
    }

    public ArrayList<Vif_2010> getLstDatos20() {
        return lstDatos20;
    }

    public void setLstDatos20(ArrayList<Vif_2010> lstDatos20) {
        this.lstDatos20 = lstDatos20;
    }
    
    
    /*public LineChartModel getLineModel6() {
        return lineModel6;
    }

    public void setLineModel6(LineChartModel lineModel6) {
        this.lineModel6 = lineModel6;
    }

    public LineChartModel getLineModel7() {
        return lineModel7;
    }

    public void setLineModel7(LineChartModel lineModel7) {
        this.lineModel7 = lineModel7;
    }

    public LineChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(LineChartModel lineModel8) {
        this.lineModel8 = lineModel8;
    }
    
    public LineChartModel getLineModel5() {
        return lineModel5;
    }

    public void setLineModel5(LineChartModel lineModel5) {
        this.lineModel5 = lineModel5;
    }
    
    public LineChartModel getLineModel3() {
        return lineModel3;
    }

    public void setLineModel3(LineChartModel lineModel3) {
        this.lineModel3 = lineModel3;
    }

    public LineChartModel getLineModel4() {
        return lineModel4;
    }

    public void setLineModel4(LineChartModel lineModel4) {
        this.lineModel4 = lineModel4;
    }

    
    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(LineChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(LineChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }
    

    public String getValorSSeleccionada() {
        return valorSSeleccionada;
    }

    public void setValorSSeleccionada(String valorSSeleccionada) {
        this.valorSSeleccionada = valorSSeleccionada;
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
        createLineModels();
    }
    
    public Vif_2010Controlador() {
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
        this.lstDatos11 = new ArrayList<Vif_2010>();
        this.lstDatos12 = new ArrayList<Vif_2010>();
        this.lstDatos13 = new ArrayList<Vif_2010>();
        this.lstDatos14 = new ArrayList<Vif_2010>();
        this.lstDatos15= new ArrayList<Vif_2010>();
        this.lstDatos16 = new ArrayList<Vif_2010>();
        this.lstDatos17 = new ArrayList<Vif_2010>();
        this.lstDatos18 = new ArrayList<Vif_2010>();
        this.lstDatos19 = new ArrayList<Vif_2010>();
        this.lstDatos20 = new ArrayList<Vif_2010>();
        this.cargarDatos();
        this.init();    

    }
 //
   /* private void createLineModels() {
        
        lineModel1 = initCategoryModel1();
        
        lineModel1.setTitle("Denuncias por Circuito");
        lineModel1.setLegendPosition("e");
        lineModel1.setShowPointLabels(true);
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Circuito"));
        Axis xAxis = lineModel1.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        
        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Denuncias por Subcircuito");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Subcircuito"));
        xAxis = lineModel2.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
            
        lineModel3 = initCategoryModelSexo();
        lineModel3.setTitle("Agresor por Circuito");
        lineModel3.setLegendPosition("e");
        lineModel3.setShowPointLabels(true);
        lineModel3.getAxes().put(AxisType.X, new CategoryAxis("Circuito"));
        xAxis = lineModel3.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel3.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        lineModel4=initCategoryModelSexoSub();
        lineModel4.setTitle("Agresor por Subcircuito");
        lineModel4.setLegendPosition("e");
        lineModel4.setShowPointLabels(true);
        lineModel4.getAxes().put(AxisType.X, new CategoryAxis("SubCircuito"));
        xAxis = lineModel4.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel4.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        lineModel5=initCategoryModelSexoEdadA();
        lineModel5.setTitle("Agresor por Edad");
        lineModel5.setLegendPosition("e");
        lineModel5.setShowPointLabels(true);
        lineModel5.getAxes().put(AxisType.X, new CategoryAxis("Edad"));
        //xAxis = lineModel5.getAxis(AxisType.X);
        //xAxis.setTickAngle(90);
        yAxis = lineModel5.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        //VICTIMAS
        lineModel6 = initCategoryModelSexoVictima();
        lineModel6.setTitle("Victima por Circuito");
        lineModel6.setLegendPosition("e");
        lineModel6.setShowPointLabels(true);
        lineModel6.getAxes().put(AxisType.X, new CategoryAxis("Circuito"));
        xAxis = lineModel6.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel6.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        lineModel7=initCategoryModelSexoSubVictima();
        lineModel7.setTitle("Victima por Subcircuito");
        lineModel7.setLegendPosition("e");
        lineModel7.setShowPointLabels(true);
        lineModel7.getAxes().put(AxisType.X, new CategoryAxis("SubCircuito"));
        xAxis = lineModel7.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel7.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
        lineModel8=initCategoryModelSexoEdadV();
        lineModel8.setTitle("Victima por Edad");
        lineModel8.setLegendPosition("e");
        lineModel8.setShowPointLabels(true);
        lineModel8.getAxes().put(AxisType.X, new CategoryAxis("Edad"));
        xAxis = lineModel5.getAxis(AxisType.X);
        xAxis.setTickAngle(90);
        yAxis = lineModel5.getAxis(AxisType.Y);
        yAxis.setLabel("Número Denuncias");
        
    }
    
    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
        try {
            lstDatos8 = FVif_2010.ObtenerDatosSubCircuito();

            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("Subcircuito");
            
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
    
    private LineChartModel initCategoryModel1() {
        LineChartModel model = new LineChartModel();
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
    
    private LineChartModel initCategoryModelSexo() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatosFecha = FVif_2010.ObtenerDatosDadoSexoAgresor("M");
            
            ChartSeries CircuitoSexoM = new ChartSeries();
            CircuitoSexoM.setLabel("Masculino"); 
                    for (int i = 0; i < lstDatosFecha.size(); i++) {

                        lstDatosMes = FVif_2010.ObtenerDatosDadoCircuitoSexo("M", lstDatosFecha.get(i).getCircuito());
                        CircuitoSexoM.set(lstDatosFecha.get(i).getCircuito(), lstDatosMes.size());
                } 
                    
            lstDatosCopia = FVif_2010.ObtenerDatosDadoSexoAgresor("F");
            
            ChartSeries CircuitoSexoF = new ChartSeries();
            CircuitoSexoF.setLabel("Femenino");
                    for (int j = 0; j < lstDatosCopia.size(); j++) {

                        lstDatosCir = FVif_2010.ObtenerDatosDadoCircuitoSexo("F", lstDatosCopia.get(j).getCircuito());
                        CircuitoSexoF.set(lstDatosCopia.get(j).getCircuito(), lstDatosCir.size()); 
                }         
            model.addSeries(CircuitoSexoM);
            model.addSeries(CircuitoSexoF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
    
    private LineChartModel initCategoryModelSexoSub() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatos1 = FVif_2010.ObtenerDatosDadoSexoAgresor1("M");
            
            ChartSeries SubCircuitoSexoM = new ChartSeries();
            SubCircuitoSexoM.setLabel("Masculino"); 
                    for (int i = 0; i < lstDatos1.size(); i++) {

                        lstDatos2 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("M", lstDatos1.get(i).getSubcircuit());
                        SubCircuitoSexoM.set(lstDatos1.get(i).getSubcircuit(), lstDatos2.size());
                } 
                    
            lstDatos3 = FVif_2010.ObtenerDatosDadoSexoAgresor1("F");
            
            ChartSeries SubCircuitoSexoF = new ChartSeries();
            SubCircuitoSexoF.setLabel("Femenino");
                    for (int j = 0; j < lstDatos3.size(); j++) {

                        lstDatos4 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("F", lstDatos3.get(j).getSubcircuit());
                        SubCircuitoSexoF.set(lstDatos3.get(j).getSubcircuit(), lstDatos4.size()); 
                }         
            model.addSeries(SubCircuitoSexoM);
            model.addSeries(SubCircuitoSexoF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
    
     private LineChartModel initCategoryModelSexoEdadA() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatos5 = FVif_2010.ObtenerDatosDadoSexoAgresor2("M");
            
            ChartSeries EdadSexoM = new ChartSeries();
            EdadSexoM.setLabel("Masculino"); 
                    for (int i = 0; i < lstDatos5.size(); i++) {

                        lstDatos6 = FVif_2010.ObtenerDatosDadoEdadSexo("M", lstDatos5.get(i).getEdad__agre());
                        EdadSexoM.set(lstDatos5.get(i).getEdad__agre(), lstDatos6.size());
                } 
                    
            lstDatos7 = FVif_2010.ObtenerDatosDadoSexoAgresor2("F");
            
            ChartSeries EdadSexoF = new ChartSeries();
            EdadSexoF.setLabel("Femenino");
                    for (int j = 0; j < lstDatos7.size(); j++) {

                        lstDatos8 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("F", lstDatos7.get(j).getEdad__agre());
                        EdadSexoF.set(lstDatos7.get(j).getEdad__agre(), lstDatos8.size()); 
                }         
            model.addSeries(EdadSexoM);
            model.addSeries(EdadSexoF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
     // VICTIMA
     private LineChartModel initCategoryModelSexoVictima() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatos9 = FVif_2010.ObtenerDatosDadoSexoVictima("F");
            
            ChartSeries CircuitoSexoVM = new ChartSeries();
            CircuitoSexoVM.setLabel("Femenino"); 
                    for (int i = 0; i < lstDatos9.size(); i++) {

                        lstDatos10 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("F", lstDatos9.get(i).getCircuito());
                        CircuitoSexoVM.set(lstDatos9.get(i).getCircuito(), lstDatos10.size());
                } 
                    
            lstDatos11 = FVif_2010.ObtenerDatosDadoSexoVictima("M");
            
            ChartSeries CircuitoSexoVF = new ChartSeries();
            CircuitoSexoVF.setLabel("Masculino");
                    for (int j = 0; j < lstDatos11.size(); j++) {

                        lstDatos12 = FVif_2010.ObtenerDatosDadoCircuitoSexoVictima("M", lstDatos11.get(j).getCircuito());
                        CircuitoSexoVF.set(lstDatos11.get(j).getCircuito(), lstDatos12.size()); 
                }         
            model.addSeries(CircuitoSexoVM);
            model.addSeries(CircuitoSexoVF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
    
    private LineChartModel initCategoryModelSexoSubVictima() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatos13 = FVif_2010.ObtenerDatosDadoSexoVictima1("F");
            
            ChartSeries SubCircuitoSexoVM = new ChartSeries();
            SubCircuitoSexoVM.setLabel("Femenino"); 
                    for (int i = 0; i < lstDatos13.size(); i++) {

                        lstDatos14 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("F", lstDatos13.get(i).getSubcircuit());
                        SubCircuitoSexoVM.set(lstDatos13.get(i).getSubcircuit(), lstDatos14.size());
                } 
                    
            lstDatos15 = FVif_2010.ObtenerDatosDadoSexoVictima1("M");
            
            ChartSeries SubCircuitoSexoVF = new ChartSeries();
            SubCircuitoSexoVF.setLabel("Masculino");
                    for (int j = 0; j < lstDatos15.size(); j++) {

                        lstDatos16 = FVif_2010.ObtenerDatosDadoSubCircuitoSexoVictima("M", lstDatos15.get(j).getSubcircuit());
                        SubCircuitoSexoVF.set(lstDatos15.get(j).getSubcircuit(), lstDatos16.size()); 
                }         
            model.addSeries(SubCircuitoSexoVM);
            model.addSeries(SubCircuitoSexoVF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
    
    private LineChartModel initCategoryModelSexoEdadV() {
        LineChartModel model = new LineChartModel();
        try {
            
            lstDatos17 = FVif_2010.ObtenerDatosDadoSexoVictima2("F");
            
            ChartSeries EdadSexoVM = new ChartSeries();
            EdadSexoVM.setLabel("Femenino"); 
                    for (int i = 0; i < lstDatos17.size(); i++) {

                        lstDatos18 = FVif_2010.ObtenerDatosDadoEdadSexo("F", lstDatos17.get(i).getEdad_victi());
                        EdadSexoVM.set(lstDatos17.get(i).getEdad_victi(), lstDatos18.size());
                } 
                    
            lstDatos19 = FVif_2010.ObtenerDatosDadoSexoVictima2("M");
            
            ChartSeries EdadSexoVF = new ChartSeries();
            EdadSexoVF.setLabel("Masculino");
                    for (int j = 0; j < lstDatos19.size(); j++) {

                        lstDatos20 = FVif_2010.ObtenerDatosDadoSubCircuitoSexo("M", lstDatos19.get(j).getEdad_victi());
                        EdadSexoVF.set(lstDatos19.get(j).getEdad_victi(), lstDatos20.size()); 
                }         
            model.addSeries(EdadSexoVM);
            model.addSeries(EdadSexoVF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
       return model;
        
    }
     

   /**
     *
     */
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
