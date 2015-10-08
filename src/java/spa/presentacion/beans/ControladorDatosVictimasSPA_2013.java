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
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Cristhian Moreno
 */

@ManagedBean
@RequestScoped
public class ControladorDatosVictimasSPA_2013 {
    
    private ArrayList<Global> lstDatos;
    private ArrayList<Global> lstDatosCircuito;
    private ArrayList<Global> lstDatosDadoCircuito;
    private ArrayList<Global> lstDatosDadoCircuitoSM;
    private ArrayList<Global> lstDatosDadoCircuitoSF;
    private ArrayList<Global> lstDatosSubcircuito;
    private ArrayList<Global> lstDatosDadoSubcircuito;
    private ArrayList<Global> lstDatosDadoSubcircuitoSM;
    private ArrayList<Global> lstDatosDadoSubcircuitoSF;
    private ArrayList<Global> lstDatosSV;
    private ArrayList<Global> lstDatosSM;
    private ArrayList<Global> lstDatosSF;
    private Global datoSel;
    private CartesianChartModel lineModelSexoVictima;
    private CartesianChartModel lineModelSubcircuitoSexoVictima;
    private CartesianChartModel GraficaCircuitoSexoVictima;
    private CartesianChartModel GraficaCasosCircuito;
    private PieChartModel pieCircuito;
    private ArrayList<Global> lstDatos24MayoM;
    private ArrayList<Global> lstDatos24MayoF;
    private ArrayList<Global> lstDatosCamiloPonceM;
    private ArrayList<Global> lstDatosCamiloPonceF;
    private ArrayList<Global> lstDatosCaminoSolM;
    private ArrayList<Global> lstDatosLaCondamineM;
    private ArrayList<Global> lstDatosLaEstacionM;
    private ArrayList<Global> lstDatosLaPazM;
    private ArrayList<Global> lstDatosLaPrimaveraM;
    private ArrayList<Global> lstDatosPolitecnicaM;
    private ArrayList<Global> lstDatosPucaraM;
    private ArrayList<Global> lstDatosSanAlfonsoM;
    private ArrayList<Global> lstDatosShoppingM;
    private ArrayList<Global> lstDatosTerminalTerrestreM;
    private ArrayList<Global> lstDatosYaruquiesM;
    private ArrayList<Global> lstDatosCaminoSolF;
    private ArrayList<Global> lstDatosLaCondamineF;
    private ArrayList<Global> lstDatosLaEstacionF;
    private ArrayList<Global> lstDatosLaPazF;
    private ArrayList<Global> lstDatosLaPrimaveraF;
    private ArrayList<Global> lstDatosPolitecnicaF;
    private ArrayList<Global> lstDatosPucaraF;
    private ArrayList<Global> lstDatosSanAlfonsoF;
    private ArrayList<Global> lstDatosShoppingF;
    private ArrayList<Global> lstDatosTerminalTerrestreF;
    private ArrayList<Global> lstDatosYaruquiesF;
    private ArrayList<Global> lstDatos24Mayo;
    private ArrayList<Global> lstDatosCamiloPonce;
    private ArrayList<Global> lstDatosCaminoSol;
    private ArrayList<Global> lstDatosLaCondamine;
    private ArrayList<Global> lstDatosLaEstacion;
    private ArrayList<Global> lstDatosLaPaz;
    private ArrayList<Global> lstDatosLaPrimavera;
    private ArrayList<Global> lstDatosPolitecnica;
    private ArrayList<Global> lstDatosPucara;
    private ArrayList<Global> lstDatosSanAlfonso;
    private ArrayList<Global> lstDatosShopping;
    private ArrayList<Global> lstDatosTerminalTerrestre;
    private ArrayList<Global> lstDatosYaruquies;
    private Global objSPA2013;

    public Global getObjSPA2013() {
        return objSPA2013;
    }

    public void setObjSPA2013(Global objSPA2013) {
        this.objSPA2013 = objSPA2013;
    }

    public ArrayList<Global> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Global> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Global> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<Global> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<Global> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<Global> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public ArrayList<Global> getLstDatosDadoCircuitoSM() {
        return lstDatosDadoCircuitoSM;
    }

    public void setLstDatosDadoCircuitoSM(ArrayList<Global> lstDatosDadoCircuitoSM) {
        this.lstDatosDadoCircuitoSM = lstDatosDadoCircuitoSM;
    }

    public ArrayList<Global> getLstDatosDadoCircuitoSF() {
        return lstDatosDadoCircuitoSF;
    }

    public void setLstDatosDadoCircuitoSF(ArrayList<Global> lstDatosDadoCircuitoSF) {
        this.lstDatosDadoCircuitoSF = lstDatosDadoCircuitoSF;
    }

    public ArrayList<Global> getLstDatosSubcircuito() {
        return lstDatosSubcircuito;
    }

    public void setLstDatosSubcircuito(ArrayList<Global> lstDatosSubcircuito) {
        this.lstDatosSubcircuito = lstDatosSubcircuito;
    }

    public ArrayList<Global> getLstDatosDadoSubcircuito() {
        return lstDatosDadoSubcircuito;
    }

    public void setLstDatosDadoSubcircuito(ArrayList<Global> lstDatosDadoSubcircuito) {
        this.lstDatosDadoSubcircuito = lstDatosDadoSubcircuito;
    }

    public ArrayList<Global> getLstDatosDadoSubcircuitoSM() {
        return lstDatosDadoSubcircuitoSM;
    }

    public void setLstDatosDadoSubcircuitoSM(ArrayList<Global> lstDatosDadoSubcircuitoSM) {
        this.lstDatosDadoSubcircuitoSM = lstDatosDadoSubcircuitoSM;
    }

    public ArrayList<Global> getLstDatosDadoSubcircuitoSF() {
        return lstDatosDadoSubcircuitoSF;
    }

    public void setLstDatosDadoSubcircuitoSF(ArrayList<Global> lstDatosDadoSubcircuitoSF) {
        this.lstDatosDadoSubcircuitoSF = lstDatosDadoSubcircuitoSF;
    }

    public ArrayList<Global> getLstDatosSV() {
        return lstDatosSV;
    }

    public void setLstDatosSV(ArrayList<Global> lstDatosSV) {
        this.lstDatosSV = lstDatosSV;
    }

    public ArrayList<Global> getLstDatosSM() {
        return lstDatosSM;
    }

    public void setLstDatosSM(ArrayList<Global> lstDatosSM) {
        this.lstDatosSM = lstDatosSM;
    }

    public ArrayList<Global> getLstDatosSF() {
        return lstDatosSF;
    }

    public void setLstDatosSF(ArrayList<Global> lstDatosSF) {
        this.lstDatosSF = lstDatosSF;
    }

    public Global getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Global datoSel) {
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

    public ArrayList<Global> getLstDatos24MayoM() {
        return lstDatos24MayoM;
    }

    public void setLstDatos24MayoM(ArrayList<Global> lstDatos24MayoM) {
        this.lstDatos24MayoM = lstDatos24MayoM;
    }

    public ArrayList<Global> getLstDatos24MayoF() {
        return lstDatos24MayoF;
    }

    public void setLstDatos24MayoF(ArrayList<Global> lstDatos24MayoF) {
        this.lstDatos24MayoF = lstDatos24MayoF;
    }

    public ArrayList<Global> getLstDatosCamiloPonceM() {
        return lstDatosCamiloPonceM;
    }

    public void setLstDatosCamiloPonceM(ArrayList<Global> lstDatosCamiloPonceM) {
        this.lstDatosCamiloPonceM = lstDatosCamiloPonceM;
    }

    public ArrayList<Global> getLstDatosCamiloPonceF() {
        return lstDatosCamiloPonceF;
    }

    public void setLstDatosCamiloPonceF(ArrayList<Global> lstDatosCamiloPonceF) {
        this.lstDatosCamiloPonceF = lstDatosCamiloPonceF;
    }

    public ArrayList<Global> getLstDatosCaminoSolM() {
        return lstDatosCaminoSolM;
    }

    public void setLstDatosCaminoSolM(ArrayList<Global> lstDatosCaminoSolM) {
        this.lstDatosCaminoSolM = lstDatosCaminoSolM;
    }

    public ArrayList<Global> getLstDatosLaCondamineM() {
        return lstDatosLaCondamineM;
    }

    public void setLstDatosLaCondamineM(ArrayList<Global> lstDatosLaCondamineM) {
        this.lstDatosLaCondamineM = lstDatosLaCondamineM;
    }

    public ArrayList<Global> getLstDatosLaEstacionM() {
        return lstDatosLaEstacionM;
    }

    public void setLstDatosLaEstacionM(ArrayList<Global> lstDatosLaEstacionM) {
        this.lstDatosLaEstacionM = lstDatosLaEstacionM;
    }

    public ArrayList<Global> getLstDatosLaPazM() {
        return lstDatosLaPazM;
    }

    public void setLstDatosLaPazM(ArrayList<Global> lstDatosLaPazM) {
        this.lstDatosLaPazM = lstDatosLaPazM;
    }

    public ArrayList<Global> getLstDatosLaPrimaveraM() {
        return lstDatosLaPrimaveraM;
    }

    public void setLstDatosLaPrimaveraM(ArrayList<Global> lstDatosLaPrimaveraM) {
        this.lstDatosLaPrimaveraM = lstDatosLaPrimaveraM;
    }

    public ArrayList<Global> getLstDatosPolitecnicaM() {
        return lstDatosPolitecnicaM;
    }

    public void setLstDatosPolitecnicaM(ArrayList<Global> lstDatosPolitecnicaM) {
        this.lstDatosPolitecnicaM = lstDatosPolitecnicaM;
    }

    public ArrayList<Global> getLstDatosPucaraM() {
        return lstDatosPucaraM;
    }

    public void setLstDatosPucaraM(ArrayList<Global> lstDatosPucaraM) {
        this.lstDatosPucaraM = lstDatosPucaraM;
    }

    public ArrayList<Global> getLstDatosSanAlfonsoM() {
        return lstDatosSanAlfonsoM;
    }

    public void setLstDatosSanAlfonsoM(ArrayList<Global> lstDatosSanAlfonsoM) {
        this.lstDatosSanAlfonsoM = lstDatosSanAlfonsoM;
    }

    public ArrayList<Global> getLstDatosShoppingM() {
        return lstDatosShoppingM;
    }

    public void setLstDatosShoppingM(ArrayList<Global> lstDatosShoppingM) {
        this.lstDatosShoppingM = lstDatosShoppingM;
    }

    public ArrayList<Global> getLstDatosTerminalTerrestreM() {
        return lstDatosTerminalTerrestreM;
    }

    public void setLstDatosTerminalTerrestreM(ArrayList<Global> lstDatosTerminalTerrestreM) {
        this.lstDatosTerminalTerrestreM = lstDatosTerminalTerrestreM;
    }

    public ArrayList<Global> getLstDatosYaruquiesM() {
        return lstDatosYaruquiesM;
    }

    public void setLstDatosYaruquiesM(ArrayList<Global> lstDatosYaruquiesM) {
        this.lstDatosYaruquiesM = lstDatosYaruquiesM;
    }

    public ArrayList<Global> getLstDatosCaminoSolF() {
        return lstDatosCaminoSolF;
    }

    public void setLstDatosCaminoSolF(ArrayList<Global> lstDatosCaminoSolF) {
        this.lstDatosCaminoSolF = lstDatosCaminoSolF;
    }

    public ArrayList<Global> getLstDatosLaCondamineF() {
        return lstDatosLaCondamineF;
    }

    public void setLstDatosLaCondamineF(ArrayList<Global> lstDatosLaCondamineF) {
        this.lstDatosLaCondamineF = lstDatosLaCondamineF;
    }

    public ArrayList<Global> getLstDatosLaEstacionF() {
        return lstDatosLaEstacionF;
    }

    public void setLstDatosLaEstacionF(ArrayList<Global> lstDatosLaEstacionF) {
        this.lstDatosLaEstacionF = lstDatosLaEstacionF;
    }

    public ArrayList<Global> getLstDatosLaPazF() {
        return lstDatosLaPazF;
    }

    public void setLstDatosLaPazF(ArrayList<Global> lstDatosLaPazF) {
        this.lstDatosLaPazF = lstDatosLaPazF;
    }

    public ArrayList<Global> getLstDatosLaPrimaveraF() {
        return lstDatosLaPrimaveraF;
    }

    public void setLstDatosLaPrimaveraF(ArrayList<Global> lstDatosLaPrimaveraF) {
        this.lstDatosLaPrimaveraF = lstDatosLaPrimaveraF;
    }

    public ArrayList<Global> getLstDatosPolitecnicaF() {
        return lstDatosPolitecnicaF;
    }

    public void setLstDatosPolitecnicaF(ArrayList<Global> lstDatosPolitecnicaF) {
        this.lstDatosPolitecnicaF = lstDatosPolitecnicaF;
    }

    public ArrayList<Global> getLstDatosPucaraF() {
        return lstDatosPucaraF;
    }

    public void setLstDatosPucaraF(ArrayList<Global> lstDatosPucaraF) {
        this.lstDatosPucaraF = lstDatosPucaraF;
    }

    public ArrayList<Global> getLstDatosSanAlfonsoF() {
        return lstDatosSanAlfonsoF;
    }

    public void setLstDatosSanAlfonsoF(ArrayList<Global> lstDatosSanAlfonsoF) {
        this.lstDatosSanAlfonsoF = lstDatosSanAlfonsoF;
    }

    public ArrayList<Global> getLstDatosShoppingF() {
        return lstDatosShoppingF;
    }

    public void setLstDatosShoppingF(ArrayList<Global> lstDatosShoppingF) {
        this.lstDatosShoppingF = lstDatosShoppingF;
    }

    public ArrayList<Global> getLstDatosTerminalTerrestreF() {
        return lstDatosTerminalTerrestreF;
    }

    public void setLstDatosTerminalTerrestreF(ArrayList<Global> lstDatosTerminalTerrestreF) {
        this.lstDatosTerminalTerrestreF = lstDatosTerminalTerrestreF;
    }

    public ArrayList<Global> getLstDatosYaruquiesF() {
        return lstDatosYaruquiesF;
    }

    public void setLstDatosYaruquiesF(ArrayList<Global> lstDatosYaruquiesF) {
        this.lstDatosYaruquiesF = lstDatosYaruquiesF;
    }

    public ArrayList<Global> getLstDatos24Mayo() {
        return lstDatos24Mayo;
    }

    public void setLstDatos24Mayo(ArrayList<Global> lstDatos24Mayo) {
        this.lstDatos24Mayo = lstDatos24Mayo;
    }

    public ArrayList<Global> getLstDatosCamiloPonce() {
        return lstDatosCamiloPonce;
    }

    public void setLstDatosCamiloPonce(ArrayList<Global> lstDatosCamiloPonce) {
        this.lstDatosCamiloPonce = lstDatosCamiloPonce;
    }

    public ArrayList<Global> getLstDatosCaminoSol() {
        return lstDatosCaminoSol;
    }

    public void setLstDatosCaminoSol(ArrayList<Global> lstDatosCaminoSol) {
        this.lstDatosCaminoSol = lstDatosCaminoSol;
    }

    public ArrayList<Global> getLstDatosLaCondamine() {
        return lstDatosLaCondamine;
    }

    public void setLstDatosLaCondamine(ArrayList<Global> lstDatosLaCondamine) {
        this.lstDatosLaCondamine = lstDatosLaCondamine;
    }

    public ArrayList<Global> getLstDatosLaEstacion() {
        return lstDatosLaEstacion;
    }

    public void setLstDatosLaEstacion(ArrayList<Global> lstDatosLaEstacion) {
        this.lstDatosLaEstacion = lstDatosLaEstacion;
    }

    public ArrayList<Global> getLstDatosLaPaz() {
        return lstDatosLaPaz;
    }

    public void setLstDatosLaPaz(ArrayList<Global> lstDatosLaPaz) {
        this.lstDatosLaPaz = lstDatosLaPaz;
    }

    public ArrayList<Global> getLstDatosLaPrimavera() {
        return lstDatosLaPrimavera;
    }

    public void setLstDatosLaPrimavera(ArrayList<Global> lstDatosLaPrimavera) {
        this.lstDatosLaPrimavera = lstDatosLaPrimavera;
    }

    public ArrayList<Global> getLstDatosPolitecnica() {
        return lstDatosPolitecnica;
    }

    public void setLstDatosPolitecnica(ArrayList<Global> lstDatosPolitecnica) {
        this.lstDatosPolitecnica = lstDatosPolitecnica;
    }

    public ArrayList<Global> getLstDatosPucara() {
        return lstDatosPucara;
    }

    public void setLstDatosPucara(ArrayList<Global> lstDatosPucara) {
        this.lstDatosPucara = lstDatosPucara;
    }

    public ArrayList<Global> getLstDatosSanAlfonso() {
        return lstDatosSanAlfonso;
    }

    public void setLstDatosSanAlfonso(ArrayList<Global> lstDatosSanAlfonso) {
        this.lstDatosSanAlfonso = lstDatosSanAlfonso;
    }

    public ArrayList<Global> getLstDatosShopping() {
        return lstDatosShopping;
    }

    public void setLstDatosShopping(ArrayList<Global> lstDatosShopping) {
        this.lstDatosShopping = lstDatosShopping;
    }

    public ArrayList<Global> getLstDatosTerminalTerrestre() {
        return lstDatosTerminalTerrestre;
    }

    public void setLstDatosTerminalTerrestre(ArrayList<Global> lstDatosTerminalTerrestre) {
        this.lstDatosTerminalTerrestre = lstDatosTerminalTerrestre;
    }

    public ArrayList<Global> getLstDatosYaruquies() {
        return lstDatosYaruquies;
    }

    public void setLstDatosYaruquies(ArrayList<Global> lstDatosYaruquies) {
        this.lstDatosYaruquies = lstDatosYaruquies;
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        //lineModelCircuito = graficaCircuito();
        //lineModelSubCircuito = graficaSubcircuito();
        //GraficaCircuitoSexoVictima = graficaCircuitoSV();
        //lineModelSubcircuitoSexoVictima=graficaSubCircuitoSV();

    }

    private void reinit() {
        this.lstDatos = new ArrayList<Global>();
        this.lstDatosSM = new ArrayList<Global>();
        this.lstDatosSF = new ArrayList<Global>();
        this.cargarDatos();
        this.init();
    }
    
    public ControladorDatosVictimasSPA_2013 () {
      this.reinit();
    }
    
    
     public void cargarDatos() {
        try {
            this.lstDatos = FGlobal.ObtenerDatosDadoAnio(2013);
            this.objSPA2013 = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getCodigo());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarDatos dice: " + e.getMessage());
            System.out.println("public void cargarDatos dice: " + e.getMessage());
        }

    }

}
