/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import geoportal.rural.logica.funciones.FVifRural2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRuralEdades {

    /**
     * Creates a new instance of Controlador_VifRuralEdades
     */
    private ArrayList<VifRural2011> lstEdadRango1;
    private ArrayList<VifRural2011> lstEdadRango2;
    private ArrayList<VifRural2011> lstEdadRango3;
    private ArrayList<VifRural2011> lstEdadRango4;
    private ArrayList<VifRural2011> lstEdadRango5;
    private ArrayList<VifRural2011> lstEdadRango6;
    private ArrayList<VifRural2011> lstEdadRango7;
    private ArrayList<VifRural2011> lstEdadRango1SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango2SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango3SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango4SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango5SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango6SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango7SexoFemenino;
    private ArrayList<VifRural2011> lstEdadRango1SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango2SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango3SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango4SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango5SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango6SexoMasculino;
    private ArrayList<VifRural2011> lstEdadRango7SexoMasculino;
    private CartesianChartModel lineEdades;
    private CartesianChartModel lineEdadesSexoVictima;
    private CartesianChartModel lineEdades2011;
    private CartesianChartModel lineEdadesSexoVictima2011;
    private CartesianChartModel lineEdades2012;
    private CartesianChartModel lineEdadesSexoVictima2012;

    public CartesianChartModel getLineEdades2011() {
        return lineEdades2011;
    }

    public void setLineEdades2011(CartesianChartModel lineEdades2011) {
        this.lineEdades2011 = lineEdades2011;
    }

    public CartesianChartModel getLineEdadesSexoVictima2011() {
        return lineEdadesSexoVictima2011;
    }

    public void setLineEdadesSexoVictima2011(CartesianChartModel lineEdadesSexoVictima2011) {
        this.lineEdadesSexoVictima2011 = lineEdadesSexoVictima2011;
    }

    public CartesianChartModel getLineEdades2012() {
        return lineEdades2012;
    }

    public void setLineEdades2012(CartesianChartModel lineEdades2012) {
        this.lineEdades2012 = lineEdades2012;
    }

    public CartesianChartModel getLineEdadesSexoVictima2012() {
        return lineEdadesSexoVictima2012;
    }

    public void setLineEdadesSexoVictima2012(CartesianChartModel lineEdadesSexoVictima2012) {
        this.lineEdadesSexoVictima2012 = lineEdadesSexoVictima2012;
    }

    public CartesianChartModel getLineEdades() {
        return lineEdades;
    }

    public void setLineEdades(CartesianChartModel lineEdades) {
        this.lineEdades = lineEdades;
    }

    public CartesianChartModel getLineEdadesSexoVictima() {
        return lineEdadesSexoVictima;
    }

    public void setLineEdadesSexoVictima(CartesianChartModel lineEdadesSexoVictima) {
        this.lineEdadesSexoVictima = lineEdadesSexoVictima;
    }

    public ArrayList<VifRural2011> getLstEdadRango1() {
        return lstEdadRango1;
    }

    public void setLstEdadRango1(ArrayList<VifRural2011> lstEdadRango1) {
        this.lstEdadRango1 = lstEdadRango1;
    }

    public ArrayList<VifRural2011> getLstEdadRango2() {
        return lstEdadRango2;
    }

    public void setLstEdadRango2(ArrayList<VifRural2011> lstEdadRango2) {
        this.lstEdadRango2 = lstEdadRango2;
    }

    public ArrayList<VifRural2011> getLstEdadRango3() {
        return lstEdadRango3;
    }

    public void setLstEdadRango3(ArrayList<VifRural2011> lstEdadRango3) {
        this.lstEdadRango3 = lstEdadRango3;
    }

    public ArrayList<VifRural2011> getLstEdadRango4() {
        return lstEdadRango4;
    }

    public void setLstEdadRango4(ArrayList<VifRural2011> lstEdadRango4) {
        this.lstEdadRango4 = lstEdadRango4;
    }

    public ArrayList<VifRural2011> getLstEdadRango5() {
        return lstEdadRango5;
    }

    public void setLstEdadRango5(ArrayList<VifRural2011> lstEdadRango5) {
        this.lstEdadRango5 = lstEdadRango5;
    }

    public ArrayList<VifRural2011> getLstEdadRango6() {
        return lstEdadRango6;
    }

    public void setLstEdadRango6(ArrayList<VifRural2011> lstEdadRango6) {
        this.lstEdadRango6 = lstEdadRango6;
    }

    public ArrayList<VifRural2011> getLstEdadRango7() {
        return lstEdadRango7;
    }

    public void setLstEdadRango7(ArrayList<VifRural2011> lstEdadRango7) {
        this.lstEdadRango7 = lstEdadRango7;
    }

    public ArrayList<VifRural2011> getLstEdadRango1SexoFemenino() {
        return lstEdadRango1SexoFemenino;
    }

    public void setLstEdadRango1SexoFemenino(ArrayList<VifRural2011> lstEdadRango1SexoFemenino) {
        this.lstEdadRango1SexoFemenino = lstEdadRango1SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango2SexoFemenino() {
        return lstEdadRango2SexoFemenino;
    }

    public void setLstEdadRango2SexoFemenino(ArrayList<VifRural2011> lstEdadRango2SexoFemenino) {
        this.lstEdadRango2SexoFemenino = lstEdadRango2SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango3SexoFemenino() {
        return lstEdadRango3SexoFemenino;
    }

    public void setLstEdadRango3SexoFemenino(ArrayList<VifRural2011> lstEdadRango3SexoFemenino) {
        this.lstEdadRango3SexoFemenino = lstEdadRango3SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango4SexoFemenino() {
        return lstEdadRango4SexoFemenino;
    }

    public void setLstEdadRango4SexoFemenino(ArrayList<VifRural2011> lstEdadRango4SexoFemenino) {
        this.lstEdadRango4SexoFemenino = lstEdadRango4SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango5SexoFemenino() {
        return lstEdadRango5SexoFemenino;
    }

    public void setLstEdadRango5SexoFemenino(ArrayList<VifRural2011> lstEdadRango5SexoFemenino) {
        this.lstEdadRango5SexoFemenino = lstEdadRango5SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango6SexoFemenino() {
        return lstEdadRango6SexoFemenino;
    }

    public void setLstEdadRango6SexoFemenino(ArrayList<VifRural2011> lstEdadRango6SexoFemenino) {
        this.lstEdadRango6SexoFemenino = lstEdadRango6SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango7SexoFemenino() {
        return lstEdadRango7SexoFemenino;
    }

    public void setLstEdadRango7SexoFemenino(ArrayList<VifRural2011> lstEdadRango7SexoFemenino) {
        this.lstEdadRango7SexoFemenino = lstEdadRango7SexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEdadRango1SexoMasculino() {
        return lstEdadRango1SexoMasculino;
    }

    public void setLstEdadRango1SexoMasculino(ArrayList<VifRural2011> lstEdadRango1SexoMasculino) {
        this.lstEdadRango1SexoMasculino = lstEdadRango1SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango2SexoMasculino() {
        return lstEdadRango2SexoMasculino;
    }

    public void setLstEdadRango2SexoMasculino(ArrayList<VifRural2011> lstEdadRango2SexoMasculino) {
        this.lstEdadRango2SexoMasculino = lstEdadRango2SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango3SexoMasculino() {
        return lstEdadRango3SexoMasculino;
    }

    public void setLstEdadRango3SexoMasculino(ArrayList<VifRural2011> lstEdadRango3SexoMasculino) {
        this.lstEdadRango3SexoMasculino = lstEdadRango3SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango4SexoMasculino() {
        return lstEdadRango4SexoMasculino;
    }

    public void setLstEdadRango4SexoMasculino(ArrayList<VifRural2011> lstEdadRango4SexoMasculino) {
        this.lstEdadRango4SexoMasculino = lstEdadRango4SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango5SexoMasculino() {
        return lstEdadRango5SexoMasculino;
    }

    public void setLstEdadRango5SexoMasculino(ArrayList<VifRural2011> lstEdadRango5SexoMasculino) {
        this.lstEdadRango5SexoMasculino = lstEdadRango5SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango6SexoMasculino() {
        return lstEdadRango6SexoMasculino;
    }

    public void setLstEdadRango6SexoMasculino(ArrayList<VifRural2011> lstEdadRango6SexoMasculino) {
        this.lstEdadRango6SexoMasculino = lstEdadRango6SexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEdadRango7SexoMasculino() {
        return lstEdadRango7SexoMasculino;
    }

    public void setLstEdadRango7SexoMasculino(ArrayList<VifRural2011> lstEdadRango7SexoMasculino) {
        this.lstEdadRango7SexoMasculino = lstEdadRango7SexoMasculino;
    }

    @PostConstruct
    private void graficar() {
        this.lineEdades = graficoRangoEdades();
        this.lineEdades2011 = graficoRangoEdades2011();
        this.lineEdades2012 = graficoRangoEdades2012();
        this.lineEdadesSexoVictima = graficoEdadesSexoVictima();
        this.lineEdadesSexoVictima2011 = graficoEdadesSexoVictima2011();
        this.lineEdadesSexoVictima2012 = graficoEdadesSexoVictima2012();

    }

    public Controlador_VifRuralEdades() {
        this.graficar();
    }

    private CartesianChartModel graficoRangoEdades() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries edades = new ChartSeries();
            edades.setLabel("Rango de Edades");
            lstEdadRango1 = FVifRural2011.obtenerDatosEdadRango1(2010);
            lstEdadRango2 = FVifRural2011.obtenerDatosEdadRango2(2010);
            lstEdadRango3 = FVifRural2011.obtenerDatosEdadRango3(2010);
            lstEdadRango4 = FVifRural2011.obtenerDatosEdadRango4(2010);
            lstEdadRango5 = FVifRural2011.obtenerDatosEdadRango5(2010);
            lstEdadRango6 = FVifRural2011.obtenerDatosEdadRango6(2010);
            lstEdadRango7 = FVifRural2011.obtenerDatosEdadRango7(2010);

            edades.set("> 0 años y <= 12 años", lstEdadRango1.size());
            edades.set("> 12 años y <= 18 años", lstEdadRango2.size());
            edades.set("> 18 años y <= 30 años", lstEdadRango3.size());
            edades.set("> 30 años y <= 40 años", lstEdadRango4.size());
            edades.set("> 40 años y <= 50 años", lstEdadRango5.size());
            edades.set("> 50 años y <= 65 años", lstEdadRango6.size());
            edades.set("> 65 años", lstEdadRango7.size());

            model.addSeries(edades);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficoRangoEdades2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries edades = new ChartSeries();
            edades.setLabel("Rango de Edades");
            lstEdadRango1 = FVifRural2011.obtenerDatosEdadRango1(2011);
            lstEdadRango2 = FVifRural2011.obtenerDatosEdadRango2(2011);
            lstEdadRango3 = FVifRural2011.obtenerDatosEdadRango3(2011);
            lstEdadRango4 = FVifRural2011.obtenerDatosEdadRango4(2011);
            lstEdadRango5 = FVifRural2011.obtenerDatosEdadRango5(2011);
            lstEdadRango6 = FVifRural2011.obtenerDatosEdadRango6(2011);
            lstEdadRango7 = FVifRural2011.obtenerDatosEdadRango7(2011);

            edades.set("> 0 años y <= 12 años", lstEdadRango1.size());
            edades.set("> 12 años y <= 18 años", lstEdadRango2.size());
            edades.set("> 18 años y <= 30 años", lstEdadRango3.size());
            edades.set("> 30 años y <= 40 años", lstEdadRango4.size());
            edades.set("> 40 años y <= 50 años", lstEdadRango5.size());
            edades.set("> 50 años y <= 65 años", lstEdadRango6.size());
            edades.set("> 65 años", lstEdadRango7.size());

            model.addSeries(edades);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficoRangoEdades2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries edades = new ChartSeries();
            edades.setLabel("Rango de Edades");
            lstEdadRango1 = FVifRural2011.obtenerDatosEdadRango1(2012);
            lstEdadRango2 = FVifRural2011.obtenerDatosEdadRango2(2012);
            lstEdadRango3 = FVifRural2011.obtenerDatosEdadRango3(2012);
            lstEdadRango4 = FVifRural2011.obtenerDatosEdadRango4(2012);
            lstEdadRango5 = FVifRural2011.obtenerDatosEdadRango5(2012);
            lstEdadRango6 = FVifRural2011.obtenerDatosEdadRango6(2012);
            lstEdadRango7 = FVifRural2011.obtenerDatosEdadRango7(2012);

            edades.set("> 0 años y <= 12 años", lstEdadRango1.size());
            edades.set("> 12 años y <= 18 años", lstEdadRango2.size());
            edades.set("> 18 años y <= 30 años", lstEdadRango3.size());
            edades.set("> 30 años y <= 40 años", lstEdadRango4.size());
            edades.set("> 40 años y <= 50 años", lstEdadRango5.size());
            edades.set("> 50 años y <= 65 años", lstEdadRango6.size());
            edades.set("> 65 años", lstEdadRango7.size());

            model.addSeries(edades);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficoEdadesSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            lstEdadRango1SexoFemenino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2010, "F");
            lstEdadRango2SexoFemenino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2010, "F");
            lstEdadRango3SexoFemenino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2010, "F");
            lstEdadRango4SexoFemenino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2010, "F");
            lstEdadRango5SexoFemenino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2010, "F");
            lstEdadRango6SexoFemenino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2010, "F");
            lstEdadRango7SexoFemenino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2010, "F");

            femenino.set("> 0 años y <= 12 años", lstEdadRango1SexoFemenino.size());
            femenino.set("> 12 años y <= 18 años", lstEdadRango2SexoFemenino.size());
            femenino.set("> 18 años y <= 30 años", lstEdadRango3SexoFemenino.size());
            femenino.set("> 30 años y <= 40 años", lstEdadRango4SexoFemenino.size());
            femenino.set("> 40 años y <= 50 años", lstEdadRango5SexoFemenino.size());
            femenino.set("> 50 años y <= 65 años", lstEdadRango6SexoFemenino.size());
            femenino.set("> 65 años", lstEdadRango7SexoFemenino.size());

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");

            lstEdadRango1SexoMasculino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2010, "M");
            lstEdadRango2SexoMasculino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2010, "M");
            lstEdadRango3SexoMasculino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2010, "M");
            lstEdadRango4SexoMasculino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2010, "M");
            lstEdadRango5SexoMasculino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2010, "M");
            lstEdadRango6SexoMasculino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2010, "M");
            lstEdadRango7SexoMasculino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2010, "M");

            masculino.set("> 0 años y <= 12 años", lstEdadRango1SexoMasculino.size());
            masculino.set("> 12 años y <= 18 años", lstEdadRango2SexoMasculino.size());
            masculino.set("> 18 años y <= 30 años", lstEdadRango3SexoMasculino.size());
            masculino.set("> 30 años y <= 40 años", lstEdadRango4SexoMasculino.size());
            masculino.set("> 40 años y <= 50 años", lstEdadRango5SexoMasculino.size());
            masculino.set("> 50 años y <= 65 años", lstEdadRango6SexoMasculino.size());
            masculino.set("> 65 años", lstEdadRango7SexoMasculino.size());

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model1;
    }

    private CartesianChartModel graficoEdadesSexoVictima2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            lstEdadRango1SexoFemenino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2011, "F");
            lstEdadRango2SexoFemenino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2011, "F");
            lstEdadRango3SexoFemenino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2011, "F");
            lstEdadRango4SexoFemenino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2011, "F");
            lstEdadRango5SexoFemenino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2011, "F");
            lstEdadRango6SexoFemenino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2011, "F");
            lstEdadRango7SexoFemenino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2011, "F");

            femenino.set("> 0 años y <= 12 años", lstEdadRango1SexoFemenino.size());
            femenino.set("> 12 años y <= 18 años", lstEdadRango2SexoFemenino.size());
            femenino.set("> 18 años y <= 30 años", lstEdadRango3SexoFemenino.size());
            femenino.set("> 30 años y <= 40 años", lstEdadRango4SexoFemenino.size());
            femenino.set("> 40 años y <= 50 años", lstEdadRango5SexoFemenino.size());
            femenino.set("> 50 años y <= 65 años", lstEdadRango6SexoFemenino.size());
            femenino.set("> 65 años", lstEdadRango7SexoFemenino.size());

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");

            lstEdadRango1SexoMasculino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2011, "M");
            lstEdadRango2SexoMasculino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2011, "M");
            lstEdadRango3SexoMasculino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2011, "M");
            lstEdadRango4SexoMasculino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2011, "M");
            lstEdadRango5SexoMasculino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2011, "M");
            lstEdadRango6SexoMasculino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2011, "M");
            lstEdadRango7SexoMasculino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2011, "M");

            masculino.set("> 0 años y <= 12 años", lstEdadRango1SexoMasculino.size());
            masculino.set("> 12 años y <= 18 años", lstEdadRango2SexoMasculino.size());
            masculino.set("> 18 años y <= 30 años", lstEdadRango3SexoMasculino.size());
            masculino.set("> 30 años y <= 40 años", lstEdadRango4SexoMasculino.size());
            masculino.set("> 40 años y <= 50 años", lstEdadRango5SexoMasculino.size());
            masculino.set("> 50 años y <= 65 años", lstEdadRango6SexoMasculino.size());
            masculino.set("> 65 años", lstEdadRango7SexoMasculino.size());

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model1;
    }

    private CartesianChartModel graficoEdadesSexoVictima2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            lstEdadRango1SexoFemenino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2012, "F");
            lstEdadRango2SexoFemenino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2012, "F");
            lstEdadRango3SexoFemenino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2012, "F");
            lstEdadRango4SexoFemenino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2012, "F");
            lstEdadRango5SexoFemenino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2012, "F");
            lstEdadRango6SexoFemenino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2012, "F");
            lstEdadRango7SexoFemenino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2012, "F");

            femenino.set("> 0 años y <= 12 años", lstEdadRango1SexoFemenino.size());
            femenino.set("> 12 años y <= 18 años", lstEdadRango2SexoFemenino.size());
            femenino.set("> 18 años y <= 30 años", lstEdadRango3SexoFemenino.size());
            femenino.set("> 30 años y <= 40 años", lstEdadRango4SexoFemenino.size());
            femenino.set("> 40 años y <= 50 años", lstEdadRango5SexoFemenino.size());
            femenino.set("> 50 años y <= 65 años", lstEdadRango6SexoFemenino.size());
            femenino.set("> 65 años", lstEdadRango7SexoFemenino.size());

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");

            lstEdadRango1SexoMasculino = FVifRural2011.obtenerDatosEdadRango1DadoSexo(2012, "M");
            lstEdadRango2SexoMasculino = FVifRural2011.obtenerDatosEdadRango2DadoSexo(2012, "M");
            lstEdadRango3SexoMasculino = FVifRural2011.obtenerDatosEdadRango3DadoSexo(2012, "M");
            lstEdadRango4SexoMasculino = FVifRural2011.obtenerDatosEdadRango4DadoSexo(2012, "M");
            lstEdadRango5SexoMasculino = FVifRural2011.obtenerDatosEdadRango5DadoSexo(2012, "M");
            lstEdadRango6SexoMasculino = FVifRural2011.obtenerDatosEdadRango6DadoSexo(2012, "M");
            lstEdadRango7SexoMasculino = FVifRural2011.obtenerDatosEdadRango7DadoSexo(2012, "M");

            masculino.set("> 0 años y <= 12 años", lstEdadRango1SexoMasculino.size());
            masculino.set("> 12 años y <= 18 años", lstEdadRango2SexoMasculino.size());
            masculino.set("> 18 años y <= 30 años", lstEdadRango3SexoMasculino.size());
            masculino.set("> 30 años y <= 40 años", lstEdadRango4SexoMasculino.size());
            masculino.set("> 40 años y <= 50 años", lstEdadRango5SexoMasculino.size());
            masculino.set("> 50 años y <= 65 años", lstEdadRango6SexoMasculino.size());
            masculino.set("> 65 años", lstEdadRango7SexoMasculino.size());

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model1;
    }

}
