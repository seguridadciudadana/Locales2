/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

import java.sql.Date;

/**
 *
 * @author servidor
 */
public class Vif_2010 {

    private Date fecha__den;
    private String nombres_de, victima, sexo_victi, direccion_, circuito, codigo_cir, subcircuit, codigo_sub, domiciliad, edad_victi, estado_civ, nivel_de_i,
            ocupacion, nombres__a, sexo__agre, direccion, edad__agre, domicilio, estado_c_1, nivel_de_1, ocupacio_1, parentesco, numeros_hi, direccion1, lugar, tipo_de_vi, fecha_agre,
            hora_de_ag, medidas_de, sentencia, apelacion, boletas_an, observacio, boletas_de;
    private int id;
    private Double x, y;

    public Vif_2010() {
    }

    public Vif_2010(Date fecha__den, String nombres_de, String victima, String sexo_victi, String direccion_, Double x, Double y, String circuito, String codigo_cir, String subcircuit, String codigo_sub, String domiciliad, String edad_victi, String estado_civ, String nivel_de_i, String ocupacion, String nombres__a, String sexo__agre, String direccion, String edad__agre, String domicilio, String estado_c_1, String nivel_de_1, String ocupacio_1, String parentesco, String numeros_hi, String direccion1, String lugar, String tipo_de_vi, String fecha_agre, String hora_de_ag, String medidas_de, String sentencia, String apelacion, String boletas_an, String observacio, String boletas_de, int id) {
        this.fecha__den = fecha__den;
        this.nombres_de = nombres_de;
        this.victima = victima;
        this.sexo_victi = sexo_victi;
        this.direccion_ = direccion_;
        this.x = x;
        this.y = y;
        this.circuito = circuito;
        this.codigo_cir = codigo_cir;
        this.subcircuit = subcircuit;
        this.codigo_sub = codigo_sub;
        this.domiciliad = domiciliad;
        this.edad_victi = edad_victi;
        this.estado_civ = estado_civ;
        this.nivel_de_i = nivel_de_i;
        this.ocupacion = ocupacion;
        this.nombres__a = nombres__a;
        this.sexo__agre = sexo__agre;
        this.direccion = direccion;
        this.edad__agre = edad__agre;
        this.domicilio = domicilio;
        this.estado_c_1 = estado_c_1;
        this.nivel_de_1 = nivel_de_1;
        this.ocupacio_1 = ocupacio_1;
        this.parentesco = parentesco;
        this.numeros_hi = numeros_hi;
        this.direccion1 = direccion1;
        this.lugar = lugar;
        this.tipo_de_vi = tipo_de_vi;
        this.fecha_agre = fecha_agre;
        this.hora_de_ag = hora_de_ag;
        this.medidas_de = medidas_de;
        this.sentencia = sentencia;
        this.apelacion = apelacion;
        this.boletas_an = boletas_an;
        this.observacio = observacio;
        this.boletas_de = boletas_de;
        this.id = id;

    }

    public Date getFecha__den() {
        return fecha__den;
    }

    public void setFecha__den(Date fecha__den) {
        this.fecha__den = fecha__den;
    }

    public String getNombres_de() {
        return nombres_de;
    }

    public void setNombres_de(String nombres_de) {
        this.nombres_de = nombres_de;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getSexo_victi() {
        return sexo_victi;
    }

    public void setSexo_victi(String sexo_victi) {
        this.sexo_victi = sexo_victi;
    }

    public String getDireccion_() {
        return direccion_;
    }

    public void setDireccion_(String direccion_) {
        this.direccion_ = direccion_;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getCodigo_cir() {
        return codigo_cir;
    }

    public void setCodigo_cir(String codigo_cir) {
        this.codigo_cir = codigo_cir;
    }

    public String getSubcircuit() {
        return subcircuit;
    }

    public void setSubcircuit(String subcircuit) {
        this.subcircuit = subcircuit;
    }

    public String getCodigo_sub() {
        return codigo_sub;
    }

    public void setCodigo_sub(String codigo_sub) {
        this.codigo_sub = codigo_sub;
    }

    public String getDomiciliad() {
        return domiciliad;
    }

    public void setDomiciliad(String domiciliad) {
        this.domiciliad = domiciliad;
    }

    public String getEdad_victi() {
        return edad_victi;
    }

    public void setEdad_victi(String edad_victi) {
        this.edad_victi = edad_victi;
    }

    public String getEstado_civ() {
        return estado_civ;
    }

    public void setEstado_civ(String estado_civ) {
        this.estado_civ = estado_civ;
    }

    public String getNivel_de_i() {
        return nivel_de_i;
    }

    public void setNivel_de_i(String nivel_de_i) {
        this.nivel_de_i = nivel_de_i;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNombres__a() {
        return nombres__a;
    }

    public void setNombres__a(String nombres__a) {
        this.nombres__a = nombres__a;
    }

    public String getSexo__agre() {
        return sexo__agre;
    }

    public void setSexo__agre(String sexo__agre) {
        this.sexo__agre = sexo__agre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad__agre() {
        return edad__agre;
    }

    public void setEdad__agre(String edad__agre) {
        this.edad__agre = edad__agre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstado_c_1() {
        return estado_c_1;
    }

    public void setEstado_c_1(String estado_c_1) {
        this.estado_c_1 = estado_c_1;
    }

    public String getNivel_de_1() {
        return nivel_de_1;
    }

    public void setNivel_de_1(String nivel_de_1) {
        this.nivel_de_1 = nivel_de_1;
    }

    public String getOcupacio_1() {
        return ocupacio_1;
    }

    public void setOcupacio_1(String ocupacio_1) {
        this.ocupacio_1 = ocupacio_1;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getNumeros_hi() {
        return numeros_hi;
    }

    public void setNumeros_hi(String numeros_hi) {
        this.numeros_hi = numeros_hi;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipo_de_vi() {
        return tipo_de_vi;
    }

    public void setTipo_de_vi(String tipo_de_vi) {
        this.tipo_de_vi = tipo_de_vi;
    }

    public String getFecha_agre() {
        return fecha_agre;
    }

    public void setFecha_agre(String fecha_agre) {
        this.fecha_agre = fecha_agre;
    }

    public String getHora_de_ag() {
        return hora_de_ag;
    }

    public void setHora_de_ag(String hora_de_ag) {
        this.hora_de_ag = hora_de_ag;
    }

    public String getMedidas_de() {
        return medidas_de;
    }

    public void setMedidas_de(String medidas_de) {
        this.medidas_de = medidas_de;
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

    public String getBoletas_an() {
        return boletas_an;
    }

    public void setBoletas_an(String boletas_an) {
        this.boletas_an = boletas_an;
    }

    public String getObservacio() {
        return observacio;
    }

    public void setObservacio(String observacio) {
        this.observacio = observacio;
    }

    public String getBoletas_de() {
        return boletas_de;
    }

    public void setBoletas_de(String boletas_de) {
        this.boletas_de = boletas_de;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
