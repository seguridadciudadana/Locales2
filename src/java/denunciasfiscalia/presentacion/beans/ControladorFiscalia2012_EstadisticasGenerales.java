/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2012;
import denunciasfiscalia.logica.funciones.FFiscalia_2012;
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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2012_EstadisticasGenerales {
    
    private ArrayList<Fiscalia_2012> lstDatos;
    private ArrayList<Fiscalia_2012> lstDatos1;
    private Fiscalia_2012 datoSel;
    private Fiscalia_2012 objFiscalia_2012;
    private ArrayList<Fiscalia_2012> lstDatosDadoViolencia;
    private ArrayList<Fiscalia_2012> lstDatosDadoCircuito;
    private ArrayList<Fiscalia_2012> lstDatosDadoSubCircuito;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineCircuito;
    private CartesianChartModel lineSubCircuito;
    private PieChartModel pieViolencia;
    private ArrayList<Fiscalia_2012> lstDatosDadoestadoCivil;
    private CartesianChartModel lineDadoestadoCivil;
    private PieChartModel pieEstadoCivil;
    private ArrayList<Fiscalia_2012> lstDatosDadoParentesco;
    private CartesianChartModel lineParentesco;
    private ArrayList<Fiscalia_2012> lstDatosLunes;
    private ArrayList<Fiscalia_2012> lstDatosMartes;
    private ArrayList<Fiscalia_2012> lstDatosMiercoles;
    private ArrayList<Fiscalia_2012> lstDatosJueves;
    private ArrayList<Fiscalia_2012> lstDatosViernes;
    private ArrayList<Fiscalia_2012> lstDatosSabado;
    private ArrayList<Fiscalia_2012> lstDatosDomingo;
    private CartesianChartModel lineDiaAgresion;
    private PieChartModel pieDiaAgresion;
    private ArrayList<Fiscalia_2012> lstEnero;
    private ArrayList<Fiscalia_2012> lstFebrero;
    private ArrayList<Fiscalia_2012> lstMarzo;
    private ArrayList<Fiscalia_2012> lstAbril;
    private ArrayList<Fiscalia_2012> lstMayo;
    private ArrayList<Fiscalia_2012> lstJunio;
    private ArrayList<Fiscalia_2012> lstJulio;
    private ArrayList<Fiscalia_2012> lstAgosto;
    private ArrayList<Fiscalia_2012> lstSeptiembre;
    private ArrayList<Fiscalia_2012> lstOctubre;
    private ArrayList<Fiscalia_2012> lstNoviembre;
    private ArrayList<Fiscalia_2012> lstDiciembre;
    private CartesianChartModel lineMeses;

    public ArrayList<Fiscalia_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Fiscalia_2012> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Fiscalia_2012> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public Fiscalia_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public Fiscalia_2012 getObjFiscalia_2012() {
        return objFiscalia_2012;
    }

    public void setObjFiscalia_2012(Fiscalia_2012 objFiscalia_2012) {
        this.objFiscalia_2012 = objFiscalia_2012;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDadoViolencia() {
        return lstDatosDadoViolencia;
    }

    public void setLstDatosDadoViolencia(ArrayList<Fiscalia_2012> lstDatosDadoViolencia) {
        this.lstDatosDadoViolencia = lstDatosDadoViolencia;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<Fiscalia_2012> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDadoSubCircuito() {
        return lstDatosDadoSubCircuito;
    }

    public void setLstDatosDadoSubCircuito(ArrayList<Fiscalia_2012> lstDatosDadoSubCircuito) {
        this.lstDatosDadoSubCircuito = lstDatosDadoSubCircuito;
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

    public CartesianChartModel getLineSubCircuito() {
        return lineSubCircuito;
    }

    public void setLineSubCircuito(CartesianChartModel lineSubCircuito) {
        this.lineSubCircuito = lineSubCircuito;
    }

    public PieChartModel getPieViolencia() {
        return pieViolencia;
    }

    public void setPieViolencia(PieChartModel pieViolencia) {
        this.pieViolencia = pieViolencia;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDadoestadoCivil() {
        return lstDatosDadoestadoCivil;
    }

    public void setLstDatosDadoestadoCivil(ArrayList<Fiscalia_2012> lstDatosDadoestadoCivil) {
        this.lstDatosDadoestadoCivil = lstDatosDadoestadoCivil;
    }

    public CartesianChartModel getLineDadoestadoCivil() {
        return lineDadoestadoCivil;
    }

    public void setLineDadoestadoCivil(CartesianChartModel lineDadoestadoCivil) {
        this.lineDadoestadoCivil = lineDadoestadoCivil;
    }

    public PieChartModel getPieEstadoCivil() {
        return pieEstadoCivil;
    }

    public void setPieEstadoCivil(PieChartModel pieEstadoCivil) {
        this.pieEstadoCivil = pieEstadoCivil;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDadoParentesco() {
        return lstDatosDadoParentesco;
    }

    public void setLstDatosDadoParentesco(ArrayList<Fiscalia_2012> lstDatosDadoParentesco) {
        this.lstDatosDadoParentesco = lstDatosDadoParentesco;
    }

    public CartesianChartModel getLineParentesco() {
        return lineParentesco;
    }

    public void setLineParentesco(CartesianChartModel lineParentesco) {
        this.lineParentesco = lineParentesco;
    }

    public ArrayList<Fiscalia_2012> getLstDatosLunes() {
        return lstDatosLunes;
    }

    public void setLstDatosLunes(ArrayList<Fiscalia_2012> lstDatosLunes) {
        this.lstDatosLunes = lstDatosLunes;
    }

    public ArrayList<Fiscalia_2012> getLstDatosMartes() {
        return lstDatosMartes;
    }

    public void setLstDatosMartes(ArrayList<Fiscalia_2012> lstDatosMartes) {
        this.lstDatosMartes = lstDatosMartes;
    }

    public ArrayList<Fiscalia_2012> getLstDatosMiercoles() {
        return lstDatosMiercoles;
    }

    public void setLstDatosMiercoles(ArrayList<Fiscalia_2012> lstDatosMiercoles) {
        this.lstDatosMiercoles = lstDatosMiercoles;
    }

    public ArrayList<Fiscalia_2012> getLstDatosJueves() {
        return lstDatosJueves;
    }

    public void setLstDatosJueves(ArrayList<Fiscalia_2012> lstDatosJueves) {
        this.lstDatosJueves = lstDatosJueves;
    }

    public ArrayList<Fiscalia_2012> getLstDatosViernes() {
        return lstDatosViernes;
    }

    public void setLstDatosViernes(ArrayList<Fiscalia_2012> lstDatosViernes) {
        this.lstDatosViernes = lstDatosViernes;
    }

    public ArrayList<Fiscalia_2012> getLstDatosSabado() {
        return lstDatosSabado;
    }

    public void setLstDatosSabado(ArrayList<Fiscalia_2012> lstDatosSabado) {
        this.lstDatosSabado = lstDatosSabado;
    }

    public ArrayList<Fiscalia_2012> getLstDatosDomingo() {
        return lstDatosDomingo;
    }

    public void setLstDatosDomingo(ArrayList<Fiscalia_2012> lstDatosDomingo) {
        this.lstDatosDomingo = lstDatosDomingo;
    }

    public CartesianChartModel getLineDiaAgresion() {
        return lineDiaAgresion;
    }

    public void setLineDiaAgresion(CartesianChartModel lineDiaAgresion) {
        this.lineDiaAgresion = lineDiaAgresion;
    }

    public PieChartModel getPieDiaAgresion() {
        return pieDiaAgresion;
    }

    public void setPieDiaAgresion(PieChartModel pieDiaAgresion) {
        this.pieDiaAgresion = pieDiaAgresion;
    }

    public ArrayList<Fiscalia_2012> getLstEnero() {
        return lstEnero;
    }

    public void setLstEnero(ArrayList<Fiscalia_2012> lstEnero) {
        this.lstEnero = lstEnero;
    }

    public ArrayList<Fiscalia_2012> getLstFebrero() {
        return lstFebrero;
    }

    public void setLstFebrero(ArrayList<Fiscalia_2012> lstFebrero) {
        this.lstFebrero = lstFebrero;
    }

    public ArrayList<Fiscalia_2012> getLstMarzo() {
        return lstMarzo;
    }

    public void setLstMarzo(ArrayList<Fiscalia_2012> lstMarzo) {
        this.lstMarzo = lstMarzo;
    }

    public ArrayList<Fiscalia_2012> getLstAbril() {
        return lstAbril;
    }

    public void setLstAbril(ArrayList<Fiscalia_2012> lstAbril) {
        this.lstAbril = lstAbril;
    }

    public ArrayList<Fiscalia_2012> getLstMayo() {
        return lstMayo;
    }

    public void setLstMayo(ArrayList<Fiscalia_2012> lstMayo) {
        this.lstMayo = lstMayo;
    }

    public ArrayList<Fiscalia_2012> getLstJunio() {
        return lstJunio;
    }

    public void setLstJunio(ArrayList<Fiscalia_2012> lstJunio) {
        this.lstJunio = lstJunio;
    }

    public ArrayList<Fiscalia_2012> getLstJulio() {
        return lstJulio;
    }

    public void setLstJulio(ArrayList<Fiscalia_2012> lstJulio) {
        this.lstJulio = lstJulio;
    }

    public ArrayList<Fiscalia_2012> getLstAgosto() {
        return lstAgosto;
    }

    public void setLstAgosto(ArrayList<Fiscalia_2012> lstAgosto) {
        this.lstAgosto = lstAgosto;
    }

    public ArrayList<Fiscalia_2012> getLstSeptiembre() {
        return lstSeptiembre;
    }

    public void setLstSeptiembre(ArrayList<Fiscalia_2012> lstSeptiembre) {
        this.lstSeptiembre = lstSeptiembre;
    }

    public ArrayList<Fiscalia_2012> getLstOctubre() {
        return lstOctubre;
    }

    public void setLstOctubre(ArrayList<Fiscalia_2012> lstOctubre) {
        this.lstOctubre = lstOctubre;
    }

    public ArrayList<Fiscalia_2012> getLstNoviembre() {
        return lstNoviembre;
    }

    public void setLstNoviembre(ArrayList<Fiscalia_2012> lstNoviembre) {
        this.lstNoviembre = lstNoviembre;
    }

    public ArrayList<Fiscalia_2012> getLstDiciembre() {
        return lstDiciembre;
    }

    public void setLstDiciembre(ArrayList<Fiscalia_2012> lstDiciembre) {
        this.lstDiciembre = lstDiciembre;
    }

    public CartesianChartModel getLineMeses() {
        return lineMeses;
    }

    public void setLineMeses(CartesianChartModel lineMeses) {
        this.lineMeses = lineMeses;
    }

    public ControladorFiscalia2012_EstadisticasGenerales() {
        reinit();
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
    
    private void reinit() {
        this.lstDatos = new ArrayList<Fiscalia_2012>();
        this.lstDatos1 = new ArrayList<Fiscalia_2012>();
        this.lstDatosDadoViolencia = new ArrayList<Fiscalia_2012>();
        this.lstDatosDadoCircuito = new ArrayList<Fiscalia_2012>();
        this.objFiscalia_2012 = new Fiscalia_2012();
        this.datoSel = new Fiscalia_2012();

        this.cargarDatos();
        this.init();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FFiscalia_2012.ObtenerDatos();
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoViolencia = FFiscalia_2012.ObtenerDatosDadoTipoAgresion(lstDatos11.getTipo_agresion());
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Tipos de Violencia");
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoCircuito = FFiscalia_2012.ObtenerDatosDadoCircuito(lstDatos11.getCircuito());
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Subcircuito = new ChartSeries();
            Subcircuito.setLabel("Tipos de Violencia");
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoSubCircuito = FFiscalia_2012.ObtenerDatosDadoSubCircuito(lstDatos11.getSubcircuito());
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoestadoCivil = FFiscalia_2012.ObtenerDatosDadoEstadoCivil(lstDatos11.getEstado_civil_victima());
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
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoestadoCivil = FFiscalia_2012.ObtenerDatosDadoEstadoCivil(lstDatos11.getEstado_civil_victima());
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
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoViolencia = FFiscalia_2012.ObtenerDatosDadoTipoAgresion(lstDatos11.getTipo_agresion());
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            for (Fiscalia_2012 lstDatos11 : lstDatos1) {
                lstDatosDadoParentesco = FFiscalia_2012.ObtenerDatosDadoParentescoAgresor(lstDatos11.getParentesco_agresor_victima());
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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");
            lstDatosLunes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("DOMINGO");

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

            lstDatosLunes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("LUNES");
            lstDatosMartes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("MARTES");
            lstDatosMiercoles = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("MIERCOLES");
            lstDatosJueves = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("JUEVES");
            lstDatosViernes = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("VIERNES");
            lstDatosSabado = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("SABADO");
            lstDatosDomingo = FFiscalia_2012.ObtenerDatosDadoDiaAgresion("DOMINGO");

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
            lstDatos1 = FFiscalia_2012.ObtenerDatos();
            ChartSeries Ec = new ChartSeries();
            Ec.setLabel("Tipos de Violencia");

            lstEnero = FFiscalia_2012.ObtenerDatosDadoMesAgresion("ENERO");
            lstFebrero = FFiscalia_2012.ObtenerDatosDadoMesAgresion("FEBRERO");
            lstMarzo = FFiscalia_2012.ObtenerDatosDadoMesAgresion("MARZO");
            lstAbril = FFiscalia_2012.ObtenerDatosDadoMesAgresion("ABRIL");
            lstMayo = FFiscalia_2012.ObtenerDatosDadoMesAgresion("MAYO");
            lstJunio = FFiscalia_2012.ObtenerDatosDadoMesAgresion("JUNIO");
            lstJulio = FFiscalia_2012.ObtenerDatosDadoMesAgresion("JULIO");
            lstAgosto = FFiscalia_2012.ObtenerDatosDadoMesAgresion("AGOSTO");
            lstSeptiembre = FFiscalia_2012.ObtenerDatosDadoMesAgresion("SEPTIEMBRE");
            lstOctubre = FFiscalia_2012.ObtenerDatosDadoMesAgresion("OCTUBRE");
            lstNoviembre = FFiscalia_2012.ObtenerDatosDadoMesAgresion("NOVIEMBRE");
            lstDiciembre = FFiscalia_2012.ObtenerDatosDadoMesAgresion("DICIEMBRE");

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
