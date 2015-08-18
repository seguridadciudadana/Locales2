/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans.contrastes;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorContrasteDiaAnioDenunciaSexo {

    /**
     * Creates a new instance of ControladorControladorDiaDenunciaSexo
     */
    
    private CartesianChartModel diaDenuncia2010M;
    private CartesianChartModel diaDenuncia2010F;
    private CartesianChartModel diaDenuncia2011M;
    private CartesianChartModel diaDenuncia2011F;
    private CartesianChartModel diaDenuncia2012M;
    private CartesianChartModel diaDenuncia2012F;
    private ArrayList<Vif_2010> lstDatosLunes2010M;
    private ArrayList<Vif_2010> lstDatosMartes2010M;
    private ArrayList<Vif_2010> lstDatosMiercoles2010M;
    private ArrayList<Vif_2010> lstDatosJueves2010M;
    private ArrayList<Vif_2010> lstDatosViernes2010M;
    private ArrayList<Vif_2010> lstDatosSabado2010M;
    private ArrayList<Vif_2010> lstDatosDomingo2010M;
    private ArrayList<Vif_2010> lstDatosLunes2010F;
    private ArrayList<Vif_2010> lstDatosMartes2010F;
    private ArrayList<Vif_2010> lstDatosMiercoles2010F;
    private ArrayList<Vif_2010> lstDatosJueves2010F;
    private ArrayList<Vif_2010> lstDatosViernes2010F;
    private ArrayList<Vif_2010> lstDatosSabado2010F;
    private ArrayList<Vif_2010> lstDatosDomingo2010F;

    private ArrayList<Vif_2011> lstDatosLunes2011M;
    private ArrayList<Vif_2011> lstDatosMartes2011M;
    private ArrayList<Vif_2011> lstDatosMiercoles2011M;
    private ArrayList<Vif_2011> lstDatosJueves2011M;
    private ArrayList<Vif_2011> lstDatosViernes2011M;
    private ArrayList<Vif_2011> lstDatosSabado2011M;
    private ArrayList<Vif_2011> lstDatosDomingo2011M;
    private ArrayList<Vif_2011> lstDatosLunes2011F;
    private ArrayList<Vif_2011> lstDatosMartes2011F;
    private ArrayList<Vif_2011> lstDatosMiercoles2011F;
    private ArrayList<Vif_2011> lstDatosJueves2011F;
    private ArrayList<Vif_2011> lstDatosViernes2011F;
    private ArrayList<Vif_2011> lstDatosSabado2011F;
    private ArrayList<Vif_2011> lstDatosDomingo2011F;

    private ArrayList<Vif_2012> lstDatosLunes2012M;
    private ArrayList<Vif_2012> lstDatosMartes2012M;
    private ArrayList<Vif_2012> lstDatosMiercoles2012M;
    private ArrayList<Vif_2012> lstDatosJueves2012M;
    private ArrayList<Vif_2012> lstDatosViernes2012M;
    private ArrayList<Vif_2012> lstDatosSabado2012M;
    private ArrayList<Vif_2012> lstDatosDomingo2012M;
    private ArrayList<Vif_2012> lstDatosLunes2012F;
    private ArrayList<Vif_2012> lstDatosMartes2012F;
    private ArrayList<Vif_2012> lstDatosMiercoles2012F;
    private ArrayList<Vif_2012> lstDatosJueves2012F;
    private ArrayList<Vif_2012> lstDatosViernes2012F;
    private ArrayList<Vif_2012> lstDatosSabado2012F;
    private ArrayList<Vif_2012> lstDatosDomingo2012F;

    public CartesianChartModel getDiaDenuncia2010M() {
        return diaDenuncia2010M;
    }

    public void setDiaDenuncia2010M(CartesianChartModel diaDenuncia2010M) {
        this.diaDenuncia2010M = diaDenuncia2010M;
    }

    public CartesianChartModel getDiaDenuncia2010F() {
        return diaDenuncia2010F;
    }

    public void setDiaDenuncia2010F(CartesianChartModel diaDenuncia2010F) {
        this.diaDenuncia2010F = diaDenuncia2010F;
    }

    public CartesianChartModel getDiaDenuncia2011M() {
        return diaDenuncia2011M;
    }

    public void setDiaDenuncia2011M(CartesianChartModel diaDenuncia2011M) {
        this.diaDenuncia2011M = diaDenuncia2011M;
    }

    public CartesianChartModel getDiaDenuncia2011F() {
        return diaDenuncia2011F;
    }

    public void setDiaDenuncia2011F(CartesianChartModel diaDenuncia2011F) {
        this.diaDenuncia2011F = diaDenuncia2011F;
    }

    public CartesianChartModel getDiaDenuncia2012M() {
        return diaDenuncia2012M;
    }

    public void setDiaDenuncia2012M(CartesianChartModel diaDenuncia2012M) {
        this.diaDenuncia2012M = diaDenuncia2012M;
    }

    public CartesianChartModel getDiaDenuncia2012F() {
        return diaDenuncia2012F;
    }

    public void setDiaDenuncia2012F(CartesianChartModel diaDenuncia2012F) {
        this.diaDenuncia2012F = diaDenuncia2012F;
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

    
    
    public ControladorContrasteDiaAnioDenunciaSexo() {
    }

    
    
    
    
}

