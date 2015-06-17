/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import geoportal.logica.clases.Vif_2012_spa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FVif_2012_spa {

    public static ArrayList<Vif_2012_spa> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2012_spa> lst = new ArrayList<Vif_2012_spa>();
        Vif_2012_spa datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2012_spa(
                        rs.getInt("pn_caso"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucion"),
                        rs.getDate("pfecha_atencion"),
                        rs.getString("papellidos_victima"),
                        rs.getString("pnombres_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getInt("panios_cursados"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("ptelefono_victima"),
                        rs.getString("pdomiciliado_canton"),
                        rs.getString("pdomiciliado_parroquia"),
                        rs.getString("pdomiciliado_calles"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("pdireccion_trabajo_victima"),
                        rs.getString("ptelefono_trabajo_victima"),
                        rs.getString("ptipo_agresion"),
                        rs.getString("pfrecuencia_agresion"),
                        rs.getString("plugar_agresion"),
                        rs.getDate("pfecha_agresion"),
                        rs.getString("phora_agresion"),
                        rs.getString("pasociacion_agresion"),
                        rs.getString("pobjeto_agresion"),
                        rs.getString("pestado_conciencia_agresor"),
                        rs.getString("papellidos_agresor"),
                        rs.getString("pnombres_agresor"),
                        rs.getString("pedad_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("panios_cursados_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pdireccion_trabajo_agresor"),
                        rs.getString("ptelefono_agresor"),
                        rs.getString("prelacion_con_victima"),
                        rs.getString("ptratamiento_recibido"),
                        rs.getString("pcaso_medico"),
                        rs.getString("preferido"),
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
    
    public static ArrayList<Vif_2012_spa> ObtenerDatos() throws Exception {
        ArrayList<Vif_2012_spa> lst = new ArrayList<Vif_2012_spa>();
        try {
            String sql = "select * from geoportal.select_vif_2012_1ra_acogida_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
