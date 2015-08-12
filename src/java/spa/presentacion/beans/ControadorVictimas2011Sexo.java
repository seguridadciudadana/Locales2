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
import recursos.Util;
import spa.logica.clases.Victimas_2011;
import spa.logica.funciones.FVictimas_2011;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControadorVictimas2011Sexo {

    /**
     * Creates a new instance of ControadorVictimas2011Sexo
     */
    private CartesianChartModel sexoGrafico;
    private ArrayList<Victimas_2011> lstDatosSexo;
    private ArrayList<Victimas_2011> lstDatosDadoSexo;

    public CartesianChartModel getSexoGrafico() {
        return sexoGrafico;
    }

    public void setSexoGrafico(CartesianChartModel sexoGrafico) {
        this.sexoGrafico = sexoGrafico;
    }

    public ArrayList<Victimas_2011> getLstDatosSexo() {
        return lstDatosSexo;
    }

    public void setLstDatosSexo(ArrayList<Victimas_2011> lstDatosSexo) {
        this.lstDatosSexo = lstDatosSexo;
    }

    public ArrayList<Victimas_2011> getLstDatosDadoSexo() {
        return lstDatosDadoSexo;
    }

    public void setLstDatosDadoSexo(ArrayList<Victimas_2011> lstDatosDadoSexo) {
        this.lstDatosDadoSexo = lstDatosDadoSexo;
    }
       
    public ControadorVictimas2011Sexo() {
        reinit();
    }
    
    public void graficar() {
        sexoGrafico = initCategorySexo();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosDadoSexo = new ArrayList<Victimas_2011>();
        this.lstDatosSexo = new ArrayList<Victimas_2011>();
        this.init();

    }

    private CartesianChartModel initCategorySexo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSexo = FVictimas_2011.ObtenerDatosSexo();
            ChartSeries instruccion = new ChartSeries();
            instruccion.setLabel("Sexo");
            for (Victimas_2011 lstDatosP1 : lstDatosSexo) {
                lstDatosDadoSexo = FVictimas_2011.ObtenerDatosDadoSexo(lstDatosP1.getSexo());
                instruccion.set(lstDatosP1.getSexo(), lstDatosDadoSexo.size());
            }
            model.addSeries(instruccion);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
