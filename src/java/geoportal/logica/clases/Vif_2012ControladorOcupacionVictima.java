/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

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
 * @author servidor
     */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorOcupacionVictima {
    private CartesianChartModel graficaOcupacionVictima;
    private ArrayList<Vif_2012> lstDatosQueHaceresDomesticos;
    private ArrayList<Vif_2012> lstDatosComerciante;
    private ArrayList<Vif_2012> lstDatosEmpleadoPrivado;
    private ArrayList<Vif_2012> lstDatosEmpleadoPublico;
    private ArrayList<Vif_2012> lstDatosEstudiantes;
    private ArrayList<Vif_2012> lstDatosJornalero;
    private ArrayList<Vif_2012> lstDatosJubilado;
    private ArrayList<Vif_2012> lstDatosNa;
    private ArrayList<Vif_2012> lstDatosProfesional;
    private ArrayList<Vif_2012> lstDatosDesempleado;
    private ArrayList<Vif_2012> lstDatosDiscapacitado;

    public CartesianChartModel getGraficaOcupacionVictima() {
        return graficaOcupacionVictima;
    }

    public void setGraficaOcupacionVictima(CartesianChartModel graficaOcupacionVictima) {
        this.graficaOcupacionVictima = graficaOcupacionVictima;
    }

    public ArrayList<Vif_2012> getLstDatosQueHaceresDomesticos() {
        return lstDatosQueHaceresDomesticos;
    }

    public void setLstDatosQueHaceresDomesticos(ArrayList<Vif_2012> lstDatosQueHaceresDomesticos) {
        this.lstDatosQueHaceresDomesticos = lstDatosQueHaceresDomesticos;
    }

    public ArrayList<Vif_2012> getLstDatosComerciante() {
        return lstDatosComerciante;
    }

    public void setLstDatosComerciante(ArrayList<Vif_2012> lstDatosComerciante) {
        this.lstDatosComerciante = lstDatosComerciante;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPrivado() {
        return lstDatosEmpleadoPrivado;
    }

    public void setLstDatosEmpleadoPrivado(ArrayList<Vif_2012> lstDatosEmpleadoPrivado) {
        this.lstDatosEmpleadoPrivado = lstDatosEmpleadoPrivado;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPublico() {
        return lstDatosEmpleadoPublico;
    }

    public void setLstDatosEmpleadoPublico(ArrayList<Vif_2012> lstDatosEmpleadoPublico) {
        this.lstDatosEmpleadoPublico = lstDatosEmpleadoPublico;
    }

    public ArrayList<Vif_2012> getLstDatosEstudiantes() {
        return lstDatosEstudiantes;
    }

    public void setLstDatosEstudiantes(ArrayList<Vif_2012> lstDatosEstudiantes) {
        this.lstDatosEstudiantes = lstDatosEstudiantes;
    }

    public ArrayList<Vif_2012> getLstDatosJornalero() {
        return lstDatosJornalero;
    }

    public void setLstDatosJornalero(ArrayList<Vif_2012> lstDatosJornalero) {
        this.lstDatosJornalero = lstDatosJornalero;
    }

    public ArrayList<Vif_2012> getLstDatosJubilado() {
        return lstDatosJubilado;
    }

    public void setLstDatosJubilado(ArrayList<Vif_2012> lstDatosJubilado) {
        this.lstDatosJubilado = lstDatosJubilado;
    }

    public ArrayList<Vif_2012> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2012> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public ArrayList<Vif_2012> getLstDatosProfesional() {
        return lstDatosProfesional;
    }

    public void setLstDatosProfesional(ArrayList<Vif_2012> lstDatosProfesional) {
        this.lstDatosProfesional = lstDatosProfesional;
    }

    public ArrayList<Vif_2012> getLstDatosDesempleado() {
        return lstDatosDesempleado;
    }

    public void setLstDatosDesempleado(ArrayList<Vif_2012> lstDatosDesempleado) {
        this.lstDatosDesempleado = lstDatosDesempleado;
    }

    public ArrayList<Vif_2012> getLstDatosDiscapacitado() {
        return lstDatosDiscapacitado;
    }

    public void setLstDatosDiscapacitado(ArrayList<Vif_2012> lstDatosDiscapacitado) {
        this.lstDatosDiscapacitado = lstDatosDiscapacitado;
    }

    public Vif_2012ControladorOcupacionVictima() {
        reinit();
    }
    
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante = new ArrayList<Vif_2012>();
        this.lstDatosEmpleadoPrivado = new ArrayList<Vif_2012>();
        this.lstDatosEmpleadoPublico = new ArrayList<Vif_2012>();
        this.lstDatosEstudiantes = new ArrayList<Vif_2012>();
        this.lstDatosJornalero = new ArrayList<Vif_2012>();
        this.lstDatosJubilado = new ArrayList<Vif_2012>();
        this.lstDatosNa = new ArrayList<Vif_2012>();
        this.lstDatosProfesional = new ArrayList<Vif_2012>();
        this.lstDatosQueHaceresDomesticos = new ArrayList<Vif_2012>();
        this.lstDatosDesempleado = new ArrayList<Vif_2012>();
        this.lstDatosDiscapacitado = new ArrayList<Vif_2012>();

        this.init();

    }

    public void graficar() {
        graficaOcupacionVictima = initCategoryOcupacionVictima();
        // lineModel2 = initCategoryCircuito();
        //pieModel = graficaDenunciasCircuito();
    }

    /**
     *
     */
    private CartesianChartModel initCategoryOcupacionVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosComerciante = FVif_2012.ObtenerDatosVictimaComerciante();
            lstDatosDesempleado = FVif_2012.ObtenerDatosVictimaDesempleado();
            lstDatosDiscapacitado = FVif_2012.ObtenerDatosVictimaDiscapacitado();
            lstDatosEmpleadoPrivado = FVif_2012.ObtenerDatosVictimaEmpleadoPrivado();
            lstDatosEmpleadoPublico = FVif_2012.ObtenerDatosVictimaEmpleadoPublico();
            lstDatosEstudiantes = FVif_2012.ObtenerDatosVictimaEstudiantes();
            lstDatosJornalero = FVif_2012.ObtenerDatosVictimaJornalero();
            lstDatosJubilado = FVif_2012.ObtenerDatosVictimaJubilado();
            lstDatosNa = FVif_2012.ObtenerDatosVictimaNA();
            lstDatosProfesional = FVif_2012.ObtenerDatosVictimaProfesional();
            lstDatosQueHaceresDomesticos = FVif_2012.ObtenerDatosVictimaQueHaceres();
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante.size());
            Ocupacion.set("Desempleado", lstDatosDesempleado.size());
            Ocupacion.set("Discapacitado", lstDatosDiscapacitado.size());
            Ocupacion.set("Empleado Privado", lstDatosEmpleadoPrivado.size());
            Ocupacion.set("Empleado Público", lstDatosEmpleadoPublico.size());
            Ocupacion.set("Estudiante", lstDatosEstudiantes.size());
            Ocupacion.set("Jornalero", lstDatosJornalero.size());
            Ocupacion.set("Jubilado", lstDatosJubilado.size());
            Ocupacion.set("NA", lstDatosNa.size());
            Ocupacion.set("Profesional", lstDatosProfesional.size());
            Ocupacion.set("Que haceres domesticos", lstDatosQueHaceresDomesticos.size());
            

            model.addSeries(Ocupacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
    

}
