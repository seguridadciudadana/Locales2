/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.Parametro;
import accesodatos.ConjuntoResultado;
import java.util.ArrayList;
import geoportal.logica.clases.Vif_2012;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny Cudco
 */
public class FVif_2012 {

    public static ArrayList<Vif_2012> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        Vif_2012 datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2012(rs.getDate("pfecha_denuncia"),
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
                        rs.getString("pnumeros_hijos_comun"),
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
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    
    public static ArrayList<Vif_2012> ObtenerDatos() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif2012()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
