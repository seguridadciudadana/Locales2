package locales2.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import locales2.logica.funciones.FCircuito;
import locales2.logica.funciones.FSubCircuito;
import locales2.logica.funciones.FFichaLocales;
import locales2.logica.clases.*;

public class FFichaLocales {

    //Fecha 05-05-2016
    public static ArrayList<FichaLocales> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        FichaLocales datos = null;
        try {
            while (rs.next()) {
                datos = new FichaLocales(
                        rs.getInt("pid_ficha_locales"),
                        rs.getInt("pparroquia"), 
                        rs.getString("pbarrio"), 
                        FCircuito.obtenerCircuitoCodigo(rs.getInt("pid_circuito")),
                        FSubCircuito.obtenerSubCircuitoCodigo(rs.getInt("pid_subcircuito")), 
                        rs.getString("pestado_local"), 
                        rs.getString("prazon_social"), 
                        rs.getInt("pcategoria"), 
                        rs.getString("ptipo_establecimiento"), 
                        rs.getString("pdireccion_establecimiento"), 
                        rs.getString("pnombre_propietario"), 
                        rs.getString("pcedula_propietario"), 
                        rs.getString("ptelefono_propietario"), 
                        rs.getDouble("px_local"),
                        rs.getDouble("py_local"), 
                        rs.getString("ppermiso_municipio"), 
                        rs.getString("ppermiso_bomberos"), 
                        rs.getString("ppermiso_mds"), 
                        rs.getString("ppermiso_mi"), 
                        rs.getString("ppermiso_lt"), 
                        rs.getString("psri"), 
                        rs.getString("phora_inicio_diurno"), 
                        rs.getString("phora_fin_diurno"), 
                        rs.getString("phora_inicio_nocturno"), 
                        rs.getString("phora_fin_nocturno"), 
                        rs.getString("pobservaciones_hora"), 
                        rs.getString("pterrenos_valdios"), 
                        rs.getString("pespacios_abiertos"), 
                        rs.getString("pespecificaciones_entorno"), 
                        rs.getString("pvisualizacion"), 
                        rs.getString("piluminacion"), 
                        rs.getString("pentrada_salida_emergencia"), 
                        rs.getString("pescondites"), 
                        rs.getString("plimpieza"), 
                        rs.getString("psenializado"), 
                        rs.getString("pextintores"), 
                        rs.getString("pobservaciones_sistema_emergencia"), 
                        rs.getString("psistema_seguridad"), 
                        rs.getString("ptipo_sistema_seguridad"), 
                        rs.getString("pobservaciones_sistema_seguridad"), 
                        rs.getString("pinstitucion_educativa"), 
                        rs.getInt("pdistancia_local_centro_educativo"), 
                        rs.getString("pdireccion"), 
                        rs.getDouble("px_centro_educativo"),
                        rs.getDouble("py_centro_educativo"),
                        rs.getString("pnombre_encuestada"),
                        rs.getString("pcedula_encuestada"),
                        rs.getString("ptelefono_encuestada"),
                        rs.getString("psugerencia_encuestada"),
                        rs.getString("pobservaciones_generales"));
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    
    
    public static boolean insertarFichasLocales(FichaLocales fichasLocales) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_insert_ficha(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, fichasLocales.getParroquia()));
            lstP.add(new Parametro(2, fichasLocales.getBarrio()));
            lstP.add(new Parametro(3, fichasLocales.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(4, fichasLocales.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(5, fichasLocales.getEstado_local()));
            lstP.add(new Parametro(6, fichasLocales.getRazon_social()));
            lstP.add(new Parametro(7, fichasLocales.getCategoria()));
            lstP.add(new Parametro(8,fichasLocales.getTipo_establecimiento()));
            lstP.add(new Parametro(9,fichasLocales.getDireccion_establecimiento()));
            lstP.add(new Parametro(10,fichasLocales.getNombre_propietario()));
            lstP.add(new Parametro(11,fichasLocales.getCedula_propietario()));
            lstP.add(new Parametro(12,fichasLocales.getTelefono_propietario()));
            lstP.add(new Parametro(13,fichasLocales.getX_local()));
            lstP.add(new Parametro(14,fichasLocales.getY_local()));
            lstP.add(new Parametro(15,fichasLocales.getPermiso_municipio()));
            lstP.add(new Parametro(16,fichasLocales.getPermiso_bomberos()));
            lstP.add(new Parametro(17,fichasLocales.getPermiso_mds()));
            lstP.add(new Parametro(18,fichasLocales.getPermiso_mi()));
            lstP.add(new Parametro(19,fichasLocales.getPermiso_lt()));
            lstP.add(new Parametro(20,fichasLocales.getSri()));
            lstP.add(new Parametro(21,fichasLocales.getHora_inicio_diurno()));
            lstP.add(new Parametro(22,fichasLocales.getHora_fin_diurno()));
            lstP.add(new Parametro(23,fichasLocales.getHora_inicio_nocturno()));
            lstP.add(new Parametro(24,fichasLocales.getHora_fin_nocturno()));
            lstP.add(new Parametro(25,fichasLocales.getObservaciones_hora()));
            lstP.add(new Parametro(26,fichasLocales.getTerrenos_valdios()));
            lstP.add(new Parametro(27,fichasLocales.getEspacios_abiertos()));
            lstP.add(new Parametro(28,fichasLocales.getEspecificaciones_entorno()));
            lstP.add(new Parametro(29,fichasLocales.getVisualizacion()));
            lstP.add(new Parametro(30,fichasLocales.getIluminacion()));
            lstP.add(new Parametro(31,fichasLocales.getEntrada_salida_emergencia()));
            lstP.add(new Parametro(32,fichasLocales.getEscondites()));
            lstP.add(new Parametro(33,fichasLocales.getLimpieza()));
            lstP.add(new Parametro(34,fichasLocales.getSenializado()));
            lstP.add(new Parametro(35,fichasLocales.getExtintores()));
            lstP.add(new Parametro(36,fichasLocales.getObservaciones_sistema_emergencia()));
            lstP.add(new Parametro(37,fichasLocales.getSistema_seguridad()));
            lstP.add(new Parametro(38,fichasLocales.getTipo_sistema_seguridad()));
            lstP.add(new Parametro(39,fichasLocales.getObservaciones_sistema_seguridad()));
            lstP.add(new Parametro(40,fichasLocales.getInstitucion_educativa()));
            lstP.add(new Parametro(41,fichasLocales.getDistancia_local_centro_educativo()));
            lstP.add(new Parametro(42,fichasLocales.getDireccion()));
            lstP.add(new Parametro(43,fichasLocales.getX_centro_educativo()));
            lstP.add(new Parametro(44,fichasLocales.getY_centro_educativo()));
            lstP.add(new Parametro(45,fichasLocales.getNombre_encuestada()));
            lstP.add(new Parametro(46,fichasLocales.getCedula_encuestada()));
            lstP.add(new Parametro(47,fichasLocales.getTelefono_encuestada()));
            lstP.add(new Parametro(48,fichasLocales.getSugerencia_encuestada()));
            lstP.add(new Parametro(49,fichasLocales.getObservaciones_generales()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;

    }
    public static ArrayList<FichaLocales> ObtenerDatosParroquia() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales_busqueda_parroquia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

      public static ArrayList<FichaLocales> ObtenerDatosDadoRucoRiseParroquias(String ruc, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_ruc_parroquia(?,?)";
            lstP.add(new Parametro(1, ruc));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
     
      //Marco Guapi
      public static ArrayList<FichaLocales> ObtenerDatosEstadoEstablecimiento() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales_busqueda_estado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
      //Marco Guapi
      public static ArrayList<FichaLocales> ObtenerDatosTipoEstablecimiento() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales_busqueda_tipo_establecimiento();";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
      
      //Marco Guapi
       public static ArrayList<FichaLocales> ObtenerDatosDadoTipoEstablecimiento(String pe) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_tipo_de_establecimiento(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
      //Marco Guapi
       public static ArrayList<FichaLocales> ObtenerLocalesDadoCircuito(int pe) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_circuito(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
       //Marco Guapi
        public static ArrayList<FichaLocales> ObtenerLocalesDadoSubcircuito(int pe) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_subcircuito(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
        
        //Marco Guapi
         public static ArrayList<FichaLocales> ObtenerDatos() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
         
         //Marco Guapi
        public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMunicipioBarrio(String permiso_municipio, String barrio) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_municipio_barrio(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, barrio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
      //Marco Guapi
        public static ArrayList<FichaLocales> ObtenerDatosBarrios() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales_busqueda_barrio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
        //Marco Guapi
        public static ArrayList<FichaLocales> ObtenerDatosDeCircuito() throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            String sql = "select * from locales2.f_select_locales_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
        //Marco Guapi
          public static ArrayList<FichaLocales> ObtenerDatosDadoEstadoCircuito(String estado, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_estado_circuito(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
          //Marco Guapi
          
          public static ArrayList<FichaLocales> ObtenerLocalesDadoEstadoSubcircuito(String estado, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_estado_subcircuito(?,?)";
            lstP.add(new Parametro(1, estado));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
          
          //Marco Guapi
           public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoBomberosParroquia(String permiso_bomberos, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_bomberos_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
       
           //Marco Guapi
           
            public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMiParroquia(String permiso_mi, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mi_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
           
            //Marco Guapi
            
             public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMdsParroquia(String permiso_msp, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mds_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
             
             //Marco Guapi
             
              public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoLtParroquia(String permiso_mt, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_lt_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
              
              //Marco Guapi
              
              public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMunicipioParroquia(String permiso_municipio, int parroquia) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_municipio_parroquia(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
     
              //Marco Guapi
              public static ArrayList<FichaLocales> ObtenerDatosDadoParroquia(int dp) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_parroquia(?)";
            lstP.add(new Parametro(1, dp));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
          //Marco Guapi
              
               public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoBomberosCircuito(String permiso_bomberos, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_bomberos_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
               // Marco Guapi
               
          public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoBomberosSubcircuito(String permiso_bomberos, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_bomberos_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_bomberos));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
          // Marco Guapi
          
          public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMiCircuito(String permiso_mi, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mi_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
       
          //Marco Guapi
           public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMiSubcircuito(String permiso_mi, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mi_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_mi));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
           //Marco Guapi
           public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMspCircuito(String permiso_msp, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_msp_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
           
           //Marco Guapi
            public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMspSubcircuito(String permiso_msp, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_msp_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_msp));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
            //Marco Guapi
              public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMtCircuito(String permiso_mt, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mt_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
              //Marco Guapi
              public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMtSubcircuito(String permiso_mt, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_mt_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_mt));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
              
              //Marco Guapi
               public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMunicipioCircuito(String permiso_municipio, int circuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_municipio_circuito(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
               //Marco Guapi
               
                public static ArrayList<FichaLocales> ObtenerDatosDadoPermisoMunicipioSubcircuito(String permiso_municipio, int subcircuito) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_select_locales_dado_permiso_municipio_subcircuito(?,?)";
            lstP.add(new Parametro(1, permiso_municipio));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

           
    
}
