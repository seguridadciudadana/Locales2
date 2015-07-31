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
    private ArrayList<VifRural2010> lstDatosEnero;
    private ArrayList<VifRural2010> lstDatosFebrero;
    private ArrayList<VifRural2010> lstDatosMarzo;
    private ArrayList<VifRural2010> lstDatosAbril;
    private ArrayList<VifRural2010> lstDatosMayo;
    private ArrayList<VifRural2010> lstDatosJunio;
    private ArrayList<VifRural2010> lstDatosJulio;
    private ArrayList<VifRural2010> lstDatosAgosto;
    private ArrayList<VifRural2010> lstDatosSeptiembre;
    private ArrayList<VifRural2010> lstDatosOctubre;
    private ArrayList<VifRural2010> lstDatosNoviembre;
    private ArrayList<VifRural2010> lstDatosDieciembre;
    private ArrayList<VifRural2010> lstDatosEneroM;
    private ArrayList<VifRural2010> lstDatosFebreroM;
    private ArrayList<VifRural2010> lstDatosMarzoM;
    private ArrayList<VifRural2010> lstDatosAbrilM;
    private ArrayList<VifRural2010> lstDatosMayoM;
    private ArrayList<VifRural2010> lstDatosJunioM;
    private ArrayList<VifRural2010> lstDatosJulioM;
    private ArrayList<VifRural2010> lstDatosAgostoM;
    private ArrayList<VifRural2010> lstDatosSeptiembreM;
    private ArrayList<VifRural2010> lstDatosOctubreM;
    private ArrayList<VifRural2010> lstDatosNoviembreM;
    private ArrayList<VifRural2010> lstDatosDieciembreM;
    private ArrayList<VifRural2010> lstDatosEneroF;
    private ArrayList<VifRural2010> lstDatosFebreroF;
    private ArrayList<VifRural2010> lstDatosMarzoF;
    private ArrayList<VifRural2010> lstDatosAbrilF;
    private ArrayList<VifRural2010> lstDatosMayoF;
    private ArrayList<VifRural2010> lstDatosJunioF;
    private ArrayList<VifRural2010> lstDatosJulioF;
    private ArrayList<VifRural2010> lstDatosAgostoF;
    private ArrayList<VifRural2010> lstDatosSeptiembreF;
    private ArrayList<VifRural2010> lstDatosOctubreF;
    private ArrayList<VifRural2010> lstDatosNoviembreF;
    private ArrayList<VifRural2010> lstDatosDieciembreF;

    public ArrayList<VifRural2010> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<VifRural2010> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<VifRural2010> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<VifRural2010> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
    }

    public ArrayList<VifRural2010> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<VifRural2010> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
    }

    public ArrayList<VifRural2010> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<VifRural2010> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
    }

    public ArrayList<VifRural2010> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<VifRural2010> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
    }

    public ArrayList<VifRural2010> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<VifRural2010> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
    }

    public ArrayList<VifRural2010> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<VifRural2010> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
    }

    public ArrayList<VifRural2010> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<VifRural2010> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
    }

    public ArrayList<VifRural2010> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<VifRural2010> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
    }

    public ArrayList<VifRural2010> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<VifRural2010> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
    }

    public ArrayList<VifRural2010> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<VifRural2010> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<VifRural2010> getLstDatosDieciembre() {
        return lstDatosDieciembre;
    }

    public void setLstDatosDieciembre(ArrayList<VifRural2010> lstDatosDieciembre) {
        this.lstDatosDieciembre = lstDatosDieciembre;
    }

    public ArrayList<VifRural2010> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<VifRural2010> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<VifRural2010> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<VifRural2010> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<VifRural2010> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<VifRural2010> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<VifRural2010> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<VifRural2010> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<VifRural2010> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<VifRural2010> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<VifRural2010> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<VifRural2010> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<VifRural2010> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<VifRural2010> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<VifRural2010> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<VifRural2010> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<VifRural2010> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<VifRural2010> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<VifRural2010> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<VifRural2010> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<VifRural2010> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<VifRural2010> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<VifRural2010> getLstDatosDieciembreM() {
        return lstDatosDieciembreM;
    }

    public void setLstDatosDieciembreM(ArrayList<VifRural2010> lstDatosDieciembreM) {
        this.lstDatosDieciembreM = lstDatosDieciembreM;
    }

    public ArrayList<VifRural2010> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<VifRural2010> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<VifRural2010> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<VifRural2010> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<VifRural2010> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<VifRural2010> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<VifRural2010> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<VifRural2010> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<VifRural2010> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<VifRural2010> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<VifRural2010> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<VifRural2010> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<VifRural2010> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<VifRural2010> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<VifRural2010> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<VifRural2010> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<VifRural2010> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<VifRural2010> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<VifRural2010> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<VifRural2010> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<VifRural2010> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<VifRural2010> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<VifRural2010> getLstDatosDieciembreF() {
        return lstDatosDieciembreF;
    }

    public void setLstDatosDieciembreF(ArrayList<VifRural2010> lstDatosDieciembreF) {
        this.lstDatosDieciembreF = lstDatosDieciembreF;
    }

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
        this.lineModelEdadesSV = initCategoryRangoEdadesSexoVictima();
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

//    private CartesianChartModel initCategoryMes() {
//        CartesianChartModel modelMeses = new CartesianChartModel();
//        ArrayList mes = new ArrayList();
//        mes.add("ENERO");
//        mes.add("FEBRERO");
//        mes.add("MARZO");
//        mes.add("ABRIL");
//        mes.add("MAYO");
//        mes.add("JUNIO");
//        mes.add("AGOSTO");
//        mes.add("SEPTIEMBRE");
//        mes.add("OCTUBRE");
//        mes.add("NOVIEMBRE");
//        mes.add("DICIEMBRE");
//        try {
//            this.lstDatos = FVifRural2010.ObtenerDatos();
//            ChartSeries Meses = new ChartSeries();
//            Meses.setLabel("Meses de agresiones");
//            for (int i = 0; i < mes.size(); i++) {
//                for (int j = 0; j < lstDatos.size(); j++) {
//                    this.lstDatosDadoMes = FVifRural2010.ObtenerDatosDadoMes(mes.get(i).toString());
//                    Meses.set(mes.get(i).toString(), this.lstDatosDadoMes.size());
//                }
//            }
//            modelMeses.addSeries(Meses);
//
//        } catch (Exception e) {
//            Util.addErrorMessage(e, "Error");
//        }
//        return modelMeses;
//    }
    private CartesianChartModel initCategoryMes() {
        CartesianChartModel modelMeses = new CartesianChartModel();
        try {
            this.lstDatosEnero = FVifRural2010.ObtenerDatosDadoMes("ENERO");
            this.lstDatosFebrero = FVifRural2010.ObtenerDatosDadoMes("FEBRERO");
            this.lstDatosMarzo = FVifRural2010.ObtenerDatosDadoMes("MARZO");
            this.lstDatosAbril = FVifRural2010.ObtenerDatosDadoMes("ABRIL");
            this.lstDatosMayo = FVifRural2010.ObtenerDatosDadoMes("MAYO");
            this.lstDatosJunio = FVifRural2010.ObtenerDatosDadoMes("JUNIO");
            this.lstDatosJulio = FVifRural2010.ObtenerDatosDadoMes("JULIO");
            this.lstDatosAgosto = FVifRural2010.ObtenerDatosDadoMes("AGOSTO");
            this.lstDatosSeptiembre = FVifRural2010.ObtenerDatosDadoMes("SEPTIEMBRE");
            this.lstDatosOctubre = FVifRural2010.ObtenerDatosDadoMes("OCTUBRE");
            this.lstDatosNoviembre = FVifRural2010.ObtenerDatosDadoMes("NOVIEMBRE");
            this.lstDatosDieciembre = FVifRural2010.ObtenerDatosDadoMes("DICIEMBRE");

            ChartSeries Meses = new ChartSeries();
            Meses.setLabel("Meses de agresiones");

            Meses.set("Enero", this.lstDatosEnero.size());
            Meses.set("Febrero", this.lstDatosFebrero.size());
            Meses.set("Marzo", this.lstDatosMarzo.size());
            Meses.set("Abril", this.lstDatosAbril.size());
            Meses.set("Mayo", this.lstDatosMayo.size());
            Meses.set("Junio", this.lstDatosJunio.size());
            Meses.set("Julio", this.lstDatosJulio.size());
            Meses.set("Agosto", this.lstDatosAgosto.size());
            Meses.set("Septiembre", this.lstDatosSeptiembre.size());
            Meses.set("Octubre", this.lstDatosOctubre.size());
            Meses.set("Noviembre", this.lstDatosNoviembre.size());
            Meses.set("Diciembre", this.lstDatosDieciembre.size());

            modelMeses.addSeries(Meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelMeses;
    }

//    private CartesianChartModel initCategoryMesSexo() {
//        CartesianChartModel modelMesesSV = new CartesianChartModel();
//        ArrayList meses = new ArrayList();
//        meses.add("ENERO");
//        meses.add("FEBRERO");
//        meses.add("MARZO");
//        meses.add("ABRIL");
//        meses.add("MAYO");
//        meses.add("JUNIO");
//        meses.add("AGOSTO");
//        meses.add("SEPTIEMBRE");
//        meses.add("OCTUBRE");
//        meses.add("NOVIEMBRE");
//        meses.add("DICIEMBRE");
//        try {
//            this.lstDatos = FVifRural2010.ObtenerDatos();
//            ChartSeries Masculino = new ChartSeries();
//            Masculino.setLabel("Masculino");
//            for (int i = 0; i < meses.size(); i++) {
//                for (int j = 0; j < lstDatos.size(); j++) {
//                    this.lstDatosDadoMesSM = FVifRural2010.ObtenerDatosDadoMesSexo(meses.get(i).toString(), "M");
//                    Masculino.set(meses.get(i).toString(), this.lstDatosDadoMesSM.size());
//                }
//            }
//
//            ChartSeries Femenino = new ChartSeries();
//            Femenino.setLabel("Femenino");
//            for (int i = 0; i < meses.size(); i++) {
//                for (int j = 0; j < lstDatos.size(); j++) {
//                    this.lstDatosDadoMesSF = FVifRural2010.ObtenerDatosDadoMesSexo(meses.get(i).toString(), "F");
//                    Femenino.set(meses.get(i).toString(), this.lstDatosDadoMesSF.size());
//                }
//            }
//
//            modelMesesSV.addSeries(Femenino);
//            modelMesesSV.addSeries(Masculino);
//
//        } catch (Exception e) {
//            Util.addErrorMessage(e, "Error");
//        }
//        return modelMesesSV;
//    }
    private CartesianChartModel initCategoryMesSexo() {
        CartesianChartModel modelMesesSV = new CartesianChartModel();
        try {
            this.lstDatosEneroM = FVifRural2010.ObtenerDatosDadoMesSexo("ENERO", "M");
            this.lstDatosFebreroM = FVifRural2010.ObtenerDatosDadoMesSexo("FEBRERO", "M");
            this.lstDatosMarzoM = FVifRural2010.ObtenerDatosDadoMesSexo("MARZO", "M");
            this.lstDatosAbrilM = FVifRural2010.ObtenerDatosDadoMesSexo("ABRIL", "M");
            this.lstDatosMayoM = FVifRural2010.ObtenerDatosDadoMesSexo("MAYO", "M");
            this.lstDatosJunioM = FVifRural2010.ObtenerDatosDadoMesSexo("JUNIO", "M");
            this.lstDatosJulioM = FVifRural2010.ObtenerDatosDadoMesSexo("JULIO", "M");
            this.lstDatosAgostoM = FVifRural2010.ObtenerDatosDadoMesSexo("AGOSTO", "M");
            this.lstDatosSeptiembreM = FVifRural2010.ObtenerDatosDadoMesSexo("SEPTIEMBRE", "M");
            this.lstDatosOctubreM = FVifRural2010.ObtenerDatosDadoMesSexo("OCTUBRE", "M");
            this.lstDatosNoviembreM = FVifRural2010.ObtenerDatosDadoMesSexo("NOVIEMBRE", "M");
            this.lstDatosDieciembreM = FVifRural2010.ObtenerDatosDadoMesSexo("DICIEMBRE", "M");
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("Enero", this.lstDatosEneroM.size());
            Masculino.set("Febrero", this.lstDatosFebreroM.size());
            Masculino.set("Marzo", this.lstDatosMarzoM.size());
            Masculino.set("Abril", this.lstDatosAbrilM.size());
            Masculino.set("Mayo", this.lstDatosMayoM.size());
            Masculino.set("Junio", this.lstDatosJunioM.size());
            Masculino.set("Julio", this.lstDatosJulioM.size());
            Masculino.set("Agosto", this.lstDatosAgostoM.size());
            Masculino.set("Septiembre", this.lstDatosSeptiembreM.size());
            Masculino.set("Octubre", this.lstDatosOctubreM.size());
            Masculino.set("Noviembre", this.lstDatosNoviembreM.size());
            Masculino.set("Diciembre", this.lstDatosDieciembreM.size());

            this.lstDatosEneroF = FVifRural2010.ObtenerDatosDadoMesSexo("ENERO", "F");
            this.lstDatosFebreroF = FVifRural2010.ObtenerDatosDadoMesSexo("FEBRERO", "F");
            this.lstDatosMarzoF = FVifRural2010.ObtenerDatosDadoMesSexo("MARZO", "F");
            this.lstDatosAbrilF = FVifRural2010.ObtenerDatosDadoMesSexo("ABRIL", "F");
            this.lstDatosMayoF = FVifRural2010.ObtenerDatosDadoMesSexo("MAYO", "F");
            this.lstDatosJunioF = FVifRural2010.ObtenerDatosDadoMesSexo("JUNIO", "F");
            this.lstDatosJulioF = FVifRural2010.ObtenerDatosDadoMesSexo("JULIO", "F");
            this.lstDatosAgostoF = FVifRural2010.ObtenerDatosDadoMesSexo("AGOSTO", "F");
            this.lstDatosSeptiembreF = FVifRural2010.ObtenerDatosDadoMesSexo("SEPTIEMBRE", "F");
            this.lstDatosOctubreF = FVifRural2010.ObtenerDatosDadoMesSexo("OCTUBRE", "F");
            this.lstDatosNoviembreF = FVifRural2010.ObtenerDatosDadoMesSexo("NOVIEMBRE", "F");
            this.lstDatosDieciembreF = FVifRural2010.ObtenerDatosDadoMesSexo("DICIEMBRE", "F");
            
            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("Enero", this.lstDatosEneroF.size());
            Femenino.set("Febrero", this.lstDatosFebreroF.size());
            Femenino.set("Marzo", this.lstDatosMarzoF.size());
            Femenino.set("Abril", this.lstDatosAbrilF.size());
            Femenino.set("Mayo", this.lstDatosMayoF.size());
            Femenino.set("Junio", this.lstDatosJunioF.size());
            Femenino.set("Julio", this.lstDatosJulioF.size());
            Femenino.set("Agosto", this.lstDatosAgostoF.size());
            Femenino.set("Septiembre", this.lstDatosSeptiembreF.size());
            Femenino.set("Octubre", this.lstDatosOctubreF.size());
            Femenino.set("Noviembre", this.lstDatosNoviembreF.size());
            Femenino.set("Diciembre", this.lstDatosDieciembreF.size());

            modelMesesSV.addSeries(Femenino);
            modelMesesSV.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return modelMesesSV;
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
