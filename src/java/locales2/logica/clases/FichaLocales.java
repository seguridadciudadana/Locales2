package locales2.logica.clases;

import locales.logica.clases.*;

public class FichaLocales {

    private int id_ficha_locales;
    private int parroquia;
    private String barrio;
    private Circuito id_circuito;
    private SubCircuito id_subcircuito;
    private String estado_local;
    private String razon_social;
    private int categoria;
    private String tipo_establecimiento;
    private String direccion_establecimiento;
    private String nombre_propietario;
    private String cedula_propietario;
    private String telefono_propietario;
    private double x_local;
    private double y_local;
    private String permiso_municipio;
    private String permiso_bomberos;
    private String permiso_mds;
    private String permiso_mi;
    private String permiso_lt;
    private String sri;
    private String hora_inicio_diurno;
    private String hora_fin_diurno;
    private String hora_inicio_nocturno;
    private String hora_fin_nocturno;
    private String observaciones_hora;
    private String terrenos_valdios;
    private String espacios_abiertos;
    private String especificaciones_entorno;
    private String visualizacion;
    private String iluminacion;
    private String entrada_salida_emergencia;
    private String escondites;
    private String limpieza;
    private String senializado;
    private String extintores;
    private String observaciones_sistema_emergencia;
    private String sistema_seguridad;
    private String tipo_sistema_seguridad;
    private String observaciones_sistema_seguridad;
    private String institucion_educativa;
    private int distancia_local_centro_educativo;
    private String direccion;
    private double x_centro_educativo;
    private double y_centro_educativo;
    private String nombre_encuestada;
    private String cedula_encuestada;
    private String telefono_encuestada;
    private String sugerencia_encuestada;
    private String observaciones_generales;

    public FichaLocales() {
    }

    public FichaLocales(int id_ficha_locales, int parroquia, String barrio, Circuito id_circuito, SubCircuito id_subcircuito, String estado_local, String razon_social, int categoria, String tipo_establecimiento, String direccion_establecimiento, String nombre_propietario, String cedula_propietario, String telefono_propietario, double x_local, double y_local, String permiso_municipio, String permiso_bomberos, String permiso_mds, String permiso_mi, String permiso_lt, String sri, String hora_inicio_diurno, String hora_fin_diurno, String hora_inicio_nocturno, String hora_fin_nocturno, String observaciones_hora, String terrenos_valdios, String espacios_abiertos, String especificaciones_entorno, String visualizacion, String iluminacion, String entrada_salida_emergencia, String escondites, String limpieza, String senializado, String extintores, String observaciones_sistema_emergencia, String sistema_seguridad, String tipo_sistema_seguridad, String observaciones_sistema_seguridad, String institucion_educativa, int distancia_local_centro_educativo, String direccion, double x_centro_educativo, double y_centro_educativo, String nombre_encuestada, String cedula_encuestada, String telefono_encuestada, String sugerencia_encuestada, String observaciones_generales) {
        this.id_ficha_locales = id_ficha_locales;
        this.parroquia = parroquia;
        this.barrio = barrio;
        this.id_circuito = id_circuito;
        this.id_subcircuito = id_subcircuito;
        this.estado_local = estado_local;
        this.razon_social = razon_social;
        this.categoria = categoria;
        this.tipo_establecimiento = tipo_establecimiento;
        this.direccion_establecimiento = direccion_establecimiento;
        this.nombre_propietario = nombre_propietario;
        this.cedula_propietario = cedula_propietario;
        this.telefono_propietario = telefono_propietario;
        this.x_local = x_local;
        this.y_local = y_local;
        this.permiso_municipio = permiso_municipio;
        this.permiso_bomberos = permiso_bomberos;
        this.permiso_mds = permiso_mds;
        this.permiso_mi = permiso_mi;
        this.permiso_lt = permiso_lt;
        this.sri = sri;
        this.hora_inicio_diurno = hora_inicio_diurno;
        this.hora_fin_diurno = hora_fin_diurno;
        this.hora_inicio_nocturno = hora_inicio_nocturno;
        this.hora_fin_nocturno = hora_fin_nocturno;
        this.observaciones_hora = observaciones_hora;
        this.terrenos_valdios = terrenos_valdios;
        this.espacios_abiertos = espacios_abiertos;
        this.especificaciones_entorno = especificaciones_entorno;
        this.visualizacion = visualizacion;
        this.iluminacion = iluminacion;
        this.entrada_salida_emergencia = entrada_salida_emergencia;
        this.escondites = escondites;
        this.limpieza = limpieza;
        this.senializado = senializado;
        this.extintores = extintores;
        this.observaciones_sistema_emergencia = observaciones_sistema_emergencia;
        this.sistema_seguridad = sistema_seguridad;
        this.tipo_sistema_seguridad = tipo_sistema_seguridad;
        this.observaciones_sistema_seguridad = observaciones_sistema_seguridad;
        this.institucion_educativa = institucion_educativa;
        this.distancia_local_centro_educativo = distancia_local_centro_educativo;
        this.direccion = direccion;
        this.x_centro_educativo = x_centro_educativo;
        this.y_centro_educativo = y_centro_educativo;
        this.nombre_encuestada = nombre_encuestada;
        this.cedula_encuestada = cedula_encuestada;
        this.telefono_encuestada = telefono_encuestada;
        this.sugerencia_encuestada = sugerencia_encuestada;
        this.observaciones_generales = observaciones_generales;
    }

    public int getId_ficha_locales() {
        return id_ficha_locales;
    }

    public void setId_ficha_locales(int id_ficha_locales) {
        this.id_ficha_locales = id_ficha_locales;
    }

    public int getParroquia() {
        return parroquia;
    }

    public void setParroquia(int parroquia) {
        this.parroquia = parroquia;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Circuito getId_circuito() {
        return id_circuito;
    }

    public void setId_circuito(Circuito id_circuito) {
        this.id_circuito = id_circuito;
    }

    public SubCircuito getId_subcircuito() {
        return id_subcircuito;
    }

    public void setId_subcircuito(SubCircuito id_subcircuito) {
        this.id_subcircuito = id_subcircuito;
    }

    public String getEstado_local() {
        return estado_local;
    }

    public void setEstado_local(String estado_local) {
        this.estado_local = estado_local;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTipo_establecimiento() {
        return tipo_establecimiento;
    }

    public void setTipo_establecimiento(String tipo_establecimiento) {
        this.tipo_establecimiento = tipo_establecimiento;
    }

    public String getDireccion_establecimiento() {
        return direccion_establecimiento;
    }

    public void setDireccion_establecimiento(String direccion_establecimiento) {
        this.direccion_establecimiento = direccion_establecimiento;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getCedula_propietario() {
        return cedula_propietario;
    }

    public void setCedula_propietario(String cedula_propietario) {
        this.cedula_propietario = cedula_propietario;
    }

    public String getTelefono_propietario() {
        return telefono_propietario;
    }

    public void setTelefono_propietario(String telefono_propietario) {
        this.telefono_propietario = telefono_propietario;
    }

    public double getX_local() {
        return x_local;
    }

    public void setX_local(double x_local) {
        this.x_local = x_local;
    }

    public double getY_local() {
        return y_local;
    }

    public void setY_local(double y_local) {
        this.y_local = y_local;
    }

    public String getPermiso_municipio() {
        return permiso_municipio;
    }

    public void setPermiso_municipio(String permiso_municipio) {
        this.permiso_municipio = permiso_municipio;
    }

    public String getPermiso_bomberos() {
        return permiso_bomberos;
    }

    public void setPermiso_bomberos(String permiso_bomberos) {
        this.permiso_bomberos = permiso_bomberos;
    }

    public String getPermiso_mds() {
        return permiso_mds;
    }

    public void setPermiso_mds(String permiso_mds) {
        this.permiso_mds = permiso_mds;
    }

    public String getPermiso_mi() {
        return permiso_mi;
    }

    public void setPermiso_mi(String permiso_mi) {
        this.permiso_mi = permiso_mi;
    }

    public String getPermiso_lt() {
        return permiso_lt;
    }

    public void setPermiso_lt(String permiso_lt) {
        this.permiso_lt = permiso_lt;
    }

    public String getSri() {
        return sri;
    }

    public void setSri(String sri) {
        this.sri = sri;
    }

    public String getHora_inicio_diurno() {
        return hora_inicio_diurno;
    }

    public void setHora_inicio_diurno(String hora_inicio_diurno) {
        this.hora_inicio_diurno = hora_inicio_diurno;
    }

    public String getHora_fin_diurno() {
        return hora_fin_diurno;
    }

    public void setHora_fin_diurno(String hora_fin_diurno) {
        this.hora_fin_diurno = hora_fin_diurno;
    }

    public String getHora_inicio_nocturno() {
        return hora_inicio_nocturno;
    }

    public void setHora_inicio_nocturno(String hora_inicio_nocturno) {
        this.hora_inicio_nocturno = hora_inicio_nocturno;
    }

    public String getHora_fin_nocturno() {
        return hora_fin_nocturno;
    }

    public void setHora_fin_nocturno(String hora_fin_nocturno) {
        this.hora_fin_nocturno = hora_fin_nocturno;
    }

    public String getObservaciones_hora() {
        return observaciones_hora;
    }

    public void setObservaciones_hora(String observaciones_hora) {
        this.observaciones_hora = observaciones_hora;
    }

    public String getTerrenos_valdios() {
        return terrenos_valdios;
    }

    public void setTerrenos_valdios(String terrenos_valdios) {
        this.terrenos_valdios = terrenos_valdios;
    }

    public String getEspacios_abiertos() {
        return espacios_abiertos;
    }

    public void setEspacios_abiertos(String espacios_abiertos) {
        this.espacios_abiertos = espacios_abiertos;
    }

    public String getEspecificaciones_entorno() {
        return especificaciones_entorno;
    }

    public void setEspecificaciones_entorno(String especificaciones_entorno) {
        this.especificaciones_entorno = especificaciones_entorno;
    }

    public String getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(String visualizacion) {
        this.visualizacion = visualizacion;
    }

    public String getIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(String iluminacion) {
        this.iluminacion = iluminacion;
    }

    public String getEntrada_salida_emergencia() {
        return entrada_salida_emergencia;
    }

    public void setEntrada_salida_emergencia(String entrada_salida_emergencia) {
        this.entrada_salida_emergencia = entrada_salida_emergencia;
    }

    public String getEscondites() {
        return escondites;
    }

    public void setEscondites(String escondites) {
        this.escondites = escondites;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getSenializado() {
        return senializado;
    }

    public void setSenializado(String senializado) {
        this.senializado = senializado;
    }

    public String getExtintores() {
        return extintores;
    }

    public void setExtintores(String extintores) {
        this.extintores = extintores;
    }

    public String getObservaciones_sistema_emergencia() {
        return observaciones_sistema_emergencia;
    }

    public void setObservaciones_sistema_emergencia(String observaciones_sistema_emergencia) {
        this.observaciones_sistema_emergencia = observaciones_sistema_emergencia;
    }

    public String getSistema_seguridad() {
        return sistema_seguridad;
    }

    public void setSistema_seguridad(String sistema_seguridad) {
        this.sistema_seguridad = sistema_seguridad;
    }

    public String getTipo_sistema_seguridad() {
        return tipo_sistema_seguridad;
    }

    public void setTipo_sistema_seguridad(String tipo_sistema_seguridad) {
        this.tipo_sistema_seguridad = tipo_sistema_seguridad;
    }

    public String getObservaciones_sistema_seguridad() {
        return observaciones_sistema_seguridad;
    }

    public void setObservaciones_sistema_seguridad(String observaciones_sistema_seguridad) {
        this.observaciones_sistema_seguridad = observaciones_sistema_seguridad;
    }

    public String getInstitucion_educativa() {
        return institucion_educativa;
    }

    public void setInstitucion_educativa(String institucion_educativa) {
        this.institucion_educativa = institucion_educativa;
    }

    public int getDistancia_local_centro_educativo() {
        return distancia_local_centro_educativo;
    }

    public void setDistancia_local_centro_educativo(int distancia_local_centro_educativo) {
        this.distancia_local_centro_educativo = distancia_local_centro_educativo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getX_centro_educativo() {
        return x_centro_educativo;
    }

    public void setX_centro_educativo(double x_centro_educativo) {
        this.x_centro_educativo = x_centro_educativo;
    }

    public double getY_centro_educativo() {
        return y_centro_educativo;
    }

    public void setY_centro_educativo(double y_centro_educativo) {
        this.y_centro_educativo = y_centro_educativo;
    }

    public String getNombre_encuestada() {
        return nombre_encuestada;
    }

    public void setNombre_encuestada(String nombre_encuestada) {
        this.nombre_encuestada = nombre_encuestada;
    }

    public String getCedula_encuestada() {
        return cedula_encuestada;
    }

    public void setCedula_encuestada(String cedula_encuestada) {
        this.cedula_encuestada = cedula_encuestada;
    }

    public String getTelefono_encuestada() {
        return telefono_encuestada;
    }

    public void setTelefono_encuestada(String telefono_encuestada) {
        this.telefono_encuestada = telefono_encuestada;
    }

    public String getSugerencia_encuestada() {
        return sugerencia_encuestada;
    }

    public void setSugerencia_encuestada(String sugerencia_encuestada) {
        this.sugerencia_encuestada = sugerencia_encuestada;
    }

    public String getObservaciones_generales() {
        return observaciones_generales;
    }

    public void setObservaciones_generales(String observaciones_generales) {
        this.observaciones_generales = observaciones_generales;
    }

   
    
}
