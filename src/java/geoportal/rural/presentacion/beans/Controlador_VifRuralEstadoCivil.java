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
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRuralEstadoCivil {

    private ArrayList<VifRural2011> lstEstadoCivil;
    private ArrayList<VifRural2011> lstDadoEstadoCivil;
    private ArrayList<VifRural2011> lstDadoEstadoCivilM;
    private ArrayList<VifRural2011> lstDadoEstadoCivilF;
    private CartesianChartModel lineEstadoCivil;
    private CartesianChartModel lineEstadoCivilSexoVictima;
    private CartesianChartModel lineEstadoCivil2012;
    private CartesianChartModel lineEstadoCivilSexoVictima2012;
    private CartesianChartModel lineEstadoCivil2011;
    private CartesianChartModel lineEstadoCivilSexoVictima2011;

    public CartesianChartModel getLineEstadoCivil2012() {
        return lineEstadoCivil2012;
    }

    public void setLineEstadoCivil2012(CartesianChartModel lineEstadoCivil2012) {
        this.lineEstadoCivil2012 = lineEstadoCivil2012;
    }

    public CartesianChartModel getLineEstadoCivilSexoVictima2012() {
        return lineEstadoCivilSexoVictima2012;
    }

    public void setLineEstadoCivilSexoVictima2012(CartesianChartModel lineEstadoCivilSexoVictima2012) {
        this.lineEstadoCivilSexoVictima2012 = lineEstadoCivilSexoVictima2012;
    }

    public CartesianChartModel getLineEstadoCivil2011() {
        return lineEstadoCivil2011;
    }

    public void setLineEstadoCivil2011(CartesianChartModel lineEstadoCivil2011) {
        this.lineEstadoCivil2011 = lineEstadoCivil2011;
    }

    public CartesianChartModel getLineEstadoCivilSexoVictima2011() {
        return lineEstadoCivilSexoVictima2011;
    }

    public void setLineEstadoCivilSexoVictima2011(CartesianChartModel lineEstadoCivilSexoVictima2011) {
        this.lineEstadoCivilSexoVictima2011 = lineEstadoCivilSexoVictima2011;
    }

    public ArrayList<VifRural2011> getLstDadoEstadoCivilM() {
        return lstDadoEstadoCivilM;
    }

    public void setLstDadoEstadoCivilM(ArrayList<VifRural2011> lstDadoEstadoCivilM) {
        this.lstDadoEstadoCivilM = lstDadoEstadoCivilM;
    }

    public ArrayList<VifRural2011> getLstDadoEstadoCivilF() {
        return lstDadoEstadoCivilF;
    }

    public void setLstDadoEstadoCivilF(ArrayList<VifRural2011> lstDadoEstadoCivilF) {
        this.lstDadoEstadoCivilF = lstDadoEstadoCivilF;
    }

    public CartesianChartModel getLineEstadoCivilSexoVictima() {
        return lineEstadoCivilSexoVictima;
    }

    public void setLineEstadoCivilSexoVictima(CartesianChartModel lineEstadoCivilSexoVictima) {
        this.lineEstadoCivilSexoVictima = lineEstadoCivilSexoVictima;
    }

    public ArrayList<VifRural2011> getLstEstadoCivil() {
        return lstEstadoCivil;
    }

    public void setLstEstadoCivil(ArrayList<VifRural2011> lstEstadoCivil) {
        this.lstEstadoCivil = lstEstadoCivil;
    }

    public ArrayList<VifRural2011> getLstDadoEstadoCivil() {
        return lstDadoEstadoCivil;
    }

    public void setLstDadoEstadoCivil(ArrayList<VifRural2011> lstDadoEstadoCivil) {
        this.lstDadoEstadoCivil = lstDadoEstadoCivil;
    }

    public CartesianChartModel getLineEstadoCivil() {
        return lineEstadoCivil;
    }

    public void setLineEstadoCivil(CartesianChartModel lineEstadoCivil) {
        this.lineEstadoCivil = lineEstadoCivil;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();
    }

    public void graficar() {
        this.lineEstadoCivil2011 = graficoEstadoCivil2011();
        this.lineEstadoCivilSexoVictima2011 = graficoEstadoCivil2011SexoVictima();
        this.lineEstadoCivil2012 = graficoEstadoCivil2012();
        this.lineEstadoCivilSexoVictima2012 = graficoEstadoCivil2012SexoVictima();
    }

    public Controlador_VifRuralEstadoCivil() {
        this.reinit();
    }

    private CartesianChartModel graficoEstadoCivil2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioEstadoCivil(2011);
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioDadoEstadoCivilVictima(2011, lstEstadoCivil.get(i).getEstado_civil_victima());
                EstadoCivil.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivil.size());
            }
            model1.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoEstadoCivil2011SexoVictima() {        
        CartesianChartModel model2 = new CartesianChartModel();
        try {
           lstEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioEstadoCivil(2011);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivilM = FVifRural2011.ObtenerDatosDadoEstadoCivilSexoVictima(2011, lstEstadoCivil.get(i).getEstado_civil_victima(), "M");
                masculino.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivilM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivilF = FVifRural2011.ObtenerDatosDadoEstadoCivilSexoVictima(2011, lstEstadoCivil.get(i).getEstado_civil_victima(), "F");
               femenino.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivilF.size());
            }
             model2.addSeries(femenino);
            model2.addSeries(masculino);
           

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel graficoEstadoCivil2012() {
        CartesianChartModel model3 = new CartesianChartModel();
        try {
            lstEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioEstadoCivil(2012);
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioDadoEstadoCivilVictima(2012, lstEstadoCivil.get(i).getEstado_civil_victima());
                EstadoCivil.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivil.size());
            }
            model3.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model3;
    }

    private CartesianChartModel graficoEstadoCivil2012SexoVictima() {
        CartesianChartModel model4 = new CartesianChartModel();
        try {
            lstEstadoCivil = FVifRural2011.ObtenerDatosDadoAnioEstadoCivil(2012);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Estado Civil");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivilM = FVifRural2011.ObtenerDatosDadoEstadoCivilSexoVictima(2012, lstEstadoCivil.get(i).getEstado_civil_victima(), "M");
                masculino.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivilM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Estado Civil");
            for (int i = 0; i < lstEstadoCivil.size(); i++) {
                lstDadoEstadoCivilF = FVifRural2011.ObtenerDatosDadoEstadoCivilSexoVictima(2012, lstEstadoCivil.get(i).getEstado_civil_victima(), "F");
               femenino.set(lstEstadoCivil.get(i).getEstado_civil_victima(), lstDadoEstadoCivilF.size());
            }
            model4.addSeries(masculino);
            model4.addSeries(femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model4;
    }

}
