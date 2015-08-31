/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.Vif_2010;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author servidor ESTOY CONPROBANDO QUE EL GITHUB ESTA FUNCIONANDO 15/05/2015
 */
public class FVif_2010 {

    public static ArrayList<Vif_2010> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        Vif_2010 datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2010(rs.getDate("pfecha__den"), rs.getString("pnombres_de"),
                        rs.getString("pvictima"), rs.getString("psexo_victi"), rs.getString("pdireccion_"), rs.getDouble("px"), rs.getDouble("py"),
                        rs.getString("pcircuito"), rs.getString("pcodigo_cir"), rs.getString("psubcircuit"), rs.getString("pcodigo_sub"),
                        rs.getString("pdomiciliad"), rs.getString("pedad_victi"), rs.getString("pestado_civ"), rs.getString("pnivel_de_i"),
                        rs.getString("pocupacion"), rs.getString("pnombres__a"), rs.getString("psexo__agre"), rs.getString("pdireccion"),
                        rs.getString("pedad__agre"), rs.getString("pdomicilio"), rs.getString("pestado_c_1"), rs.getString("pnivel_de_1"),
                        rs.getString("pocupacio_1"), rs.getString("pparentesco"), rs.getString("pnumeros_hi"), rs.getString("pdireccion1"),
                        rs.getString("plugar"), rs.getString("ptipo_de_vi"), rs.getString("pfecha_agre"), rs.getString("phora_de_ag"),
                        rs.getString("pmedidas_de"), rs.getString("psentencia"), rs.getString("papelacion"), rs.getString("pboletas_an"),
                        rs.getString("pobservacio"), rs.getString("pboletas_de"), rs.getInt("pid"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatos() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    //--------------------------------------PARA CONTRASTES DATOS 2010----------------------------
    public static ArrayList<Vif_2010> ObtenerDatosMujerHombre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_mujer_hombre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosMujerMujer() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_mujer_mujer()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosHombreHombre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_hombre_hombre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosHombreMujer() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_hombre_mujer()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    //--------------------------------------PARA CONTRASTES DATOS 2010----------------------------

    public static ArrayList<Vif_2010> ObtenerDatosVictima() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_victima()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosCircuito() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSubCircuito() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //datos por estado civil
    public static ArrayList<Vif_2010> ObtenerDatosVictimaCasados() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_casado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaCasadosDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_casado_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaDivorciado() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_divorciado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaDivorciadoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_divorciado_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaNa() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_na()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

     public static ArrayList<Vif_2010> ObtenerDatosVictimaNaDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_na_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaSoltero() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_soltero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaSolteroDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_soltero_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaUnionHecho() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_union_de_hecho()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaUnionHechoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_union_de_hecho_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaUnionLibre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_union_libre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaUnionLibreDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_union_libre_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaViudo() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_viudo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaViudoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_viudo_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
       //datos victimas ocupacion
    public static ArrayList<Vif_2010> ObtenerDatosVictimaComerciante() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_comerciante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     public static ArrayList<Vif_2010> ObtenerDatosVictimaComercianteDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_comerciante_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaQueHaceres() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_que_haceres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaQueHaceresDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_que_haceres_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    

    public static ArrayList<Vif_2010> ObtenerDatosVictimaEmpleadoPrivado() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_empleado_privado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaEmpleadoPrivadoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_empleado_privado_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
        
    public static ArrayList<Vif_2010> ObtenerDatosVictimaEmpleadoPublico() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_empleado_publico()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaEmpleadoPublicoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_empleado_publico_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaEstudiantes() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estudiantes()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaEstudiantesDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_estudiantes_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaJornalero() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_jornalero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaJornaleroDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_jornalero_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaJubilado() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_jubilado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosVictimaJubiladoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_jubilado_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaProfesional() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_profesional()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaProfesionalDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_profesional_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    

    public static ArrayList<Vif_2010> ObtenerDatosVictimaNA() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_na()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosVictimaNADadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_na_dado_sexo(?)";            
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    

    public static ArrayList<Vif_2010> ObtenerDatosVictimaOcupacion() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_victima_ocupacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoCircuitoSexo(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_circuito_sexo(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoCircuitoTipoViolencia(String circuito, String tViolencia) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_circuito_tipo_violencia(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, tViolencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSubCircuitoTipoViolencia(String subcircuito, String tViolencia) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_subcircuito_tipo_violencia(?,?)";
            lstP.add(new Parametro(1, subcircuito));
            lstP.add(new Parametro(2, tViolencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoCircuitoSexoVictima(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_circuito_sexo_victima(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSubCircuitoSexo(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_subcircuito_sexo(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSubCircuitoSexoVictima(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_subcircuito_sexo_victima(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEdadSexo(String sexo, String edad) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_edad_sexo(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, edad));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEdadSexoVictima(String sexo, String edad) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_edad_sexo_victima(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, edad));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosAgresor() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_agresor()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosAgresorOcupacion() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_agresor_ocupacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoNombreVictima(String nombre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_nombre_victima(?)";
            lstP.add(new Parametro(1, nombre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoFechas(Date fecha1, Date fecha2) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_fechas(?,?)";
            lstP.add(new Parametro(1, fecha1));
            lstP.add(new Parametro(2, fecha2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSexoVictima(String nombre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_victima(?)";
            lstP.add(new Parametro(1, nombre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSubcircuito(String subcircuito) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_subcircuito(?)";
            lstP.add(new Parametro(1, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEdadVictima(String edadvic) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_edad_victima(?)";
            lstP.add(new Parametro(1, edadvic));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEdadAgresor(String edadagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_edad_agresor(?)";
            lstP.add(new Parametro(1, edadagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEstadoCivilVictima(String estadovic) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_estado_victima(?)";
            lstP.add(new Parametro(1, estadovic));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoEstadoCivilAgresor(String estadoagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_estado_agresor(?)";
            lstP.add(new Parametro(1, estadoagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoOcupacionVictima(String ocupacionvic) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_ocupacion_victima(?)";
            lstP.add(new Parametro(1, ocupacionvic));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoOcupacionAgresor(String ocupacionagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_ocupacion_agresor(?)";
            lstP.add(new Parametro(1, ocupacionagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoNombreAgresor(String nombreagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_nombre_agresor(?)";
            lstP.add(new Parametro(1, nombreagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorEneroMasculino() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_agresor_enero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorEneroFemenino() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_agresor_enero1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorFebreroMasculino() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_febrero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorMarzo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_marzo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorAbril(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_abril(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorMayo(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_mayo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorJunio(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_junio(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorJulio(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_julio(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorAgosto(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_agosto(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorSeptiembre(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_septiembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorOctubre(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_octubre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorNoviembre(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_noviembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorDiciembre(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_diciembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoAgresorFebreroFemenino() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_sexo_agresor_febrero1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    /* public static ArrayList<Vif_2010> ObtenerDatosDadoSexoAgresorEnero() throws Exception {
     ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
     try {
     ArrayList<Parametro> lstP = new ArrayList<Parametro>();
     String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_agresor(?)";
     lstP.add(new Parametro(1, nombreagre));
     ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

     lst = llenarDatos(rs);
     rs = null;
     } catch (SQLException exConec) {
     throw new Exception(exConec.getMessage());
     }
     return lst;
     }*/
    public static ArrayList<Vif_2010> ObtenerDatosDadoSexoAgresor1(String nombreagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_agresor1(?)";
            lstP.add(new Parametro(1, nombreagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSexoAgresor2(String nombreagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_agresor2(?)";
            lstP.add(new Parametro(1, nombreagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSexoVictima1(String nombreagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_victima1(?)";
            lstP.add(new Parametro(1, nombreagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoSexoVictima2(String nombreagre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_victima2(?)";
            lstP.add(new Parametro(1, nombreagre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosEnero() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_enero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosFebrero() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_febrero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosMarzo() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_marzo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosAbril() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_abril()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosMayo() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_mayo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosJunio() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_junio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosJulio() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_julio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosAgosto() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_agosto()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSeptiembre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_septiembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosOctubre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_octubre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosNoviembre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_noviembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDiciembre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_diciembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoDiaAgresion(String dia) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_dia_agresion(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoTipoViolencia(String nombre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_violencia(?)";
            lstP.add(new Parametro(1, nombre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosDadoTipoViolenciaSexoVictima(String sexo, String violencia) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_sexo_victima_tipo_violencia(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, violencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    

    public static ArrayList<Vif_2010> ObtenerDatosDadoMesSexoVictima(String mes, String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_mes_sexo_victima(?,?)";
            lstP.add(new Parametro(1, mes));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     public static ArrayList<Vif_2010> ObtenerDatosDadoMesDenuncia(String mes) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_mes(?)";
            lstP.add(new Parametro(1, mes));            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDiaAgresion() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_fecha_agresion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoFechaAgresion(String nombre) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_fecha_agresion(?)";
            lstP.add(new Parametro(1, nombre));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosTipoViolencia() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_busqueda_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

     //edades
    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad1(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango1(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad2(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango2(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad3(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango3(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad4(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango4(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad5(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango5(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad6(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango6(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdad7(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rango7(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;

    }

    public static ArrayList<Vif_2010> ObtenerDatosSexoVictimaEdadNa(String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_dado_sexo_victima_rangona(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosParentesco() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_parentesco()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2010> ObtenerDatosDadoParentesco(String parentesco) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_2_dado_parentesco(?)";
            lstP.add(new Parametro(1, parentesco));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosEstadoCivil() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_estado_civil()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosDadoDiaAgresionSexoVictima(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_dia_agresion_sexo_victima(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2010> ObtenerDatosDadoMesDenunciaSexoVictima(String mes, String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_mes_sexo_victima(?,?)";
            lstP.add(new Parametro(1, mes));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
    //--------------------------------------------- TIPO VIOLENCIA - SEXO --------------------
    
    public static ArrayList<Vif_2010> ObtenerDatosDadoTipoViolenciaSexo(String nombre,String sexo) throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_violencia_sexo(?,?)";
            lstP.add(new Parametro(1, nombre));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    //--------------------------------------------- TIPO VIOLENCIA - SEXO --------------------

        public static ArrayList<Vif_2010> ObtenerDatosVictimaHombre() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_hombres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
        public static ArrayList<Vif_2010> ObtenerDatosVictimaMujer() throws Exception {
        ArrayList<Vif_2010> lst = new ArrayList<Vif_2010>();
        try {
            String sql = "select * from geoportal.f_select_vif_2010_2_mujeres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
}
