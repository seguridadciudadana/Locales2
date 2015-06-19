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
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2012;

/**
 *
 * @author Pc05
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012_Tratamiento {

    /**
     * Creates a new instance of ControladorVictimas2012_Tratamiento
     */
    private ArrayList<Victimas_2012> lstDatos;
    private ArrayList<Victimas_2012> lstDatos1;
    private ArrayList<Victimas_2012> lstDatosNA;
    private ArrayList<Victimas_2012> lstDatosFisica;
    private ArrayList<Victimas_2012> lstDatosFisicaPsicologica;
    private ArrayList<Victimas_2012> lstDatosFisicaPsicologicaSexual;
    private ArrayList<Victimas_2012> lstDatosFisicaSexual;
    private ArrayList<Victimas_2012> lstDatosPsicologica;
    private ArrayList<Victimas_2012> lstDatosPsicologicaSexual;
    private ArrayList<Victimas_2012> lstDatosSexual;
    private PieChartModel pieViolencia;
    private ArrayList<Victimas_2012> lstDatosDadoViolencia;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineTipoViolencia2;
    private Victimas_2012 datoSel;
    private ArrayList<Victimas_2012> lstDatosDadoFrecuencia;
    private ArrayList<Victimas_2012> lstDatosDadoFrecuenciaPrimera;
    private ArrayList<Victimas_2012> lstDatosDadoFrecuenciaSubsecuente;
    private ArrayList<Victimas_2012> lstDatosDadoFrecuenciaNA;
    private CartesianChartModel lineFrecuenciaAGresion;
    private PieChartModel pieFrecuenciaAgresion;
    private ArrayList<Victimas_2012> lstDatosDadoTratamiento;
    private CartesianChartModel lineTratamiento;
    private PieChartModel pieTratamiento;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoClinico;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoQuirurgicoPsicologico;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoPsicologico;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoQuirurgico;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoNA;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoPsicologico;
    private ArrayList<Victimas_2012> lstDatosDadoTratamientoQuirurgico;

    public ArrayList<Victimas_2012> getLstDatosDadoTratamiento() {
        return lstDatosDadoTratamiento;
    }

    public void setLstDatosDadoTratamiento(ArrayList<Victimas_2012> lstDatosDadoTratamiento) {
        this.lstDatosDadoTratamiento = lstDatosDadoTratamiento;
    }

    public CartesianChartModel getLineTratamiento() {
        return lineTratamiento;
    }

    public void setLineTratamiento(CartesianChartModel lineTratamiento) {
        this.lineTratamiento = lineTratamiento;
    }

    public PieChartModel getPieTratamiento() {
        return pieTratamiento;
    }

    public void setPieTratamiento(PieChartModel pieTratamiento) {
        this.pieTratamiento = pieTratamiento;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoClinico() {
        return lstDatosDadoTratamientoClinico;
    }

    public void setLstDatosDadoTratamientoClinico(ArrayList<Victimas_2012> lstDatosDadoTratamientoClinico) {
        this.lstDatosDadoTratamientoClinico = lstDatosDadoTratamientoClinico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoClinicoQuirurgicoPsicologico() {
        return lstDatosDadoTratamientoClinicoQuirurgicoPsicologico;
    }

    public void setLstDatosDadoTratamientoClinicoQuirurgicoPsicologico(ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoQuirurgicoPsicologico) {
        this.lstDatosDadoTratamientoClinicoQuirurgicoPsicologico = lstDatosDadoTratamientoClinicoQuirurgicoPsicologico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoClinicoPsicologico() {
        return lstDatosDadoTratamientoClinicoPsicologico;
    }

    public void setLstDatosDadoTratamientoClinicoPsicologico(ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoPsicologico) {
        this.lstDatosDadoTratamientoClinicoPsicologico = lstDatosDadoTratamientoClinicoPsicologico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoClinicoQuirurgico() {
        return lstDatosDadoTratamientoClinicoQuirurgico;
    }

    public void setLstDatosDadoTratamientoClinicoQuirurgico(ArrayList<Victimas_2012> lstDatosDadoTratamientoClinicoQuirurgico) {
        this.lstDatosDadoTratamientoClinicoQuirurgico = lstDatosDadoTratamientoClinicoQuirurgico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoNA() {
        return lstDatosDadoTratamientoNA;
    }

    public void setLstDatosDadoTratamientoNA(ArrayList<Victimas_2012> lstDatosDadoTratamientoNA) {
        this.lstDatosDadoTratamientoNA = lstDatosDadoTratamientoNA;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoPsicologico() {
        return lstDatosDadoTratamientoPsicologico;
    }

    public void setLstDatosDadoTratamientoPsicologico(ArrayList<Victimas_2012> lstDatosDadoTratamientoPsicologico) {
        this.lstDatosDadoTratamientoPsicologico = lstDatosDadoTratamientoPsicologico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoTratamientoQuirurgico() {
        return lstDatosDadoTratamientoQuirurgico;
    }

    public void setLstDatosDadoTratamientoQuirurgico(ArrayList<Victimas_2012> lstDatosDadoTratamientoQuirurgico) {
        this.lstDatosDadoTratamientoQuirurgico = lstDatosDadoTratamientoQuirurgico;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoFrecuenciaPrimera() {
        return lstDatosDadoFrecuenciaPrimera;
    }

    public void setLstDatosDadoFrecuenciaPrimera(ArrayList<Victimas_2012> lstDatosDadoFrecuenciaPrimera) {
        this.lstDatosDadoFrecuenciaPrimera = lstDatosDadoFrecuenciaPrimera;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoFrecuenciaSubsecuente() {
        return lstDatosDadoFrecuenciaSubsecuente;
    }

    public void setLstDatosDadoFrecuenciaSubsecuente(ArrayList<Victimas_2012> lstDatosDadoFrecuenciaSubsecuente) {
        this.lstDatosDadoFrecuenciaSubsecuente = lstDatosDadoFrecuenciaSubsecuente;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoFrecuenciaNA() {
        return lstDatosDadoFrecuenciaNA;
    }

    public void setLstDatosDadoFrecuenciaNA(ArrayList<Victimas_2012> lstDatosDadoFrecuenciaNA) {
        this.lstDatosDadoFrecuenciaNA = lstDatosDadoFrecuenciaNA;
    }

    public PieChartModel getPieFrecuenciaAgresion() {
        return pieFrecuenciaAgresion;
    }

    public void setPieFrecuenciaAgresion(PieChartModel pieFrecuenciaAgresion) {
        this.pieFrecuenciaAgresion = pieFrecuenciaAgresion;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoFrecuencia() {
        return lstDatosDadoFrecuencia;
    }

    public void setLstDatosDadoFrecuencia(ArrayList<Victimas_2012> lstDatosDadoFrecuencia) {
        this.lstDatosDadoFrecuencia = lstDatosDadoFrecuencia;
    }

    public CartesianChartModel getLineFrecuenciaAGresion() {
        return lineFrecuenciaAGresion;
    }

    public void setLineFrecuenciaAGresion(CartesianChartModel lineFrecuenciaAGresion) {
        this.lineFrecuenciaAGresion = lineFrecuenciaAGresion;
    }

    public PieChartModel getPieViolencia() {
        return pieViolencia;
    }

    public void setPieViolencia(PieChartModel pieViolencia) {
        this.pieViolencia = pieViolencia;
    }

    public ArrayList<Victimas_2012> getLstDatosNA() {
        return lstDatosNA;
    }

    public void setLstDatosNA(ArrayList<Victimas_2012> lstDatosNA) {
        this.lstDatosNA = lstDatosNA;
    }

    public ArrayList<Victimas_2012> getLstDatosFisica() {
        return lstDatosFisica;
    }

    public void setLstDatosFisica(ArrayList<Victimas_2012> lstDatosFisica) {
        this.lstDatosFisica = lstDatosFisica;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaPsicologica() {
        return lstDatosFisicaPsicologica;
    }

    public void setLstDatosFisicaPsicologica(ArrayList<Victimas_2012> lstDatosFisicaPsicologica) {
        this.lstDatosFisicaPsicologica = lstDatosFisicaPsicologica;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaPsicologicaSexual() {
        return lstDatosFisicaPsicologicaSexual;
    }

    public void setLstDatosFisicaPsicologicaSexual(ArrayList<Victimas_2012> lstDatosFisicaPsicologicaSexual) {
        this.lstDatosFisicaPsicologicaSexual = lstDatosFisicaPsicologicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaSexual() {
        return lstDatosFisicaSexual;
    }

    public void setLstDatosFisicaSexual(ArrayList<Victimas_2012> lstDatosFisicaSexual) {
        this.lstDatosFisicaSexual = lstDatosFisicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosPsicologica() {
        return lstDatosPsicologica;
    }

    public void setLstDatosPsicologica(ArrayList<Victimas_2012> lstDatosPsicologica) {
        this.lstDatosPsicologica = lstDatosPsicologica;
    }

    public ArrayList<Victimas_2012> getLstDatosPsicologicaSexual() {
        return lstDatosPsicologicaSexual;
    }

    public void setLstDatosPsicologicaSexual(ArrayList<Victimas_2012> lstDatosPsicologicaSexual) {
        this.lstDatosPsicologicaSexual = lstDatosPsicologicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosSexual() {
        return lstDatosSexual;
    }

    public void setLstDatosSexual(ArrayList<Victimas_2012> lstDatosSexual) {
        this.lstDatosSexual = lstDatosSexual;
    }

    public CartesianChartModel getLineTipoViolencia2() {
        return lineTipoViolencia2;
    }

    public void setLineTipoViolencia2(CartesianChartModel lineTipoViolencia2) {
        this.lineTipoViolencia2 = lineTipoViolencia2;
    }

    public Victimas_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Victimas_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Victimas_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Victimas_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Victimas_2012> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Victimas_2012> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoViolencia() {
        return lstDatosDadoViolencia;
    }

    public void setLstDatosDadoViolencia(ArrayList<Victimas_2012> lstDatosDadoViolencia) {
        this.lstDatosDadoViolencia = lstDatosDadoViolencia;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public ControladorVictimas2012_Tratamiento() {
        this.reinit();
    }

    public void grficar() {
        lineTipoViolencia = initTipoViolencia();
        lineTipoViolencia2 = initTipoViolencia2();
        pieViolencia = pieViolencia();
        lineFrecuenciaAGresion = initFrecuenciaAgresion();
        pieFrecuenciaAgresion = pieFrecuenciaAgresion();
        lineTratamiento = initTratamiento();
        pieTratamiento = pieTratamiento();

    }

    @PostConstruct
    public void init() {
        grficar();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Victimas_2012>();
        this.lstDatos1 = new ArrayList<Victimas_2012>();
        this.lstDatosDadoViolencia = new ArrayList<Victimas_2012>();

        this.cargarDatos();
        this.init();

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVictimas_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getN_denuncia());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    private CartesianChartModel initTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FVictimas_2012.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            for (Victimas_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoViolencia = FVictimas_2012.ObtenerDatosDadoCircuito(lstDatos11.getTipos_agre());
                Violencia.set(lstDatos11.getTipos_agre(), lstDatosDadoViolencia.size());
            }
            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initTipoViolencia2() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica");
            lstDatosFisicaPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Psicologica");
            lstDatosFisicaPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica, Psicologica y Sexual");
            lstDatosFisicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Sexual");
            lstDatosPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica");
            lstDatosPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica y Sexual");
            lstDatosSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Sexual");
            lstDatosNA = FVictimas_2012.ObtenerDatosDadoViolencia("N/A");

            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            Violencia.set("Fisica", lstDatosFisica.size());
            Violencia.set("Fisica y Psicologica", lstDatosFisicaPsicologica.size());
            Violencia.set("Fisica, Psicologica y Sexual", lstDatosFisicaPsicologicaSexual.size());
            Violencia.set("Fisica y Sexual", lstDatosFisicaSexual.size());
            Violencia.set("Psicologica", lstDatosPsicologica.size());
            Violencia.set("Psicologica y Sexual", lstDatosPsicologicaSexual.size());
            Violencia.set("Sexual", lstDatosSexual.size());
            Violencia.set("Sin datos", lstDatosNA.size());

            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstDatosFisica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica");
            lstDatosFisicaPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Psicologica");
            lstDatosFisicaPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica, Psicologica y Sexual");
            lstDatosFisicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Sexual");
            lstDatosPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica");
            lstDatosPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica y Sexual");
            lstDatosSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Sexual");
            lstDatosNA = FVictimas_2012.ObtenerDatosDadoViolencia("N/A");

            pieModel.set("Fisica", lstDatosFisica.size());
            pieModel.set("Fisica y Psicologica", lstDatosFisicaPsicologica.size());
            pieModel.set("Fisica, Psicologica y Sexual", lstDatosFisicaPsicologicaSexual.size());
            pieModel.set("Fisica y Sexual", lstDatosFisicaSexual.size());
            pieModel.set("Psicologica", lstDatosPsicologica.size());
            pieModel.set("Psicologica y Sexual", lstDatosPsicologicaSexual.size());
            pieModel.set("Sexual", lstDatosSexual.size());
            pieModel.set("Sin datos", lstDatosNA.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel initFrecuenciaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FVictimas_2012.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();

            Violencia.setLabel("Frecuencia Agresion");
            for (Victimas_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoFrecuencia = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion(lstDatos11.getFrecuencia());
                Violencia.set(lstDatos11.getFrecuencia(), lstDatosDadoFrecuencia.size());
            }
            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initTratamiento() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FVictimas_2012.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();

            Violencia.setLabel("Frecuencia Agresion");
            for (Victimas_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoTratamiento = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion(lstDatos11.getTratamient());
                Violencia.set(lstDatos11.getTratamient(), lstDatosDadoTratamiento.size());
            }
            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieFrecuenciaAgresion() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();

            lstDatosDadoFrecuenciaPrimera = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion("Primera");
            lstDatosDadoFrecuenciaSubsecuente = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion("Subsecuente");
            lstDatosDadoFrecuenciaNA = FVictimas_2012.ObtenerDatosDadoFrecuenciaAgresion("N/A");

            pieModel.set("Primera", lstDatosDadoFrecuenciaPrimera.size());
            pieModel.set("Subsecuente", lstDatosDadoFrecuenciaSubsecuente.size());
            pieModel.set("Sin Especificar", lstDatosDadoFrecuenciaNA.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private PieChartModel pieTratamiento() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstDatosDadoTratamientoClinico = FVictimas_2012.ObtenerDatosDadoTratamiento("Clinico");
            lstDatosDadoTratamientoClinicoQuirurgicoPsicologico = FVictimas_2012.ObtenerDatosDadoTratamiento("Clinico, Quirurgico y Psicologico");
            lstDatosDadoTratamientoClinicoPsicologico = FVictimas_2012.ObtenerDatosDadoTratamiento("Clinico y Psicologico");
            lstDatosDadoTratamientoClinicoQuirurgico = FVictimas_2012.ObtenerDatosDadoTratamiento("Clinico y Quirurgico");
            lstDatosDadoTratamientoNA = FVictimas_2012.ObtenerDatosDadoTratamiento("N/A");
            lstDatosDadoTratamientoPsicologico = FVictimas_2012.ObtenerDatosDadoTratamiento("Psicologico");
            lstDatosDadoTratamientoQuirurgico = FVictimas_2012.ObtenerDatosDadoTratamiento("Quirurgico");

            pieModel.set("Clinico", lstDatosDadoTratamientoClinico.size());
            pieModel.set("Clinico, Quirurgico y Psicologico", lstDatosDadoTratamientoClinicoQuirurgicoPsicologico.size());
            pieModel.set("Clinico y Psicologico", lstDatosDadoTratamientoClinicoPsicologico.size());
            pieModel.set("Clinico y Quirurgico", lstDatosDadoTratamientoClinicoQuirurgico.size());
            pieModel.set("Sin definir", lstDatosDadoTratamientoNA.size());
            pieModel.set("Psicologico", lstDatosDadoTratamientoPsicologico.size());
            pieModel.set("Quirurgico", lstDatosDadoTratamientoQuirurgico.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }
}
