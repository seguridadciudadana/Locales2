/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;


/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
/**
 *
 * @author JohnnyM
 */
public class CPermisosBomberosCircuito {
    
  /**
     * Creates a new instance of ControladorPermisosBomberosCircuitos
     */
    private CartesianChartModel lineLocalesCircuitos;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoCircuito;
    private ArrayList<FichaLocales> lstLocalesCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoNo;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoNoPresenta;

    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuito() {
        return lstLocalesDadoCircuito;
    }

    public void setLstLocalesDadoCircuito(ArrayList<FichaLocales> lstLocalesDadoCircuito) {
        this.lstLocalesDadoCircuito = lstLocalesDadoCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesCircuito() {
        return lstLocalesCircuito;
    }

    public void setLstLocalesCircuito(ArrayList<FichaLocales> lstLocalesCircuito) {
        this.lstLocalesCircuito = lstLocalesCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoSi() {
        return lstLocalesDadoCircuitoSi;
    }

    public void setLstLocalesDadoCircuitoSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoSi) {
        this.lstLocalesDadoCircuitoSi = lstLocalesDadoCircuitoSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoNo() {
        return lstLocalesDadoCircuitoNo;
    }

    public void setLstLocalesDadoCircuitoNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoNo) {
        this.lstLocalesDadoCircuitoNo = lstLocalesDadoCircuitoNo;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoNoPresenta() {
        return lstLocalesDadoCircuitoNoPresenta;
    }

    public void setLstLocalesDadoCircuitoNoPresenta(ArrayList<FichaLocales> lstLocalesDadoCircuitoNoPresenta) {
        this.lstLocalesDadoCircuitoNoPresenta = lstLocalesDadoCircuitoNoPresenta;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesCircuitos = graficaCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisosBomberosCircuito() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstLocalesCircuito = FFichaLocales.ObtenerDatosCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoSi =  FFichaLocales.ObtenerDatosDadoPermisoBomberosCircuito("Si", lstLocalesCircuito.get(i).getId_circuito().getId_circuito());
                Si.set(lstLocalesCircuito.get(i).getId_circuito().getId_circuito(), lstLocalesDadoCircuitoSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoNo = FFichaLocales.ObtenerDatosDadoPermisoBomberosCircuito("No", lstLocalesCircuito.get(i).getId_circuito().getId_circuito());
                No.set(lstLocalesCircuito.get(i).getId_circuito().getId_circuito(), lstLocalesDadoCircuitoNo.size());
            }

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presenta");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoNoPresenta = FFichaLocales.ObtenerDatosDadoPermisoBomberosCircuito("No Presenta", lstLocalesCircuito.get(i).getId_circuito().getId_circuito());
                NoPresenta.set(lstLocalesCircuito.get(i).getId_circuito().getCodigo_circuito(), lstLocalesDadoCircuitoNoPresenta.size());
            }

            model.addSeries(Si);
            model.addSeries(No);
            model.addSeries(NoPresenta);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}

