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
import recursos.Util;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class UnidadesFamiliaCircuitoSubcircuito {

    private ArrayList<UnidadesFamilia> lstDatos2013;
    private ArrayList<UnidadesFamilia> lstDatos2014;
    private ArrayList<UnidadesFamilia> lstCircuitos2013;
    private ArrayList<UnidadesFamilia> lstCircuitos2013DadoSexo;
    private ArrayList<UnidadesFamilia> lstCircuitos2013DadoSexoF;
    private ArrayList<UnidadesFamilia> lstCircuitos2014;
    private ArrayList<UnidadesFamilia> lstCircuitos2014DadoSexo;
    private ArrayList<UnidadesFamilia> lstCircuitos2014DadoSexoF;
    private ArrayList<UnidadesFamilia> lstDadoCircuitos2013;
    private ArrayList<UnidadesFamilia> lstDadoCircuitos2014;
    private ArrayList<UnidadesFamilia> lstSubcircuitos2013;
    private ArrayList<UnidadesFamilia> lstSubcircuitos2014;
    private ArrayList<UnidadesFamilia> lstDadoSubcircuitos2013;
    private ArrayList<UnidadesFamilia> lstDadoSubcircuitos2014;
    private CartesianChartModel lineCircuitos2013;
    private CartesianChartModel lineSubCircuitos2013;
    private CartesianChartModel lineCircuitos2014;
    private CartesianChartModel lineSubCircuitos2014;

    private CartesianChartModel lineCircuitos2013SV;
    private CartesianChartModel lineSubCircuitos2013SV;
    private CartesianChartModel lineCircuitos2014SV;
    private CartesianChartModel lineSubCircuitos2014SV;

    public ArrayList<UnidadesFamilia> getLstCircuitos2013DadoSexoF() {
        return lstCircuitos2013DadoSexoF;
    }

    public void setLstCircuitos2013DadoSexoF(ArrayList<UnidadesFamilia> lstCircuitos2013DadoSexoF) {
        this.lstCircuitos2013DadoSexoF = lstCircuitos2013DadoSexoF;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos2014DadoSexoF() {
        return lstCircuitos2014DadoSexoF;
    }

    public void setLstCircuitos2014DadoSexoF(ArrayList<UnidadesFamilia> lstCircuitos2014DadoSexoF) {
        this.lstCircuitos2014DadoSexoF = lstCircuitos2014DadoSexoF;
    }

    public CartesianChartModel getLineCircuitos2013SV() {
        return lineCircuitos2013SV;
    }

    public void setLineCircuitos2013SV(CartesianChartModel lineCircuitos2013SV) {
        this.lineCircuitos2013SV = lineCircuitos2013SV;
    }

    public CartesianChartModel getLineSubCircuitos2013SV() {
        return lineSubCircuitos2013SV;
    }

    public void setLineSubCircuitos2013SV(CartesianChartModel lineSubCircuitos2013SV) {
        this.lineSubCircuitos2013SV = lineSubCircuitos2013SV;
    }

    public CartesianChartModel getLineCircuitos2014SV() {
        return lineCircuitos2014SV;
    }

    public void setLineCircuitos2014SV(CartesianChartModel lineCircuitos2014SV) {
        this.lineCircuitos2014SV = lineCircuitos2014SV;
    }

    public CartesianChartModel getLineSubCircuitos2014SV() {
        return lineSubCircuitos2014SV;
    }

    public void setLineSubCircuitos2014SV(CartesianChartModel lineSubCircuitos2014SV) {
        this.lineSubCircuitos2014SV = lineSubCircuitos2014SV;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos2013DadoSexo() {
        return lstCircuitos2013DadoSexo;
    }

    public void setLstCircuitos2013DadoSexo(ArrayList<UnidadesFamilia> lstCircuitos2013DadoSexo) {
        this.lstCircuitos2013DadoSexo = lstCircuitos2013DadoSexo;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos2014DadoSexo() {
        return lstCircuitos2014DadoSexo;
    }

    public void setLstCircuitos2014DadoSexo(ArrayList<UnidadesFamilia> lstCircuitos2014DadoSexo) {
        this.lstCircuitos2014DadoSexo = lstCircuitos2014DadoSexo;
    }

    public ArrayList<UnidadesFamilia> getLstDatos2013() {
        return lstDatos2013;
    }

    public void setLstDatos2013(ArrayList<UnidadesFamilia> lstDatos2013) {
        this.lstDatos2013 = lstDatos2013;
    }

    public ArrayList<UnidadesFamilia> getLstDatos2014() {
        return lstDatos2014;
    }

    public void setLstDatos2014(ArrayList<UnidadesFamilia> lstDatos2014) {
        this.lstDatos2014 = lstDatos2014;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos2013() {
        return lstCircuitos2013;
    }

    public void setLstCircuitos2013(ArrayList<UnidadesFamilia> lstCircuitos2013) {
        this.lstCircuitos2013 = lstCircuitos2013;
    }

    public ArrayList<UnidadesFamilia> getLstCircuitos2014() {
        return lstCircuitos2014;
    }

    public void setLstCircuitos2014(ArrayList<UnidadesFamilia> lstCircuitos2014) {
        this.lstCircuitos2014 = lstCircuitos2014;
    }

    public ArrayList<UnidadesFamilia> getLstDadoCircuitos2013() {
        return lstDadoCircuitos2013;
    }

    public void setLstDadoCircuitos2013(ArrayList<UnidadesFamilia> lstDadoCircuitos2013) {
        this.lstDadoCircuitos2013 = lstDadoCircuitos2013;
    }

    public ArrayList<UnidadesFamilia> getLstDadoCircuitos2014() {
        return lstDadoCircuitos2014;
    }

    public void setLstDadoCircuitos2014(ArrayList<UnidadesFamilia> lstDadoCircuitos2014) {
        this.lstDadoCircuitos2014 = lstDadoCircuitos2014;
    }

    public ArrayList<UnidadesFamilia> getLstSubcircuitos2013() {
        return lstSubcircuitos2013;
    }

    public void setLstSubcircuitos2013(ArrayList<UnidadesFamilia> lstSubcircuitos2013) {
        this.lstSubcircuitos2013 = lstSubcircuitos2013;
    }

    public ArrayList<UnidadesFamilia> getLstSubcircuitos2014() {
        return lstSubcircuitos2014;
    }

    public void setLstSubcircuitos2014(ArrayList<UnidadesFamilia> lstSubcircuitos2014) {
        this.lstSubcircuitos2014 = lstSubcircuitos2014;
    }

    public ArrayList<UnidadesFamilia> getLstDadoSubcircuitos2013() {
        return lstDadoSubcircuitos2013;
    }

    public void setLstDadoSubcircuitos2013(ArrayList<UnidadesFamilia> lstDadoSubcircuitos2013) {
        this.lstDadoSubcircuitos2013 = lstDadoSubcircuitos2013;
    }

    public ArrayList<UnidadesFamilia> getLstDadoSubcircuitos2014() {
        return lstDadoSubcircuitos2014;
    }

    public void setLstDadoSubcircuitos2014(ArrayList<UnidadesFamilia> lstDadoSubcircuitos2014) {
        this.lstDadoSubcircuitos2014 = lstDadoSubcircuitos2014;
    }

    public CartesianChartModel getLineCircuitos2013() {
        return lineCircuitos2013;
    }

    public void setLineCircuitos2013(CartesianChartModel lineCircuitos2013) {
        this.lineCircuitos2013 = lineCircuitos2013;
    }

    public CartesianChartModel getLineSubCircuitos2013() {
        return lineSubCircuitos2013;
    }

    public void setLineSubCircuitos2013(CartesianChartModel lineSubCircuitos2013) {
        this.lineSubCircuitos2013 = lineSubCircuitos2013;
    }

    public CartesianChartModel getLineCircuitos2014() {
        return lineCircuitos2014;
    }

    public void setLineCircuitos2014(CartesianChartModel lineCircuitos2014) {
        this.lineCircuitos2014 = lineCircuitos2014;
    }

    public CartesianChartModel getLineSubCircuitos2014() {
        return lineSubCircuitos2014;
    }

    public void setLineSubCircuitos2014(CartesianChartModel lineSubCircuitos2014) {
        this.lineSubCircuitos2014 = lineSubCircuitos2014;
    }

    public void reinit() {
        this.init();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void graficar() {
        this.lineCircuitos2013 = graficaCircuitos2013();
        this.lineCircuitos2014 = graficaCircuitos2014();
        this.lineSubCircuitos2013 = graficaSubcircuitos2013();
        this.lineSubCircuitos2014 = graficaSubcircuitos2014();

    }

    public UnidadesFamiliaCircuitoSubcircuito() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitos2013() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            lstCircuitos2013 = FUnidadesFamilia.ObtenerCircuitosDadoAnio(2013);
            ChartSeries circuitos = new ChartSeries();
            circuitos.setLabel("Denuncias generales por circuitos");
            for (int i = 0; i < lstCircuitos2013.size(); i++) {
                lstDadoCircuitos2013 = FUnidadesFamilia.ObtenerDadoCircuitos(2013, lstCircuitos2013.get(i).getCircuito());
                circuitos.set(lstCircuitos2013.get(i).getCircuito(), lstDadoCircuitos2013.size());
            }

            modelTP.addSeries(circuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

    private CartesianChartModel graficaSubcircuitos2013() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            lstSubcircuitos2013 = FUnidadesFamilia.ObtenerSubcircuitosDadoAnio(2013);
            ChartSeries subcircuitos = new ChartSeries();
            subcircuitos.setLabel("Denuncias generales por circuitos");
            for (int i = 0; i < lstSubcircuitos2013.size(); i++) {
                lstDadoSubcircuitos2013 = FUnidadesFamilia.ObtenerDadoSubCircuitos(2013, lstSubcircuitos2013.get(i).getSubcircuito());
                subcircuitos.set(lstSubcircuitos2013.get(i).getSubcircuito(), lstDadoSubcircuitos2013.size());
            }

            modelTP.addSeries(subcircuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

    private CartesianChartModel graficaCircuitosSexoVictima2013() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            lstCircuitos2013 = FUnidadesFamilia.ObtenerCircuitosDadoAnio(2013);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            for (int i = 0; i < lstCircuitos2013.size(); i++) {
                lstCircuitos2013DadoSexo = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2013, "M", lstCircuitos2013.get(i).getCircuito());
                masculino.set(lstCircuitos2013.get(i).getCircuito(), lstCircuitos2013DadoSexo.size());
            }
            
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            for (int i = 0; i < lstCircuitos2013.size(); i++) {
                lstCircuitos2013DadoSexoF = FUnidadesFamilia.ObtenerDadoCircuitosSexoVictima(2013, "F", lstCircuitos2013.get(i).getCircuito());
                femenino.set(lstCircuitos2013.get(i).getCircuito(), lstCircuitos2013DadoSexoF.size());
            }

            modelTP.addSeries(masculino);
            modelTP.addSeries(femenino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

    private CartesianChartModel graficaCircuitos2014() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            lstCircuitos2014 = FUnidadesFamilia.ObtenerCircuitosDadoAnio(2014);
            ChartSeries circuitos = new ChartSeries();
            circuitos.setLabel("Denuncias generales por circuitos");
            for (int i = 0; i < lstCircuitos2014.size(); i++) {
                lstDadoCircuitos2014 = FUnidadesFamilia.ObtenerDadoCircuitos(2014, lstCircuitos2014.get(i).getCircuito());
                circuitos.set(lstCircuitos2014.get(i).getCircuito(), lstDadoCircuitos2014.size());
            }

            modelTP.addSeries(circuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

    private CartesianChartModel graficaSubcircuitos2014() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            lstSubcircuitos2014 = FUnidadesFamilia.ObtenerSubcircuitosDadoAnio(2014);
            ChartSeries subcircuitos = new ChartSeries();
            subcircuitos.setLabel("Denuncias generales por circuitos");
            for (int i = 0; i < lstSubcircuitos2014.size(); i++) {
                lstDadoSubcircuitos2014 = FUnidadesFamilia.ObtenerDadoSubCircuitos(2014, lstSubcircuitos2014.get(i).getSubcircuito());
                subcircuitos.set(lstSubcircuitos2014.get(i).getSubcircuito(), lstDadoSubcircuitos2014.size());
            }

            modelTP.addSeries(subcircuitos);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

}
