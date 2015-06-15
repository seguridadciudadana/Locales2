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
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import recursos.Util;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorDiaAgresion {

    /**
     * Creates a new instance of Vif_2010ControladorDiaAgresion
     */
    private CartesianChartModel lineModelDiaDenuncia;
    private Vif_2010 objDatos;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatos;
    private ArrayList<Vif_2010> lstDatos1;

    public ArrayList<Vif_2010> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public CartesianChartModel getLineModelDiaDenuncia() {
        return lineModelDiaDenuncia;
    }

    public void setLineModelDiaDenuncia(CartesianChartModel lineModelDiaDenuncia) {
        this.lineModelDiaDenuncia = lineModelDiaDenuncia;
    }

    public Vif_2010 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2010 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Vif_2010ControladorDiaAgresion() {
        this.reinit();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.datoSel = new Vif_2010();
        this.lstDatos1 = new ArrayList<Vif_2010>();
        this.lstDatos = new ArrayList<Vif_2010>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModelDiaDenuncia = graficaDiaDenuncia();
    }

    private CartesianChartModel graficaDiaDenuncia() {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;

        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FVif_2010.ObtenerDatos();
            for (int i = 0; i <= lstDatos.size(); i++) {
                String fechaString = lstDatos.get(i).getFecha_agre();
                if ("NA".equals(fechaString)) {
                    System.out.println("no se puede convertir esta fecha");
                } else {
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date fechaDate = formatter.parse(fechaString);
                        System.out.println("fecha date: " + fechaDate);
                        GregorianCalendar fechaCalendario = new GregorianCalendar();
                        fechaCalendario.setTime(fechaDate);
                        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
                        System.out.println("dia de la semana integer: " + diaSemana);
                        if (diaSemana == 1) {
                            //Lunes                            
                            contador1++;
                            System.out.println("prueba de contador lunes " + contador1);
                        } else if (diaSemana == 2) {
                            //martes
                            contador2 = contador2++;
                        } else if (diaSemana == 3) {
                            //miercoles
                            contador3 = contador3++;
                        } else if (diaSemana == 4) {
                            //jueves
                            contador4 = contador4++;
                        } else if (diaSemana == 5) {
                            //viernes
                            contador5 = contador5++;
                        } else if (diaSemana == 6) {
                            //sabado
                            contador6 = contador6++;

                        } else if (diaSemana == 7) {
                            //domingo
                            contador7 = contador7++;
                        }

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("");
            ChartSeries Semana = new ChartSeries();
            Semana.setLabel("Semana");
            Semana.set("Lunes", contador1);
            Semana.set("Martes", contador2);
            
            model.addSeries(Semana);

        } catch (Exception e) {
            Util.addErrorMessage("Crear chart dice: " + e.getMessage());
        }
        return model;
    }

    public void cargarDatos() {
        try {

            this.lstDatos1 = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatos1.get(0);
            System.out.println(lstDatos1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
