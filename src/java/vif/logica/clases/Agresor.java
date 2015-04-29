/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;

/**
 *
 * @author Virt-ICITS-2
 */
public class Agresor {
    private int id_agresor;
    private String cedula_identidad;
    private String pnombres;
    private String papellidos;
    private String sexo;
    private String direccion;
    private String pdomiciliado;
    private int edad;
    private String estado_civil;
    private String nivel_educacion;
    private String ocupacion;

    public Agresor() {
    }

    public Agresor(int id_agresor, String cedula_identidad, String pnombres, String papellidos, String sexo, String direccion, String pdomiciliado, int edad, String estado_civil, String nivel_educacion, String ocupacion) {
        this.id_agresor = id_agresor;
        this.cedula_identidad = cedula_identidad;
        this.pnombres = pnombres;
        this.papellidos = papellidos;
        this.sexo = sexo;
        this.direccion = direccion;
        this.pdomiciliado = pdomiciliado;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.nivel_educacion = nivel_educacion;
        this.ocupacion = ocupacion;
    }

    public int getId_agresor() {
        return id_agresor;
    }

    public void setId_agresor(int id_agresor) {
        this.id_agresor = id_agresor;
    }

    public String getCedula_identidad() {
        return cedula_identidad;
    }

    public void setCedula_identidad(String cedula_identidad) {
        this.cedula_identidad = cedula_identidad;
    }

    public String getPnombres() {
        return pnombres;
    }

    public void setPnombres(String pnombres) {
        this.pnombres = pnombres;
    }

    public String getPapellidos() {
        return papellidos;
    }

    public void setPapellidos(String papellidos) {
        this.papellidos = papellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPdomiciliado() {
        return pdomiciliado;
    }

    public void setPdomiciliado(String pdomiciliado) {
        this.pdomiciliado = pdomiciliado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNivel_educacion() {
        return nivel_educacion;
    }

    public void setNivel_educacion(String nivel_educacion) {
        this.nivel_educacion = nivel_educacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }    
}
