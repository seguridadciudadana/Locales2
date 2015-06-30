/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
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
public class Vif_2011ControladorOcupacionVictima {
    private CartesianChartModel graficaOcupacionVictima;
    private ArrayList<Vif_2011> lstDatosQueHaceresDomesticos;
    private ArrayList<Vif_2011> lstDatosComerciante;
    private ArrayList<Vif_2011> lstDatosEmpleadoPrivado;
    private ArrayList<Vif_2011> lstDatosEmpleadoPublico;
    private ArrayList<Vif_2011> lstDatosEstudiantes;
    private ArrayList<Vif_2011> lstDatosJornalero;
    private ArrayList<Vif_2011> lstDatosJubilado;
    private ArrayList<Vif_2011> lstDatosNa;
    private ArrayList<Vif_2011> lstDatosProfesional;
    private ArrayList<Vif_2011> lstDatosDesempleado;

    public CartesianChartModel getGraficaOcupacionVictima() {
        return graficaOcupacionVictima;
    }

    public void setGraficaOcupacionVictima(CartesianChartModel graficaOcupacionVictima) {
        this.graficaOcupacionVictima = graficaOcupacionVictima;
    }

    public ArrayList<Vif_2011> getLstDatosQueHaceresDomesticos() {
        return lstDatosQueHaceresDomesticos;
    }

    public void setLstDatosQueHaceresDomesticos(ArrayList<Vif_2011> lstDatosQueHaceresDomesticos) {
        this.lstDatosQueHaceresDomesticos = lstDatosQueHaceresDomesticos;
    }

    public ArrayList<Vif_2011> getLstDatosComerciante() {
        return lstDatosComerciante;
    }

    public void setLstDatosComerciante(ArrayList<Vif_2011> lstDatosComerciante) {
        this.lstDatosComerciante = lstDatosComerciante;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPrivado() {
        return lstDatosEmpleadoPrivado;
    }

    public void setLstDatosEmpleadoPrivado(ArrayList<Vif_2011> lstDatosEmpleadoPrivado) {
        this.lstDatosEmpleadoPrivado = lstDatosEmpleadoPrivado;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPublico() {
        return lstDatosEmpleadoPublico;
    }

    public void setLstDatosEmpleadoPublico(ArrayList<Vif_2011> lstDatosEmpleadoPublico) {
        this.lstDatosEmpleadoPublico = lstDatosEmpleadoPublico;
    }

    public ArrayList<Vif_2011> getLstDatosEstudiantes() {
        return lstDatosEstudiantes;
    }

    public void setLstDatosEstudiantes(ArrayList<Vif_2011> lstDatosEstudiantes) {
        this.lstDatosEstudiantes = lstDatosEstudiantes;
    }

    public ArrayList<Vif_2011> getLstDatosJornalero() {
        return lstDatosJornalero;
    }

    public void setLstDatosJornalero(ArrayList<Vif_2011> lstDatosJornalero) {
        this.lstDatosJornalero = lstDatosJornalero;
    }

    public ArrayList<Vif_2011> getLstDatosJubilado() {
        return lstDatosJubilado;
    }

    public void setLstDatosJubilado(ArrayList<Vif_2011> lstDatosJubilado) {
        this.lstDatosJubilado = lstDatosJubilado;
    }

    public ArrayList<Vif_2011> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2011> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public ArrayList<Vif_2011> getLstDatosProfesional() {
        return lstDatosProfesional;
    }

    public void setLstDatosProfesional(ArrayList<Vif_2011> lstDatosProfesional) {
        this.lstDatosProfesional = lstDatosProfesional;
    }

    public ArrayList<Vif_2011> getLstDatosDesempleado() {
        return lstDatosDesempleado;
    }

    public void setLstDatosDesempleado(ArrayList<Vif_2011> lstDatosDesempleado) {
        this.lstDatosDesempleado = lstDatosDesempleado;
    }

    public Vif_2011ControladorOcupacionVictima() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante = new ArrayList<Vif_2011>();
        this.lstDatosEmpleadoPrivado = new ArrayList<Vif_2011>();
        this.lstDatosEmpleadoPublico = new ArrayList<Vif_2011>();
        this.lstDatosEstudiantes = new ArrayList<Vif_2011>();
        this.lstDatosJornalero = new ArrayList<Vif_2011>();
        this.lstDatosJubilado = new ArrayList<Vif_2011>();
        this.lstDatosNa = new ArrayList<Vif_2011>();
        this.lstDatosProfesional = new ArrayList<Vif_2011>();
        this.lstDatosQueHaceresDomesticos = new ArrayList<Vif_2011>();
        this.lstDatosDesempleado = new ArrayList<Vif_2011>();

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
            lstDatosComerciante = FVif_2011.ObtenerDatosVictimaComerciante();
            lstDatosDesempleado = FVif_2011.ObtenerDatosVictimaDesempleado();
            lstDatosEmpleadoPrivado = FVif_2011.ObtenerDatosVictimaEmpleadoPrivado();
            lstDatosEmpleadoPublico = FVif_2011.ObtenerDatosVictimaEmpleadoPublico();
            lstDatosEstudiantes = FVif_2011.ObtenerDatosVictimaEstudiantes();
            lstDatosJornalero = FVif_2011.ObtenerDatosVictimaJornalero();
            lstDatosJubilado = FVif_2011.ObtenerDatosVictimaJubilado();
            lstDatosNa = FVif_2011.ObtenerDatosVictimaNA();
            lstDatosProfesional = FVif_2011.ObtenerDatosVictimaProfesional();
            lstDatosQueHaceresDomesticos = FVif_2011.ObtenerDatosVictimaQueHaceres();
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante.size());
            Ocupacion.set("Desempleado", lstDatosDesempleado.size());
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
