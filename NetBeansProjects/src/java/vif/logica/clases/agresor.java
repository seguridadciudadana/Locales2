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
public class agresor {
    private int id_agresor;
    private String Cedula_identidad;
    private String Nombres;
    private String Apellidos;
    private String Sexo;
    private String Direccion;
    private String Domiciliado;
    private int Edad;
    private String Estado_civil;
    private String Nivel_educacion;
    private String Ocupacion;

    public agresor() {
    }

    public agresor(int id_agresor, String Cedula_identidad, String Nombres, String Apellidos, String Sexo, String Direccion, String Domiciliado, int Edad, String Estado_civil, String Nivel_educacion, String Ocupacion) {
        this.id_agresor = id_agresor;
        this.Cedula_identidad = Cedula_identidad;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.Domiciliado = Domiciliado;
        this.Edad = Edad;
        this.Estado_civil = Estado_civil;
        this.Nivel_educacion = Nivel_educacion;
        this.Ocupacion = Ocupacion;
    }

    public int getId_agresor() {
        return id_agresor;
    }

    public void setId_agresor(int id_agresor) {
        this.id_agresor = id_agresor;
    }

    public String getCedula_identidad() {
        return Cedula_identidad;
    }

    public void setCedula_identidad(String Cedula_identidad) {
        this.Cedula_identidad = Cedula_identidad;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDomiciliado() {
        return Domiciliado;
    }

    public void setDomiciliado(String Domiciliado) {
        this.Domiciliado = Domiciliado;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

    public String getNivel_educacion() {
        return Nivel_educacion;
    }

    public void setNivel_educacion(String Nivel_educacion) {
        this.Nivel_educacion = Nivel_educacion;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
    
    
    
}
