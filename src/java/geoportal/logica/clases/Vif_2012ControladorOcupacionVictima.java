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

    private CartesianChartModel graficaOcupacionSexoVictima;

    private ArrayList<Vif_2012> lstDatosQueHaceresDomesticosM;
    private ArrayList<Vif_2012> lstDatosComercianteM;
    private ArrayList<Vif_2012> lstDatosEmpleadoPrivadoM;
    private ArrayList<Vif_2012> lstDatosEmpleadoPublicoM;
    private ArrayList<Vif_2012> lstDatosEstudiantesM;
    private ArrayList<Vif_2012> lstDatosJornaleroM;
    private ArrayList<Vif_2012> lstDatosJubiladoM;
    private ArrayList<Vif_2012> lstDatosNaM;
    private ArrayList<Vif_2012> lstDatosProfesionalM;
    private ArrayList<Vif_2012> lstDatosDesempleadoM;
    private ArrayList<Vif_2012> lstDatosDiscapacitadoM;

    private ArrayList<Vif_2012> lstDatosQueHaceresDomesticosF;
    private ArrayList<Vif_2012> lstDatosComercianteF;
    private ArrayList<Vif_2012> lstDatosEmpleadoPrivadoF;
    private ArrayList<Vif_2012> lstDatosEmpleadoPublicoF;
    private ArrayList<Vif_2012> lstDatosEstudiantesF;
    private ArrayList<Vif_2012> lstDatosJornaleroF;
    private ArrayList<Vif_2012> lstDatosJubiladoF;
    private ArrayList<Vif_2012> lstDatosNaF;
    private ArrayList<Vif_2012> lstDatosProfesionalF;
    private ArrayList<Vif_2012> lstDatosDesempleadoF;
    private ArrayList<Vif_2012> lstDatosDiscapacitadoF;

    public CartesianChartModel getGraficaOcupacionSexoVictima() {
        return graficaOcupacionSexoVictima;
    }

    public void setGraficaOcupacionSexoVictima(CartesianChartModel graficaOcupacionSexoVictima) {
        this.graficaOcupacionSexoVictima = graficaOcupacionSexoVictima;
    }

    public ArrayList<Vif_2012> getLstDatosQueHaceresDomesticosM() {
        return lstDatosQueHaceresDomesticosM;
    }

    public void setLstDatosQueHaceresDomesticosM(ArrayList<Vif_2012> lstDatosQueHaceresDomesticosM) {
        this.lstDatosQueHaceresDomesticosM = lstDatosQueHaceresDomesticosM;
    }

    public ArrayList<Vif_2012> getLstDatosComercianteM() {
        return lstDatosComercianteM;
    }

    public void setLstDatosComercianteM(ArrayList<Vif_2012> lstDatosComercianteM) {
        this.lstDatosComercianteM = lstDatosComercianteM;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPrivadoM() {
        return lstDatosEmpleadoPrivadoM;
    }

    public void setLstDatosEmpleadoPrivadoM(ArrayList<Vif_2012> lstDatosEmpleadoPrivadoM) {
        this.lstDatosEmpleadoPrivadoM = lstDatosEmpleadoPrivadoM;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPublicoM() {
        return lstDatosEmpleadoPublicoM;
    }

    public void setLstDatosEmpleadoPublicoM(ArrayList<Vif_2012> lstDatosEmpleadoPublicoM) {
        this.lstDatosEmpleadoPublicoM = lstDatosEmpleadoPublicoM;
    }

    public ArrayList<Vif_2012> getLstDatosEstudiantesM() {
        return lstDatosEstudiantesM;
    }

    public void setLstDatosEstudiantesM(ArrayList<Vif_2012> lstDatosEstudiantesM) {
        this.lstDatosEstudiantesM = lstDatosEstudiantesM;
    }

    public ArrayList<Vif_2012> getLstDatosJornaleroM() {
        return lstDatosJornaleroM;
    }

    public void setLstDatosJornaleroM(ArrayList<Vif_2012> lstDatosJornaleroM) {
        this.lstDatosJornaleroM = lstDatosJornaleroM;
    }

    public ArrayList<Vif_2012> getLstDatosJubiladoM() {
        return lstDatosJubiladoM;
    }

    public void setLstDatosJubiladoM(ArrayList<Vif_2012> lstDatosJubiladoM) {
        this.lstDatosJubiladoM = lstDatosJubiladoM;
    }

    public ArrayList<Vif_2012> getLstDatosNaM() {
        return lstDatosNaM;
    }

    public void setLstDatosNaM(ArrayList<Vif_2012> lstDatosNaM) {
        this.lstDatosNaM = lstDatosNaM;
    }

    public ArrayList<Vif_2012> getLstDatosProfesionalM() {
        return lstDatosProfesionalM;
    }

    public void setLstDatosProfesionalM(ArrayList<Vif_2012> lstDatosProfesionalM) {
        this.lstDatosProfesionalM = lstDatosProfesionalM;
    }

    public ArrayList<Vif_2012> getLstDatosDesempleadoM() {
        return lstDatosDesempleadoM;
    }

    public void setLstDatosDesempleadoM(ArrayList<Vif_2012> lstDatosDesempleadoM) {
        this.lstDatosDesempleadoM = lstDatosDesempleadoM;
    }

    public ArrayList<Vif_2012> getLstDatosDiscapacitadoM() {
        return lstDatosDiscapacitadoM;
    }

    public void setLstDatosDiscapacitadoM(ArrayList<Vif_2012> lstDatosDiscapacitadoM) {
        this.lstDatosDiscapacitadoM = lstDatosDiscapacitadoM;
    }

    public ArrayList<Vif_2012> getLstDatosQueHaceresDomesticosF() {
        return lstDatosQueHaceresDomesticosF;
    }

    public void setLstDatosQueHaceresDomesticosF(ArrayList<Vif_2012> lstDatosQueHaceresDomesticosF) {
        this.lstDatosQueHaceresDomesticosF = lstDatosQueHaceresDomesticosF;
    }

    public ArrayList<Vif_2012> getLstDatosComercianteF() {
        return lstDatosComercianteF;
    }

    public void setLstDatosComercianteF(ArrayList<Vif_2012> lstDatosComercianteF) {
        this.lstDatosComercianteF = lstDatosComercianteF;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPrivadoF() {
        return lstDatosEmpleadoPrivadoF;
    }

    public void setLstDatosEmpleadoPrivadoF(ArrayList<Vif_2012> lstDatosEmpleadoPrivadoF) {
        this.lstDatosEmpleadoPrivadoF = lstDatosEmpleadoPrivadoF;
    }

    public ArrayList<Vif_2012> getLstDatosEmpleadoPublicoF() {
        return lstDatosEmpleadoPublicoF;
    }

    public void setLstDatosEmpleadoPublicoF(ArrayList<Vif_2012> lstDatosEmpleadoPublicoF) {
        this.lstDatosEmpleadoPublicoF = lstDatosEmpleadoPublicoF;
    }

    public ArrayList<Vif_2012> getLstDatosEstudiantesF() {
        return lstDatosEstudiantesF;
    }

    public void setLstDatosEstudiantesF(ArrayList<Vif_2012> lstDatosEstudiantesF) {
        this.lstDatosEstudiantesF = lstDatosEstudiantesF;
    }

    public ArrayList<Vif_2012> getLstDatosJornaleroF() {
        return lstDatosJornaleroF;
    }

    public void setLstDatosJornaleroF(ArrayList<Vif_2012> lstDatosJornaleroF) {
        this.lstDatosJornaleroF = lstDatosJornaleroF;
    }

    public ArrayList<Vif_2012> getLstDatosJubiladoF() {
        return lstDatosJubiladoF;
    }

    public void setLstDatosJubiladoF(ArrayList<Vif_2012> lstDatosJubiladoF) {
        this.lstDatosJubiladoF = lstDatosJubiladoF;
    }

    public ArrayList<Vif_2012> getLstDatosNaF() {
        return lstDatosNaF;
    }

    public void setLstDatosNaF(ArrayList<Vif_2012> lstDatosNaF) {
        this.lstDatosNaF = lstDatosNaF;
    }

    public ArrayList<Vif_2012> getLstDatosProfesionalF() {
        return lstDatosProfesionalF;
    }

    public void setLstDatosProfesionalF(ArrayList<Vif_2012> lstDatosProfesionalF) {
        this.lstDatosProfesionalF = lstDatosProfesionalF;
    }

    public ArrayList<Vif_2012> getLstDatosDesempleadoF() {
        return lstDatosDesempleadoF;
    }

    public void setLstDatosDesempleadoF(ArrayList<Vif_2012> lstDatosDesempleadoF) {
        this.lstDatosDesempleadoF = lstDatosDesempleadoF;
    }

    public ArrayList<Vif_2012> getLstDatosDiscapacitadoF() {
        return lstDatosDiscapacitadoF;
    }

    public void setLstDatosDiscapacitadoF(ArrayList<Vif_2012> lstDatosDiscapacitadoF) {
        this.lstDatosDiscapacitadoF = lstDatosDiscapacitadoF;
    }

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
        graficaOcupacionSexoVictima=initCategoryOcupacionSexoVictima();
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
            lstDatosNa = FVif_2012.ObtenerDatosVictimaOcupacionNA();
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
    
    private CartesianChartModel initCategoryOcupacionSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatosComercianteF=FVif_2012.ObtenerDatosVictimaComercianteDadoSexo("F");
            lstDatosDesempleadoF=FVif_2012.ObtenerDatosVictimaDesempleadoDadoSexo("F");
            lstDatosDiscapacitadoF=FVif_2012.ObtenerDatosVictimaDiscapacitadoDadoSexo("F");
            lstDatosEmpleadoPrivadoF=FVif_2012.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("F");
            lstDatosEmpleadoPublicoF=FVif_2012.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("F");
            lstDatosEstudiantesF=FVif_2012.ObtenerDatosVictimaEstudiantesDadoSexo("F");
            lstDatosJornaleroF=FVif_2012.ObtenerDatosVictimaJornaleroDadoSexo("F");
            lstDatosJubiladoF=FVif_2012.ObtenerDatosVictimaJubiladoDadoSexo("F");
            lstDatosNaF=FVif_2012.ObtenerDatosVictimaOcupacionNADadoSexo("F");
            lstDatosProfesionalF=FVif_2012.ObtenerDatosVictimaProfesionalDadoSexo("F");
            lstDatosQueHaceresDomesticosF=FVif_2012.ObtenerDatosVictimaQueHaceresDadoSexo("F");
            
            lstDatosComercianteM=FVif_2012.ObtenerDatosVictimaComercianteDadoSexo("M");
            lstDatosDesempleadoM=FVif_2012.ObtenerDatosVictimaDesempleadoDadoSexo("M");
            lstDatosDiscapacitadoM=FVif_2012.ObtenerDatosVictimaDiscapacitadoDadoSexo("M");
            lstDatosEmpleadoPrivadoM=FVif_2012.ObtenerDatosVictimaEmpleadoPrivadoDadoSexo("M");
            lstDatosEmpleadoPublicoM=FVif_2012.ObtenerDatosVictimaEmpleadoPublicoDadoSexo("M");
            lstDatosEstudiantesM=FVif_2012.ObtenerDatosVictimaEstudiantesDadoSexo("M");
            lstDatosJornaleroM=FVif_2012.ObtenerDatosVictimaJornaleroDadoSexo("M");
            lstDatosJubiladoM=FVif_2012.ObtenerDatosVictimaJubiladoDadoSexo("M");
            lstDatosNaM=FVif_2012.ObtenerDatosVictimaOcupacionNADadoSexo("M");
            lstDatosProfesionalM=FVif_2012.ObtenerDatosVictimaProfesionalDadoSexo("M");
            lstDatosQueHaceresDomesticosM=FVif_2012.ObtenerDatosVictimaQueHaceresDadoSexo("M");
            
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Comerciante", lstDatosComercianteM.size());
            Masculino.set("Desempleado", lstDatosDesempleadoM.size());
            Masculino.set("Discapacitado", lstDatosDiscapacitadoM.size());
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
            Femenino.set("Discapacitado", lstDatosDiscapacitadoF.size());
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
