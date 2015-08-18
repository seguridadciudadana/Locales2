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
    private CartesianChartModel graficaOcupacionVictimaSexo;
    private ArrayList<Vif_2010> lstDatosQueHaceresDomesticosM;
    private ArrayList<Vif_2010> lstDatosComercianteM;
    private ArrayList<Vif_2010> lstDatosEmpleadoPrivadoM;
    private ArrayList<Vif_2010> lstDatosEmpleadoPublicoM;
    private ArrayList<Vif_2010> lstDatosEstudiantesM;
    private ArrayList<Vif_2010> lstDatosJornaleroM;
    private ArrayList<Vif_2010> lstDatosJubiladoM;
    private ArrayList<Vif_2010> lstDatosNaM;
    private ArrayList<Vif_2010> lstDatosProfesionalM;
    private ArrayList<Vif_2010> lstDatosQueHaceresDomesticosF;
    private ArrayList<Vif_2010> lstDatosComercianteF;
    private ArrayList<Vif_2010> lstDatosEmpleadoPrivadoF;
    private ArrayList<Vif_2010> lstDatosEmpleadoPublicoF;
    private ArrayList<Vif_2010> lstDatosEstudiantesF;
    private ArrayList<Vif_2010> lstDatosJornaleroF;
    private ArrayList<Vif_2010> lstDatosJubiladoF;
    private ArrayList<Vif_2010> lstDatosNaF;
    private ArrayList<Vif_2010> lstDatosProfesionalF;

    public CartesianChartModel getGraficaOcupacionVictimaSexo() {
        return graficaOcupacionVictimaSexo;
    }

    public void setGraficaOcupacionVictimaSexo(CartesianChartModel graficaOcupacionVictimaSexo) {
        this.graficaOcupacionVictimaSexo = graficaOcupacionVictimaSexo;
    }

    public ArrayList<Vif_2010> getLstDatosQueHaceresDomesticosM() {
        return lstDatosQueHaceresDomesticosM;
    }

    public void setLstDatosQueHaceresDomesticosM(ArrayList<Vif_2010> lstDatosQueHaceresDomesticosM) {
        this.lstDatosQueHaceresDomesticosM = lstDatosQueHaceresDomesticosM;
    }

    public ArrayList<Vif_2010> getLstDatosComercianteM() {
        return lstDatosComercianteM;
    }

    public void setLstDatosComercianteM(ArrayList<Vif_2010> lstDatosComercianteM) {
        this.lstDatosComercianteM = lstDatosComercianteM;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPrivadoM() {
        return lstDatosEmpleadoPrivadoM;
    }

    public void setLstDatosEmpleadoPrivadoM(ArrayList<Vif_2010> lstDatosEmpleadoPrivadoM) {
        this.lstDatosEmpleadoPrivadoM = lstDatosEmpleadoPrivadoM;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPublicoM() {
        return lstDatosEmpleadoPublicoM;
    }

    public void setLstDatosEmpleadoPublicoM(ArrayList<Vif_2010> lstDatosEmpleadoPublicoM) {
        this.lstDatosEmpleadoPublicoM = lstDatosEmpleadoPublicoM;
    }

    public ArrayList<Vif_2010> getLstDatosEstudiantesM() {
        return lstDatosEstudiantesM;
    }

    public void setLstDatosEstudiantesM(ArrayList<Vif_2010> lstDatosEstudiantesM) {
        this.lstDatosEstudiantesM = lstDatosEstudiantesM;
    }

    public ArrayList<Vif_2010> getLstDatosJornaleroM() {
        return lstDatosJornaleroM;
    }

    public void setLstDatosJornaleroM(ArrayList<Vif_2010> lstDatosJornaleroM) {
        this.lstDatosJornaleroM = lstDatosJornaleroM;
    }

    public ArrayList<Vif_2010> getLstDatosJubiladoM() {
        return lstDatosJubiladoM;
    }

    public void setLstDatosJubiladoM(ArrayList<Vif_2010> lstDatosJubiladoM) {
        this.lstDatosJubiladoM = lstDatosJubiladoM;
    }

    public ArrayList<Vif_2010> getLstDatosNaM() {
        return lstDatosNaM;
    }

    public void setLstDatosNaM(ArrayList<Vif_2010> lstDatosNaM) {
        this.lstDatosNaM = lstDatosNaM;
    }

    public ArrayList<Vif_2010> getLstDatosProfesionalM() {
        return lstDatosProfesionalM;
    }

    public void setLstDatosProfesionalM(ArrayList<Vif_2010> lstDatosProfesionalM) {
        this.lstDatosProfesionalM = lstDatosProfesionalM;
    }

    public ArrayList<Vif_2010> getLstDatosQueHaceresDomesticosF() {
        return lstDatosQueHaceresDomesticosF;
    }

    public void setLstDatosQueHaceresDomesticosF(ArrayList<Vif_2010> lstDatosQueHaceresDomesticosF) {
        this.lstDatosQueHaceresDomesticosF = lstDatosQueHaceresDomesticosF;
    }

    public ArrayList<Vif_2010> getLstDatosComercianteF() {
        return lstDatosComercianteF;
    }

    public void setLstDatosComercianteF(ArrayList<Vif_2010> lstDatosComercianteF) {
        this.lstDatosComercianteF = lstDatosComercianteF;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPrivadoF() {
        return lstDatosEmpleadoPrivadoF;
    }

    public void setLstDatosEmpleadoPrivadoF(ArrayList<Vif_2010> lstDatosEmpleadoPrivadoF) {
        this.lstDatosEmpleadoPrivadoF = lstDatosEmpleadoPrivadoF;
    }

    public ArrayList<Vif_2010> getLstDatosEmpleadoPublicoF() {
        return lstDatosEmpleadoPublicoF;
    }

    public void setLstDatosEmpleadoPublicoF(ArrayList<Vif_2010> lstDatosEmpleadoPublicoF) {
        this.lstDatosEmpleadoPublicoF = lstDatosEmpleadoPublicoF;
    }

    public ArrayList<Vif_2010> getLstDatosEstudiantesF() {
        return lstDatosEstudiantesF;
    }

    public void setLstDatosEstudiantesF(ArrayList<Vif_2010> lstDatosEstudiantesF) {
        this.lstDatosEstudiantesF = lstDatosEstudiantesF;
    }

    public ArrayList<Vif_2010> getLstDatosJornaleroF() {
        return lstDatosJornaleroF;
    }

    public void setLstDatosJornaleroF(ArrayList<Vif_2010> lstDatosJornaleroF) {
        this.lstDatosJornaleroF = lstDatosJornaleroF;
    }

    public ArrayList<Vif_2010> getLstDatosJubiladoF() {
        return lstDatosJubiladoF;
    }

    public void setLstDatosJubiladoF(ArrayList<Vif_2010> lstDatosJubiladoF) {
        this.lstDatosJubiladoF = lstDatosJubiladoF;
    }

    public ArrayList<Vif_2010> getLstDatosNaF() {
        return lstDatosNaF;
    }

    public void setLstDatosNaF(ArrayList<Vif_2010> lstDatosNaF) {
        this.lstDatosNaF = lstDatosNaF;
    }

    public ArrayList<Vif_2010> getLstDatosProfesionalF() {
        return lstDatosProfesionalF;
    }

    public void setLstDatosProfesionalF(ArrayList<Vif_2010> lstDatosProfesionalF) {
        this.lstDatosProfesionalF = lstDatosProfesionalF;
    }

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
        graficaOcupacionVictimaSexo=initCategoryOcupacionVictimaSexo();
    }

    private CartesianChartModel initCategoryOcupacionVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosComerciante = FVif_2010.ObtenerDatosVictimaComerciante();
            lstDatosEmpleadoPrivado = FVif_2010.ObtenerDatosVictimaEmpleadoPrivado();
            lstDatosEmpleadoPublico = FVif_2010.ObtenerDatosVictimaEmpleadoPublico();
            lstDatosEstudiantes = FVif_2010.ObtenerDatosVictimaEstudiantes();
            lstDatosJornalero = FVif_2010.ObtenerDatosVictimaJornalero();
            lstDatosJubilado = FVif_2010.ObtenerDatosVictimaJubilado();
            lstDatosNa = FVif_2010.ObtenerDatosVictimaNA();
            lstDatosProfesional = FVif_2010.ObtenerDatosVictimaProfesional();
            lstDatosQueHaceresDomesticos = FVif_2010.ObtenerDatosVictimaQueHaceres();
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

    private CartesianChartModel initCategoryOcupacionVictimaSexo() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {

            lstDatosComercianteF = FVif_2010.ObtenerDatosVictimaComercianteDadoSexo("F");
            lstDatosEmpleadoPrivadoF = FVif_2010.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("F");
            lstDatosEmpleadoPublicoF = FVif_2010.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("F");
            lstDatosEstudiantesF = FVif_2010.ObtenerDatosVictimaEstudiantesDadoSexo("F");
            lstDatosJornaleroF = FVif_2010.ObtenerDatosVictimaJornaleroDadoSexo("F");
            lstDatosJubiladoF = FVif_2010.ObtenerDatosVictimaJubiladoDadoSexo("F");
            lstDatosNaF = FVif_2010.ObtenerDatosVictimaNADadoSexo("F");
            lstDatosProfesionalF = FVif_2010.ObtenerDatosVictimaProfesionalDadoSexo("F");
            lstDatosQueHaceresDomesticosF = FVif_2010.ObtenerDatosVictimaQueHaceresDadoSexo("F");

            lstDatosComercianteM = FVif_2010.ObtenerDatosVictimaComercianteDadoSexo("M");
            lstDatosEmpleadoPrivadoM = FVif_2010.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("M");
            lstDatosEmpleadoPublicoM = FVif_2010.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("M");
            lstDatosEstudiantesM = FVif_2010.ObtenerDatosVictimaEstudiantesDadoSexo("M");
            lstDatosJornaleroM = FVif_2010.ObtenerDatosVictimaJornaleroDadoSexo("M");
            lstDatosJubiladoM = FVif_2010.ObtenerDatosVictimaJubiladoDadoSexo("M");
            lstDatosNaM = FVif_2010.ObtenerDatosVictimaNADadoSexo("M");
            lstDatosProfesionalM = FVif_2010.ObtenerDatosVictimaProfesionalDadoSexo("M");
            lstDatosQueHaceresDomesticosM = FVif_2010.ObtenerDatosVictimaQueHaceresDadoSexo("M");

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("Comerciante", lstDatosComercianteF.size());
            Femenino.set("Empleado Privado", lstDatosEmpleadoPrivadoF.size());
            Femenino.set("Empleado Público", lstDatosEmpleadoPublicoF.size());
            Femenino.set("Estudiante", lstDatosEstudiantesF.size());
            Femenino.set("Jornalero", lstDatosJornaleroF.size());
            Femenino.set("Jubilado", lstDatosJubiladoF.size());
            Femenino.set("NA", lstDatosNaF.size());
            Femenino.set("Profesional", lstDatosProfesionalF.size());
            Femenino.set("Que haceres domesticos", lstDatosQueHaceresDomesticosF.size());

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Comerciante", lstDatosComercianteM.size());
            Masculino.set("Empleado Privado", lstDatosEmpleadoPrivadoM.size());
            Masculino.set("Empleado Público", lstDatosEmpleadoPublicoM.size());
            Masculino.set("Estudiante", lstDatosEstudiantesM.size());
            Masculino.set("Jornalero", lstDatosJornaleroM.size());
            Masculino.set("Jubilado", lstDatosJubiladoM.size());
            Masculino.set("NA", lstDatosNaM.size());
            Masculino.set("Profesional", lstDatosProfesionalM.size());
            Masculino.set("Que haceres domesticos", lstDatosQueHaceresDomesticosM.size());

            model1.addSeries(Femenino);
            model1.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

}
