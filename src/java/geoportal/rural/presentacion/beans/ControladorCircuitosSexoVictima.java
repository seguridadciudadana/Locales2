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
 * @author ICITS SALA5
 */
@ManagedBean
@RequestScoped
public class ControladorCircuitosSexoVictima {

    private ArrayList<VifRural2011> lstDatos;
    private ArrayList<VifRural2011> lstDatosCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoCircuitosDadoSexo;
    private ArrayList<VifRural2011> lstDatosSubCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoSubCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoSubCircuitosDadoSexo;
    private ArrayList<VifRural2011> lstDatos2011DadoCircuitosDadoSexoF;
    private ArrayList<VifRural2011> lstDatos2012DadoCircuitosDadoSexoF;
    private ArrayList<VifRural2011> lstDatos2012DadoCircuitosDadoSexoM;
    private ArrayList<VifRural2011> lstDatos2011DadoCircuitosDadoSexoM;
    private ArrayList<VifRural2011> lstDatos2011DadoSubcircuitosDadoSexoF;
    private ArrayList<VifRural2011> lstDatos2012DadoSubcircuitosDadoSexoF;
    private ArrayList<VifRural2011> lstDatos2012DadoSubcircuitosDadoSexoM;
    private ArrayList<VifRural2011> lstDatos2011DadoSubcircuitosDadoSexoM;

    private CartesianChartModel lineCircuitos;
    private CartesianChartModel lineCircuitos2010;
    private CartesianChartModel lineCircuitos2011;
    private CartesianChartModel lineCircuitos2012;
    private CartesianChartModel lineCircuitos2011SexoVictima;
    private CartesianChartModel lineCircuitos2012SexoVictima;
    private CartesianChartModel lineSubCircuitos;
    private CartesianChartModel lineSubCircuitos2010;
    private CartesianChartModel lineSubCircuitos2011;
    private CartesianChartModel lineSubCircuitos2010SexoVictima;
    private CartesianChartModel lineSubCircuitos2011SexoVictima;
    private CartesianChartModel lineSubCircuitos2012SexoVictima;
    private CartesianChartModel lineSubCircuitos2012;

    public CartesianChartModel getLineSubCircuitos2012SexoVictima() {
        return lineSubCircuitos2012SexoVictima;
    }

    public void setLineSubCircuitos2012SexoVictima(CartesianChartModel lineSubCircuitos2012SexoVictima) {
        this.lineSubCircuitos2012SexoVictima = lineSubCircuitos2012SexoVictima;
    }

    public ArrayList<VifRural2011> getLstDatos2011DadoCircuitosDadoSexoF() {
        return lstDatos2011DadoCircuitosDadoSexoF;
    }

    public void setLstDatos2011DadoCircuitosDadoSexoF(ArrayList<VifRural2011> lstDatos2011DadoCircuitosDadoSexoF) {
        this.lstDatos2011DadoCircuitosDadoSexoF = lstDatos2011DadoCircuitosDadoSexoF;
    }

    public ArrayList<VifRural2011> getLstDatos2012DadoCircuitosDadoSexoF() {
        return lstDatos2012DadoCircuitosDadoSexoF;
    }

    public void setLstDatos2012DadoCircuitosDadoSexoF(ArrayList<VifRural2011> lstDatos2012DadoCircuitosDadoSexoF) {
        this.lstDatos2012DadoCircuitosDadoSexoF = lstDatos2012DadoCircuitosDadoSexoF;
    }

    public ArrayList<VifRural2011> getLstDatos2012DadoCircuitosDadoSexoM() {
        return lstDatos2012DadoCircuitosDadoSexoM;
    }

    public void setLstDatos2012DadoCircuitosDadoSexoM(ArrayList<VifRural2011> lstDatos2012DadoCircuitosDadoSexoM) {
        this.lstDatos2012DadoCircuitosDadoSexoM = lstDatos2012DadoCircuitosDadoSexoM;
    }

    public ArrayList<VifRural2011> getLstDatos2011DadoCircuitosDadoSexoM() {
        return lstDatos2011DadoCircuitosDadoSexoM;
    }

    public void setLstDatos2011DadoCircuitosDadoSexoM(ArrayList<VifRural2011> lstDatos2011DadoCircuitosDadoSexoM) {
        this.lstDatos2011DadoCircuitosDadoSexoM = lstDatos2011DadoCircuitosDadoSexoM;
    }

    public ArrayList<VifRural2011> getLstDatos2011DadoSubcircuitosDadoSexoF() {
        return lstDatos2011DadoSubcircuitosDadoSexoF;
    }

    public void setLstDatos2011DadoSubcircuitosDadoSexoF(ArrayList<VifRural2011> lstDatos2011DadoSubcircuitosDadoSexoF) {
        this.lstDatos2011DadoSubcircuitosDadoSexoF = lstDatos2011DadoSubcircuitosDadoSexoF;
    }

    public ArrayList<VifRural2011> getLstDatos2012DadoSubcircuitosDadoSexoF() {
        return lstDatos2012DadoSubcircuitosDadoSexoF;
    }

    public void setLstDatos2012DadoSubcircuitosDadoSexoF(ArrayList<VifRural2011> lstDatos2012DadoSubcircuitosDadoSexoF) {
        this.lstDatos2012DadoSubcircuitosDadoSexoF = lstDatos2012DadoSubcircuitosDadoSexoF;
    }

    public ArrayList<VifRural2011> getLstDatos2012DadoSubcircuitosDadoSexoM() {
        return lstDatos2012DadoSubcircuitosDadoSexoM;
    }

    public void setLstDatos2012DadoSubcircuitosDadoSexoM(ArrayList<VifRural2011> lstDatos2012DadoSubcircuitosDadoSexoM) {
        this.lstDatos2012DadoSubcircuitosDadoSexoM = lstDatos2012DadoSubcircuitosDadoSexoM;
    }

    public ArrayList<VifRural2011> getLstDatos2011DadoSubcircuitosDadoSexoM() {
        return lstDatos2011DadoSubcircuitosDadoSexoM;
    }

    public void setLstDatos2011DadoSubcircuitosDadoSexoM(ArrayList<VifRural2011> lstDatos2011DadoSubcircuitosDadoSexoM) {
        this.lstDatos2011DadoSubcircuitosDadoSexoM = lstDatos2011DadoSubcircuitosDadoSexoM;
    }

    public CartesianChartModel getLineCircuitos2011SexoVictima() {
        return lineCircuitos2011SexoVictima;
    }

    public void setLineCircuitos2011SexoVictima(CartesianChartModel lineCircuitos2011SexoVictima) {
        this.lineCircuitos2011SexoVictima = lineCircuitos2011SexoVictima;
    }

    public CartesianChartModel getLineCircuitos2012SexoVictima() {
        return lineCircuitos2012SexoVictima;
    }

    public void setLineCircuitos2012SexoVictima(CartesianChartModel lineCircuitos2012SexoVictima) {
        this.lineCircuitos2012SexoVictima = lineCircuitos2012SexoVictima;
    }

    public CartesianChartModel getLineSubCircuitos2010SexoVictima() {
        return lineSubCircuitos2010SexoVictima;
    }

    public void setLineSubCircuitos2010SexoVictima(CartesianChartModel lineSubCircuitos2010SexoVictima) {
        this.lineSubCircuitos2010SexoVictima = lineSubCircuitos2010SexoVictima;
    }

    public CartesianChartModel getLineSubCircuitos2011SexoVictima() {
        return lineSubCircuitos2011SexoVictima;
    }

    public void setLineSubCircuitos2011SexoVictima(CartesianChartModel lineSubCircuitos2011SexoVictima) {
        this.lineSubCircuitos2011SexoVictima = lineSubCircuitos2011SexoVictima;
    }

    public ArrayList<VifRural2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VifRural2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VifRural2011> getLstDatosCircuitos() {
        return lstDatosCircuitos;
    }

    public void setLstDatosCircuitos(ArrayList<VifRural2011> lstDatosCircuitos) {
        this.lstDatosCircuitos = lstDatosCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoCircuitos() {
        return lstDatosDadoCircuitos;
    }

    public void setLstDatosDadoCircuitos(ArrayList<VifRural2011> lstDatosDadoCircuitos) {
        this.lstDatosDadoCircuitos = lstDatosDadoCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosSubCircuitos() {
        return lstDatosSubCircuitos;
    }

    public void setLstDatosSubCircuitos(ArrayList<VifRural2011> lstDatosSubCircuitos) {
        this.lstDatosSubCircuitos = lstDatosSubCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubCircuitos() {
        return lstDatosDadoSubCircuitos;
    }

    public void setLstDatosDadoSubCircuitos(ArrayList<VifRural2011> lstDatosDadoSubCircuitos) {
        this.lstDatosDadoSubCircuitos = lstDatosDadoSubCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoCircuitosDadoSexo() {
        return lstDatosDadoCircuitosDadoSexo;
    }

    public void setLstDatosDadoCircuitosDadoSexo(ArrayList<VifRural2011> lstDatosDadoCircuitosDadoSexo) {
        this.lstDatosDadoCircuitosDadoSexo = lstDatosDadoCircuitosDadoSexo;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubCircuitosDadoSexo() {
        return lstDatosDadoSubCircuitosDadoSexo;
    }

    public void setLstDatosDadoSubCircuitosDadoSexo(ArrayList<VifRural2011> lstDatosDadoSubCircuitosDadoSexo) {
        this.lstDatosDadoSubCircuitosDadoSexo = lstDatosDadoSubCircuitosDadoSexo;
    }

    public CartesianChartModel getLineCircuitos() {
        return lineCircuitos;
    }

    public void setLineCircuitos(CartesianChartModel lineCircuitos) {
        this.lineCircuitos = lineCircuitos;
    }

    public CartesianChartModel getLineCircuitos2010() {
        return lineCircuitos2010;
    }

    public void setLineCircuitos2010(CartesianChartModel lineCircuitos2010) {
        this.lineCircuitos2010 = lineCircuitos2010;
    }

    public CartesianChartModel getLineCircuitos2011() {
        return lineCircuitos2011;
    }

    public void setLineCircuitos2011(CartesianChartModel lineCircuitos2011) {
        this.lineCircuitos2011 = lineCircuitos2011;
    }

    public CartesianChartModel getLineCircuitos2012() {
        return lineCircuitos2012;
    }

    public void setLineCircuitos2012(CartesianChartModel lineCircuitos2012) {
        this.lineCircuitos2012 = lineCircuitos2012;
    }

    public CartesianChartModel getLineSubCircuitos() {
        return lineSubCircuitos;
    }

    public void setLineSubCircuitos(CartesianChartModel lineSubCircuitos) {
        this.lineSubCircuitos = lineSubCircuitos;
    }

    public CartesianChartModel getLineSubCircuitos2010() {
        return lineSubCircuitos2010;
    }

    public void setLineSubCircuitos2010(CartesianChartModel lineSubCircuitos2010) {
        this.lineSubCircuitos2010 = lineSubCircuitos2010;
    }

    public CartesianChartModel getLineSubCircuitos2011() {
        return lineSubCircuitos2011;
    }

    public void setLineSubCircuitos2011(CartesianChartModel lineSubCircuitos2011) {
        this.lineSubCircuitos2011 = lineSubCircuitos2011;
    }

    public CartesianChartModel getLineSubCircuitos2012() {
        return lineSubCircuitos2012;
    }

    public void setLineSubCircuitos2012(CartesianChartModel lineSubCircuitos2012) {
        this.lineSubCircuitos2012 = lineSubCircuitos2012;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();
    }

    public void graficar() {

        lineCircuitos2010 = graficoDetalleGeneralSexoCircuitos2010();
        lineCircuitos2011 = graficoDetalleGeneralSexoCircuitos2011();
        lineCircuitos2012 = graficoDetalleGeneralSexoCircuitos2012();
        lineSubCircuitos2010 = graficoDetalleGeneralSexoSubCircuitos2010();
        lineSubCircuitos2011 = graficoDetalleGeneralSexoSubCircuitos2011();
        lineSubCircuitos2012 = graficoDetalleGeneralSexoSubCircuitos2012();
        lineCircuitos2011SexoVictima = graficoDetalleGeneralSexoCircuitos2011();
        lineSubCircuitos2011SexoVictima = graficoDetalleGeneralSexoSubCircuitos2011();
        lineCircuitos2012SexoVictima = graficoDetalleGeneralSexoCircuitos2011();
        lineSubCircuitos2012SexoVictima = graficoDetalleGeneralSexoSubCircuitos2012();

    }

    public ControladorCircuitosSexoVictima() {
        this.reinit();
    }

    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2010);
            ChartSeries Circuitos2010 = new ChartSeries();
            Circuitos2010.setLabel("Detalle por Circuitos");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2010);
                Circuitos2010.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitosDadoSexo.size());
            }

            model.addSeries(Circuitos2010);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2011);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Victimas sexo femenino");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatos2011DadoCircuitosDadoSexoF = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2011);
                femenino.set(lstDatosCircuitos.get(i).getCircuito(), lstDatos2011DadoCircuitosDadoSexoF.size());
            }

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Victimas sexo Masculino");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatos2011DadoCircuitosDadoSexoM = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("M", lstDatosCircuitos.get(i).getCircuito(), 2011);
                Masculino.set(lstDatosCircuitos.get(i).getCircuito(), lstDatos2011DadoCircuitosDadoSexoM.size());
            }

            model.addSeries(femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2012);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Victimas sexo femenino");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatos2012DadoCircuitosDadoSexoF = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2012);
                femenino.set(lstDatosCircuitos.get(i).getCircuito(), lstDatos2012DadoCircuitosDadoSexoF.size());
            }

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Victimas sexo Masculino");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatos2012DadoCircuitosDadoSexoM = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("M", lstDatosCircuitos.get(i).getCircuito(), 2012);
                Masculino.set(lstDatosCircuitos.get(i).getCircuito(), lstDatos2012DadoCircuitosDadoSexoM.size());
            }

            model.addSeries(femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2010);
            ChartSeries SubCircuitos2010 = new ChartSeries();
            SubCircuitos2010.setLabel("Detalle por SubCircuitos");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatosDadoSubCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2010);
                SubCircuitos2010.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatosDadoSubCircuitosDadoSexo.size());
            }

            model.addSeries(SubCircuitos2010);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2011);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Victimas sexo femenino");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatos2011DadoSubcircuitosDadoSexoF = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2011);
                femenino.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatos2011DadoSubcircuitosDadoSexoF.size());
            }

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Victimas sexo Masculino");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatos2011DadoSubcircuitosDadoSexoM = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("M", lstDatosSubCircuitos.get(i).getSubcircuito(), 2011);
                Masculino.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatos2011DadoSubcircuitosDadoSexoM.size());
            }

            model.addSeries(femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2012);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Victimas sexo femenino");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatos2012DadoSubcircuitosDadoSexoF = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2012);
                femenino.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatos2012DadoSubcircuitosDadoSexoF.size());
            }

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Victimas sexo Masculino");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatos2012DadoSubcircuitosDadoSexoM = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("M", lstDatosSubCircuitos.get(i).getSubcircuito(), 2012);
                Masculino.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatos2012DadoSubcircuitosDadoSexoM.size());
            }

            model.addSeries(femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
