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
import spa.logica.clases.Victimas_2011;
import spa.logica.funciones.FVictimas_2011;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2011OcupacionVictima {

    /**
     * Creates a new instance of ControladorVictimas2011OcupacionVictima
     */
    private CartesianChartModel graficaOcupacionVictima;
    private ArrayList<Victimas_2011> lstDatosQueHaceresDomesticos;
    private ArrayList<Victimas_2011> lstDatosComerciante;
    private ArrayList<Victimas_2011> lstDatosEmpleadoPrivado;
    private ArrayList<Victimas_2011> lstDatosEmpleadoPublico;
    private ArrayList<Victimas_2011> lstDatosEstudiantes;
    private ArrayList<Victimas_2011> lstDatosPreso;
    private ArrayList<Victimas_2011> lstDatosTrabajadora;
    private ArrayList<Victimas_2011> lstDatosNa;
    private ArrayList<Victimas_2011> lstDatosProfesional;

    public CartesianChartModel getGraficaOcupacionVictima() {
        return graficaOcupacionVictima;
    }

    public void setGraficaOcupacionVictima(CartesianChartModel graficaOcupacionVictima) {
        this.graficaOcupacionVictima = graficaOcupacionVictima;
    }

    public ArrayList<Victimas_2011> getLstDatosQueHaceresDomesticos() {
        return lstDatosQueHaceresDomesticos;
    }

    public void setLstDatosQueHaceresDomesticos(ArrayList<Victimas_2011> lstDatosQueHaceresDomesticos) {
        this.lstDatosQueHaceresDomesticos = lstDatosQueHaceresDomesticos;
    }

    public ArrayList<Victimas_2011> getLstDatosComerciante() {
        return lstDatosComerciante;
    }

    public void setLstDatosComerciante(ArrayList<Victimas_2011> lstDatosComerciante) {
        this.lstDatosComerciante = lstDatosComerciante;
    }

    public ArrayList<Victimas_2011> getLstDatosEmpleadoPrivado() {
        return lstDatosEmpleadoPrivado;
    }

    public void setLstDatosEmpleadoPrivado(ArrayList<Victimas_2011> lstDatosEmpleadoPrivado) {
        this.lstDatosEmpleadoPrivado = lstDatosEmpleadoPrivado;
    }

    public ArrayList<Victimas_2011> getLstDatosEmpleadoPublico() {
        return lstDatosEmpleadoPublico;
    }

    public void setLstDatosEmpleadoPublico(ArrayList<Victimas_2011> lstDatosEmpleadoPublico) {
        this.lstDatosEmpleadoPublico = lstDatosEmpleadoPublico;
    }

    public ArrayList<Victimas_2011> getLstDatosEstudiantes() {
        return lstDatosEstudiantes;
    }

    public void setLstDatosEstudiantes(ArrayList<Victimas_2011> lstDatosEstudiantes) {
        this.lstDatosEstudiantes = lstDatosEstudiantes;
    }

    public ArrayList<Victimas_2011> getLstDatosPreso() {
        return lstDatosPreso;
    }

    public void setLstDatosPreso(ArrayList<Victimas_2011> lstDatosPreso) {
        this.lstDatosPreso = lstDatosPreso;
    }

    public ArrayList<Victimas_2011> getLstDatosTrabajadora() {
        return lstDatosTrabajadora;
    }

    public void setLstDatosTrabajadora(ArrayList<Victimas_2011> lstDatosTrabajadora) {
        this.lstDatosTrabajadora = lstDatosTrabajadora;
    }

    public ArrayList<Victimas_2011> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Victimas_2011> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public ArrayList<Victimas_2011> getLstDatosProfesional() {
        return lstDatosProfesional;
    }

    public void setLstDatosProfesional(ArrayList<Victimas_2011> lstDatosProfesional) {
        this.lstDatosProfesional = lstDatosProfesional;
    }
    
        
    public ControladorVictimas2011OcupacionVictima() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosComerciante = new ArrayList<Victimas_2011>();
        this.lstDatosEmpleadoPrivado = new ArrayList<Victimas_2011>();
        this.lstDatosEmpleadoPublico = new ArrayList<Victimas_2011>();
        this.lstDatosEstudiantes = new ArrayList<Victimas_2011>();
        this.lstDatosPreso = new ArrayList<Victimas_2011>();
        this.lstDatosTrabajadora = new ArrayList<Victimas_2011>();
        this.lstDatosNa = new ArrayList<Victimas_2011>();
        this.lstDatosProfesional = new ArrayList<Victimas_2011>();
        this.lstDatosQueHaceresDomesticos = new ArrayList<Victimas_2011>();

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
            lstDatosComerciante = FVictimas_2011.ObtenerDatosComerciante();
            lstDatosEmpleadoPrivado = FVictimas_2011.ObtenerDatosEmpleadoPrivado();
            lstDatosEmpleadoPublico = FVictimas_2011.ObtenerDatosEmpleadoPublico();
            lstDatosEstudiantes = FVictimas_2011.ObtenerDatosEstudiante();
            lstDatosPreso = FVictimas_2011.ObtenerDatosPreso();
            lstDatosTrabajadora = FVictimas_2011.ObtenerDatosTrabajadoraS();
            lstDatosNa = FVictimas_2011.ObtenerDatosSinOcupacion();
            lstDatosProfesional = FVictimas_2011.ObtenerDatosProfesionales();
            lstDatosQueHaceresDomesticos = FVictimas_2011.ObtenerDatosQueHaceres();
            ChartSeries Ocupacion = new ChartSeries();
            Ocupacion.setLabel("Ocupación");
            Ocupacion.set("Comerciante", lstDatosComerciante.size());
            Ocupacion.set("Empleado Privado", lstDatosEmpleadoPrivado.size());
            Ocupacion.set("Empleado Público", lstDatosEmpleadoPublico.size());
            Ocupacion.set("Estudiante", lstDatosEstudiantes.size());
            Ocupacion.set("Privado de libertad", lstDatosPreso.size());
            Ocupacion.set("T. Sexual", lstDatosTrabajadora.size());
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
