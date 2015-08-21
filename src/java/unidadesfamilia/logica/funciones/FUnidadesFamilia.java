/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.sql.SQLException;
import java.util.ArrayList;
import unidadesfamilia.logica.clases.UnidadesFamilia;

/**
 *
 * @author Oscunach
 */
public class FUnidadesFamilia {

    public static ArrayList<UnidadesFamilia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        UnidadesFamilia datos = null;
        try {
            while (rs.next()) {
                datos = new UnidadesFamilia(
                        rs.getInt("pid"),
                        rs.getString("pfecha_de_recepcion"),
                        rs.getString("psexo_agresor"),
                        rs.getString("psexo_victima"),
                        rs.getString("pbarrio_agresor"),
                        rs.getString("pbarrio_victima"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pedad_victima"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getInt("pnumero_de_hijos"),
                        rs.getString("plugar_agresion"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcircuito"),
                        rs.getString("ptipo_de_violencia"),
                        rs.getString("pfecha_agresion"),
                        rs.getString("pmedidas_de_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pboletas_de_remision"),
                        rs.getString("pobservaciones")
                );

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    
    public static ArrayList<UnidadesFamilia> ObtenerDatos() throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            String sql = "select * from geoportal_unidades_familia.f_select_unidades_familia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
    
}
