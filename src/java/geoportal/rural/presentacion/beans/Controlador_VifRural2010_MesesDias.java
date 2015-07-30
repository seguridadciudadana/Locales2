/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2010;
import geoportal.rural.logica.funciones.FVifRural2010;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRural2010_MesesDias {

    /**
     * Creates a new instance of Controlador_VifRural2010_MesesDias
     */
    private VifRural2010 objVifRural2010;
    private ArrayList<VifRural2010> lstDatos;
    private ArrayList<VifRural2010> lstDatosDadoMes;
    private ArrayList<VifRural2010> lstDatosDadoMesSM;
    private ArrayList<VifRural2010> lstDatosDadoMesSF;
    private ArrayList<VifRural2010> lstDatosDadoDia;
    private ArrayList<VifRural2010> lstDatosDadoDiaSM;
    private ArrayList<VifRural2010> lstDatosDadoDiaSF;
    private ArrayList<VifRural2010> lstDatosTipoViolencia;
    private ArrayList<VifRural2010> lstDatosDadoTipoViolencia;
    private ArrayList<VifRural2010> lstDatosEstadoCivil;
    private ArrayList<VifRural2010> lstDatosDadoEstadoCivil;
    private ArrayList<VifRural2010> lstDatosRangoEdad1;
    private ArrayList<VifRural2010> lstDatosRangoEdad2;
    private ArrayList<VifRural2010> lstDatosRangoEdad3;
    private ArrayList<VifRural2010> lstDatosRangoEdad4;
    private ArrayList<VifRural2010> lstDatosRangoEdad5;
    private ArrayList<VifRural2010> lstDatosRangoEdad6;
    private ArrayList<VifRural2010> lstDatosRangoEdad7;
    private ArrayList<VifRural2010> lstDatosRangoEdad1M;
    private ArrayList<VifRural2010> lstDatosRangoEdad2M;
    private ArrayList<VifRural2010> lstDatosRangoEdad3M;
    private ArrayList<VifRural2010> lstDatosRangoEdad4M;
    private ArrayList<VifRural2010> lstDatosRangoEdad5M;
    private ArrayList<VifRural2010> lstDatosRangoEdad6M;
    private ArrayList<VifRural2010> lstDatosRangoEdad7M;
    private ArrayList<VifRural2010> lstDatosRangoEdad1F;
    private ArrayList<VifRural2010> lstDatosRangoEdad2F;
    private ArrayList<VifRural2010> lstDatosRangoEdad3F;
    private ArrayList<VifRural2010> lstDatosRangoEdad4F;
    private ArrayList<VifRural2010> lstDatosRangoEdad5F;
    private ArrayList<VifRural2010> lstDatosRangoEdad6F;
    private ArrayList<VifRural2010> lstDatosRangoEdad7F;
    private CartesianChartModel lineModelSemana;
    private CartesianChartModel lineModelMeses;
    private CartesianChartModel lineModelSemanaSV;
    private CartesianChartModel lineModelMesesSV;
    private CartesianChartModel lineModelTipoViolencia;
    private CartesianChartModel lineModelEstadoCivil;
    private CartesianChartModel lineModelEdades;
    private CartesianChartModel lineModelEdadesSV;

    public ArrayList<VifRural2010> getLstDatosRangoEdad1() {
        return lstDatosRangoEdad1;
    }

    public void setLstDatosRangoEdad1(ArrayList<VifRural2010> lstDatosRangoEdad1) {
        this.lstDatosRangoEdad1 = lstDatosRangoEdad1;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad2() {
        return lstDatosRangoEdad2;
    }

    public void setLstDatosRangoEdad2(ArrayList<VifRural2010> lstDatosRangoEdad2) {
        this.lstDatosRangoEdad2 = lstDatosRangoEdad2;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad3() {
        return lstDatosRangoEdad3;
    }

    public void setLstDatosRangoEdad3(ArrayList<VifRural2010> lstDatosRangoEdad3) {
        this.lstDatosRangoEdad3 = lstDatosRangoEdad3;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad4() {
        return lstDatosRangoEdad4;
    }

    public void setLstDatosRangoEdad4(ArrayList<VifRural2010> lstDatosRangoEdad4) {
        this.lstDatosRangoEdad4 = lstDatosRangoEdad4;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad5() {
        return lstDatosRangoEdad5;
    }

    public void setLstDatosRangoEdad5(ArrayList<VifRural2010> lstDatosRangoEdad5) {
        this.lstDatosRangoEdad5 = lstDatosRangoEdad5;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad6() {
        return lstDatosRangoEdad6;
    }

    public void setLstDatosRangoEdad6(ArrayList<VifRural2010> lstDatosRangoEdad6) {
        this.lstDatosRangoEdad6 = lstDatosRangoEdad6;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad7() {
        return lstDatosRangoEdad7;
    }

    public void setLstDatosRangoEdad7(ArrayList<VifRural2010> lstDatosRangoEdad7) {
        this.lstDatosRangoEdad7 = lstDatosRangoEdad7;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad1M() {
        return lstDatosRangoEdad1M;
    }

    public void setLstDatosRangoEdad1M(ArrayList<VifRural2010> lstDatosRangoEdad1M) {
        this.lstDatosRangoEdad1M = lstDatosRangoEdad1M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad2M() {
        return lstDatosRangoEdad2M;
    }

    public void setLstDatosRangoEdad2M(ArrayList<VifRural2010> lstDatosRangoEdad2M) {
        this.lstDatosRangoEdad2M = lstDatosRangoEdad2M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad3M() {
        return lstDatosRangoEdad3M;
    }

    public void setLstDatosRangoEdad3M(ArrayList<VifRural2010> lstDatosRangoEdad3M) {
        this.lstDatosRangoEdad3M = lstDatosRangoEdad3M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad4M() {
        return lstDatosRangoEdad4M;
    }

    public void setLstDatosRangoEdad4M(ArrayList<VifRural2010> lstDatosRangoEdad4M) {
        this.lstDatosRangoEdad4M = lstDatosRangoEdad4M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad5M() {
        return lstDatosRangoEdad5M;
    }

    public void setLstDatosRangoEdad5M(ArrayList<VifRural2010> lstDatosRangoEdad5M) {
        this.lstDatosRangoEdad5M = lstDatosRangoEdad5M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad6M() {
        return lstDatosRangoEdad6M;
    }

    public void setLstDatosRangoEdad6M(ArrayList<VifRural2010> lstDatosRangoEdad6M) {
        this.lstDatosRangoEdad6M = lstDatosRangoEdad6M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad7M() {
        return lstDatosRangoEdad7M;
    }

    public void setLstDatosRangoEdad7M(ArrayList<VifRural2010> lstDatosRangoEdad7M) {
        this.lstDatosRangoEdad7M = lstDatosRangoEdad7M;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad1F() {
        return lstDatosRangoEdad1F;
    }

    public void setLstDatosRangoEdad1F(ArrayList<VifRural2010> lstDatosRangoEdad1F) {
        this.lstDatosRangoEdad1F = lstDatosRangoEdad1F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad2F() {
        return lstDatosRangoEdad2F;
    }

    public void setLstDatosRangoEdad2F(ArrayList<VifRural2010> lstDatosRangoEdad2F) {
        this.lstDatosRangoEdad2F = lstDatosRangoEdad2F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad3F() {
        return lstDatosRangoEdad3F;
    }

    public void setLstDatosRangoEdad3F(ArrayList<VifRural2010> lstDatosRangoEdad3F) {
        this.lstDatosRangoEdad3F = lstDatosRangoEdad3F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad4F() {
        return lstDatosRangoEdad4F;
    }

    public void setLstDatosRangoEdad4F(ArrayList<VifRural2010> lstDatosRangoEdad4F) {
        this.lstDatosRangoEdad4F = lstDatosRangoEdad4F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad5F() {
        return lstDatosRangoEdad5F;
    }

    public void setLstDatosRangoEdad5F(ArrayList<VifRural2010> lstDatosRangoEdad5F) {
        this.lstDatosRangoEdad5F = lstDatosRangoEdad5F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad6F() {
        return lstDatosRangoEdad6F;
    }

    public void setLstDatosRangoEdad6F(ArrayList<VifRural2010> lstDatosRangoEdad6F) {
        this.lstDatosRangoEdad6F = lstDatosRangoEdad6F;
    }

    public ArrayList<VifRural2010> getLstDatosRangoEdad7F() {
        return lstDatosRangoEdad7F;
    }

    public void setLstDatosRangoEdad7F(ArrayList<VifRural2010> lstDatosRangoEdad7F) {
        this.lstDatosRangoEdad7F = lstDatosRangoEdad7F;
    }

    public CartesianChartModel getLineModelEdades() {
        return lineModelEdades;
    }

    public void setLineModelEdades(CartesianChartModel lineModelEdades) {
        this.lineModelEdades = lineModelEdades;
    }

    public CartesianChartModel getLineModelEdadesSV() {
        return lineModelEdadesSV;
    }

    public void setLineModelEdadesSV(CartesianChartModel lineModelEdadesSV) {
        this.lineModelEdadesSV = lineModelEdadesSV;
    }

    public ArrayList<VifRural2010> getLstDatosEstadoCivil() {
        return lstDatosEstadoCivil;
    }

    public void setLstDatosEstadoCivil(ArrayList<VifRural2010> lstDatosEstadoCivil) {
        this.lstDatosEstadoCivil = lstDatosEstadoCivil;
    }

    public ArrayList<VifRural2010> getLstDatosDadoEstadoCivil() {
        return lstDatosDadoEstadoCivil;
    }

    public void setLstDatosDadoEstadoCivil(ArrayList<VifRural2010> lstDatosDadoEstadoCivil) {
        this.lstDatosDadoEstadoCivil = lstDatosDadoEstadoCivil;
    }

    public CartesianChartModel getLineModelEstadoCivil() {
        return lineModelEstadoCivil;
    }

    public void setLineModelEstadoCivil(CartesianChartModel lineModelEstadoCivil) {
        this.lineModelEstadoCivil = lineModelEstadoCivil;
    }

    public ArrayList<VifRural2010> getLstDatosTipoViolencia() {
        return lstDatosTipoViolencia;
    }

    public void setLstDatosTipoViolencia(ArrayList<VifRural2010> lstDatosTipoViolencia) {
        this.lstDatosTipoViolencia = lstDatosTipoViolencia;
    }

    public ArrayList<VifRural2010> getLstDatosDadoTipoViolencia() {
        return lstDatosDadoTipoViolencia;
    }

    public void setLstDatosDadoTipoViolencia(ArrayList<VifRural2010> lstDatosDadoTipoViolencia) {
        this.lstDatosDadoTipoViolencia = lstDatosDadoTipoViolencia;
    }

    public CartesianChartModel getLineModelTipoViolencia() {
        return lineModelTipoViolencia;
    }

    public void setLineModelTipoViolencia(CartesianChartModel lineModelTipoViolencia) {
        this.lineModelTipoViolencia = lineModelTipoViolencia;
    }

    public CartesianChartModel getLineModelSemanaSV() {
        return lineModelSemanaSV;
    }

    public void setLineModelSemanaSV(CartesianChartModel lineModelSemanaSV) {
        this.lineModelSemanaSV = lineModelSemanaSV;
    }

    public CartesianChartModel getLineModelMesesSV() {
        return lineModelMesesSV;
    }

    public void setLineModelMesesSV(CartesianChartModel lineModelMesesSV) {
        this.lineModelMesesSV = lineModelMesesSV;
    }

    public ArrayList<VifRural2010> getLstDatosDadoMesSM() {
        return lstDatosDadoMesSM;
    }

    public void setLstDatosDadoMesSM(ArrayList<VifRural2010> lstDatosDadoMesSM) {
        this.lstDatosDadoMesSM = lstDatosDadoMesSM;
    }

    public ArrayList<VifRural2010> getLstDatosDadoMesSF() {
        return lstDatosDadoMesSF;
    }

    public void setLstDatosDadoMesSF(ArrayList<VifRural2010> lstDatosDadoMesSF) {
        this.lstDatosDadoMesSF = lstDatosDadoMesSF;
    }

    public ArrayList<VifRural2010> getLstDatosDadoDiaSM() {
        return lstDatosDadoDiaSM;
    }

    public void setLstDatosDadoDiaSM(ArrayList<VifRural2010> lstDatosDadoDiaSM) {
        this.lstDatosDadoDiaSM = lstDatosDadoDiaSM;
    }

    public ArrayList<VifRural2010> getLstDatosDadoDiaSF() {
        return lstDatosDadoDiaSF;
    }

    public void setLstDatosDadoDiaSF(ArrayList<VifRural2010> lstDatosDadoDiaSF) {
        this.lstDatosDadoDiaSF = lstDatosDadoDiaSF;
    }

    public CartesianChartModel getLineModelMeses() {
        return lineModelMeses;
    }

    public void setLineModelMeses(CartesianChartModel lineModelMeses) {
        this.lineModelMeses = lineModelMeses;
    }

    public CartesianChartModel getLineModelSemana() {
        return lineModelSemana;
    }

    public void setLineModelSemana(CartesianChartModel lineModelSemana) {
        this.lineModelSemana = lineModelSemana;
    }

    public VifRural2010 getObjVifRural2010() {
        return objVifRural2010;
    }

    public void setObjVifRural2010(VifRural2010 objVifRural2010) {
        this.objVifRural2010 = objVifRural2010;
    }

    public ArrayList<VifRural2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VifRural2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VifRural2010> getLstDatosDadoMes() {
        return lstDatosDadoMes;
    }

    public void setLstDatosDadoMes(ArrayList<VifRural2010> lstDatosDadoMes) {
        this.lstDatosDadoMes = lstDatosDadoMes;
    }

    public ArrayList<VifRural2010> getLstDatosDadoDia() {
        return lstDatosDadoDia;
    }

    public void setLstDatosDadoDia(ArrayList<VifRural2010> lstDatosDadoDia) {
        this.lstDatosDadoDia = lstDatosDadoDia;
    }

    public Controlador_VifRural2010_MesesDias() {
    }

    public void reinit() {
        this.init();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineModelSemana = initCategoryDia();
        this.lineModelSemanaSV = initCategoryDiaSexo();
        this.lineModelMeses = initCategoryMes();
        this.lineModelMesesSV = initCategoryMesSexo();
        this.lineModelTipoViolencia = initCategoryTipoViolencia();
        this.lineModelEstadoCivil = initCategoryEstadoCivil();
        this.lineModelEdades = initCategoryRangoEdades();
        this.lineModelEdadesSV=initCategoryRangoEdadesSexoVictima();
    }

    private CartesianChartModel initCategoryDia() {
        CartesianChartModel model1 = new CartesianChartModel();
        ArrayList dias = new ArrayList();
        dias.add("LUNES");
        dias.add("MARTES");
        dias.add("MIERCOLES");
        dias.add("JUEVES");
        dias.add("VIERNES");
        dias.add("SABADO");
        dias.add("DOMINGO");
        try {
            this.lstDatos = FVifRural2010.ObtenerDatos();
            ChartSeries Semana = new ChartSeries();
            Semana.setLabel("Días de denuncia");
            for (int i = 0; i < dias.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoDia = FVifRural2010.ObtenerDatosDadoDia(dias.get(i).toString());
                    Semana.set(dias.get(i), this.lstDatosDadoDia.size());
                }
            }
            model1.addSeries(Semana);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel initCategoryDiaSexo() {
        CartesianChartModel model = new CartesianChartModel();
        ArrayList dias = new ArrayList();
        dias.add("LUNES");
        dias.add("MARTES");
        dias.add("MIERCOLES");
        dias.add("JUEVES");
        dias.add("VIERNES");
        dias.add("SABADO");
        dias.add("DOMINGO");
        try {
            this.lstDatos = FVifRural2010.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int i = 0; i < dias.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoDiaSM = FVifRural2010.ObtenerDatosDadoDiaSexo(dias.get(i).toString(), "M");
                    Masculino.set(dias.get(i), this.lstDatosDadoDiaSM.size());
                }
            }

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int i = 0; i < dias.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoDiaSF = FVifRural2010.ObtenerDatosDadoDiaSexo(dias.get(i).toString(), "F");
                    Femenino.set(dias.get(i), this.lstDatosDadoDiaSF.size());
                }
            }
            model.addSeries(Femenino);
            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryMes() {
        CartesianChartModel model2 = new CartesianChartModel();
        ArrayList mes = new ArrayList();
        mes.add("ENERO");
        mes.add("FEBRERO");
        mes.add("MARZO");
        mes.add("ABRIL");
        mes.add("MAYO");
        mes.add("JUNIO");
        mes.add("AGOSTO");
        mes.add("SEPTIEMBRE");
        mes.add("OCTUBRE");
        mes.add("NOVIEMBRE");
        mes.add("DICIEMBRE");
        try {
            this.lstDatos = FVifRural2010.ObtenerDatos();
            ChartSeries Meses = new ChartSeries();
            Meses.setLabel("Meses de agresiones");
            for (int i = 0; i < mes.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoMes = FVifRural2010.ObtenerDatosDadoMes(mes.get(i).toString());
                    Meses.set(mes.get(i), this.lstDatosDadoMes.size());
                }
            }
            model2.addSeries(Meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel initCategoryMesSexo() {
        CartesianChartModel model3 = new CartesianChartModel();
        ArrayList mes = new ArrayList();
        mes.add("ENERO");
        mes.add("FEBRERO");
        mes.add("MARZO");
        mes.add("ABRIL");
        mes.add("MAYO");
        mes.add("JUNIO");
        mes.add("AGOSTO");
        mes.add("SEPTIEMBRE");
        mes.add("OCTUBRE");
        mes.add("NOVIEMBRE");
        mes.add("DICIEMBRE");
        try {
            this.lstDatos = FVifRural2010.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int i = 0; i < mes.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoMesSM = FVifRural2010.ObtenerDatosDadoMesSexo(mes.get(i).toString(), "M");
                    Masculino.set(mes.get(i), this.lstDatosDadoMesSM.size());
                }
            }

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int i = 0; i < mes.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    this.lstDatosDadoMesSF = FVifRural2010.ObtenerDatosDadoMesSexo(mes.get(i).toString(), "F");
                    Femenino.set(mes.get(i), this.lstDatosDadoMesSF.size());
                }
            }

            model3.addSeries(Femenino);
            model3.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model3;
    }

    //tipo de violencia
    private CartesianChartModel initCategoryTipoViolencia() {
        CartesianChartModel modelTP = new CartesianChartModel();
        try {
            this.lstDatosTipoViolencia = FVifRural2010.ObtenerDatosTipoViolencia();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipo de Violencia");
            for (int j = 0; j < lstDatosTipoViolencia.size(); j++) {
                this.lstDatosDadoTipoViolencia = FVifRural2010.ObtenerDatosDadoTipoViolencia(this.lstDatosTipoViolencia.get(j).getTipo_de_violencia());
                Violencia.set(this.lstDatosTipoViolencia.get(j).getTipo_de_violencia(), this.lstDatosDadoTipoViolencia.size());
            }
            modelTP.addSeries(Violencia);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelTP;
    }

    //estado civil
    private CartesianChartModel initCategoryEstadoCivil() {
        CartesianChartModel modelEC = new CartesianChartModel();
        try {
            this.lstDatosEstadoCivil = FVifRural2010.ObtenerDatosEstadoCivil();
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil");
            for (int j = 0; j < lstDatosEstadoCivil.size(); j++) {
                this.lstDatosDadoEstadoCivil = FVifRural2010.ObtenerDatosDadoEstadoCivil(this.lstDatosEstadoCivil.get(j).getEstado_civil_victima());
                EstadoCivil.set(this.lstDatosEstadoCivil.get(j).getEstado_civil_victima(), this.lstDatosDadoEstadoCivil.size());
            }
            modelEC.addSeries(EstadoCivil);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelEC;
    }

    //rango de edades
    private CartesianChartModel initCategoryRangoEdades() {
        CartesianChartModel modelRE = new CartesianChartModel();
        try {
            this.lstDatosRangoEdad1 = FVifRural2010.ObtenerDatosRangoEdad1();
            this.lstDatosRangoEdad2 = FVifRural2010.ObtenerDatosRangoEdad2();
            this.lstDatosRangoEdad3 = FVifRural2010.ObtenerDatosRangoEdad3();
            this.lstDatosRangoEdad4 = FVifRural2010.ObtenerDatosRangoEdad4();
            this.lstDatosRangoEdad5 = FVifRural2010.ObtenerDatosRangoEdad5();
            this.lstDatosRangoEdad6 = FVifRural2010.ObtenerDatosRangoEdad6();
            this.lstDatosRangoEdad7 = FVifRural2010.ObtenerDatosRangoEdad7();

            ChartSeries Edades = new ChartSeries();
            Edades.setLabel("Edades");
            Edades.set("desde 0 hasta 12", lstDatosRangoEdad1.size());
            Edades.set("desde 12 hasta 18", lstDatosRangoEdad2.size());
            Edades.set("desde 18 hasta 30", lstDatosRangoEdad3.size());
            Edades.set("desde 30 hasta 40", lstDatosRangoEdad4.size());
            Edades.set("desde 40 hasta 50", lstDatosRangoEdad5.size());
            Edades.set("desde 50 hasta 65", lstDatosRangoEdad6.size());
            Edades.set("mayores de 65", lstDatosRangoEdad7.size());

            modelRE.addSeries(Edades);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelRE;
    }

    private CartesianChartModel initCategoryRangoEdadesSexoVictima() {
        CartesianChartModel modelRE = new CartesianChartModel();
        try {
            this.lstDatosRangoEdad1M = FVifRural2010.ObtenerDatosRangoEdad1DadoSexo("M");
            this.lstDatosRangoEdad2M = FVifRural2010.ObtenerDatosRangoEdad2DadoSexo("M");
            this.lstDatosRangoEdad3M = FVifRural2010.ObtenerDatosRangoEdad3DadoSexo("M");
            this.lstDatosRangoEdad4M = FVifRural2010.ObtenerDatosRangoEdad4DadoSexo("M");
            this.lstDatosRangoEdad5M = FVifRural2010.ObtenerDatosRangoEdad5DadoSexo("M");
            this.lstDatosRangoEdad6M = FVifRural2010.ObtenerDatosRangoEdad6DadoSexo("M");
            this.lstDatosRangoEdad7M = FVifRural2010.ObtenerDatosRangoEdad7DadoSexo("M");

            this.lstDatosRangoEdad1F = FVifRural2010.ObtenerDatosRangoEdad1DadoSexo("F");
            this.lstDatosRangoEdad2F = FVifRural2010.ObtenerDatosRangoEdad2DadoSexo("F");
            this.lstDatosRangoEdad3F = FVifRural2010.ObtenerDatosRangoEdad3DadoSexo("F");
            this.lstDatosRangoEdad4F = FVifRural2010.ObtenerDatosRangoEdad4DadoSexo("F");
            this.lstDatosRangoEdad5F = FVifRural2010.ObtenerDatosRangoEdad5DadoSexo("F");
            this.lstDatosRangoEdad6F = FVifRural2010.ObtenerDatosRangoEdad6DadoSexo("F");
            this.lstDatosRangoEdad7F = FVifRural2010.ObtenerDatosRangoEdad7DadoSexo("F");

            ChartSeries EdadesSM = new ChartSeries();
            EdadesSM.setLabel("Sexo Femenino");
            EdadesSM.set("desde 0 hasta 12", lstDatosRangoEdad1M.size());
            EdadesSM.set("desde 12 hasta 18", lstDatosRangoEdad2M.size());
            EdadesSM.set("desde 18 hasta 30", lstDatosRangoEdad3M.size());
            EdadesSM.set("desde 30 hasta 40", lstDatosRangoEdad4M.size());
            EdadesSM.set("desde 40 hasta 50", lstDatosRangoEdad5M.size());
            EdadesSM.set("desde 50 hasta 65", lstDatosRangoEdad6M.size());
            EdadesSM.set("mayores de 65", lstDatosRangoEdad7M.size());
            
            ChartSeries EdadesSF = new ChartSeries();
            EdadesSF.setLabel("Sexo Masculino");
            EdadesSF.set("desde 0 hasta 12", lstDatosRangoEdad1F.size());
            EdadesSF.set("desde 12 hasta 18", lstDatosRangoEdad2F.size());
            EdadesSF.set("desde 18 hasta 30", lstDatosRangoEdad3F.size());
            EdadesSF.set("desde 30 hasta 40", lstDatosRangoEdad4F.size());
            EdadesSF.set("desde 40 hasta 50", lstDatosRangoEdad5F.size());
            EdadesSF.set("desde 50 hasta 65", lstDatosRangoEdad6F.size());
            EdadesSF.set("mayores de 65", lstDatosRangoEdad7F.size());

            modelRE.addSeries(EdadesSM);
            modelRE.addSeries(EdadesSF);
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelRE;
    }

}
