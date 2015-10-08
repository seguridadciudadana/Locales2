/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.logica.clases;

import java.sql.Date;

/**
 *
 * @author oscunach
 */
public class Global {

    private int codigo;
    private int numero_ficha;
    private String provincia;
    private String canton;
    private String barrio;
    private String institucion;
    private Date fecha_atencion;
    private String apellidos_victima;
    private String nombres_victima;
    private int edad_victima;
    private String sexo_victima;
    private String instruccion_victima;
    private String estado_civil_victima;
    private String ocupacion_victima;
    private String telefono_victima;
    private String canton_domicilio_victima;
    private String parroquia_domicilio_victima;
    private String direccion_domicilio_victima;
    private Double x;
    private Double y;
    private String circuito;
    private String subcircuito;
    private String direccion_trabajo_victima;
    private String telefono_trabajo_victima;
    private String tipo_agresion;
    private String frecuencia_agresion;
    private String lugar_agresion;
    private String fecha_agresion;
    private String hora_agresion;
    private String asociacion_agresion;
    private String objeto_agresion;
    private String estado_conciencia_agresion;
    private String apellidos_agresor;
    private String nombres_agresor;
    private int edad_agresor;
    private String sexo_agresor;
    private String estado_civil_agresor;
    private String instruccion_agresor;
    private String direccion_domicilio_agresor;
    private String ocupacion_agresor;
    private String direccion_trabajo_agresor;
    private String telefono_agresor;
    private String parentesco_victima_agresor;
    private String tratamiento;
    private String caso_medico;
    private String referido;

    public Global() {
    }

    public Global(int codigo, int numero_ficha, String provincia, String canton, String barrio, String institucion, Date fecha_atencion, String apellidos_victima, String nombres_victima, int edad_victima, String sexo_victima, String instruccion_victima, String estado_civil_victima, String ocupacion_victima, String telefono_victima, String canton_domicilio_victima, String parroquia_domicilio_victima, String direccion_domicilio_victima, Double x, Double y, String circuito, String subcircuito, String direccion_trabajo_victima, String telefono_trabajo_victima, String tipo_agresion, String frecuencia_agresion, String lugar_agresion, String fecha_agresion, String hora_agresion, String asociacion_agresion, String objeto_agresion, String estado_conciencia_agresion, String apellidos_agresor, String nombres_agresor, int edad_agresor, String sexo_agresor, String estado_civil_agresor, String instruccion_agresor, String direccion_domicilio_agresor, String ocupacion_agresor, String direccion_trabajo_agresor, String telefono_agresor, String parentesco_victima_agresor, String tratamiento, String caso_medico, String referido) {
        this.codigo = codigo;
        this.numero_ficha = numero_ficha;
        this.provincia = provincia;
        this.canton = canton;
        this.barrio = barrio;
        this.institucion = institucion;
        this.fecha_atencion = fecha_atencion;
        this.apellidos_victima = apellidos_victima;
        this.nombres_victima = nombres_victima;
        this.edad_victima = edad_victima;
        this.sexo_victima = sexo_victima;
        this.instruccion_victima = instruccion_victima;
        this.estado_civil_victima = estado_civil_victima;
        this.ocupacion_victima = ocupacion_victima;
        this.telefono_victima = telefono_victima;
        this.canton_domicilio_victima = canton_domicilio_victima;
        this.parroquia_domicilio_victima = parroquia_domicilio_victima;
        this.direccion_domicilio_victima = direccion_domicilio_victima;
        this.x = x;
        this.y = y;
        this.circuito = circuito;
        this.subcircuito = subcircuito;
        this.direccion_trabajo_victima = direccion_trabajo_victima;
        this.telefono_trabajo_victima = telefono_trabajo_victima;
        this.tipo_agresion = tipo_agresion;
        this.frecuencia_agresion = frecuencia_agresion;
        this.lugar_agresion = lugar_agresion;
        this.fecha_agresion = fecha_agresion;
        this.hora_agresion = hora_agresion;
        this.asociacion_agresion = asociacion_agresion;
        this.objeto_agresion = objeto_agresion;
        this.estado_conciencia_agresion = estado_conciencia_agresion;
        this.apellidos_agresor = apellidos_agresor;
        this.nombres_agresor = nombres_agresor;
        this.edad_agresor = edad_agresor;
        this.sexo_agresor = sexo_agresor;
        this.estado_civil_agresor = estado_civil_agresor;
        this.instruccion_agresor = instruccion_agresor;
        this.direccion_domicilio_agresor = direccion_domicilio_agresor;
        this.ocupacion_agresor = ocupacion_agresor;
        this.direccion_trabajo_agresor = direccion_trabajo_agresor;
        this.telefono_agresor = telefono_agresor;
        this.parentesco_victima_agresor = parentesco_victima_agresor;
        this.tratamiento = tratamiento;
        this.caso_medico = caso_medico;
        this.referido = referido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero_ficha() {
        return numero_ficha;
    }

    public void setNumero_ficha(int numero_ficha) {
        this.numero_ficha = numero_ficha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFecha_atencion() {
        return fecha_atencion;
    }

    public void setFecha_atencion(Date fecha_atencion) {
        this.fecha_atencion = fecha_atencion;
    }

    public String getApellidos_victima() {
        return apellidos_victima;
    }

    public void setApellidos_victima(String apellidos_victima) {
        this.apellidos_victima = apellidos_victima;
    }

    public String getNombres_victima() {
        return nombres_victima;
    }

    public void setNombres_victima(String nombres_victima) {
        this.nombres_victima = nombres_victima;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    public String getSexo_victima() {
        return sexo_victima;
    }

    public void setSexo_victima(String sexo_victima) {
        this.sexo_victima = sexo_victima;
    }

    public String getInstruccion_victima() {
        return instruccion_victima;
    }

    public void setInstruccion_victima(String instruccion_victima) {
        this.instruccion_victima = instruccion_victima;
    }

    public String getEstado_civil_victima() {
        return estado_civil_victima;
    }

    public void setEstado_civil_victima(String estado_civil_victima) {
        this.estado_civil_victima = estado_civil_victima;
    }

    public String getOcupacion_victima() {
        return ocupacion_victima;
    }

    public void setOcupacion_victima(String ocupacion_victima) {
        this.ocupacion_victima = ocupacion_victima;
    }

    public String getTelefono_victima() {
        return telefono_victima;
    }

    public void setTelefono_victima(String telefono_victima) {
        this.telefono_victima = telefono_victima;
    }

    public String getCanton_domicilio_victima() {
        return canton_domicilio_victima;
    }

    public void setCanton_domicilio_victima(String canton_domicilio_victima) {
        this.canton_domicilio_victima = canton_domicilio_victima;
    }

    public String getParroquia_domicilio_victima() {
        return parroquia_domicilio_victima;
    }

    public void setParroquia_domicilio_victima(String parroquia_domicilio_victima) {
        this.parroquia_domicilio_victima = parroquia_domicilio_victima;
    }

    public String getDireccion_domicilio_victima() {
        return direccion_domicilio_victima;
    }

    public void setDireccion_domicilio_victima(String direccion_domicilio_victima) {
        this.direccion_domicilio_victima = direccion_domicilio_victima;
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

    public String getSubcircuito() {
        return subcircuito;
    }

    public void setSubcircuito(String subcircuito) {
        this.subcircuito = subcircuito;
    }

    public String getDireccion_trabajo_victima() {
        return direccion_trabajo_victima;
    }

    public void setDireccion_trabajo_victima(String direccion_trabajo_victima) {
        this.direccion_trabajo_victima = direccion_trabajo_victima;
    }

    public String getTelefono_trabajo_victima() {
        return telefono_trabajo_victima;
    }

    public void setTelefono_trabajo_victima(String telefono_trabajo_victima) {
        this.telefono_trabajo_victima = telefono_trabajo_victima;
    }

    public String getTipo_agresion() {
        return tipo_agresion;
    }

    public void setTipo_agresion(String tipo_agresion) {
        this.tipo_agresion = tipo_agresion;
    }

    public String getFrecuencia_agresion() {
        return frecuencia_agresion;
    }

    public void setFrecuencia_agresion(String frecuencia_agresion) {
        this.frecuencia_agresion = frecuencia_agresion;
    }

    public String getLugar_agresion() {
        return lugar_agresion;
    }

    public void setLugar_agresion(String lugar_agresion) {
        this.lugar_agresion = lugar_agresion;
    }

    public String getFecha_agresion() {
        return fecha_agresion;
    }

    public void setFecha_agresion(String fecha_agresion) {
        this.fecha_agresion = fecha_agresion;
    }

    public String getHora_agresion() {
        return hora_agresion;
    }

    public void setHora_agresion(String hora_agresion) {
        this.hora_agresion = hora_agresion;
    }

    public String getAsociacion_agresion() {
        return asociacion_agresion;
    }

    public void setAsociacion_agresion(String asociacion_agresion) {
        this.asociacion_agresion = asociacion_agresion;
    }

    public String getObjeto_agresion() {
        return objeto_agresion;
    }

    public void setObjeto_agresion(String objeto_agresion) {
        this.objeto_agresion = objeto_agresion;
    }

    public String getEstado_conciencia_agresion() {
        return estado_conciencia_agresion;
    }

    public void setEstado_conciencia_agresion(String estado_conciencia_agresion) {
        this.estado_conciencia_agresion = estado_conciencia_agresion;
    }

    public String getApellidos_agresor() {
        return apellidos_agresor;
    }

    public void setApellidos_agresor(String apellidos_agresor) {
        this.apellidos_agresor = apellidos_agresor;
    }

    public String getNombres_agresor() {
        return nombres_agresor;
    }

    public void setNombres_agresor(String nombres_agresor) {
        this.nombres_agresor = nombres_agresor;
    }

    public int getEdad_agresor() {
        return edad_agresor;
    }

    public void setEdad_agresor(int edad_agresor) {
        this.edad_agresor = edad_agresor;
    }

    public String getSexo_agresor() {
        return sexo_agresor;
    }

    public void setSexo_agresor(String sexo_agresor) {
        this.sexo_agresor = sexo_agresor;
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

    public String getDireccion_domicilio_agresor() {
        return direccion_domicilio_agresor;
    }

    public void setDireccion_domicilio_agresor(String direccion_domicilio_agresor) {
        this.direccion_domicilio_agresor = direccion_domicilio_agresor;
    }

    public String getOcupacion_agresor() {
        return ocupacion_agresor;
    }

    public void setOcupacion_agresor(String ocupacion_agresor) {
        this.ocupacion_agresor = ocupacion_agresor;
    }

    public String getDireccion_trabajo_agresor() {
        return direccion_trabajo_agresor;
    }

    public void setDireccion_trabajo_agresor(String direccion_trabajo_agresor) {
        this.direccion_trabajo_agresor = direccion_trabajo_agresor;
    }

    public String getTelefono_agresor() {
        return telefono_agresor;
    }

    public void setTelefono_agresor(String telefono_agresor) {
        this.telefono_agresor = telefono_agresor;
    }

    public String getParentesco_victima_agresor() {
        return parentesco_victima_agresor;
    }

    public void setParentesco_victima_agresor(String parentesco_victima_agresor) {
        this.parentesco_victima_agresor = parentesco_victima_agresor;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getCaso_medico() {
        return caso_medico;
    }

    public void setCaso_medico(String caso_medico) {
        this.caso_medico = caso_medico;
    }

    public String getReferido() {
        return referido;
    }

    public void setReferido(String referido) {
        this.referido = referido;
    }
    
    

}
