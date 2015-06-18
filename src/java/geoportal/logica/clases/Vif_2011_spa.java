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
public class Vif_2011_spa {

    private int n_caso;
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
    private int anios_cursados;
    private String estado_civil_victima;
    private String ocupacion_victima;
    private int telefono_victima;
    private String domiciliado_canton;
    private String domiciliado_parroquias;
    private String domiciliado_calles;
    private Double x;
    private Double y;
    private String circuito;
    private String codigo_circuito;
    private String subcircuito;
    private String codigo_subcircuito;
    private String direccion_trabajo_victima;
    private String telefono_trabajo_victima;
    private String tipos_agresion;
    private String frecuencia_agresion;
    private String lugar_agresion;
    private Date fecha_agresion;
    private String hora_agresion;
    private String asociacion_agresion;
    private String objeto_agresion;
    private String estado_conciencia_agresor;
    private String apellidos_agresor;
    private String nombres_agresor;
    private int edad_agresor;
    private String sexo_agresor;
    private String estado_civil_agresor;
    private String instruccion_agresor;
    private int anios_cursados_agresor;
    private String domicilio_agresor;
    private String ocupacion_agresor;
    private String direccion_trabajo_agresor;
    private int telefono_agresor;
    private String relacion_con_victima;
    private String tratamiento_recibido;
    private String caso_medico;
    private String referido;
    private int id;

    public Vif_2011_spa() {
    }

    public Vif_2011_spa(int n_caso, String provincia, String canton, String barrio, String institucion, Date fecha_atencion, String apellidos_victima, String nombres_victima, int edad_victima, String sexo_victima, String instruccion_victima, int anios_cursados, String estado_civil_victima, String ocupacion_victima, int telefono_victima, String domiciliado_canton, String domiciliado_parroquias, String domiciliado_calles, Double x, Double y, String circuito, String codigo_circuito, String subcircuito, String codigo_subcircuito, String direccion_trabajo_victima, String telefono_trabajo_victima, String tipos_agresion, String frecuencia_agresion, String lugar_agresion, Date fecha_agresion, String hora_agresion, String asociacion_agresion, String objeto_agresion, String estado_conciencia_agresor, String apellidos_agresor, String nombres_agresor, int edad_agresor, String sexo_agresor, String estado_civil_agresor, String instruccion_agresor, int anios_cursados_agresor, String domicilio_agresor, String ocupacion_agresor, String direccion_trabajo_agresor, int telefono_agresor, String relacion_con_victima, String tratamiento_recibido, String caso_medico, String referido, int id) {
        this.n_caso = n_caso;
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
        this.anios_cursados = anios_cursados;
        this.estado_civil_victima = estado_civil_victima;
        this.ocupacion_victima = ocupacion_victima;
        this.telefono_victima = telefono_victima;
        this.domiciliado_canton = domiciliado_canton;
        this.domiciliado_parroquias = domiciliado_parroquias;
        this.domiciliado_calles = domiciliado_calles;
        this.x = x;
        this.y = y;
        this.circuito = circuito;
        this.codigo_circuito = codigo_circuito;
        this.subcircuito = subcircuito;
        this.codigo_subcircuito = codigo_subcircuito;
        this.direccion_trabajo_victima = direccion_trabajo_victima;
        this.telefono_trabajo_victima = telefono_trabajo_victima;
        this.tipos_agresion = tipos_agresion;
        this.frecuencia_agresion = frecuencia_agresion;
        this.lugar_agresion = lugar_agresion;
        this.fecha_agresion = fecha_agresion;
        this.hora_agresion = hora_agresion;
        this.asociacion_agresion = asociacion_agresion;
        this.objeto_agresion = objeto_agresion;
        this.estado_conciencia_agresor = estado_conciencia_agresor;
        this.apellidos_agresor = apellidos_agresor;
        this.nombres_agresor = nombres_agresor;
        this.edad_agresor = edad_agresor;
        this.sexo_agresor = sexo_agresor;
        this.estado_civil_agresor = estado_civil_agresor;
        this.instruccion_agresor = instruccion_agresor;
        this.anios_cursados_agresor = anios_cursados_agresor;
        this.domicilio_agresor = domicilio_agresor;
        this.ocupacion_agresor = ocupacion_agresor;
        this.direccion_trabajo_agresor = direccion_trabajo_agresor;
        this.telefono_agresor = telefono_agresor;
        this.relacion_con_victima = relacion_con_victima;
        this.tratamiento_recibido = tratamiento_recibido;
        this.caso_medico = caso_medico;
        this.referido = referido;
        this.id = id;
    }

    public int getN_caso() {
        return n_caso;
    }

    public void setN_caso(int n_caso) {
        this.n_caso = n_caso;
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

    public int getAnios_cursados() {
        return anios_cursados;
    }

    public void setAnios_cursados(int anios_cursados) {
        this.anios_cursados = anios_cursados;
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

    public int getTelefono_victima() {
        return telefono_victima;
    }

    public void setTelefono_victima(int telefono_victima) {
        this.telefono_victima = telefono_victima;
    }

    public String getDomiciliado_canton() {
        return domiciliado_canton;
    }

    public void setDomiciliado_canton(String domiciliado_canton) {
        this.domiciliado_canton = domiciliado_canton;
    }

    public String getDomiciliado_parroquias() {
        return domiciliado_parroquias;
    }

    public void setDomiciliado_parroquias(String domiciliado_parroquias) {
        this.domiciliado_parroquias = domiciliado_parroquias;
    }

    public String getDomiciliado_calles() {
        return domiciliado_calles;
    }

    public void setDomiciliado_calles(String domiciliado_calles) {
        this.domiciliado_calles = domiciliado_calles;
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

    public String getTipos_agresion() {
        return tipos_agresion;
    }

    public void setTipos_agresion(String tipos_agresion) {
        this.tipos_agresion = tipos_agresion;
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

    public Date getFecha_agresion() {
        return fecha_agresion;
    }

    public void setFecha_agresion(Date fecha_agresion) {
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

    public String getEstado_conciencia_agresor() {
        return estado_conciencia_agresor;
    }

    public void setEstado_conciencia_agresor(String estado_conciencia_agresor) {
        this.estado_conciencia_agresor = estado_conciencia_agresor;
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

    public int getAnios_cursados_agresor() {
        return anios_cursados_agresor;
    }

    public void setAnios_cursados_agresor(int anios_cursados_agresor) {
        this.anios_cursados_agresor = anios_cursados_agresor;
    }

    public String getDomicilio_agresor() {
        return domicilio_agresor;
    }

    public void setDomicilio_agresor(String domicilio_agresor) {
        this.domicilio_agresor = domicilio_agresor;
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

    public int getTelefono_agresor() {
        return telefono_agresor;
    }

    public void setTelefono_agresor(int telefono_agresor) {
        this.telefono_agresor = telefono_agresor;
    }

    public String getRelacion_con_victima() {
        return relacion_con_victima;
    }

    public void setRelacion_con_victima(String relacion_con_victima) {
        this.relacion_con_victima = relacion_con_victima;
    }

    public String getTratamiento_recibido() {
        return tratamiento_recibido;
    }

    public void setTratamiento_recibido(String tratamiento_recibido) {
        this.tratamiento_recibido = tratamiento_recibido;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
}
