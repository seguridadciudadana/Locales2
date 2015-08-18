/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import locales.logica.clases.Locales;

/**
 *
 * @author Oscunach
 */
public class FLocales {

    public static ArrayList<Locales> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        Locales datos = null;
        try {
            while (rs.next()) {
                datos = new Locales(
                        rs.getString("pestado"),
                        rs.getInt("pparroquia"),
                        rs.getInt("pzona"),
                        rs.getInt("psector"),
                        rs.getInt("pmanzana"),
                        rs.getString("pdireccion"),
                        rs.getString("pbarrio"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("prazon_social"),
                        rs.getString("ptipo_de_establecimiento"),
                        rs.getString("ppropietario"),
                        rs.getString("pcc_propietario"),
                        rs.getString("ppermiso_municipio"),
                        rs.getString("ppermiso_bomberos"),
                        rs.getString("ppermiso_msp"),
                        rs.getString("ppermiso_mi"),
                        rs.getString("ppermiso_mt"),
                        rs.getString("pruc_o_rise"),
                        rs.getString("phorario_diurno"),
                        rs.getString("pfin_horario_diurno"),
                        rs.getString("phorario_nocturno"),
                        rs.getString("pfin_horario_nocturno"),
                        rs.getString("pobservaciones_horario"),
                        rs.getString("pterrenos_valdios"),
                        rs.getString("pespacios_abiertos"),
                        rs.getString("pespecificaciones_contorno"),
                        rs.getString("pvisualizacion"),
                        rs.getString("piluminacion"),
                        rs.getString("pent_sal_emergencia"),
                        rs.getString("pescondites"),
                        rs.getString("plimpieza"),
                        rs.getString("psenializacion"),
                        rs.getString("pextintores"),
                        rs.getString("pobservaciones_seguridad"),
                        rs.getString("psistema_seguridad"),
                        rs.getString("ptipo"),
                        rs.getInt("pestablecimiento"),
                        rs.getInt("pbarrio_comunidad"),
                        rs.getString("pcamaras_ecu911"),
                        rs.getString("pobservac_seguridad2"),
                        rs.getString("pinsitucion_educativa_cerca"),
                        rs.getInt("pdistncia_ie"),
                        rs.getString("pdireccion_ie"),
                        rs.getString("pobservaciones_ie"),
                        rs.getString("pdigitador"),
                        rs.getString("pobservaciones_generales"),
                        rs.getInt("pid")
                );
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatos() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosCircuito() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoCircuito(String pe) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_circuito(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosSubCircuito() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoSubcircuito(String pe) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_subcircuito(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosEstadoEstablecimiento() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_estado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosTipoEstablecimiento() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_tipo_de_establecimiento()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoTipoEstablecimiento(String pe) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_tipo_de_establecimiento(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPorCircuitos() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPorSubCircuitos() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoSubCircuito(String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_subcircuito(?)";
            lstP.add(new Parametro(1, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosEspaciosAbiertos() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_espacios_abiertos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoEspaciosAbiertos(String ea) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_espacios_abiertos(?)";
            lstP.add(new Parametro(1, ea));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosCamaraEcu911() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_camaras_ecu911()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoCamaraEcu911(String ce) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_camaras_ecu911(?)";
            lstP.add(new Parametro(1, ce));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosIluminacion() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_iluminacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoIluminacion(String di) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_iluminacion(?)";
            lstP.add(new Parametro(1, di));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosManzana() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_manzana()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoManzana(String dm) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_manzana(?)";
            lstP.add(new Parametro(1, dm));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosParroquia() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_parroquia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoParroquia(int dp) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_parroquia(?)";
            lstP.add(new Parametro(1, dp));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPermisoBomberos() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_permiso_bomberos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoPermisoBomberos(String pb) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_bomberos(?)";
            lstP.add(new Parametro(1, pb));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPermisoMI() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_permiso_mi()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoPermisoMI(String mi) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mi(?)";
            lstP.add(new Parametro(1, mi));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPermisoMSP() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_permiso_msp()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoPermisoMSP(String msp) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_msp(?)";
            lstP.add(new Parametro(1, msp));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPermisoMT() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_permiso_mt()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoPermisoMT(String mt) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mt(?)";
            lstP.add(new Parametro(1, mt));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosPermisoMunicipio() throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            String sql = "select * from locales.f_select_locales_busqueda_permiso_municipio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoPermisoMunicipio(String pm) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_municipio(?)";
            lstP.add(new Parametro(1, pm));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Locales> ObtenerDatosDadoEstadoBarrio(String estado, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_barrio(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoParroquia(String estado, Integer parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_parroquia(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoCircuito(String estado, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_circuito(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoSubcircuito(String estado, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_subcircuito(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoPermisoMunicipio(String estado, String permiso_municipio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_permiso_municipio(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, permiso_municipio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoPermisoBomberos(String estado, String permiso_bomberos) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_permiso_bomberos(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, permiso_bomberos));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoPermisoMsp(String estado, String permiso_msp) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_permiso_msp(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, permiso_msp));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoPermisoMi(String estado, String permiso_mi) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_permiso_mi(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, permiso_mi));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoPermisoMt(String estado, String permiso_mt) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_permiso_mt(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, permiso_mt));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Locales> ObtenerDatosDadoEstadoRuc(String estado, String ruc_o_rise) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_estado_ruc(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, ruc_o_rise));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMunicipioParroquia(String permiso_municipio, int parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_municipio_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMunicipioBarrio(String permiso_municipio, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_municipio_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMunicipioCircuito(String permiso_municipio, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_municipio_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMunicipioSubcircuito(String permiso_municipio, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_municipio_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoBomberosParroquia(String permiso_bomberos, int parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_bombneros_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoBomberosBarrio(String permiso_bomberos, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_bomberos_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoBomberosCircuito(String permiso_bomberos, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_bomberos_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoBomberosSubcircuito(String permiso_bomberos, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_bomberos_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMspParroquia(String permiso_msp, int parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_msp_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMspBarrio(String permiso_msp, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_msp_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMspCircuito(String permiso_msp, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_msp_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMspSubcircuito(String permiso_msp, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_msp_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMiParroquia(String permiso_mi, int parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mi_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMiBarrio(String permiso_mi, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mi_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMiCircuito(String permiso_mi, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mi_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMiSubcircuito(String permiso_mi, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mi_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMtParroquia(String permiso_mt, int parroquia) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mt_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMtBarrio(String permiso_mt, String barrio) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mt_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMtCircuito(String permiso_mt, String circuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mt_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Locales> ObtenerDatosDadoPermisoMtSubcircuito(String permiso_mt, String subcircuito) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_locales_dado_permiso_mt_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }


}



