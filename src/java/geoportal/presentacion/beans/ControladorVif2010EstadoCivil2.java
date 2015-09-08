/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
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
public class ControladorVif2010EstadoCivil2 {

    /**
     * Creates a new instance of ControladorVif2010EstadoCivil2
     */
    private ArrayList<Vif_2010> listDatos;
    private ArrayList<Vif_2010> listDatosDadoEstado;
    private ArrayList<Vif_2010> listDatosDadoEstadoSexoM;
    private ArrayList<Vif_2010> listDatosDadoEstadoSexoF;
    private CartesianChartModel lineEstadoCivil;

    public CartesianChartModel getLineEstadoCivil() {
        return lineEstadoCivil;
    }

    public void setLineEstadoCivil(CartesianChartModel lineEstadoCivil) {
        this.lineEstadoCivil = lineEstadoCivil;
    }
    
    

    public ArrayList<Vif_2010> getListDatos() {
        return listDatos;
    }

    public void setListDatos(ArrayList<Vif_2010> listDatos) {
        this.listDatos = listDatos;
    }

    public ArrayList<Vif_2010> getListDatosDadoEstado() {
        return listDatosDadoEstado;
    }

    public void setListDatosDadoEstado(ArrayList<Vif_2010> listDatosDadoEstado) {
        this.listDatosDadoEstado = listDatosDadoEstado;
    }

    public ArrayList<Vif_2010> getListDatosDadoEstadoSexoM() {
        return listDatosDadoEstadoSexoM;
    }

    public void setListDatosDadoEstadoSexoM(ArrayList<Vif_2010> listDatosDadoEstadoSexoM) {
        this.listDatosDadoEstadoSexoM = listDatosDadoEstadoSexoM;
    }

    public ArrayList<Vif_2010> getListDatosDadoEstadoSexoF() {
        return listDatosDadoEstadoSexoF;
    }

    public void setListDatosDadoEstadoSexoF(ArrayList<Vif_2010> listDatosDadoEstadoSexoF) {
        this.listDatosDadoEstadoSexoF = listDatosDadoEstadoSexoF;
    }

    @PostConstruct
    private void graficar() {
        this.lineEstadoCivil=graficaEstadoCivil();

    }

    public ControladorVif2010EstadoCivil2() {
        this.graficar();
    }

    private CartesianChartModel graficaEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            listDatos = FVif_2010.obtenerEstadosCiviles();
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("Masculino");
            for (int i=0;i<listDatos.size();i++){
                listDatosDadoEstadoSexoM=FVif_2010.obtenerDatosEstadoCivilSexoVictima(listDatos.get(i).getEstado_civ(), "M");
                masculino.set(listDatos.get(i).getEstado_civ(),listDatosDadoEstadoSexoM.size());
            }
            
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("Femenino");
            for (int i=0;i<listDatos.size();i++){
                listDatosDadoEstadoSexoF=FVif_2010.obtenerDatosEstadoCivilSexoVictima(listDatos.get(i).getEstado_civ(), "F");
                femenino.set(listDatos.get(i).getEstado_civ(), listDatosDadoEstadoSexoF.size());
                
            }
            
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
        }

        return model;
    }

}
