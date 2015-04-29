/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;

/**
 *
 * @author servidor
 */
public class victima {

    private long id_victima;
    private String cedula_identidad;
    private String nombres;
    private String apellidos;
    private String sexo;
    private String direccion;
    private String domiciliado;
    private int edad;
    private String estado_civil;
    private String nivel_educacion;
    private String ocupacion;

    public victima() {
    }

    public victima(long id_victima, String cedula_identidad, String nombres, String apellidos, String sexo, String direccion, String domiciliado, int edad, String estado_civil, String nivel_educacion, String ocupacion) {
        this.id_victima = id_victima;
        this.cedula_identidad = cedula_identidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.direccion = direccion;
        this.domiciliado = domiciliado;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.nivel_educacion = nivel_educacion;
        this.ocupacion = ocupacion;
    }

    public long getId_victima() {
        return id_victima;
    }

    public void setId_victima(long id_victima) {
        this.id_victima = id_victima;
    }

    public String getCedula_identidad() {
        return cedula_identidad;
    }

    public void setCedula_identidad(String cedula_identidad) {
        this.cedula_identidad = cedula_identidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getDomiciliado() {
        return domiciliado;
    }

    public void setDomiciliado(String domiciliado) {
        this.domiciliado = domiciliado;
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
