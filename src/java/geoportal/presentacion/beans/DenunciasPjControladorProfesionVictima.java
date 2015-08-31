/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.DenunciasPj;
import geoportal.logica.funciones.FDenunciasPj;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class DenunciasPjControladorProfesionVictima {

    /**
     * Creates a new instance of DenunciasPjControladorProfesionVictima
     */
    private CartesianChartModel graficaProfesionVictima2014;
    private CartesianChartModel graficaProfesionVictima2015;
    private ArrayList<DenunciasPj> lstDatosQueHaceresDomesticos2014;
    private ArrayList<DenunciasPj> lstDatosComerciante2014;
    private ArrayList<DenunciasPj> lstDatosEmpleadoPrivado2014;
    private ArrayList<DenunciasPj> lstDatosEmpleadoPublico2014;
    private ArrayList<DenunciasPj> lstDatosEstudiantes2014;
    private ArrayList<DenunciasPj> lstDatosTrabajadora2014;
    private ArrayList<DenunciasPj> lstDatosJubilado2014;
    private ArrayList<DenunciasPj> lstDatosDesempleado2014;
    private ArrayList<DenunciasPj> lstDatosProfesional2014;

    private ArrayList<DenunciasPj> lstDatosQueHaceresDomesticos2015;
    private ArrayList<DenunciasPj> lstDatosComerciante2015;
    private ArrayList<DenunciasPj> lstDatosEmpleadoPrivado2015;
    private ArrayList<DenunciasPj> lstDatosEmpleadoPublico2015;
    private ArrayList<DenunciasPj> lstDatosEstudiantes2015;
    private ArrayList<DenunciasPj> lstDatosTrabajadora2015;
    private ArrayList<DenunciasPj> lstDatosJubilado2015;
    private ArrayList<DenunciasPj> lstDatosDesempleado2015;
    private ArrayList<DenunciasPj> lstDatosProfesional2015;

    public CartesianChartModel getGraficaProfesionVictima2014() {
        return graficaProfesionVictima2014;
    }

    public void setGraficaProfesionVictima2014(CartesianChartModel graficaProfesionVictima2014) {
        this.graficaProfesionVictima2014 = graficaProfesionVictima2014;
    }

    public CartesianChartModel getGraficaProfesionVictima2015() {
        return graficaProfesionVictima2015;
    }

    public void setGraficaProfesionVictima2015(CartesianChartModel graficaProfesionVictima2015) {
        this.graficaProfesionVictima2015 = graficaProfesionVictima2015;
    }

    public ArrayList<DenunciasPj> getLstDatosQueHaceresDomesticos2014() {
        return lstDatosQueHaceresDomesticos2014;
    }

    public void setLstDatosQueHaceresDomesticos2014(ArrayList<DenunciasPj> lstDatosQueHaceresDomesticos2014) {
        this.lstDatosQueHaceresDomesticos2014 = lstDatosQueHaceresDomesticos2014;
    }

    public ArrayList<DenunciasPj> getLstDatosComerciante2014() {
        return lstDatosComerciante2014;
    }

    public void setLstDatosComerciante2014(ArrayList<DenunciasPj> lstDatosComerciante2014) {
        this.lstDatosComerciante2014 = lstDatosComerciante2014;
    }

    public ArrayList<DenunciasPj> getLstDatosEmpleadoPrivado2014() {
        return lstDatosEmpleadoPrivado2014;
    }

    public void setLstDatosEmpleadoPrivado2014(ArrayList<DenunciasPj> lstDatosEmpleadoPrivado2014) {
        this.lstDatosEmpleadoPrivado2014 = lstDatosEmpleadoPrivado2014;
    }

    public ArrayList<DenunciasPj> getLstDatosEmpleadoPublico2014() {
        return lstDatosEmpleadoPublico2014;
    }

    public void setLstDatosEmpleadoPublico2014(ArrayList<DenunciasPj> lstDatosEmpleadoPublico2014) {
        this.lstDatosEmpleadoPublico2014 = lstDatosEmpleadoPublico2014;
    }

    public ArrayList<DenunciasPj> getLstDatosEstudiantes2014() {
        return lstDatosEstudiantes2014;
    }

    public void setLstDatosEstudiantes2014(ArrayList<DenunciasPj> lstDatosEstudiantes2014) {
        this.lstDatosEstudiantes2014 = lstDatosEstudiantes2014;
    }

    public ArrayList<DenunciasPj> getLstDatosTrabajadora2014() {
        return lstDatosTrabajadora2014;
    }

    public void setLstDatosTrabajadora2014(ArrayList<DenunciasPj> lstDatosTrabajadora2014) {
        this.lstDatosTrabajadora2014 = lstDatosTrabajadora2014;
    }

    public ArrayList<DenunciasPj> getLstDatosJubilado2014() {
        return lstDatosJubilado2014;
    }

    public void setLstDatosJubilado2014(ArrayList<DenunciasPj> lstDatosJubilado2014) {
        this.lstDatosJubilado2014 = lstDatosJubilado2014;
    }

    public ArrayList<DenunciasPj> getLstDatosDesempleado2014() {
        return lstDatosDesempleado2014;
    }

    public void setLstDatosDesempleado2014(ArrayList<DenunciasPj> lstDatosDesempleado2014) {
        this.lstDatosDesempleado2014 = lstDatosDesempleado2014;
    }

    public ArrayList<DenunciasPj> getLstDatosProfesional2014() {
        return lstDatosProfesional2014;
    }

    public void setLstDatosProfesional2014(ArrayList<DenunciasPj> lstDatosProfesional2014) {
        this.lstDatosProfesional2014 = lstDatosProfesional2014;
    }

    public ArrayList<DenunciasPj> getLstDatosQueHaceresDomesticos2015() {
        return lstDatosQueHaceresDomesticos2015;
    }

    public void setLstDatosQueHaceresDomesticos2015(ArrayList<DenunciasPj> lstDatosQueHaceresDomesticos2015) {
        this.lstDatosQueHaceresDomesticos2015 = lstDatosQueHaceresDomesticos2015;
    }

    public ArrayList<DenunciasPj> getLstDatosComerciante2015() {
        return lstDatosComerciante2015;
    }

    public void setLstDatosComerciante2015(ArrayList<DenunciasPj> lstDatosComerciante2015) {
        this.lstDatosComerciante2015 = lstDatosComerciante2015;
    }

    public ArrayList<DenunciasPj> getLstDatosEmpleadoPrivado2015() {
        return lstDatosEmpleadoPrivado2015;
    }

    public void setLstDatosEmpleadoPrivado2015(ArrayList<DenunciasPj> lstDatosEmpleadoPrivado2015) {
        this.lstDatosEmpleadoPrivado2015 = lstDatosEmpleadoPrivado2015;
    }

    public ArrayList<DenunciasPj> getLstDatosEmpleadoPublico2015() {
        return lstDatosEmpleadoPublico2015;
    }

    public void setLstDatosEmpleadoPublico2015(ArrayList<DenunciasPj> lstDatosEmpleadoPublico2015) {
        this.lstDatosEmpleadoPublico2015 = lstDatosEmpleadoPublico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosEstudiantes2015() {
        return lstDatosEstudiantes2015;
    }

    public void setLstDatosEstudiantes2015(ArrayList<DenunciasPj> lstDatosEstudiantes2015) {
        this.lstDatosEstudiantes2015 = lstDatosEstudiantes2015;
    }

    public ArrayList<DenunciasPj> getLstDatosTrabajadora2015() {
        return lstDatosTrabajadora2015;
    }

    public void setLstDatosTrabajadora2015(ArrayList<DenunciasPj> lstDatosTrabajadora2015) {
        this.lstDatosTrabajadora2015 = lstDatosTrabajadora2015;
    }

    public ArrayList<DenunciasPj> getLstDatosJubilado2015() {
        return lstDatosJubilado2015;
    }

    public void setLstDatosJubilado2015(ArrayList<DenunciasPj> lstDatosJubilado2015) {
        this.lstDatosJubilado2015 = lstDatosJubilado2015;
    }

    public ArrayList<DenunciasPj> getLstDatosDesempleado2015() {
        return lstDatosDesempleado2015;
    }

    public void setLstDatosDesempleado2015(ArrayList<DenunciasPj> lstDatosDesempleado2015) {
        this.lstDatosDesempleado2015 = lstDatosDesempleado2015;
    }

    public ArrayList<DenunciasPj> getLstDatosProfesional2015() {
        return lstDatosProfesional2015;
    }

    public void setLstDatosProfesional2015(ArrayList<DenunciasPj> lstDatosProfesional2015) {
        this.lstDatosProfesional2015 = lstDatosProfesional2015;
    }

    public DenunciasPjControladorProfesionVictima() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante2014 = new ArrayList<DenunciasPj>();
        this.lstDatosEmpleadoPrivado2014 = new ArrayList<DenunciasPj>();
        this.lstDatosEmpleadoPublico2014 = new ArrayList<DenunciasPj>();
        this.lstDatosEstudiantes2014 = new ArrayList<DenunciasPj>();
        this.lstDatosTrabajadora2014 = new ArrayList<DenunciasPj>();
        this.lstDatosJubilado2014 = new ArrayList<DenunciasPj>();
        this.lstDatosDesempleado2014 = new ArrayList<DenunciasPj>();
        this.lstDatosProfesional2014 = new ArrayList<DenunciasPj>();
        this.lstDatosQueHaceresDomesticos2014 = new ArrayList<DenunciasPj>();
        
        this.lstDatosComerciante2015 = new ArrayList<DenunciasPj>();
        this.lstDatosEmpleadoPrivado2015 = new ArrayList<DenunciasPj>();
        this.lstDatosEmpleadoPublico2015 = new ArrayList<DenunciasPj>();
        this.lstDatosEstudiantes2015 = new ArrayList<DenunciasPj>();
        this.lstDatosTrabajadora2015 = new ArrayList<DenunciasPj>();
        this.lstDatosJubilado2015 = new ArrayList<DenunciasPj>();
        this.lstDatosDesempleado2015 = new ArrayList<DenunciasPj>();
        this.lstDatosProfesional2015 = new ArrayList<DenunciasPj>();
        this.lstDatosQueHaceresDomesticos2015 = new ArrayList<DenunciasPj>();

        this.init();

    }

    public void graficar() {
        graficaProfesionVictima2014 = initCategoryOcupacionVictima2014();
        graficaProfesionVictima2015=initCategoryOcupacionVictima2015();
    }

    private CartesianChartModel initCategoryOcupacionVictima2014() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosComerciante2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioComerciante(2014);
            lstDatosEmpleadoPrivado2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEmpleadoPrivado(2014);
            lstDatosEmpleadoPublico2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEmpleadoPublico(2014);
            lstDatosEstudiantes2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEstudiante(2014);
            lstDatosTrabajadora2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioTrabajadora(2014);
            lstDatosJubilado2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioJubilado(2014);
            lstDatosDesempleado2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioDesempleado(2014);
            lstDatosProfesional2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioProfesional(2014);
            lstDatosQueHaceresDomesticos2014 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioQueHaceres(2014);
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante2014.size());
            Ocupacion.set("Empleado Privado", lstDatosEmpleadoPrivado2014.size());
            Ocupacion.set("Empleado Público", lstDatosEmpleadoPublico2014.size());
            Ocupacion.set("Estudiante", lstDatosEstudiantes2014.size());
            
            Ocupacion.set("Jubilado", lstDatosJubilado2014.size());
            Ocupacion.set("Desempleado", lstDatosDesempleado2014.size());
            Ocupacion.set("Profesional", lstDatosProfesional2014.size());
            Ocupacion.set("Que haceres domesticos", lstDatosQueHaceresDomesticos2014.size());
            Ocupacion.set("Trabajadora Sexual", lstDatosTrabajadora2014.size());

            model.addSeries(Ocupacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel initCategoryOcupacionVictima2015() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosComerciante2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioComerciante(2015);
            lstDatosEmpleadoPrivado2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEmpleadoPrivado(2015);
            lstDatosEmpleadoPublico2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEmpleadoPublico(2015);
            lstDatosEstudiantes2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioEstudiante(2015);
            lstDatosTrabajadora2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioTrabajadora(2015);
            lstDatosJubilado2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioJubilado(2015);
            lstDatosDesempleado2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioDesempleado(2015);
            lstDatosProfesional2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioProfesional(2015);
            lstDatosQueHaceresDomesticos2015 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioQueHaceres(2015);
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante2015.size());
            Ocupacion.set("Empleado Privado", lstDatosEmpleadoPrivado2015.size());
            Ocupacion.set("Empleado Público", lstDatosEmpleadoPublico2015.size());
            Ocupacion.set("Estudiante", lstDatosEstudiantes2015.size());            
            Ocupacion.set("Jubilado", lstDatosJubilado2015.size());
            Ocupacion.set("Desempleado", lstDatosDesempleado2015.size());
            Ocupacion.set("Profesional", lstDatosProfesional2015.size());
            Ocupacion.set("Que haceres domesticos", lstDatosQueHaceresDomesticos2015.size());
            Ocupacion.set("Trabajadora Sexual", lstDatosTrabajadora2015.size());

            model.addSeries(Ocupacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
