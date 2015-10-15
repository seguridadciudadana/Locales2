/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamilia_CircuitoSubcircuitoSexo {

    /**
     * Creates a new instance of
     * ControladorUnidadesFamilia_CircuitoSubcircuitoSexo
     */
    private ArrayList<UnidadesFamilia> lstDatos;
    private ArrayList<UnidadesFamilia> lstCircuitos;
    private ArrayList<UnidadesFamilia> lstSubcircuitos;
    private ArrayList<UnidadesFamilia> lstDadoCircuitosSexo;
    private ArrayList<UnidadesFamilia> lstDadoCircuitosSexoM;
    private ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexoM;
    private ArrayList<UnidadesFamilia> lstDadoCircuitosSexoF;
    private ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexoF;
    private ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexo;
    private CartesianChartModel lineCircuitos;
    private CartesianChartModel lineSubcircuitos;
    private CartesianChartModel lineCircuitos2014;
    private CartesianChartModel lineSubcircuitos2014;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public CartesianChartModel getLineCircuitos2014() {
        return lineCircuitos2014;
    }

    public void setLineCircuitos2014(CartesianChartModel lineCircuitos2014) {
        this.lineCircuitos2014 = lineCircuitos2014;
    }

    public CartesianChartModel getLineSubcircuitos2014() {
        return lineSubcircuitos2014;
    }

    public void setLineSubcircuitos2014(CartesianChartModel lineSubcircuitos2014) {
        this.lineSubcircuitos2014 = lineSubcircuitos2014;
    }

    public ArrayList<UnidadesFamilia> getLstDadoCircuitosSexoM() {
        return lstDadoCircuitosSexoM;
    }

    public void setLstDadoCircuitosSexoM(ArrayList<UnidadesFamilia> lstDadoCircuitosSexoM) {
        this.lstDadoCircuitosSexoM = lstDadoCircuitosSexoM;
    }

    public ArrayList<UnidadesFamilia> getLstDadoSubcircuitosSexoM() {
        return lstDadoSubcircuitosSexoM;
    }

    public void setLstDadoSubcircuitosSexoM(ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexoM) {
        this.lstDadoSubcircuitosSexoM = lstDadoSubcircuitosSexoM;
    }

    public ArrayList<UnidadesFamilia> getLstDadoCircuitosSexoF() {
        return lstDadoCircuitosSexoF;
    }

    public void setLstDadoCircuitosSexoF(ArrayList<UnidadesFamilia> lstDadoCircuitosSexoF) {
        this.lstDadoCircuitosSexoF = lstDadoCircuitosSexoF;
    }

    public ArrayList<UnidadesFamilia> getLstDadoSubcircuitosSexoF() {
        return lstDadoSubcircuitosSexoF;
    }

    public void setLstDadoSubcircuitosSexoF(ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexoF) {
        this.lstDadoSubcircuitosSexoF = lstDadoSubcircuitosSexoF;
    }

    public ArrayList<UnidadesFamilia> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<UnidadesFamilia> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<UnidadesFamilia> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<UnidadesFamilia> getLstSubcircuitos() {
        return lstSubcircuitos;
    }

    public void setLstSubcircuitos(ArrayList<UnidadesFamilia> lstSubcircuitos) {
        this.lstSubcircuitos = lstSubcircuitos;
    }

    public ArrayList<UnidadesFamilia> getLstDadoCircuitosSexo() {
        return lstDadoCircuitosSexo;
    }

    public void setLstDadoCircuitosSexo(ArrayList<UnidadesFamilia> lstDadoCircuitosSexo) {
        this.lstDadoCircuitosSexo = lstDadoCircuitosSexo;
    }

    public ArrayList<UnidadesFamilia> getLstDadoSubcircuitosSexo() {
        return lstDadoSubcircuitosSexo;
    }

    public void setLstDadoSubcircuitosSexo(ArrayList<UnidadesFamilia> lstDadoSubcircuitosSexo) {
        this.lstDadoSubcircuitosSexo = lstDadoSubcircuitosSexo;
    }

    public CartesianChartModel getLineCircuitos() {
        return lineCircuitos;
    }

    public void setLineCircuitos(CartesianChartModel lineCircuitos) {
        this.lineCircuitos = lineCircuitos;
    }

    public CartesianChartModel getLineSubcircuitos() {
        return lineSubcircuitos;
    }

    public void setLineSubcircuitos(CartesianChartModel lineSubcircuitos) {
        this.lineSubcircuitos = lineSubcircuitos;
    }

    @PostConstruct
    public void init() {
        this.lineCircuitos = graficaCircuitos(anioSel);
       /* this.lineCircuitos2014 = graficaCircuitos2014();
        this.lineSubcircuitos = graficaSubcircuitos();
        this.lineSubcircuitos2014 = graficaSubcircuitos2014();*/
    }

   private void reinit() {
        this.init();
    }
    public ControladorUnidadesFamilia_CircuitoSubcircuitoSexo() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuitos = FUnidadesFamilia.ObtenerCircuitosDadoAnio(2014);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoM = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014, lstCircuitos.get(i).getCircuito(), "M");
                masculino.set(lstCircuitos.get(i).getCircuito(), lstDadoCircuitosSexoM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoF = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014, lstCircuitos.get(i).getCircuito(), "F");
                femenino.set(lstCircuitos.get(i).getCircuito(), lstDadoCircuitosSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    /*private CartesianChartModel graficaSubcircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuitos = FUnidadesFamilia.ObtenerSubcircuitosDadoAnio(2013);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoM = FUnidadesFamilia.ObtenerDadoSubcircuitosSexoVictima(2013, lstCircuitos.get(i).getSubcircuito(), "M");
                masculino.set(lstCircuitos.get(i).getSubcircuito(), lstDadoCircuitosSexoM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoF = FUnidadesFamilia.ObtenerDadoSubcircuitosSexoVictima(2013, lstCircuitos.get(i).getSubcircuito(), "F");
                femenino.set(lstCircuitos.get(i).getSubcircuito(), lstDadoCircuitosSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaCircuitos2014() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuitos = FUnidadesFamilia.ObtenerCircuitosDadoAnio(2014);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoM = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014, lstCircuitos.get(i).getCircuito(), "M");
                masculino.set(lstCircuitos.get(i).getCircuito(), lstDadoCircuitosSexoM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoF = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014, lstCircuitos.get(i).getCircuito(), "F");
                femenino.set(lstCircuitos.get(i).getCircuito(), lstDadoCircuitosSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
     private CartesianChartModel graficaSubcircuitos2014() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuitos = FUnidadesFamilia.ObtenerSubcircuitosDadoAnio(2014);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoM = FUnidadesFamilia.ObtenerDadoSubcircuitosSexoVictima(2014, lstCircuitos.get(i).getSubcircuito(), "M");
                masculino.set(lstCircuitos.get(i).getSubcircuito(), lstDadoCircuitosSexoM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstDadoCircuitosSexoF = FUnidadesFamilia.ObtenerDadoSubcircuitosSexoVictima(2014, lstCircuitos.get(i).getSubcircuito(), "F");
                femenino.set(lstCircuitos.get(i).getSubcircuito(), lstDadoCircuitosSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    */
    

}

