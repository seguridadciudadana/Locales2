/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.presentacion.beans;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import org.primefaces.context.DefaultRequestContext;
import recursos.Util;
import vif.logica.clases.Agresor;
import vif.logica.clases.Circuito;
import vif.logica.clases.Subcircuito;
import vif.logica.clases.Denuncia;
import vif.logica.clases.Victima;
import vif.logica.clases.Violencia;
import vif.logica.funciones.FAgresor;
import vif.logica.funciones.FCircuito;
import vif.logica.funciones.FDenuncia;
import vif.logica.funciones.FSubcircuito;
import vif.logica.funciones.FVictima;
import vif.logica.funciones.FViolencia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class DenunciaControlador {

    /**
     * Creates a new instance of DenunciaControlador
     */
    java.sql.Date sqlDate;
    java.sql.Date sqlDate1;
    java.sql.Time sqlDate2;
    private Denuncia objDenuncia;
    private Denuncia denunciaSel;
    private ArrayList<Denuncia> lstDenuncia;
    private ArrayList<Agresor> lstAgresor;
    private ArrayList<Circuito> lstCircuito;
    private ArrayList<Subcircuito> lstSubcircuito;
    private ArrayList<Victima> lstVictima;
    private ArrayList<Violencia> lstViolencia;
    private boolean mostrarActualizar;
    private int valorDSeleccionado;
    private int valorASeleccionado;
    private int valorCSeleccionada;
    private int valorSubcSeleccionada;
    private int valorVicSeleccionada;
    private int valorViolSeleccionada;
    private Date fecha;
    private Date hora;
    private Date ahora;
    private String fecha1;

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public java.sql.Date getSqlDate1() {
        return sqlDate1;
    }

    public void setSqlDate1(java.sql.Date sqlDate1) {
        this.sqlDate1 = sqlDate1;
    }

    public Time getSqlDate2() {
        return sqlDate2;
    }

    public void setSqlDate2(Time sqlDate2) {
        this.sqlDate2 = sqlDate2;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public Date getAhora() {
        return ahora;
    }

    public void setAhora(Date ahora) {
        this.ahora = ahora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Denuncia getObjDenuncia() {
        return objDenuncia;
    }

    public void setObjDenuncia(Denuncia objDenuncia) {
        this.objDenuncia = objDenuncia;
    }

    public Denuncia getDenunciaSel() {
        return denunciaSel;
    }

    public void setDenunciaSel(Denuncia denunciaSel) {
        this.denunciaSel = denunciaSel;
    }

    public ArrayList<Denuncia> getLstDenuncia() {
        return lstDenuncia;
    }

    public void setLstDenuncia(ArrayList<Denuncia> lstDenuncia) {
        this.lstDenuncia = lstDenuncia;
    }

    public ArrayList<Agresor> getLstAgresor() {
        return lstAgresor;
    }

    public void setLstAgresor(ArrayList<Agresor> lstAgresor) {
        this.lstAgresor = lstAgresor;
    }

    public ArrayList<Circuito> getLstCircuito() {
        return lstCircuito;
    }

    public void setLstCircuito(ArrayList<Circuito> lstCircuito) {
        this.lstCircuito = lstCircuito;
    }

    public ArrayList<Subcircuito> getLstSubcircuito() {
        return lstSubcircuito;
    }

    public void setLstSubcircuito(ArrayList<Subcircuito> lstSubcircuito) {
        this.lstSubcircuito = lstSubcircuito;
    }

    public ArrayList<Victima> getLstVictima() {
        return lstVictima;
    }

    public void setLstVictima(ArrayList<Victima> lstVictima) {
        this.lstVictima = lstVictima;
    }

    public ArrayList<Violencia> getLstViolencia() {
        return lstViolencia;
    }

    public void setLstViolencia(ArrayList<Violencia> lstViolencia) {
        this.lstViolencia = lstViolencia;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public int getValorDSeleccionado() {
        return valorDSeleccionado;
    }

    public void setValorDSeleccionado(int valorDSeleccionado) {
        this.valorDSeleccionado = valorDSeleccionado;
    }

    public int getValorASeleccionado() {
        return valorASeleccionado;
    }

    public void setValorASeleccionado(int valorASeleccionado) {
        this.valorASeleccionado = valorASeleccionado;
    }

    public int getValorCSeleccionada() {
        return valorCSeleccionada;
    }

    public void setValorCSeleccionada(int valorCSeleccionada) {
        this.valorCSeleccionada = valorCSeleccionada;
    }

    public int getValorSubcSeleccionada() {
        return valorSubcSeleccionada;
    }

    public void setValorSubcSeleccionada(int valorSubcSeleccionada) {
        this.valorSubcSeleccionada = valorSubcSeleccionada;
    }

    public int getValorVicSeleccionada() {
        return valorVicSeleccionada;
    }

    public void setValorVicSeleccionada(int valorVicSeleccionada) {
        this.valorVicSeleccionada = valorVicSeleccionada;
    }

    public int getValorViolSeleccionada() {
        return valorViolSeleccionada;
    }

    public void setValorViolSeleccionada(int valorViolSeleccionada) {
        this.valorViolSeleccionada = valorViolSeleccionada;
    }

    public DenunciaControlador() {
        this.reinit();
    }

    private void reinit() {

        this.lstDenuncia = new ArrayList<Denuncia>();
        this.objDenuncia = new Denuncia();
        this.denunciaSel = new Denuncia();
        this.lstAgresor = new ArrayList<Agresor>();
        this.lstCircuito = new ArrayList<Circuito>();
        this.lstSubcircuito = new ArrayList<Subcircuito>();
        this.lstVictima = new ArrayList<Victima>();
        this.lstViolencia = new ArrayList<Violencia>();

        this.cargarAgresor();
        this.cargarDenuncia();
        this.cargarSubcircuito();
        this.cargarVictima();
        this.cargarViolencia();
        this.cargarCircuito();
         this.sqlDate = new java.sql.Date(ahora.getTime());
        sqlDate1 = new java.sql.Date(fecha.getTime());

    }

    public void cargarDenuncia() {
        try {
            this.lstDenuncia = FDenuncia.obtenerDenuncia();
            this.denunciaSel = lstDenuncia.get(0);
            System.out.println(lstDenuncia.get(0).getId_denucnia());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarDenuncia() dice: " + e.getMessage());
            System.out.println("public void cargarDenuncia() dice: " + e.getMessage());
        }
    }

    public void cargarAgresor() {
        try {
            this.lstAgresor = FAgresor.ObtenerAgresor();
            System.out.println(lstAgresor.get(0).getId_agresor());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarAgresor dice: " + e.getMessage());
            System.out.println("public void cargarAgresor dice: " + e.getMessage());
        }
    }

    public void cargarVictima() {
        try {
            this.lstVictima = FVictima.ObtenerVictimas();
            System.out.println(lstVictima.get(0).getId_victima());
        } catch (Exception e) {
            Util.addErrorMessage(" public void cargarVictima dice:" + e.getMessage());
            System.out.println(" public void cargarVictima dice:" + e.getMessage());
        }
    }

    public void cargarCircuito() {
        try {
            this.lstCircuito = FCircuito.obtenerCircuito();
            System.out.println(lstCircuito.get(0).getId_circuito());
        } catch (Exception e) {
            Util.addErrorMessage(" public void cargarCircuito dice:" + e.getMessage());
            System.out.println(" public void cargarCircuito dice:" + e.getMessage());
        }
    }

    public void cargarSubcircuito() {
        try {
            this.lstSubcircuito = FSubcircuito.obtenerSubcircuito();
            System.out.println(lstSubcircuito.get(0).getId_subcircuito());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarSubcircuito dice:" + e.getMessage());
            System.out.println("public void cargarSubcircuito dice: " + e.getMessage());
        }
    }

    public void cargarViolencia() {
        try {
            this.lstViolencia = FViolencia.obtenerViolencia();
            System.out.println(lstViolencia.get(0).getId_violencia());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarViolencia dice :" + e.getMessage());
            System.out.println("public void cargarViolenciao dice: " + e.getMessage());
        }
    }

    public void insertarDenuncia() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm a");
        //DateFormat df =  DateFormat.getDateInstance();
        fecha1 = formato.format(hora);

        //GregorianCalendar calendario = new GregorianCalendar();
        try {
            java.sql.Time sqlDate2 = new java.sql.Time(formato.parse(fecha1).getTime());
            //calendario.setTime(formato.parse(fecha1));//hora= formato.parse(fecha1);
            objDenuncia.setHora_agresion(sqlDate2);
            objDenuncia.setFecha_agresion(sqlDate1);
            objDenuncia.setFecha(sqlDate);
            objDenuncia.setId_victima(FVictima.ObtenerVictimaDadoId(valorVicSeleccionada));
            objDenuncia.setId_circuito(FCircuito.ObtenerCircuitoDadoId(valorCSeleccionada));
            objDenuncia.setId_subcircuito(FSubcircuito.ObtenerSubcircuitoDadoId(valorSubcSeleccionada));
            objDenuncia.setId_agresor(FAgresor.ObtenerAgresorDadoId(valorASeleccionado));
            objDenuncia.setId_tipo_violencia(FViolencia.ObtenerViolenciaDadoId(valorViolSeleccionada));
            if (FDenuncia.insertarDenuncia(objDenuncia)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevaDenuncia.hide()");
                Util.addSuccessMessage("Información Guardada con éxito");
                System.out.println("public void insertarDenuncia dice: Información Guardada con éxito");

            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void insertarDenuncia dice: Error al guardar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("public void insertarDenuncia dice: " + e.getMessage());
            System.out.println("public void insertarDenuncia dice: " + e.getMessage());
        }
    }

    public void cambiarEstadoMostrarActualizar() {
        mostrarActualizar = true;
    }

}
