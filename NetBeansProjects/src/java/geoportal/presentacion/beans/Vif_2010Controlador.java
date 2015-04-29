/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
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
  
    private PieChartModel graficoSubcircuito;
    private CartesianChartModel lineModel1;
    private ArrayList<Vif_2010> lstDatosC;
    private ArrayList<Vif_2010> lstDatosDadoC;
    private ArrayList<Vif_2010> lstDatosMes;
    private CartesianChartModel lineModel2;
    private CartesianChartModel lineModel3;
    private CartesianChartModel lineModel4;

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

    List<Integer> listaEdad = new ArrayList<Integer>();
    
    private int contarRegMes;

    private boolean mostrarActualizar;
    private String valorASeleccionado;
    private String valorBSeleccionado;
    private String valorCSeleccionada;
    private String valorDSeleccionada;
    private String valorESeleccionado;
    private String valorFSeleccionado;
    private String valorGSeleccionada;
    private String valorHSeleccionada;
    private String valorISeleccionada;
    private String valorJSeleccionada;
    private String fecha1;
    private String fecha2;
    private Date date1;
    private Date date2;

    public int getContarRegMes() {
        return contarRegMes;
    }

    public void setContarRegMes(int contarRegMes) {
        this.contarRegMes = contarRegMes;
    }

   

    
    public ArrayList<Vif_2010> getLstDatosMes() {
        return lstDatosMes;
    }

    public void setLstDatosMes(ArrayList<Vif_2010> lstDatosMes) {
        this.lstDatosMes = lstDatosMes;
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

    public CartesianChartModel getLineModel2() {
        return lineModel2;
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

    public CartesianChartModel getLineModel1() {
        return lineModel1;
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

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public String getValorASeleccionado() {
        return valorASeleccionado;
    }

    public void setValorASeleccionado(String valorASeleccionado) {
        this.valorASeleccionado = valorASeleccionado;
    }

    public String getValorBSeleccionado() {
        return valorBSeleccionado;
    }

    public void setValorBSeleccionado(String valorBSeleccionado) {
        this.valorBSeleccionado = valorBSeleccionado;
    }

    public String getValorCSeleccionada() {
        return valorCSeleccionada;
    }

    public void setValorCSeleccionada(String valorCSeleccionada) {
        this.valorCSeleccionada = valorCSeleccionada;
    }

    public String getValorDSeleccionada() {
        return valorDSeleccionada;
    }

    public void setValorDSeleccionada(String valorDSeleccionada) {
        this.valorDSeleccionada = valorDSeleccionada;
    }

    public String getValorESeleccionado() {
        return valorESeleccionado;
    }

    public void setValorESeleccionado(String valorESeleccionado) {
        this.valorESeleccionado = valorESeleccionado;
    }

    public String getValorFSeleccionado() {
        return valorFSeleccionado;
    }

    public void setValorFSeleccionado(String valorFSeleccionado) {
        this.valorFSeleccionado = valorFSeleccionado;
    }

    public String getValorGSeleccionada() {
        return valorGSeleccionada;
    }

    public void setValorGSeleccionada(String valorGSeleccionada) {
        this.valorGSeleccionada = valorGSeleccionada;
    }

    public String getValorHSeleccionada() {
        return valorHSeleccionada;
    }

    public void setValorHSeleccionada(String valorHSeleccionada) {
        this.valorHSeleccionada = valorHSeleccionada;
    }

    public String getValorISeleccionada() {
        return valorISeleccionada;
    }

    public void setValorISeleccionada(String valorISeleccionada) {
        this.valorISeleccionada = valorISeleccionada;
    }

    public String getValorJSeleccionada() {
        return valorJSeleccionada;
    }

    public void setValorJSeleccionada(String valorJSeleccionada) {
        this.valorJSeleccionada = valorJSeleccionada;
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
        this.lstDatosDadoC = new ArrayList<Vif_2010>();
        this.lstDatosFecha = new ArrayList<Vif_2010>();
        this.lstDatosMes = new ArrayList<Vif_2010>();
       
        

        this.cargarDatos();
        this.cargarDatosVictima();
        this.cargarDatosAgresor();
        this.cargarDatosEdad();
        this.cargarDatosAgresorOcupacion();
        this.cargarDatosVictimaOcupacion();
        this.cargarDatosCircuito();
        this.cargarDatosSubCircuito();
        createPieModels();
        this.grficar();
     
    }

    @PostConstruct
    public void grficar() {

        lineModel1 = new CartesianChartModel();
        lineModel2 = new CartesianChartModel();
        lineModel3 = new CartesianChartModel();
        lineModel4 = new CartesianChartModel();
       

        try {

            lstDatos8 = FVif_2010.ObtenerDatosSubCircuito();

            final ChartSeries SubCircuito = new ChartSeries("Subcircuito");
            for (int x = 0; x < lstDatos8.size(); x++) {
                lstDatos7 = FVif_2010.ObtenerDatosDadoSubcircuito(lstDatos8.get(x).getSubcircuit());
                SubCircuito.set(lstDatos8.get(x).getSubcircuit(), lstDatos7.size());

            }

            lineModel1.addSeries(SubCircuito);

            lstDatosC = FVif_2010.ObtenerDatosCircuito();
            //lstNodoBuscar = FNodo1.obtenerTodos();
            final ChartSeries Circuito = new ChartSeries("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());

            }
            lineModel2.addSeries(Circuito);

            //lstDatosFecha = obtenerDatosDadoFechas();
            //lstNodoBuscar = FNodo1.obtenerTodos();
            /*lstDatosMes = FVif_2010.ObtenerDatosCircuito();
            final ChartSeries CircuitoMes = new ChartSeries("Circuito");
            for (int x = 0; x < lstDatosFecha.size(); x++) {
                lstDatosMes = FVif_2010.ObtenerDatosDadoCircuito(lstDatosMes.get(x).getCircuito());
                CircuitoMes.set(lstDatosMes.get(x).getCircuito(), lstDatosMes.size());

            }

            lineModel3.addSeries(CircuitoMes);*/

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }

    }

    public CartesianChartModel getGrficar() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

    /**
     *
     */
    private void createPieModels() {
        createPieModel1();
    }

    private void createPieModel1() {
        graficoSubcircuito = new PieChartModel();

        try {
            lstDatos7 = FVif_2010.ObtenerDatosSubCircuito();

            for (int x = 0; x < lstDatos7.size(); x++) {
                lstDatos8 = FVif_2010.ObtenerDatosDadoSubcircuito(lstDatos7.get(x).getSubcircuit());
                graficoSubcircuito.set(lstDatos7.get(x).getSubcircuit(), lstDatos8.size());

            }

        } catch (Exception e) {
        }

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

    public void cargarDatosVictima() {
        try {
            this.lstDatos1 = FVif_2010.ObtenerDatosVictima();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosCircuito() {
        try {
            this.lstDatos5 = FVif_2010.ObtenerDatosCircuito();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosSubCircuito() {
        try {
            this.lstDatos6 = FVif_2010.ObtenerDatosSubCircuito();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosVictimaOcupacion() {
        try {
            this.lstDatos3 = FVif_2010.ObtenerDatosVictimaOcupacion();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosAgresorOcupacion() {
        try {
            this.lstDatos4 = FVif_2010.ObtenerDatosAgresorOcupacion();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosEdad() {

        for (int i = 0; i <= 100; i++) {
            listaEdad.add(i);

        }
    }

    public void cargarDatosAgresor() {
        try {
            this.lstDatos2 = FVif_2010.ObtenerDatosAgresor();

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoSexoVictima() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoSexoVictima(valorASeleccionado);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgVictima.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice" + e.getMessage());
        }
    }

    public void obtenerDatosDadoFechas() {

        long lnMilisegundos = date1.getTime();
        long lnMilisegundos1 = date2.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        java.sql.Date sqlDate1 = new java.sql.Date(lnMilisegundos1);
        try {

            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoFechas(sqlDate, sqlDate1);
            lstDatosFecha = FVif_2010.ObtenerDatosDadoFechas(sqlDate, sqlDate1);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                //DefaultRequestContext.getCurrentInstance().execute("wdlgVictima.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice" + e.getMessage());
        }
    }

    public void obtenerDatosDadoSexoAgresor() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoSexoAgresor(valorBSeleccionado);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgAgresor.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoCircuito() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoCircuito(valorCSeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgCircuito.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoSubCircuito() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoSubcircuito(valorDSeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgSubCircuito.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoEdadVictima() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoEdadVictima(valorESeleccionado);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgVictimaEdad.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoEdadAgresor() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoEdadAgresor(valorFSeleccionado);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgAgresorEdad.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoEstadoCivilVictima() {

        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoEstadoCivilVictima(valorGSeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgVictimaEstado.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoEstadoCivilAgresor() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoEstadoCivilAgresor(valorHSeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgAgresorEstado.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoOcupacionVictima() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoOcupacionVictima(valorISeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgVictimaOcupacion.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoOcupacionAgresor() {
        try {
            lstDatos.clear();
            lstDatos = FVif_2010.ObtenerDatosDadoOcupacionAgresor(valorJSeleccionada);
            if (lstDatos.isEmpty()) {
                Util.addSuccessMessage("No se ha encontrado registros con este criterio de Busqueda");
            } else {
                this.datoSel = lstDatos.get(0);
                System.out.println(lstDatos.get(0).getId());
                DefaultRequestContext.getCurrentInstance().execute("wdlgAgresorOcupacion.hide()");
                Util.addSuccessMessage("MOSTRANDO INFORMACIÓN");
            }

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
