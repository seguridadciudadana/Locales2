/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.funciones.crud;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import recursos.Parroquia;


/**
 *
 * @author ICITS SALA5
 */
public class FParroquiaCrud {
    
 public static ArrayList<Parroquia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Parroquia> lst = new ArrayList<Parroquia>();
        Parroquia parroquia = null;
        try {
            while (rs.next()) {
                parroquia = new Parroquia(
                        rs.getInt("pid_parroquia"),
                        rs.getString("pnombre_parroquia"),
                        rs.getString("pdescripcion"),
                        FCantonCrud.obtenerZonaDadoId(rs.getInt("pid_canton"))
                        
                );
                lst.add(parroquia);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Parroquia> obtenerParroquia() throws Exception {
        ArrayList<Parroquia> lst = new ArrayList<Parroquia>();
        try {
            String sql = "select * from  utiles.f_select_parroquia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static Parroquia obtenerZonaDadoId(int id_parroquia) throws Exception {
        Parroquia lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_select_parroquia_dado_id(?)";
            lstP.add(new Parametro(1,  id_parroquia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new  Parroquia();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarZona(Parroquia parroquia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_insert_parroquia(?,?,?)";
            lstP.add(new Parametro(1, parroquia.getNombre_parroquia()));
            lstP.add(new Parametro(2, parroquia.getDescripcion_parroquia()));
           lstP.add(new Parametro(3, parroquia.getId_canton().getId_canton()));         
              
            
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

    public static boolean actualizarParroquia(Parroquia parroquia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_update_parroquia(?,?,?,?)";
            lstP.add(new Parametro(1, parroquia.getNombre_parroquia()));
            lstP.add(new Parametro(2, parroquia.getDescripcion_parroquia()));
           lstP.add(new Parametro(3, parroquia.getId_canton().getId_canton())); 
           lstP.add(new Parametro(4, parroquia.getId_parroquia()));
           
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
        return eje;
    }

    public static boolean eliminarParroquia(int id_parroquia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_delete_parroquia(?)";
            lstP.add(new Parametro(1, id_parroquia));
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
