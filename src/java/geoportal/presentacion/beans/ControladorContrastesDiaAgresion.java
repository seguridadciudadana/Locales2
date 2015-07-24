/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif2012;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorContrastesDiaAgresion {

    /**
     * Creates a new instance of ControladorContrastesDiaAgresion
     */
    private ArrayList<Vif_2010> lstDatos2010;
    private ArrayList<Vif_2010> lstDatos2010DadoDia;
    private ArrayList<Vif_2011> lstDatos2011;
    private ArrayList<Vif2012> lstDatos2012;
    private ArrayList<Vif_2010> lstDatosLunes2010;
    private ArrayList<Vif_2010> lstDatosMartes2010;
    private ArrayList<Vif_2010> lstDatosMiercoles2010;
    private ArrayList<Vif_2010> lstDatosJueves2010;
    private ArrayList<Vif_2010> lstDatosViernes2010;
    private ArrayList<Vif_2010> lstDatosSabado2010;
    private ArrayList<Vif_2010> lstDatosDomingo2010;
    private ArrayList<Vif_2011> lstDatosLunes2011;
    private ArrayList<Vif_2011> lstDatosMartes2011;
    private ArrayList<Vif_2011> lstDatosMiercoles2011;
    private ArrayList<Vif_2011> lstDatosJueves2011;
    private ArrayList<Vif_2011> lstDatosViernes2011;
    private ArrayList<Vif_2011> lstDatosSabado2011;
    private ArrayList<Vif_2011> lstDatosDomingo2011;
    private ArrayList<Vif_2012> lstDatosLunes2012;
    private ArrayList<Vif_2012> lstDatosMartes2012;
    private ArrayList<Vif_2012> lstDatosMiercoles2012;
    private ArrayList<Vif_2012> lstDatosJueves2012;
    private ArrayList<Vif_2012> lstDatosViernes2012;
    private ArrayList<Vif_2012> lstDatosSabado2012;
    private ArrayList<Vif_2012> lstDatosDomingo2012;
    private CartesianChartModel ModelContrastesDia;
    private CartesianChartModel lineLunes;
    private CartesianChartModel lineMartes;
    private CartesianChartModel lineMiercoles;
    private CartesianChartModel lineJueves;
    private CartesianChartModel lineViernes;
    private CartesianChartModel lineSabado;
    private CartesianChartModel lineDomingo;
    private PieChartModel pieLunes;
    private PieChartModel pieMartes;
    private PieChartModel pieMiercoles;
    private PieChartModel pieJueves;
    private PieChartModel pieViernes;
    private PieChartModel pieSabado;
    private PieChartModel pieDomingo;

    public CartesianChartModel getLineLunes() {
        return lineLunes;
    }

    public void setLineLunes(CartesianChartModel lineLunes) {
        this.lineLunes = lineLunes;
    }

    public CartesianChartModel getLineMartes() {
        return lineMartes;
    }

    public void setLineMartes(CartesianChartModel lineMartes) {
        this.lineMartes = lineMartes;
    }

    public CartesianChartModel getLineMiercoles() {
        return lineMiercoles;
    }

    public void setLineMiercoles(CartesianChartModel lineMiercoles) {
        this.lineMiercoles = lineMiercoles;
    }

    public CartesianChartModel getLineJueves() {
        return lineJueves;
    }

    public void setLineJueves(CartesianChartModel lineJueves) {
        this.lineJueves = lineJueves;
    }

    public CartesianChartModel getLineViernes() {
        return lineViernes;
    }

    public void setLineViernes(CartesianChartModel lineViernes) {
        this.lineViernes = lineViernes;
    }

    public CartesianChartModel getLineSabado() {
        return lineSabado;
    }

    public void setLineSabado(CartesianChartModel lineSabado) {
        this.lineSabado = lineSabado;
    }

    public CartesianChartModel getLineDomingo() {
        return lineDomingo;
    }

    public void setLineDomingo(CartesianChartModel lineDomingo) {
        this.lineDomingo = lineDomingo;
    }

    public PieChartModel getPieLunes() {
        return pieLunes;
    }

    public void setPieLunes(PieChartModel pieLunes) {
        this.pieLunes = pieLunes;
    }

    public PieChartModel getPieMartes() {
        return pieMartes;
    }

    public void setPieMartes(PieChartModel pieMartes) {
        this.pieMartes = pieMartes;
    }

    public PieChartModel getPieMiercoles() {
        return pieMiercoles;
    }

    public void setPieMiercoles(PieChartModel pieMiercoles) {
        this.pieMiercoles = pieMiercoles;
    }

    public PieChartModel getPieJueves() {
        return pieJueves;
    }

    public void setPieJueves(PieChartModel pieJueves) {
        this.pieJueves = pieJueves;
    }

    public PieChartModel getPieViernes() {
        return pieViernes;
    }

    public void setPieViernes(PieChartModel pieViernes) {
        this.pieViernes = pieViernes;
    }

    public PieChartModel getPieSabado() {
        return pieSabado;
    }

    public void setPieSabado(PieChartModel pieSabado) {
        this.pieSabado = pieSabado;
    }

    public PieChartModel getPieDomingo() {
        return pieDomingo;
    }

    public void setPieDomingo(PieChartModel pieDomingo) {
        this.pieDomingo = pieDomingo;
    }

    public ArrayList<Vif_2012> getLstDatosLunes2012() {
        return lstDatosLunes2012;
    }

    public void setLstDatosLunes2012(ArrayList<Vif_2012> lstDatosLunes2012) {
        this.lstDatosLunes2012 = lstDatosLunes2012;
    }

    public ArrayList<Vif_2012> getLstDatosMartes2012() {
        return lstDatosMartes2012;
    }

    public void setLstDatosMartes2012(ArrayList<Vif_2012> lstDatosMartes2012) {
        this.lstDatosMartes2012 = lstDatosMartes2012;
    }

    public ArrayList<Vif_2012> getLstDatosMiercoles2012() {
        return lstDatosMiercoles2012;
    }

    public void setLstDatosMiercoles2012(ArrayList<Vif_2012> lstDatosMiercoles2012) {
        this.lstDatosMiercoles2012 = lstDatosMiercoles2012;
    }

    public ArrayList<Vif_2012> getLstDatosJueves2012() {
        return lstDatosJueves2012;
    }

    public void setLstDatosJueves2012(ArrayList<Vif_2012> lstDatosJueves2012) {
        this.lstDatosJueves2012 = lstDatosJueves2012;
    }

    public ArrayList<Vif_2012> getLstDatosViernes2012() {
        return lstDatosViernes2012;
    }

    public void setLstDatosViernes2012(ArrayList<Vif_2012> lstDatosViernes2012) {
        this.lstDatosViernes2012 = lstDatosViernes2012;
    }

    public ArrayList<Vif_2012> getLstDatosSabado2012() {
        return lstDatosSabado2012;
    }

    public void setLstDatosSabado2012(ArrayList<Vif_2012> lstDatosSabado2012) {
        this.lstDatosSabado2012 = lstDatosSabado2012;
    }

    public ArrayList<Vif_2012> getLstDatosDomingo2012() {
        return lstDatosDomingo2012;
    }

    public void setLstDatosDomingo2012(ArrayList<Vif_2012> lstDatosDomingo2012) {
        this.lstDatosDomingo2012 = lstDatosDomingo2012;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public ArrayList<Vif_2010> getLstDatos2010DadoDia() {
        return lstDatos2010DadoDia;
    }

    public void setLstDatos2010DadoDia(ArrayList<Vif_2010> lstDatos2010DadoDia) {
        this.lstDatos2010DadoDia = lstDatos2010DadoDia;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public ArrayList<Vif_2011> getLstDatos2011() {
        return lstDatos2011;
    }

    public void setLstDatos2011(ArrayList<Vif_2011> lstDatos2011) {
        this.lstDatos2011 = lstDatos2011;
    }

    public ArrayList<Vif2012> getLstDatos2012() {
        return lstDatos2012;
    }

    public void setLstDatos2012(ArrayList<Vif2012> lstDatos2012) {
        this.lstDatos2012 = lstDatos2012;
    }

    public ArrayList<Vif_2010> getLstDatosLunes2010() {
        return lstDatosLunes2010;
    }

    public void setLstDatosLunes2010(ArrayList<Vif_2010> lstDatosLunes2010) {
        this.lstDatosLunes2010 = lstDatosLunes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMartes2010() {
        return lstDatosMartes2010;
    }

    public void setLstDatosMartes2010(ArrayList<Vif_2010> lstDatosMartes2010) {
        this.lstDatosMartes2010 = lstDatosMartes2010;
    }

    public ArrayList<Vif_2010> getLstDatosMiercoles2010() {
        return lstDatosMiercoles2010;
    }

    public void setLstDatosMiercoles2010(ArrayList<Vif_2010> lstDatosMiercoles2010) {
        this.lstDatosMiercoles2010 = lstDatosMiercoles2010;
    }

    public ArrayList<Vif_2010> getLstDatosJueves2010() {
        return lstDatosJueves2010;
    }

    public void setLstDatosJueves2010(ArrayList<Vif_2010> lstDatosJueves2010) {
        this.lstDatosJueves2010 = lstDatosJueves2010;
    }

    public ArrayList<Vif_2010> getLstDatosViernes2010() {
        return lstDatosViernes2010;
    }

    public void setLstDatosViernes2010(ArrayList<Vif_2010> lstDatosViernes2010) {
        this.lstDatosViernes2010 = lstDatosViernes2010;
    }

    public ArrayList<Vif_2010> getLstDatosSabado2010() {
        return lstDatosSabado2010;
    }

    public void setLstDatosSabado2010(ArrayList<Vif_2010> lstDatosSabado2010) {
        this.lstDatosSabado2010 = lstDatosSabado2010;
    }

    public ArrayList<Vif_2010> getLstDatosDomingo2010() {
        return lstDatosDomingo2010;
    }

    public void setLstDatosDomingo2010(ArrayList<Vif_2010> lstDatosDomingo2010) {
        this.lstDatosDomingo2010 = lstDatosDomingo2010;
    }

    public ArrayList<Vif_2011> getLstDatosLunes2011() {
        return lstDatosLunes2011;
    }

    public void setLstDatosLunes2011(ArrayList<Vif_2011> lstDatosLunes2011) {
        this.lstDatosLunes2011 = lstDatosLunes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMartes2011() {
        return lstDatosMartes2011;
    }

    public void setLstDatosMartes2011(ArrayList<Vif_2011> lstDatosMartes2011) {
        this.lstDatosMartes2011 = lstDatosMartes2011;
    }

    public ArrayList<Vif_2011> getLstDatosMiercoles2011() {
        return lstDatosMiercoles2011;
    }

    public void setLstDatosMiercoles2011(ArrayList<Vif_2011> lstDatosMiercoles2011) {
        this.lstDatosMiercoles2011 = lstDatosMiercoles2011;
    }

    public ArrayList<Vif_2011> getLstDatosJueves2011() {
        return lstDatosJueves2011;
    }

    public void setLstDatosJueves2011(ArrayList<Vif_2011> lstDatosJueves2011) {
        this.lstDatosJueves2011 = lstDatosJueves2011;
    }

    public ArrayList<Vif_2011> getLstDatosViernes2011() {
        return lstDatosViernes2011;
    }

    public void setLstDatosViernes2011(ArrayList<Vif_2011> lstDatosViernes2011) {
        this.lstDatosViernes2011 = lstDatosViernes2011;
    }

    public ArrayList<Vif_2011> getLstDatosSabado2011() {
        return lstDatosSabado2011;
    }

    public void setLstDatosSabado2011(ArrayList<Vif_2011> lstDatosSabado2011) {
        this.lstDatosSabado2011 = lstDatosSabado2011;
    }

    public ArrayList<Vif_2011> getLstDatosDomingo2011() {
        return lstDatosDomingo2011;
    }

    public void setLstDatosDomingo2011(ArrayList<Vif_2011> lstDatosDomingo2011) {
        this.lstDatosDomingo2011 = lstDatosDomingo2011;
    }

    public CartesianChartModel getModelContrastesDia() {
        return ModelContrastesDia;
    }

    public void setModelContrastesDia(CartesianChartModel ModelContrastesDia) {
        this.ModelContrastesDia = ModelContrastesDia;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        ModelContrastesDia = initGraficoContrastesDias();
        pieLunes = graficaPieLunes();
        pieMartes = pieMartes();
        pieMiercoles = pieMiercoles();
        pieJueves = pieJueves();
        pieViernes = pieViernes();
        pieSabado = pieSabado();
        pieDomingo = pieDomingo();
        lineLunes = initLunes();
        lineMartes = initMartes();
        lineMiercoles = initMiercoles();
        lineJueves = initJueves();
        lineViernes = initViernes();
        lineSabado = initSabado();
        lineDomingo = initDomingo();

    }

    private void reinit() {
        this.lstDatosLunes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMartes2010 = new ArrayList<Vif_2010>();
        this.lstDatosMiercoles2010 = new ArrayList<Vif_2010>();
        this.lstDatosJueves2010 = new ArrayList<Vif_2010>();
        this.lstDatosViernes2010 = new ArrayList<Vif_2010>();
        this.lstDatosSabado2010 = new ArrayList<Vif_2010>();
        this.lstDatosDomingo2010 = new ArrayList<Vif_2010>();
        this.lstDatosLunes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMartes2011 = new ArrayList<Vif_2011>();
        this.lstDatosMiercoles2011 = new ArrayList<Vif_2011>();
        this.lstDatosJueves2011 = new ArrayList<Vif_2011>();
        this.lstDatosViernes2011 = new ArrayList<Vif_2011>();
        this.lstDatosSabado2011 = new ArrayList<Vif_2011>();
        this.lstDatosDomingo2011 = new ArrayList<Vif_2011>();
        this.lstDatosLunes2012 = new ArrayList<Vif_2012>();
        this.lstDatosMartes2012 = new ArrayList<Vif_2012>();
        this.lstDatosMiercoles2012 = new ArrayList<Vif_2012>();
        this.lstDatosJueves2012 = new ArrayList<Vif_2012>();
        this.lstDatosViernes2012 = new ArrayList<Vif_2012>();
        this.lstDatosSabado2012 = new ArrayList<Vif_2012>();
        this.lstDatosDomingo2012 = new ArrayList<Vif_2012>();
        this.init();

    }

    private CartesianChartModel initGraficoContrastesDias() {
        CartesianChartModel model = new CartesianChartModel();
        ArrayList<String> ListSemana = new ArrayList<String>();
        ListSemana.add("LUNES");
        ListSemana.add("MARTES");
        ListSemana.add("MIERCOLES");
        ListSemana.add("JUEVES");
        ListSemana.add("VIERNES");
        ListSemana.add("SABADO");
        ListSemana.add("DOMINGO");
        try {

            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");

            ChartSeries denuncias2010 = new ChartSeries();
            denuncias2010.setLabel("Denuncias 2010");
            denuncias2010.set("Lunes", lstDatosLunes2010.size());
            denuncias2010.set("Martes", lstDatosMartes2010.size());
            denuncias2010.set("Miercoles", lstDatosMiercoles2010.size());
            denuncias2010.set("Jueves", lstDatosJueves2010.size());
            denuncias2010.set("Viernes", lstDatosViernes2010.size());
            denuncias2010.set("Sabado", lstDatosSabado2010.size());
            denuncias2010.set("Domingo", lstDatosDomingo2010.size());

            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            ChartSeries denuncias2011 = new ChartSeries();
            denuncias2011.setLabel("Denuncias 2011");
            denuncias2011.set("Lunes", lstDatosLunes2011.size());
            denuncias2011.set("Martes", lstDatosMartes2011.size());
            denuncias2011.set("Miercoles", lstDatosMiercoles2011.size());
            denuncias2011.set("Jueves", lstDatosJueves2011.size());
            denuncias2011.set("Viernes", lstDatosViernes2011.size());
            denuncias2011.set("Sabado", lstDatosSabado2011.size());
            denuncias2011.set("Domingo", lstDatosDomingo2011.size());

            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            ChartSeries denuncias2012 = new ChartSeries();
            denuncias2012.setLabel("Denuncias 2012");
            denuncias2012.set("Lunes", lstDatosLunes2012.size());
            denuncias2012.set("Martes", lstDatosMartes2012.size());
            denuncias2012.set("Miercoles", lstDatosMiercoles2012.size());
            denuncias2012.set("Jueves", lstDatosJueves2012.size());
            denuncias2012.set("Viernes", lstDatosViernes2012.size());
            denuncias2012.set("Sabado", lstDatosSabado2012.size());
            denuncias2012.set("Domingo", lstDatosDomingo2012.size());

            model.addSeries(denuncias2010);
            model.addSeries(denuncias2011);
            model.addSeries(denuncias2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public ControladorContrastesDiaAgresion() {
        this.reinit();
    }

    private PieChartModel graficaPieLunes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosLunes2010.size());
            semana.set("2011", lstDatosLunes2011.size());
            semana.set("2012", lstDatosLunes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initLunes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosLunes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosLunes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("LUNES");
            lstDatosLunes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("LUNES");

            lunes.set("2010", lstDatosLunes2010.size());
            lunes.set("2011", lstDatosLunes2011.size());
            lunes.set("2012", lstDatosLunes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieMartes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosLunes2010.size());
            semana.set("2011", lstDatosLunes2011.size());
            semana.set("2012", lstDatosLunes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initMartes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosMartes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosMartes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MARTES");
            lstDatosMartes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MARTES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieMiercoles() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosMiercoles2010.size());
            semana.set("2011", lstDatosMiercoles2011.size());
            semana.set("2012", lstDatosMiercoles2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initMiercoles() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosMiercoles2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosMiercoles2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("MIERCOLES");
            lstDatosMiercoles2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("MIERCOLES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieJueves() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosJueves2010.size());
            semana.set("2011", lstDatosJueves2011.size());
            semana.set("2012", lstDatosJueves2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initJueves() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosJueves2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("DOMINGO");
            lstDatosJueves2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("JUEVES");
            lstDatosJueves2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("JUEVES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieViernes() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");

            semana = new PieChartModel();
            semana.set("2010", lstDatosViernes2010.size());
            semana.set("2011", lstDatosViernes2011.size());
            semana.set("2012", lstDatosViernes2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initViernes() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosViernes2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosViernes2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("VIERNES");
            lstDatosViernes2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("VIERNES");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieSabado() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");

            semana = new PieChartModel();
            semana.set("2010", lstDatosSabado2010.size());
            semana.set("2011", lstDatosSabado2011.size());
            semana.set("2012", lstDatosSabado2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initSabado() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosSabado2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("SABADO");
            lstDatosSabado2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("SABADO");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

    private PieChartModel pieDomingo() {
        PieChartModel semana = new PieChartModel();
        try {
            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            semana = new PieChartModel();
            semana.set("2010", lstDatosDomingo2010.size());
            semana.set("2011", lstDatosDomingo2011.size());
            semana.set("2012", lstDatosDomingo2012.size());

        } catch (Exception e) {

        }
        return semana;
    }

    private CartesianChartModel initDomingo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries lunes = new ChartSeries();
            lunes.setLabel("Lunes");

            lstDatosDomingo2010 = FVif_2010.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosDomingo2011 = FVif_2011.ObtenerDatosDadoDiaAgresion2("DOMINGO");
            lstDatosDomingo2012 = FVif_2012.ObtenerDatosDadoDiaAgresion2("DOMINGO");

            lunes.set("2010", lstDatosMartes2010.size());
            lunes.set("2011", lstDatosMartes2011.size());
            lunes.set("2012", lstDatosMartes2012.size());

            model.addSeries(lunes);

        } catch (Exception e) {
        }
        return model;
    }

}
