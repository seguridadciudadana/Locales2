/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import spa.logica.clases.Global;

/**
 *
 * @author Oscunach
 */
public class FServiciosGlobal {

    public static ArrayList<Global> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        Global datos = null;
        try {
            while (rs.next()) {
                datos = new Global(
                        rs.getInt("pcodigo"),
                        rs.getInt("pnumero_ficha"),
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
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("ptelefono_victima"),
                        rs.getString("pcanton_domicilio_victima"),
                        rs.getString("pparroquia_domicilio_victima"),
                        rs.getString("pdireccion_domicilio_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pdireccion_trabajo_victima"),
                        rs.getString("ptelefono_trabajo_victima"),
                        rs.getString("ptipo_agresion"),
                        rs.getString("pfrecuencia_agresion"),
                        rs.getString("plugar_agresion"),
                        rs.getString("pfecha_agresion"),
                        rs.getString("phora_agresion"),
                        rs.getString("pasociacion_agresion"),
                        rs.getString("pobjeto_agresion"),
                        rs.getString("pestado_conciencia_agresion"),
                        rs.getString("papellidos_agresor"),
                        rs.getString("pnombres_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pdireccion_domicilio_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pdireccion_trabajo_agresor"),
                        rs.getString("ptelefono_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getString("ptratamiento"),
                        rs.getString("pcaso_medico"),
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

    public static ArrayList<Global> obtenerDatos() throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarFichaSalaAcogida(Global global) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_insert_global(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, global.getNumero_ficha()));
            lstP.add(new Parametro(2, global.getProvincia()));
            lstP.add(new Parametro(3, global.getCanton()));
            lstP.add(new Parametro(4, global.getBarrio()));
            lstP.add(new Parametro(5, global.getInstitucion()));
            lstP.add(new Parametro(6, global.getFecha_atencion()));
            lstP.add(new Parametro(7, global.getApellidos_victima()));
            lstP.add(new Parametro(8, global.getNombres_victima()));
            lstP.add(new Parametro(9, global.getEdad_victima()));
            lstP.add(new Parametro(10, global.getSexo_victima()));
            lstP.add(new Parametro(11, global.getInstruccion_victima()));
            lstP.add(new Parametro(12, global.getEstado_civil_victima()));
            lstP.add(new Parametro(13, global.getOcupacion_victima()));
            lstP.add(new Parametro(14, global.getTelefono_victima()));
            lstP.add(new Parametro(15, global.getCanton_domicilio_victima()));
            lstP.add(new Parametro(16, global.getParroquia_domicilio_victima()));
            lstP.add(new Parametro(17, global.getDireccion_domicilio_victima()));
            lstP.add(new Parametro(18, global.getX()));
            lstP.add(new Parametro(19, global.getY()));
            lstP.add(new Parametro(20, global.getCircuito()));
            lstP.add(new Parametro(21, global.getSubcircuito()));
            lstP.add(new Parametro(22, global.getDireccion_trabajo_victima()));
            lstP.add(new Parametro(23, global.getTelefono_trabajo_victima()));
            lstP.add(new Parametro(24, global.getTipo_agresion()));
            lstP.add(new Parametro(25, global.getFrecuencia_agresion()));
            lstP.add(new Parametro(26, global.getLugar_agresion()));
            lstP.add(new Parametro(27, global.getFecha_agresion()));
            lstP.add(new Parametro(28, global.getHora_agresion()));
            lstP.add(new Parametro(29, global.getAsociacion_agresion()));
            lstP.add(new Parametro(30, global.getObjeto_agresion()));
            lstP.add(new Parametro(31, global.getEstado_conciencia_agresion()));
            lstP.add(new Parametro(32, global.getApellidos_agresor()));
            lstP.add(new Parametro(33, global.getNombres_agresor()));
            lstP.add(new Parametro(34, global.getEdad_agresor()));
            lstP.add(new Parametro(35, global.getSexo_agresor()));
            lstP.add(new Parametro(36, global.getEstado_civil_agresor()));
            lstP.add(new Parametro(37, global.getInstruccion_agresor()));
            lstP.add(new Parametro(38, global.getDireccion_domicilio_agresor()));
            lstP.add(new Parametro(39, global.getOcupacion_agresor()));
            lstP.add(new Parametro(40, global.getDireccion_trabajo_agresor()));
            lstP.add(new Parametro(41, global.getTelefono_agresor()));
            lstP.add(new Parametro(42, global.getParentesco_victima_agresor()));
            lstP.add(new Parametro(43, global.getTratamiento()));
            lstP.add(new Parametro(44, global.getCaso_medico()));
            lstP.add(new Parametro(45, global.getReferido()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static boolean actualizarFichaSalaAcogida(Global global) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_update_global(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, global.getCodigo()));
            lstP.add(new Parametro(2, global.getNumero_ficha()));
            lstP.add(new Parametro(3, global.getProvincia()));
            lstP.add(new Parametro(4, global.getCanton()));
            lstP.add(new Parametro(5, global.getBarrio()));
            lstP.add(new Parametro(6, global.getInstitucion()));
            lstP.add(new Parametro(7, global.getFecha_atencion()));
            lstP.add(new Parametro(8, global.getApellidos_victima()));
            lstP.add(new Parametro(9, global.getNombres_victima()));
            lstP.add(new Parametro(10, global.getEdad_victima()));
            lstP.add(new Parametro(11, global.getSexo_victima()));
            lstP.add(new Parametro(12, global.getInstruccion_victima()));
            lstP.add(new Parametro(13, global.getEstado_civil_victima()));
            lstP.add(new Parametro(14, global.getOcupacion_victima()));
            lstP.add(new Parametro(15, global.getTelefono_victima()));
            lstP.add(new Parametro(16, global.getCanton_domicilio_victima()));
            lstP.add(new Parametro(17, global.getParroquia_domicilio_victima()));
            lstP.add(new Parametro(18, global.getDireccion_domicilio_victima()));
            lstP.add(new Parametro(19, global.getX()));
            lstP.add(new Parametro(20, global.getY()));
            lstP.add(new Parametro(21, global.getCircuito()));
            lstP.add(new Parametro(22, global.getSubcircuito()));
            lstP.add(new Parametro(23, global.getDireccion_trabajo_victima()));
            lstP.add(new Parametro(24, global.getTelefono_trabajo_victima()));
            lstP.add(new Parametro(25, global.getTipo_agresion()));
            lstP.add(new Parametro(26, global.getFrecuencia_agresion()));
            lstP.add(new Parametro(27, global.getLugar_agresion()));
            lstP.add(new Parametro(28, global.getFecha_agresion()));
            lstP.add(new Parametro(29, global.getHora_agresion()));
            lstP.add(new Parametro(30, global.getAsociacion_agresion()));
            lstP.add(new Parametro(31, global.getObjeto_agresion()));
            lstP.add(new Parametro(32, global.getEstado_conciencia_agresion()));
            lstP.add(new Parametro(33, global.getApellidos_agresor()));
            lstP.add(new Parametro(34, global.getNombres_agresor()));
            lstP.add(new Parametro(35, global.getEdad_agresor()));
            lstP.add(new Parametro(36, global.getSexo_agresor()));
            lstP.add(new Parametro(37, global.getEstado_civil_agresor()));
            lstP.add(new Parametro(38, global.getInstruccion_agresor()));
            lstP.add(new Parametro(39, global.getDireccion_domicilio_agresor()));
            lstP.add(new Parametro(40, global.getOcupacion_agresor()));
            lstP.add(new Parametro(41, global.getDireccion_trabajo_agresor()));
            lstP.add(new Parametro(42, global.getTelefono_agresor()));
            lstP.add(new Parametro(43, global.getParentesco_victima_agresor()));
            lstP.add(new Parametro(44, global.getTratamiento()));
            lstP.add(new Parametro(45, global.getCaso_medico()));
            lstP.add(new Parametro(46, global.getReferido()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static boolean eliminarFichaSalaAcogida(int vid) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_delet_global(?)";
            lstP.add(new Parametro(1, vid));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
}
