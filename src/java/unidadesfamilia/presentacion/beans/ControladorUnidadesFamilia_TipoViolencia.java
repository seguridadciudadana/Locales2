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
import unidadesfamilia.logica.clases.UnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamilia_TipoViolencia {

    /**
     * Creates a new instance of ControladorUnidadesFamilia_TipoViolencia
     */
    private ArrayList<UnidadesFamilia> lstTipoViolencia;
    private ArrayList<UnidadesFamilia> lstTipoViolenciaDadoSexoM;
    private ArrayList<UnidadesFamilia> lstTipoViolenciaDadoSexoF;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineTipoViolenciaSexoVictima;

    public ArrayList<UnidadesFamilia> getLstTipoViolencia() {
        return lstTipoViolencia;
    }

    public void setLstTipoViolencia(ArrayList<UnidadesFamilia> lstTipoViolencia) {
        this.lstTipoViolencia = lstTipoViolencia;
    }

    public ArrayList<UnidadesFamilia> getLstTipoViolenciaDadoSexoM() {
        return lstTipoViolenciaDadoSexoM;
    }

    public void setLstTipoViolenciaDadoSexoM(ArrayList<UnidadesFamilia> lstTipoViolenciaDadoSexoM) {
        this.lstTipoViolenciaDadoSexoM = lstTipoViolenciaDadoSexoM;
    }

    public ArrayList<UnidadesFamilia> getLstTipoViolenciaDadoSexoF() {
        return lstTipoViolenciaDadoSexoF;
    }

    public void setLstTipoViolenciaDadoSexoF(ArrayList<UnidadesFamilia> lstTipoViolenciaDadoSexoF) {
        this.lstTipoViolenciaDadoSexoF = lstTipoViolenciaDadoSexoF;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima() {
        return lineTipoViolenciaSexoVictima;
    }

    public void setLineTipoViolenciaSexoVictima(CartesianChartModel lineTipoViolenciaSexoVictima) {
        this.lineTipoViolenciaSexoVictima = lineTipoViolenciaSexoVictima;
    }

    @PostConstruct
    private void graficar() {

    }

    public ControladorUnidadesFamilia_TipoViolencia() {
        this.graficar();
    }

    private CartesianChartModel graficaTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        return model;

    }

}
