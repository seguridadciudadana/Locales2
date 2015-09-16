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
public class ControladorUnidadesFamiliaMedidasAmparo {

    /**
     * Creates a new instance of
     * ControladorUnidadesFamilia_CircuitoSubcircuitoMedidas
     */
    private ArrayList<UnidadesFamilia> lstMedidasAmparo;
    private ArrayList<UnidadesFamilia> lstMedidasAmparoDadoSexoM;
    private ArrayList<UnidadesFamilia> lstMedidasAmparoDadoSexoF;
    private ArrayList<UnidadesFamilia> lstDadoMedidasAmparo;
    private ArrayList<UnidadesFamilia> lstDadoMedidasAmparoDadoAnio;
    private ArrayList<UnidadesFamilia> lstMedidasAmparodadoanio;
    private CartesianChartModel lineMedidasAmparo;
    private CartesianChartModel lineMedidasAmparoSexoVictima;

    public ArrayList<UnidadesFamilia> getLstMedidasAmparo() {
        return lstMedidasAmparo;
    }

    public void setLstMedidasAmparo(ArrayList<UnidadesFamilia> lstMedidasAmparo) {
        this.lstMedidasAmparo = lstMedidasAmparo;
    }

    public ArrayList<UnidadesFamilia> getLstMedidasAmparoDadoSexoM() {
        return lstMedidasAmparoDadoSexoM;
    }

    public void setLstMedidasAmparoDadoSexoM(ArrayList<UnidadesFamilia> lstMedidasAmparoDadoSexoM) {
        this.lstMedidasAmparoDadoSexoM = lstMedidasAmparoDadoSexoM;
    }

    public ArrayList<UnidadesFamilia> getLstMedidasAmparoDadoSexoF() {
        return lstMedidasAmparoDadoSexoF;
    }

    public void setLstMedidasAmparoDadoSexoF(ArrayList<UnidadesFamilia> lstMedidasAmparoDadoSexoF) {
        this.lstMedidasAmparoDadoSexoF = lstMedidasAmparoDadoSexoF;
    }

    public ArrayList<UnidadesFamilia> getLstDadoMedidasAmparo() {
        return lstDadoMedidasAmparo;
    }

    public void setLstDadoMedidasAmparo(ArrayList<UnidadesFamilia> lstDadoMedidasAmparo) {
        this.lstDadoMedidasAmparo = lstDadoMedidasAmparo;
    }

    public ArrayList<UnidadesFamilia> getLstMedidasAmparodadoanio() {
        return lstMedidasAmparodadoanio;
    }

    public void setLstMedidasAmparodadoanio(ArrayList<UnidadesFamilia> lstMedidasAmparodadoanio) {
        this.lstMedidasAmparodadoanio = lstMedidasAmparodadoanio;
    }

    public CartesianChartModel getLineMedidasAmparo() {
        return lineMedidasAmparo;
    }

    public void setLineMedidasAmparo(CartesianChartModel lineMedidasAmparo) {
        this.lineMedidasAmparo = lineMedidasAmparo;
    }

    public CartesianChartModel getLineMedidasAmparoSexoVictima() {
        return lineMedidasAmparoSexoVictima;
    }

    public void setLineMedidasAmparoSexoVictima(CartesianChartModel lineMedidasAmparoSexoVictima) {
        this.lineMedidasAmparoSexoVictima = lineMedidasAmparoSexoVictima;
    }

    @PostConstruct
    private void graficar() {
        this.lineMedidasAmparoSexoVictima = graficaMedidaAmparoSexo();
       // this.lineMedidasAmparo = graficaMedidasAmparoDadoCircuito();

    }

    public ControladorUnidadesFamiliaMedidasAmparo() {
        this.graficar();
    }

    private CartesianChartModel graficaMedidaAmparoSexo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstMedidasAmparo = FUnidadesFamilia.obtenerDatosDadoMedidasAmparo(null);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstDadoMedidasAmparo.size(); i++) {
                lstMedidasAmparoDadoSexoM = FUnidadesFamilia.obtenerDatosDadoMedidasAmparoSexoVictima(null, "M");
                masculino.set(lstDadoMedidasAmparo.get(i).getMedidas_de_amparo(), lstMedidasAmparoDadoSexoM.size());
            }
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstDadoMedidasAmparo.size(); i++) {
                lstMedidasAmparoDadoSexoF = FUnidadesFamilia.obtenerDatosDadoMedidasAmparoSexoVictima(null, "F");
                masculino.set(lstDadoMedidasAmparo.get(i).getMedidas_de_amparo(), lstMedidasAmparoDadoSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;

    }
}
