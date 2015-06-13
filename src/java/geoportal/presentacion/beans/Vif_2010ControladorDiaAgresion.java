/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.PieChartModel;
import static recursos.Util.convertirStringDate;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorDiaAgresion {

    /**
     * Creates a new instance of Vif_2010ControladorDiaAgresion
     */
    private CartesianChartModel lineModelDiaDenuncia;
    private PieChartModel pieModel;
    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatosLunes;
    private ArrayList<Vif_2010> lstDatosMartes;
    private ArrayList<Vif_2010> lstDatosMiercoles;
    private ArrayList<Vif_2010> lstDatosJueves;
    private ArrayList<Vif_2010> lstDatosViernes;
    private ArrayList<Vif_2010> lstDatosSabado;
    private ArrayList<Vif_2010> lstDatosDomingo;

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public Vif_2010 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2010 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2010> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Vif_2010> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Vif_2010> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Vif_2010> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Vif_2010> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Vif_2010> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Vif_2010> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Vif_2010> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Vif_2010> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Vif_2010> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Vif_2010> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Vif_2010> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    private CartesianChartModel graficaDiaDenuncia() {
        Date fecha = null;
        String fechaString = null;
        CartesianChartModel model = new CartesianChartModel();
        int dia;
        try {
            lstDatos = FVif_2010.ObtenerDatos();
            for (int i = 0; i <= lstDatos.size(); i++) {
                fechaString = lstDatos.get(i).getFecha_agre();
                fecha = convertirStringDate(fechaString);
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(fecha);
                dia = cal.get(Calendar.DAY_OF_WEEK);
                if (dia == 1) {
                    lstDatosLunes = FVif_2010.ObtenerDatosDiaDenuncia(1);
                }
                if (dia == 1) {
                    lstDatosMartes = FVif_2012.ObtenerDatosDiaDenuncia(2);
                    lstDatosMiercoles = FVif_2012.ObtenerDatosDiaDenuncia(3);
                    lstDatosJueves = FVif_2012.ObtenerDatosDiaDenuncia(4);
                    lstDatosViernes = FVif_2012.ObtenerDatosDiaDenuncia(5);
                    lstDatosSabado = FVif_2012.ObtenerDatosDiaDenuncia(6);
                    lstDatosDomingo = FVif_2012.ObtenerDatosDiaDenuncia(0);

                }

            }
        } catch (Exception e) {
        }
        return model;
    }

    public Vif_2010ControladorDiaAgresion() {
    }

}
