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
import recursos.CircuitoSubcircuitoRural;
import recursos.CircuitoSubcircuitoUrbano;
import recursos.Util;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;
import recursos.CircuitosSubcircuitos;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class UnidadesFamiliaCircuitoSubcircuito {

    private ArrayList<UnidadesFamilia> lstDatos;
    private CartesianChartModel lineCircuitosRurales;
    private CartesianChartModel lineCircuitos;
    private CartesianChartModel lineCircuitosSexoVictima;
    private CartesianChartModel lineSubCircuitos;
    private CartesianChartModel lineSubCircuitosRurales;
    private int anioSel;
    private ArrayList<String> lstCircuitos;
    private ArrayList<String> lstSubCircuitos;
    private ArrayList<UnidadesFamilia> lstCircuitoGlobal;
    private ArrayList<UnidadesFamilia> lstSubCircuitoGlobal;
    private ArrayList<UnidadesFamilia> lstCircuitoSexoVictimaGlobalM;
    private ArrayList<UnidadesFamilia> lstCircuitoSexoVictimaGlobalF;
private ArrayList<UnidadesFamilia> lstCircuitosSFM;

    public ArrayList<UnidadesFamilia> getLstCircuitoSexoVictimaGlobalM() {
        return lstCircuitoSexoVictimaGlobalM;
    }

    public void setLstCircuitoSexoVictimaGlobalM(ArrayList<UnidadesFamilia> lstCircuitoSexoVictimaGlobalM) {
        this.lstCircuitoSexoVictimaGlobalM = lstCircuitoSexoVictimaGlobalM;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitoSexoVictimaGlobalF() {
        return lstCircuitoSexoVictimaGlobalF;
    }

    public void setLstCircuitoSexoVictimaGlobalF(ArrayList<UnidadesFamilia> lstCircuitoSexoVictimaGlobalF) {
        this.lstCircuitoSexoVictimaGlobalF = lstCircuitoSexoVictimaGlobalF;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitosSFM() {
        return lstCircuitosSFM;
    }

    public void setLstCircuitosSFM(ArrayList<UnidadesFamilia> lstCircuitosSFM) {
        this.lstCircuitosSFM = lstCircuitosSFM;
    }

    public ArrayList<UnidadesFamilia> getLstCircutosSFM() {
        return lstCircuitosSFM;
    }

    public void setLstCircutosSFM(ArrayList<UnidadesFamilia> lstCircuitosSFM) {
        this.lstCircuitosSFM = lstCircuitosSFM;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitoSexoVictimaGlobal() {
        return lstCircuitoSexoVictimaGlobalM;
    }

    public void setLstCircuitoSexoVictimaGlobal(ArrayList<UnidadesFamilia> lstCircuitoSexoVictimaGlobalM) {
        this.lstCircuitoSexoVictimaGlobalM = lstCircuitoSexoVictimaGlobalM;
    }
    

    public CartesianChartModel getLineCircuitosSexoVictima() {
        return lineCircuitosSexoVictima;
    }

    public void setLineCircuitosSexoVictima(CartesianChartModel lineCircuitosSexoVictima) {
        this.lineCircuitosSexoVictima = lineCircuitosSexoVictima;
    }

    public CartesianChartModel getLineSubCircuitosRurales() {
        return lineSubCircuitosRurales;
    }

    public void setLineSubCircuitosRurales(CartesianChartModel lineSubCircuitosRurales) {
        this.lineSubCircuitosRurales = lineSubCircuitosRurales;
    }

    public ArrayList<UnidadesFamilia> getLstSubCircuitoGlobal() {
        return lstSubCircuitoGlobal;
    }

    public void setLstSubCircuitoGlobal(ArrayList<UnidadesFamilia> lstSubCircuitoGlobal) {
        this.lstSubCircuitoGlobal = lstSubCircuitoGlobal;
    }

    public CartesianChartModel getLineCircuitosRurales() {
        return lineCircuitosRurales;
    }

    public void setLineCircuitosRurales(CartesianChartModel lineCircuitosRurales) {
        this.lineCircuitosRurales = lineCircuitosRurales;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitoGlobal() {
        return lstCircuitoGlobal;
    }

    public void setLstCircuitoGlobal(ArrayList<UnidadesFamilia> lstCircuitoGlobal) {
        this.lstCircuitoGlobal = lstCircuitoGlobal;
    }

    public ArrayList<UnidadesFamilia> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<UnidadesFamilia> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public CartesianChartModel getLineCircuitos() {
        return lineCircuitos;
    }

    public void setLineCircuitos(CartesianChartModel lineCircuitos) {
        this.lineCircuitos = lineCircuitos;
    }

    public CartesianChartModel getLineSubCircuitos() {
        return lineSubCircuitos;
    }

    public void setLineSubCircuitos(CartesianChartModel lineSubCircuitos) {
        this.lineSubCircuitos = lineSubCircuitos;
    }

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public ArrayList<String> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<String> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<String> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<String> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    @PostConstruct
    public void init() {
        this.lineCircuitos = graficaCircuitos(anioSel);
        this.lineCircuitosRurales = graficaCircuitosRurales(anioSel);
        this.lineSubCircuitos = graficaSubCircuitos(anioSel);
        this.lineSubCircuitosRurales = graficaSubCircuitosRurales(anioSel);
     //   this.lineCircuitosSexoVictima = graficaCircuitosSexoVictima(anioSel);
        /*this.lineSubCircuitos2013 = graficaSubcircuitos2013();
         this.lineSubCircuitos2014 = graficaSubcircuitos2014();*/

    }

    private void reinit() {
        this.init();
    }

    public UnidadesFamiliaCircuitoSubcircuito() {
        this.reinit();
    }
        
    //GRAFICA PARA CIRCUITOS URBANOS - Cristhian Moreno
    
    private CartesianChartModel graficaCircuitos(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstCircuitos = CircuitoSubcircuitoUrbano.obtenerCircuitoUrbano();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstCircuitoGlobal = FUnidadesFamilia.ObtenerDadoCircuitos(anio, lstCircuitos.get(i));
                System.out.println(lstCircuitos.get(i) + "Dimension: " + lstCircuitoGlobal.size());
                anios.set(lstCircuitos.get(i), lstCircuitoGlobal.size());
            }

            model1.addSeries(anios);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    //GRAFICA PARA CIRCUITOS RURALES - Cristhian Moreno
    
    private CartesianChartModel graficaCircuitosRurales(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstCircuitos = CircuitoSubcircuitoRural.obtenerCircuitoRural();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstCircuitoGlobal = FUnidadesFamilia.ObtenerDadoCircuitos(anio, lstCircuitos.get(i));
                System.out.println(lstCircuitos.get(i) + "Dimension: " + lstCircuitoGlobal.size());
                anios.set(lstCircuitos.get(i), lstCircuitoGlobal.size());
            }

            model1.addSeries(anios);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    //GRAFICA PARA SUBCIRCUITOS URBANOS - Cristhian Moreno
    
    private CartesianChartModel graficaSubCircuitos(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstSubCircuitos = CircuitoSubcircuitoUrbano.obtenerSubcircuitoUrbano();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstSubCircuitoGlobal = FUnidadesFamilia.ObtenerDadoSubCircuitos(anio, lstSubCircuitos.get(i));
                System.out.println(lstSubCircuitos.get(i) + "Dimension: " + lstSubCircuitoGlobal.size());
                anios.set(lstSubCircuitos.get(i), lstSubCircuitoGlobal.size());
            }

            model1.addSeries(anios);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    //GRAFICA PARA SUBCIRCUITOS RURALES - Cristhian Moreno
    
         private CartesianChartModel graficaSubCircuitosRurales(int anio) {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            this.lstSubCircuitos = CircuitoSubcircuitoRural.obtenerSubcircuitoRural();
            ChartSeries anios = new ChartSeries();
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstSubCircuitoGlobal = FUnidadesFamilia.ObtenerDadoSubCircuitos(anio, lstSubCircuitos.get(i));
                System.out.println(lstSubCircuitos.get(i) + "Dimension: " + lstSubCircuitoGlobal.size());
                anios.set(lstSubCircuitos.get(i), lstSubCircuitoGlobal.size());
            }

            model1.addSeries(anios);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }
         
    //GRAFICA PARA CIRCUITOS sexovictima - Cristhian Moreno
         
    
     /*private CartesianChartModel graficaCircuitosSexoVictimma(int anio) {
     CartesianChartModel modelTP = new CartesianChartModel();
     try {
     lstDatos = FUnidadesFamilia.ObtenerCircuitosDadoAnio(anioSel);
     ChartSeries masculino = new ChartSeries();
     masculino.setLabel("Masculino");
     for (int i = 0; i < lstDatos.size(); i++) {
     lstCircuitoSexoVictimaGlobalM = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014,lstDatos.get(i).getCircuito(),"M");
     masculino.set(lstDatos.get(i).getCircuito(),  lstCircuitoSexoVictimaGlobalM.size());
     }
            
     ChartSeries femenino = new ChartSeries();
     femenino.setLabel("Femenino");
     for (int i = 0; i < lstDatos.size(); i++) {
     lstCircuitoSexoVictimaGlobalF = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2014,lstDatos.get(i).getCircuito(),"F");
     femenino.set(lstDatos.get(i).getCircuito(), lstCircuitoSexoVictimaGlobalF.size());
     }

     modelTP.addSeries(masculino);
     modelTP.addSeries(femenino);
     } catch (Exception e) {
     Util.addErrorMessage(e, "Error");
     }
     return modelTP;
     }*/
     
     
    
}
