/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
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
public class Vif_2010ControladorOcupacionVictima {

    private CartesianChartModel graficaOcupacionVictima;
    private ArrayList<Vif_2010> lstDatosQueHaceresDomesticos;
    private ArrayList<Vif_2010> lstDatosComerciante;
    private ArrayList<Vif_2010> lstDatosEmpleadoPrivado;
    private ArrayList<Vif_2010> lstDatosEmpleadoPublico;
    private ArrayList<Vif_2010> lstDatosEstudiantes;
    private ArrayList<Vif_2010> lstDatosJornalero;
    private ArrayList<Vif_2010> lstDatosJubilado;
    private ArrayList<Vif_2010> lstDatosNa;
    private ArrayList<Vif_2010> lstDatosProfesional;

    public ArrayList<Vif_2010> getLstDatosProfesional() {
        return lstDatosProfesional;
    }

    public void setLstDatosProfesional(ArrayList<Vif_2010> lstDatosProfesional) {
        this.lstDatosProfesional = lstDatosProfesional;
    }

    public CartesianChartModel getGraficaOcupacionVictima() {
        return graficaOcupacionVictima;
    }

    public void setGraficaOcupacionVictima(CartesianChartModel graficaOcupacionVictima) {
        this.graficaOcupacionVictima = graficaOcupacionVictima;
    }

    public ArrayList<Vif_2010> getLstDatosQueHaceresDomesticos() {
        return lstDatosQueHaceresDomesticos;
    }

    public void setLstDatosQueHaceresDomesticos(ArrayList<Vif_2010> lstDatosQueHaceresDomesticos) {
        this.lstDatosQueHaceresDomesticos = lstDatosQueHaceresDomesticos;
    }

    public ArrayList<Vif_2010> getLstDatosComerciante() {
        return lstDatosComerciante;
    }

    public void setLstDatosComerciante(ArrayList<Vif_2010> lstDatosComerciante) {
        this.lstDatosComerciante = lstDatosComerciante;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPrivado() {
        return lstDatosEmpleadoPrivado;
    }

    public void setLstDatosEmpleadoPrivado(ArrayList<Vif_2010> lstDatosEmpleadoPrivado) {
        this.lstDatosEmpleadoPrivado = lstDatosEmpleadoPrivado;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPublico() {
        return lstDatosEmpleadoPublico;
    }

    public void setLstDatosEmpleadoPublico(ArrayList<Vif_2010> lstDatosEmpleadoPublico) {
        this.lstDatosEmpleadoPublico = lstDatosEmpleadoPublico;
    }

    public ArrayList<Vif_2010> getLstDatosEstudiantes() {
        return lstDatosEstudiantes;
    }

    public void setLstDatosEstudiantes(ArrayList<Vif_2010> lstDatosEstudiantes) {
        this.lstDatosEstudiantes = lstDatosEstudiantes;
    }

    public ArrayList<Vif_2010> getLstDatosJornalero() {
        return lstDatosJornalero;
    }

    public void setLstDatosJornalero(ArrayList<Vif_2010> lstDatosJornalero) {
        this.lstDatosJornalero = lstDatosJornalero;
    }

    public ArrayList<Vif_2010> getLstDatosJubilado() {
        return lstDatosJubilado;
    }

    public void setLstDatosJubilado(ArrayList<Vif_2010> lstDatosJubilado) {
        this.lstDatosJubilado = lstDatosJubilado;
    }

    public ArrayList<Vif_2010> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2010> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public Vif_2010ControladorOcupacionVictima() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante = new ArrayList<Vif_2010>();
        this.lstDatosEmpleadoPrivado = new ArrayList<Vif_2010>();
        this.lstDatosEmpleadoPublico = new ArrayList<Vif_2010>();
        this.lstDatosEstudiantes = new ArrayList<Vif_2010>();
        this.lstDatosJornalero = new ArrayList<Vif_2010>();
        this.lstDatosJubilado = new ArrayList<Vif_2010>();
        this.lstDatosNa = new ArrayList<Vif_2010>();
        this.lstDatosProfesional = new ArrayList<Vif_2010>();
        this.lstDatosQueHaceresDomesticos = new ArrayList<Vif_2010>();

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
            lstDatosComerciante = FVif_2010.ObtenerDatosVictimaCasados();
            lstDatosEmpleadoPrivado = FVif_2010.ObtenerDatosVictimaDivorciado();
            lstDatosEmpleadoPublico = FVif_2010.ObtenerDatosVictimaNa();
            lstDatosEstudiantes = FVif_2010.ObtenerDatosVictimaSoltero();
            lstDatosJornalero = FVif_2010.ObtenerDatosVictimaUnionHecho();
            lstDatosJubilado = FVif_2010.ObtenerDatosVictimaUnionLibre();
            lstDatosNa = FVif_2010.ObtenerDatosVictimaViudo();
            lstDatosProfesional = FVif_2010.ObtenerDatosVictimaProfesional();
            lstDatosQueHaceresDomesticos = FVif_2010.ObtenerDatosVictimaViudo();
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante.size());
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
