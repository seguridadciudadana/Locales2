package locales.logica.clases;

import master.logica.clases.Usuario;
import recursos.Canton;
import recursos.Parroquia;
import recursos.Provincia;
import vif.logica.clases.Circuito;
import vif.logica.clases.Subcircuito;

/**
 *
 * @author Morales Alex
  */
public class FichasLocales {

    private int id_ficha;
    private int carga_trabajo;
    private int grupo;
    private Usuario id_usuario;
    private Provincia id_provincia;
    private Canton id_canton;
    private Parroquia id_parroquia;
    private int zona;
    private int sector;
    private int manzana;
    private int formulario;
    private int direccion;
    private String barrio;
    private Circuito id_circuito;
    private Subcircuito id_subcircuito;
    private int categoria;
    private String razon_social;
    private String tipo_establecimiento;
    private String nombre_propietario;
    private String cedula_cuidadania;
    private int permiso_municipio;
    private int permiso_bombero;
    private int permiso_msp;
    private int permiso_mi;
    private String horario_diurno;
    private String horario_noctuno;
    private String observacion_horario;
    private int terrenos_valdios;
    private int espacio_abiertos;
    private String observacion_entorno_visual;
    private int visualizacion_interna;
    private int iluminacion;
    private int entrada_salidasemergencia;
    private int escondites;
    private int limpieza_local;
    private int senializacion;
    private int extintor;
    private String observacion_emergenciapxley;
    private int sistema_seguridad;
    private int tipo_sseg;
    private String observacio_seguridad;
    private String nombre_unidadeducativa;
    private double distancia;
    private String direccion_ie;
    private String observaciones_generales;
    /*
     contructores
     */

    public FichasLocales() {
    }

    public FichasLocales(int id_ficha, int carga_trabajo, int grupo, Usuario id_usuario, Provincia id_provincia, Canton id_canton, Parroquia id_parroquia, int zona, int sector, int manzana, int formulario, int direccion, String barrio, Circuito id_circuito, Subcircuito id_subcircuito, int categoria, String razon_social, String tipo_establecimiento, String nombre_propietario, String cedula_cuidadania, int permiso_municipio, int permiso_bombero, int permiso_msp, int permiso_mi, String horario_diurno, String horario_noctuno, String observacion_horario, int terrenos_valdios, int espacio_abiertos, String observacion_entorno_visual, int visualizacion_interna, int iluminacion, int entrada_salidasemergencia, int escondites, int limpieza_local, int senializacion, int extintor, String observacion_emergenciapxley, int sistema_seguridad, int tipo_sseg, String observacio_seguridad, String nombre_unidadeducativa, double distancia, String direccion_ie, String observaciones_generales) {
        this.id_ficha = id_ficha;
        this.carga_trabajo = carga_trabajo;
        this.grupo = grupo;
        this.id_usuario = id_usuario;
        this.id_provincia = id_provincia;
        this.id_canton = id_canton;
        this.id_parroquia = id_parroquia;
        this.zona = zona;
        this.sector = sector;
        this.manzana = manzana;
        this.formulario = formulario;
        this.direccion = direccion;
        this.barrio = barrio;
        this.id_circuito = id_circuito;
        this.id_subcircuito = id_subcircuito;
        this.categoria = categoria;
        this.razon_social = razon_social;
        this.tipo_establecimiento = tipo_establecimiento;
        this.nombre_propietario = nombre_propietario;
        this.cedula_cuidadania = cedula_cuidadania;
        this.permiso_municipio = permiso_municipio;
        this.permiso_bombero = permiso_bombero;
        this.permiso_msp = permiso_msp;
        this.permiso_mi = permiso_mi;
        this.horario_diurno = horario_diurno;
        this.horario_noctuno = horario_noctuno;
        this.observacion_horario = observacion_horario;
        this.terrenos_valdios = terrenos_valdios;
        this.espacio_abiertos = espacio_abiertos;
        this.observacion_entorno_visual = observacion_entorno_visual;
        this.visualizacion_interna = visualizacion_interna;
        this.iluminacion = iluminacion;
        this.entrada_salidasemergencia = entrada_salidasemergencia;
        this.escondites = escondites;
        this.limpieza_local = limpieza_local;
        this.senializacion = senializacion;
        this.extintor = extintor;
        this.observacion_emergenciapxley = observacion_emergenciapxley;
        this.sistema_seguridad = sistema_seguridad;
        this.tipo_sseg = tipo_sseg;
        this.observacio_seguridad = observacio_seguridad;
        this.nombre_unidadeducativa = nombre_unidadeducativa;
        this.distancia = distancia;
        this.direccion_ie = direccion_ie;
        this.observaciones_generales = observaciones_generales;
    }
    /*
     metodos get y set
     */

    public int getId_ficha() {
        return id_ficha;
    }

    public void setId_ficha(int id_ficha) {
        this.id_ficha = id_ficha;
    }

    public int getCarga_trabajo() {
        return carga_trabajo;
    }

    public void setCarga_trabajo(int carga_trabajo) {
        this.carga_trabajo = carga_trabajo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Provincia getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(Provincia id_provincia) {
        this.id_provincia = id_provincia;
    }

    public Canton getId_canton() {
        return id_canton;
    }

    public void setId_canton(Canton id_canton) {
        this.id_canton = id_canton;
    }

    public Parroquia getId_parroquia() {
        return id_parroquia;
    }

    public void setId_parroquia(Parroquia id_parroquia) {
        this.id_parroquia = id_parroquia;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getFormulario() {
        return formulario;
    }

    public void setFormulario(int formulario) {
        this.formulario = formulario;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
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

    public Subcircuito getId_subcircuito() {
        return id_subcircuito;
    }

    public void setId_subcircuito(Subcircuito id_subcircuito) {
        this.id_subcircuito = id_subcircuito;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTipo_establecimiento() {
        return tipo_establecimiento;
    }

    public void setTipo_establecimiento(String tipo_establecimiento) {
        this.tipo_establecimiento = tipo_establecimiento;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getCedula_cuidadania() {
        return cedula_cuidadania;
    }

    public void setCedula_cuidadania(String cedula_cuidadania) {
        this.cedula_cuidadania = cedula_cuidadania;
    }

    public int getPermiso_municipio() {
        return permiso_municipio;
    }

    public void setPermiso_municipio(int permiso_municipio) {
        this.permiso_municipio = permiso_municipio;
    }

    public int getPermiso_bombero() {
        return permiso_bombero;
    }

    public void setPermiso_bombero(int permiso_bombero) {
        this.permiso_bombero = permiso_bombero;
    }

    public int getPermiso_msp() {
        return permiso_msp;
    }

    public void setPermiso_msp(int permiso_msp) {
        this.permiso_msp = permiso_msp;
    }

    public int getPermiso_mi() {
        return permiso_mi;
    }

    public void setPermiso_mi(int permiso_mi) {
        this.permiso_mi = permiso_mi;
    }

    public String getHorario_diurno() {
        return horario_diurno;
    }

    public void setHorario_diurno(String horario_diurno) {
        this.horario_diurno = horario_diurno;
    }

    public String getHorario_noctuno() {
        return horario_noctuno;
    }

    public void setHorario_noctuno(String horario_noctuno) {
        this.horario_noctuno = horario_noctuno;
    }

    public String getObservacion_horario() {
        return observacion_horario;
    }

    public void setObservacion_horario(String observacion_horario) {
        this.observacion_horario = observacion_horario;
    }

    public int getTerrenos_valdios() {
        return terrenos_valdios;
    }

    public void setTerrenos_valdios(int terrenos_valdios) {
        this.terrenos_valdios = terrenos_valdios;
    }

    public int getEspacio_abiertos() {
        return espacio_abiertos;
    }

    public void setEspacio_abiertos(int espacio_abiertos) {
        this.espacio_abiertos = espacio_abiertos;
    }

    public String getObservacion_entorno_visual() {
        return observacion_entorno_visual;
    }

    public void setObservacion_entorno_visual(String observacion_entorno_visual) {
        this.observacion_entorno_visual = observacion_entorno_visual;
    }

    public int getVisualizacion_interna() {
        return visualizacion_interna;
    }

    public void setVisualizacion_interna(int visualizacion_interna) {
        this.visualizacion_interna = visualizacion_interna;
    }

    public int getIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(int iluminacion) {
        this.iluminacion = iluminacion;
    }

    public int getEntrada_salidasemergencia() {
        return entrada_salidasemergencia;
    }

    public void setEntrada_salidasemergencia(int entrada_salidasemergencia) {
        this.entrada_salidasemergencia = entrada_salidasemergencia;
    }

    public int getEscondites() {
        return escondites;
    }

    public void setEscondites(int escondites) {
        this.escondites = escondites;
    }

    public int getLimpieza_local() {
        return limpieza_local;
    }

    public void setLimpieza_local(int limpieza_local) {
        this.limpieza_local = limpieza_local;
    }

    public int getSenializacion() {
        return senializacion;
    }

    public void setSenializacion(int senializacion) {
        this.senializacion = senializacion;
    }

    public int getExtintor() {
        return extintor;
    }

    public void setExtintor(int extintor) {
        this.extintor = extintor;
    }

    public String getObservacion_emergenciapxley() {
        return observacion_emergenciapxley;
    }

    public void setObservacion_emergenciapxley(String observacion_emergenciapxley) {
        this.observacion_emergenciapxley = observacion_emergenciapxley;
    }

    public int getSistema_seguridad() {
        return sistema_seguridad;
    }

    public void setSistema_seguridad(int sistema_seguridad) {
        this.sistema_seguridad = sistema_seguridad;
    }

    public int getTipo_sseg() {
        return tipo_sseg;
    }

    public void setTipo_sseg(int tipo_sseg) {
        this.tipo_sseg = tipo_sseg;
    }

    public String getObservacio_seguridad() {
        return observacio_seguridad;
    }

    public void setObservacio_seguridad(String observacio_seguridad) {
        this.observacio_seguridad = observacio_seguridad;
    }

    public String getNombre_unidadeducativa() {
        return nombre_unidadeducativa;
    }

    public void setNombre_unidadeducativa(String nombre_unidadeducativa) {
        this.nombre_unidadeducativa = nombre_unidadeducativa;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getDireccion_ie() {
        return direccion_ie;
    }

    public void setDireccion_ie(String direccion_ie) {
        this.direccion_ie = direccion_ie;
    }

    public String getObservaciones_generales() {
        return observaciones_generales;
    }

    public void setObservaciones_generales(String observaciones_generales) {
        this.observaciones_generales = observaciones_generales;
    }

}
