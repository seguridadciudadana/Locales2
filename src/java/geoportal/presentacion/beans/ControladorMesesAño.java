/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif_2012;
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
public class ControladorMesesAño {

    /**
     * Creates a new instance of ControladorMesesAño
     */
    private ArrayList<Vif_2010> lstDatosEnero2010;
    private ArrayList<Vif_2010> lstDatosFebrero2010;
    private ArrayList<Vif_2010> lstDatosMarzo2010;
    private ArrayList<Vif_2010> lstDatosAbril2010;
    private ArrayList<Vif_2010> lstDatosMayo2010;
    private ArrayList<Vif_2010> lstDatosJunio2010;
    private ArrayList<Vif_2010> lstDatosJulio2010;
    private ArrayList<Vif_2010> lstDatosAgosto2010;
    private ArrayList<Vif_2010> lstDatosSeptiembre2010;
    private ArrayList<Vif_2010> lstDatosOctubre2010;
    private ArrayList<Vif_2010> lstDatosNoviembre2010;
    private ArrayList<Vif_2010> lstDatosDiciembre2010;
    private ArrayList<Vif_2011> lstDatosEnero2011;
    private ArrayList<Vif_2011> lstDatosFebrero2011;
    private ArrayList<Vif_2011> lstDatosMarzo2011;
    private ArrayList<Vif_2011> lstDatosAbril2011;
    private ArrayList<Vif_2011> lstDatosMayo2011;
    private ArrayList<Vif_2011> lstDatosJunio2011;
    private ArrayList<Vif_2011> lstDatosJulio2011;
    private ArrayList<Vif_2011> lstDatosAgosto2011;
    private ArrayList<Vif_2011> lstDatosSeptiembre2011;
    private ArrayList<Vif_2011> lstDatosOctubre2011;
    private ArrayList<Vif_2011> lstDatosNoviembre2011;
    private ArrayList<Vif_2011> lstDatosDiciembre2011;
    private ArrayList<Vif_2012> lstDatosEnero2012;
    private ArrayList<Vif_2012> lstDatosFebrero2012;
    private ArrayList<Vif_2012> lstDatosMarzo2012;
    private ArrayList<Vif_2012> lstDatosAbril2012;
    private ArrayList<Vif_2012> lstDatosMayo2012;
    private ArrayList<Vif_2012> lstDatosJunio2012;
    private ArrayList<Vif_2012> lstDatosJulio2012;
    private ArrayList<Vif_2012> lstDatosAgosto2012;
    private ArrayList<Vif_2012> lstDatosSeptiembre2012;
    private ArrayList<Vif_2012> lstDatosOctubre2012;
    private ArrayList<Vif_2012> lstDatosNoviembre2012;
    private ArrayList<Vif_2012> lstDatosDiciembre2012;
    private CartesianChartModel graficoContrastesMeses;
    private Vif_2010 datoSel2010;
    private ArrayList<Vif_2010> lstDatos2010;

    private CartesianChartModel graficoContrastesMesesSexoMasculino;
    private CartesianChartModel graficoContrastesMesesSexoFemenino;

    private ArrayList<Vif_2010> lstDatosEnero2010M;
    private ArrayList<Vif_2010> lstDatosFebrero2010M;
    private ArrayList<Vif_2010> lstDatosMarzo2010M;
    private ArrayList<Vif_2010> lstDatosAbril2010M;
    private ArrayList<Vif_2010> lstDatosMayo2010M;
    private ArrayList<Vif_2010> lstDatosJunio2010M;
    private ArrayList<Vif_2010> lstDatosJulio2010M;
    private ArrayList<Vif_2010> lstDatosAgosto2010M;
    private ArrayList<Vif_2010> lstDatosSeptiembre2010M;
    private ArrayList<Vif_2010> lstDatosOctubre2010M;
    private ArrayList<Vif_2010> lstDatosNoviembre2010M;
    private ArrayList<Vif_2010> lstDatosDiciembre2010M;

    private ArrayList<Vif_2010> lstDatosEnero2010F;
    private ArrayList<Vif_2010> lstDatosFebrero2010F;
    private ArrayList<Vif_2010> lstDatosMarzo2010F;
    private ArrayList<Vif_2010> lstDatosAbril2010F;
    private ArrayList<Vif_2010> lstDatosMayo2010F;
    private ArrayList<Vif_2010> lstDatosJunio2010F;
    private ArrayList<Vif_2010> lstDatosJulio2010F;
    private ArrayList<Vif_2010> lstDatosAgosto2010F;
    private ArrayList<Vif_2010> lstDatosSeptiembre2010F;
    private ArrayList<Vif_2010> lstDatosOctubre2010F;
    private ArrayList<Vif_2010> lstDatosNoviembre2010F;
    private ArrayList<Vif_2010> lstDatosDiciembre2010F;

    private ArrayList<Vif_2011> lstDatosEnero2011M;
    private ArrayList<Vif_2011> lstDatosFebrero2011M;
    private ArrayList<Vif_2011> lstDatosMarzo2011M;
    private ArrayList<Vif_2011> lstDatosAbril2011M;
    private ArrayList<Vif_2011> lstDatosMayo2011M;
    private ArrayList<Vif_2011> lstDatosJunio2011M;
    private ArrayList<Vif_2011> lstDatosJulio2011M;
    private ArrayList<Vif_2011> lstDatosAgosto2011M;
    private ArrayList<Vif_2011> lstDatosSeptiembre2011M;
    private ArrayList<Vif_2011> lstDatosOctubre2011M;
    private ArrayList<Vif_2011> lstDatosNoviembre2011M;
    private ArrayList<Vif_2011> lstDatosDiciembre2011M;

    private ArrayList<Vif_2011> lstDatosEnero2011F;
    private ArrayList<Vif_2011> lstDatosFebrero2011F;
    private ArrayList<Vif_2011> lstDatosMarzo2011F;
    private ArrayList<Vif_2011> lstDatosAbril2011F;
    private ArrayList<Vif_2011> lstDatosMayo2011F;
    private ArrayList<Vif_2011> lstDatosJunio2011F;
    private ArrayList<Vif_2011> lstDatosJulio2011F;
    private ArrayList<Vif_2011> lstDatosAgosto2011F;
    private ArrayList<Vif_2011> lstDatosSeptiembre2011F;
    private ArrayList<Vif_2011> lstDatosOctubre2011F;
    private ArrayList<Vif_2011> lstDatosNoviembre2011F;
    private ArrayList<Vif_2011> lstDatosDiciembre2011F;

    private ArrayList<Vif_2012> lstDatosEnero2012M;
    private ArrayList<Vif_2012> lstDatosFebrero2012M;
    private ArrayList<Vif_2012> lstDatosMarzo2012M;
    private ArrayList<Vif_2012> lstDatosAbril2012M;
    private ArrayList<Vif_2012> lstDatosMayo2012M;
    private ArrayList<Vif_2012> lstDatosJunio2012M;
    private ArrayList<Vif_2012> lstDatosJulio2012M;
    private ArrayList<Vif_2012> lstDatosAgosto2012M;
    private ArrayList<Vif_2012> lstDatosSeptiembre2012M;
    private ArrayList<Vif_2012> lstDatosOctubre2012M;
    private ArrayList<Vif_2012> lstDatosNoviembre2012M;
    private ArrayList<Vif_2012> lstDatosDiciembre2012M;

    private ArrayList<Vif_2012> lstDatosEnero2012F;
    private ArrayList<Vif_2012> lstDatosFebrero2012F;
    private ArrayList<Vif_2012> lstDatosMarzo2012F;
    private ArrayList<Vif_2012> lstDatosAbril2012F;
    private ArrayList<Vif_2012> lstDatosMayo2012F;
    private ArrayList<Vif_2012> lstDatosJunio2012F;
    private ArrayList<Vif_2012> lstDatosJulio2012F;
    private ArrayList<Vif_2012> lstDatosAgosto2012F;
    private ArrayList<Vif_2012> lstDatosSeptiembre2012F;
    private ArrayList<Vif_2012> lstDatosOctubre2012F;
    private ArrayList<Vif_2012> lstDatosNoviembre2012F;
    private ArrayList<Vif_2012> lstDatosDiciembre2012F;

    public CartesianChartModel getGraficoContrastesMesesSexoMasculino() {
        return graficoContrastesMesesSexoMasculino;
    }

    public void setGraficoContrastesMesesSexoMasculino(CartesianChartModel graficoContrastesMesesSexoMasculino) {
        this.graficoContrastesMesesSexoMasculino = graficoContrastesMesesSexoMasculino;
    }

    public CartesianChartModel getGraficoContrastesMesesSexoFemenino() {
        return graficoContrastesMesesSexoFemenino;
    }

    public void setGraficoContrastesMesesSexoFemenino(CartesianChartModel graficoContrastesMesesSexoFemenino) {
        this.graficoContrastesMesesSexoFemenino = graficoContrastesMesesSexoFemenino;
    }

    public ArrayList<Vif_2010> getLstDatosEnero2010M() {
        return lstDatosEnero2010M;
    }

    public void setLstDatosEnero2010M(ArrayList<Vif_2010> lstDatosEnero2010M) {
        this.lstDatosEnero2010M = lstDatosEnero2010M;
    }

    public ArrayList<Vif_2010> getLstDatosFebrero2010M() {
        return lstDatosFebrero2010M;
    }

    public void setLstDatosFebrero2010M(ArrayList<Vif_2010> lstDatosFebrero2010M) {
        this.lstDatosFebrero2010M = lstDatosFebrero2010M;
    }

    public ArrayList<Vif_2010> getLstDatosMarzo2010M() {
        return lstDatosMarzo2010M;
    }

    public void setLstDatosMarzo2010M(ArrayList<Vif_2010> lstDatosMarzo2010M) {
        this.lstDatosMarzo2010M = lstDatosMarzo2010M;
    }

    public ArrayList<Vif_2010> getLstDatosAbril2010M() {
        return lstDatosAbril2010M;
    }

    public void setLstDatosAbril2010M(ArrayList<Vif_2010> lstDatosAbril2010M) {
        this.lstDatosAbril2010M = lstDatosAbril2010M;
    }

    public ArrayList<Vif_2010> getLstDatosMayo2010M() {
        return lstDatosMayo2010M;
    }

    public void setLstDatosMayo2010M(ArrayList<Vif_2010> lstDatosMayo2010M) {
        this.lstDatosMayo2010M = lstDatosMayo2010M;
    }

    public ArrayList<Vif_2010> getLstDatosJunio2010M() {
        return lstDatosJunio2010M;
    }

    public void setLstDatosJunio2010M(ArrayList<Vif_2010> lstDatosJunio2010M) {
        this.lstDatosJunio2010M = lstDatosJunio2010M;
    }

    public ArrayList<Vif_2010> getLstDatosJulio2010M() {
        return lstDatosJulio2010M;
    }

    public void setLstDatosJulio2010M(ArrayList<Vif_2010> lstDatosJulio2010M) {
        this.lstDatosJulio2010M = lstDatosJulio2010M;
    }

    public ArrayList<Vif_2010> getLstDatosAgosto2010M() {
        return lstDatosAgosto2010M;
    }

    public void setLstDatosAgosto2010M(ArrayList<Vif_2010> lstDatosAgosto2010M) {
        this.lstDatosAgosto2010M = lstDatosAgosto2010M;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembre2010M() {
        return lstDatosSeptiembre2010M;
    }

    public void setLstDatosSeptiembre2010M(ArrayList<Vif_2010> lstDatosSeptiembre2010M) {
        this.lstDatosSeptiembre2010M = lstDatosSeptiembre2010M;
    }

    public ArrayList<Vif_2010> getLstDatosOctubre2010M() {
        return lstDatosOctubre2010M;
    }

    public void setLstDatosOctubre2010M(ArrayList<Vif_2010> lstDatosOctubre2010M) {
        this.lstDatosOctubre2010M = lstDatosOctubre2010M;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembre2010M() {
        return lstDatosNoviembre2010M;
    }

    public void setLstDatosNoviembre2010M(ArrayList<Vif_2010> lstDatosNoviembre2010M) {
        this.lstDatosNoviembre2010M = lstDatosNoviembre2010M;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembre2010M() {
        return lstDatosDiciembre2010M;
    }

    public void setLstDatosDiciembre2010M(ArrayList<Vif_2010> lstDatosDiciembre2010M) {
        this.lstDatosDiciembre2010M = lstDatosDiciembre2010M;
    }

    public ArrayList<Vif_2010> getLstDatosEnero2010F() {
        return lstDatosEnero2010F;
    }

    public void setLstDatosEnero2010F(ArrayList<Vif_2010> lstDatosEnero2010F) {
        this.lstDatosEnero2010F = lstDatosEnero2010F;
    }

    public ArrayList<Vif_2010> getLstDatosFebrero2010F() {
        return lstDatosFebrero2010F;
    }

    public void setLstDatosFebrero2010F(ArrayList<Vif_2010> lstDatosFebrero2010F) {
        this.lstDatosFebrero2010F = lstDatosFebrero2010F;
    }

    public ArrayList<Vif_2010> getLstDatosMarzo2010F() {
        return lstDatosMarzo2010F;
    }

    public void setLstDatosMarzo2010F(ArrayList<Vif_2010> lstDatosMarzo2010F) {
        this.lstDatosMarzo2010F = lstDatosMarzo2010F;
    }

    public ArrayList<Vif_2010> getLstDatosAbril2010F() {
        return lstDatosAbril2010F;
    }

    public void setLstDatosAbril2010F(ArrayList<Vif_2010> lstDatosAbril2010F) {
        this.lstDatosAbril2010F = lstDatosAbril2010F;
    }

    public ArrayList<Vif_2010> getLstDatosMayo2010F() {
        return lstDatosMayo2010F;
    }

    public void setLstDatosMayo2010F(ArrayList<Vif_2010> lstDatosMayo2010F) {
        this.lstDatosMayo2010F = lstDatosMayo2010F;
    }

    public ArrayList<Vif_2010> getLstDatosJunio2010F() {
        return lstDatosJunio2010F;
    }

    public void setLstDatosJunio2010F(ArrayList<Vif_2010> lstDatosJunio2010F) {
        this.lstDatosJunio2010F = lstDatosJunio2010F;
    }

    public ArrayList<Vif_2010> getLstDatosJulio2010F() {
        return lstDatosJulio2010F;
    }

    public void setLstDatosJulio2010F(ArrayList<Vif_2010> lstDatosJulio2010F) {
        this.lstDatosJulio2010F = lstDatosJulio2010F;
    }

    public ArrayList<Vif_2010> getLstDatosAgosto2010F() {
        return lstDatosAgosto2010F;
    }

    public void setLstDatosAgosto2010F(ArrayList<Vif_2010> lstDatosAgosto2010F) {
        this.lstDatosAgosto2010F = lstDatosAgosto2010F;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembre2010F() {
        return lstDatosSeptiembre2010F;
    }

    public void setLstDatosSeptiembre2010F(ArrayList<Vif_2010> lstDatosSeptiembre2010F) {
        this.lstDatosSeptiembre2010F = lstDatosSeptiembre2010F;
    }

    public ArrayList<Vif_2010> getLstDatosOctubre2010F() {
        return lstDatosOctubre2010F;
    }

    public void setLstDatosOctubre2010F(ArrayList<Vif_2010> lstDatosOctubre2010F) {
        this.lstDatosOctubre2010F = lstDatosOctubre2010F;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembre2010F() {
        return lstDatosNoviembre2010F;
    }

    public void setLstDatosNoviembre2010F(ArrayList<Vif_2010> lstDatosNoviembre2010F) {
        this.lstDatosNoviembre2010F = lstDatosNoviembre2010F;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembre2010F() {
        return lstDatosDiciembre2010F;
    }

    public void setLstDatosDiciembre2010F(ArrayList<Vif_2010> lstDatosDiciembre2010F) {
        this.lstDatosDiciembre2010F = lstDatosDiciembre2010F;
    }

    public ArrayList<Vif_2011> getLstDatosEnero2011M() {
        return lstDatosEnero2011M;
    }

    public void setLstDatosEnero2011M(ArrayList<Vif_2011> lstDatosEnero2011M) {
        this.lstDatosEnero2011M = lstDatosEnero2011M;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero2011M() {
        return lstDatosFebrero2011M;
    }

    public void setLstDatosFebrero2011M(ArrayList<Vif_2011> lstDatosFebrero2011M) {
        this.lstDatosFebrero2011M = lstDatosFebrero2011M;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo2011M() {
        return lstDatosMarzo2011M;
    }

    public void setLstDatosMarzo2011M(ArrayList<Vif_2011> lstDatosMarzo2011M) {
        this.lstDatosMarzo2011M = lstDatosMarzo2011M;
    }

    public ArrayList<Vif_2011> getLstDatosAbril2011M() {
        return lstDatosAbril2011M;
    }

    public void setLstDatosAbril2011M(ArrayList<Vif_2011> lstDatosAbril2011M) {
        this.lstDatosAbril2011M = lstDatosAbril2011M;
    }

    public ArrayList<Vif_2011> getLstDatosMayo2011M() {
        return lstDatosMayo2011M;
    }

    public void setLstDatosMayo2011M(ArrayList<Vif_2011> lstDatosMayo2011M) {
        this.lstDatosMayo2011M = lstDatosMayo2011M;
    }

    public ArrayList<Vif_2011> getLstDatosJunio2011M() {
        return lstDatosJunio2011M;
    }

    public void setLstDatosJunio2011M(ArrayList<Vif_2011> lstDatosJunio2011M) {
        this.lstDatosJunio2011M = lstDatosJunio2011M;
    }

    public ArrayList<Vif_2011> getLstDatosJulio2011M() {
        return lstDatosJulio2011M;
    }

    public void setLstDatosJulio2011M(ArrayList<Vif_2011> lstDatosJulio2011M) {
        this.lstDatosJulio2011M = lstDatosJulio2011M;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto2011M() {
        return lstDatosAgosto2011M;
    }

    public void setLstDatosAgosto2011M(ArrayList<Vif_2011> lstDatosAgosto2011M) {
        this.lstDatosAgosto2011M = lstDatosAgosto2011M;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre2011M() {
        return lstDatosSeptiembre2011M;
    }

    public void setLstDatosSeptiembre2011M(ArrayList<Vif_2011> lstDatosSeptiembre2011M) {
        this.lstDatosSeptiembre2011M = lstDatosSeptiembre2011M;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre2011M() {
        return lstDatosOctubre2011M;
    }

    public void setLstDatosOctubre2011M(ArrayList<Vif_2011> lstDatosOctubre2011M) {
        this.lstDatosOctubre2011M = lstDatosOctubre2011M;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre2011M() {
        return lstDatosNoviembre2011M;
    }

    public void setLstDatosNoviembre2011M(ArrayList<Vif_2011> lstDatosNoviembre2011M) {
        this.lstDatosNoviembre2011M = lstDatosNoviembre2011M;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre2011M() {
        return lstDatosDiciembre2011M;
    }

    public void setLstDatosDiciembre2011M(ArrayList<Vif_2011> lstDatosDiciembre2011M) {
        this.lstDatosDiciembre2011M = lstDatosDiciembre2011M;
    }

    public ArrayList<Vif_2011> getLstDatosEnero2011F() {
        return lstDatosEnero2011F;
    }

    public void setLstDatosEnero2011F(ArrayList<Vif_2011> lstDatosEnero2011F) {
        this.lstDatosEnero2011F = lstDatosEnero2011F;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero2011F() {
        return lstDatosFebrero2011F;
    }

    public void setLstDatosFebrero2011F(ArrayList<Vif_2011> lstDatosFebrero2011F) {
        this.lstDatosFebrero2011F = lstDatosFebrero2011F;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo2011F() {
        return lstDatosMarzo2011F;
    }

    public void setLstDatosMarzo2011F(ArrayList<Vif_2011> lstDatosMarzo2011F) {
        this.lstDatosMarzo2011F = lstDatosMarzo2011F;
    }

    public ArrayList<Vif_2011> getLstDatosAbril2011F() {
        return lstDatosAbril2011F;
    }

    public void setLstDatosAbril2011F(ArrayList<Vif_2011> lstDatosAbril2011F) {
        this.lstDatosAbril2011F = lstDatosAbril2011F;
    }

    public ArrayList<Vif_2011> getLstDatosMayo2011F() {
        return lstDatosMayo2011F;
    }

    public void setLstDatosMayo2011F(ArrayList<Vif_2011> lstDatosMayo2011F) {
        this.lstDatosMayo2011F = lstDatosMayo2011F;
    }

    public ArrayList<Vif_2011> getLstDatosJunio2011F() {
        return lstDatosJunio2011F;
    }

    public void setLstDatosJunio2011F(ArrayList<Vif_2011> lstDatosJunio2011F) {
        this.lstDatosJunio2011F = lstDatosJunio2011F;
    }

    public ArrayList<Vif_2011> getLstDatosJulio2011F() {
        return lstDatosJulio2011F;
    }

    public void setLstDatosJulio2011F(ArrayList<Vif_2011> lstDatosJulio2011F) {
        this.lstDatosJulio2011F = lstDatosJulio2011F;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto2011F() {
        return lstDatosAgosto2011F;
    }

    public void setLstDatosAgosto2011F(ArrayList<Vif_2011> lstDatosAgosto2011F) {
        this.lstDatosAgosto2011F = lstDatosAgosto2011F;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre2011F() {
        return lstDatosSeptiembre2011F;
    }

    public void setLstDatosSeptiembre2011F(ArrayList<Vif_2011> lstDatosSeptiembre2011F) {
        this.lstDatosSeptiembre2011F = lstDatosSeptiembre2011F;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre2011F() {
        return lstDatosOctubre2011F;
    }

    public void setLstDatosOctubre2011F(ArrayList<Vif_2011> lstDatosOctubre2011F) {
        this.lstDatosOctubre2011F = lstDatosOctubre2011F;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre2011F() {
        return lstDatosNoviembre2011F;
    }

    public void setLstDatosNoviembre2011F(ArrayList<Vif_2011> lstDatosNoviembre2011F) {
        this.lstDatosNoviembre2011F = lstDatosNoviembre2011F;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre2011F() {
        return lstDatosDiciembre2011F;
    }

    public void setLstDatosDiciembre2011F(ArrayList<Vif_2011> lstDatosDiciembre2011F) {
        this.lstDatosDiciembre2011F = lstDatosDiciembre2011F;
    }

    public ArrayList<Vif_2012> getLstDatosEnero2012M() {
        return lstDatosEnero2012M;
    }

    public void setLstDatosEnero2012M(ArrayList<Vif_2012> lstDatosEnero2012M) {
        this.lstDatosEnero2012M = lstDatosEnero2012M;
    }

    public ArrayList<Vif_2012> getLstDatosFebrero2012M() {
        return lstDatosFebrero2012M;
    }

    public void setLstDatosFebrero2012M(ArrayList<Vif_2012> lstDatosFebrero2012M) {
        this.lstDatosFebrero2012M = lstDatosFebrero2012M;
    }

    public ArrayList<Vif_2012> getLstDatosMarzo2012M() {
        return lstDatosMarzo2012M;
    }

    public void setLstDatosMarzo2012M(ArrayList<Vif_2012> lstDatosMarzo2012M) {
        this.lstDatosMarzo2012M = lstDatosMarzo2012M;
    }

    public ArrayList<Vif_2012> getLstDatosAbril2012M() {
        return lstDatosAbril2012M;
    }

    public void setLstDatosAbril2012M(ArrayList<Vif_2012> lstDatosAbril2012M) {
        this.lstDatosAbril2012M = lstDatosAbril2012M;
    }

    public ArrayList<Vif_2012> getLstDatosMayo2012M() {
        return lstDatosMayo2012M;
    }

    public void setLstDatosMayo2012M(ArrayList<Vif_2012> lstDatosMayo2012M) {
        this.lstDatosMayo2012M = lstDatosMayo2012M;
    }

    public ArrayList<Vif_2012> getLstDatosJunio2012M() {
        return lstDatosJunio2012M;
    }

    public void setLstDatosJunio2012M(ArrayList<Vif_2012> lstDatosJunio2012M) {
        this.lstDatosJunio2012M = lstDatosJunio2012M;
    }

    public ArrayList<Vif_2012> getLstDatosJulio2012M() {
        return lstDatosJulio2012M;
    }

    public void setLstDatosJulio2012M(ArrayList<Vif_2012> lstDatosJulio2012M) {
        this.lstDatosJulio2012M = lstDatosJulio2012M;
    }

    public ArrayList<Vif_2012> getLstDatosAgosto2012M() {
        return lstDatosAgosto2012M;
    }

    public void setLstDatosAgosto2012M(ArrayList<Vif_2012> lstDatosAgosto2012M) {
        this.lstDatosAgosto2012M = lstDatosAgosto2012M;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembre2012M() {
        return lstDatosSeptiembre2012M;
    }

    public void setLstDatosSeptiembre2012M(ArrayList<Vif_2012> lstDatosSeptiembre2012M) {
        this.lstDatosSeptiembre2012M = lstDatosSeptiembre2012M;
    }

    public ArrayList<Vif_2012> getLstDatosOctubre2012M() {
        return lstDatosOctubre2012M;
    }

    public void setLstDatosOctubre2012M(ArrayList<Vif_2012> lstDatosOctubre2012M) {
        this.lstDatosOctubre2012M = lstDatosOctubre2012M;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembre2012M() {
        return lstDatosNoviembre2012M;
    }

    public void setLstDatosNoviembre2012M(ArrayList<Vif_2012> lstDatosNoviembre2012M) {
        this.lstDatosNoviembre2012M = lstDatosNoviembre2012M;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembre2012M() {
        return lstDatosDiciembre2012M;
    }

    public void setLstDatosDiciembre2012M(ArrayList<Vif_2012> lstDatosDiciembre2012M) {
        this.lstDatosDiciembre2012M = lstDatosDiciembre2012M;
    }

    public ArrayList<Vif_2012> getLstDatosEnero2012F() {
        return lstDatosEnero2012F;
    }

    public void setLstDatosEnero2012F(ArrayList<Vif_2012> lstDatosEnero2012F) {
        this.lstDatosEnero2012F = lstDatosEnero2012F;
    }

    public ArrayList<Vif_2012> getLstDatosFebrero2012F() {
        return lstDatosFebrero2012F;
    }

    public void setLstDatosFebrero2012F(ArrayList<Vif_2012> lstDatosFebrero2012F) {
        this.lstDatosFebrero2012F = lstDatosFebrero2012F;
    }

    public ArrayList<Vif_2012> getLstDatosMarzo2012F() {
        return lstDatosMarzo2012F;
    }

    public void setLstDatosMarzo2012F(ArrayList<Vif_2012> lstDatosMarzo2012F) {
        this.lstDatosMarzo2012F = lstDatosMarzo2012F;
    }

    public ArrayList<Vif_2012> getLstDatosAbril2012F() {
        return lstDatosAbril2012F;
    }

    public void setLstDatosAbril2012F(ArrayList<Vif_2012> lstDatosAbril2012F) {
        this.lstDatosAbril2012F = lstDatosAbril2012F;
    }

    public ArrayList<Vif_2012> getLstDatosMayo2012F() {
        return lstDatosMayo2012F;
    }

    public void setLstDatosMayo2012F(ArrayList<Vif_2012> lstDatosMayo2012F) {
        this.lstDatosMayo2012F = lstDatosMayo2012F;
    }

    public ArrayList<Vif_2012> getLstDatosJunio2012F() {
        return lstDatosJunio2012F;
    }

    public void setLstDatosJunio2012F(ArrayList<Vif_2012> lstDatosJunio2012F) {
        this.lstDatosJunio2012F = lstDatosJunio2012F;
    }

    public ArrayList<Vif_2012> getLstDatosJulio2012F() {
        return lstDatosJulio2012F;
    }

    public void setLstDatosJulio2012F(ArrayList<Vif_2012> lstDatosJulio2012F) {
        this.lstDatosJulio2012F = lstDatosJulio2012F;
    }

    public ArrayList<Vif_2012> getLstDatosAgosto2012F() {
        return lstDatosAgosto2012F;
    }

    public void setLstDatosAgosto2012F(ArrayList<Vif_2012> lstDatosAgosto2012F) {
        this.lstDatosAgosto2012F = lstDatosAgosto2012F;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembre2012F() {
        return lstDatosSeptiembre2012F;
    }

    public void setLstDatosSeptiembre2012F(ArrayList<Vif_2012> lstDatosSeptiembre2012F) {
        this.lstDatosSeptiembre2012F = lstDatosSeptiembre2012F;
    }

    public ArrayList<Vif_2012> getLstDatosOctubre2012F() {
        return lstDatosOctubre2012F;
    }

    public void setLstDatosOctubre2012F(ArrayList<Vif_2012> lstDatosOctubre2012F) {
        this.lstDatosOctubre2012F = lstDatosOctubre2012F;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembre2012F() {
        return lstDatosNoviembre2012F;
    }

    public void setLstDatosNoviembre2012F(ArrayList<Vif_2012> lstDatosNoviembre2012F) {
        this.lstDatosNoviembre2012F = lstDatosNoviembre2012F;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembre2012F() {
        return lstDatosDiciembre2012F;
    }

    public void setLstDatosDiciembre2012F(ArrayList<Vif_2012> lstDatosDiciembre2012F) {
        this.lstDatosDiciembre2012F = lstDatosDiciembre2012F;
    }

    public Vif_2010 getDatoSel2010() {
        return datoSel2010;
    }

    public void setDatoSel2010(Vif_2010 datoSel2010) {
        this.datoSel2010 = datoSel2010;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public CartesianChartModel getGraficoContrastesMeses() {
        return graficoContrastesMeses;
    }

    public void setGraficoContrastesMeses(CartesianChartModel graficoContrastesMeses) {
        this.graficoContrastesMeses = graficoContrastesMeses;
    }

    public ArrayList<Vif_2010> getLstDatosEnero2010() {
        return lstDatosEnero2010;
    }

    public void setLstDatosEnero2010(ArrayList<Vif_2010> lstDatosEnero2010) {
        this.lstDatosEnero2010 = lstDatosEnero2010;
    }

    public ArrayList<Vif_2010> getLstDatosFebrero2010() {
        return lstDatosFebrero2010;
    }

    public void setLstDatosFebrero2010(ArrayList<Vif_2010> lstDatosFebrero2010) {
        this.lstDatosFebrero2010 = lstDatosFebrero2010;
    }

    public ArrayList<Vif_2010> getLstDatosMarzo2010() {
        return lstDatosMarzo2010;
    }

    public void setLstDatosMarzo2010(ArrayList<Vif_2010> lstDatosMarzo2010) {
        this.lstDatosMarzo2010 = lstDatosMarzo2010;
    }

    public ArrayList<Vif_2010> getLstDatosAbril2010() {
        return lstDatosAbril2010;
    }

    public void setLstDatosAbril2010(ArrayList<Vif_2010> lstDatosAbril2010) {
        this.lstDatosAbril2010 = lstDatosAbril2010;
    }

    public ArrayList<Vif_2010> getLstDatosMayo2010() {
        return lstDatosMayo2010;
    }

    public void setLstDatosMayo2010(ArrayList<Vif_2010> lstDatosMayo2010) {
        this.lstDatosMayo2010 = lstDatosMayo2010;
    }

    public ArrayList<Vif_2010> getLstDatosJunio2010() {
        return lstDatosJunio2010;
    }

    public void setLstDatosJunio2010(ArrayList<Vif_2010> lstDatosJunio2010) {
        this.lstDatosJunio2010 = lstDatosJunio2010;
    }

    public ArrayList<Vif_2010> getLstDatosJulio2010() {
        return lstDatosJulio2010;
    }

    public void setLstDatosJulio2010(ArrayList<Vif_2010> lstDatosJulio2010) {
        this.lstDatosJulio2010 = lstDatosJulio2010;
    }

    public ArrayList<Vif_2010> getLstDatosAgosto2010() {
        return lstDatosAgosto2010;
    }

    public void setLstDatosAgosto2010(ArrayList<Vif_2010> lstDatosAgosto2010) {
        this.lstDatosAgosto2010 = lstDatosAgosto2010;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembre2010() {
        return lstDatosSeptiembre2010;
    }

    public void setLstDatosSeptiembre2010(ArrayList<Vif_2010> lstDatosSeptiembre2010) {
        this.lstDatosSeptiembre2010 = lstDatosSeptiembre2010;
    }

    public ArrayList<Vif_2010> getLstDatosOctubre2010() {
        return lstDatosOctubre2010;
    }

    public void setLstDatosOctubre2010(ArrayList<Vif_2010> lstDatosOctubre2010) {
        this.lstDatosOctubre2010 = lstDatosOctubre2010;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembre2010() {
        return lstDatosNoviembre2010;
    }

    public void setLstDatosNoviembre2010(ArrayList<Vif_2010> lstDatosNoviembre2010) {
        this.lstDatosNoviembre2010 = lstDatosNoviembre2010;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembre2010() {
        return lstDatosDiciembre2010;
    }

    public void setLstDatosDiciembre2010(ArrayList<Vif_2010> lstDatosDiciembre2010) {
        this.lstDatosDiciembre2010 = lstDatosDiciembre2010;
    }

    public ArrayList<Vif_2011> getLstDatosEnero2011() {
        return lstDatosEnero2011;
    }

    public void setLstDatosEnero2011(ArrayList<Vif_2011> lstDatosEnero2011) {
        this.lstDatosEnero2011 = lstDatosEnero2011;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero2011() {
        return lstDatosFebrero2011;
    }

    public void setLstDatosFebrero2011(ArrayList<Vif_2011> lstDatosFebrero2011) {
        this.lstDatosFebrero2011 = lstDatosFebrero2011;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo2011() {
        return lstDatosMarzo2011;
    }

    public void setLstDatosMarzo2011(ArrayList<Vif_2011> lstDatosMarzo2011) {
        this.lstDatosMarzo2011 = lstDatosMarzo2011;
    }

    public ArrayList<Vif_2011> getLstDatosAbril2011() {
        return lstDatosAbril2011;
    }

    public void setLstDatosAbril2011(ArrayList<Vif_2011> lstDatosAbril2011) {
        this.lstDatosAbril2011 = lstDatosAbril2011;
    }

    public ArrayList<Vif_2011> getLstDatosMayo2011() {
        return lstDatosMayo2011;
    }

    public void setLstDatosMayo2011(ArrayList<Vif_2011> lstDatosMayo2011) {
        this.lstDatosMayo2011 = lstDatosMayo2011;
    }

    public ArrayList<Vif_2011> getLstDatosJunio2011() {
        return lstDatosJunio2011;
    }

    public void setLstDatosJunio2011(ArrayList<Vif_2011> lstDatosJunio2011) {
        this.lstDatosJunio2011 = lstDatosJunio2011;
    }

    public ArrayList<Vif_2011> getLstDatosJulio2011() {
        return lstDatosJulio2011;
    }

    public void setLstDatosJulio2011(ArrayList<Vif_2011> lstDatosJulio2011) {
        this.lstDatosJulio2011 = lstDatosJulio2011;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto2011() {
        return lstDatosAgosto2011;
    }

    public void setLstDatosAgosto2011(ArrayList<Vif_2011> lstDatosAgosto2011) {
        this.lstDatosAgosto2011 = lstDatosAgosto2011;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre2011() {
        return lstDatosSeptiembre2011;
    }

    public void setLstDatosSeptiembre2011(ArrayList<Vif_2011> lstDatosSeptiembre2011) {
        this.lstDatosSeptiembre2011 = lstDatosSeptiembre2011;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre2011() {
        return lstDatosOctubre2011;
    }

    public void setLstDatosOctubre2011(ArrayList<Vif_2011> lstDatosOctubre2011) {
        this.lstDatosOctubre2011 = lstDatosOctubre2011;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre2011() {
        return lstDatosNoviembre2011;
    }

    public void setLstDatosNoviembre2011(ArrayList<Vif_2011> lstDatosNoviembre2011) {
        this.lstDatosNoviembre2011 = lstDatosNoviembre2011;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre2011() {
        return lstDatosDiciembre2011;
    }

    public void setLstDatosDiciembre2011(ArrayList<Vif_2011> lstDatosDiciembre2011) {
        this.lstDatosDiciembre2011 = lstDatosDiciembre2011;
    }

    public ArrayList<Vif_2012> getLstDatosEnero2012() {
        return lstDatosEnero2012;
    }

    public void setLstDatosEnero2012(ArrayList<Vif_2012> lstDatosEnero2012) {
        this.lstDatosEnero2012 = lstDatosEnero2012;
    }

    public ArrayList<Vif_2012> getLstDatosFebrero2012() {
        return lstDatosFebrero2012;
    }

    public void setLstDatosFebrero2012(ArrayList<Vif_2012> lstDatosFebrero2012) {
        this.lstDatosFebrero2012 = lstDatosFebrero2012;
    }

    public ArrayList<Vif_2012> getLstDatosMarzo2012() {
        return lstDatosMarzo2012;
    }

    public void setLstDatosMarzo2012(ArrayList<Vif_2012> lstDatosMarzo2012) {
        this.lstDatosMarzo2012 = lstDatosMarzo2012;
    }

    public ArrayList<Vif_2012> getLstDatosAbril2012() {
        return lstDatosAbril2012;
    }

    public void setLstDatosAbril2012(ArrayList<Vif_2012> lstDatosAbril2012) {
        this.lstDatosAbril2012 = lstDatosAbril2012;
    }

    public ArrayList<Vif_2012> getLstDatosMayo2012() {
        return lstDatosMayo2012;
    }

    public void setLstDatosMayo2012(ArrayList<Vif_2012> lstDatosMayo2012) {
        this.lstDatosMayo2012 = lstDatosMayo2012;
    }

    public ArrayList<Vif_2012> getLstDatosJunio2012() {
        return lstDatosJunio2012;
    }

    public void setLstDatosJunio2012(ArrayList<Vif_2012> lstDatosJunio2012) {
        this.lstDatosJunio2012 = lstDatosJunio2012;
    }

    public ArrayList<Vif_2012> getLstDatosJulio2012() {
        return lstDatosJulio2012;
    }

    public void setLstDatosJulio2012(ArrayList<Vif_2012> lstDatosJulio2012) {
        this.lstDatosJulio2012 = lstDatosJulio2012;
    }

    public ArrayList<Vif_2012> getLstDatosAgosto2012() {
        return lstDatosAgosto2012;
    }

    public void setLstDatosAgosto2012(ArrayList<Vif_2012> lstDatosAgosto2012) {
        this.lstDatosAgosto2012 = lstDatosAgosto2012;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembre2012() {
        return lstDatosSeptiembre2012;
    }

    public void setLstDatosSeptiembre2012(ArrayList<Vif_2012> lstDatosSeptiembre2012) {
        this.lstDatosSeptiembre2012 = lstDatosSeptiembre2012;
    }

    public ArrayList<Vif_2012> getLstDatosOctubre2012() {
        return lstDatosOctubre2012;
    }

    public void setLstDatosOctubre2012(ArrayList<Vif_2012> lstDatosOctubre2012) {
        this.lstDatosOctubre2012 = lstDatosOctubre2012;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembre2012() {
        return lstDatosNoviembre2012;
    }

    public void setLstDatosNoviembre2012(ArrayList<Vif_2012> lstDatosNoviembre2012) {
        this.lstDatosNoviembre2012 = lstDatosNoviembre2012;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembre2012() {
        return lstDatosDiciembre2012;
    }

    public void setLstDatosDiciembre2012(ArrayList<Vif_2012> lstDatosDiciembre2012) {
        this.lstDatosDiciembre2012 = lstDatosDiciembre2012;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        graficoContrastesMeses = contrastesMeses();
        graficoContrastesMesesSexoMasculino=contrastesMesesSexoMasculino();
        graficoContrastesMesesSexoFemenino=contrastesMesesSexoFemenino();
    }

    public ControladorMesesAño() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatosEnero2010 = new ArrayList<Vif_2010>();
        this.lstDatosFebrero2010 = new ArrayList<Vif_2010>();
        this.lstDatosMarzo2010 = new ArrayList<Vif_2010>();
        this.lstDatosAbril2010 = new ArrayList<Vif_2010>();
        this.lstDatosMayo2010 = new ArrayList<Vif_2010>();
        this.lstDatosJunio2010 = new ArrayList<Vif_2010>();
        this.lstDatosJulio2010 = new ArrayList<Vif_2010>();
        this.lstDatosAgosto2010 = new ArrayList<Vif_2010>();
        this.lstDatosSeptiembre2010 = new ArrayList<Vif_2010>();
        this.lstDatosOctubre2010 = new ArrayList<Vif_2010>();
        this.lstDatosNoviembre2010 = new ArrayList<Vif_2010>();
        this.lstDatosDiciembre2010 = new ArrayList<Vif_2010>();
        this.cargarDatos2010();
        this.init();
    }

    private CartesianChartModel contrastesMeses() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosEnero2010 = FVif_2010.ObtenerDatosEnero();
            lstDatosFebrero2010 = FVif_2010.ObtenerDatosFebrero();
            lstDatosMarzo2010 = FVif_2010.ObtenerDatosMarzo();
            lstDatosAbril2010 = FVif_2010.ObtenerDatosAbril();
            lstDatosMayo2010 = FVif_2010.ObtenerDatosMayo();
            lstDatosJunio2010 = FVif_2010.ObtenerDatosJunio();
            lstDatosJulio2010 = FVif_2010.ObtenerDatosJulio();
            lstDatosAgosto2010 = FVif_2010.ObtenerDatosAgosto();
            lstDatosSeptiembre2010 = FVif_2010.ObtenerDatosSeptiembre();
            lstDatosOctubre2010 = FVif_2010.ObtenerDatosOctubre();
            lstDatosNoviembre2010 = FVif_2010.ObtenerDatosNoviembre();
            lstDatosDiciembre2010 = FVif_2010.ObtenerDatosDiciembre();

            lstDatosEnero2011 = FVif_2011.ObtenerDatosEnero();
            lstDatosFebrero2011 = FVif_2011.ObtenerDatosFebrero();
            lstDatosMarzo2011 = FVif_2011.ObtenerDatosMarzo();
            lstDatosAbril2011 = FVif_2011.ObtenerDatosAbril();
            lstDatosMayo2011 = FVif_2011.ObtenerDatosMayo();
            lstDatosJunio2011 = FVif_2011.ObtenerDatosJunio();
            lstDatosJulio2011 = FVif_2011.ObtenerDatosJulio();
            lstDatosAgosto2011 = FVif_2011.ObtenerDatosAgosto();
            lstDatosSeptiembre2011 = FVif_2011.ObtenerDatosSeptiembre();
            lstDatosOctubre2011 = FVif_2011.ObtenerDatosOctubre();
            lstDatosNoviembre2011 = FVif_2011.ObtenerDatosNoviembre();
            lstDatosDiciembre2011 = FVif_2011.ObtenerDatosDiciembre();

            lstDatosEnero2012 = FVif_2012.ObtenerDatosEnero();
            lstDatosFebrero2012 = FVif_2012.ObtenerDatosFebrero();
            lstDatosMarzo2012 = FVif_2012.ObtenerDatosMarzo();
            lstDatosAbril2012 = FVif_2012.ObtenerDatosAbril();
            lstDatosMayo2012 = FVif_2012.ObtenerDatosMayo();
            lstDatosJunio2012 = FVif_2012.ObtenerDatosJunio();
            lstDatosJulio2012 = FVif_2012.ObtenerDatosJulio();
            lstDatosAgosto2012 = FVif_2012.ObtenerDatosAgosto();
            lstDatosSeptiembre2012 = FVif_2012.ObtenerDatosSeptiembre();
            lstDatosOctubre2012 = FVif_2012.ObtenerDatosOctubre();
            lstDatosNoviembre2012 = FVif_2012.ObtenerDatosNoviembre();
            lstDatosDiciembre2012 = FVif_2012.ObtenerDatosDiciembre();

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010");
            Vif_2010.set("Enero", lstDatosEnero2010.size());
            Vif_2010.set("Febrero", lstDatosFebrero2010.size());
            Vif_2010.set("Marzo", lstDatosMarzo2010.size());
            Vif_2010.set("Abril", lstDatosAbril2010.size());
            Vif_2010.set("Mayo", lstDatosMayo2010.size());
            Vif_2010.set("Junio", lstDatosJunio2010.size());
            Vif_2010.set("Julio", lstDatosJulio2010.size());
            Vif_2010.set("Agosto", lstDatosAgosto2010.size());
            Vif_2010.set("Septiembre", lstDatosSeptiembre2010.size());
            Vif_2010.set("Octubre", lstDatosOctubre2010.size());
            Vif_2010.set("Noviembre", lstDatosNoviembre2010.size());
            Vif_2010.set("Diciembre", lstDatosDiciembre2010.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos 2011");
            Vif_2011.set("Enero", lstDatosEnero2011.size());
            Vif_2011.set("Febrero", lstDatosFebrero2011.size());
            Vif_2011.set("Marzo", lstDatosMarzo2011.size());
            Vif_2011.set("Abril", lstDatosAbril2011.size());
            Vif_2011.set("Mayo", lstDatosMayo2011.size());
            Vif_2011.set("Junio", lstDatosJunio2011.size());
            Vif_2011.set("Julio", lstDatosJulio2011.size());
            Vif_2011.set("Agosto", lstDatosAgosto2011.size());
            Vif_2011.set("Septiembre", lstDatosSeptiembre2011.size());
            Vif_2011.set("Octubre", lstDatosOctubre2011.size());
            Vif_2011.set("Noviembre", lstDatosNoviembre2011.size());
            Vif_2011.set("Diciembre", lstDatosDiciembre2011.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos 2012");
            Vif_2012.set("Enero", lstDatosEnero2012.size());
            Vif_2012.set("Febrero", lstDatosFebrero2012.size());
            Vif_2012.set("Marzo", lstDatosMarzo2012.size());
            Vif_2012.set("Abril", lstDatosAbril2012.size());
            Vif_2012.set("Mayo", lstDatosMayo2012.size());
            Vif_2012.set("Junio", lstDatosJunio2012.size());
            Vif_2012.set("Julio", lstDatosJulio2012.size());
            Vif_2012.set("Agosto", lstDatosAgosto2012.size());
            Vif_2012.set("Septiembre", lstDatosSeptiembre2012.size());
            Vif_2012.set("Octubre", lstDatosOctubre2012.size());
            Vif_2012.set("Noviembre", lstDatosNoviembre2012.size());
            Vif_2012.set("Diciembre", lstDatosDiciembre2012.size());

            model.addSeries(Vif_2010);
            model.addSeries(Vif_2011);
            model.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel contrastesMesesSexoMasculino() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {

            lstDatosEnero2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("ENERO", "M");
            lstDatosFebrero2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("FEBRERO", "M");
            lstDatosMarzo2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("MARZO", "M");
            lstDatosAbril2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("ABRIL", "M");
            lstDatosMayo2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("MAYO", "M");
            lstDatosJunio2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("JUNIO", "M");
            lstDatosJulio2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("JULIO", "M");
            lstDatosAgosto2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("AGOSTO", "M");
            lstDatosSeptiembre2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubre2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "M");
            lstDatosNoviembre2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembre2010M=FVif_2010.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "M");

            lstDatosEnero2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "M");
            lstDatosFebrero2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "M");
            lstDatosMarzo2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "M");
            lstDatosAbril2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "M");
            lstDatosMayo2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "M");
            lstDatosJunio2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "M");
            lstDatosJulio2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "M");
            lstDatosAgosto2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "M");
            lstDatosSeptiembre2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubre2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "M");
            lstDatosNoviembre2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembre2011M=FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "M");
            
            lstDatosEnero2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("ENERO", "M");                    
            lstDatosFebrero2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("FEBRERO", "M");
            lstDatosMarzo2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("MARZO", "M");
            lstDatosAbril2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("ABRIL", "M");
            lstDatosMayo2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("MAYO", "M");
            lstDatosJunio2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("JUNIO", "M");
            lstDatosJulio2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("JULIO", "M");
            lstDatosAgosto2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("AGOSTO", "M");
            lstDatosSeptiembre2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubre2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("OCTUBRE", "M");
            lstDatosNoviembre2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembre2012M=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("DICIEMBRE", "M");

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010 Sexo Masculino");
            Vif_2010.set("Enero", lstDatosEnero2010M.size());
            Vif_2010.set("Febrero", lstDatosFebrero2010M.size());
            Vif_2010.set("Marzo", lstDatosMarzo2010M.size());
            Vif_2010.set("Abril", lstDatosAbril2010M.size());
            Vif_2010.set("Mayo", lstDatosMayo2010M.size());
            Vif_2010.set("Junio", lstDatosJunio2010M.size());
            Vif_2010.set("Julio", lstDatosJulio2010M.size());
            Vif_2010.set("Agosto", lstDatosAgosto2010M.size());
            Vif_2010.set("Septiembre", lstDatosSeptiembre2010M.size());
            Vif_2010.set("Octubre", lstDatosOctubre2010M.size());
            Vif_2010.set("Noviembre", lstDatosNoviembre2010M.size());
            Vif_2010.set("Diciembre", lstDatosDiciembre2010M.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos 2011 Sexo Masculino");
            Vif_2011.set("Enero", lstDatosEnero2011M.size());
            Vif_2011.set("Febrero", lstDatosFebrero2011M.size());
            Vif_2011.set("Marzo", lstDatosMarzo2011M.size());
            Vif_2011.set("Abril", lstDatosAbril2011M.size());
            Vif_2011.set("Mayo", lstDatosMayo2011M.size());
            Vif_2011.set("Junio", lstDatosJunio2011M.size());
            Vif_2011.set("Julio", lstDatosJulio2011M.size());
            Vif_2011.set("Agosto", lstDatosAgosto2011M.size());
            Vif_2011.set("Septiembre", lstDatosSeptiembre2011M.size());
            Vif_2011.set("Octubre", lstDatosOctubre2011M.size());
            Vif_2011.set("Noviembre", lstDatosNoviembre2011M.size());
            Vif_2011.set("Diciembre", lstDatosDiciembre2011M.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos 2012 Sexo Masculino");
            Vif_2012.set("Enero", lstDatosEnero2012M.size());
            Vif_2012.set("Febrero", lstDatosFebrero2012M.size());
            Vif_2012.set("Marzo", lstDatosMarzo2012M.size());
            Vif_2012.set("Abril", lstDatosAbril2012M.size());
            Vif_2012.set("Mayo", lstDatosMayo2012M.size());
            Vif_2012.set("Junio", lstDatosJunio2012M.size());
            Vif_2012.set("Julio", lstDatosJulio2012M.size());
            Vif_2012.set("Agosto", lstDatosAgosto2012M.size());
            Vif_2012.set("Septiembre", lstDatosSeptiembre2012M.size());
            Vif_2012.set("Octubre", lstDatosOctubre2012M.size());
            Vif_2012.set("Noviembre", lstDatosNoviembre2012M.size());
            Vif_2012.set("Diciembre", lstDatosDiciembre2012M.size());

            model1.addSeries(Vif_2010);
            model1.addSeries(Vif_2011);
            model1.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }
    
    private CartesianChartModel contrastesMesesSexoFemenino() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {

            lstDatosEnero2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("ENERO", "F");
            lstDatosFebrero2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("FEBRERO", "F");
            lstDatosMarzo2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("MARZO", "F");
            lstDatosAbril2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("ABRIL", "F");
            lstDatosMayo2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("MAYO", "F");
            lstDatosJunio2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("JUNIO", "F");
            lstDatosJulio2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("JULIO", "F");
            lstDatosAgosto2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("AGOSTO", "F");
            lstDatosSeptiembre2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubre2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "F");
            lstDatosNoviembre2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembre2010F=FVif_2010.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "F");

            lstDatosEnero2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "F");
            lstDatosFebrero2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "F");
            lstDatosMarzo2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "F");
            lstDatosAbril2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "F");
            lstDatosMayo2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "F");
            lstDatosJunio2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "F");
            lstDatosJulio2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "F");
            lstDatosAgosto2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "F");
            lstDatosSeptiembre2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubre2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUBRE", "F");
            lstDatosNoviembre2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembre2011F=FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "F");
            
            lstDatosEnero2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("ENERO", "F");                    
            lstDatosFebrero2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("FEBRERO", "F");
            lstDatosMarzo2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("MARZO", "F");
            lstDatosAbril2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("ABRIL", "F");
            lstDatosMayo2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("MAYO", "F");
            lstDatosJunio2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("JUNIO", "F");
            lstDatosJulio2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("JULIO", "F");
            lstDatosAgosto2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("AGOSTO", "F");
            lstDatosSeptiembre2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubre2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("OCTUBRE", "F");
            lstDatosNoviembre2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembre2012F=FVif_2012.ObtenerDatosDadoMesDenunciaSexoVictima("DICIEMBRE", "F");

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010 Sexo Femenino");
            Vif_2010.set("Enero", lstDatosEnero2010F.size());
            Vif_2010.set("Febrero", lstDatosFebrero2010F.size());
            Vif_2010.set("Marzo", lstDatosMarzo2010F.size());
            Vif_2010.set("Abril", lstDatosAbril2010F.size());
            Vif_2010.set("Mayo", lstDatosMayo2010F.size());
            Vif_2010.set("Junio", lstDatosJunio2010F.size());
            Vif_2010.set("Julio", lstDatosJulio2010F.size());
            Vif_2010.set("Agosto", lstDatosAgosto2010F.size());
            Vif_2010.set("Septiembre", lstDatosSeptiembre2010F.size());
            Vif_2010.set("Octubre", lstDatosOctubre2010F.size());
            Vif_2010.set("Noviembre", lstDatosNoviembre2010F.size());
            Vif_2010.set("Diciembre", lstDatosDiciembre2010F.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos 2011 Sexo Femenino");
            Vif_2011.set("Enero", lstDatosEnero2011F.size());
            Vif_2011.set("Febrero", lstDatosFebrero2011F.size());
            Vif_2011.set("Marzo", lstDatosMarzo2011F.size());
            Vif_2011.set("Abril", lstDatosAbril2011F.size());
            Vif_2011.set("Mayo", lstDatosMayo2011F.size());
            Vif_2011.set("Junio", lstDatosJunio2011F.size());
            Vif_2011.set("Julio", lstDatosJulio2011F.size());
            Vif_2011.set("Agosto", lstDatosAgosto2011F.size());
            Vif_2011.set("Septiembre", lstDatosSeptiembre2011F.size());
            Vif_2011.set("Octubre", lstDatosOctubre2011F.size());
            Vif_2011.set("Noviembre", lstDatosNoviembre2011F.size());
            Vif_2011.set("Diciembre", lstDatosDiciembre2011F.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos 2012 Sexo Femenino");
            Vif_2012.set("Enero", lstDatosEnero2012F.size());
            Vif_2012.set("Febrero", lstDatosFebrero2012F.size());
            Vif_2012.set("Marzo", lstDatosMarzo2012F.size());
            Vif_2012.set("Abril", lstDatosAbril2012F.size());
            Vif_2012.set("Mayo", lstDatosMayo2012F.size());
            Vif_2012.set("Junio", lstDatosJunio2012F.size());
            Vif_2012.set("Julio", lstDatosJulio2012F.size());
            Vif_2012.set("Agosto", lstDatosAgosto2012F.size());
            Vif_2012.set("Septiembre", lstDatosSeptiembre2012F.size());
            Vif_2012.set("Octubre", lstDatosOctubre2012F.size());
            Vif_2012.set("Noviembre", lstDatosNoviembre2012F.size());
            Vif_2012.set("Diciembre", lstDatosDiciembre2012F.size());

            model2.addSeries(Vif_2010);
            model2.addSeries(Vif_2011);
            model2.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }
    
    
    
    
    
    
    public void cargarDatos2010() {
        try {

            this.lstDatos2010 = FVif_2010.ObtenerDatos();
            this.datoSel2010 = lstDatos2010.get(0);
            System.out.println(lstDatos2010.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
