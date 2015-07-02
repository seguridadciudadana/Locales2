/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.clases.Vif_2012_2;
import static geoportal.logica.funciones.FVif_2012.llenarDatos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FVif_2012_2 {

    public static ArrayList<Vif_2012_2> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        Vif_2012_2 datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2012_2(
                        rs.getDate("pfecha_denuncia"),
                        rs.getString("pdenunciante"),
                        rs.getString("pvictima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("pdomiciliado_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pnivel_de_instruccion_victima"),
                        rs.getString("pocupacion"),
                        rs.getString("pagresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pnivel_de_instruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getString("pnumero_hijos_comun"),
                        rs.getString("plugar_agresion"),
                        rs.getString("ptipo_de_violencia"),
                        rs.getDate("pfecha_agresion"),
                        rs.getString("phora_de_agresion"),
                        rs.getString("pmedidas_de_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pobservaciones"),
                        rs.getString("pboletas_de_remision"),
                        rs.getInt("pid")
                );
                
                /*OUT  date, 
                                                                     OUT pdenunciante character varying, 
                                                                     OUT  character varying, 
                                                                     OUT  character varying, 
                                                                     OUT  character varying, 
                                                                     OUT px double precision, 
                                                                     OUT py double precision, 
                                                                     OUT pcircuito character varying, 
                                                                     OUT pcodigo_circuito character varying, 
                                                                     OUT psubcircuito character varying, 
                                                                     OUT pcodigo_subcircuito character varying, 
                                                                     OUT pdomiciliado_victima character varying, 
                                                                     OUT pedad_victima integer, 
                                                                     OUT pestado_civil_victima character varying, 
                                                                     OUT pnivel_de_instruccion_victima character varying, 
                                                                     OUT pocupacion character varying, 
                                                                     OUT pagresor character varying, 
                                                                     OUT psexo_agresor character varying, 
                                                                     OUT pdireccion_agresor character varying, 
                                                                     OUT pedad_agresor character varying, 
                                                                     OUT pdomiciliado_agresor character varying, 
                                                                     OUT pestado_civil_agresor character varying, 
                                                                     OUT pnivel_de_instruccion_agresor character varying, 
                                                                     OUT pocupacion_agresor character varying, 
                                                                     OUT pparentesco_victima_agresor character varying, 
                                                                     OUT pnumero_hijos_comun character varying, 
                                                                     OUT plugar_agresion character varying, 
                                                                     OUT ptipo_de_violencia character varying, 
                                                                     OUT pfecha_agresion date, 
                                                                     OUT phora_de_agresion character varying, 
                                                                     OUT pmedidas_de_amparo character varying, 
                                                                     OUT psentencia character varying, 
                                                                     OUT papelacion character varying, 
                                                                     OUT pboletas_anteriores character varying, 
                                                                     OUT pobservaciones character varying, 
                                                                     OUT pboletas_de_remision character varying, 
                                                                     OUT pid integer)
  RETURNS SETOF record AS*/
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Vif_2012_2> ObtenerDatos() throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012_2> ObtenerDatosDadoParentesco(String parentesco) throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
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

    public static ArrayList<Vif_2012_2> ObtenerDatosParentesco() throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_2_parentesco()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012_2> ObtenerDatosParentescoSexo(String parentesco, String sexo) throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_2_dado_parentesco_sexo_victima(?,?)";
            lstP.add(new Parametro(1, parentesco));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012_2> ObtenerDatosDiaAgresionSexo(String parentesco, String sexo) throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_2_dado_parentesco_sexo_victima(?,?)";
            lstP.add(new Parametro(1, parentesco));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
       public static ArrayList<Vif_2012_2> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Vif_2012_2> lst = new ArrayList<Vif_2012_2>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * geoportal.f_select_vif_2012_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

}
