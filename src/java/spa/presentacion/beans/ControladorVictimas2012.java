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
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012 {

    /**
     * Creates a new instance of ControladorVictimas2012
     */
    private ArrayList<Victimas_2012> lstDatos;
    private ArrayList<Victimas_2012> lstDatosSV;
    private ArrayList<Victimas_2012> lstDatosSM;
    private ArrayList<Victimas_2012> lstDatosSF;
    private Victimas_2012 datoSel;
    private CartesianChartModel lineModelSexoVictima;
    private CartesianChartModel lineModelSubcircuitoSexoVictima;
    private CartesianChartModel GraficaCircuitoSexoVictima;
    private CartesianChartModel GraficaCasosCircuito;
    private PieChartModel pieCircuito;
    private ArrayList<Victimas_2012> lstDatos24MayoM;
    private ArrayList<Victimas_2012> lstDatos24MayoF;
    private ArrayList<Victimas_2012> lstDatosCamiloPonceM;
    private ArrayList<Victimas_2012> lstDatosCamiloPonceF;
    private ArrayList<Victimas_2012> lstDatosCaminoSolM;
    private ArrayList<Victimas_2012> lstDatosLaCondamineM;
    private ArrayList<Victimas_2012> lstDatosLaEstacionM;
    private ArrayList<Victimas_2012> lstDatosLaPazM;
    private ArrayList<Victimas_2012> lstDatosLaPrimaveraM;
    private ArrayList<Victimas_2012> lstDatosPolitecnicaM;
    private ArrayList<Victimas_2012> lstDatosPucaraM;
    private ArrayList<Victimas_2012> lstDatosSanAlfonsoM;
    private ArrayList<Victimas_2012> lstDatosShoppingM;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestreM;
    private ArrayList<Victimas_2012> lstDatosYaruquiesM;
    private ArrayList<Victimas_2012> lstDatosCaminoSolF;
    private ArrayList<Victimas_2012> lstDatosLaCondamineF;
    private ArrayList<Victimas_2012> lstDatosLaEstacionF;
    private ArrayList<Victimas_2012> lstDatosLaPazF;
    private ArrayList<Victimas_2012> lstDatosLaPrimaveraF;
    private ArrayList<Victimas_2012> lstDatosPolitecnicaF;
    private ArrayList<Victimas_2012> lstDatosPucaraF;
    private ArrayList<Victimas_2012> lstDatosSanAlfonsoF;
    private ArrayList<Victimas_2012> lstDatosShoppingF;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestreF;
    private ArrayList<Victimas_2012> lstDatosYaruquiesF;
    private ArrayList<Victimas_2012> lstDatos24Mayo;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce;
    private ArrayList<Victimas_2012> lstDatosCaminoSol;
    private ArrayList<Victimas_2012> lstDatosLaCondamine;
    private ArrayList<Victimas_2012> lstDatosLaEstacion;
    private ArrayList<Victimas_2012> lstDatosLaPaz;
    private ArrayList<Victimas_2012> lstDatosLaPrimavera;
    private ArrayList<Victimas_2012> lstDatosPolitecnica;
    private ArrayList<Victimas_2012> lstDatosPucara;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso;
    private ArrayList<Victimas_2012> lstDatosShopping;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestre;
    private ArrayList<Victimas_2012> lstDatosYaruquies;

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

    public ArrayList<Victimas_2012> getLstDatos24Mayo() {
        return lstDatos24Mayo;
    }

    public void setLstDatos24Mayo(ArrayList<Victimas_2012> lstDatos24Mayo) {
        this.lstDatos24Mayo = lstDatos24Mayo;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce() {
        return lstDatosCamiloPonce;
    }

    public void setLstDatosCamiloPonce(ArrayList<Victimas_2012> lstDatosCamiloPonce) {
        this.lstDatosCamiloPonce = lstDatosCamiloPonce;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSol() {
        return lstDatosCaminoSol;
    }

    public void setLstDatosCaminoSol(ArrayList<Victimas_2012> lstDatosCaminoSol) {
        this.lstDatosCaminoSol = lstDatosCaminoSol;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine() {
        return lstDatosLaCondamine;
    }

    public void setLstDatosLaCondamine(ArrayList<Victimas_2012> lstDatosLaCondamine) {
        this.lstDatosLaCondamine = lstDatosLaCondamine;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion() {
        return lstDatosLaEstacion;
    }

    public void setLstDatosLaEstacion(ArrayList<Victimas_2012> lstDatosLaEstacion) {
        this.lstDatosLaEstacion = lstDatosLaEstacion;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz() {
        return lstDatosLaPaz;
    }

    public void setLstDatosLaPaz(ArrayList<Victimas_2012> lstDatosLaPaz) {
        this.lstDatosLaPaz = lstDatosLaPaz;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimavera() {
        return lstDatosLaPrimavera;
    }

    public void setLstDatosLaPrimavera(ArrayList<Victimas_2012> lstDatosLaPrimavera) {
        this.lstDatosLaPrimavera = lstDatosLaPrimavera;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica() {
        return lstDatosPolitecnica;
    }

    public void setLstDatosPolitecnica(ArrayList<Victimas_2012> lstDatosPolitecnica) {
        this.lstDatosPolitecnica = lstDatosPolitecnica;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara() {
        return lstDatosPucara;
    }

    public void setLstDatosPucara(ArrayList<Victimas_2012> lstDatosPucara) {
        this.lstDatosPucara = lstDatosPucara;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso() {
        return lstDatosSanAlfonso;
    }

    public void setLstDatosSanAlfonso(ArrayList<Victimas_2012> lstDatosSanAlfonso) {
        this.lstDatosSanAlfonso = lstDatosSanAlfonso;
    }

    public ArrayList<Victimas_2012> getLstDatosShopping() {
        return lstDatosShopping;
    }

    public void setLstDatosShopping(ArrayList<Victimas_2012> lstDatosShopping) {
        this.lstDatosShopping = lstDatosShopping;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestre() {
        return lstDatosTerminalTerrestre;
    }

    public void setLstDatosTerminalTerrestre(ArrayList<Victimas_2012> lstDatosTerminalTerrestre) {
        this.lstDatosTerminalTerrestre = lstDatosTerminalTerrestre;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquies() {
        return lstDatosYaruquies;
    }

    public void setLstDatosYaruquies(ArrayList<Victimas_2012> lstDatosYaruquies) {
        this.lstDatosYaruquies = lstDatosYaruquies;
    }

    public CartesianChartModel getGraficaCircuitoSexoVictima() {
        return GraficaCircuitoSexoVictima;
    }

    public void setGraficaCircuitoSexoVictima(CartesianChartModel GraficaCircuitoSexoVictima) {
        this.GraficaCircuitoSexoVictima = GraficaCircuitoSexoVictima;
    }

    public ArrayList<Victimas_2012> getLstDatos24MayoM() {
        return lstDatos24MayoM;
    }

    public void setLstDatos24MayoM(ArrayList<Victimas_2012> lstDatos24MayoM) {
        this.lstDatos24MayoM = lstDatos24MayoM;
    }

    public ArrayList<Victimas_2012> getLstDatos24MayoF() {
        return lstDatos24MayoF;
    }

    public void setLstDatos24MayoF(ArrayList<Victimas_2012> lstDatos24MayoF) {
        this.lstDatos24MayoF = lstDatos24MayoF;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonceM() {
        return lstDatosCamiloPonceM;
    }

    public void setLstDatosCamiloPonceM(ArrayList<Victimas_2012> lstDatosCamiloPonceM) {
        this.lstDatosCamiloPonceM = lstDatosCamiloPonceM;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonceF() {
        return lstDatosCamiloPonceF;
    }

    public void setLstDatosCamiloPonceF(ArrayList<Victimas_2012> lstDatosCamiloPonceF) {
        this.lstDatosCamiloPonceF = lstDatosCamiloPonceF;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSolM() {
        return lstDatosCaminoSolM;
    }

    public void setLstDatosCaminoSolM(ArrayList<Victimas_2012> lstDatosCaminoSolM) {
        this.lstDatosCaminoSolM = lstDatosCaminoSolM;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamineM() {
        return lstDatosLaCondamineM;
    }

    public void setLstDatosLaCondamineM(ArrayList<Victimas_2012> lstDatosLaCondamineM) {
        this.lstDatosLaCondamineM = lstDatosLaCondamineM;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacionM() {
        return lstDatosLaEstacionM;
    }

    public void setLstDatosLaEstacionM(ArrayList<Victimas_2012> lstDatosLaEstacionM) {
        this.lstDatosLaEstacionM = lstDatosLaEstacionM;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPazM() {
        return lstDatosLaPazM;
    }

    public void setLstDatosLaPazM(ArrayList<Victimas_2012> lstDatosLaPazM) {
        this.lstDatosLaPazM = lstDatosLaPazM;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimaveraM() {
        return lstDatosLaPrimaveraM;
    }

    public void setLstDatosLaPrimaveraM(ArrayList<Victimas_2012> lstDatosLaPrimaveraM) {
        this.lstDatosLaPrimaveraM = lstDatosLaPrimaveraM;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnicaM() {
        return lstDatosPolitecnicaM;
    }

    public void setLstDatosPolitecnicaM(ArrayList<Victimas_2012> lstDatosPolitecnicaM) {
        this.lstDatosPolitecnicaM = lstDatosPolitecnicaM;
    }

    public ArrayList<Victimas_2012> getLstDatosPucaraM() {
        return lstDatosPucaraM;
    }

    public void setLstDatosPucaraM(ArrayList<Victimas_2012> lstDatosPucaraM) {
        this.lstDatosPucaraM = lstDatosPucaraM;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonsoM() {
        return lstDatosSanAlfonsoM;
    }

    public void setLstDatosSanAlfonsoM(ArrayList<Victimas_2012> lstDatosSanAlfonsoM) {
        this.lstDatosSanAlfonsoM = lstDatosSanAlfonsoM;
    }

    public ArrayList<Victimas_2012> getLstDatosShoppingM() {
        return lstDatosShoppingM;
    }

    public void setLstDatosShoppingM(ArrayList<Victimas_2012> lstDatosShoppingM) {
        this.lstDatosShoppingM = lstDatosShoppingM;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestreM() {
        return lstDatosTerminalTerrestreM;
    }

    public void setLstDatosTerminalTerrestreM(ArrayList<Victimas_2012> lstDatosTerminalTerrestreM) {
        this.lstDatosTerminalTerrestreM = lstDatosTerminalTerrestreM;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquiesM() {
        return lstDatosYaruquiesM;
    }

    public void setLstDatosYaruquiesM(ArrayList<Victimas_2012> lstDatosYaruquiesM) {
        this.lstDatosYaruquiesM = lstDatosYaruquiesM;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSolF() {
        return lstDatosCaminoSolF;
    }

    public void setLstDatosCaminoSolF(ArrayList<Victimas_2012> lstDatosCaminoSolF) {
        this.lstDatosCaminoSolF = lstDatosCaminoSolF;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamineF() {
        return lstDatosLaCondamineF;
    }

    public void setLstDatosLaCondamineF(ArrayList<Victimas_2012> lstDatosLaCondamineF) {
        this.lstDatosLaCondamineF = lstDatosLaCondamineF;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacionF() {
        return lstDatosLaEstacionF;
    }

    public void setLstDatosLaEstacionF(ArrayList<Victimas_2012> lstDatosLaEstacionF) {
        this.lstDatosLaEstacionF = lstDatosLaEstacionF;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPazF() {
        return lstDatosLaPazF;
    }

    public void setLstDatosLaPazF(ArrayList<Victimas_2012> lstDatosLaPazF) {
        this.lstDatosLaPazF = lstDatosLaPazF;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimaveraF() {
        return lstDatosLaPrimaveraF;
    }

    public void setLstDatosLaPrimaveraF(ArrayList<Victimas_2012> lstDatosLaPrimaveraF) {
        this.lstDatosLaPrimaveraF = lstDatosLaPrimaveraF;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnicaF() {
        return lstDatosPolitecnicaF;
    }

    public void setLstDatosPolitecnicaF(ArrayList<Victimas_2012> lstDatosPolitecnicaF) {
        this.lstDatosPolitecnicaF = lstDatosPolitecnicaF;
    }

    public ArrayList<Victimas_2012> getLstDatosPucaraF() {
        return lstDatosPucaraF;
    }

    public void setLstDatosPucaraF(ArrayList<Victimas_2012> lstDatosPucaraF) {
        this.lstDatosPucaraF = lstDatosPucaraF;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonsoF() {
        return lstDatosSanAlfonsoF;
    }

    public void setLstDatosSanAlfonsoF(ArrayList<Victimas_2012> lstDatosSanAlfonsoF) {
        this.lstDatosSanAlfonsoF = lstDatosSanAlfonsoF;
    }

    public ArrayList<Victimas_2012> getLstDatosShoppingF() {
        return lstDatosShoppingF;
    }

    public void setLstDatosShoppingF(ArrayList<Victimas_2012> lstDatosShoppingF) {
        this.lstDatosShoppingF = lstDatosShoppingF;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestreF() {
        return lstDatosTerminalTerrestreF;
    }

    public void setLstDatosTerminalTerrestreF(ArrayList<Victimas_2012> lstDatosTerminalTerrestreF) {
        this.lstDatosTerminalTerrestreF = lstDatosTerminalTerrestreF;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquiesF() {
        return lstDatosYaruquiesF;
    }

    public void setLstDatosYaruquiesF(ArrayList<Victimas_2012> lstDatosYaruquiesF) {
        this.lstDatosYaruquiesF = lstDatosYaruquiesF;
    }

    public CartesianChartModel getLineModelSubcircuitoSexoVictima() {
        return lineModelSubcircuitoSexoVictima;
    }

    public void setLineModelSubcircuitoSexoVictima(CartesianChartModel lineModelSubcircuitoSexoVictima) {
        this.lineModelSubcircuitoSexoVictima = lineModelSubcircuitoSexoVictima;
    }

    public CartesianChartModel getLineModelSexoVictima() {
        return lineModelSexoVictima;
    }

    public ArrayList<Victimas_2012> getLstDatosSV() {
        return lstDatosSV;
    }

    public void setLstDatosSV(ArrayList<Victimas_2012> lstDatosSV) {
        this.lstDatosSV = lstDatosSV;
    }

    public void setLineModelSexoVictima(CartesianChartModel lineModelSexoVictima) {
        this.lineModelSexoVictima = lineModelSexoVictima;
    }

    public ArrayList<Victimas_2012> getLstDatosSM() {
        return lstDatosSM;
    }

    public void setLstDatosSM(ArrayList<Victimas_2012> lstDatosSM) {
        this.lstDatosSM = lstDatosSM;
    }

    public ArrayList<Victimas_2012> getLstDatosSF() {
        return lstDatosSF;
    }

    public void setLstDatosSF(ArrayList<Victimas_2012> lstDatosSF) {
        this.lstDatosSF = lstDatosSF;
    }

    public ArrayList<Victimas_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Victimas_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Victimas_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Victimas_2012 datoSel) {
        this.datoSel = datoSel;
    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public ControladorVictimas2012() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Victimas_2012>();
        this.lstDatosSM = new ArrayList<Victimas_2012>();
        this.lstDatosSF = new ArrayList<Victimas_2012>();

        this.cargarDatos();
        this.init();

    }

    //Graficas
    public void grficar() {
//        lineModelSexoVictima = initCategoryModelSexoV();
//        lineModelSubcircuitoSexoVictima = initCategoryModelSubcircuitoSexo();
        GraficaCircuitoSexoVictima = graficaCircuitoSexoVictima();
        pieCircuito = pieCircuito();
        GraficaCasosCircuito = graficaCasosCircuito();

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

//    private CartesianChartModel initCategoryModelSexoV() {
//        CartesianChartModel model = new CartesianChartModel();
//        try {
//            lstDatosSV = FVictimas_2012.ObtenerDatos();
//            ChartSeries CircuitoSexoMV = new ChartSeries();
//            CircuitoSexoMV.setLabel("Masculino");
//            for (int i = 0; i < lstDatosSV.size(); i++) {
//                lstDatosSM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", lstDatosSV.get(i).getCircuito());
//                CircuitoSexoMV.set(lstDatosSV.get(i).getCircuito(), lstDatosSM.size());
//            }
//            ChartSeries CircuitoSexoFV = new ChartSeries();
//            CircuitoSexoFV.setLabel("Femenino");
//            for (int j = 0; j < lstDatosSV.size(); j++) {
//                lstDatosSF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", lstDatosSV.get(j).getCircuito());
//                CircuitoSexoFV.set(lstDatosSV.get(j).getCircuito(), lstDatosSF.size());
//            }
//            model.addSeries(CircuitoSexoMV);
//            model.addSeries(CircuitoSexoFV);
//
//        } catch (Exception e) {
//            Util.addErrorMessage(e, "Error");
//        }
//        return model;
//    }
//
//    private CartesianChartModel initCategoryModelSubcircuitoSexo() {
//        CartesianChartModel model = new CartesianChartModel();
//        try {
//            lstDatosSV = FVictimas_2012.ObtenerDatos();
//            ChartSeries CircuitoSexoMV = new ChartSeries();
//            CircuitoSexoMV.setLabel("Masculino");
//            for (int i = 0; i < lstDatosSV.size(); i++) {
//                lstDatosSM = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", lstDatosSV.get(i).getSubcircuit());
//                CircuitoSexoMV.set(lstDatosSV.get(i).getCircuito(), lstDatosSM.size());
//            }
//            ChartSeries CircuitoSexoFV = new ChartSeries();
//            CircuitoSexoFV.setLabel("Femenino");
//            for (int j = 0; j < lstDatosSV.size(); j++) {
//                lstDatosSF = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", lstDatosSV.get(j).getSubcircuit());
//                CircuitoSexoFV.set(lstDatosSV.get(j).getCircuito(), lstDatosSF.size());
//            }
//            model.addSeries(CircuitoSexoMV);
//            model.addSeries(CircuitoSexoFV);
//
//        } catch (Exception e) {
//            Util.addErrorMessage(e, "Error");
//        }
//        return model;
//    }
    private CartesianChartModel graficaCircuitoSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24MayoF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "24 DE MAYO");
            lstDatos24MayoM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "24 DE MAYO");
            lstDatosCamiloPonceM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "CAMILO PONCE");
            lstDatosCamiloPonceF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "CAMILO PONCE");
            lstDatosCaminoSolF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "CAMINO AL SOL");
            lstDatosCaminoSolM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "CAMINO AL SOL");
            lstDatosLaCondamineF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "LA CONDAMINE");
            lstDatosLaCondamineM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "LA CONDAMINE");
            lstDatosLaEstacionF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "LA ESTACION");
            lstDatosLaEstacionM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "LA ESTACION");
            lstDatosLaPazF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "LA PAZ");
            lstDatosLaPazM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "LA PAZ");
            lstDatosLaPrimaveraF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "LA PRIMAVERA");
            lstDatosLaPrimaveraM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "LA PRIMAVERA");
            lstDatosPolitecnicaF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "POLITECNICA");
            lstDatosPolitecnicaM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "POLITECNICA");
            lstDatosPucaraM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "PUCARA");
            lstDatosPucaraF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "PUCARA");
            lstDatosSanAlfonsoF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "SAN ALFONSO");
            lstDatosSanAlfonsoM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "SAN ALFONSO");
            lstDatosShoppingF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "SHOPPING");
            lstDatosShoppingM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "SHOPPING");
            lstDatosTerminalTerrestreF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "TERMINAL TERRESTRE");
            lstDatosTerminalTerrestreM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "TERMINAL TERRESTRE");
            lstDatosYaruquiesF = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Femenino", "YARUQUIES");
            lstDatosYaruquiesM = FVictimas_2012.ObtenerDatosDadoSexoVictimaCircuito("Masculino", "YARUQUIES");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("24 DE MAYO", lstDatos24MayoM.size());
            Masculino.set("CAMILO PONCE", lstDatosCamiloPonceM.size());
            Masculino.set("CAMINO AL SOL", lstDatosCaminoSolM.size());
            Masculino.set("LA CONDAMINE", lstDatosLaCondamineM.size());
            Masculino.set("LA ESTACION", lstDatosLaEstacionM.size());
            Masculino.set("LA PAZ", lstDatosLaPazM.size());
            Masculino.set("LA PRIMAVERA", lstDatosLaPrimaveraM.size());
            Masculino.set("POLITECNICA", lstDatosPolitecnicaM.size());
            Masculino.set("PUCARA", lstDatosPucaraM.size());
            Masculino.set("SAN ALFONSO", lstDatosSanAlfonsoM.size());
            Masculino.set("SHOPPING", lstDatosShoppingM.size());
            Masculino.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreM.size());
            Masculino.set("YARUQUIES", lstDatosYaruquiesM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("24 DE MAYO", lstDatos24MayoF.size());
            Femenino.set("CAMILO PONCE", lstDatosCamiloPonceF.size());
            Femenino.set("CAMINO AL SOL", lstDatosCaminoSolF.size());
            Femenino.set("LA CONDAMINE", lstDatosLaCondamineF.size());
            Femenino.set("LA ESTACION", lstDatosLaEstacionF.size());
            Femenino.set("LA PAZ", lstDatosLaPazF.size());
            Femenino.set("LA PRIMAVERA", lstDatosLaPrimaveraF.size());
            Femenino.set("POLITECNICA", lstDatosPolitecnicaF.size());
            Femenino.set("PUCARA", lstDatosPucaraF.size());
            Femenino.set("SAN ALFONSO", lstDatosSanAlfonsoF.size());
            Femenino.set("SHOPPING", lstDatosShoppingF.size());
            Femenino.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreF.size());
            Femenino.set("YARUQUIES", lstDatosYaruquiesF.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieCircuito() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();

            lstDatos24Mayo = FVictimas_2012.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce = FVictimas_2012.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminoSol = FVictimas_2012.ObtenerDatosDadoCircuito("CAMINO AL SOL");
            lstDatosLaCondamine = FVictimas_2012.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion = FVictimas_2012.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz = FVictimas_2012.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera = FVictimas_2012.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica = FVictimas_2012.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara = FVictimas_2012.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso = FVictimas_2012.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping = FVictimas_2012.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerrestre = FVictimas_2012.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies = FVictimas_2012.ObtenerDatosDadoCircuito("YARUQUIES");

            pieModel.set("24 de Mayo", lstDatos24Mayo.size());
            pieModel.set("Camilo Ponce", lstDatosCamiloPonce.size());
            pieModel.set("Caminos al Sol", lstDatosCaminoSol.size());
            pieModel.set("La Condamine", lstDatosLaCondamine.size());
            pieModel.set("La Estación", lstDatosLaEstacion.size());
            pieModel.set("La Paz", lstDatosLaPaz.size());
            pieModel.set("La Primavera", lstDatosLaPrimavera.size());
            pieModel.set("Politecnica", lstDatosPolitecnica.size());
            pieModel.set("Pucará", lstDatosPucara.size());
            pieModel.set("San Alfonso", lstDatosSanAlfonso.size());
            pieModel.set("Shopping", lstDatosShopping.size());
            pieModel.set("Terminal Terrestre", lstDatosTerminalTerrestre.size());
            pieModel.set("Yaruquies", lstDatosYaruquies.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel graficaCasosCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24Mayo = FVictimas_2012.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce = FVictimas_2012.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminoSol = FVictimas_2012.ObtenerDatosDadoCircuito("CAMINO AL SOL");
            lstDatosLaCondamine = FVictimas_2012.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion = FVictimas_2012.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz = FVictimas_2012.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera = FVictimas_2012.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica = FVictimas_2012.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara = FVictimas_2012.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso = FVictimas_2012.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping = FVictimas_2012.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerrestre = FVictimas_2012.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies = FVictimas_2012.ObtenerDatosDadoCircuito("YARUQUIES");

            ChartSeries circuito = new ChartSeries();
            circuito.setLabel("Circuito");
            circuito.set("24 de Mayo", lstDatos24Mayo.size());
            circuito.set("Camilo Ponce", lstDatosCamiloPonce.size());
            circuito.set("Caminos al Sol", lstDatosCaminoSol.size());
            circuito.set("La Condamine", lstDatosLaCondamine.size());
            circuito.set("La Estación", lstDatosLaEstacion.size());
            circuito.set("La Paz", lstDatosLaPaz.size());
            circuito.set("La Primavera", lstDatosLaPrimavera.size());
            circuito.set("Politecnica", lstDatosPolitecnica.size());
            circuito.set("Pucará", lstDatosPucara.size());
            circuito.set("San Alfonso", lstDatosSanAlfonso.size());
            circuito.set("Shopping", lstDatosShopping.size());
            circuito.set("Terminal Terrestre", lstDatosTerminalTerrestre.size());
            circuito.set("Yaruquies", lstDatosYaruquies.size());
            model.addSeries(circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
