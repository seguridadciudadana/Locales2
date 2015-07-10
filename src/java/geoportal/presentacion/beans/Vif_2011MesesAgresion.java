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
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class Vif_2011MesesAgresion {

    /**
     * Creates a new instance of Vif_2011MesesAgresion
     */
    private ArrayList<Vif_2011> lstDatosEnero;
    private ArrayList<Vif_2011> lstDatosEneroM;
    private ArrayList<Vif_2011> lstDatosEneroF;
    private ArrayList<Vif_2011> lstDatosFebrero;
    private ArrayList<Vif_2011> lstDatosFebreroM;
    private ArrayList<Vif_2011> lstDatosFebreroF;
    private ArrayList<Vif_2011> lstDatosMarzo;
    private ArrayList<Vif_2011> lstDatosMarzoM;
    private ArrayList<Vif_2011> lstDatosMarzoF;
    private ArrayList<Vif_2011> lstDatosAbril;
    private ArrayList<Vif_2011> lstDatosAbrilM;
    private ArrayList<Vif_2011> lstDatosAbrilF;
    private ArrayList<Vif_2011> lstDatosMayo;
    private ArrayList<Vif_2011> lstDatosMayoM;
    private ArrayList<Vif_2011> lstDatosMayoF;
    private ArrayList<Vif_2011> lstDatosJunio;
    private ArrayList<Vif_2011> lstDatosJunioM;
    private ArrayList<Vif_2011> lstDatosJunioF;
    private ArrayList<Vif_2011> lstDatosJulio;
    private ArrayList<Vif_2011> lstDatosJulioM;
    private ArrayList<Vif_2011> lstDatosJulioF;
    private ArrayList<Vif_2011> lstDatosAgosto;
    private ArrayList<Vif_2011> lstDatosAgostoM;
    private ArrayList<Vif_2011> lstDatosAgostoF;
    private ArrayList<Vif_2011> lstDatosSeptiembre;
    private ArrayList<Vif_2011> lstDatosSeptiembreM;
    private ArrayList<Vif_2011> lstDatosSeptiembreF;
    private ArrayList<Vif_2011> lstDatosOctubre;
    private ArrayList<Vif_2011> lstDatosOctubreM;
    private ArrayList<Vif_2011> lstDatosOctubreF;
    private ArrayList<Vif_2011> lstDatosNoviembre;
    private ArrayList<Vif_2011> lstDatosNoviembreF;
    private ArrayList<Vif_2011> lstDatosNoviembreM;
    private ArrayList<Vif_2011> lstDatosDiciembre;
    private ArrayList<Vif_2011> lstDatosDiciembreM;
    private ArrayList<Vif_2011> lstDatosDiciembreF;
    private ArrayList<Vif_2011> lstDatos;
    private CartesianChartModel lineMeses;
    private CartesianChartModel lineMesesSexoVictima;
    private Vif_2011 objDatos;
    private Vif_2011 datoSel;

    public Vif_2011 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2011 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosEnero() {
        return lstDatosEnero;
    }

    public void setLstDatosEnero(ArrayList<Vif_2011> lstDatosEnero) {
        this.lstDatosEnero = lstDatosEnero;
    }

    public ArrayList<Vif_2011> getLstDatosEneroM() {
        return lstDatosEneroM;
    }

    public void setLstDatosEneroM(ArrayList<Vif_2011> lstDatosEneroM) {
        this.lstDatosEneroM = lstDatosEneroM;
    }

    public ArrayList<Vif_2011> getLstDatosEneroF() {
        return lstDatosEneroF;
    }

    public void setLstDatosEneroF(ArrayList<Vif_2011> lstDatosEneroF) {
        this.lstDatosEneroF = lstDatosEneroF;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero() {
        return lstDatosFebrero;
    }

    public void setLstDatosFebrero(ArrayList<Vif_2011> lstDatosFebrero) {
        this.lstDatosFebrero = lstDatosFebrero;
    }

    public ArrayList<Vif_2011> getLstDatosFebreroM() {
        return lstDatosFebreroM;
    }

    public void setLstDatosFebreroM(ArrayList<Vif_2011> lstDatosFebreroM) {
        this.lstDatosFebreroM = lstDatosFebreroM;
    }

    public ArrayList<Vif_2011> getLstDatosFebreroF() {
        return lstDatosFebreroF;
    }

    public void setLstDatosFebreroF(ArrayList<Vif_2011> lstDatosFebreroF) {
        this.lstDatosFebreroF = lstDatosFebreroF;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo() {
        return lstDatosMarzo;
    }

    public void setLstDatosMarzo(ArrayList<Vif_2011> lstDatosMarzo) {
        this.lstDatosMarzo = lstDatosMarzo;
    }

    public ArrayList<Vif_2011> getLstDatosMarzoM() {
        return lstDatosMarzoM;
    }

    public void setLstDatosMarzoM(ArrayList<Vif_2011> lstDatosMarzoM) {
        this.lstDatosMarzoM = lstDatosMarzoM;
    }

    public ArrayList<Vif_2011> getLstDatosMarzoF() {
        return lstDatosMarzoF;
    }

    public void setLstDatosMarzoF(ArrayList<Vif_2011> lstDatosMarzoF) {
        this.lstDatosMarzoF = lstDatosMarzoF;
    }

    public ArrayList<Vif_2011> getLstDatosAbril() {
        return lstDatosAbril;
    }

    public void setLstDatosAbril(ArrayList<Vif_2011> lstDatosAbril) {
        this.lstDatosAbril = lstDatosAbril;
    }

    public ArrayList<Vif_2011> getLstDatosAbrilM() {
        return lstDatosAbrilM;
    }

    public void setLstDatosAbrilM(ArrayList<Vif_2011> lstDatosAbrilM) {
        this.lstDatosAbrilM = lstDatosAbrilM;
    }

    public ArrayList<Vif_2011> getLstDatosAbrilF() {
        return lstDatosAbrilF;
    }

    public void setLstDatosAbrilF(ArrayList<Vif_2011> lstDatosAbrilF) {
        this.lstDatosAbrilF = lstDatosAbrilF;
    }

    public ArrayList<Vif_2011> getLstDatosMayo() {
        return lstDatosMayo;
    }

    public void setLstDatosMayo(ArrayList<Vif_2011> lstDatosMayo) {
        this.lstDatosMayo = lstDatosMayo;
    }

    public ArrayList<Vif_2011> getLstDatosMayoM() {
        return lstDatosMayoM;
    }

    public void setLstDatosMayoM(ArrayList<Vif_2011> lstDatosMayoM) {
        this.lstDatosMayoM = lstDatosMayoM;
    }

    public ArrayList<Vif_2011> getLstDatosMayoF() {
        return lstDatosMayoF;
    }

    public void setLstDatosMayoF(ArrayList<Vif_2011> lstDatosMayoF) {
        this.lstDatosMayoF = lstDatosMayoF;
    }

    public ArrayList<Vif_2011> getLstDatosJunio() {
        return lstDatosJunio;
    }

    public void setLstDatosJunio(ArrayList<Vif_2011> lstDatosJunio) {
        this.lstDatosJunio = lstDatosJunio;
    }

    public ArrayList<Vif_2011> getLstDatosJunioM() {
        return lstDatosJunioM;
    }

    public void setLstDatosJunioM(ArrayList<Vif_2011> lstDatosJunioM) {
        this.lstDatosJunioM = lstDatosJunioM;
    }

    public ArrayList<Vif_2011> getLstDatosJunioF() {
        return lstDatosJunioF;
    }

    public void setLstDatosJunioF(ArrayList<Vif_2011> lstDatosJunioF) {
        this.lstDatosJunioF = lstDatosJunioF;
    }

    public ArrayList<Vif_2011> getLstDatosJulio() {
        return lstDatosJulio;
    }

    public void setLstDatosJulio(ArrayList<Vif_2011> lstDatosJulio) {
        this.lstDatosJulio = lstDatosJulio;
    }

    public ArrayList<Vif_2011> getLstDatosJulioM() {
        return lstDatosJulioM;
    }

    public void setLstDatosJulioM(ArrayList<Vif_2011> lstDatosJulioM) {
        this.lstDatosJulioM = lstDatosJulioM;
    }

    public ArrayList<Vif_2011> getLstDatosJulioF() {
        return lstDatosJulioF;
    }

    public void setLstDatosJulioF(ArrayList<Vif_2011> lstDatosJulioF) {
        this.lstDatosJulioF = lstDatosJulioF;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto() {
        return lstDatosAgosto;
    }

    public void setLstDatosAgosto(ArrayList<Vif_2011> lstDatosAgosto) {
        this.lstDatosAgosto = lstDatosAgosto;
    }

    public ArrayList<Vif_2011> getLstDatosAgostoM() {
        return lstDatosAgostoM;
    }

    public void setLstDatosAgostoM(ArrayList<Vif_2011> lstDatosAgostoM) {
        this.lstDatosAgostoM = lstDatosAgostoM;
    }

    public ArrayList<Vif_2011> getLstDatosAgostoF() {
        return lstDatosAgostoF;
    }

    public void setLstDatosAgostoF(ArrayList<Vif_2011> lstDatosAgostoF) {
        this.lstDatosAgostoF = lstDatosAgostoF;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre() {
        return lstDatosSeptiembre;
    }

    public void setLstDatosSeptiembre(ArrayList<Vif_2011> lstDatosSeptiembre) {
        this.lstDatosSeptiembre = lstDatosSeptiembre;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembreM() {
        return lstDatosSeptiembreM;
    }

    public void setLstDatosSeptiembreM(ArrayList<Vif_2011> lstDatosSeptiembreM) {
        this.lstDatosSeptiembreM = lstDatosSeptiembreM;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembreF() {
        return lstDatosSeptiembreF;
    }

    public void setLstDatosSeptiembreF(ArrayList<Vif_2011> lstDatosSeptiembreF) {
        this.lstDatosSeptiembreF = lstDatosSeptiembreF;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre() {
        return lstDatosOctubre;
    }

    public void setLstDatosOctubre(ArrayList<Vif_2011> lstDatosOctubre) {
        this.lstDatosOctubre = lstDatosOctubre;
    }

    public ArrayList<Vif_2011> getLstDatosOctubreM() {
        return lstDatosOctubreM;
    }

    public void setLstDatosOctubreM(ArrayList<Vif_2011> lstDatosOctubreM) {
        this.lstDatosOctubreM = lstDatosOctubreM;
    }

    public ArrayList<Vif_2011> getLstDatosOctubreF() {
        return lstDatosOctubreF;
    }

    public void setLstDatosOctubreF(ArrayList<Vif_2011> lstDatosOctubreF) {
        this.lstDatosOctubreF = lstDatosOctubreF;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre() {
        return lstDatosNoviembre;
    }

    public void setLstDatosNoviembre(ArrayList<Vif_2011> lstDatosNoviembre) {
        this.lstDatosNoviembre = lstDatosNoviembre;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembreF() {
        return lstDatosNoviembreF;
    }

    public void setLstDatosNoviembreF(ArrayList<Vif_2011> lstDatosNoviembreF) {
        this.lstDatosNoviembreF = lstDatosNoviembreF;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembreM() {
        return lstDatosNoviembreM;
    }

    public void setLstDatosNoviembreM(ArrayList<Vif_2011> lstDatosNoviembreM) {
        this.lstDatosNoviembreM = lstDatosNoviembreM;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre() {
        return lstDatosDiciembre;
    }

    public void setLstDatosDiciembre(ArrayList<Vif_2011> lstDatosDiciembre) {
        this.lstDatosDiciembre = lstDatosDiciembre;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembreM() {
        return lstDatosDiciembreM;
    }

    public void setLstDatosDiciembreM(ArrayList<Vif_2011> lstDatosDiciembreM) {
        this.lstDatosDiciembreM = lstDatosDiciembreM;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembreF() {
        return lstDatosDiciembreF;
    }

    public void setLstDatosDiciembreF(ArrayList<Vif_2011> lstDatosDiciembreF) {
        this.lstDatosDiciembreF = lstDatosDiciembreF;
    }

    public ArrayList<Vif_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public CartesianChartModel getLineMeses() {
        return lineMeses;
    }

    public void setLineMeses(CartesianChartModel lineMeses) {
        this.lineMeses = lineMeses;
    }

    public CartesianChartModel getLineMesesSexoVictima() {
        return lineMesesSexoVictima;
    }

    public void setLineMesesSexoVictima(CartesianChartModel lineMesesSexoVictima) {
        this.lineMesesSexoVictima = lineMesesSexoVictima;
    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public void grficar() {

        lineMeses = graficaMeses();
        lineMesesSexoVictima = graficaMesesSexoVictima();

    }
    
     private void reinit() {
        this.objDatos = new Vif_2011();
        this.datoSel = new Vif_2011();
        this.cargarDatos();
        this.init();
    }

    private CartesianChartModel graficaMeses() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEnero = FVif_2011.ObtenerDatosDadoMes("ENERO");
            lstDatosFebrero = FVif_2011.ObtenerDatosDadoMes("FEBRERO");
            lstDatosMarzo = FVif_2011.ObtenerDatosDadoMes("MARZO");
            lstDatosAbril = FVif_2011.ObtenerDatosDadoMes("ABRIL");
            lstDatosMayo = FVif_2011.ObtenerDatosDadoMes("MAYO");
            lstDatosJunio = FVif_2011.ObtenerDatosDadoMes("JUNIO");
            lstDatosJulio = FVif_2011.ObtenerDatosDadoMes("JULIO");
            lstDatosAgosto = FVif_2011.ObtenerDatosDadoMes("AGOSTO");
            lstDatosSeptiembre = FVif_2011.ObtenerDatosDadoMes("SEPTIEMBRE");
            lstDatosOctubre = FVif_2011.ObtenerDatosDadoMes("OCTUBRE");
            lstDatosNoviembre = FVif_2011.ObtenerDatosDadoMes("NOVIEMBRE");
            lstDatosDiciembre = FVif_2011.ObtenerDatosDadoMes("DICIEMBRE");

            ChartSeries Meses = new ChartSeries();
            Meses.setLabel("Meses");
            Meses.set("Enero", lstDatosEnero.size());
            Meses.set("Febrero", lstDatosFebrero.size());
            Meses.set("Marzo", lstDatosMarzo.size());
            Meses.set("Abril", lstDatosAbril.size());
            Meses.set("Mayo", lstDatosMayo.size());
            Meses.set("Junio", lstDatosJunio.size());
            Meses.set("Julio", lstDatosJulio.size());
            Meses.set("Agosto", lstDatosAgosto.size());
            Meses.set("Septiembre", lstDatosSeptiembre.size());
            Meses.set("Octubre", lstDatosOctubre.size());
            Meses.set("Noviembre", lstDatosNoviembre.size());
            Meses.set("Diciembre", lstDatosDiciembre.size());

            model.addSeries(Meses);

        } catch (Exception e) {
        }
        return model;
    }

    private CartesianChartModel graficaMesesSexoVictima() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatosEneroM = FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "M");
            lstDatosFebreroM = FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "M");
            lstDatosMarzoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "M");
            lstDatosAbrilM = FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "M");
            lstDatosMayoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "M");
            lstDatosJunioM = FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "M");
            lstDatosJulioM = FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "M");
            lstDatosAgostoM = FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "M");
            lstDatosSeptiembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "M");
            lstDatosOctubreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUMBRE", "M");
            lstDatosNoviembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "M");
            lstDatosDiciembreM = FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "M");

            lstDatosEneroF = FVif_2011.ObtenerDatosDadoMesSexoVictima("ENERO", "F");
            lstDatosFebreroF = FVif_2011.ObtenerDatosDadoMesSexoVictima("FEBRERO", "F");
            lstDatosMarzoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("MARZO", "F");
            lstDatosAbrilF = FVif_2011.ObtenerDatosDadoMesSexoVictima("ABRIL", "F");
            lstDatosMayoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("MAYO", "F");
            lstDatosJunioF = FVif_2011.ObtenerDatosDadoMesSexoVictima("JUNIO", "F");
            lstDatosJulioF = FVif_2011.ObtenerDatosDadoMesSexoVictima("JULIO", "F");
            lstDatosAgostoF = FVif_2011.ObtenerDatosDadoMesSexoVictima("AGOSTO", "F");
            lstDatosSeptiembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("SEPTIEMBRE", "F");
            lstDatosOctubreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("OCTUMBRE", "F");
            lstDatosNoviembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("NOVIEMBRE", "F");
            lstDatosDiciembreF = FVif_2011.ObtenerDatosDadoMesSexoVictima("DICIEMBRE", "F");

            ChartSeries Meses1 = new ChartSeries();
            Meses1.setLabel("Masculino");
            Meses1.set("Enero", lstDatosEneroM.size());
            Meses1.set("Febrero", lstDatosFebreroM.size());
            Meses1.set("Marzo", lstDatosMarzoM.size());
            Meses1.set("Abril", lstDatosAbrilM.size());
            Meses1.set("Mayo", lstDatosMayoM.size());
            Meses1.set("Junio", lstDatosJunioM.size());
            Meses1.set("Julio", lstDatosJulioM.size());
            Meses1.set("Agosto", lstDatosAgostoM.size());
            Meses1.set("Septiembre", lstDatosSeptiembreM.size());
            Meses1.set("Octubre", lstDatosOctubreM.size());
            Meses1.set("Noviembre", lstDatosNoviembreM.size());
            Meses1.set("Diciembre", lstDatosDiciembreM.size());

            ChartSeries Meses2 = new ChartSeries();
            Meses2.setLabel("Femenino");
            Meses2.set("Enero", lstDatosEneroF.size());
            Meses2.set("Febrero", lstDatosFebreroF.size());
            Meses2.set("Marzo", lstDatosMarzoF.size());
            Meses2.set("Abril", lstDatosAbrilF.size());
            Meses2.set("Mayo", lstDatosMayoF.size());
            Meses2.set("Junio", lstDatosJunioF.size());
            Meses2.set("Julio", lstDatosJulioF.size());
            Meses2.set("Agosto", lstDatosAgostoF.size());
            Meses2.set("Septiembre", lstDatosSeptiembreF.size());
            Meses2.set("Octubre", lstDatosOctubreF.size());
            Meses2.set("Noviembre", lstDatosNoviembreF.size());
            Meses2.set("Diciembre", lstDatosDiciembreF.size());

            model1.addSeries(Meses1);
            model1.addSeries(Meses2);

        } catch (Exception e) {
        }
        return model1;
    }

    public Vif_2011MesesAgresion() {
        this.reinit();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
