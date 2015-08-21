/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

import java.util.Date;

/**
 *
 * @author servidor
 */
public class DenunciasPj {

    private int id;
    private String canton;
    private String codigo_subcircuito;
    private String distrito;
    private String circuito;
    private String subcircuito;
    private String direccion_agresion;
    private String sector;
    private String zona;
    private Date fecha_de_registro;
    private String hora_de_registro;
    private Date fecha_de_infraccion;
    private String mes_infraccion;
    private String dia_infraccion;
    private String hora_de_infraccion;
    private String rango_hora;
    private String caso;
    private String numero_de_caso;
    private int caso_reincidente;
    private String origen_de_informacion;
    private String tipo_de_violencia;
    private String causa_de_violencia;
    private String descripcion_de_hechos;
    private Integer ci_victima;
    private String apellidos_victima;
    private String sexo_victima;
    private int edad_victima;
    private String rango_edad_victima;
    private String estado_civil_victima;
    private String nacionalid_victima;
    private String profesion_victima;
    private String instruccion_victima;
    private String numero_telefono_victima;
    private String novedad_con_denunciante;
    private String apellidos_agresor;
    private String ci_agresor;
    private String sexo_agresor;
    private int edad_agresor;
    private String rango_edad_agresor;
    private String estado_civil_agresor;
    private String nacionalidad_agresor;
    private String profesion_agresor;
    private String instruccion_agresor;
    private String telefono_agresor;
    private String parentezco_con_victima;
    private String novedad_con_agresor;
    private String tipo_de_operativo;
    private String actividad_operativa;
    private double x;
    private double y;

    public DenunciasPj() {
    }

    public DenunciasPj(int id, String canton, String codigo_subcircuito, String distrito, String circuito, String subcircuito, String direccion_agresion, String sector, String zona, Date fecha_de_registro, String hora_de_registro, Date fecha_de_infraccion, String mes_infraccion, String dia_infraccion, String hora_de_infraccion, String rango_hora, String caso, String numero_de_caso, int caso_reincidente, String origen_de_informacion, String tipo_de_violencia, String causa_de_violencia, String descripcion_de_hechos, Integer ci_victima, String apellidos_victima, String sexo_victima, int edad_victima, String rango_edad_victima, String estado_civil_victima, String nacionalid_victima, String profesion_victima, String instruccion_victima, String numero_telefono_victima, String novedad_con_denunciante, String apellidos_agresor, String ci_agresor, String sexo_agresor, int edad_agresor, String rango_edad_agresor, String estado_civil_agresor, String nacionalidad_agresor, String profesion_agresor, String instruccion_agresor, String telefono_agresor, String parentezco_con_victima, String novedad_con_agresor, String tipo_de_operativo, String actividad_operativa, double x, double y) {
        this.id = id;
        this.canton = canton;
        this.codigo_subcircuito = codigo_subcircuito;
        this.distrito = distrito;
        this.circuito = circuito;
        this.subcircuito = subcircuito;
        this.direccion_agresion = direccion_agresion;
        this.sector = sector;
        this.zona = zona;
        this.fecha_de_registro = fecha_de_registro;
        this.hora_de_registro = hora_de_registro;
        this.fecha_de_infraccion = fecha_de_infraccion;
        this.mes_infraccion = mes_infraccion;
        this.dia_infraccion = dia_infraccion;
        this.hora_de_infraccion = hora_de_infraccion;
        this.rango_hora = rango_hora;
        this.caso = caso;
        this.numero_de_caso = numero_de_caso;
        this.caso_reincidente = caso_reincidente;
        this.origen_de_informacion = origen_de_informacion;
        this.tipo_de_violencia = tipo_de_violencia;
        this.causa_de_violencia = causa_de_violencia;
        this.descripcion_de_hechos = descripcion_de_hechos;
        this.ci_victima = ci_victima;
        this.apellidos_victima = apellidos_victima;
        this.sexo_victima = sexo_victima;
        this.edad_victima = edad_victima;
        this.rango_edad_victima = rango_edad_victima;
        this.estado_civil_victima = estado_civil_victima;
        this.nacionalid_victima = nacionalid_victima;
        this.profesion_victima = profesion_victima;
        this.instruccion_victima = instruccion_victima;
        this.numero_telefono_victima = numero_telefono_victima;
        this.novedad_con_denunciante = novedad_con_denunciante;
        this.apellidos_agresor = apellidos_agresor;
        this.ci_agresor = ci_agresor;
        this.sexo_agresor = sexo_agresor;
        this.edad_agresor = edad_agresor;
        this.rango_edad_agresor = rango_edad_agresor;
        this.estado_civil_agresor = estado_civil_agresor;
        this.nacionalidad_agresor = nacionalidad_agresor;
        this.profesion_agresor = profesion_agresor;
        this.instruccion_agresor = instruccion_agresor;
        this.telefono_agresor = telefono_agresor;
        this.parentezco_con_victima = parentezco_con_victima;
        this.novedad_con_agresor = novedad_con_agresor;
        this.tipo_de_operativo = tipo_de_operativo;
        this.actividad_operativa = actividad_operativa;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCodigo_subcircuito() {
        return codigo_subcircuito;
    }

    public void setCodigo_subcircuito(String codigo_subcircuito) {
        this.codigo_subcircuito = codigo_subcircuito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
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

    public String getDireccion_agresion() {
        return direccion_agresion;
    }

    public void setDireccion_agresion(String direccion_agresion) {
        this.direccion_agresion = direccion_agresion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Date getFecha_de_registro() {
        return fecha_de_registro;
    }

    public void setFecha_de_registro(Date fecha_de_registro) {
        this.fecha_de_registro = fecha_de_registro;
    }

    public String getHora_de_registro() {
        return hora_de_registro;
    }

    public void setHora_de_registro(String hora_de_registro) {
        this.hora_de_registro = hora_de_registro;
    }

    public Date getFecha_de_infraccion() {
        return fecha_de_infraccion;
    }

    public void setFecha_de_infraccion(Date fecha_de_infraccion) {
        this.fecha_de_infraccion = fecha_de_infraccion;
    }

    public String getMes_infraccion() {
        return mes_infraccion;
    }

    public void setMes_infraccion(String mes_infraccion) {
        this.mes_infraccion = mes_infraccion;
    }

    public String getDia_infraccion() {
        return dia_infraccion;
    }

    public void setDia_infraccion(String dia_infraccion) {
        this.dia_infraccion = dia_infraccion;
    }

    public String getHora_de_infraccion() {
        return hora_de_infraccion;
    }

    public void setHora_de_infraccion(String hora_de_infraccion) {
        this.hora_de_infraccion = hora_de_infraccion;
    }

    public String getRango_hora() {
        return rango_hora;
    }

    public void setRango_hora(String rango_hora) {
        this.rango_hora = rango_hora;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getNumero_de_caso() {
        return numero_de_caso;
    }

    public void setNumero_de_caso(String numero_de_caso) {
        this.numero_de_caso = numero_de_caso;
    }

    public int getCaso_reincidente() {
        return caso_reincidente;
    }

    public void setCaso_reincidente(int caso_reincidente) {
        this.caso_reincidente = caso_reincidente;
    }

    public String getOrigen_de_informacion() {
        return origen_de_informacion;
    }

    public void setOrigen_de_informacion(String origen_de_informacion) {
        this.origen_de_informacion = origen_de_informacion;
    }

    public String getTipo_de_violencia() {
        return tipo_de_violencia;
    }

    public void setTipo_de_violencia(String tipo_de_violencia) {
        this.tipo_de_violencia = tipo_de_violencia;
    }

    public String getCausa_de_violencia() {
        return causa_de_violencia;
    }

    public void setCausa_de_violencia(String causa_de_violencia) {
        this.causa_de_violencia = causa_de_violencia;
    }

    public String getDescripcion_de_hechos() {
        return descripcion_de_hechos;
    }

    public void setDescripcion_de_hechos(String descripcion_de_hechos) {
        this.descripcion_de_hechos = descripcion_de_hechos;
    }

    public Integer getCi_victima() {
        return ci_victima;
    }

    public void setCi_victima(Integer ci_victima) {
        this.ci_victima = ci_victima;
    }

    public String getApellidos_victima() {
        return apellidos_victima;
    }

    public void setApellidos_victima(String apellidos_victima) {
        this.apellidos_victima = apellidos_victima;
    }

    public String getSexo_victima() {
        return sexo_victima;
    }

    public void setSexo_victima(String sexo_victima) {
        this.sexo_victima = sexo_victima;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    public String getRango_edad_victima() {
        return rango_edad_victima;
    }

    public void setRango_edad_victima(String rango_edad_victima) {
        this.rango_edad_victima = rango_edad_victima;
    }

    public String getEstado_civil_victima() {
        return estado_civil_victima;
    }

    public void setEstado_civil_victima(String estado_civil_victima) {
        this.estado_civil_victima = estado_civil_victima;
    }

    public String getNacionalid_victima() {
        return nacionalid_victima;
    }

    public void setNacionalid_victima(String nacionalid_victima) {
        this.nacionalid_victima = nacionalid_victima;
    }

    public String getProfesion_victima() {
        return profesion_victima;
    }

    public void setProfesion_victima(String profesion_victima) {
        this.profesion_victima = profesion_victima;
    }

    public String getInstruccion_victima() {
        return instruccion_victima;
    }

    public void setInstruccion_victima(String instruccion_victima) {
        this.instruccion_victima = instruccion_victima;
    }

    public String getNumero_telefono_victima() {
        return numero_telefono_victima;
    }

    public void setNumero_telefono_victima(String numero_telefono_victima) {
        this.numero_telefono_victima = numero_telefono_victima;
    }

    public String getNovedad_con_denunciante() {
        return novedad_con_denunciante;
    }

    public void setNovedad_con_denunciante(String novedad_con_denunciante) {
        this.novedad_con_denunciante = novedad_con_denunciante;
    }

    public String getApellidos_agresor() {
        return apellidos_agresor;
    }

    public void setApellidos_agresor(String apellidos_agresor) {
        this.apellidos_agresor = apellidos_agresor;
    }

    public String getCi_agresor() {
        return ci_agresor;
    }

    public void setCi_agresor(String ci_agresor) {
        this.ci_agresor = ci_agresor;
    }

    public String getSexo_agresor() {
        return sexo_agresor;
    }

    public void setSexo_agresor(String sexo_agresor) {
        this.sexo_agresor = sexo_agresor;
    }

    public int getEdad_agresor() {
        return edad_agresor;
    }

    public void setEdad_agresor(int edad_agresor) {
        this.edad_agresor = edad_agresor;
    }

    public String getRango_edad_agresor() {
        return rango_edad_agresor;
    }

    public void setRango_edad_agresor(String rango_edad_agresor) {
        this.rango_edad_agresor = rango_edad_agresor;
    }

    public String getEstado_civil_agresor() {
        return estado_civil_agresor;
    }

    public void setEstado_civil_agresor(String estado_civil_agresor) {
        this.estado_civil_agresor = estado_civil_agresor;
    }

    public String getNacionalidad_agresor() {
        return nacionalidad_agresor;
    }

    public void setNacionalidad_agresor(String nacionalidad_agresor) {
        this.nacionalidad_agresor = nacionalidad_agresor;
    }

    public String getProfesion_agresor() {
        return profesion_agresor;
    }

    public void setProfesion_agresor(String profesion_agresor) {
        this.profesion_agresor = profesion_agresor;
    }

    public String getInstruccion_agresor() {
        return instruccion_agresor;
    }

    public void setInstruccion_agresor(String instruccion_agresor) {
        this.instruccion_agresor = instruccion_agresor;
    }

    public String getTelefono_agresor() {
        return telefono_agresor;
    }

    public void setTelefono_agresor(String telefono_agresor) {
        this.telefono_agresor = telefono_agresor;
    }

    public String getParentezco_con_victima() {
        return parentezco_con_victima;
    }

    public void setParentezco_con_victima(String parentezco_con_victima) {
        this.parentezco_con_victima = parentezco_con_victima;
    }

    public String getNovedad_con_agresor() {
        return novedad_con_agresor;
    }

    public void setNovedad_con_agresor(String novedad_con_agresor) {
        this.novedad_con_agresor = novedad_con_agresor;
    }

    public String getTipo_de_operativo() {
        return tipo_de_operativo;
    }

    public void setTipo_de_operativo(String tipo_de_operativo) {
        this.tipo_de_operativo = tipo_de_operativo;
    }

    public String getActividad_operativa() {
        return actividad_operativa;
    }

    public void setActividad_operativa(String actividad_operativa) {
        this.actividad_operativa = actividad_operativa;
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

   
    
    
}
