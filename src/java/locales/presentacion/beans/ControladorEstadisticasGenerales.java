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
    private ArrayList<Locales> lstLocalesDadoRucoRice;
    private ArrayList<Locales> lstLocalesDadoRucRucoRice;
    private ArrayList<Locales> lstLocalesDadoRiceRucoRice;
    private ArrayList<Locales> lstLocalesDadoNingunoRucoRice;
    private PieChartModel pieRucoRice;
    private CartesianChartModel lineRucoRice;

    public ArrayList<Locales> getLstLocalesDadoRucoRice() {
        return lstLocalesDadoRucoRice;
    }

    public void setLstLocalesDadoRucoRice(ArrayList<Locales> lstLocalesDadoRucoRice) {
        this.lstLocalesDadoRucoRice = lstLocalesDadoRucoRice;
    }

    public ArrayList<Locales> getLstLocalesDadoRucRucoRice() {
        return lstLocalesDadoRucRucoRice;
    }

    public void setLstLocalesDadoRucRucoRice(ArrayList<Locales> lstLocalesDadoRucRucoRice) {
        this.lstLocalesDadoRucRucoRice = lstLocalesDadoRucRucoRice;
    }

    public ArrayList<Locales> getLstLocalesDadoRiceRucoRice() {
        return lstLocalesDadoRiceRucoRice;
    }

    public void setLstLocalesDadoRiceRucoRice(ArrayList<Locales> lstLocalesDadoRiceRucoRice) {
        this.lstLocalesDadoRiceRucoRice = lstLocalesDadoRiceRucoRice;
    }

    public ArrayList<Locales> getLstLocalesDadoNingunoRucoRice() {
        return lstLocalesDadoNingunoRucoRice;
    }

    public void setLstLocalesDadoNingunoRucoRice(ArrayList<Locales> lstLocalesDadoNingunoRucoRice) {
        this.lstLocalesDadoNingunoRucoRice = lstLocalesDadoNingunoRucoRice;
    }

    public PieChartModel getPieRucoRice() {
        return pieRucoRice;
    }

    public void setPieRucoRice(PieChartModel pieRucoRice) {
        this.pieRucoRice = pieRucoRice;
    }

    public CartesianChartModel getLineRucoRice() {
        return lineRucoRice;
    }

    public void setLineRucoRice(CartesianChartModel lineRucoRice) {
        this.lineRucoRice = lineRucoRice;
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
        // this.piePermisosMunicipio = pieRucoRice();
         //this.linePermisoMT = graficaRucoRice();
        

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
            permisoMT.setLabel("Permiso del MI");
            permisoMT.set("Si dispone", lstLocalesDadoSiPermisoMT.size());
            permisoMT.set("No dispone", lstLocalesDadoNoPermisoMT.size());
            permisoMT.set("No presenta", lstLocalesDadoNoPresentaPermisoMT.size());

            model.addSeries(permisoMT);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
