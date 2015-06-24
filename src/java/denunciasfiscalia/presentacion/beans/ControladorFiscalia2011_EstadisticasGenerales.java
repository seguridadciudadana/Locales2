/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2011;
import denunciasfiscalia.logica.funciones.FFiscalia_2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2011_EstadisticasGenerales {

    /**
     * Creates a new instance of ControladorFiscalia2011_EstadisticasGenerales
     */
    private ArrayList<Fiscalia_2011> lstDatos;
    private ArrayList<Fiscalia_2011> lstDatos1;
    private Fiscalia_2011 datoSel;
    private Fiscalia_2011 objFiscalia_2011;
    private ArrayList<Fiscalia_2011> lstDatosDadoViolencia;
    private ArrayList<Fiscalia_2011> lstDatosDadoCircuito;
    private ArrayList<Fiscalia_2011> lstDatosDadoSubCircuito;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineCircuito;
    private CartesianChartModel lineSubCircuito;
    private PieChartModel pieViolencia;
    private ArrayList<Fiscalia_2011> lstDatosDadoestadoCivil;
    private CartesianChartModel lineDadoestadoCivil;
    private PieChartModel pieEstadoCivil;
    private ArrayList<Fiscalia_2011> lstDatosDadoParentesco;
    private CartesianChartModel lineParentesco;
    private ArrayList<Fiscalia_2011> lstDatosLunes;
    private ArrayList<Fiscalia_2011> lstDatosMartes;
    private ArrayList<Fiscalia_2011> lstDatosMiercoles;
    private ArrayList<Fiscalia_2011> lstDatosJueves;
    private ArrayList<Fiscalia_2011> lstDatosViernes;
    private ArrayList<Fiscalia_2011> lstDatosSabado;
    private ArrayList<Fiscalia_2011> lstDatosDomingo;
    private CartesianChartModel lineDiaAgresion;
    private PieChartModel pieDiaAgresion;
    private ArrayList<Fiscalia_2011> lstEnero;
    private ArrayList<Fiscalia_2011> lstFebrero;
    private ArrayList<Fiscalia_2011> lstMarzo;
    private ArrayList<Fiscalia_2011> lstAbril;
    private ArrayList<Fiscalia_2011> lstMayo;
    private ArrayList<Fiscalia_2011> lstJunio;
    private ArrayList<Fiscalia_2011> lstJulio;
    private ArrayList<Fiscalia_2011> lstAgosto;
    private ArrayList<Fiscalia_2011> lstSeptiembre;
    private ArrayList<Fiscalia_2011> lstOctubre;
    private ArrayList<Fiscalia_2011> lstNoviembre;
    private ArrayList<Fiscalia_2011> lstDiciembre;
    private CartesianChartModel lineMeses;

    public PieChartModel getPieDiaAgresion() {
        return pieDiaAgresion;
    }

    public void setPieDiaAgresion(PieChartModel pieDiaAgresion) {
        this.pieDiaAgresion = pieDiaAgresion;
    }

    public ArrayList<Fiscalia_2011> getLstEnero() {
        return lstEnero;
    }

    public void setLstEnero(ArrayList<Fiscalia_2011> lstEnero) {
        this.lstEnero = lstEnero;
    }

    public ArrayList<Fiscalia_2011> getLstFebrero() {
        return lstFebrero;
    }

    public void setLstFebrero(ArrayList<Fiscalia_2011> lstFebrero) {
        this.lstFebrero = lstFebrero;
    }

    public ArrayList<Fiscalia_2011> getLstMarzo() {
        return lstMarzo;
    }

    public void setLstMarzo(ArrayList<Fiscalia_2011> lstMarzo) {
        this.lstMarzo = lstMarzo;
    }

    public ArrayList<Fiscalia_2011> getLstAbril() {
        return lstAbril;
    }

    public void setLstAbril(ArrayList<Fiscalia_2011> lstAbril) {
        this.lstAbril = lstAbril;
    }

    public ArrayList<Fiscalia_2011> getLstMayo() {
        return lstMayo;
    }

    public void setLstMayo(ArrayList<Fiscalia_2011> lstMayo) {
        this.lstMayo = lstMayo;
    }

    public ArrayList<Fiscalia_2011> getLstJunio() {
        return lstJunio;
    }

    public void setLstJunio(ArrayList<Fiscalia_2011> lstJunio) {
        this.lstJunio = lstJunio;
    }

    public ArrayList<Fiscalia_2011> getLstJulio() {
        return lstJulio;
    }

    public void setLstJulio(ArrayList<Fiscalia_2011> lstJulio) {
        this.lstJulio = lstJulio;
    }

    public ArrayList<Fiscalia_2011> getLstAgosto() {
        return lstAgosto;
    }

    public void setLstAgosto(ArrayList<Fiscalia_2011> lstAgosto) {
        this.lstAgosto = lstAgosto;
    }

    public ArrayList<Fiscalia_2011> getLstSeptiembre() {
        return lstSeptiembre;
    }

    public void setLstSeptiembre(ArrayList<Fiscalia_2011> lstSeptiembre) {
        this.lstSeptiembre = lstSeptiembre;
    }

    public ArrayList<Fiscalia_2011> getLstOctubre() {
        return lstOctubre;
    }

    public void setLstOctubre(ArrayList<Fiscalia_2011> lstOctubre) {
        this.lstOctubre = lstOctubre;
    }

    public ArrayList<Fiscalia_2011> getLstNoviembre() {
        return lstNoviembre;
    }

    public void setLstNoviembre(ArrayList<Fiscalia_2011> lstNoviembre) {
        this.lstNoviembre = lstNoviembre;
    }

    public ArrayList<Fiscalia_2011> getLstDiciembre() {
        return lstDiciembre;
    }

    public void setLstDiciembre(ArrayList<Fiscalia_2011> lstDiciembre) {
        this.lstDiciembre = lstDiciembre;
    }

    public CartesianChartModel getLineMeses() {
        return lineMeses;
    }

    public void setLineMeses(CartesianChartModel lineMeses) {
        this.lineMeses = lineMeses;
    }

    public CartesianChartModel getLineDiaAgresion() {
        return lineDiaAgresion;
    }

    public void setLineDiaAgresion(CartesianChartModel lineDiaAgresion) {
        this.lineDiaAgresion = lineDiaAgresion;
    }

    public ArrayList<Fiscalia_2011> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Fiscalia_2011> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Fiscalia_2011> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Fiscalia_2011> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Fiscalia_2011> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Fiscalia_2011> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Fiscalia_2011> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Fiscalia_2011> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Fiscalia_2011> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Fiscalia_2011> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Fiscalia_2011> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Fiscalia_2011> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Fiscalia_2011> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public PieChartModel getPieEstadoCivil() {
        return pieEstadoCivil;
    }

    public void setPieEstadoCivil(PieChartModel pieEstadoCivil) {
        this.pieEstadoCivil = pieEstadoCivil;
    }

    public PieChartModel getPieViolencia() {
        return pieViolencia;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoestadoCivil() {
        return lstDatosDadoestadoCivil;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoParentesco() {
        return lstDatosDadoParentesco;
    }

    public void setLstDatosDadoParentesco(ArrayList<Fiscalia_2011> lstDatosDadoParentesco) {
        this.lstDatosDadoParentesco = lstDatosDadoParentesco;
    }

    public CartesianChartModel getLineParentesco() {
        return lineParentesco;
    }

    public void setLineParentesco(CartesianChartModel lineParentesco) {
        this.lineParentesco = lineParentesco;
    }

    public void setLstDatosDadoestadoCivil(ArrayList<Fiscalia_2011> lstDatosDadoestadoCivil) {
        this.lstDatosDadoestadoCivil = lstDatosDadoestadoCivil;
    }

    public CartesianChartModel getLineDadoestadoCivil() {
        return lineDadoestadoCivil;
    }

    public void setLineDadoestadoCivil(CartesianChartModel lineDadoestadoCivil) {
        this.lineDadoestadoCivil = lineDadoestadoCivil;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoSubCircuito() {
        return lstDatosDadoSubCircuito;
    }

    public void setLstDatosDadoSubCircuito(ArrayList<Fiscalia_2011> lstDatosDadoSubCircuito) {
        this.lstDatosDadoSubCircuito = lstDatosDadoSubCircuito;
    }

    public CartesianChartModel getLineSubCircuito() {
        return lineSubCircuito;
    }

    public void setLineSubCircuito(CartesianChartModel lineSubCircuito) {
        this.lineSubCircuito = lineSubCircuito;
    }

    public void setPieViolencia(PieChartModel pieViolencia) {
        this.pieViolencia = pieViolencia;
    }

    public ArrayList<Fiscalia_2011> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Fiscalia_2011> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<Fiscalia_2011> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public CartesianChartModel getLineCircuito() {
        return lineCircuito;
    }

    public void setLineCircuito(CartesianChartModel lineCircuito) {
        this.lineCircuito = lineCircuito;
    }

    public ArrayList<Fiscalia_2011> getLstDatosDadoViolencia() {
        return lstDatosDadoViolencia;
    }

    public void setLstDatosDadoViolencia(ArrayList<Fiscalia_2011> lstDatosDadoViolencia) {
        this.lstDatosDadoViolencia = lstDatosDadoViolencia;
    }

    public ArrayList<Fiscalia_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Fiscalia_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public Fiscalia_2011 getObjFiscalia_2011() {
        return objFiscalia_2011;
    }

    public void setObjFiscalia_2011(Fiscalia_2011 objFiscalia_2011) {
        this.objFiscalia_2011 = objFiscalia_2011;
    }

    public void grficar() {
        lineCircuito = initCircuito();
        lineSubCircuito = initSubCircuito();
        lineTipoViolencia = initTipoViolencia();
        pieViolencia = pieViolencia();
        lineDadoestadoCivil = initEstadoCivil();
        pieEstadoCivil = pieEstadoCivil();
        lineParentesco = initParentescoAgresor();
        lineDiaAgresion = initDiaAgresion();
        pieDiaAgresion = pieDiaAgresion();
        lineMeses = initMeses();

    }

    @PostConstruct
    public void init() {
        grficar();
    }

    public ControladorFiscalia2011_EstadisticasGenerales() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Fiscalia_2011>();
        this.lstDatos1 = new ArrayList<Fiscalia_2011>();
        this.lstDatosDadoViolencia = new ArrayList<Fiscalia_2011>();
        this.lstDatosDadoCircuito = new ArrayList<Fiscalia_2011>();
        this.objFiscalia_2011 = new Fiscalia_2011();
        this.datoSel = new Fiscalia_2011();

        this.cargarDatos();
        this.init();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FFiscalia_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    private CartesianChartModel initTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoViolencia = FFiscalia_2011.ObtenerDatosDadoTipoAgresion(lstDatos11.getTipo_agresion());
                Violencia.set(lstDatos11.getTipo_agresion(), lstDatosDadoViolencia.size());
            }

            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Tipos de Violencia");
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoCircuito = FFiscalia_2011.ObtenerDatosDadoCircuito(lstDatos11.getCircuito());
                Circuito.set(lstDatos11.getCircuito(), lstDatosDadoCircuito.size());
            }
            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initSubCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Subcircuito = new ChartSeries();
            Subcircuito.setLabel("Tipos de Violencia");
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoSubCircuito = FFiscalia_2011.ObtenerDatosDadoSubCircuito(lstDatos11.getSubcircuito());
                Subcircuito.set(lstDatos11.getSubcircuito(), lstDatosDadoSubCircuito.size());
            }
            model.addSeries(Subcircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    //estado civil de la victima
    private CartesianChartModel initEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoestadoCivil = FFiscalia_2011.ObtenerDatosDadoEstadoCivil(lstDatos11.getEstado_civil_victima());
                Ec.set(lstDatos11.getEstado_civil_victima(), lstDatosDadoestadoCivil.size());
            }
            model.addSeries(Ec);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieEstadoCivil() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoestadoCivil = FFiscalia_2011.ObtenerDatosDadoEstadoCivil(lstDatos11.getEstado_civil_victima());
                pieModel.set(lstDatos11.getEstado_civil_victima(), lstDatosDadoestadoCivil.size());
            }
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private PieChartModel pieViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoViolencia = FFiscalia_2011.ObtenerDatosDadoTipoAgresion(lstDatos11.getTipo_agresion());
                pieModel.set(lstDatos11.getTipo_agresion(), lstDatosDadoViolencia.size());
            }
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel initParentescoAgresor() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            for (Fiscalia_2011 lstDatos11 : lstDatos1) {
                lstDatosDadoParentesco = FFiscalia_2011.ObtenerDatosDadoParentescoAgresor(lstDatos11.getParentesco_agresor_victima());
                Ec.set(lstDatos11.getParentesco_agresor_victima(), lstDatosDadoParentesco.size());
            }
            model.addSeries(Ec);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initDiaAgresion() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            lstDatosLunes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("DOMINGO");

            Ec.set("LUNES", lstDatosLunes.size());
            Ec.set("MARTES", lstDatosMartes.size());
            Ec.set("MIERCOLES", lstDatosMiercoles.size());
            Ec.set("JUEVES", lstDatosJueves.size());
            Ec.set("VIERNES", lstDatosViernes.size());
            Ec.set("SABADO", lstDatosSabado.size());
            Ec.set("DOMINGO", lstDatosDomingo.size());

            model.addSeries(Ec);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieDiaAgresion() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();

            lstDatosLunes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FFiscalia_2011.ObtenerDatosDadoDiaAgresion("DOMINGO");

            pieModel.set("LUNES", lstDatosLunes.size());
            pieModel.set("MARTES", lstDatosMartes.size());
            pieModel.set("MIERCOLES", lstDatosMiercoles.size());
            pieModel.set("JUEVES", lstDatosJueves.size());
            pieModel.set("VIERNES", lstDatosViernes.size());
            pieModel.set("SABADO", lstDatosSabado.size());
            pieModel.set("DOMINGO", lstDatosDomingo.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel initMeses() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FFiscalia_2011.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");

            lstEnero = FFiscalia_2011.ObtenerDatosDadoMesAgresion("ENERO");
            lstFebrero = FFiscalia_2011.ObtenerDatosDadoMesAgresion("FEBRERO");
            lstMarzo = FFiscalia_2011.ObtenerDatosDadoMesAgresion("MARZO");
            lstAbril = FFiscalia_2011.ObtenerDatosDadoMesAgresion("ABRIL");
            lstMayo = FFiscalia_2011.ObtenerDatosDadoMesAgresion("MAYO");
            lstJunio = FFiscalia_2011.ObtenerDatosDadoMesAgresion("JUNIO");
            lstJulio = FFiscalia_2011.ObtenerDatosDadoMesAgresion("JULIO");
            lstAgosto = FFiscalia_2011.ObtenerDatosDadoMesAgresion("AGOSTO");
            lstSeptiembre = FFiscalia_2011.ObtenerDatosDadoMesAgresion("SEPTIEMBRE");
            lstOctubre = FFiscalia_2011.ObtenerDatosDadoMesAgresion("OCTUBRE");
            lstNoviembre = FFiscalia_2011.ObtenerDatosDadoMesAgresion("NOVIEMBRE");
            lstDiciembre = FFiscalia_2011.ObtenerDatosDadoMesAgresion("DICIEMBRE");

            Ec.set("Enero", lstEnero.size());
            Ec.set("Febrero", lstFebrero.size());
            Ec.set("Marzo", lstMarzo.size());
            Ec.set("Abril", lstAbril.size());
            Ec.set("Mayo", lstMayo.size());
            Ec.set("Junio", lstJunio.size());
            Ec.set("Julio", lstJulio.size());
            Ec.set("Agosto", lstAgosto.size());
            Ec.set("Septiembre", lstSeptiembre.size());
            Ec.set("Octubre", lstOctubre.size());
            Ec.set("Noviembre", lstNoviembre.size());
            Ec.set("Diciembre", lstDiciembre.size());

            model.addSeries(Ec);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
