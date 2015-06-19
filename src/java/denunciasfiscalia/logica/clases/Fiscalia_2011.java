/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.logica.clases;

import java.sql.Date;

/**
 *
 * @author Oscunach
 */
public class Fiscalia_2011 {

    private Date fecha_denuncia;
    private String nombres_denunciante;
    private String nombres_victima;
    private String sexo_victima;
    private String direccion_victima;
    private String domiciliado_victima;
    private int edad_victima;
    private String estado_civil_victima;
    private String instruccion_victima;
    private Double x;
    private Double y;
    private String circuito;
    private String codigo_circuito;
    private String subcircuito;
    private String codigo_subcircuito;
    private String ocupacion_victima;
    private String nombres_agresor;
    private String sexo_agresor;
    private String direccion_agresor;
    private String edad_agresor;
    private String domiciliado_agresor;
    private String estado_civil_agresor;
    private String instruccion_agresor;
    private String ocupacio_agresor;
    private String parentesco_agresor_victima;
    private String numero_hijos;
    private String direccion_agresion;
    private String tipo_agresion;
    private Date fecha_agrecion;
    private String hora_agresion;
    private String medidas_amparo;
    private String instruccion_fiscal;
    private String sentencia;
    private String apelacion;
    private String observaciones;
    private int id;

    public Fiscalia_2011() {
    }

    public Fiscalia_2011(Date fecha_denuncia, String nombres_denunciante, String nombres_victima, String sexo_victima, String direccion_victima, String domiciliado_victima, int edad_victima, String estado_civil_victima, String instruccion_victima, Double x, Double y, String circuito, String codigo_circuito, String subcircuito, String codigo_subcircuito, String ocupacion_victima, String nombres_agresor, String sexo_agresor, String direccion_agresor, String edad_agresor, String domiciliado_agresor, String estado_civil_agresor, String instruccion_agresor, String ocupacio_agresor, String parentesco_agresor_victima, String numero_hijos, String direccion_agresion, String tipo_agresion, Date fecha_agrecion, String hora_agresion, String medidas_amparo, String instruccion_fiscal, String sentencia, String apelacion, String observaciones, int id) {
        this.fecha_denuncia = fecha_denuncia;
        this.nombres_denunciante = nombres_denunciante;
        this.nombres_victima = nombres_victima;
        this.sexo_victima = sexo_victima;
        this.direccion_victima = direccion_victima;
        this.domiciliado_victima = domiciliado_victima;
        this.edad_victima = edad_victima;
        this.estado_civil_victima = estado_civil_victima;
        this.instruccion_victima = instruccion_victima;
        this.x = x;
        this.y = y;
        this.circuito = circuito;
        this.codigo_circuito = codigo_circuito;
        this.subcircuito = subcircuito;
        this.codigo_subcircuito = codigo_subcircuito;
        this.ocupacion_victima = ocupacion_victima;
        this.nombres_agresor = nombres_agresor;
        this.sexo_agresor = sexo_agresor;
        this.direccion_agresor = direccion_agresor;
        this.edad_agresor = edad_agresor;
        this.domiciliado_agresor = domiciliado_agresor;
        this.estado_civil_agresor = estado_civil_agresor;
        this.instruccion_agresor = instruccion_agresor;
        this.ocupacio_agresor = ocupacio_agresor;
        this.parentesco_agresor_victima = parentesco_agresor_victima;
        this.numero_hijos = numero_hijos;
        this.direccion_agresion = direccion_agresion;
        this.tipo_agresion = tipo_agresion;
        this.fecha_agrecion = fecha_agrecion;
        this.hora_agresion = hora_agresion;
        this.medidas_amparo = medidas_amparo;
        this.instruccion_fiscal = instruccion_fiscal;
        this.sentencia = sentencia;
        this.apelacion = apelacion;
        this.observaciones = observaciones;
        this.id = id;
    }

    public Date getFecha_denuncia() {
        return fecha_denuncia;
    }

    public void setFecha_denuncia(Date fecha_denuncia) {
        this.fecha_denuncia = fecha_denuncia;
    }

    public String getNombres_denunciante() {
        return nombres_denunciante;
    }

    public void setNombres_denunciante(String nombres_denunciante) {
        this.nombres_denunciante = nombres_denunciante;
    }

    public String getNombres_victima() {
        return nombres_victima;
    }

    public void setNombres_victima(String nombres_victima) {
        this.nombres_victima = nombres_victima;
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

    public String getInstruccion_victima() {
        return instruccion_victima;
    }

    public void setInstruccion_victima(String instruccion_victima) {
        this.instruccion_victima = instruccion_victima;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
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

    public String getOcupacion_victima() {
        return ocupacion_victima;
    }

    public void setOcupacion_victima(String ocupacion_victima) {
        this.ocupacion_victima = ocupacion_victima;
    }

    public String getNombres_agresor() {
        return nombres_agresor;
    }

    public void setNombres_agresor(String nombres_agresor) {
        this.nombres_agresor = nombres_agresor;
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

    public String getInstruccion_agresor() {
        return instruccion_agresor;
    }

    public void setInstruccion_agresor(String instruccion_agresor) {
        this.instruccion_agresor = instruccion_agresor;
    }

    public String getOcupacio_agresor() {
        return ocupacio_agresor;
    }

    public void setOcupacio_agresor(String ocupacio_agresor) {
        this.ocupacio_agresor = ocupacio_agresor;
    }

    public String getParentesco_agresor_victima() {
        return parentesco_agresor_victima;
    }

    public void setParentesco_agresor_victima(String parentesco_agresor_victima) {
        this.parentesco_agresor_victima = parentesco_agresor_victima;
    }

    public String getNumero_hijos() {
        return numero_hijos;
    }

    public void setNumero_hijos(String numero_hijos) {
        this.numero_hijos = numero_hijos;
    }

    public String getDireccion_agresion() {
        return direccion_agresion;
    }

    public void setDireccion_agresion(String direccion_agresion) {
        this.direccion_agresion = direccion_agresion;
    }

    public String getTipo_agresion() {
        return tipo_agresion;
    }

    public void setTipo_agresion(String tipo_agresion) {
        this.tipo_agresion = tipo_agresion;
    }

    public Date getFecha_agrecion() {
        return fecha_agrecion;
    }

    public void setFecha_agrecion(Date fecha_agrecion) {
        this.fecha_agrecion = fecha_agrecion;
    }

    public String getHora_agresion() {
        return hora_agresion;
    }

    public void setHora_agresion(String hora_agresion) {
        this.hora_agresion = hora_agresion;
    }

    public String getMedidas_amparo() {
        return medidas_amparo;
    }

    public void setMedidas_amparo(String medidas_amparo) {
        this.medidas_amparo = medidas_amparo;
    }

    public String getInstruccion_fiscal() {
        return instruccion_fiscal;
    }

    public void setInstruccion_fiscal(String instruccion_fiscal) {
        this.instruccion_fiscal = instruccion_fiscal;
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
