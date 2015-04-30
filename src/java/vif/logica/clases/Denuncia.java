/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Oscunach
 */
public class Denuncia {

    private int id_denucnia;
    private Date fecha;
    private String denunciante;
    private Victima id_victima;
    private double x;
    private double y;
    private Circuito id_circuito;
    private Subcircuito id_subcircuito;
    private Agresor id_agresor;
    private String relacion_victima_agresor;
    private int numero_hijos;
    private Violencia id_tipo_violencia;
    private Date fecha_agresion;
    private Time hora_agresion;
    private String medidas_amparo;
    private String sentencia;
    private String apelacion;

    public Denuncia() {
    }

    public Denuncia(int id_denucnia, Date fecha, String denunciante, Victima id_victima, double x, double y, Circuito id_circuito, Subcircuito id_subcircuito, Agresor id_agresor, String relacion_victima_agresor, int numero_hijos, Violencia id_tipo_violencia, Date fecha_agresion, Time hora_agresion, String medidas_amparo, String sentencia, String apelacion) {
        this.id_denucnia = id_denucnia;
        this.fecha = fecha;
        this.denunciante = denunciante;
        this.id_victima = id_victima;
        this.x = x;
        this.y = y;
        this.id_circuito = id_circuito;
        this.id_subcircuito = id_subcircuito;
        this.id_agresor = id_agresor;
        this.relacion_victima_agresor = relacion_victima_agresor;
        this.numero_hijos = numero_hijos;
        this.id_tipo_violencia = id_tipo_violencia;
        this.fecha_agresion = fecha_agresion;
        this.hora_agresion = hora_agresion;
        this.medidas_amparo = medidas_amparo;
        this.sentencia = sentencia;
        this.apelacion = apelacion;
    }

    public int getId_denucnia() {
        return id_denucnia;
    }

    public void setId_denucnia(int id_denucnia) {
        this.id_denucnia = id_denucnia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(String denunciante) {
        this.denunciante = denunciante;
    }

    public Victima getId_victima() {
        return id_victima;
    }

    public void setId_victima(Victima id_victima) {
        this.id_victima = id_victima;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Circuito getId_circuito() {
        return id_circuito;
    }

    public void setId_circuito(Circuito id_circuito) {
        this.id_circuito = id_circuito;
    }

    public Subcircuito getId_subcircuito() {
        return id_subcircuito;
    }

    public void setId_subcircuito(Subcircuito id_subcircuito) {
        this.id_subcircuito = id_subcircuito;
    }

    public Agresor getId_agresor() {
        return id_agresor;
    }

    public void setId_agresor(Agresor id_agresor) {
        this.id_agresor = id_agresor;
    }

    public String getRelacion_victima_agresor() {
        return relacion_victima_agresor;
    }

    public void setRelacion_victima_agresor(String relacion_victima_agresor) {
        this.relacion_victima_agresor = relacion_victima_agresor;
    }

    public int getNumero_hijos() {
        return numero_hijos;
    }

    public void setNumero_hijos(int numero_hijos) {
        this.numero_hijos = numero_hijos;
    }

    public Violencia getId_tipo_violencia() {
        return id_tipo_violencia;
    }

    public void setId_tipo_violencia(Violencia id_tipo_violencia) {
        this.id_tipo_violencia = id_tipo_violencia;
    }

    public Date getFecha_agresion() {
        return fecha_agresion;
    }

    public void setFecha_agresion(Date fecha_agresion) {
        this.fecha_agresion = fecha_agresion;
    }

    public Time getHora_agresion() {
        return hora_agresion;
    }

    public void setHora_agresion(Time hora_agresion) {
        this.hora_agresion = hora_agresion;
    }

    public String getMedidas_amparo() {
        return medidas_amparo;
    }

    public void setMedidas_amparo(String medidas_amparo) {
        this.medidas_amparo = medidas_amparo;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getApelacion() {
        return apelacion;
    }

    public void setApelacion(String apelacion) {
        this.apelacion = apelacion;
    }

   
}
