/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import geoportal.rural.logica.funciones.FVifRural2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRuralOcupacion {

    /**
     * Creates a new instance of Controlador_VifRuralOcupacion
     */
    private ArrayList<VifRural2011> lstAgricultor;
    private ArrayList<VifRural2011> lstComerciante;
    private ArrayList<VifRural2011> lstEmpleadoPrivado;
    private ArrayList<VifRural2011> lstEmpleadoPublico;
    private ArrayList<VifRural2011> lstEstudiante;
    private ArrayList<VifRural2011> lstJornalero;
    private ArrayList<VifRural2011> lstProfesional;
    private ArrayList<VifRural2011> lstQD;
    private ArrayList<VifRural2011> lstAgricultorSexoMasculino;
    private ArrayList<VifRural2011> lstComercianteSexoMasculino;
    private ArrayList<VifRural2011> lstEmpleadoPrivadoSexoMasculino;
    private ArrayList<VifRural2011> lstEmpleadoPublicoSexoMasculino;
    private ArrayList<VifRural2011> lstEstudianteSexoMasculino;
    private ArrayList<VifRural2011> lstJornaleroSexoMasculino;
    private ArrayList<VifRural2011> lstProfesionalSexoMasculino;
    private ArrayList<VifRural2011> lstQDSexoMasculino;
    private CartesianChartModel lineOcupacionesSexoMasculino;
    private ArrayList<VifRural2011> lstAgricultorSexoFemenino;
    private ArrayList<VifRural2011> lstComercianteSexoFemenino;
    private ArrayList<VifRural2011> lstEmpleadoPrivadoSexoFemenino;
    private ArrayList<VifRural2011> lstEmpleadoPublicoSexoFemenino;
    private ArrayList<VifRural2011> lstEstudianteSexoFemenino;
    private ArrayList<VifRural2011> lstJornaleroSexoFemenino;
    private ArrayList<VifRural2011> lstProfesionalSexoFemenino;
    private ArrayList<VifRural2011> lstQDSexoFemenino;
    private CartesianChartModel lineOcupacionesSexoFemenino;
    private CartesianChartModel lineOcupaciones;
    private CartesianChartModel lineOcupacionesSexoVictima;
    private CartesianChartModel lineOcupaciones2011;
    private CartesianChartModel lineOcupacionesSexoVictima2011;
    private CartesianChartModel lineOcupaciones2012;
    private CartesianChartModel lineOcupacionesSexoVictima2012;

    public CartesianChartModel getLineOcupaciones2011() {
        return lineOcupaciones2011;
    }

    public void setLineOcupaciones2011(CartesianChartModel lineOcupaciones2011) {
        this.lineOcupaciones2011 = lineOcupaciones2011;
    }

    public CartesianChartModel getLineOcupacionesSexoVictima2011() {
        return lineOcupacionesSexoVictima2011;
    }

    public void setLineOcupacionesSexoVictima2011(CartesianChartModel lineOcupacionesSexoVictima2011) {
        this.lineOcupacionesSexoVictima2011 = lineOcupacionesSexoVictima2011;
    }

    public CartesianChartModel getLineOcupaciones2012() {
        return lineOcupaciones2012;
    }

    public void setLineOcupaciones2012(CartesianChartModel lineOcupaciones2012) {
        this.lineOcupaciones2012 = lineOcupaciones2012;
    }

    public CartesianChartModel getLineOcupacionesSexoVictima2012() {
        return lineOcupacionesSexoVictima2012;
    }

    public void setLineOcupacionesSexoVictima2012(CartesianChartModel lineOcupacionesSexoVictima2012) {
        this.lineOcupacionesSexoVictima2012 = lineOcupacionesSexoVictima2012;
    }

    public ArrayList<VifRural2011> getLstAgricultorSexoMasculino() {
        return lstAgricultorSexoMasculino;
    }

    public void setLstAgricultorSexoMasculino(ArrayList<VifRural2011> lstAgricultorSexoMasculino) {
        this.lstAgricultorSexoMasculino = lstAgricultorSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstComercianteSexoMasculino() {
        return lstComercianteSexoMasculino;
    }

    public void setLstComercianteSexoMasculino(ArrayList<VifRural2011> lstComercianteSexoMasculino) {
        this.lstComercianteSexoMasculino = lstComercianteSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPrivadoSexoMasculino() {
        return lstEmpleadoPrivadoSexoMasculino;
    }

    public void setLstEmpleadoPrivadoSexoMasculino(ArrayList<VifRural2011> lstEmpleadoPrivadoSexoMasculino) {
        this.lstEmpleadoPrivadoSexoMasculino = lstEmpleadoPrivadoSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPublicoSexoMasculino() {
        return lstEmpleadoPublicoSexoMasculino;
    }

    public void setLstEmpleadoPublicoSexoMasculino(ArrayList<VifRural2011> lstEmpleadoPublicoSexoMasculino) {
        this.lstEmpleadoPublicoSexoMasculino = lstEmpleadoPublicoSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstEstudianteSexoMasculino() {
        return lstEstudianteSexoMasculino;
    }

    public void setLstEstudianteSexoMasculino(ArrayList<VifRural2011> lstEstudianteSexoMasculino) {
        this.lstEstudianteSexoMasculino = lstEstudianteSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstJornaleroSexoMasculino() {
        return lstJornaleroSexoMasculino;
    }

    public void setLstJornaleroSexoMasculino(ArrayList<VifRural2011> lstJornaleroSexoMasculino) {
        this.lstJornaleroSexoMasculino = lstJornaleroSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstProfesionalSexoMasculino() {
        return lstProfesionalSexoMasculino;
    }

    public void setLstProfesionalSexoMasculino(ArrayList<VifRural2011> lstProfesionalSexoMasculino) {
        this.lstProfesionalSexoMasculino = lstProfesionalSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstQDSexoMasculino() {
        return lstQDSexoMasculino;
    }

    public void setLstQDSexoMasculino(ArrayList<VifRural2011> lstQDSexoMasculino) {
        this.lstQDSexoMasculino = lstQDSexoMasculino;
    }

    public CartesianChartModel getLineOcupacionesSexoMasculino() {
        return lineOcupacionesSexoMasculino;
    }

    public void setLineOcupacionesSexoMasculino(CartesianChartModel lineOcupacionesSexoMasculino) {
        this.lineOcupacionesSexoMasculino = lineOcupacionesSexoMasculino;
    }

    public ArrayList<VifRural2011> getLstAgricultorSexoFemenino() {
        return lstAgricultorSexoFemenino;
    }

    public void setLstAgricultorSexoFemenino(ArrayList<VifRural2011> lstAgricultorSexoFemenino) {
        this.lstAgricultorSexoFemenino = lstAgricultorSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstComercianteSexoFemenino() {
        return lstComercianteSexoFemenino;
    }

    public void setLstComercianteSexoFemenino(ArrayList<VifRural2011> lstComercianteSexoFemenino) {
        this.lstComercianteSexoFemenino = lstComercianteSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPrivadoSexoFemenino() {
        return lstEmpleadoPrivadoSexoFemenino;
    }

    public void setLstEmpleadoPrivadoSexoFemenino(ArrayList<VifRural2011> lstEmpleadoPrivadoSexoFemenino) {
        this.lstEmpleadoPrivadoSexoFemenino = lstEmpleadoPrivadoSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPublicoSexoFemenino() {
        return lstEmpleadoPublicoSexoFemenino;
    }

    public void setLstEmpleadoPublicoSexoFemenino(ArrayList<VifRural2011> lstEmpleadoPublicoSexoFemenino) {
        this.lstEmpleadoPublicoSexoFemenino = lstEmpleadoPublicoSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstEstudianteSexoFemenino() {
        return lstEstudianteSexoFemenino;
    }

    public void setLstEstudianteSexoFemenino(ArrayList<VifRural2011> lstEstudianteSexoFemenino) {
        this.lstEstudianteSexoFemenino = lstEstudianteSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstJornaleroSexoFemenino() {
        return lstJornaleroSexoFemenino;
    }

    public void setLstJornaleroSexoFemenino(ArrayList<VifRural2011> lstJornaleroSexoFemenino) {
        this.lstJornaleroSexoFemenino = lstJornaleroSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstProfesionalSexoFemenino() {
        return lstProfesionalSexoFemenino;
    }

    public void setLstProfesionalSexoFemenino(ArrayList<VifRural2011> lstProfesionalSexoFemenino) {
        this.lstProfesionalSexoFemenino = lstProfesionalSexoFemenino;
    }

    public ArrayList<VifRural2011> getLstQDSexoFemenino() {
        return lstQDSexoFemenino;
    }

    public void setLstQDSexoFemenino(ArrayList<VifRural2011> lstQDSexoFemenino) {
        this.lstQDSexoFemenino = lstQDSexoFemenino;
    }

    public CartesianChartModel getLineOcupacionesSexoFemenino() {
        return lineOcupacionesSexoFemenino;
    }

    public void setLineOcupacionesSexoFemenino(CartesianChartModel lineOcupacionesSexoFemenino) {
        this.lineOcupacionesSexoFemenino = lineOcupacionesSexoFemenino;
    }

    public CartesianChartModel getLineOcupacionesSexoVictima() {
        return lineOcupacionesSexoVictima;
    }

    public void setLineOcupacionesSexoVictima(CartesianChartModel lineOcupacionesSexoVictima) {
        this.lineOcupacionesSexoVictima = lineOcupacionesSexoVictima;
    }

    public CartesianChartModel getLineOcupaciones() {
        return lineOcupaciones;
    }

    public void setLineOcupaciones(CartesianChartModel lineOcupaciones) {
        this.lineOcupaciones = lineOcupaciones;
    }

    public ArrayList<VifRural2011> getLstAgricultor() {
        return lstAgricultor;
    }

    public void setLstAgricultor(ArrayList<VifRural2011> lstAgricultor) {
        this.lstAgricultor = lstAgricultor;
    }

    public ArrayList<VifRural2011> getLstComerciante() {
        return lstComerciante;
    }

    public void setLstComerciante(ArrayList<VifRural2011> lstComerciante) {
        this.lstComerciante = lstComerciante;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPrivado() {
        return lstEmpleadoPrivado;
    }

    public void setLstEmpleadoPrivado(ArrayList<VifRural2011> lstEmpleadoPrivado) {
        this.lstEmpleadoPrivado = lstEmpleadoPrivado;
    }

    public ArrayList<VifRural2011> getLstEmpleadoPublico() {
        return lstEmpleadoPublico;
    }

    public void setLstEmpleadoPublico(ArrayList<VifRural2011> lstEmpleadoPublico) {
        this.lstEmpleadoPublico = lstEmpleadoPublico;
    }

    public ArrayList<VifRural2011> getLstEstudiante() {
        return lstEstudiante;
    }

    public void setLstEstudiante(ArrayList<VifRural2011> lstEstudiante) {
        this.lstEstudiante = lstEstudiante;
    }

    public ArrayList<VifRural2011> getLstJornalero() {
        return lstJornalero;
    }

    public void setLstJornalero(ArrayList<VifRural2011> lstJornalero) {
        this.lstJornalero = lstJornalero;
    }

    public ArrayList<VifRural2011> getLstProfesional() {
        return lstProfesional;
    }

    public void setLstProfesional(ArrayList<VifRural2011> lstProfesional) {
        this.lstProfesional = lstProfesional;
    }

    public ArrayList<VifRural2011> getLstQD() {
        return lstQD;
    }

    public void setLstQD(ArrayList<VifRural2011> lstQD) {
        this.lstQD = lstQD;
    }

    @PostConstruct
    private void graficar() {
        this.lineOcupaciones = graficaOcupaciones();
        this.lineOcupacionesSexoVictima = graficaOcupacionesSexoVictima();
        this.lineOcupaciones2011 = graficaOcupaciones2011();
        this.lineOcupacionesSexoVictima2011 = graficaOcupacionesSexoVictima2011();
        this.lineOcupaciones2012 = graficaOcupaciones2012();
        this.lineOcupacionesSexoVictima2012 = graficaOcupacionesSexoVictima2012();
    }

    public Controlador_VifRuralOcupacion() {
        this.graficar();
    }

    private CartesianChartModel graficaOcupaciones() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries ocupaciones = new ChartSeries();
            ocupaciones.setLabel("Ocupaciones de las Víctimas");
            lstAgricultor = FVifRural2011.obtenerDatosOcupacionAgricultor(2010);
            lstComerciante = FVifRural2011.obtenerDatosOcupacionComerciante(2010);
            lstEmpleadoPrivado = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivado(2010);
            lstEmpleadoPublico = FVifRural2011.obtenerDatosOcupacionEmpleadoPublico(2010);
            lstEstudiante = FVifRural2011.obtenerDatosOcupacionEstudiante(2010);
            lstJornalero = FVifRural2011.obtenerDatosOcupacionJornalero(2010);
            lstProfesional = FVifRural2011.obtenerDatosOcupacionProfesional(2010);
            lstQD = FVifRural2011.obtenerDatosOcupacionQQDD(2010);

            ocupaciones.set("Agricultor(a)", lstAgricultor.size());
            ocupaciones.set("Comerciante", lstComerciante.size());
            ocupaciones.set("Empleado Privado", lstEmpleadoPrivado.size());
            ocupaciones.set("Empleado Publico", lstEmpleadoPublico.size());
            ocupaciones.set("Estudiante", lstEstudiante.size());
            ocupaciones.set("Jornalero", lstJornalero.size());
            ocupaciones.set("Profesional", lstProfesional.size());
            ocupaciones.set("Quehaceres Domésticos", lstQD.size());

            model.addSeries(ocupaciones);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaOcupaciones2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries ocupaciones = new ChartSeries();
            ocupaciones.setLabel("Ocupaciones de las Víctimas");
            lstAgricultor = FVifRural2011.obtenerDatosOcupacionAgricultor(2011);
            lstComerciante = FVifRural2011.obtenerDatosOcupacionComerciante(2011);
            lstEmpleadoPrivado = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivado(2011);
            lstEmpleadoPublico = FVifRural2011.obtenerDatosOcupacionEmpleadoPublico(2011);
            lstEstudiante = FVifRural2011.obtenerDatosOcupacionEstudiante(2011);
            lstJornalero = FVifRural2011.obtenerDatosOcupacionJornalero(2011);
            lstProfesional = FVifRural2011.obtenerDatosOcupacionProfesional(2011);
            lstQD = FVifRural2011.obtenerDatosOcupacionQQDD(2011);

            ocupaciones.set("Agricultor(a)", lstAgricultor.size());
            ocupaciones.set("Comerciante", lstComerciante.size());
            ocupaciones.set("Empleado Privado", lstEmpleadoPrivado.size());
            ocupaciones.set("Empleado Publico", lstEmpleadoPublico.size());
            ocupaciones.set("Estudiante", lstEstudiante.size());
            ocupaciones.set("Jornalero", lstJornalero.size());
            ocupaciones.set("Profesional", lstProfesional.size());
            ocupaciones.set("Quehaceres Domésticos", lstQD.size());

            model.addSeries(ocupaciones);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaOcupaciones2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries ocupaciones = new ChartSeries();
            ocupaciones.setLabel("Ocupaciones de las Víctimas");
            lstAgricultor = FVifRural2011.obtenerDatosOcupacionAgricultor(2012);
            lstComerciante = FVifRural2011.obtenerDatosOcupacionComerciante(2012);
            lstEmpleadoPrivado = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivado(2012);
            lstEmpleadoPublico = FVifRural2011.obtenerDatosOcupacionEmpleadoPublico(2012);
            lstEstudiante = FVifRural2011.obtenerDatosOcupacionEstudiante(2012);
            lstJornalero = FVifRural2011.obtenerDatosOcupacionJornalero(2012);
            lstProfesional = FVifRural2011.obtenerDatosOcupacionProfesional(2012);
            lstQD = FVifRural2011.obtenerDatosOcupacionQQDD(2012);

            ocupaciones.set("Agricultor(a)", lstAgricultor.size());
            ocupaciones.set("Comerciante", lstComerciante.size());
            ocupaciones.set("Empleado Privado", lstEmpleadoPrivado.size());
            ocupaciones.set("Empleado Publico", lstEmpleadoPublico.size());
            ocupaciones.set("Estudiante", lstEstudiante.size());
            ocupaciones.set("Jornalero", lstJornalero.size());
            ocupaciones.set("Profesional", lstProfesional.size());
            ocupaciones.set("Quehaceres Domésticos", lstQD.size());

            model.addSeries(ocupaciones);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaOcupacionesSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            lstAgricultorSexoMasculino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2010, "M");
            lstComercianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2010, "M");
            lstEmpleadoPrivadoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2010, "M");
            lstEmpleadoPublicoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2010, "M");
            lstEstudianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2010, "M");
            lstJornaleroSexoMasculino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2010, "M");
            lstProfesionalSexoMasculino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2010, "M");
            lstQDSexoMasculino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2010, "M");

            masculino.set("Agricultor(a)", lstAgricultorSexoMasculino.size());
            masculino.set("Comerciante", lstComercianteSexoMasculino.size());
            masculino.set("Empleado Privado", lstEmpleadoPrivadoSexoMasculino.size());
            masculino.set("Empleado Publico", lstEmpleadoPublicoSexoMasculino.size());
            masculino.set("Estudiante", lstEstudianteSexoMasculino.size());
            masculino.set("Jornalero", lstJornaleroSexoMasculino.size());
            masculino.set("Profesional", lstProfesionalSexoMasculino.size());
            masculino.set("Quehaceres Domésticos", lstQDSexoMasculino.size());

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            lstAgricultorSexoFemenino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2010, "F");
            lstComercianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2010, "F");
            lstEmpleadoPrivadoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2010, "F");
            lstEmpleadoPublicoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2010, "F");
            lstEstudianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2010, "F");
            lstJornaleroSexoFemenino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2010, "F");
            lstProfesionalSexoFemenino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2010, "F");
            lstQDSexoFemenino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2010, "F");

            femenino.set("Agricultor(a)", lstAgricultorSexoFemenino.size());
            femenino.set("Comerciante", lstComercianteSexoFemenino.size());
            femenino.set("Empleado Privado", lstEmpleadoPrivadoSexoFemenino.size());
            femenino.set("Empleado Publico", lstEmpleadoPublicoSexoFemenino.size());
            femenino.set("Estudiante", lstEstudianteSexoFemenino.size());
            femenino.set("Jornalero", lstJornaleroSexoFemenino.size());
            femenino.set("Profesional", lstProfesionalSexoFemenino.size());
            femenino.set("Quehaceres Domésticos", lstQDSexoFemenino.size());

            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaOcupacionesSexoVictima2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            lstAgricultorSexoMasculino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2011, "M");
            lstComercianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2011, "M");
            lstEmpleadoPrivadoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2011, "M");
            lstEmpleadoPublicoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2011, "M");
            lstEstudianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2011, "M");
            lstJornaleroSexoMasculino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2011, "M");
            lstProfesionalSexoMasculino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2011, "M");
            lstQDSexoMasculino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2011, "M");

            masculino.set("Agricultor(a)", lstAgricultorSexoMasculino.size());
            masculino.set("Comerciante", lstComercianteSexoMasculino.size());
            masculino.set("Empleado Privado", lstEmpleadoPrivadoSexoMasculino.size());
            masculino.set("Empleado Publico", lstEmpleadoPublicoSexoMasculino.size());
            masculino.set("Estudiante", lstEstudianteSexoMasculino.size());
            masculino.set("Jornalero", lstJornaleroSexoMasculino.size());
            masculino.set("Profesional", lstProfesionalSexoMasculino.size());
            masculino.set("Quehaceres Domésticos", lstQDSexoMasculino.size());

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            lstAgricultorSexoFemenino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2011, "F");
            lstComercianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2011, "F");
            lstEmpleadoPrivadoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2011, "F");
            lstEmpleadoPublicoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2011, "F");
            lstEstudianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2011, "F");
            lstJornaleroSexoFemenino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2011, "F");
            lstProfesionalSexoFemenino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2011, "F");
            lstQDSexoFemenino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2011, "F");

            femenino.set("Agricultor(a)", lstAgricultorSexoFemenino.size());
            femenino.set("Comerciante", lstComercianteSexoFemenino.size());
            femenino.set("Empleado Privado", lstEmpleadoPrivadoSexoFemenino.size());
            femenino.set("Empleado Publico", lstEmpleadoPublicoSexoFemenino.size());
            femenino.set("Estudiante", lstEstudianteSexoFemenino.size());
            femenino.set("Jornalero", lstJornaleroSexoFemenino.size());
            femenino.set("Profesional", lstProfesionalSexoFemenino.size());
            femenino.set("Quehaceres Domésticos", lstQDSexoFemenino.size());

            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaOcupacionesSexoVictima2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            lstAgricultorSexoMasculino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2012, "M");
            lstComercianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2012, "M");
            lstEmpleadoPrivadoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2012, "M");
            lstEmpleadoPublicoSexoMasculino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2012, "M");
            lstEstudianteSexoMasculino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2012, "M");
            lstJornaleroSexoMasculino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2012, "M");
            lstProfesionalSexoMasculino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2012, "M");
            lstQDSexoMasculino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2012, "M");

            masculino.set("Agricultor(a)", lstAgricultorSexoMasculino.size());
            masculino.set("Comerciante", lstComercianteSexoMasculino.size());
            masculino.set("Empleado Privado", lstEmpleadoPrivadoSexoMasculino.size());
            masculino.set("Empleado Publico", lstEmpleadoPublicoSexoMasculino.size());
            masculino.set("Estudiante", lstEstudianteSexoMasculino.size());
            masculino.set("Jornalero", lstJornaleroSexoMasculino.size());
            masculino.set("Profesional", lstProfesionalSexoMasculino.size());
            masculino.set("Quehaceres Domésticos", lstQDSexoMasculino.size());

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            lstAgricultorSexoFemenino = FVifRural2011.obtenerDatosOcupacionAgricultorDadoSexo(2012, "F");
            lstComercianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionComercianteDadoSexo(2012, "F");
            lstEmpleadoPrivadoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPrivadoDadoSexo(2012, "F");
            lstEmpleadoPublicoSexoFemenino = FVifRural2011.obtenerDatosOcupacionEmpleadoPublicoDadoSexo(2012, "F");
            lstEstudianteSexoFemenino = FVifRural2011.obtenerDatosOcupacionEstudianteDadoSexo(2012, "F");
            lstJornaleroSexoFemenino = FVifRural2011.obtenerDatosOcupacionJornaleroDadoSexo(2012, "F");
            lstProfesionalSexoFemenino = FVifRural2011.obtenerDatosOcupacionProfesionalDadoSexo(2012, "F");
            lstQDSexoFemenino = FVifRural2011.obtenerDatosOcupacionQQDDDadoSexo(2012, "F");

            femenino.set("Agricultor(a)", lstAgricultorSexoFemenino.size());
            femenino.set("Comerciante", lstComercianteSexoFemenino.size());
            femenino.set("Empleado Privado", lstEmpleadoPrivadoSexoFemenino.size());
            femenino.set("Empleado Publico", lstEmpleadoPublicoSexoFemenino.size());
            femenino.set("Estudiante", lstEstudianteSexoFemenino.size());
            femenino.set("Jornalero", lstJornaleroSexoFemenino.size());
            femenino.set("Profesional", lstProfesionalSexoFemenino.size());
            femenino.set("Quehaceres Domésticos", lstQDSexoFemenino.size());

            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

}
