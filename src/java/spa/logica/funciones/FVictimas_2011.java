/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.sql.SQLException;
import java.util.ArrayList;
import spa.logica.clases.Victimas_2011;

/**
 *
 * @author Geovanny Cudco
 */
public class FVictimas_2011 {

    public static ArrayList<Victimas_2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        Victimas_2011 datos = null;
        try {
            while (rs.next()) {
                datos = new Victimas_2011(
                        rs.getInt("pn_denuncia"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucio"),
                        rs.getDate("pfecha_de_a"),
                        rs.getString("papellidos"),
                        rs.getString("pnombres"),
                        rs.getInt("pedad"),
                        rs.getString("psexo"),
                        rs.getString("pinstruccion"),
                        rs.getInt("panios"),
                        rs.getString("pestado_civ"),
                        rs.getString("pocupacion"),
                        rs.getInt("ptelefono"),
                        rs.getString("pcanton_dom"),
                        rs.getString("pparroquia"),
                        rs.getString("pcalles"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcod_circui"),
                        rs.getString("psubcircuit"),
                        rs.getString("pcod_subcir"),
                        rs.getString("pdireccion"),
                        rs.getString("ptelefono_t"),
                        rs.getString("ptipos_de_a"),
                        rs.getString("pfrecuencia"),
                        rs.getString("plugar_de_l"),
                        rs.getDate("pfecha_agre"),
                        rs.getString("phora_agres"),
                        rs.getString("pasociacion"),
                        rs.getString("pobjeto_de"),
                        rs.getString("pestado_de"),
                        rs.getString("prelacion_d"),
                        rs.getString("ptratamient"),
                        rs.getString("pcaso_medic"),
                        rs.getString("preferido")
                );
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

     public static ArrayList<Victimas_2011> ObtenerDatos() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
    
    
    
    
}
