/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif2012;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorContrastesDiaAgresion {

    /**
     * Creates a new instance of ControladorContrastesDiaAgresion
     */
    private ArrayList<Vif_2010> lstDatos2010;
    private ArrayList<Vif_2010> lstDatos2010DadoDia;
    private ArrayList<Vif_2011> lstDatos2011;
    private ArrayList<Vif2012> lstDatos2012;
    private ArrayList<Vif_2010> lstDatosLunes2010;
    private ArrayList<Vif_2010> lstDatosMartes2010;
    private ArrayList<Vif_2010> lstDatosMiercoles2010;
    private ArrayList<Vif_2010> lstDatosJueves2010;
    private ArrayList<Vif_2010> lstDatosViernes2010;
    private ArrayList<Vif_2010> lstDatosSabado2010;
    private ArrayList<Vif_2010> lstDatosDomingo2010;
    private ArrayList<Vif_2011> lstDatosLunes2011;
    private ArrayList<Vif_2011> lstDatosMartes2011;
    private ArrayList<Vif_2011> lstDatosMiercoles2011;
    private ArrayList<Vif_2011> lstDatosJueves2011;
    private ArrayList<Vif_2011> lstDatosViernes2011;
    private ArrayList<Vif_2011> lstDatosSabado2011;
    private ArrayList<Vif_2011> lstDatosDomingo2011;
    private ArrayList<Vif_2012> lstDatosLunes2012;
    private ArrayList<Vif_2012> lstDatosMartes2012;
    private ArrayList<Vif_2012> lstDatosMiercoles2012;
    private ArrayList<Vif_2012> lstDatosJueves2012;
    private ArrayList<Vif_2012> lstDatosViernes2012;
    private ArrayList<Vif_2012> lstDatosSabado2012;
    private ArrayList<Vif_2012> lstDatosDomingo2012;
    private CartesianChartModel ModelContrastesDia;
    private CartesianChartModel lineLunes;
    private CartesianChartModel lineMartes;
    private CartesianChartModel lineMiercoles;
    private CartesianChartModel lineJueves;
    private CartesianChartModel lineViernes;
    private CartesianChartModel lineSabado;
    private CartesianChartModel lineDomingo;
    private PieChartModel pieLunes;
    private PieChartModel pieMartes;
    private PieChartModel pieMiercoles;
    private PieChartModel pieJueves;
    private PieChartModel pieViernes;
    private PieChartModel pieSabado;
    private PieChartModel pieDomingo;
    private ArrayList<Vif_2010> lstDatosLunes2010M;
    private ArrayList<Vif_2010> lstDatosMartes2010M;
    private ArrayList<Vif_2010> lstDatosMiercoles2010M;
    private ArrayList<Vif_2010> lstDatosJueves2010M;
    private ArrayList<Vif_2010> lstDatosViernes2010M;
    private ArrayList<Vif_2010> lstDatosSabado2010M;
    private ArrayList<Vif_2010> lstDatosDomingo2010M;
    private ArrayList<Vif_2011> lstDatosLunes2011M;
    private ArrayList<Vif_2011> lstDatosMartes2011M;
    private ArrayList<Vif_2011> lstDatosMiercoles2011M;
    private ArrayList<Vif_2011> lstDatosJueves2011M;
    private ArrayList<Vif_2011> lstDatosViernes2011M;
    private ArrayList<Vif_2011> lstDatosSabado2011M;
    private ArrayList<Vif_2011> lstDatosDomingo2011M;
    private ArrayList<Vif_2012> lstDatosLunes2012M;
    private ArrayList<Vif_2012> lstDatosMartes2012M;
    private ArrayList<Vif_2012> lstDatosMiercoles2012M;
    private ArrayList<Vif_2012> lstDatosJueves2012M;
    private ArrayList<Vif_2012> lstDatosViernes2012M;
    private ArrayList<Vif_2012> lstDatosSabado2012M;
    private ArrayList<Vif_2012> lstDatosDomingo2012M;

    private ArrayList<Vif_2010> lstDatosLunes2010F;
    private ArrayList<Vif_2010> lstDatosMartes2010F;
    private ArrayList<Vif_2010> lstDatosMiercoles2010F;
    private ArrayList<Vif_2010> lstDatosJueves2010F;
    private ArrayList<Vif_2010> lstDatosViernes2010F;
    private ArrayList<Vif_2010> lstDatosSabado2010F;
    private ArrayList<Vif_2010> lstDatosDomingo2010F;
    private ArrayList<Vif_2011> lstDatosLunes2011F;
    private ArrayList<Vif_2011> lstDatosMartes2011F;
    private ArrayList<Vif_2011> lstDatosMiercoles2011F;
    private ArrayList<Vif_2011> lstDatosJueves2011F;
    private ArrayList<Vif_2011> lstDatosViernes2011F;
    private ArrayList<Vif_2011> lstDatosSabado2011F;
    private ArrayList<Vif_2011> lstDatosDomingo2011F;
    private ArrayList<Vif_2012> lstDatosLunes2012F;
    private ArrayList<Vif_2012> lstDatosMartes2012F;
    private ArrayList<Vif_2012> lstDatosMiercoles2012F;
    private ArrayList<Vif_2012> lstDatosJueves2012F;
    private ArrayList<Vif_2012> lstDatosViernes2012F;
    private ArrayList<Vif_2012> lstDatosSabado2012F;
    private ArrayList<Vif_2012> lstDatosDomingo2012F;

    private CartesianChartModel lineLunesSV;
    private CartesianChartModel lineMartesSV;
    private CartesianChartModel lineMiercolesSV;
    private CartesianChartModel lineJuevesSV;
    private CartesianChartModel lineViernesSV;
    private CartesianChartModel lineSabadoSV;
    private CartesianChartModel lineDomingoSV;
    private CartesianChartModel lineContrasteMasculino;
    private CartesianChartModel lineContrasteFemenino;

    public CartesianChartModel getLineContrasteMasculino() {
        return lineContrasteMasculino;
    }

    public void setLineContrasteMasculino(CartesianChartModel lineContrasteMasculino) {
        this.lineContrasteMasculino = lineContrasteMasculino;
    }

    public CartesianChartModel getLineContrasteFemenino() {
        return lineContrasteFemenino;
    }

    public void setLineContrasteFemenino(CartesianChartModel lineContrasteFemenino) {
        this.lineContrasteFemenino = lineContrasteFemenino;
    }

    public ArrayList<Vif_2010> getLstDatosLunes2010M() {
        return lstDatosLunes2010M;
    }

    public void setLstDatosLunes2010M(ArrayList<Vif_2010> lstDatosLunes2010M) {
        this.lstDatosLunes2010M = lstDatosLunes2010M;
    }

    public ArrayList<Vif_2010> getLstDatosMartes2010M() {
        return lstDatosMartes2010M;
    }

    public void setLstDatosMartes2010M(ArrayList<Vif_2010> lstDatosMartes2010M) {
        this.lstDatosMartes2010M = lstDatosMartes2010M;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles2010M() {
        return lstDatosMiercoles2010M;
    }

    public void setLstDatosMiercoles2010M(ArrayList<Vif_2010> lstDatosMiercoles2010M) {
        this.lstDatosMiercoles2010M = lstDatosMiercoles2010M;
    }

    public ArrayList<Vif_2010> getLstDatosJueves2010M() {
        return lstDatosJueves2010M;
    }

    public void setLstDatosJueves2010M(ArrayList<Vif_2010> lstDatosJueves2010M) {
        this.lstDatosJueves2010M = lstDatosJueves2010M;
    }

    public ArrayList<Vif_2010> getLstDatosViernes2010M() {
        return lstDatosViernes2010M;
    }

    public void setLstDatosViernes2010M(ArrayList<Vif_2010> lstDatosViernes2010M) {
        this.lstDatosViernes2010M = lstDatosViernes2010M;
    }

    public ArrayList<Vif_2010> getLstDatosSabado2010M() {
        return lstDatosSabado2010M;
    }

    public void setLstDatosSabado2010M(ArrayList<Vif_2010> lstDatosSabado2010M) {
        this.lstDatosSabado2010M = lstDatosSabado2010M;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo2010M() {
        return lstDatosDomingo2010M;
    }

    public void setLstDatosDomingo2010M(ArrayList<Vif_2010> lstDatosDomingo2010M) {
        this.lstDatosDomingo2010M = lstDatosDomingo2010M;
    }

    public ArrayList<Vif_2011> getLstDatosLunes2011M() {
        return lstDatosLunes2011M;
    }

    public void setLstDatosLunes2011M(ArrayList<Vif_2011> lstDatosLunes2011M) {
        this.lstDatosLunes2011M = lstDatosLunes2011M;
    }

    public ArrayList<Vif_2011> getLstDatosMartes2011M() {
        return lstDatosMartes2011M;
    }

    public void setLstDatosMartes2011M(ArrayList<Vif_2011> lstDatosMartes2011M) {
        this.lstDatosMartes2011M = lstDatosMartes2011M;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles2011M() {
        return lstDatosMiercoles2011M;
    }

    public void setLstDatosMiercoles2011M(ArrayList<Vif_2011> lstDatosMiercoles2011M) {
        this.lstDatosMiercoles2011M = lstDatosMiercoles2011M;
    }

    public ArrayList<Vif_2011> getLstDatosJueves2011M() {
        return lstDatosJueves2011M;
    }

    public void setLstDatosJueves2011M(ArrayList<Vif_2011> lstDatosJueves2011M) {
        this.lstDatosJueves2011M = lstDatosJueves2011M;
    }

    public ArrayList<Vif_2011> getLstDatosViernes2011M() {
        return lstDatosViernes2011M;
    }

    public void setLstDatosViernes2011M(ArrayList<Vif_2011> lstDatosViernes2011M) {
        this.lstDatosViernes2011M = lstDatosViernes2011M;
    }

    public ArrayList<Vif_2011> getLstDatosSabado2011M() {
        return lstDatosSabado2011M;
    }

    public void setLstDatosSabado2011M(ArrayList<Vif_2011> lstDatosSabado2011M) {
        this.lstDatosSabado2011M = lstDatosSabado2011M;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo2011M() {
        return lstDatosDomingo2011M;
    }

    public void setLstDatosDomingo2011M(ArrayList<Vif_2011> lstDatosDomingo2011M) {
        this.lstDatosDomingo2011M = lstDatosDomingo2011M;
    }

    public ArrayList<Vif_2012> getLstDatosLunes2012M() {
        return lstDatosLunes2012M;
    }

    public void setLstDatosLunes2012M(ArrayList<Vif_2012> lstDatosLunes2012M) {
        this.lstDatosLunes2012M = lstDatosLunes2012M;
    }

    public ArrayList<Vif_2012> getLstDatosMartes2012M() {
        return lstDatosMartes2012M;
    }

    public void setLstDatosMartes2012M(ArrayList<Vif_2012> lstDatosMartes2012M) {
        this.lstDatosMartes2012M = lstDatosMartes2012M;
    }

    public ArrayList<Vif_2012> getLstDatosMiercoles2012M() {
        return lstDatosMiercoles2012M;
    }

    public void setLstDatosMiercoles2012M(ArrayList<Vif_2012> lstDatosMiercoles2012M) {
        this.lstDatosMiercoles2012M = lstDatosMiercoles2012M;
    }

    public ArrayList<Vif_2012> getLstDatosJueves2012M() {
        return lstDatosJueves2012M;
    }

    public void setLstDatosJueves2012M(ArrayList<Vif_2012> lstDatosJueves2012M) {
        this.lstDatosJueves2012M = lstDatosJueves2012M;
    }

    public ArrayList<Vif_2012> getLstDatosViernes2012M() {
        return lstDatosViernes2012M;
    }

    public void setLstDatosViernes2012M(ArrayList<Vif_2012> lstDatosViernes2012M) {
        this.lstDatosViernes2012M = lstDatosViernes2012M;
    }

    public ArrayList<Vif_2012> getLstDatosSabado2012M() {
        return lstDatosSabado2012M;
    }

    public void setLstDatosSabado2012M(ArrayList<Vif_2012> lstDatosSabado2012M) {
        this.lstDatosSabado2012M = lstDatosSabado2012M;
    }

    public ArrayList<Vif_2012> getLstDatosDomingo2012M() {
        return lstDatosDomingo2012M;
    }

    public void setLstDatosDomingo2012M(ArrayList<Vif_2012> lstDatosDomingo2012M) {
        this.lstDatosDomingo2012M = lstDatosDomingo2012M;
    }

    public ArrayList<Vif_2010> getLstDatosLunes2010F() {
        return lstDatosLunes2010F;
    }

    public void setLstDatosLunes2010F(ArrayList<Vif_2010> lstDatosLunes2010F) {
        this.lstDatosLunes2010F = lstDatosLunes2010F;
    }

    public ArrayList<Vif_2010> getLstDatosMartes2010F() {
        return lstDatosMartes2010F;
    }

    public void setLstDatosMartes2010F(ArrayList<Vif_2010> lstDatosMartes2010F) {
        this.lstDatosMartes2010F = lstDatosMartes2010F;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles2010F() {
        return lstDatosMiercoles2010F;
    }

    public void setLstDatosMiercoles2010F(ArrayList<Vif_2010> lstDatosMiercoles2010F) {
        this.lstDatosMiercoles2010F = lstDatosMiercoles2010F;
    }

    public ArrayList<Vif_2010> getLstDatosJueves2010F() {
        return lstDatosJueves2010F;
    }

    public void setLstDatosJueves2010F(ArrayList<Vif_2010> lstDatosJueves2010F) {
        this.lstDatosJueves2010F = lstDatosJueves2010F;
    }

    public ArrayList<Vif_2010> getLstDatosViernes2010F() {
        return lstDatosViernes2010F;
    }

    public void setLstDatosViernes2010F(ArrayList<Vif_2010> lstDatosViernes2010F) {
        this.lstDatosViernes2010F = lstDatosViernes2010F;
    }

    public ArrayList<Vif_2010> getLstDatosSabado2010F() {
        return lstDatosSabado2010F;
    }

    public void setLstDatosSabado2010F(ArrayList<Vif_2010> lstDatosSabado2010F) {
        this.lstDatosSabado2010F = lstDatosSabado2010F;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo2010F() {
        return lstDatosDomingo2010F;
    }

    public void setLstDatosDomingo2010F(ArrayList<Vif_2010> lstDatosDomingo2010F) {
        this.lstDatosDomingo2010F = lstDatosDomingo2010F;
    }

    public ArrayList<Vif_2011> getLstDatosLunes2011F() {
        return lstDatosLunes2011F;
    }

    public void setLstDatosLunes2011F(ArrayList<Vif_2011> lstDatosLunes2011F) {
        this.lstDatosLunes2011F = lstDatosLunes2011F;
    }

    public ArrayList<Vif_2011> getLstDatosMartes2011F() {
        return lstDatosMartes2011F;
    }

    public void setLstDatosMartes2011F(ArrayList<Vif_2011> lstDatosMartes2011F) {
        this.lstDatosMartes2011F = lstDatosMartes2011F;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles2011F() {
        return lstDatosMiercoles2011F;
    }

    public void setLstDatosMiercoles2011F(ArrayList<Vif_2011> lstDatosMiercoles2011F) {
        this.lstDatosMiercoles2011F = lstDatosMiercoles2011F;
    }

    public ArrayList<Vif_2011> getLstDatosJueves2011F() {
        return lstDatosJueves2011F;
    }

    public void setLstDatosJueves2011F(ArrayList<Vif_2011> lstDatosJueves2011F) {
        this.lstDatosJueves2011F = lstDatosJueves2011F;
    }

    public ArrayList<Vif_2011> getLstDatosViernes2011F() {
        return lstDatosViernes2011F;
    }

    public void setLstDatosViernes2011F(ArrayList<Vif_2011> lstDatosViernes2011F) {
        this.lstDatosViernes2011F = lstDatosViernes2011F;
    }

    public ArrayList<Vif_2011> getLstDatosSabado2011F() {
        return lstDatosSabado2011F;
    }

    public void setLstDatosSabado2011F(ArrayList<Vif_2011> lstDatosSabado2011F) {
        this.lstDatosSabado2011F = lstDatosSabado2011F;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo2011F() {
        return lstDatosDomingo2011F;
    }

    public void setLstDatosDomingo2011F(ArrayList<Vif_2011> lstDatosDomingo2011F) {
        this.lstDatosDomingo2011F = lstDatosDomingo2011F;
    }

    public ArrayList<Vif_2012> getLstDatosLunes2012F() {
        return lstDatosLunes2012F;
    }

    public void setLstDatosLunes2012F(ArrayList<Vif_2012> lstDatosLunes2012F) {
        this.lstDatosLunes2012F = lstDatosLunes2012F;
    }

    public ArrayList<Vif_2012> getLstDatosMartes2012F() {
        return lstDatosMartes2012F;
    }

    public void setLstDatosMartes2012F(ArrayList<Vif_2012> lstDatosMartes2012F) {
        this.lstDatosMartes2012F = lstDatosMartes2012F;
    }

    public ArrayList<Vif_2012> getLstDatosMiercoles2012F() {
        return lstDatosMiercoles2012F;
    }

    public void setLstDatosMiercoles2012F(ArrayList<Vif_2012> lstDatosMiercoles2012F) {
        this.lstDatosMiercoles2012F = lstDatosMiercoles2012F;
    }

    public ArrayList<Vif_2012> getLstDatosJueves2012F() {
        return lstDatosJueves2012F;
    }

    public void setLstDatosJueves2012F(ArrayList<Vif_2012> lstDatosJueves2012F) {
        this.lstDatosJueves2012F = lstDatosJueves2012F;
    }

    public ArrayList<Vif_2012> getLstDatosViernes2012F() {
        return lstDatosViernes2012F;
    }

    public void setLstDatosViernes2012F(ArrayList<Vif_2012> lstDatosViernes2012F) {
        this.lstDatosViernes2012F = lstDatosViernes2012F;
    }

    public ArrayList<Vif_2012> getLstDatosSabado2012F() {
        return lstDatosSabado2012F;
    }

    public void setLstDatosSabado2012F(ArrayList<Vif_2012> lstDatosSabado2012F) {
        this.lstDatosSabado2012F = lstDatosSabado2012F;
    }

    public ArrayList<Vif_2012> getLstDatosDomingo2012F() {
        return lstDatosDomingo2012F;
    }

    public void setLstDatosDomingo2012F(ArrayList<Vif_2012> lstDatosDomingo2012F) {
        this.lstDatosDomingo2012F = lstDatosDomingo2012F;
    }

    public CartesianChartModel getLineLunesSV() {
        return lineLunesSV;
    }

    public void setLineLunesSV(CartesianChartModel lineLunesSV) {
        this.lineLunesSV = lineLunesSV;
    }

    public CartesianChartModel getLineMartesSV() {
        return lineMartesSV;
    }

    public void setLineMartesSV(CartesianChartModel lineMartesSV) {
        this.lineMartesSV = lineMartesSV;
    }

    public CartesianChartModel getLineMiercolesSV() {
        return lineMiercolesSV;
    }

    public void setLineMiercolesSV(CartesianChartModel lineMiercolesSV) {
        this.lineMiercolesSV = lineMiercolesSV;
    }

    public CartesianChartModel getLineJuevesSV() {
        return lineJuevesSV;
    }

    public void setLineJuevesSV(CartesianChartModel lineJuevesSV) {
        this.lineJuevesSV = lineJuevesSV;
    }

    public CartesianChartModel getLineViernesSV() {
        return lineViernesSV;
    }

    public void setLineViernesSV(CartesianChartModel lineViernesSV) {
        this.lineViernesSV = lineViernesSV;
    }

    public CartesianChartModel getLineSabadoSV() {
        return lineSabadoSV;
    }

    public void setLineSabadoSV(CartesianChartModel lineSabadoSV) {
        this.lineSabadoSV = lineSabadoSV;
    }

    public CartesianChartModel getLineDomingoSV() {
        return lineDomingoSV;
    }

    public void setLineDomingoSV(CartesianChartModel lineDomingoSV) {
        this.lineDomingoSV = lineDomingoSV;
    }

    public CartesianChartModel getLineLunes() {
        return lineLunes;
    }

    public void setLineLunes(CartesianChartModel lineLunes) {
        this.lineLunes = lineLunes;
    }

    public CartesianChartModel getLineMartes() {
        return lineMartes;
    }

    public void setLineMartes(CartesianChartModel lineMartes) {
        this.lineMartes = lineMartes;
    }

    public CartesianChartModel getLineMiercoles() {
        return lineMiercoles;
    }

    public void setLineMiercoles(CartesianChartModel lineMiercoles) {
        this.lineMiercoles = lineMiercoles;
    }

    public CartesianChartModel getLineJueves() {
        return lineJueves;
    }

    public void setLineJueves(CartesianChartModel lineJueves) {
        this.lineJueves = lineJueves;
    }

    public CartesianChartModel getLineViernes() {
        return lineViernes;
    }

    public void setLineViernes(CartesianChartModel lineViernes) {
        this.lineViernes = lineViernes;
    }

    public CartesianChartModel getLineSabado() {
        return lineSabado;
    }

    public void setLineSabado(CartesianChartModel lineSabado) {
        this.lineSabado = lineSabado;
    }

    public CartesianChartModel getLineDomingo() {
        return lineDomingo;
    }

    public void setLineDomingo(CartesianChartModel lineDomingo) {
        this.lineDomingo = lineDomingo;
    }

    public PieChartModel getPieLunes() {
        return pieLunes;
    }

    public void setPieLunes(PieChartModel pieLunes) {
        this.pieLunes = pieLunes;
    }

    public PieChartModel getPieMartes() {
        return pieMartes;
    }

    public void setPieMartes(PieChartModel pieMartes) {
        this.pieMartes = pieMartes;
    }

    public PieChartModel getPieMiercoles() {
        return pieMiercoles;
    }

    public void setPieMiercoles(PieChartModel pieMiercoles) {
        this.pieMiercoles = pieMiercoles;
    }

    public PieChartModel getPieJueves() {
        return pieJueves;
    }

    public void setPieJueves(PieChartModel pieJueves) {
        this.pieJueves = pieJueves;
    }

    public PieChartModel getPieViernes() {
        return pieViernes;
    }

    public void setPieViernes(PieChartModel pieViernes) {
        this.pieViernes = pieViernes;
    }

    public PieChartModel getPieSabado() {
        return pieSabado;
    }

    public void setPieSabado(PieChartModel pieSabado) {
        this.pieSabado = pieSabado;
    }

    public PieChartModel getPieDomingo() {
        return pieDomingo;
    }

    public void setPieDomingo(PieChartModel pieDomingo) {
        this.pieDomingo = pieDomingo;
    }

    public ArrayList<Vif_2012> getLstDatosLunes2012() {
        return lstDatosLunes2012;
    }

    public void setLstDatosLunes2012(ArrayList<Vif_2012> lstDatosLunes2012) {
        this.lstDatosLunes2012 = lstDatosLunes2012;
    }

    public ArrayList<Vif_2012> getLstDatosMartes2012() {
        return lstDatosMartes2012;
    }

    public void setLstDatosMartes2012(ArrayList<Vif_2012> lstDatosMartes2012) {
        this.lstDatosMartes2012 = lstDatosMartes2012;
    }

    public ArrayList<Vif_2012> getLstDatosMiercoles2012() {
        return lstDatosMiercoles2012;
    }

    public void setLstDatosMiercoles2012(ArrayList<Vif_2012> lstDatosMiercoles2012) {
        this.lstDatosMiercoles2012 = lstDatosMiercoles2012;
    }

    public ArrayList<Vif_2012> getLstDatosJueves2012() {
        return lstDatosJueves2012;
    }

    public void setLstDatosJueves2012(ArrayList<Vif_2012> lstDatosJueves2012) {
        this.lstDatosJueves2012 = lstDatosJueves2012;
    }

    public ArrayList<Vif_2012> getLstDatosViernes2012() {
        return lstDatosViernes2012;
    }

    public void setLstDatosViernes2012(ArrayList<Vif_2012> lstDatosViernes2012) {
        this.lstDatosViernes2012 = lstDatosViernes2012;
    }

    public ArrayList<Vif_2012> getLstDatosSabado2012() {
        return lstDatosSabado2012;
    }

    public void setLstDatosSabado2012(ArrayList<Vif_2012> lstDatosSabado2012) {
        this.lstDatosSabado2012 = lstDatosSabado2012;
    }

    public ArrayList<Vif_2012> getLstDatosDomingo2012() {
        return lstDatosDomingo2012;
    }

    public void setLstDatosDomingo2012(ArrayList<Vif_2012> lstDatosDomingo2012) {
        this.lstDatosDomingo2012 = lstDatosDomingo2012;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public ArrayList<Vif_2010> getLstDatos2010DadoDia() {
        return lstDatos2010DadoDia;
    }

    public void setLstDatos2010DadoDia(ArrayList<Vif_2010> lstDatos2010DadoDia) {
        this.lstDatos2010DadoDia = lstDatos2010DadoDia;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public ArrayList<Vif_2011> getLstDatos2011() {
        return lstDatos2011;
    }

    public void setLstDatos2011(ArrayList<Vif_2011> lstDatos2011) {
        this.lstDatos2011 = lstDatos2011;
    }

    public ArrayList<Vif2012> getLstDatos2012() {
        return lstDatos2012;
    }

    public void setLstDatos2012(ArrayList<Vif2012> lstDatos2012) {
        this.lstDatos2012 = lstDatos2012;
    }

    public ArrayList<Vif_2010> getLstDatosLunes2010() {
        return lstDatosLunes2010;
    }

    public void setLstDatosLunes2010(ArrayList<Vif_2010> lstDatosLunes2010) {
        this.lstDatosLunes2010 = lstDatosLunes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMartes2010() {
        return lstDatosMartes2010;
    }

    public void setLstDatosMartes2010(ArrayList<Vif_2010> lstDatosMartes2010) {
        this.lstDatosMartes2010 = lstDatosMartes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles2010() {
        return lstDatosMiercoles2010;
    }

    public void setLstDatosMiercoles2010(ArrayList<Vif_2010> lstDatosMiercoles2010) {
        this.lstDatosMiercoles2010 = lstDatosMiercoles2010;
    }

    public ArrayList<Vif_2010> getLstDatosJueves2010() {
        return lstDatosJueves2010;
    }

    public void setLstDatosJueves2010(ArrayList<Vif_2010> lstDatosJueves2010) {
        this.lstDatosJueves2010 = lstDatosJueves2010;
    }

    public ArrayList<Vif_2010> getLstDatosViernes2010() {
        return lstDatosViernes2010;
    }

    public void setLstDatosViernes2010(ArrayList<Vif_2010> lstDatosViernes2010) {
        this.lstDatosViernes2010 = lstDatosViernes2010;
    }

    public ArrayList<Vif_2010> getLstDatosSabado2010() {
        return lstDatosSabado2010;
    }

    public void setLstDatosSabado2010(ArrayList<Vif_2010> lstDatosSabado2010) {
        this.lstDatosSabado2010 = lstDatosSabado2010;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo2010() {
        return lstDatosDomingo2010;
    }

    public void setLstDatosDomingo2010(ArrayList<Vif_2010> lstDatosDomingo2010) {
        this.lstDatosDomingo2010 = lstDatosDomingo2010;
    }

    public ArrayList<Vif_2011> getLstDatosLunes2011() {
        return lstDatosLunes2011;
    }

    public void setLstDatosLunes2011(ArrayList<Vif_2011> lstDatosLunes2011) {
        this.lstDatosLunes2011 = lstDatosLunes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMartes2011() {
        return lstDatosMartes2011;
    }

    public void setLstDatosMartes2011(ArrayList<Vif_2011> lstDatosMartes2011) {
        this.lstDatosMartes2011 = lstDatosMartes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles2011() {
        return lstDatosMiercoles2011;
    }

    public void setLstDatosMiercoles2011(ArrayList<Vif_2011> lstDatosMiercoles2011) {
        this.lstDatosMiercoles2011 = lstDatosMiercoles2011;
    }

    public ArrayList<Vif_2011> getLstDatosJueves2011() {
        return lstDatosJueves2011;
    }

    public void setLstDatosJueves2011(ArrayList<Vif_2011> lstDatosJueves2011) {
        this.lstDatosJueves2011 = lstDatosJueves2011;
    }

    public ArrayList<Vif_2011> getLstDatosViernes2011() {
        return lstDatosViernes2011;
    }

    public void setLstDatosViernes2011(ArrayList<Vif_2011> lstDatosViernes2011) {
        this.lstDatosViernes2011 = lstDatosViernes2011;
    }

    public ArrayList<Vif_2011> getLstDatosSabado2011() {
        return lstDatosSabado2011;
    }

    public void setLstDatosSabado2011(ArrayList<Vif_2011> lstDatosSabado2011) {
        this.lstDatosSabado2011 = lstDatosSabado2011;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo2011() {
        return lstDatosDomingo2011;
    }

    public void setLstDatosDomingo2011(ArrayList<Vif_2011> lstDatosDomingo2011) {
        this.lstDatosDomingo2011 = lstDatosDomingo2011;
    }

    public CartesianChartModel getModelContrastesDia() {
        return ModelContrastesDia;
    }

    public void setModelContrastesDia(CartesianChartModel ModelContrastesDia) {
        this.ModelContrastesDia = ModelContrastesDia;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        ModelContrastesDia = initGraficoContrastesDias();
        pieLunes = graficaPieLunes();
        pieMartes = pieMartes();
        pieMiercoles = pieMiercoles();
        pieJueves = pieJueves();
        pieViernes = pieViernes();
        pieSabado = pieSabado();
        pieDomingo = pieDomingo();
        lineLunes = initLunes();
        lineMartes = initMartes();
        lineMiercoles = initMiercoles();
        lineJueves = initJueves();
        lineViernes = initViernes();
        lineSabado = initSabado();
        lineDomingo = initDomingo();
        lineLunesSV = initLunesSexoVictima();
        lineMartesSV = initMartesSexoVictima();
        lineMiercolesSV = initMiercolesSexoVictima();
        lineJuevesSV = initJuevesSexoVictima();
        lineViernesSV = initViernesSexoVictima();
        lineSabadoSV = initSabadoSexoVictima();
        lineDomingoSV = initDomingoSexoVictima();
        lineContrasteMasculino=initContrasteSexoMasculino();
        lineContrasteFemenino=initContrasteSexoFemenino();

    }

    private void reinit() {
        this.lstDatosLunes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMartes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMiercoles2010 = new ArrayList<Vif_2010>();
        this.lstDatosJueves2010 = new ArrayList<Vif_2010>();
        this.lstDatosViernes2010 = new ArrayList<Vif_2010>();
        this.lstDatosSabado2010 = new ArrayList<Vif_2010>();
        this.lstDatosDomingo2010 = new ArrayList<Vif_2010>();
        this.lstDatosLunes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMartes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMiercoles2011 = new ArrayList<Vif_2011>();
        this.lstDatosJueves2011 = new ArrayList<Vif_2011>();
        this.lstDatosViernes2011 = new ArrayList<Vif_2011>();
        this.lstDatosSabado2011 = new ArrayList<Vif_2011>();
        this.lstDatosDomingo2011 = new ArrayList<Vif_2011>();
        this.lstDatosLunes2012 = new ArrayList<Vif_2012>();
        this.lstDatosMartes2012 = new ArrayList<Vif_2012>();
        this.lstDatosMiercoles2012 = new ArrayList<Vif_2012>();
        this.lstDatosJueves2012 = new ArrayList<Vif_2012>();
        this.lstDatosViernes2012 = new ArrayList<Vif_2012>();
        this.lstDatosSabado2012 = new ArrayList<Vif_2012>();
        this.lstDatosDomingo2012 = new ArrayList<Vif_2012>();
        this.init();

    }

    private CartesianChartModel initGraficoContrastesDias() {
        CartesianChartModel model = new CartesianChartModel();
        ArrayList<String> ListSemana = new ArrayList<String>();
        ListSemana.add("LUNES");
        ListSemana.add("MARTES");
        ListSemana.add("MIERCOLES");
        ListSemana.add("JUEVES");
        ListSemana.add("VIERNES");
        ListSemana.add("SABADO");
        ListSemana.add("DOMINGO");
        try {

            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");

            ChartSeries denuncias2010 = new ChartSeries();
            denuncias2010.setLabel("Denuncias 2010");
            denuncias2010.set("Lunes", lstDatosLunes2010.size());
            denuncias2010.set("Martes", lstDatosMartes2010.size());
            denuncias2010.set("Miercoles", lstDatosMiercoles2010.size());
            denuncias2010.set("Jueves", lstDatosJueves2010.size());
            denuncias2010.set("Viernes", lstDatosViernes2010.size());
            denuncias2010.set("Sabado", lstDatosSabado2010.size());
            denuncias2010.set("Domingo", lstDatosDomingo2010.size());

            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            ChartSeries denuncias2011 = new ChartSeries();
            denuncias2011.setLabel("Denuncias 2011");
            denuncias2011.set("Lunes", lstDatosLunes2011.size());
            denuncias2011.set("Martes", lstDatosMartes2011.size());
            denuncias2011.set("Miercoles", lstDatosMiercoles2011.size());
            denuncias2011.set("Jueves", lstDatosJueves2011.size());
            denuncias2011.set("Viernes", lstDatosViernes2011.size());
            denuncias2011.set("Sabado", lstDatosSabado2011.size());
            denuncias2011.set("Domingo", lstDatosDomingo2011.size());

            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            ChartSeries denuncias2012 = new ChartSeries();
            denuncias2012.setLabel("Denuncias 2012");
            denuncias2012.set("Lunes", lstDatosLunes2012.size());
            denuncias2012.set("Martes", lstDatosMartes2012.size());
            denuncias2012.set("Miercoles", lstDatosMiercoles2012.size());
            denuncias2012.set("Jueves", lstDatosJueves2012.size());
            denuncias2012.set("Viernes", lstDatosViernes2012.size());
            denuncias2012.set("Sabado", lstDatosSabado2012.size());
            denuncias2012.set("Domingo", lstDatosDomingo2012.size());

            model.addSeries(denuncias2010);
            model.addSeries(denuncias2011);
            model.addSeries(denuncias2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public ControladorContrastesDiaAgresion() {
        this.reinit();
    }

    private PieChartModel graficaPieLunes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosLunes2010.size());
            semana.set("2011", lstDatosLunes2011.size());
            semana.set("2012", lstDatosLunes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initLunes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");

            lunes.set("2010", lstDatosLunes2010.size());
            lunes.set("2011", lstDatosLunes2011.size());
            lunes.set("2012", lstDatosLunes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieMartes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosLunes2010.size());
            semana.set("2011", lstDatosLunes2011.size());
            semana.set("2012", lstDatosLunes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initMartes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieMiercoles() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosMiercoles2010.size());
            semana.set("2011", lstDatosMiercoles2011.size());
            semana.set("2012", lstDatosMiercoles2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initMiercoles() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieJueves() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosJueves2010.size());
            semana.set("2011", lstDatosJueves2011.size());
            semana.set("2012", lstDatosJueves2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initJueves() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieViernes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosViernes2010.size());
            semana.set("2011", lstDatosViernes2011.size());
            semana.set("2012", lstDatosViernes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initViernes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieSabado() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");

            semana = new PieChartModel();
            semana.set("2010", lstDatosSabado2010.size());
            semana.set("2011", lstDatosSabado2011.size());
            semana.set("2012", lstDatosSabado2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initSabado() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieDomingo() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            semana = new PieChartModel();
            semana.set("2010", lstDatosDomingo2010.size());
            semana.set("2011", lstDatosDomingo2011.size());
            semana.set("2012", lstDatosDomingo2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initDomingo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initLunesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Masculino");
            lstDatosLunes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosLunes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosLunes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lunes.set("2010", lstDatosLunes2010M.size());
            lunes.set("2011", lstDatosLunes2011M.size());
            lunes.set("2012", lstDatosLunes2012M.size());

            ChartSeries lunesF = new ChartSeries();
            lunesF.setLabel("Femenino");
            lstDatosLunes2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosLunes2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosLunes2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lunesF.set("2010", lstDatosLunes2010F.size());
            lunesF.set("2011", lstDatosLunes2011F.size());
            lunesF.set("2012", lstDatosLunes2012F.size());

            model.addSeries(lunesF);
            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initMartesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Martes = new ChartSeries();
            Martes.setLabel("Masculino");
            lstDatosMartes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMartes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMartes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            Martes.set("2010", lstDatosMartes2010M.size());
            Martes.set("2011", lstDatosMartes2011M.size());
            Martes.set("2012", lstDatosMartes2012M.size());

            ChartSeries MartesF = new ChartSeries();
            MartesF.setLabel("Femenino");
            lstDatosMartes2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMartes2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMartes2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            MartesF.set("2010", lstDatosMartes2010F.size());
            MartesF.set("2011", lstDatosMartes2011F.size());
            MartesF.set("2012", lstDatosMartes2012F.size());

            model.addSeries(MartesF);
            model.addSeries(Martes);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initMiercolesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Miercoles = new ChartSeries();
            Miercoles.setLabel("Masculino");
            lstDatosMiercoles2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosMiercoles2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosMiercoles2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            Miercoles.set("2010", lstDatosMiercoles2010M.size());
            Miercoles.set("2011", lstDatosMiercoles2011M.size());
            Miercoles.set("2012", lstDatosMiercoles2012M.size());

            ChartSeries MiercolesF = new ChartSeries();
            MiercolesF.setLabel("Femenino");
            lstDatosMiercoles2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosMiercoles2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosMiercoles2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            MiercolesF.set("2010", lstDatosMiercoles2010F.size());
            MiercolesF.set("2011", lstDatosMiercoles2011F.size());
            MiercolesF.set("2012", lstDatosMiercoles2012F.size());

            model.addSeries(MiercolesF);
            model.addSeries(Miercoles);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initJuevesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Jueves = new ChartSeries();
            Jueves.setLabel("Masculino");
            lstDatosJueves2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosJueves2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosJueves2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            Jueves.set("2010", lstDatosJueves2010M.size());
            Jueves.set("2011", lstDatosJueves2011M.size());
            Jueves.set("2012", lstDatosJueves2012M.size());

            ChartSeries JuevesF = new ChartSeries();
            JuevesF.setLabel("Femenino");
            lstDatosJueves2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosJueves2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosJueves2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            JuevesF.set("2010", lstDatosJueves2010F.size());
            JuevesF.set("2011", lstDatosJueves2011F.size());
            JuevesF.set("2012", lstDatosJueves2012F.size());

            model.addSeries(JuevesF);
            model.addSeries(Jueves);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initViernesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Viernes = new ChartSeries();
            Viernes.setLabel("Masculino");
            lstDatosViernes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosViernes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosViernes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            Viernes.set("2010", lstDatosViernes2010M.size());
            Viernes.set("2011", lstDatosViernes2011M.size());
            Viernes.set("2012", lstDatosViernes2012M.size());

            ChartSeries ViernesF = new ChartSeries();
            ViernesF.setLabel("Femenino");
            lstDatosViernes2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosViernes2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosViernes2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            ViernesF.set("2010", lstDatosViernes2010F.size());
            ViernesF.set("2011", lstDatosViernes2011F.size());
            ViernesF.set("2012", lstDatosViernes2012F.size());

            model.addSeries(ViernesF);
            model.addSeries(Viernes);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initSabadoSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Sabado = new ChartSeries();
            Sabado.setLabel("Masculino");
            lstDatosSabado2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosSabado2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosSabado2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            Sabado.set("2010", lstDatosSabado2010M.size());
            Sabado.set("2011", lstDatosSabado2011M.size());
            Sabado.set("2012", lstDatosSabado2012M.size());

            ChartSeries SabadoF = new ChartSeries();
            SabadoF.setLabel("Femenino");
            lstDatosSabado2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosSabado2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosSabado2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            SabadoF.set("2010", lstDatosSabado2010F.size());
            SabadoF.set("2011", lstDatosSabado2011F.size());
            SabadoF.set("2012", lstDatosSabado2012F.size());

            model.addSeries(SabadoF);
            model.addSeries(Sabado);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initDomingoSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Domingo = new ChartSeries();
            Domingo.setLabel("Masculino");
            lstDatosDomingo2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            lstDatosDomingo2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            lstDatosDomingo2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            Domingo.set("2010", lstDatosDomingo2010M.size());
            Domingo.set("2011", lstDatosDomingo2011M.size());
            Domingo.set("2012", lstDatosDomingo2012M.size());

            ChartSeries DomingoF = new ChartSeries();
            DomingoF.setLabel("Femenino");
            lstDatosDomingo2010F = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            lstDatosDomingo2011F = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            lstDatosDomingo2012F = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            DomingoF.set("2010", lstDatosDomingo2010F.size());
            DomingoF.set("2011", lstDatosDomingo2011F.size());
            DomingoF.set("2012", lstDatosDomingo2012F.size());

            model.addSeries(DomingoF);
            model.addSeries(Domingo);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initContrasteSexoMasculino() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries masculino2010 = new ChartSeries();
            masculino2010.setLabel("2010");
            ChartSeries masculino2011 = new ChartSeries();
            masculino2011.setLabel("2011");
            ChartSeries masculino2012 = new ChartSeries();
            masculino2012.setLabel("2012");
            lstDatosLunes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosLunes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosLunes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "M");
            lstDatosMartes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMartes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMartes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "M");
            lstDatosMiercoles2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosMiercoles2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosMiercoles2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "M");
            lstDatosJueves2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosJueves2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosJueves2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "M");
            lstDatosViernes2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosViernes2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosViernes2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "M");
            lstDatosSabado2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosSabado2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosSabado2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "M");
            lstDatosDomingo2010M = FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            lstDatosDomingo2011M = FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            lstDatosDomingo2012M = FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "M");
            masculino2010.set("Lunes", lstDatosLunes2010M.size());
            masculino2011.set("Lunes", lstDatosLunes2011M.size());
            masculino2012.set("Lunes", lstDatosLunes2012M.size());
            masculino2010.set("Martes", lstDatosMartes2010M.size());
            masculino2011.set("Martes", lstDatosMartes2011M.size());
            masculino2012.set("Martes", lstDatosMartes2012M.size());
            masculino2010.set("Miercoles", lstDatosMiercoles2010M.size());
            masculino2011.set("Miercoles", lstDatosMiercoles2011M.size());
            masculino2012.set("Miercoles", lstDatosMiercoles2012M.size());
            masculino2010.set("Jueves", lstDatosJueves2010M.size());
            masculino2011.set("Jueves", lstDatosJueves2011M.size());
            masculino2012.set("Jueves", lstDatosJueves2012M.size());
            masculino2010.set("Viernes", lstDatosViernes2010M.size());
            masculino2011.set("Viernes", lstDatosViernes2011M.size());
            masculino2012.set("Viernes", lstDatosViernes2012M.size());
            masculino2010.set("Sabado", lstDatosSabado2010M.size());
            masculino2011.set("Sabado", lstDatosSabado2011M.size());
            masculino2012.set("Sabado", lstDatosSabado2012M.size());
            masculino2010.set("Domingo", lstDatosDomingo2010M.size());
            masculino2011.set("Domingo", lstDatosDomingo2011M.size());
            masculino2012.set("Domingo", lstDatosDomingo2012M.size());

            model.addSeries(masculino2010);
            model.addSeries(masculino2011);
            model.addSeries(masculino2012);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel initContrasteSexoFemenino() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries Femenino2010 = new ChartSeries();
            Femenino2010.setLabel("2010");
            ChartSeries Femenino2011 = new ChartSeries();
            Femenino2011.setLabel("2011");
            ChartSeries Femenino2012 = new ChartSeries();
            Femenino2012.setLabel("2012");
            lstDatosLunes2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosLunes2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosLunes2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("LUNES", "F");
            lstDatosMartes2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMartes2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMartes2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MARTES", "F");
            lstDatosMiercoles2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosMiercoles2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosMiercoles2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("MIERCOLES", "F");
            lstDatosJueves2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosJueves2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosJueves2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("JUEVES", "F");
            lstDatosViernes2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosViernes2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosViernes2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("VIERNES", "F");
            lstDatosSabado2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosSabado2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosSabado2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("SABADO", "F");
            lstDatosDomingo2010F=FVif_2010.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            lstDatosDomingo2011F=FVif_2011.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            lstDatosDomingo2012F=FVif_2012.ObtenerDatosDadoDiaAgresionSexoVictima("DOMINGO", "F");
            Femenino2010.set("Lunes", lstDatosLunes2010F.size());
            Femenino2011.set("Lunes", lstDatosLunes2011F.size());
            Femenino2012.set("Lunes", lstDatosLunes2012F.size());
            Femenino2010.set("Martes", lstDatosMartes2010F.size());
            Femenino2011.set("Martes", lstDatosMartes2011F.size());
            Femenino2012.set("Martes", lstDatosMartes2012F.size());
            Femenino2010.set("Miercoles", lstDatosMiercoles2010F.size());
            Femenino2011.set("Miercoles", lstDatosMiercoles2011F.size());
            Femenino2012.set("Miercoles", lstDatosMiercoles2012F.size());
            Femenino2010.set("Jueves", lstDatosJueves2010F.size());
            Femenino2011.set("Jueves", lstDatosJueves2011F.size());
            Femenino2012.set("Jueves", lstDatosJueves2012F.size());
            Femenino2010.set("Viernes", lstDatosViernes2010F.size());
            Femenino2011.set("Viernes", lstDatosViernes2011F.size());
            Femenino2012.set("Viernes", lstDatosViernes2012F.size());
            Femenino2010.set("Sabado", lstDatosSabado2010F.size());
            Femenino2011.set("Sabado", lstDatosSabado2011F.size());
            Femenino2012.set("Sabado", lstDatosSabado2012F.size());
            Femenino2010.set("Domingo", lstDatosDomingo2010F.size());
            Femenino2011.set("Domingo", lstDatosDomingo2011F.size());
            Femenino2012.set("Domingo", lstDatosDomingo2012F.size());

            model.addSeries(Femenino2010);
            model.addSeries(Femenino2011);
            model.addSeries(Femenino2012);

        } catch (Exception e) {
        }
        return model;
    }
    
    
}
