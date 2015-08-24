/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.logica.clases;

import java.sql.Date;

/**
 *
 * @author Geovanny Cudco
 */
public class UnidadesFamilia {

    private int id;
    private Date fecha_de_recepcion;
    private String sexo_agresor;
    private String sexo_victima;
    private String barrio_agresor;
    private String barrio_victima;
    private String edad_agresor;
    private String edad_victima;
    private String instruccion_agresor;
    private String instruccion_victima;
    private String parentesco_victima_agresor;
    private int numero_de_hijos;
    private String lugar_agresion;
    private double x;
    private double y;
    private String subcircuito;
    private String circuito;
    private String tipo_de_violencia;
    private String fecha_agresion;
    private String medidas_de_amparo;
    private String sentencia;
    private String apelacion;
    private String boletas_anteriores;
    private String boletas_de_remision;
    private String observaciones;

    public UnidadesFamilia() {
    }

    public UnidadesFamilia(int id, Date fecha_de_recepcion, String sexo_agresor, String sexo_victima, String barrio_agresor, String barrio_victima, String edad_agresor, String edad_victima, String instruccion_agresor, String instruccion_victima, String parentesco_victima_agresor, int numero_de_hijos, String lugar_agresion, double x, double y, String subcircuito, String circuito, String tipo_de_violencia, String fecha_agresion, String medidas_de_amparo, String sentencia, String apelacion, String boletas_anteriores, String boletas_de_remision, String observaciones) {
        this.id = id;
        this.fecha_de_recepcion = fecha_de_recepcion;
        this.sexo_agresor = sexo_agresor;
        this.sexo_victima = sexo_victima;
        this.barrio_agresor = barrio_agresor;
        this.barrio_victima = barrio_victima;
        this.edad_agresor = edad_agresor;
        this.edad_victima = edad_victima;
        this.instruccion_agresor = instruccion_agresor;
        this.instruccion_victima = instruccion_victima;
        this.parentesco_victima_agresor = parentesco_victima_agresor;
        this.numero_de_hijos = numero_de_hijos;
        this.lugar_agresion = lugar_agresion;
        this.x = x;
        this.y = y;
        this.subcircuito = subcircuito;
        this.circuito = circuito;
        this.tipo_de_violencia = tipo_de_violencia;
        this.fecha_agresion = fecha_agresion;
        this.medidas_de_amparo = medidas_de_amparo;
        this.sentencia = sentencia;
        this.apelacion = apelacion;
        this.boletas_anteriores = boletas_anteriores;
        this.boletas_de_remision = boletas_de_remision;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_de_recepcion() {
        return fecha_de_recepcion;
    }

    public void setFecha_de_recepcion(Date fecha_de_recepcion) {
        this.fecha_de_recepcion = fecha_de_recepcion;
    }

    public String getSexo_agresor() {
        return sexo_agresor;
    }

    public void setSexo_agresor(String sexo_agresor) {
        this.sexo_agresor = sexo_agresor;
    }

    public String getSexo_victima() {
        return sexo_victima;
    }

    public void setSexo_victima(String sexo_victima) {
        this.sexo_victima = sexo_victima;
    }

    public String getBarrio_agresor() {
        return barrio_agresor;
    }

    public void setBarrio_agresor(String barrio_agresor) {
        this.barrio_agresor = barrio_agresor;
    }

    public String getBarrio_victima() {
        return barrio_victima;
    }

    public void setBarrio_victima(String barrio_victima) {
        this.barrio_victima = barrio_victima;
    }

    public String getEdad_agresor() {
        return edad_agresor;
    }

    public void setEdad_agresor(String edad_agresor) {
        this.edad_agresor = edad_agresor;
    }

    public String getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(String edad_victima) {
        this.edad_victima = edad_victima;
    }

    public String getInstruccion_agresor() {
        return instruccion_agresor;
    }

    public void setInstruccion_agresor(String instruccion_agresor) {
        this.instruccion_agresor = instruccion_agresor;
    }

    public String getInstruccion_victima() {
        return instruccion_victima;
    }

    public void setInstruccion_victima(String instruccion_victima) {
        this.instruccion_victima = instruccion_victima;
    }

    public String getParentesco_victima_agresor() {
        return parentesco_victima_agresor;
    }

    public void setParentesco_victima_agresor(String parentesco_victima_agresor) {
        this.parentesco_victima_agresor = parentesco_victima_agresor;
    }

    public int getNumero_de_hijos() {
        return numero_de_hijos;
    }

    public void setNumero_de_hijos(int numero_de_hijos) {
        this.numero_de_hijos = numero_de_hijos;
    }

    public String getLugar_agresion() {
        return lugar_agresion;
    }

    public void setLugar_agresion(String lugar_agresion) {
        this.lugar_agresion = lugar_agresion;
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

    public String getSubcircuito() {
        return subcircuito;
    }

    public void setSubcircuito(String subcircuito) {
        this.subcircuito = subcircuito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getTipo_de_violencia() {
        return tipo_de_violencia;
    }

    public void setTipo_de_violencia(String tipo_de_violencia) {
        this.tipo_de_violencia = tipo_de_violencia;
    }

    public String getFecha_agresion() {
        return fecha_agresion;
    }

    public void setFecha_agresion(String fecha_agresion) {
        this.fecha_agresion = fecha_agresion;
    }

    public String getMedidas_de_amparo() {
        return medidas_de_amparo;
    }

    public void setMedidas_de_amparo(String medidas_de_amparo) {
        this.medidas_de_amparo = medidas_de_amparo;
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

    public String getBoletas_anteriores() {
        return boletas_anteriores;
    }

    public void setBoletas_anteriores(String boletas_anteriores) {
        this.boletas_anteriores = boletas_anteriores;
    }

    public String getBoletas_de_remision() {
        return boletas_de_remision;
    }

    public void setBoletas_de_remision(String boletas_de_remision) {
        this.boletas_de_remision = boletas_de_remision;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
