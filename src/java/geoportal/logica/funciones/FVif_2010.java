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
 * @author servidor
 * ESTOY CONPROBANDO QUE EL GITHUB ESTA FUNCIONANDO 
 * 15/05/2015
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
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
    
    public static ArrayList<Vif_2010> ObtenerDatosDadoDiaAgresion(int dia) throws Exception {
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
    
}
