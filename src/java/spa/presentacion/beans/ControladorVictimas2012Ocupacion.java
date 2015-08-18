/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2012;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012Ocupacion {

    /**
     * Creates a new instance of ControladorVictimas2012Ocupacion
     */
    private CartesianChartModel graficaOcupacionVictima;
    private ArrayList<Victimas_2012> lstDatosQueHaceresDomesticos;
    private ArrayList<Victimas_2012> lstDatosComerciante;
    private ArrayList<Victimas_2012> lstDatosEmpleadoPrivado;
    private ArrayList<Victimas_2012> lstDatosEmpleadoPublico;
    private ArrayList<Victimas_2012> lstDatosEstudiantes;
    private ArrayList<Victimas_2012> lstDatosPreso;
    private ArrayList<Victimas_2012> lstDatosNa;
    private ArrayList<Victimas_2012> lstDatosProfesional;

    public CartesianChartModel getGraficaOcupacionVictima() {
        return graficaOcupacionVictima;
    }

    public void setGraficaOcupacionVictima(CartesianChartModel graficaOcupacionVictima) {
        this.graficaOcupacionVictima = graficaOcupacionVictima;
    }

    public ArrayList<Victimas_2012> getLstDatosQueHaceresDomesticos() {
        return lstDatosQueHaceresDomesticos;
    }

    public void setLstDatosQueHaceresDomesticos(ArrayList<Victimas_2012> lstDatosQueHaceresDomesticos) {
        this.lstDatosQueHaceresDomesticos = lstDatosQueHaceresDomesticos;
    }

    public ArrayList<Victimas_2012> getLstDatosComerciante() {
        return lstDatosComerciante;
    }

    public void setLstDatosComerciante(ArrayList<Victimas_2012> lstDatosComerciante) {
        this.lstDatosComerciante = lstDatosComerciante;
    }

    public ArrayList<Victimas_2012> getLstDatosEmpleadoPrivado() {
        return lstDatosEmpleadoPrivado;
    }

    public void setLstDatosEmpleadoPrivado(ArrayList<Victimas_2012> lstDatosEmpleadoPrivado) {
        this.lstDatosEmpleadoPrivado = lstDatosEmpleadoPrivado;
    }

    public ArrayList<Victimas_2012> getLstDatosEmpleadoPublico() {
        return lstDatosEmpleadoPublico;
    }

    public void setLstDatosEmpleadoPublico(ArrayList<Victimas_2012> lstDatosEmpleadoPublico) {
        this.lstDatosEmpleadoPublico = lstDatosEmpleadoPublico;
    }

    public ArrayList<Victimas_2012> getLstDatosEstudiantes() {
        return lstDatosEstudiantes;
    }

    public void setLstDatosEstudiantes(ArrayList<Victimas_2012> lstDatosEstudiantes) {
        this.lstDatosEstudiantes = lstDatosEstudiantes;
    }

    public ArrayList<Victimas_2012> getLstDatosPreso() {
        return lstDatosPreso;
    }

    public void setLstDatosPreso(ArrayList<Victimas_2012> lstDatosPreso) {
        this.lstDatosPreso = lstDatosPreso;
    }

    public ArrayList<Victimas_2012> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Victimas_2012> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public ArrayList<Victimas_2012> getLstDatosProfesional() {
        return lstDatosProfesional;
    }

    public void setLstDatosProfesional(ArrayList<Victimas_2012> lstDatosProfesional) {
        this.lstDatosProfesional = lstDatosProfesional;
    }

    public ControladorVictimas2012Ocupacion() {
        reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante = new ArrayList<Victimas_2012>();
        this.lstDatosEmpleadoPrivado = new ArrayList<Victimas_2012>();
        this.lstDatosEmpleadoPublico = new ArrayList<Victimas_2012>();
        this.lstDatosEstudiantes = new ArrayList<Victimas_2012>();
        this.lstDatosPreso = new ArrayList<Victimas_2012>();
        this.lstDatosNa = new ArrayList<Victimas_2012>();
        this.lstDatosProfesional = new ArrayList<Victimas_2012>();
        this.lstDatosQueHaceresDomesticos = new ArrayList<Victimas_2012>();

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
            lstDatosComerciante = FVictimas_2012.ObtenerDatosComerciante();
            lstDatosEmpleadoPrivado = FVictimas_2012.ObtenerDatosEmpleadoPrivado();
            lstDatosEmpleadoPublico = FVictimas_2012.ObtenerDatosEmpleadoPublico();
            lstDatosEstudiantes = FVictimas_2012.ObtenerDatosEstudiante();
            lstDatosPreso = FVictimas_2012.ObtenerDatosPreso();
            lstDatosNa = FVictimas_2012.ObtenerDatosSinOcupacion();
            lstDatosProfesional = FVictimas_2012.ObtenerDatosProfesionales();
            lstDatosQueHaceresDomesticos = FVictimas_2012.ObtenerDatosQueHaceres();
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante.size());
            Ocupacion.set("Empleado Privado", lstDatosEmpleadoPrivado.size());
            Ocupacion.set("Empleado Público", lstDatosEmpleadoPublico.size());
            Ocupacion.set("Estudiante", lstDatosEstudiantes.size());
            Ocupacion.set("Privado de libertad", lstDatosPreso.size());
            //Ocupacion.set("T. Sexual", lstDatosTrabajadora.size());
            Ocupacion.set("Sin Ocupacion", lstDatosNa.size());
            Ocupacion.set("Profesional", lstDatosProfesional.size());
            Ocupacion.set("Que haceres domesticos", lstDatosQueHaceresDomesticos.size());

            model.addSeries(Ocupacion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
}
