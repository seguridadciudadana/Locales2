package locales.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorEstadisticasGenerales {

    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoPermisoMunicipio;
    private ArrayList<Locales> lstLocalesDadoSiPermisoMunicipio;
    private ArrayList<Locales> lstLocalesDadoNoPermisoMunicipio;
    private ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMunicipio;
    private PieChartModel piePermisosMunicipio;
    private ArrayList<Locales> lstLocalesDadoPermisoBomberos;
    private ArrayList<Locales> lstLocalesDadoSiPermisoBomberos;
    private ArrayList<Locales> lstLocalesDadoNoPermisoBomberos;
    private ArrayList<Locales> lstLocalesDadoNoPresentaPermisoBomberos;
    private PieChartModel piePermisosBomberos;
    private ArrayList<Locales> lstLocalesDadoPermisoMI;
    private ArrayList<Locales> lstLocalesDadoSiPermisoMI;
    private ArrayList<Locales> lstLocalesDadoNoPermisoMI;
    private ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMI;
    private PieChartModel piePermisosMI;
    private ArrayList<Locales> lstLocalesDadoPermisoMSP;
    private ArrayList<Locales> lstLocalesDadoSiPermisoMSP;
    private ArrayList<Locales> lstLocalesDadoNoPermisoMSP;
    private ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMSP;
    private PieChartModel piePermisosMSP;
    private ArrayList<Locales> lstLocalesDadoPermisoMT;
    private ArrayList<Locales> lstLocalesDadoSiPermisoMT;
    private ArrayList<Locales> lstLocalesDadoNoPermisoMT;
    private ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMT;
    private PieChartModel piePermisosMT;
    private CartesianChartModel linePermisoMunicipio;
    private CartesianChartModel linePermisoMI;
    private CartesianChartModel linePermisoMSP;
    private CartesianChartModel linePermisoMT;
    private CartesianChartModel linePermisoBomberos;
    private ArrayList<Locales> lstLocalesDadoRucoRise;
    private ArrayList<Locales> lstLocalesDadoRucRucoRise;
    private ArrayList<Locales> lstLocalesDadoRiseRucoRise;
    private ArrayList<Locales> lstLocalesDadoNingunoRucoRise;
    private PieChartModel pieRucoRise;
    private CartesianChartModel lineRucoRise;
    private ArrayList<Locales> lstLocalesDadoTerrenosValdios;
    private ArrayList<Locales> lstLocalesDadoSiTerrenosValdios;
    private ArrayList<Locales> lstLocalesDadoNoTerrenosValdios;
    private ArrayList<Locales> lstLocalesDadoNoEspecificaTerrenosValdios;
    private PieChartModel pieTerrenosValdios;
    private CartesianChartModel lineTerrenosValdios;
    private ArrayList<Locales> lstLocalesDadoEspaciosAbiertos;
    private ArrayList<Locales> lstLocalesDadoSiEspaciosAbiertos;
    private ArrayList<Locales> lstLocalesDadoNoEspaciosAbiertos;
    private ArrayList<Locales> lstLocalesDadoNoEspecificaEspaciosAbiertos;
    private PieChartModel pieEspaciosAbiertos;
    private CartesianChartModel lineEspaciosAbiertos;
    private ArrayList<Locales> lstLocalesDadoVisualizacion;
    private ArrayList<Locales> lstLocalesDadoSiVisualizacion;
    private ArrayList<Locales> lstLocalesDadoNoVisualizacion;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarVisualizacion;
    private PieChartModel pieVisualizacion;
    private CartesianChartModel lineVisualizacion;
    private ArrayList<Locales> lstLocalesDadoIluminacion;
    private ArrayList<Locales> lstLocalesDadoSiIluminacion;
    private ArrayList<Locales> lstLocalesDadoNoIluminacion;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarIluminacion;
    private PieChartModel pieIluminacion;
    private CartesianChartModel lineIluminacion;
    private ArrayList<Locales> lstLocalesDadoEntSalEmergencia;
    private ArrayList<Locales> lstLocalesDadoSiEntSalEmergencia;
    private ArrayList<Locales> lstLocalesDadoNoEntSalEmergencia;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarEntSalEmergencia;
    private PieChartModel pieEntSalEmergencia;
    private CartesianChartModel lineEntSalEmergencia;
    private ArrayList<Locales> lstLocalesDadoEscondites;
    private ArrayList<Locales> lstLocalesDadoSiEscondites;
    private ArrayList<Locales> lstLocalesDadoNoEscondites;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarEscondites;
    private PieChartModel pieEscondites;
    private CartesianChartModel lineEscondites;
    private ArrayList<Locales> lstLocalesDadoLimpieza;
    private ArrayList<Locales> lstLocalesDadoSiLimpieza;
    private ArrayList<Locales> lstLocalesDadoNoLimpieza;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarLimpieza;
    private PieChartModel pieLimpieza;
    private CartesianChartModel lineLimpieza;
    private ArrayList<Locales> lstLocalesDadoSenializacion;
    private ArrayList<Locales> lstLocalesDadoSiSenializacion;
    private ArrayList<Locales> lstLocalesDadoNoSenializacion;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarSenializacion;
    private PieChartModel pieSenializacion;
    private CartesianChartModel lineSenializacion;
    private ArrayList<Locales> lstLocalesDadoExtintores;
    private ArrayList<Locales> lstLocalesDadoSiExtintores;
    private ArrayList<Locales> lstLocalesDadoNoExtintores;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarExtintores;
    private PieChartModel pieExtintores;
    private CartesianChartModel lineExtintores;
    private ArrayList<Locales> lstLocalesDadoCamarasEcu911;
    private ArrayList<Locales> lstLocalesDadoSiCamarasEcu911;
    private ArrayList<Locales> lstLocalesDadoNoCamarasEcu911;
    private ArrayList<Locales> lstLocalesDadoSinEspecificarCamarasEcu911;
    private PieChartModel pieCamarasEcu911;
    private CartesianChartModel lineCamarasEcu911;
    private ArrayList<Locales> lstLocalesSistemaSeguridad;
    private ArrayList<Locales> lstLocalesDadoSiSistemaSeguridad;
    private ArrayList<Locales> lstLocalesDadoNoSistemaSeguridad;
    private PieChartModel pieSistemaSeguridad;
    private CartesianChartModel lineSistemaSeguridad;
    private ArrayList<Locales> lstLocalesDadoTipo;
    private ArrayList<Locales> lstLocalesDadoEstatalTipo;
    private ArrayList<Locales> lstLocalesDadoPrivadoTipo;
    private ArrayList<Locales> lstLocalesDadoNingunoTipo;
    private PieChartModel pieTipo;
    private CartesianChartModel lineTipo;

    public ArrayList<Locales> getLstLocalesDadoIluminacion() {
        return lstLocalesDadoIluminacion;
    }

    public void setLstLocalesDadoIluminacion(ArrayList<Locales> lstLocalesDadoIluminacion) {
        this.lstLocalesDadoIluminacion = lstLocalesDadoIluminacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSiIluminacion() {
        return lstLocalesDadoSiIluminacion;
    }

    public void setLstLocalesDadoSiIluminacion(ArrayList<Locales> lstLocalesDadoSiIluminacion) {
        this.lstLocalesDadoSiIluminacion = lstLocalesDadoSiIluminacion;
    }

    public ArrayList<Locales> getLstLocalesDadoNoIluminacion() {
        return lstLocalesDadoNoIluminacion;
    }

    public void setLstLocalesDadoNoIluminacion(ArrayList<Locales> lstLocalesDadoNoIluminacion) {
        this.lstLocalesDadoNoIluminacion = lstLocalesDadoNoIluminacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarIluminacion() {
        return lstLocalesDadoSinEspecificarIluminacion;
    }

    public void setLstLocalesDadoSinEspecificarIluminacion(ArrayList<Locales> lstLocalesDadoSinEspecificarIluminacion) {
        this.lstLocalesDadoSinEspecificarIluminacion = lstLocalesDadoSinEspecificarIluminacion;
    }

    public PieChartModel getPieIluminacion() {
        return pieIluminacion;
    }

    public void setPieIluminacion(PieChartModel pieIluminacion) {
        this.pieIluminacion = pieIluminacion;
    }

    public CartesianChartModel getLineIluminacion() {
        return lineIluminacion;
    }

    public void setLineIluminacion(CartesianChartModel lineIluminacion) {
        this.lineIluminacion = lineIluminacion;
    }

    public ArrayList<Locales> getLstLocalesDadoEntSalEmergencia() {
        return lstLocalesDadoEntSalEmergencia;
    }

    public void setLstLocalesDadoEntSalEmergencia(ArrayList<Locales> lstLocalesDadoEntSalEmergencia) {
        this.lstLocalesDadoEntSalEmergencia = lstLocalesDadoEntSalEmergencia;
    }

    public ArrayList<Locales> getLstLocalesDadoSiEntSalEmergencia() {
        return lstLocalesDadoSiEntSalEmergencia;
    }

    public void setLstLocalesDadoSiEntSalEmergencia(ArrayList<Locales> lstLocalesDadoSiEntSalEmergencia) {
        this.lstLocalesDadoSiEntSalEmergencia = lstLocalesDadoSiEntSalEmergencia;
    }

    public ArrayList<Locales> getLstLocalesDadoNoEntSalEmergencia() {
        return lstLocalesDadoNoEntSalEmergencia;
    }

    public void setLstLocalesDadoNoEntSalEmergencia(ArrayList<Locales> lstLocalesDadoNoEntSalEmergencia) {
        this.lstLocalesDadoNoEntSalEmergencia = lstLocalesDadoNoEntSalEmergencia;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarEntSalEmergencia() {
        return lstLocalesDadoSinEspecificarEntSalEmergencia;
    }

    public void setLstLocalesDadoSinEspecificarEntSalEmergencia(ArrayList<Locales> lstLocalesDadoSinEspecificarEntSalEmergencia) {
        this.lstLocalesDadoSinEspecificarEntSalEmergencia = lstLocalesDadoSinEspecificarEntSalEmergencia;
    }

    public PieChartModel getPieEntSalEmergencia() {
        return pieEntSalEmergencia;
    }

    public void setPieEntSalEmergencia(PieChartModel pieEntSalEmergencia) {
        this.pieEntSalEmergencia = pieEntSalEmergencia;
    }

    public CartesianChartModel getLineEntSalEmergencia() {
        return lineEntSalEmergencia;
    }

    public void setLineEntSalEmergencia(CartesianChartModel lineEntSalEmergencia) {
        this.lineEntSalEmergencia = lineEntSalEmergencia;
    }

    public ArrayList<Locales> getLstLocalesDadoEscondites() {
        return lstLocalesDadoEscondites;
    }

    public void setLstLocalesDadoEscondites(ArrayList<Locales> lstLocalesDadoEscondites) {
        this.lstLocalesDadoEscondites = lstLocalesDadoEscondites;
    }

    public ArrayList<Locales> getLstLocalesDadoSiEscondites() {
        return lstLocalesDadoSiEscondites;
    }

    public void setLstLocalesDadoSiEscondites(ArrayList<Locales> lstLocalesDadoSiEscondites) {
        this.lstLocalesDadoSiEscondites = lstLocalesDadoSiEscondites;
    }

    public ArrayList<Locales> getLstLocalesDadoNoEscondites() {
        return lstLocalesDadoNoEscondites;
    }

    public void setLstLocalesDadoNoEscondites(ArrayList<Locales> lstLocalesDadoNoEscondites) {
        this.lstLocalesDadoNoEscondites = lstLocalesDadoNoEscondites;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarEscondites() {
        return lstLocalesDadoSinEspecificarEscondites;
    }

    public void setLstLocalesDadoSinEspecificarEscondites(ArrayList<Locales> lstLocalesDadoSinEspecificarEscondites) {
        this.lstLocalesDadoSinEspecificarEscondites = lstLocalesDadoSinEspecificarEscondites;
    }

    public PieChartModel getPieEscondites() {
        return pieEscondites;
    }

    public void setPieEscondites(PieChartModel pieEscondites) {
        this.pieEscondites = pieEscondites;
    }

    public CartesianChartModel getLineEscondites() {
        return lineEscondites;
    }

    public void setLineEscondites(CartesianChartModel lineEscondites) {
        this.lineEscondites = lineEscondites;
    }

    public ArrayList<Locales> getLstLocalesDadoLimpieza() {
        return lstLocalesDadoLimpieza;
    }

    public void setLstLocalesDadoLimpieza(ArrayList<Locales> lstLocalesDadoLimpieza) {
        this.lstLocalesDadoLimpieza = lstLocalesDadoLimpieza;
    }

    public ArrayList<Locales> getLstLocalesDadoSiLimpieza() {
        return lstLocalesDadoSiLimpieza;
    }

    public void setLstLocalesDadoSiLimpieza(ArrayList<Locales> lstLocalesDadoSiLimpieza) {
        this.lstLocalesDadoSiLimpieza = lstLocalesDadoSiLimpieza;
    }

    public ArrayList<Locales> getLstLocalesDadoNoLimpieza() {
        return lstLocalesDadoNoLimpieza;
    }

    public void setLstLocalesDadoNoLimpieza(ArrayList<Locales> lstLocalesDadoNoLimpieza) {
        this.lstLocalesDadoNoLimpieza = lstLocalesDadoNoLimpieza;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarLimpieza() {
        return lstLocalesDadoSinEspecificarLimpieza;
    }

    public void setLstLocalesDadoSinEspecificarLimpieza(ArrayList<Locales> lstLocalesDadoSinEspecificarLimpieza) {
        this.lstLocalesDadoSinEspecificarLimpieza = lstLocalesDadoSinEspecificarLimpieza;
    }

    public PieChartModel getPieLimpieza() {
        return pieLimpieza;
    }

    public void setPieLimpieza(PieChartModel pieLimpieza) {
        this.pieLimpieza = pieLimpieza;
    }

    public CartesianChartModel getLineLimpieza() {
        return lineLimpieza;
    }

    public void setLineLimpieza(CartesianChartModel lineLimpieza) {
        this.lineLimpieza = lineLimpieza;
    }

    public ArrayList<Locales> getLstLocalesDadoSenializacion() {
        return lstLocalesDadoSenializacion;
    }

    public void setLstLocalesDadoSenializacion(ArrayList<Locales> lstLocalesDadoSenializacion) {
        this.lstLocalesDadoSenializacion = lstLocalesDadoSenializacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSiSenializacion() {
        return lstLocalesDadoSiSenializacion;
    }

    public void setLstLocalesDadoSiSenializacion(ArrayList<Locales> lstLocalesDadoSiSenializacion) {
        this.lstLocalesDadoSiSenializacion = lstLocalesDadoSiSenializacion;
    }

    public ArrayList<Locales> getLstLocalesDadoNoSenializacion() {
        return lstLocalesDadoNoSenializacion;
    }

    public void setLstLocalesDadoNoSenializacion(ArrayList<Locales> lstLocalesDadoNoSenializacion) {
        this.lstLocalesDadoNoSenializacion = lstLocalesDadoNoSenializacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarSenializacion() {
        return lstLocalesDadoSinEspecificarSenializacion;
    }

    public void setLstLocalesDadoSinEspecificarSenializacion(ArrayList<Locales> lstLocalesDadoSinEspecificarSenializacion) {
        this.lstLocalesDadoSinEspecificarSenializacion = lstLocalesDadoSinEspecificarSenializacion;
    }

    public PieChartModel getPieSenializacion() {
        return pieSenializacion;
    }

    public void setPieSenializacion(PieChartModel pieSenializacion) {
        this.pieSenializacion = pieSenializacion;
    }

    public CartesianChartModel getLineSenializacion() {
        return lineSenializacion;
    }

    public void setLineSenializacion(CartesianChartModel lineSenializacion) {
        this.lineSenializacion = lineSenializacion;
    }

    public ArrayList<Locales> getLstLocalesDadoExtintores() {
        return lstLocalesDadoExtintores;
    }

    public void setLstLocalesDadoExtintores(ArrayList<Locales> lstLocalesDadoExtintores) {
        this.lstLocalesDadoExtintores = lstLocalesDadoExtintores;
    }

    public ArrayList<Locales> getLstLocalesDadoSiExtintores() {
        return lstLocalesDadoSiExtintores;
    }

    public void setLstLocalesDadoSiExtintores(ArrayList<Locales> lstLocalesDadoSiExtintores) {
        this.lstLocalesDadoSiExtintores = lstLocalesDadoSiExtintores;
    }

    public ArrayList<Locales> getLstLocalesDadoNoExtintores() {
        return lstLocalesDadoNoExtintores;
    }

    public void setLstLocalesDadoNoExtintores(ArrayList<Locales> lstLocalesDadoNoExtintores) {
        this.lstLocalesDadoNoExtintores = lstLocalesDadoNoExtintores;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarExtintores() {
        return lstLocalesDadoSinEspecificarExtintores;
    }

    public void setLstLocalesDadoSinEspecificarExtintores(ArrayList<Locales> lstLocalesDadoSinEspecificarExtintores) {
        this.lstLocalesDadoSinEspecificarExtintores = lstLocalesDadoSinEspecificarExtintores;
    }

    public PieChartModel getPieExtintores() {
        return pieExtintores;
    }

    public void setPieExtintores(PieChartModel pieExtintores) {
        this.pieExtintores = pieExtintores;
    }

    public CartesianChartModel getLineExtintores() {
        return lineExtintores;
    }

    public void setLineExtintores(CartesianChartModel lineExtintores) {
        this.lineExtintores = lineExtintores;
    }

    public ArrayList<Locales> getLstLocalesDadoCamarasEcu911() {
        return lstLocalesDadoCamarasEcu911;
    }

    public void setLstLocalesDadoCamarasEcu911(ArrayList<Locales> lstLocalesDadoCamarasEcu911) {
        this.lstLocalesDadoCamarasEcu911 = lstLocalesDadoCamarasEcu911;
    }

    public ArrayList<Locales> getLstLocalesDadoSiCamarasEcu911() {
        return lstLocalesDadoSiCamarasEcu911;
    }

    public void setLstLocalesDadoSiCamarasEcu911(ArrayList<Locales> lstLocalesDadoSiCamarasEcu911) {
        this.lstLocalesDadoSiCamarasEcu911 = lstLocalesDadoSiCamarasEcu911;
    }

    public ArrayList<Locales> getLstLocalesDadoNoCamarasEcu911() {
        return lstLocalesDadoNoCamarasEcu911;
    }

    public void setLstLocalesDadoNoCamarasEcu911(ArrayList<Locales> lstLocalesDadoNoCamarasEcu911) {
        this.lstLocalesDadoNoCamarasEcu911 = lstLocalesDadoNoCamarasEcu911;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarCamarasEcu911() {
        return lstLocalesDadoSinEspecificarCamarasEcu911;
    }

    public void setLstLocalesDadoSinEspecificarCamarasEcu911(ArrayList<Locales> lstLocalesDadoSinEspecificarCamarasEcu911) {
        this.lstLocalesDadoSinEspecificarCamarasEcu911 = lstLocalesDadoSinEspecificarCamarasEcu911;
    }

    public PieChartModel getPieCamarasEcu911() {
        return pieCamarasEcu911;
    }

    public void setPieCamarasEcu911(PieChartModel pieCamarasEcu911) {
        this.pieCamarasEcu911 = pieCamarasEcu911;
    }

    public CartesianChartModel getLineCamarasEcu911() {
        return lineCamarasEcu911;
    }

    public void setLineCamarasEcu911(CartesianChartModel lineCamarasEcu911) {
        this.lineCamarasEcu911 = lineCamarasEcu911;
    }

    public ArrayList<Locales> getLstLocalesSistemaSeguridad() {
        return lstLocalesSistemaSeguridad;
    }

    public void setLstLocalesSistemaSeguridad(ArrayList<Locales> lstLocalesSistemaSeguridad) {
        this.lstLocalesSistemaSeguridad = lstLocalesSistemaSeguridad;
    }

    public ArrayList<Locales> getLstLocalesDadoSiSistemaSeguridad() {
        return lstLocalesDadoSiSistemaSeguridad;
    }

    public void setLstLocalesDadoSiSistemaSeguridad(ArrayList<Locales> lstLocalesDadoSiSistemaSeguridad) {
        this.lstLocalesDadoSiSistemaSeguridad = lstLocalesDadoSiSistemaSeguridad;
    }

    public ArrayList<Locales> getLstLocalesDadoNoSistemaSeguridad() {
        return lstLocalesDadoNoSistemaSeguridad;
    }

    public void setLstLocalesDadoNoSistemaSeguridad(ArrayList<Locales> lstLocalesDadoNoSistemaSeguridad) {
        this.lstLocalesDadoNoSistemaSeguridad = lstLocalesDadoNoSistemaSeguridad;
    }

    public PieChartModel getPieSistemaSeguridad() {
        return pieSistemaSeguridad;
    }

    public void setPieSistemaSeguridad(PieChartModel pieSistemaSeguridad) {
        this.pieSistemaSeguridad = pieSistemaSeguridad;
    }

    public CartesianChartModel getLineSistemaSeguridad() {
        return lineSistemaSeguridad;
    }

    public void setLineSistemaSeguridad(CartesianChartModel lineSistemaSeguridad) {
        this.lineSistemaSeguridad = lineSistemaSeguridad;
    }

    public ArrayList<Locales> getLstLocalesDadoTipo() {
        return lstLocalesDadoTipo;
    }

    public void setLstLocalesDadoTipo(ArrayList<Locales> lstLocalesDadoTipo) {
        this.lstLocalesDadoTipo = lstLocalesDadoTipo;
    }

    public ArrayList<Locales> getLstLocalesDadoEstatalTipo() {
        return lstLocalesDadoEstatalTipo;
    }

    public void setLstLocalesDadoEstatalTipo(ArrayList<Locales> lstLocalesDadoEstatalTipo) {
        this.lstLocalesDadoEstatalTipo = lstLocalesDadoEstatalTipo;
    }

    public ArrayList<Locales> getLstLocalesDadoPrivadoTipo() {
        return lstLocalesDadoPrivadoTipo;
    }

    public void setLstLocalesDadoPrivadoTipo(ArrayList<Locales> lstLocalesDadoPrivadoTipo) {
        this.lstLocalesDadoPrivadoTipo = lstLocalesDadoPrivadoTipo;
    }

    public ArrayList<Locales> getLstLocalesDadoNingunoTipo() {
        return lstLocalesDadoNingunoTipo;
    }

    public void setLstLocalesDadoNingunoTipo(ArrayList<Locales> lstLocalesDadoNingunoTipo) {
        this.lstLocalesDadoNingunoTipo = lstLocalesDadoNingunoTipo;
    }

    public PieChartModel getPieTipo() {
        return pieTipo;
    }

    public void setPieTipo(PieChartModel pieTipo) {
        this.pieTipo = pieTipo;
    }

    public CartesianChartModel getLineTipo() {
        return lineTipo;
    }

    public void setLineTipo(CartesianChartModel lineTipo) {
        this.lineTipo = lineTipo;
    }

    public ArrayList<Locales> getLstLocalesDadoVisualizacion() {
        return lstLocalesDadoVisualizacion;
    }

    public void setLstLocalesDadoVisualizacion(ArrayList<Locales> lstLocalesDadoVisualizacion) {
        this.lstLocalesDadoVisualizacion = lstLocalesDadoVisualizacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSiVisualizacion() {
        return lstLocalesDadoSiVisualizacion;
    }

    public void setLstLocalesDadoSiVisualizacion(ArrayList<Locales> lstLocalesDadoSiVisualizacion) {
        this.lstLocalesDadoSiVisualizacion = lstLocalesDadoSiVisualizacion;
    }

    public ArrayList<Locales> getLstLocalesDadoNoVisualizacion() {
        return lstLocalesDadoNoVisualizacion;
    }

    public void setLstLocalesDadoNoVisualizacion(ArrayList<Locales> lstLocalesDadoNoVisualizacion) {
        this.lstLocalesDadoNoVisualizacion = lstLocalesDadoNoVisualizacion;
    }

    public ArrayList<Locales> getLstLocalesDadoSinEspecificarVisualizacion() {
        return lstLocalesDadoSinEspecificarVisualizacion;
    }

    public void setLstLocalesDadoSinEspecificarVisualizacion(ArrayList<Locales> lstLocalesDadoSinEspecificarVisualizacion) {
        this.lstLocalesDadoSinEspecificarVisualizacion = lstLocalesDadoSinEspecificarVisualizacion;
    }

    public PieChartModel getPieVisualizacion() {
        return pieVisualizacion;
    }

    public void setPieVisualizacion(PieChartModel pieVisualizacion) {
        this.pieVisualizacion = pieVisualizacion;
    }

    public CartesianChartModel getLineVisualizacion() {
        return lineVisualizacion;
    }

    public void setLineVisualizacion(CartesianChartModel lineVisualizacion) {
        this.lineVisualizacion = lineVisualizacion;
    }

    public ArrayList<Locales> getLstLocalesDadoEspaciosAbiertos() {
        return lstLocalesDadoEspaciosAbiertos;
    }

    public void setLstLocalesDadoEspaciosAbiertos(ArrayList<Locales> lstLocalesDadoEspaciosAbiertos) {
        this.lstLocalesDadoEspaciosAbiertos = lstLocalesDadoEspaciosAbiertos;
    }

    public ArrayList<Locales> getLstLocalesDadoSiEspaciosAbiertos() {
        return lstLocalesDadoSiEspaciosAbiertos;
    }

    public void setLstLocalesDadoSiEspaciosAbiertos(ArrayList<Locales> lstLocalesDadoSiEspaciosAbiertos) {
        this.lstLocalesDadoSiEspaciosAbiertos = lstLocalesDadoSiEspaciosAbiertos;
    }

    public ArrayList<Locales> getLstLocalesDadoNoEspaciosAbiertos() {
        return lstLocalesDadoNoEspaciosAbiertos;
    }

    public void setLstLocalesDadoNoEspaciosAbiertos(ArrayList<Locales> lstLocalesDadoNoEspaciosAbiertos) {
        this.lstLocalesDadoNoEspaciosAbiertos = lstLocalesDadoNoEspaciosAbiertos;
    }

    public ArrayList<Locales> getLstLocalesDadoNoEspecificaEspaciosAbiertos() {
        return lstLocalesDadoNoEspecificaEspaciosAbiertos;
    }

    public void setLstLocalesDadoNoEspecificaEspaciosAbiertos(ArrayList<Locales> lstLocalesDadoNoEspecificaEspaciosAbiertos) {
        this.lstLocalesDadoNoEspecificaEspaciosAbiertos = lstLocalesDadoNoEspecificaEspaciosAbiertos;
    }

    public PieChartModel getPieEspaciosAbiertos() {
        return pieEspaciosAbiertos;
    }

    public void setPieEspaciosAbiertos(PieChartModel pieEspaciosAbiertos) {
        this.pieEspaciosAbiertos = pieEspaciosAbiertos;
    }

    public CartesianChartModel getLineEspaciosAbiertos() {
        return lineEspaciosAbiertos;
    }

    public void setLineEspaciosAbiertos(CartesianChartModel lineEspaciosAbiertos) {
        this.lineEspaciosAbiertos = lineEspaciosAbiertos;
    }

    public ArrayList<Locales> getLstLocalesDadoTerrenosValdios() {
        return lstLocalesDadoTerrenosValdios;
    }

    public void setLstLocalesDadoTerrenosValdios(ArrayList<Locales> lstLocalesDadoTerrenosValdios) {
        this.lstLocalesDadoTerrenosValdios = lstLocalesDadoTerrenosValdios;
    }

    public ArrayList<Locales> getLstLocalesDadoSiTerrenosValdios() {
        return lstLocalesDadoSiTerrenosValdios;
    }

    public void setLstLocalesDadoSiTerrenosValdios(ArrayList<Locales> lstLocalesDadoSiTerrenosValdios) {
        this.lstLocalesDadoSiTerrenosValdios = lstLocalesDadoSiTerrenosValdios;
    }

    public ArrayList<Locales> getLstLocalesDadoNoTerrenosValdios() {
        return lstLocalesDadoNoTerrenosValdios;
    }

    public void setLstLocalesDadoNoTerrenosValdios(ArrayList<Locales> lstLocalesDadoNoTerrenosValdios) {
        this.lstLocalesDadoNoTerrenosValdios = lstLocalesDadoNoTerrenosValdios;
    }

    public ArrayList<Locales> getLstLocalesDadoNoEspecificaTerrenosValdios() {
        return lstLocalesDadoNoEspecificaTerrenosValdios;
    }

    public void setLstLocalesDadoNoEspecificaTerrenosValdios(ArrayList<Locales> lstLocalesDadoNoEspecificaTerrenosValdios) {
        this.lstLocalesDadoNoEspecificaTerrenosValdios = lstLocalesDadoNoEspecificaTerrenosValdios;
    }

    public PieChartModel getPieTerrenosValdios() {
        return pieTerrenosValdios;
    }

    public void setPieTerrenosValdios(PieChartModel pieTerrenosValdios) {
        this.pieTerrenosValdios = pieTerrenosValdios;
    }

    public CartesianChartModel getLineTerrenosValdios() {
        return lineTerrenosValdios;
    }

    public void setLineTerrenosValdios(CartesianChartModel lineTerrenosValdios) {
        this.lineTerrenosValdios = lineTerrenosValdios;
    }

    public ArrayList<Locales> getLstLocalesDadoRucoRise() {
        return lstLocalesDadoRucoRise;
    }

    public void setLstLocalesDadoRucoRise(ArrayList<Locales> lstLocalesDadoRucoRise) {
        this.lstLocalesDadoRucoRise = lstLocalesDadoRucoRise;
    }

    public ArrayList<Locales> getLstLocalesDadoRucRucoRise() {
        return lstLocalesDadoRucRucoRise;
    }

    public void setLstLocalesDadoRucRucoRise(ArrayList<Locales> lstLocalesDadoRucRucoRise) {
        this.lstLocalesDadoRucRucoRise = lstLocalesDadoRucRucoRise;
    }

    public ArrayList<Locales> getLstLocalesDadoRiseRucoRise() {
        return lstLocalesDadoRiseRucoRise;
    }

    public void setLstLocalesDadoRiseRucoRise(ArrayList<Locales> lstLocalesDadoRiseRucoRise) {
        this.lstLocalesDadoRiseRucoRise = lstLocalesDadoRiseRucoRise;
    }

    public ArrayList<Locales> getLstLocalesDadoNingunoRucoRise() {
        return lstLocalesDadoNingunoRucoRise;
    }

    public void setLstLocalesDadoNingunoRucoRise(ArrayList<Locales> lstLocalesDadoNingunoRucoRise) {
        this.lstLocalesDadoNingunoRucoRise = lstLocalesDadoNingunoRucoRise;
    }

    public PieChartModel getPieRucoRise() {
        return pieRucoRise;
    }

    public void setPieRucoRise(PieChartModel pieRucoRise) {
        this.pieRucoRise = pieRucoRise;
    }

    public CartesianChartModel getLineRucoRise() {
        return lineRucoRise;
    }

    public void setLineRucoRise(CartesianChartModel lineRucoRise) {
        this.lineRucoRise = lineRucoRise;
    }

    public CartesianChartModel getLinePermisoMI() {
        return linePermisoMI;
    }

    public void setLinePermisoMI(CartesianChartModel linePermisoMI) {
        this.linePermisoMI = linePermisoMI;
    }

    public CartesianChartModel getLinePermisoMSP() {
        return linePermisoMSP;
    }

    public void setLinePermisoMSP(CartesianChartModel linePermisoMSP) {
        this.linePermisoMSP = linePermisoMSP;
    }

    public CartesianChartModel getLinePermisoMT() {
        return linePermisoMT;
    }

    public void setLinePermisoMT(CartesianChartModel linePermisoMT) {
        this.linePermisoMT = linePermisoMT;
    }

    public CartesianChartModel getLinePermisoBomberos() {
        return linePermisoBomberos;
    }

    public void setLinePermisoBomberos(CartesianChartModel linePermisoBomberos) {
        this.linePermisoBomberos = linePermisoBomberos;
    }

    public CartesianChartModel getLinePermisoMunicipio() {
        return linePermisoMunicipio;
    }

    public void setLinePermisoMunicipio(CartesianChartModel linePermisoMunicipio) {
        this.linePermisoMunicipio = linePermisoMunicipio;
    }

    public ArrayList<Locales> getLstLocalesDadoSiPermisoMunicipio() {
        return lstLocalesDadoSiPermisoMunicipio;
    }

    public void setLstLocalesDadoSiPermisoMunicipio(ArrayList<Locales> lstLocalesDadoSiPermisoMunicipio) {
        this.lstLocalesDadoSiPermisoMunicipio = lstLocalesDadoSiPermisoMunicipio;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPermisoMunicipio() {
        return lstLocalesDadoNoPermisoMunicipio;
    }

    public void setLstLocalesDadoNoPermisoMunicipio(ArrayList<Locales> lstLocalesDadoNoPermisoMunicipio) {
        this.lstLocalesDadoNoPermisoMunicipio = lstLocalesDadoNoPermisoMunicipio;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPresentaPermisoMunicipio() {
        return lstLocalesDadoNoPresentaPermisoMunicipio;
    }

    public void setLstLocalesDadoNoPresentaPermisoMunicipio(ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMunicipio) {
        this.lstLocalesDadoNoPresentaPermisoMunicipio = lstLocalesDadoNoPresentaPermisoMunicipio;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoPermisoMunicipio() {
        return lstLocalesDadoPermisoMunicipio;
    }

    public void setLstLocalesDadoPermisoMunicipio(ArrayList<Locales> lstLocalesDadoPermisoMunicipio) {
        this.lstLocalesDadoPermisoMunicipio = lstLocalesDadoPermisoMunicipio;
    }

    public PieChartModel getPiePermisosMunicipio() {
        return piePermisosMunicipio;
    }

    public void setPiePermisosMunicipio(PieChartModel piePermisosMunicipio) {
        this.piePermisosMunicipio = piePermisosMunicipio;
    }

    public ArrayList<Locales> getLstLocalesDadoPermisoBomberos() {
        return lstLocalesDadoPermisoBomberos;
    }

    public void setLstLocalesDadoPermisoBomberos(ArrayList<Locales> lstLocalesDadoPermisoBomberos) {
        this.lstLocalesDadoPermisoBomberos = lstLocalesDadoPermisoBomberos;
    }

    public ArrayList<Locales> getLstLocalesDadoSiPermisoBomberos() {
        return lstLocalesDadoSiPermisoBomberos;
    }

    public void setLstLocalesDadoSiPermisoBomberos(ArrayList<Locales> lstLocalesDadoSiPermisoBomberos) {
        this.lstLocalesDadoSiPermisoBomberos = lstLocalesDadoSiPermisoBomberos;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPermisoBomberos() {
        return lstLocalesDadoNoPermisoBomberos;
    }

    public void setLstLocalesDadoNoPermisoBomberos(ArrayList<Locales> lstLocalesDadoNoPermisoBomberos) {
        this.lstLocalesDadoNoPermisoBomberos = lstLocalesDadoNoPermisoBomberos;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPresentaPermisoBomberos() {
        return lstLocalesDadoNoPresentaPermisoBomberos;
    }

    public void setLstLocalesDadoNoPresentaPermisoBomberos(ArrayList<Locales> lstLocalesDadoNoPresentaPermisoBomberos) {
        this.lstLocalesDadoNoPresentaPermisoBomberos = lstLocalesDadoNoPresentaPermisoBomberos;
    }

    public PieChartModel getPiePermisosBomberos() {
        return piePermisosBomberos;
    }

    public void setPiePermisosBomberos(PieChartModel piePermisosBomberos) {
        this.piePermisosBomberos = piePermisosBomberos;
    }

    public ArrayList<Locales> getLstLocalesDadoPermisoMI() {
        return lstLocalesDadoPermisoMI;
    }

    public void setLstLocalesDadoPermisoMI(ArrayList<Locales> lstLocalesDadoPermisoMI) {
        this.lstLocalesDadoPermisoMI = lstLocalesDadoPermisoMI;
    }

    public ArrayList<Locales> getLstLocalesDadoSiPermisoMI() {
        return lstLocalesDadoSiPermisoMI;
    }

    public void setLstLocalesDadoSiPermisoMI(ArrayList<Locales> lstLocalesDadoSiPermisoMI) {
        this.lstLocalesDadoSiPermisoMI = lstLocalesDadoSiPermisoMI;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPermisoMI() {
        return lstLocalesDadoNoPermisoMI;
    }

    public void setLstLocalesDadoNoPermisoMI(ArrayList<Locales> lstLocalesDadoNoPermisoMI) {
        this.lstLocalesDadoNoPermisoMI = lstLocalesDadoNoPermisoMI;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPresentaPermisoMI() {
        return lstLocalesDadoNoPresentaPermisoMI;
    }

    public void setLstLocalesDadoNoPresentaPermisoMI(ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMI) {
        this.lstLocalesDadoNoPresentaPermisoMI = lstLocalesDadoNoPresentaPermisoMI;
    }

    public PieChartModel getPiePermisosMI() {
        return piePermisosMI;
    }

    public void setPiePermisosMI(PieChartModel piePermisosMI) {
        this.piePermisosMI = piePermisosMI;
    }

    public ArrayList<Locales> getLstLocalesDadoPermisoMSP() {
        return lstLocalesDadoPermisoMSP;
    }

    public void setLstLocalesDadoPermisoMSP(ArrayList<Locales> lstLocalesDadoPermisoMSP) {
        this.lstLocalesDadoPermisoMSP = lstLocalesDadoPermisoMSP;
    }

    public ArrayList<Locales> getLstLocalesDadoSiPermisoMSP() {
        return lstLocalesDadoSiPermisoMSP;
    }

    public void setLstLocalesDadoSiPermisoMSP(ArrayList<Locales> lstLocalesDadoSiPermisoMSP) {
        this.lstLocalesDadoSiPermisoMSP = lstLocalesDadoSiPermisoMSP;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPermisoMSP() {
        return lstLocalesDadoNoPermisoMSP;
    }

    public void setLstLocalesDadoNoPermisoMSP(ArrayList<Locales> lstLocalesDadoNoPermisoMSP) {
        this.lstLocalesDadoNoPermisoMSP = lstLocalesDadoNoPermisoMSP;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPresentaPermisoMSP() {
        return lstLocalesDadoNoPresentaPermisoMSP;
    }

    public void setLstLocalesDadoNoPresentaPermisoMSP(ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMSP) {
        this.lstLocalesDadoNoPresentaPermisoMSP = lstLocalesDadoNoPresentaPermisoMSP;
    }

    public PieChartModel getPiePermisosMSP() {
        return piePermisosMSP;
    }

    public void setPiePermisosMSP(PieChartModel piePermisosMSP) {
        this.piePermisosMSP = piePermisosMSP;
    }

    public ArrayList<Locales> getLstLocalesDadoPermisoMT() {
        return lstLocalesDadoPermisoMT;
    }

    public void setLstLocalesDadoPermisoMT(ArrayList<Locales> lstLocalesDadoPermisoMT) {
        this.lstLocalesDadoPermisoMT = lstLocalesDadoPermisoMT;
    }

    public ArrayList<Locales> getLstLocalesDadoSiPermisoMT() {
        return lstLocalesDadoSiPermisoMT;
    }

    public void setLstLocalesDadoSiPermisoMT(ArrayList<Locales> lstLocalesDadoSiPermisoMT) {
        this.lstLocalesDadoSiPermisoMT = lstLocalesDadoSiPermisoMT;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPermisoMT() {
        return lstLocalesDadoNoPermisoMT;
    }

    public void setLstLocalesDadoNoPermisoMT(ArrayList<Locales> lstLocalesDadoNoPermisoMT) {
        this.lstLocalesDadoNoPermisoMT = lstLocalesDadoNoPermisoMT;
    }

    public ArrayList<Locales> getLstLocalesDadoNoPresentaPermisoMT() {
        return lstLocalesDadoNoPresentaPermisoMT;
    }

    public void setLstLocalesDadoNoPresentaPermisoMT(ArrayList<Locales> lstLocalesDadoNoPresentaPermisoMT) {
        this.lstLocalesDadoNoPresentaPermisoMT = lstLocalesDadoNoPresentaPermisoMT;
    }

    public PieChartModel getPiePermisosMT() {
        return piePermisosMT;
    }

    public void setPiePermisosMT(PieChartModel piePermisosMT) {
        this.piePermisosMT = piePermisosMT;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.piePermisosMunicipio = piePermisoMunicipio();
        this.piePermisosBomberos = piePermisoBomberos();
        this.piePermisosMI = piePermisoMI();
        this.piePermisosMSP = piePermisoMSP();
        this.piePermisosMT = piePermisoMT();
        this.linePermisoMunicipio = graficaPermisoMunicipio();
        this.linePermisoBomberos = graficaPermisoBomberos();
        this.linePermisoMI = graficaPermisoMI();
        this.linePermisoMSP = graficaPermisoMSP();
        this.linePermisoMT = graficaPermisoMT();
        this.pieRucoRise = pieRucoRise();
        this.lineRucoRise = graficaRucoRise();
        this.pieTerrenosValdios = pieTerrenosValdios();
        this.lineTerrenosValdios = graficaTerrenosValdios();
        this.pieEspaciosAbiertos = pieEspaciosAbiertos();
        this.lineEspaciosAbiertos = graficaEspaciosAbiertos();
        this.pieVisualizacion = pieVisualizacion();
        this.lineVisualizacion = graficaVisualizacion();
        this.pieIluminacion = pieIluminacion();
        this.lineIluminacion = graficaIluminacion();
        this.pieEntSalEmergencia = pieEntSalEmergencia();
        this.lineEntSalEmergencia = graficaEntSalEmergencia();
        this.pieEscondites = pieEscondites();
        this.lineEscondites = graficaEscondites();
        

    }

    private void reinit() {
        this.init();
    }

    public ControladorEstadisticasGenerales() {
        this.reinit();
    }

    private PieChartModel piePermisoMunicipio() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("Si");
            lstLocalesDadoNoPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("No");
            lstLocalesDadoNoPresentaPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("No Presenta");

            pieModel.set("Si dispone", lstLocalesDadoSiPermisoMunicipio.size());
            pieModel.set("No dispone", lstLocalesDadoNoPermisoMunicipio.size());
            pieModel.set("No presenta", lstLocalesDadoNoPresentaPermisoMunicipio.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaPermisoMunicipio() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("Si");
            lstLocalesDadoNoPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("No");
            lstLocalesDadoNoPresentaPermisoMunicipio = FLocales.ObtenerDatosDadoPermisoMunicipio("No Presenta");

            ChartSeries permisoMunicipio = new ChartSeries();
            permisoMunicipio.setLabel("Permiso del Municipio");
            permisoMunicipio.set("Si dispone", lstLocalesDadoSiPermisoMunicipio.size());
            permisoMunicipio.set("No dispone", lstLocalesDadoNoPermisoMunicipio.size());
            permisoMunicipio.set("No presenta", lstLocalesDadoNoPresentaPermisoMunicipio.size());

            model.addSeries(permisoMunicipio);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel piePermisoBomberos() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("Si");
            lstLocalesDadoNoPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("No");
            lstLocalesDadoNoPresentaPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("No Presenta");

            pieModel.set("Si dispone", lstLocalesDadoSiPermisoBomberos.size());
            pieModel.set("No dispone", lstLocalesDadoNoPermisoBomberos.size());
            pieModel.set("No presenta", lstLocalesDadoNoPresentaPermisoBomberos.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaPermisoBomberos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("Si");
            lstLocalesDadoNoPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("No");
            lstLocalesDadoNoPresentaPermisoBomberos = FLocales.ObtenerDatosDadoPermisoBomberos("No Presenta");

            ChartSeries permisoBomberos = new ChartSeries();
            permisoBomberos.setLabel("Permiso de los Bomberos");
            permisoBomberos.set("Si dispone", lstLocalesDadoSiPermisoBomberos.size());
            permisoBomberos.set("No dispone", lstLocalesDadoNoPermisoBomberos.size());
            permisoBomberos.set("No presenta", lstLocalesDadoNoPresentaPermisoBomberos.size());

            model.addSeries(permisoBomberos);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel piePermisoMI() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("Si");
            lstLocalesDadoNoPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("No");
            lstLocalesDadoNoPresentaPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("No Presenta");

            pieModel.set("Si dispone", lstLocalesDadoSiPermisoMI.size());
            pieModel.set("No dispone", lstLocalesDadoNoPermisoMI.size());
            pieModel.set("No presenta", lstLocalesDadoNoPresentaPermisoMI.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaPermisoMI() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("Si");
            lstLocalesDadoNoPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("No");
            lstLocalesDadoNoPresentaPermisoMI = FLocales.ObtenerDatosDadoPermisoMI("No Presenta");

            ChartSeries permisoMI = new ChartSeries();
            permisoMI.setLabel("Permiso del MI");
            permisoMI.set("Si dispone", lstLocalesDadoSiPermisoMI.size());
            permisoMI.set("No dispone", lstLocalesDadoNoPermisoMI.size());
            permisoMI.set("No presenta", lstLocalesDadoNoPresentaPermisoMI.size());

            model.addSeries(permisoMI);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel piePermisoMSP() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("Si");
            lstLocalesDadoNoPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("No");
            lstLocalesDadoNoPresentaPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("No Presenta");

            pieModel.set("Si dispone", lstLocalesDadoSiPermisoMSP.size());
            pieModel.set("No dispone", lstLocalesDadoNoPermisoMSP.size());
            pieModel.set("No presenta", lstLocalesDadoNoPresentaPermisoMSP.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaPermisoMSP() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("Si");
            lstLocalesDadoNoPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("No");
            lstLocalesDadoNoPresentaPermisoMSP = FLocales.ObtenerDatosDadoPermisoMSP("No Presenta");

            ChartSeries permisoMSP = new ChartSeries();
            permisoMSP.setLabel("Permiso del MSP");
            permisoMSP.set("Si dispone", lstLocalesDadoSiPermisoMSP.size());
            permisoMSP.set("No dispone", lstLocalesDadoNoPermisoMSP.size());
            permisoMSP.set("No presenta", lstLocalesDadoNoPresentaPermisoMSP.size());

            model.addSeries(permisoMSP);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel piePermisoMT() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("Si");
            lstLocalesDadoNoPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("No");
            lstLocalesDadoNoPresentaPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("No Presenta");

            pieModel.set("Si dispone", lstLocalesDadoSiPermisoMT.size());
            pieModel.set("No dispone", lstLocalesDadoNoPermisoMT.size());
            pieModel.set("No presenta", lstLocalesDadoNoPresentaPermisoMT.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaPermisoMT() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("Si");
            lstLocalesDadoNoPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("No");
            lstLocalesDadoNoPresentaPermisoMT = FLocales.ObtenerDatosDadoPermisoMT("No Presenta");

            ChartSeries permisoMT = new ChartSeries();
            permisoMT.setLabel("Permiso del MT");
            permisoMT.set("Si dispone", lstLocalesDadoSiPermisoMT.size());
            permisoMT.set("No dispone", lstLocalesDadoNoPermisoMT.size());
            permisoMT.set("No presenta", lstLocalesDadoNoPresentaPermisoMT.size());

            model.addSeries(permisoMT);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieRucoRise() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoRucRucoRise = FLocales.ObtenerDatosDadoRucoRise("RUC");
            lstLocalesDadoRiseRucoRise = FLocales.ObtenerDatosDadoRucoRise("RISE");
            lstLocalesDadoNingunoRucoRise = FLocales.ObtenerDatosDadoRucoRise("Ninguno");

            pieModel.set("Dispone RUC", lstLocalesDadoRucRucoRise.size());
            pieModel.set("Dispone RISE", lstLocalesDadoRiseRucoRise.size());
            pieModel.set("Ninguno", lstLocalesDadoNingunoRucoRise.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaRucoRise() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoRucRucoRise = FLocales.ObtenerDatosDadoRucoRise("RUC");
            lstLocalesDadoRiseRucoRise = FLocales.ObtenerDatosDadoRucoRise("RISE");
            lstLocalesDadoNingunoRucoRise = FLocales.ObtenerDatosDadoRucoRise("Ninguno");

            ChartSeries rucorise = new ChartSeries();
            rucorise.setLabel("RUC o RISE");
            rucorise.set("Dispone RUC", lstLocalesDadoRucRucoRise.size());
            rucorise.set("Dispone RISE", lstLocalesDadoRiseRucoRise.size());
            rucorise.set("Ninguno", lstLocalesDadoNingunoRucoRise.size());

            model.addSeries(rucorise);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieTerrenosValdios() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("Si");
            lstLocalesDadoNoTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("No");
            lstLocalesDadoNoEspecificaTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("No Especifica");

            pieModel.set("Si", lstLocalesDadoSiTerrenosValdios.size());
            pieModel.set("No", lstLocalesDadoNoTerrenosValdios.size());
            pieModel.set("No Especifica", lstLocalesDadoNoEspecificaTerrenosValdios.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaTerrenosValdios() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("Si");
            lstLocalesDadoNoTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("No");
            lstLocalesDadoNoEspecificaTerrenosValdios = FLocales.ObtenerDatosDadoTerrenosValdios("No Especifica");

            ChartSeries terrenosvaldios = new ChartSeries();
            terrenosvaldios.setLabel("Terrenos Valdios");
            terrenosvaldios.set("Si", lstLocalesDadoSiTerrenosValdios.size());
            terrenosvaldios.set("No", lstLocalesDadoNoTerrenosValdios.size());
            terrenosvaldios.set("No Especifica", lstLocalesDadoNoEspecificaTerrenosValdios.size());

            model.addSeries(terrenosvaldios);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieEspaciosAbiertos() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("Si");
            lstLocalesDadoNoEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("No");
            lstLocalesDadoNoEspecificaEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("No Especifica");

            pieModel.set("Si", lstLocalesDadoSiEspaciosAbiertos.size());
            pieModel.set("No", lstLocalesDadoNoEspaciosAbiertos.size());
            pieModel.set("No Especifica", lstLocalesDadoNoEspecificaEspaciosAbiertos.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaEspaciosAbiertos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("Si");
            lstLocalesDadoNoEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("No");
            lstLocalesDadoNoEspecificaEspaciosAbiertos = FLocales.ObtenerDatosDadoEspaciosAbiertos("No Especifica");

            ChartSeries espaciosabiertos = new ChartSeries();
            espaciosabiertos.setLabel("Espacios Abiertos");
            espaciosabiertos.set("Si", lstLocalesDadoSiEspaciosAbiertos.size());
            espaciosabiertos.set("No", lstLocalesDadoNoEspaciosAbiertos.size());
            espaciosabiertos.set("No Especifica", lstLocalesDadoNoEspecificaEspaciosAbiertos.size());

            model.addSeries(espaciosabiertos);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieVisualizacion() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("Si");
            lstLocalesDadoNoVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("No");
            lstLocalesDadoSinEspecificarVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("Sin especificar");

            pieModel.set("Si", lstLocalesDadoSiVisualizacion.size());
            pieModel.set("No", lstLocalesDadoNoVisualizacion.size());
            pieModel.set("Sin especificar", lstLocalesDadoSinEspecificarVisualizacion.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaVisualizacion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("Si");
            lstLocalesDadoNoVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("No");
            lstLocalesDadoSinEspecificarVisualizacion = FLocales.ObtenerDatosDadoVisualizacion("Sin especificar");

            ChartSeries visualiza = new ChartSeries();
            visualiza.setLabel("Visualizacion");
            visualiza.set("Si", lstLocalesDadoSiVisualizacion.size());
            visualiza.set("No", lstLocalesDadoNoVisualizacion.size());
            visualiza.set("Sin especificar", lstLocalesDadoSinEspecificarVisualizacion.size());

            model.addSeries(visualiza);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieIluminacion() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiIluminacion = FLocales.ObtenerDatosDadoIluminacion("Si");
            lstLocalesDadoNoIluminacion = FLocales.ObtenerDatosDadoIluminacion("No");
            lstLocalesDadoSinEspecificarIluminacion = FLocales.ObtenerDatosDadoIluminacion("Sin especificar");

            pieModel.set("Si", lstLocalesDadoSiIluminacion.size());
            pieModel.set("No", lstLocalesDadoNoIluminacion.size());
            pieModel.set("Sin especificar", lstLocalesDadoSinEspecificarIluminacion.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaIluminacion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiIluminacion = FLocales.ObtenerDatosDadoIluminacion("Si");
            lstLocalesDadoNoIluminacion = FLocales.ObtenerDatosDadoIluminacion("No");
            lstLocalesDadoSinEspecificarIluminacion = FLocales.ObtenerDatosDadoIluminacion("Sin especificar");

            ChartSeries ilumina = new ChartSeries();
            ilumina.setLabel("Visualizacion");
            ilumina.set("Si", lstLocalesDadoSiIluminacion.size());
            ilumina.set("No", lstLocalesDadoNoIluminacion.size());
            ilumina.set("Sin especificar", lstLocalesDadoSinEspecificarIluminacion.size());

            model.addSeries(ilumina);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieEntSalEmergencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("Si");
            lstLocalesDadoNoEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("No");
            lstLocalesDadoSinEspecificarEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("Sin especificar");

            pieModel.set("Si", lstLocalesDadoSiEntSalEmergencia.size());
            pieModel.set("No", lstLocalesDadoNoEntSalEmergencia.size());
            pieModel.set("Sin especificar", lstLocalesDadoSinEspecificarEntSalEmergencia.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaEntSalEmergencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("Si");
            lstLocalesDadoNoEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("No");
            lstLocalesDadoSinEspecificarEntSalEmergencia = FLocales.ObtenerDatosDadoEntSalEmergencia("Sin especificar");

            ChartSeries emerg = new ChartSeries();
            emerg.setLabel("Visualizacion");
            emerg.set("Si", lstLocalesDadoSiEntSalEmergencia.size());
            emerg.set("No", lstLocalesDadoNoEntSalEmergencia.size());
            emerg.set("Sin especificar", lstLocalesDadoSinEspecificarEntSalEmergencia.size());

            model.addSeries(emerg);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
     private PieChartModel pieEscondites() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstLocalesDadoSiEscondites = FLocales.ObtenerDatosDadoEscondites("Si");
            lstLocalesDadoNoEscondites = FLocales.ObtenerDatosDadoEscondites("No");
            lstLocalesDadoSinEspecificarEscondites = FLocales.ObtenerDatosDadoEscondites("Sin especificar");

            pieModel.set("Si", lstLocalesDadoSiEscondites.size());
            pieModel.set("No", lstLocalesDadoNoEscondites.size());
            pieModel.set("Sin especificar", lstLocalesDadoSinEspecificarEscondites.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaEscondites() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesDadoSiEscondites = FLocales.ObtenerDatosDadoEscondites("Si");
            lstLocalesDadoNoEscondites = FLocales.ObtenerDatosDadoEscondites("No");
            lstLocalesDadoSinEspecificarEscondites = FLocales.ObtenerDatosDadoEscondites("Sin especificar");


            ChartSeries escond = new ChartSeries();
            escond.setLabel("Visualizacion");
            escond.set("Si", lstLocalesDadoSiEscondites.size());
            escond.set("No", lstLocalesDadoNoEscondites.size());
            escond.set("Sin especificar", lstLocalesDadoSinEspecificarEscondites.size());

            model.addSeries(escond);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
