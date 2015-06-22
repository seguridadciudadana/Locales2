/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import denunciasfiscalia.logica.clases.Fiscalia_2012;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pc05
 */
public class FFiscalia_2012 {

    public static ArrayList<Fiscalia_2012> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        Fiscalia_2012 datos = null;
        try {
            while (rs.next()) {
                datos = new Fiscalia_2012(
                        rs.getDate("pfecha_denuncia"),
                        rs.getString("pnombres_denunciante"),
                        rs.getString("pnombres_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getString("pdomiciliado_vicitma"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("pnombres_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco_agresor_victima"),
                        rs.getString("pnumero_hijos"),
                        rs.getString("pdireccion_agresion"),
                        rs.getString("ptipo_agresion"),
                        rs.getDate("pfecha_agresion"),
                        rs.getString("phora_agresion"),
                        rs.getString("pmedidas_amparo"),
                        rs.getString("pinstruccion_fiscal"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pobservaciones"),
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

    public static ArrayList<Fiscalia_2012> ObtenerDatos() throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            String sql = "select * from geoportal.select_vif_2012_fiscalia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoSubCircuito(String circuito) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_subcircuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoTipoAgresion(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_tipo_agresion(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoEstadoCivil(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_estado_civil_victima(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoOcupacion(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_ocupacion_victima(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoParentescoAgresor(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_parentesco(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoDiaAgresion(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_dia_agresion(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    public static ArrayList<Fiscalia_2012> ObtenerDatosDadoMesAgresion(String pe) throws Exception {
        ArrayList<Fiscalia_2012> lst = new ArrayList<Fiscalia_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif_2012_fiscalia_dado_mes_agresion(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    
}
