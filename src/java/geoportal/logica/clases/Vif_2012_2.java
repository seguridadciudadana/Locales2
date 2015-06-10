/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

import java.sql.Date;

/**
 *
 * @author Oscunach
 */
public class Vif_2012_2 {
    private Date fecha_denuncia;
    private String denunciante;
    private String victima;
    private String sexo_victima;
    private String direccion_victima;
    private double x;
    private double y;
    private String circuito;
    private String codigo_circuito;
    private String subcircuito;
    private String codigo_subcircuito;
    private String domiciliado_victima;
    private int edad_victima;
    private String estado_civil_victima;
    private String nivel_de_instruccion_victima;
    private String ocupacion;
    private String agresor;
    private String sexo_agresor;
    private String direccion_agresor;
    private String edad_agresor;
    private String domiciliado_agresor;
    private String estado_civil_agresor;
    private String nivel_de_instruccion_agresor;
    private String ocupacion_agresor;
    private String parentesco_victima_agresor;
    private String numero_hijos_comun;
    private String lugar_agresion;
    private String tipo_de_violencia;
    private String fecha_agresion;
    private String hora_de_agresion;
    private String medidas_de_amparo;
    private String sentencia;
    private String apelacion;
    private String boletas_anteriores;
    private String observaciones;    
    private int id;

    public Vif_2012_2() {
    }

    public Vif_2012_2(Date fecha_denuncia, String denunciante, String victima, String sexo_victima, String direccion_victima, double x, double y, String circuito, String codigo_circuito, String subcircuito, String codigo_subcircuito, String domiciliado_victima, int edad_victima, String estado_civil_victima, String nivel_de_instruccion_victima, String ocupacion, String agresor, String sexo_agresor, String direccion_agresor, String edad_agresor, String domiciliado_agresor, String estado_civil_agresor, String nivel_de_instruccion_agresor, String ocupacion_agresor, String parentesco_victima_agresor, String numero_hijos_comun, String lugar_agresion, String tipo_de_violencia, String fecha_agresion, String hora_de_agresion, String medidas_de_amparo, String sentencia, String apelacion, String boletas_anteriores, String observaciones, int id) {
        this.fecha_denuncia = fecha_denuncia;
        this.denunciante = denunciante;
        this.victima = victima;
        this.sexo_victima = sexo_victima;
        this.direccion_victima = direccion_victima;
        this.x = x;
        this.y = y;
        this.circuito = circuito;
        this.codigo_circuito = codigo_circuito;
        this.subcircuito = subcircuito;
        this.codigo_subcircuito = codigo_subcircuito;
        this.domiciliado_victima = domiciliado_victima;
        this.edad_victima = edad_victima;
        this.estado_civil_victima = estado_civil_victima;
        this.nivel_de_instruccion_victima = nivel_de_instruccion_victima;
        this.ocupacion = ocupacion;
        this.agresor = agresor;
        this.sexo_agresor = sexo_agresor;
        this.direccion_agresor = direccion_agresor;
        this.edad_agresor = edad_agresor;
        this.domiciliado_agresor = domiciliado_agresor;
        this.estado_civil_agresor = estado_civil_agresor;
        this.nivel_de_instruccion_agresor = nivel_de_instruccion_agresor;
        this.ocupacion_agresor = ocupacion_agresor;
        this.parentesco_victima_agresor = parentesco_victima_agresor;
        this.numero_hijos_comun = numero_hijos_comun;
        this.lugar_agresion = lugar_agresion;
        this.tipo_de_violencia = tipo_de_violencia;
        this.fecha_agresion = fecha_agresion;
        this.hora_de_agresion = hora_de_agresion;
        this.medidas_de_amparo = medidas_de_amparo;
        this.sentencia = sentencia;
        this.apelacion = apelacion;
        this.boletas_anteriores = boletas_anteriores;
        this.observaciones = observaciones;
        this.id = id;
    }

    public Date getFecha_denuncia() {
        return fecha_denuncia;
    }

    public void setFecha_denuncia(Date fecha_denuncia) {
        this.fecha_denuncia = fecha_denuncia;
    }

    public String getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(String denunciante) {
        this.denunciante = denunciante;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getSexo_victima() {
        return sexo_victima;
    }

    public void setSexo_victima(String sexo_victima) {
        this.sexo_victima = sexo_victima;
    }

    public String getDireccion_victima() {
        return direccion_victima;
    }

    public void setDireccion_victima(String direccion_victima) {
        this.direccion_victima = direccion_victima;
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

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getCodigo_circuito() {
        return codigo_circuito;
    }

    public void setCodigo_circuito(String codigo_circuito) {
        this.codigo_circuito = codigo_circuito;
    }

    public String getSubcircuito() {
        return subcircuito;
    }

    public void setSubcircuito(String subcircuito) {
        this.subcircuito = subcircuito;
    }

    public String getCodigo_subcircuito() {
        return codigo_subcircuito;
    }

    public void setCodigo_subcircuito(String codigo_subcircuito) {
        this.codigo_subcircuito = codigo_subcircuito;
    }

    public String getDomiciliado_victima() {
        return domiciliado_victima;
    }

    public void setDomiciliado_victima(String domiciliado_victima) {
        this.domiciliado_victima = domiciliado_victima;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    public String getEstado_civil_victima() {
        return estado_civil_victima;
    }

    public void setEstado_civil_victima(String estado_civil_victima) {
        this.estado_civil_victima = estado_civil_victima;
    }

    public String getNivel_de_instruccion_victima() {
        return nivel_de_instruccion_victima;
    }

    public void setNivel_de_instruccion_victima(String nivel_de_instruccion_victima) {
        this.nivel_de_instruccion_victima = nivel_de_instruccion_victima;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAgresor() {
        return agresor;
    }

    public void setAgresor(String agresor) {
        this.agresor = agresor;
    }

    public String getSexo_agresor() {
        return sexo_agresor;
    }

    public void setSexo_agresor(String sexo_agresor) {
        this.sexo_agresor = sexo_agresor;
    }

    public String getDireccion_agresor() {
        return direccion_agresor;
    }

    public void setDireccion_agresor(String direccion_agresor) {
        this.direccion_agresor = direccion_agresor;
    }

    public String getEdad_agresor() {
        return edad_agresor;
    }

    public void setEdad_agresor(String edad_agresor) {
        this.edad_agresor = edad_agresor;
    }

    public String getDomiciliado_agresor() {
        return domiciliado_agresor;
    }

    public void setDomiciliado_agresor(String domiciliado_agresor) {
        this.domiciliado_agresor = domiciliado_agresor;
    }

    public String getEstado_civil_agresor() {
        return estado_civil_agresor;
    }

    public void setEstado_civil_agresor(String estado_civil_agresor) {
        this.estado_civil_agresor = estado_civil_agresor;
    }

    public String getNivel_de_instruccion_agresor() {
        return nivel_de_instruccion_agresor;
    }

    public void setNivel_de_instruccion_agresor(String nivel_de_instruccion_agresor) {
        this.nivel_de_instruccion_agresor = nivel_de_instruccion_agresor;
    }

    public String getOcupacion_agresor() {
        return ocupacion_agresor;
    }

    public void setOcupacion_agresor(String ocupacion_agresor) {
        this.ocupacion_agresor = ocupacion_agresor;
    }

    public String getParentesco_victima_agresor() {
        return parentesco_victima_agresor;
    }

    public void setParentesco_victima_agresor(String parentesco_victima_agresor) {
        this.parentesco_victima_agresor = parentesco_victima_agresor;
    }

    public String getNumero_hijos_comun() {
        return numero_hijos_comun;
    }

    public void setNumero_hijos_comun(String numero_hijos_comun) {
        this.numero_hijos_comun = numero_hijos_comun;
    }

    public String getLugar_agresion() {
        return lugar_agresion;
    }

    public void setLugar_agresion(String lugar_agresion) {
        this.lugar_agresion = lugar_agresion;
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

    public String getHora_de_agresion() {
        return hora_de_agresion;
    }

    public void setHora_de_agresion(String hora_de_agresion) {
        this.hora_de_agresion = hora_de_agresion;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    
    
}
