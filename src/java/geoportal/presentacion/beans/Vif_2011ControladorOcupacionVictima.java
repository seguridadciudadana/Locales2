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

    private CartesianChartModel graficaOcupacionVictimaSexo;

    private ArrayList<Vif_2011> lstDatosQueHaceresDomesticosF;
    private ArrayList<Vif_2011> lstDatosComercianteF;
    private ArrayList<Vif_2011> lstDatosEmpleadoPrivadoF;
    private ArrayList<Vif_2011> lstDatosEmpleadoPublicoF;
    private ArrayList<Vif_2011> lstDatosEstudiantesF;
    private ArrayList<Vif_2011> lstDatosJornaleroF;
    private ArrayList<Vif_2011> lstDatosJubiladoF;
    private ArrayList<Vif_2011> lstDatosNaF;
    private ArrayList<Vif_2011> lstDatosProfesionalF;
    private ArrayList<Vif_2011> lstDatosDesempleadoF;

    private ArrayList<Vif_2011> lstDatosQueHaceresDomesticosM;
    private ArrayList<Vif_2011> lstDatosComercianteM;
    private ArrayList<Vif_2011> lstDatosEmpleadoPrivadoM;
    private ArrayList<Vif_2011> lstDatosEmpleadoPublicoM;
    private ArrayList<Vif_2011> lstDatosEstudiantesM;
    private ArrayList<Vif_2011> lstDatosJornaleroM;
    private ArrayList<Vif_2011> lstDatosJubiladoM;
    private ArrayList<Vif_2011> lstDatosNaM;
    private ArrayList<Vif_2011> lstDatosProfesionalM;
    private ArrayList<Vif_2011> lstDatosDesempleadoM;

    public CartesianChartModel getGraficaOcupacionVictimaSexo() {
        return graficaOcupacionVictimaSexo;
    }

    public void setGraficaOcupacionVictimaSexo(CartesianChartModel graficaOcupacionVictimaSexo) {
        this.graficaOcupacionVictimaSexo = graficaOcupacionVictimaSexo;
    }

    public ArrayList<Vif_2011> getLstDatosQueHaceresDomesticosF() {
        return lstDatosQueHaceresDomesticosF;
    }

    public void setLstDatosQueHaceresDomesticosF(ArrayList<Vif_2011> lstDatosQueHaceresDomesticosF) {
        this.lstDatosQueHaceresDomesticosF = lstDatosQueHaceresDomesticosF;
    }

    public ArrayList<Vif_2011> getLstDatosComercianteF() {
        return lstDatosComercianteF;
    }

    public void setLstDatosComercianteF(ArrayList<Vif_2011> lstDatosComercianteF) {
        this.lstDatosComercianteF = lstDatosComercianteF;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPrivadoF() {
        return lstDatosEmpleadoPrivadoF;
    }

    public void setLstDatosEmpleadoPrivadoF(ArrayList<Vif_2011> lstDatosEmpleadoPrivadoF) {
        this.lstDatosEmpleadoPrivadoF = lstDatosEmpleadoPrivadoF;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPublicoF() {
        return lstDatosEmpleadoPublicoF;
    }

    public void setLstDatosEmpleadoPublicoF(ArrayList<Vif_2011> lstDatosEmpleadoPublicoF) {
        this.lstDatosEmpleadoPublicoF = lstDatosEmpleadoPublicoF;
    }

    public ArrayList<Vif_2011> getLstDatosEstudiantesF() {
        return lstDatosEstudiantesF;
    }

    public void setLstDatosEstudiantesF(ArrayList<Vif_2011> lstDatosEstudiantesF) {
        this.lstDatosEstudiantesF = lstDatosEstudiantesF;
    }

    public ArrayList<Vif_2011> getLstDatosJornaleroF() {
        return lstDatosJornaleroF;
    }

    public void setLstDatosJornaleroF(ArrayList<Vif_2011> lstDatosJornaleroF) {
        this.lstDatosJornaleroF = lstDatosJornaleroF;
    }

    public ArrayList<Vif_2011> getLstDatosJubiladoF() {
        return lstDatosJubiladoF;
    }

    public void setLstDatosJubiladoF(ArrayList<Vif_2011> lstDatosJubiladoF) {
        this.lstDatosJubiladoF = lstDatosJubiladoF;
    }

    public ArrayList<Vif_2011> getLstDatosNaF() {
        return lstDatosNaF;
    }

    public void setLstDatosNaF(ArrayList<Vif_2011> lstDatosNaF) {
        this.lstDatosNaF = lstDatosNaF;
    }

    public ArrayList<Vif_2011> getLstDatosProfesionalF() {
        return lstDatosProfesionalF;
    }

    public void setLstDatosProfesionalF(ArrayList<Vif_2011> lstDatosProfesionalF) {
        this.lstDatosProfesionalF = lstDatosProfesionalF;
    }

    public ArrayList<Vif_2011> getLstDatosDesempleadoF() {
        return lstDatosDesempleadoF;
    }

    public void setLstDatosDesempleadoF(ArrayList<Vif_2011> lstDatosDesempleadoF) {
        this.lstDatosDesempleadoF = lstDatosDesempleadoF;
    }

    public ArrayList<Vif_2011> getLstDatosQueHaceresDomesticosM() {
        return lstDatosQueHaceresDomesticosM;
    }

    public void setLstDatosQueHaceresDomesticosM(ArrayList<Vif_2011> lstDatosQueHaceresDomesticosM) {
        this.lstDatosQueHaceresDomesticosM = lstDatosQueHaceresDomesticosM;
    }

    public ArrayList<Vif_2011> getLstDatosComercianteM() {
        return lstDatosComercianteM;
    }

    public void setLstDatosComercianteM(ArrayList<Vif_2011> lstDatosComercianteM) {
        this.lstDatosComercianteM = lstDatosComercianteM;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPrivadoM() {
        return lstDatosEmpleadoPrivadoM;
    }

    public void setLstDatosEmpleadoPrivadoM(ArrayList<Vif_2011> lstDatosEmpleadoPrivadoM) {
        this.lstDatosEmpleadoPrivadoM = lstDatosEmpleadoPrivadoM;
    }

    public ArrayList<Vif_2011> getLstDatosEmpleadoPublicoM() {
        return lstDatosEmpleadoPublicoM;
    }

    public void setLstDatosEmpleadoPublicoM(ArrayList<Vif_2011> lstDatosEmpleadoPublicoM) {
        this.lstDatosEmpleadoPublicoM = lstDatosEmpleadoPublicoM;
    }

    public ArrayList<Vif_2011> getLstDatosEstudiantesM() {
        return lstDatosEstudiantesM;
    }

    public void setLstDatosEstudiantesM(ArrayList<Vif_2011> lstDatosEstudiantesM) {
        this.lstDatosEstudiantesM = lstDatosEstudiantesM;
    }

    public ArrayList<Vif_2011> getLstDatosJornaleroM() {
        return lstDatosJornaleroM;
    }

    public void setLstDatosJornaleroM(ArrayList<Vif_2011> lstDatosJornaleroM) {
        this.lstDatosJornaleroM = lstDatosJornaleroM;
    }

    public ArrayList<Vif_2011> getLstDatosJubiladoM() {
        return lstDatosJubiladoM;
    }

    public void setLstDatosJubiladoM(ArrayList<Vif_2011> lstDatosJubiladoM) {
        this.lstDatosJubiladoM = lstDatosJubiladoM;
    }

    public ArrayList<Vif_2011> getLstDatosNaM() {
        return lstDatosNaM;
    }

    public void setLstDatosNaM(ArrayList<Vif_2011> lstDatosNaM) {
        this.lstDatosNaM = lstDatosNaM;
    }

    public ArrayList<Vif_2011> getLstDatosProfesionalM() {
        return lstDatosProfesionalM;
    }

    public void setLstDatosProfesionalM(ArrayList<Vif_2011> lstDatosProfesionalM) {
        this.lstDatosProfesionalM = lstDatosProfesionalM;
    }

    public ArrayList<Vif_2011> getLstDatosDesempleadoM() {
        return lstDatosDesempleadoM;
    }

    public void setLstDatosDesempleadoM(ArrayList<Vif_2011> lstDatosDesempleadoM) {
        this.lstDatosDesempleadoM = lstDatosDesempleadoM;
    }

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
        graficaOcupacionVictimaSexo=initCategoryOcupacionVictimaSV();
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

    private CartesianChartModel initCategoryOcupacionVictimaSV() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatosComercianteF = FVif_2011.ObtenerDatosVictimaComercianteDadoSexo("F");
            lstDatosDesempleadoF = FVif_2011.ObtenerDatosVictimaDesempleadoDadoSexo("F");
            lstDatosEmpleadoPrivadoF = FVif_2011.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("F");
            lstDatosEmpleadoPublicoF = FVif_2011.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("F");
            lstDatosEstudiantesF = FVif_2011.ObtenerDatosVictimaEstudiantesDadoSexo("F");
            lstDatosJornaleroF = FVif_2011.ObtenerDatosVictimaJornaleroDadoSexo("F");
            lstDatosJubiladoF = FVif_2011.ObtenerDatosVictimaJubiladoDadoSexo("F");
            lstDatosNaF = FVif_2011.ObtenerDatosVictimaNADadoSexo("F");
            lstDatosProfesionalF = FVif_2011.ObtenerDatosVictimaProfesionalDadoSexo("F");
            lstDatosQueHaceresDomesticosF = FVif_2011.ObtenerDatosVictimaQueHaceresDadoSexo("F");
            
            lstDatosComercianteM=FVif_2011.ObtenerDatosVictimaComercianteDadoSexo("M");
            lstDatosDesempleadoM=FVif_2011.ObtenerDatosVictimaDesempleadoDadoSexo("M");
            lstDatosEmpleadoPrivadoM=FVif_2011.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("M");
            lstDatosEmpleadoPublicoM=FVif_2011.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("M");
            lstDatosEstudiantesM=FVif_2011.ObtenerDatosVictimaEstudiantesDadoSexo("M");
            lstDatosJornaleroM=FVif_2011.ObtenerDatosVictimaJornaleroDadoSexo("M");
            lstDatosJubiladoM=FVif_2011.ObtenerDatosVictimaJubiladoDadoSexo("M");
            lstDatosNaM=FVif_2011.ObtenerDatosVictimaNADadoSexo("M");
            lstDatosProfesionalM=FVif_2011.ObtenerDatosVictimaProfesionalDadoSexo("M");
            lstDatosQueHaceresDomesticosM=FVif_2011.ObtenerDatosVictimaQueHaceresDadoSexo("M");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Comerciante", lstDatosComercianteM.size());
            Masculino.set("Desempleado", lstDatosDesempleadoM.size());
            Masculino.set("Empleado Privado", lstDatosEmpleadoPrivadoM.size());
            Masculino.set("Empleado Público", lstDatosEmpleadoPublicoM.size());
            Masculino.set("Estudiante", lstDatosEstudiantesM.size());
            Masculino.set("Jornalero", lstDatosJornaleroM.size());
            Masculino.set("Jubilado", lstDatosJubiladoM.size());
            Masculino.set("NA", lstDatosNaM.size());
            Masculino.set("Profesional", lstDatosProfesionalM.size());
            Masculino.set("Que haceres domesticos", lstDatosQueHaceresDomesticosM.size());
            
            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("Comerciante", lstDatosComercianteF.size());
            Femenino.set("Desempleado", lstDatosDesempleadoF.size());
            Femenino.set("Empleado Privado", lstDatosEmpleadoPrivadoF.size());
            Femenino.set("Empleado Público", lstDatosEmpleadoPublicoF.size());
            Femenino.set("Estudiante", lstDatosEstudiantesF.size());
            Femenino.set("Jornalero", lstDatosJornaleroF.size());
            Femenino.set("Jubilado", lstDatosJubiladoF.size());
            Femenino.set("NA", lstDatosNaF.size());
            Femenino.set("Profesional", lstDatosProfesionalF.size());
            Femenino.set("Que haceres domesticos", lstDatosQueHaceresDomesticosF.size());

            model1.addSeries(Femenino);
            model1.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;

    }

}
