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
import recursos.Util;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2012;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012Edades {

    /**
     * Creates a new instance of ControladorVictimas2012Edades
     */
    private CartesianChartModel graficaEdadSV;

    private Victimas_2012 datoSel;
    private ArrayList<Victimas_2012> lstDatos;
    private ArrayList<Victimas_2012> lstDatosRango1M;
    private ArrayList<Victimas_2012> lstDatosRango1F;
    private ArrayList<Victimas_2012> lstDatosRango2M;
    private ArrayList<Victimas_2012> lstDatosRango2F;
    private ArrayList<Victimas_2012> lstDatosRango3M;
    private ArrayList<Victimas_2012> lstDatosRango3F;
    private ArrayList<Victimas_2012> lstDatosRango4M;
    private ArrayList<Victimas_2012> lstDatosRango4F;
    private ArrayList<Victimas_2012> lstDatosRango5M;
    private ArrayList<Victimas_2012> lstDatosRango5F;
    private ArrayList<Victimas_2012> lstDatosRango6M;
    private ArrayList<Victimas_2012> lstDatosRango6F;
    private ArrayList<Victimas_2012> lstDatosRango7M;
    private ArrayList<Victimas_2012> lstDatosRango7F;

    public CartesianChartModel getGraficaEdadSV() {
        return graficaEdadSV;
    }

    public void setGraficaEdadSV(CartesianChartModel graficaEdadSV) {
        this.graficaEdadSV = graficaEdadSV;
    }

    public Victimas_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Victimas_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Victimas_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Victimas_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Victimas_2012> getLstDatosRango1M() {
        return lstDatosRango1M;
    }

    public void setLstDatosRango1M(ArrayList<Victimas_2012> lstDatosRango1M) {
        this.lstDatosRango1M = lstDatosRango1M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango1F() {
        return lstDatosRango1F;
    }

    public void setLstDatosRango1F(ArrayList<Victimas_2012> lstDatosRango1F) {
        this.lstDatosRango1F = lstDatosRango1F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango2M() {
        return lstDatosRango2M;
    }

    public void setLstDatosRango2M(ArrayList<Victimas_2012> lstDatosRango2M) {
        this.lstDatosRango2M = lstDatosRango2M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango2F() {
        return lstDatosRango2F;
    }

    public void setLstDatosRango2F(ArrayList<Victimas_2012> lstDatosRango2F) {
        this.lstDatosRango2F = lstDatosRango2F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango3M() {
        return lstDatosRango3M;
    }

    public void setLstDatosRango3M(ArrayList<Victimas_2012> lstDatosRango3M) {
        this.lstDatosRango3M = lstDatosRango3M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango3F() {
        return lstDatosRango3F;
    }

    public void setLstDatosRango3F(ArrayList<Victimas_2012> lstDatosRango3F) {
        this.lstDatosRango3F = lstDatosRango3F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango4M() {
        return lstDatosRango4M;
    }

    public void setLstDatosRango4M(ArrayList<Victimas_2012> lstDatosRango4M) {
        this.lstDatosRango4M = lstDatosRango4M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango4F() {
        return lstDatosRango4F;
    }

    public void setLstDatosRango4F(ArrayList<Victimas_2012> lstDatosRango4F) {
        this.lstDatosRango4F = lstDatosRango4F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango5M() {
        return lstDatosRango5M;
    }

    public void setLstDatosRango5M(ArrayList<Victimas_2012> lstDatosRango5M) {
        this.lstDatosRango5M = lstDatosRango5M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango5F() {
        return lstDatosRango5F;
    }

    public void setLstDatosRango5F(ArrayList<Victimas_2012> lstDatosRango5F) {
        this.lstDatosRango5F = lstDatosRango5F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango6M() {
        return lstDatosRango6M;
    }

    public void setLstDatosRango6M(ArrayList<Victimas_2012> lstDatosRango6M) {
        this.lstDatosRango6M = lstDatosRango6M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango6F() {
        return lstDatosRango6F;
    }

    public void setLstDatosRango6F(ArrayList<Victimas_2012> lstDatosRango6F) {
        this.lstDatosRango6F = lstDatosRango6F;
    }

    public ArrayList<Victimas_2012> getLstDatosRango7M() {
        return lstDatosRango7M;
    }

    public void setLstDatosRango7M(ArrayList<Victimas_2012> lstDatosRango7M) {
        this.lstDatosRango7M = lstDatosRango7M;
    }

    public ArrayList<Victimas_2012> getLstDatosRango7F() {
        return lstDatosRango7F;
    }

    public void setLstDatosRango7F(ArrayList<Victimas_2012> lstDatosRango7F) {
        this.lstDatosRango7F = lstDatosRango7F;
    }
   
    
    public ControladorVictimas2012Edades() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        graficaEdadSV = graficaEdadSexoVictima();
    }

    private void reinit() {
        this.datoSel = new Victimas_2012();
        this.lstDatosRango1F = new ArrayList<Victimas_2012>();
        this.lstDatosRango1M = new ArrayList<Victimas_2012>();
        this.lstDatosRango2F = new ArrayList<Victimas_2012>();
        this.lstDatosRango2M = new ArrayList<Victimas_2012>();
        this.lstDatosRango3F = new ArrayList<Victimas_2012>();
        this.lstDatosRango3M = new ArrayList<Victimas_2012>();
        this.lstDatosRango4F = new ArrayList<Victimas_2012>();
        this.lstDatosRango4M = new ArrayList<Victimas_2012>();
        this.lstDatosRango5F = new ArrayList<Victimas_2012>();
        this.lstDatosRango5M = new ArrayList<Victimas_2012>();
        this.lstDatosRango6F = new ArrayList<Victimas_2012>();
        this.lstDatosRango6M = new ArrayList<Victimas_2012>();
        this.lstDatosRango7F = new ArrayList<Victimas_2012>();
        this.lstDatosRango7M = new ArrayList<Victimas_2012>();
        this.cargarDatos();
        this.init();
    }

    private CartesianChartModel graficaEdadSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosRango1F = FVictimas_2012.ObtenerDatosSexoVictimaEdad1("Femenino");
            lstDatosRango1M = FVictimas_2012.ObtenerDatosSexoVictimaEdad1("Masculino");
            lstDatosRango2F = FVictimas_2012.ObtenerDatosSexoVictimaEdad2("Femenino");
            lstDatosRango2M = FVictimas_2012.ObtenerDatosSexoVictimaEdad2("Masculino");
            lstDatosRango3F = FVictimas_2012.ObtenerDatosSexoVictimaEdad3("Femenino");
            lstDatosRango3M = FVictimas_2012.ObtenerDatosSexoVictimaEdad3("Masculino");
            lstDatosRango4F = FVictimas_2012.ObtenerDatosSexoVictimaEdad4("Femenino");
            lstDatosRango4M = FVictimas_2012.ObtenerDatosSexoVictimaEdad4("Masculino");
            lstDatosRango5F = FVictimas_2012.ObtenerDatosSexoVictimaEdad5("Femenino");
            lstDatosRango5M = FVictimas_2012.ObtenerDatosSexoVictimaEdad5("Masculino");
            lstDatosRango6F = FVictimas_2012.ObtenerDatosSexoVictimaEdad6("Femenino");
            lstDatosRango6M = FVictimas_2012.ObtenerDatosSexoVictimaEdad6("Masculino");
            lstDatosRango7F = FVictimas_2012.ObtenerDatosSexoVictimaEdad7("Femenino");
            lstDatosRango7M = FVictimas_2012.ObtenerDatosSexoVictimaEdad7("Masculino");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("desde 0 hasta 12", lstDatosRango1M.size());
            Masculino.set("desde 12 hasta 18", lstDatosRango2M.size());
            Masculino.set("desde 18 hasta 30", lstDatosRango3M.size());
            Masculino.set("desde 30 hasta 40", lstDatosRango4M.size());
            Masculino.set("desde 40 hasta 50", lstDatosRango5M.size());
            Masculino.set("desde 50 hasta 65", lstDatosRango6M.size());
            Masculino.set("mayores de 65", lstDatosRango7M.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("desde 0 hasta 12", lstDatosRango1F.size());
            Femenino.set("desde 12 hasta 18", lstDatosRango2F.size());
            Femenino.set("desde 18 hasta 30", lstDatosRango3F.size());
            Femenino.set("desde 30 hasta 40", lstDatosRango4F.size());
            Femenino.set("desde 40 hasta 50", lstDatosRango5F.size());
            Femenino.set("desde 50 hasta 65", lstDatosRango6F.size());
            Femenino.set("mayores de 65", lstDatosRango7F.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVictimas_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getAnios_curs());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
