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
       
        public static ArrayList<Locales> ObtenerDatosDadoParroquia(String dp) throws Exception {
        ArrayList<Locales> lst = new ArrayList<Locales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from select locales.f_select_locales_dado_parroquia(?)";
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
        
        
        
        
        
        
        
        
       
       
       
       
       
       
       
       
       
      
      
      
     
    

}
