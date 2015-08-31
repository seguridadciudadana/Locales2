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
public class Controlador_VifRuralParentesco {

    /**
     * Creates a new instance of Controlador_VifRuralParentesco
     */
    private ArrayList<VifRural2011> lstParentesco;
    private ArrayList<VifRural2011> lstDatosDadoParentesco;
    private ArrayList<VifRural2011> lstDatosDadoParentescoSM;
    private ArrayList<VifRural2011> lstDatosDadoParentescoSF;
    private CartesianChartModel lineParentesco2010;
    private CartesianChartModel lineParentesco2011;
    private CartesianChartModel lineParentesco2012;
    private CartesianChartModel lineParentescoSexoVictima2010;
    private CartesianChartModel lineParentescoSexoVictima2011;
    private CartesianChartModel lineParentescoSexoVictima2012;

    public CartesianChartModel getLineParentesco2010() {
        return lineParentesco2010;
    }

    public void setLineParentesco2010(CartesianChartModel lineParentesco2010) {
        this.lineParentesco2010 = lineParentesco2010;
    }

    public CartesianChartModel getLineParentesco2011() {
        return lineParentesco2011;
    }

    public void setLineParentesco2011(CartesianChartModel lineParentesco2011) {
        this.lineParentesco2011 = lineParentesco2011;
    }

    public CartesianChartModel getLineParentesco2012() {
        return lineParentesco2012;
    }

    public void setLineParentesco2012(CartesianChartModel lineParentesco2012) {
        this.lineParentesco2012 = lineParentesco2012;
    }

    public CartesianChartModel getLineParentescoSexoVictima2010() {
        return lineParentescoSexoVictima2010;
    }

    public void setLineParentescoSexoVictima2010(CartesianChartModel lineParentescoSexoVictima2010) {
        this.lineParentescoSexoVictima2010 = lineParentescoSexoVictima2010;
    }

    public CartesianChartModel getLineParentescoSexoVictima2011() {
        return lineParentescoSexoVictima2011;
    }

    public void setLineParentescoSexoVictima2011(CartesianChartModel lineParentescoSexoVictima2011) {
        this.lineParentescoSexoVictima2011 = lineParentescoSexoVictima2011;
    }

    public CartesianChartModel getLineParentescoSexoVictima2012() {
        return lineParentescoSexoVictima2012;
    }

    public void setLineParentescoSexoVictima2012(CartesianChartModel lineParentescoSexoVictima2012) {
        this.lineParentescoSexoVictima2012 = lineParentescoSexoVictima2012;
    }

    public ArrayList<VifRural2011> getLstParentesco() {
        return lstParentesco;
    }

    public void setLstParentesco(ArrayList<VifRural2011> lstParentesco) {
        this.lstParentesco = lstParentesco;
    }

    public ArrayList<VifRural2011> getLstDatosDadoParentesco() {
        return lstDatosDadoParentesco;
    }

    public void setLstDatosDadoParentesco(ArrayList<VifRural2011> lstDatosDadoParentesco) {
        this.lstDatosDadoParentesco = lstDatosDadoParentesco;
    }

    public ArrayList<VifRural2011> getLstDatosDadoParentescoSM() {
        return lstDatosDadoParentescoSM;
    }

    public void setLstDatosDadoParentescoSM(ArrayList<VifRural2011> lstDatosDadoParentescoSM) {
        this.lstDatosDadoParentescoSM = lstDatosDadoParentescoSM;
    }

    public ArrayList<VifRural2011> getLstDatosDadoParentescoSF() {
        return lstDatosDadoParentescoSF;
    }

    public void setLstDatosDadoParentescoSF(ArrayList<VifRural2011> lstDatosDadoParentescoSF) {
        this.lstDatosDadoParentescoSF = lstDatosDadoParentescoSF;
    }

    @PostConstruct
    private void graficar() {
        this.lineParentesco2010 = graficoParentesco2010();
        this.lineParentescoSexoVictima2010 = graficoParentescoSexoVictima2010();
        this.lineParentesco2011 = graficoParentesco2011();
        this.lineParentescoSexoVictima2011 = graficoParentescoSexoVictima2011();
        this.lineParentesco2012 = graficoParentesco2012();
        this.lineParentescoSexoVictima2012 = graficoParentescoSexoVictima2012();

    }

    private void reinit() {
        this.graficar();
    }

    public Controlador_VifRuralParentesco() {
        this.reinit();
    }

    private CartesianChartModel graficoParentesco2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2011);
            ChartSeries parentesco = new ChartSeries();
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentesco = FVifRural2011.ObtenerDatosDadoAnioParentesco(2011, lstParentesco.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentesco.size());
            }

            model1.addSeries(parentesco);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoParentesco2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2012);
            ChartSeries parentesco = new ChartSeries();
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentesco = FVifRural2011.ObtenerDatosDadoAnioParentesco(2012, lstParentesco.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentesco.size());
            }

            model1.addSeries(parentesco);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoParentesco2010() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2010);
            ChartSeries parentesco = new ChartSeries();
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentesco = FVifRural2011.ObtenerDatosDadoAnioParentesco(2010, lstParentesco.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentesco.size());
            }

            model1.addSeries(parentesco);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoParentescoSexoVictima2010() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2010);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("masculino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSF = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2010, lstParentesco.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("femenino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSM = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2010, lstParentesco.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoParentescoSexoVictima2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2011);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("masculino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSF = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2011, lstParentesco.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("femenino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSM = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2011, lstParentesco.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoParentescoSexoVictima2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstParentesco = FVifRural2011.ObtenerDatosParentesco(2012);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("masculino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSF = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2012, lstParentesco.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("femenino");
            for (int i = 0; i < lstParentesco.size(); i++) {
                lstDatosDadoParentescoSM = FVifRural2011.ObtenerDatosDadoAnioParentescoSexoVictima(2012, lstParentesco.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

}
