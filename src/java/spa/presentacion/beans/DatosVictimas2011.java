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
import spa.logica.clases.Victimas_2011;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2011;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class DatosVictimas2011 {

    /**
     * Creates a new instance of DatosVictimas2011
     */
    private ArrayList<Victimas_2011> lstDatos;
    private ArrayList<Victimas_2011> lstDatosCircuito;
    private ArrayList<Victimas_2011> lstDatosDadoCircuito;
    private ArrayList<Victimas_2011> lstDatosDadoCircuitoSM;
    private ArrayList<Victimas_2011> lstDatosDadoCircuitoSF;
    private ArrayList<Victimas_2011> lstDatosSubcircuito;
    private ArrayList<Victimas_2011> lstDatosDadoSubcircuito;
    private ArrayList<Victimas_2011> lstDatosDadoSubcircuitoSM;
    private ArrayList<Victimas_2011> lstDatosDadoSubcircuitoSF;
    private ArrayList<Victimas_2011> lstDatosSV;
    private ArrayList<Victimas_2011> lstDatosSM;
    private ArrayList<Victimas_2011> lstDatosSF;
    private Victimas_2011 datoSel;
    private CartesianChartModel lineModelSexoVictima;
    private CartesianChartModel lineModelSubcircuitoSexoVictima;
    private CartesianChartModel GraficaCircuitoSexoVictima;
    private CartesianChartModel GraficaCasosCircuito;
    private PieChartModel pieCircuito;
    private ArrayList<Victimas_2011> lstDatos24MayoM;
    private ArrayList<Victimas_2011> lstDatos24MayoF;
    private ArrayList<Victimas_2011> lstDatosCamiloPonceM;
    private ArrayList<Victimas_2011> lstDatosCamiloPonceF;
    private ArrayList<Victimas_2011> lstDatosCaminoSolM;
    private ArrayList<Victimas_2011> lstDatosLaCondamineM;
    private ArrayList<Victimas_2011> lstDatosLaEstacionM;
    private ArrayList<Victimas_2011> lstDatosLaPazM;
    private ArrayList<Victimas_2011> lstDatosLaPrimaveraM;
    private ArrayList<Victimas_2011> lstDatosPolitecnicaM;
    private ArrayList<Victimas_2011> lstDatosPucaraM;
    private ArrayList<Victimas_2011> lstDatosSanAlfonsoM;
    private ArrayList<Victimas_2011> lstDatosShoppingM;
    private ArrayList<Victimas_2011> lstDatosTerminalTerrestreM;
    private ArrayList<Victimas_2011> lstDatosYaruquiesM;
    private ArrayList<Victimas_2011> lstDatosCaminoSolF;
    private ArrayList<Victimas_2011> lstDatosLaCondamineF;
    private ArrayList<Victimas_2011> lstDatosLaEstacionF;
    private ArrayList<Victimas_2011> lstDatosLaPazF;
    private ArrayList<Victimas_2011> lstDatosLaPrimaveraF;
    private ArrayList<Victimas_2011> lstDatosPolitecnicaF;
    private ArrayList<Victimas_2011> lstDatosPucaraF;
    private ArrayList<Victimas_2011> lstDatosSanAlfonsoF;
    private ArrayList<Victimas_2011> lstDatosShoppingF;
    private ArrayList<Victimas_2011> lstDatosTerminalTerrestreF;
    private ArrayList<Victimas_2011> lstDatosYaruquiesF;
    private ArrayList<Victimas_2011> lstDatos24Mayo;
    private ArrayList<Victimas_2011> lstDatosCamiloPonce;
    private ArrayList<Victimas_2011> lstDatosCaminoSol;
    private ArrayList<Victimas_2011> lstDatosLaCondamine;
    private ArrayList<Victimas_2011> lstDatosLaEstacion;
    private ArrayList<Victimas_2011> lstDatosLaPaz;
    private ArrayList<Victimas_2011> lstDatosLaPrimavera;
    private ArrayList<Victimas_2011> lstDatosPolitecnica;
    private ArrayList<Victimas_2011> lstDatosPucara;
    private ArrayList<Victimas_2011> lstDatosSanAlfonso;
    private ArrayList<Victimas_2011> lstDatosShopping;
    private ArrayList<Victimas_2011> lstDatosTerminalTerrestre;
    private ArrayList<Victimas_2011> lstDatosYaruquies;

    public ArrayList<Victimas_2011> getLstDatosDadoSubcircuitoSM() {
        return lstDatosDadoSubcircuitoSM;
    }

    public void setLstDatosDadoSubcircuitoSM(ArrayList<Victimas_2011> lstDatosDadoSubcircuitoSM) {
        this.lstDatosDadoSubcircuitoSM = lstDatosDadoSubcircuitoSM;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoSubcircuitoSF() {
        return lstDatosDadoSubcircuitoSF;
    }

    public void setLstDatosDadoSubcircuitoSF(ArrayList<Victimas_2011> lstDatosDadoSubcircuitoSF) {
        this.lstDatosDadoSubcircuitoSF = lstDatosDadoSubcircuitoSF;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoCircuitoSM() {
        return lstDatosDadoCircuitoSM;
    }

    public void setLstDatosDadoCircuitoSM(ArrayList<Victimas_2011> lstDatosDadoCircuitoSM) {
        this.lstDatosDadoCircuitoSM = lstDatosDadoCircuitoSM;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoCircuitoSF() {
        return lstDatosDadoCircuitoSF;
    }

    public void setLstDatosDadoCircuitoSF(ArrayList<Victimas_2011> lstDatosDadoCircuitoSF) {
        this.lstDatosDadoCircuitoSF = lstDatosDadoCircuitoSF;
    }

    private CartesianChartModel lineModelCircuito;
    private CartesianChartModel lineModelSubCircuito;

    public CartesianChartModel getLineModelCircuito() {
        return lineModelCircuito;
    }

    public void setLineModelCircuito(CartesianChartModel lineModelCircuito) {
        this.lineModelCircuito = lineModelCircuito;
    }

    public CartesianChartModel getLineModelSubCircuito() {
        return lineModelSubCircuito;
    }

    public void setLineModelSubCircuito(CartesianChartModel lineModelSubCircuito) {
        this.lineModelSubCircuito = lineModelSubCircuito;
    }

    public ArrayList<Victimas_2011> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<Victimas_2011> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<Victimas_2011> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public ArrayList<Victimas_2011> getLstDatosSubcircuito() {
        return lstDatosSubcircuito;
    }

    public void setLstDatosSubcircuito(ArrayList<Victimas_2011> lstDatosSubcircuito) {
        this.lstDatosSubcircuito = lstDatosSubcircuito;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoSubcircuito() {
        return lstDatosDadoSubcircuito;
    }

    public void setLstDatosDadoSubcircuito(ArrayList<Victimas_2011> lstDatosDadoSubcircuito) {
        this.lstDatosDadoSubcircuito = lstDatosDadoSubcircuito;
    }

    public ArrayList<Victimas_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Victimas_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Victimas_2011> getLstDatosSV() {
        return lstDatosSV;
    }

    public void setLstDatosSV(ArrayList<Victimas_2011> lstDatosSV) {
        this.lstDatosSV = lstDatosSV;
    }

    public ArrayList<Victimas_2011> getLstDatosSM() {
        return lstDatosSM;
    }

    public void setLstDatosSM(ArrayList<Victimas_2011> lstDatosSM) {
        this.lstDatosSM = lstDatosSM;
    }

    public ArrayList<Victimas_2011> getLstDatosSF() {
        return lstDatosSF;
    }

    public void setLstDatosSF(ArrayList<Victimas_2011> lstDatosSF) {
        this.lstDatosSF = lstDatosSF;
    }

    public Victimas_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Victimas_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public CartesianChartModel getLineModelSexoVictima() {
        return lineModelSexoVictima;
    }

    public void setLineModelSexoVictima(CartesianChartModel lineModelSexoVictima) {
        this.lineModelSexoVictima = lineModelSexoVictima;
    }

    public CartesianChartModel getLineModelSubcircuitoSexoVictima() {
        return lineModelSubcircuitoSexoVictima;
    }

    public void setLineModelSubcircuitoSexoVictima(CartesianChartModel lineModelSubcircuitoSexoVictima) {
        this.lineModelSubcircuitoSexoVictima = lineModelSubcircuitoSexoVictima;
    }

    public CartesianChartModel getGraficaCircuitoSexoVictima() {
        return GraficaCircuitoSexoVictima;
    }

    public void setGraficaCircuitoSexoVictima(CartesianChartModel GraficaCircuitoSexoVictima) {
        this.GraficaCircuitoSexoVictima = GraficaCircuitoSexoVictima;
    }

    public CartesianChartModel getGraficaCasosCircuito() {
        return GraficaCasosCircuito;
    }

    public void setGraficaCasosCircuito(CartesianChartModel GraficaCasosCircuito) {
        this.GraficaCasosCircuito = GraficaCasosCircuito;
    }

    public PieChartModel getPieCircuito() {
        return pieCircuito;
    }

    public void setPieCircuito(PieChartModel pieCircuito) {
        this.pieCircuito = pieCircuito;
    }

    public ArrayList<Victimas_2011> getLstDatos24MayoM() {
        return lstDatos24MayoM;
    }

    public void setLstDatos24MayoM(ArrayList<Victimas_2011> lstDatos24MayoM) {
        this.lstDatos24MayoM = lstDatos24MayoM;
    }

    public ArrayList<Victimas_2011> getLstDatos24MayoF() {
        return lstDatos24MayoF;
    }

    public void setLstDatos24MayoF(ArrayList<Victimas_2011> lstDatos24MayoF) {
        this.lstDatos24MayoF = lstDatos24MayoF;
    }

    public ArrayList<Victimas_2011> getLstDatosCamiloPonceM() {
        return lstDatosCamiloPonceM;
    }

    public void setLstDatosCamiloPonceM(ArrayList<Victimas_2011> lstDatosCamiloPonceM) {
        this.lstDatosCamiloPonceM = lstDatosCamiloPonceM;
    }

    public ArrayList<Victimas_2011> getLstDatosCamiloPonceF() {
        return lstDatosCamiloPonceF;
    }

    public void setLstDatosCamiloPonceF(ArrayList<Victimas_2011> lstDatosCamiloPonceF) {
        this.lstDatosCamiloPonceF = lstDatosCamiloPonceF;
    }

    public ArrayList<Victimas_2011> getLstDatosCaminoSolM() {
        return lstDatosCaminoSolM;
    }

    public void setLstDatosCaminoSolM(ArrayList<Victimas_2011> lstDatosCaminoSolM) {
        this.lstDatosCaminoSolM = lstDatosCaminoSolM;
    }

    public ArrayList<Victimas_2011> getLstDatosLaCondamineM() {
        return lstDatosLaCondamineM;
    }

    public void setLstDatosLaCondamineM(ArrayList<Victimas_2011> lstDatosLaCondamineM) {
        this.lstDatosLaCondamineM = lstDatosLaCondamineM;
    }

    public ArrayList<Victimas_2011> getLstDatosLaEstacionM() {
        return lstDatosLaEstacionM;
    }

    public void setLstDatosLaEstacionM(ArrayList<Victimas_2011> lstDatosLaEstacionM) {
        this.lstDatosLaEstacionM = lstDatosLaEstacionM;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPazM() {
        return lstDatosLaPazM;
    }

    public void setLstDatosLaPazM(ArrayList<Victimas_2011> lstDatosLaPazM) {
        this.lstDatosLaPazM = lstDatosLaPazM;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPrimaveraM() {
        return lstDatosLaPrimaveraM;
    }

    public void setLstDatosLaPrimaveraM(ArrayList<Victimas_2011> lstDatosLaPrimaveraM) {
        this.lstDatosLaPrimaveraM = lstDatosLaPrimaveraM;
    }

    public ArrayList<Victimas_2011> getLstDatosPolitecnicaM() {
        return lstDatosPolitecnicaM;
    }

    public void setLstDatosPolitecnicaM(ArrayList<Victimas_2011> lstDatosPolitecnicaM) {
        this.lstDatosPolitecnicaM = lstDatosPolitecnicaM;
    }

    public ArrayList<Victimas_2011> getLstDatosPucaraM() {
        return lstDatosPucaraM;
    }

    public void setLstDatosPucaraM(ArrayList<Victimas_2011> lstDatosPucaraM) {
        this.lstDatosPucaraM = lstDatosPucaraM;
    }

    public ArrayList<Victimas_2011> getLstDatosSanAlfonsoM() {
        return lstDatosSanAlfonsoM;
    }

    public void setLstDatosSanAlfonsoM(ArrayList<Victimas_2011> lstDatosSanAlfonsoM) {
        this.lstDatosSanAlfonsoM = lstDatosSanAlfonsoM;
    }

    public ArrayList<Victimas_2011> getLstDatosShoppingM() {
        return lstDatosShoppingM;
    }

    public void setLstDatosShoppingM(ArrayList<Victimas_2011> lstDatosShoppingM) {
        this.lstDatosShoppingM = lstDatosShoppingM;
    }

    public ArrayList<Victimas_2011> getLstDatosTerminalTerrestreM() {
        return lstDatosTerminalTerrestreM;
    }

    public void setLstDatosTerminalTerrestreM(ArrayList<Victimas_2011> lstDatosTerminalTerrestreM) {
        this.lstDatosTerminalTerrestreM = lstDatosTerminalTerrestreM;
    }

    public ArrayList<Victimas_2011> getLstDatosYaruquiesM() {
        return lstDatosYaruquiesM;
    }

    public void setLstDatosYaruquiesM(ArrayList<Victimas_2011> lstDatosYaruquiesM) {
        this.lstDatosYaruquiesM = lstDatosYaruquiesM;
    }

    public ArrayList<Victimas_2011> getLstDatosCaminoSolF() {
        return lstDatosCaminoSolF;
    }

    public void setLstDatosCaminoSolF(ArrayList<Victimas_2011> lstDatosCaminoSolF) {
        this.lstDatosCaminoSolF = lstDatosCaminoSolF;
    }

    public ArrayList<Victimas_2011> getLstDatosLaCondamineF() {
        return lstDatosLaCondamineF;
    }

    public void setLstDatosLaCondamineF(ArrayList<Victimas_2011> lstDatosLaCondamineF) {
        this.lstDatosLaCondamineF = lstDatosLaCondamineF;
    }

    public ArrayList<Victimas_2011> getLstDatosLaEstacionF() {
        return lstDatosLaEstacionF;
    }

    public void setLstDatosLaEstacionF(ArrayList<Victimas_2011> lstDatosLaEstacionF) {
        this.lstDatosLaEstacionF = lstDatosLaEstacionF;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPazF() {
        return lstDatosLaPazF;
    }

    public void setLstDatosLaPazF(ArrayList<Victimas_2011> lstDatosLaPazF) {
        this.lstDatosLaPazF = lstDatosLaPazF;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPrimaveraF() {
        return lstDatosLaPrimaveraF;
    }

    public void setLstDatosLaPrimaveraF(ArrayList<Victimas_2011> lstDatosLaPrimaveraF) {
        this.lstDatosLaPrimaveraF = lstDatosLaPrimaveraF;
    }

    public ArrayList<Victimas_2011> getLstDatosPolitecnicaF() {
        return lstDatosPolitecnicaF;
    }

    public void setLstDatosPolitecnicaF(ArrayList<Victimas_2011> lstDatosPolitecnicaF) {
        this.lstDatosPolitecnicaF = lstDatosPolitecnicaF;
    }

    public ArrayList<Victimas_2011> getLstDatosPucaraF() {
        return lstDatosPucaraF;
    }

    public void setLstDatosPucaraF(ArrayList<Victimas_2011> lstDatosPucaraF) {
        this.lstDatosPucaraF = lstDatosPucaraF;
    }

    public ArrayList<Victimas_2011> getLstDatosSanAlfonsoF() {
        return lstDatosSanAlfonsoF;
    }

    public void setLstDatosSanAlfonsoF(ArrayList<Victimas_2011> lstDatosSanAlfonsoF) {
        this.lstDatosSanAlfonsoF = lstDatosSanAlfonsoF;
    }

    public ArrayList<Victimas_2011> getLstDatosShoppingF() {
        return lstDatosShoppingF;
    }

    public void setLstDatosShoppingF(ArrayList<Victimas_2011> lstDatosShoppingF) {
        this.lstDatosShoppingF = lstDatosShoppingF;
    }

    public ArrayList<Victimas_2011> getLstDatosTerminalTerrestreF() {
        return lstDatosTerminalTerrestreF;
    }

    public void setLstDatosTerminalTerrestreF(ArrayList<Victimas_2011> lstDatosTerminalTerrestreF) {
        this.lstDatosTerminalTerrestreF = lstDatosTerminalTerrestreF;
    }

    public ArrayList<Victimas_2011> getLstDatosYaruquiesF() {
        return lstDatosYaruquiesF;
    }

    public void setLstDatosYaruquiesF(ArrayList<Victimas_2011> lstDatosYaruquiesF) {
        this.lstDatosYaruquiesF = lstDatosYaruquiesF;
    }

    public ArrayList<Victimas_2011> getLstDatos24Mayo() {
        return lstDatos24Mayo;
    }

    public void setLstDatos24Mayo(ArrayList<Victimas_2011> lstDatos24Mayo) {
        this.lstDatos24Mayo = lstDatos24Mayo;
    }

    public ArrayList<Victimas_2011> getLstDatosCamiloPonce() {
        return lstDatosCamiloPonce;
    }

    public void setLstDatosCamiloPonce(ArrayList<Victimas_2011> lstDatosCamiloPonce) {
        this.lstDatosCamiloPonce = lstDatosCamiloPonce;
    }

    public ArrayList<Victimas_2011> getLstDatosCaminoSol() {
        return lstDatosCaminoSol;
    }

    public void setLstDatosCaminoSol(ArrayList<Victimas_2011> lstDatosCaminoSol) {
        this.lstDatosCaminoSol = lstDatosCaminoSol;
    }

    public ArrayList<Victimas_2011> getLstDatosLaCondamine() {
        return lstDatosLaCondamine;
    }

    public void setLstDatosLaCondamine(ArrayList<Victimas_2011> lstDatosLaCondamine) {
        this.lstDatosLaCondamine = lstDatosLaCondamine;
    }

    public ArrayList<Victimas_2011> getLstDatosLaEstacion() {
        return lstDatosLaEstacion;
    }

    public void setLstDatosLaEstacion(ArrayList<Victimas_2011> lstDatosLaEstacion) {
        this.lstDatosLaEstacion = lstDatosLaEstacion;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPaz() {
        return lstDatosLaPaz;
    }

    public void setLstDatosLaPaz(ArrayList<Victimas_2011> lstDatosLaPaz) {
        this.lstDatosLaPaz = lstDatosLaPaz;
    }

    public ArrayList<Victimas_2011> getLstDatosLaPrimavera() {
        return lstDatosLaPrimavera;
    }

    public void setLstDatosLaPrimavera(ArrayList<Victimas_2011> lstDatosLaPrimavera) {
        this.lstDatosLaPrimavera = lstDatosLaPrimavera;
    }

    public ArrayList<Victimas_2011> getLstDatosPolitecnica() {
        return lstDatosPolitecnica;
    }

    public void setLstDatosPolitecnica(ArrayList<Victimas_2011> lstDatosPolitecnica) {
        this.lstDatosPolitecnica = lstDatosPolitecnica;
    }

    public ArrayList<Victimas_2011> getLstDatosPucara() {
        return lstDatosPucara;
    }

    public void setLstDatosPucara(ArrayList<Victimas_2011> lstDatosPucara) {
        this.lstDatosPucara = lstDatosPucara;
    }

    public ArrayList<Victimas_2011> getLstDatosSanAlfonso() {
        return lstDatosSanAlfonso;
    }

    public void setLstDatosSanAlfonso(ArrayList<Victimas_2011> lstDatosSanAlfonso) {
        this.lstDatosSanAlfonso = lstDatosSanAlfonso;
    }

    public ArrayList<Victimas_2011> getLstDatosShopping() {
        return lstDatosShopping;
    }

    public void setLstDatosShopping(ArrayList<Victimas_2011> lstDatosShopping) {
        this.lstDatosShopping = lstDatosShopping;
    }

    public ArrayList<Victimas_2011> getLstDatosTerminalTerrestre() {
        return lstDatosTerminalTerrestre;
    }

    public void setLstDatosTerminalTerrestre(ArrayList<Victimas_2011> lstDatosTerminalTerrestre) {
        this.lstDatosTerminalTerrestre = lstDatosTerminalTerrestre;
    }

    public ArrayList<Victimas_2011> getLstDatosYaruquies() {
        return lstDatosYaruquies;
    }

    public void setLstDatosYaruquies(ArrayList<Victimas_2011> lstDatosYaruquies) {
        this.lstDatosYaruquies = lstDatosYaruquies;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModelCircuito = graficaCircuito();
        lineModelSubCircuito = graficaSubcircuito();
        GraficaCircuitoSexoVictima = graficaCircuitoSV();
        lineModelSubcircuitoSexoVictima=graficaSubCircuitoSV();

    }

    private void reinit() {
        this.lstDatos = new ArrayList<Victimas_2011>();
        this.lstDatosSM = new ArrayList<Victimas_2011>();
        this.lstDatosSF = new ArrayList<Victimas_2011>();
        this.cargarDatos();
        this.init();
    }

    public DatosVictimas2011() {
        this.reinit();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVictimas_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getN_denuncia());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    private CartesianChartModel graficaCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuito = FVictimas_2011.ObtenerDatosCircuitos();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosCircuito.size(); x++) {
                lstDatosDadoCircuito = FVictimas_2011.ObtenerDatosDadoCircuito(lstDatosCircuito.get(x).getCircuito());
                Circuito.set(lstDatosCircuito.get(x).getCircuito(), lstDatosDadoCircuito.size());
            }
            model.addSeries(Circuito);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficaCircuitoSV() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FVictimas_2011.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstDatosDadoCircuitoSM = FVictimas_2011.ObtenerDatosDadoSexoVictimaCircuito("Masculino", lstDatos.get(i).getCircuito());
                Masculino.set(lstDatos.get(i).getCircuito(), lstDatosDadoCircuitoSM.size());
            }

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstDatosDadoCircuitoSF = FVictimas_2011.ObtenerDatosDadoSexoVictimaCircuito("Femenino", lstDatos.get(i).getCircuito());
                Femenino.set(lstDatos.get(i).getCircuito(), lstDatosDadoCircuitoSF.size());
            }
            model.addSeries(Femenino);
            model.addSeries(Masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficaSubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubcircuito = FVictimas_2011.ObtenerDatosSubCircuitos();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("Subcircuito");
            for (int x = 0; x < lstDatosSubcircuito.size(); x++) {
                lstDatosDadoSubcircuito = FVictimas_2011.ObtenerDatosDadoSubCircuito(lstDatosSubcircuito.get(x).getSubcircuit());
                SubCircuito.set(lstDatosSubcircuito.get(x).getSubcircuit(), lstDatosDadoSubcircuito.size());
            }
            model.addSeries(SubCircuito);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficaSubCircuitoSV() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FVictimas_2011.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstDatosDadoSubcircuitoSM = FVictimas_2011.ObtenerDatosDadoSexoVictimaSubCircuito("Masculino", lstDatos.get(i).getSubcircuit());
                Masculino.set(lstDatos.get(i).getSubcircuit(), lstDatosDadoSubcircuitoSM.size());
            }

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int i = 0; i < lstDatos.size(); i++) {
                lstDatosDadoSubcircuitoSF = FVictimas_2011.ObtenerDatosDadoSexoVictimaSubCircuito("Femenino", lstDatos.get(i).getSubcircuit());
                Femenino.set(lstDatos.get(i).getSubcircuit(), lstDatosDadoSubcircuitoSF.size());
            }
            model.addSeries(Femenino);
            model.addSeries(Masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
