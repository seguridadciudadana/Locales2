/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.funciones.crud;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import vif.logica.clases.Agresor;
import vif.logica.clases.FichaVif;
import static vif.logica.funciones.FAgresor.llenarAgresor;

/**
 *
 * @author Oscunach
 */
public class FFichasVifCrud {

    //llenar ficha

    public static ArrayList<FichaVif> llenarFicha(ConjuntoResultado rs) throws Exception {
        ArrayList<FichaVif> lst = new ArrayList<FichaVif>();
        FichaVif fichavif = null;

        try {
            while (rs.next()) {
                fichavif = new FichaVif(
                        rs.getInt("pid_ficha"),
                        rs.getString("pnombres_victima"),
                        rs.getString("papellidos_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getString("pdomiciliado_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pnivel_instruccion_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pnivel_instruccion_agresor"),
                        rs.getString("pocupaccion_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getInt("pnumero_hijos_comun"),
                        rs.getString("ptiempo_convivencia"),
                        rs.getString("plugar_agresion"),
                        rs.getString("ptipo_violencia"),
                        rs.getDate("pfecha_agresion"),
                        rs.getTime("phora_agresion"),
                        rs.getString("preincidencia_agresion"),
                        rs.getString("pobjeto_agresion"),
                        rs.getString("pestado_conciencia_agresor"),
                        rs.getString("pdireccion_agresion"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getDate("pfecha_denuncia"),
                        rs.getString("pdenunciante"),
                        rs.getString("pmedidas_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pobservaciones"),
                        rs.getString("pboletas_remision")
                );

                lst.add(fichavif);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }

        return lst;
    }
        //obtener ficha
    public static ArrayList<FichaVif> obtenerFichas() throws Exception {
        ArrayList<FichaVif> lst = new ArrayList<FichaVif>();

        try {
            String sql = "select * from vif.f_select_ficha()";
            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarFicha(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
        //insertar ficha falta completar 
//    public static boolean insertar(FichaVif ficha) throws Exception {
//        boolean eje = false;
//        try {
//            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
//            String sql = "select * from vif.f_insert_ficha(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            lstP.add(new Parametro(1, agresor.getCedula_identidad()));
//            lstP.add(new Parametro(2, agresor.getPnombres()));
//            lstP.add(new Parametro(3, agresor.getPapellidos()));
//            lstP.add(new Parametro(4, agresor.getSexo()));
//            lstP.add(new Parametro(5, agresor.getDireccion()));
//            lstP.add(new Parametro(6, agresor.getPdomiciliado()));
//            lstP.add(new Parametro(7, agresor.getEdad()));
//            lstP.add(new Parametro(8, agresor.getEstado_civil()));
//            lstP.add(new Parametro(9, agresor.getNivel_educacion()));
//            lstP.add(new Parametro(10, agresor.getOcupacion()));
//            
//            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
//            while (rs.next()) {
//                if (rs.getString(0).equals("true"));
//                eje = true;
//            }
//        } catch (SQLException exConec) {
//            throw new Exception(exConec.getMessage());
//        }
//        return eje;
//    }


}
