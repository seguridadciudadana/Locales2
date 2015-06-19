/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import denunciasfiscalia.logica.clases.Fiscalia_2011;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FFiscalia_2011 {

    public static ArrayList<Fiscalia_2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Fiscalia_2011> lst = new ArrayList<Fiscalia_2011>();
        Fiscalia_2011 datos = null;
        try {
            while (rs.next()) {
                datos = new Fiscalia_2011(
                        rs.getDate("pfecha_denuncia"),
                        rs.getString("pnombres_denunciante"),
                        rs.getString("pnombres_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getString("pdomiciliado_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("pnombres_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pocupacio_agresor"),
                        rs.getString("pparentesco_agresor_victima"),
                        rs.getString("pnumero_hijos"),
                        rs.getString("pdireccion_agresion"),
                        rs.getString("ptipo_agresion"),
                        rs.getDate("pfecha_agrecion"),
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

    public static ArrayList<Fiscalia_2011> ObtenerDatos() throws Exception {
        ArrayList<Fiscalia_2011> lst = new ArrayList<Fiscalia_2011>();
        try {
            String sql = "select * from geoportal.select_vif_2011_fiscalia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
}
