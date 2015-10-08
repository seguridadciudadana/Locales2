/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.funciones;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import vif.logica.clases.Agresor;

/**
 *
 * @author Virt-ICITS-2
 */
public class FAgresor {
    
    //llenar datos
    public static ArrayList<Agresor> llenarAgresor(ConjuntoResultado rs) throws Exception {
        ArrayList<Agresor> lst = new ArrayList<Agresor>();
        Agresor agresor = null;

        try {
            while (rs.next()) {
                agresor = new Agresor(rs.getInt("pid_agresor"), rs.getString("pcedula_identidad"), rs.getString("pnombres"),
                        rs.getString("papellidos"), rs.getString("psexo"), rs.getString("pdireccion"),
                        rs.getString("pdomiciliado"), rs.getInt("pedad"), rs.getString("pestado_civil"),
                        rs.getString("pnivel_educacion"), rs.getString("pocupacion")
                );

                lst.add(agresor);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }

        return lst;
    }
    
    //obtener agresor    
    public static ArrayList<Agresor> ObtenerAgresor() throws Exception {
        ArrayList<Agresor> lst = new ArrayList<Agresor>();

        try {
            String sql = "select * from vif.f_select_agresor()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarAgresor(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    //insertar agresor   
    public static boolean Insertar(Agresor agresor) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_insert_agresor(?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, agresor.getCedula_identidad()));
            lstP.add(new Parametro(2, agresor.getPnombres()));
            lstP.add(new Parametro(3, agresor.getPapellidos()));
            lstP.add(new Parametro(4, agresor.getSexo()));
            lstP.add(new Parametro(5, agresor.getDireccion()));
            lstP.add(new Parametro(6, agresor.getPdomiciliado()));
            lstP.add(new Parametro(7, agresor.getEdad()));
            lstP.add(new Parametro(8, agresor.getEstado_civil()));
            lstP.add(new Parametro(9, agresor.getNivel_educacion()));
            lstP.add(new Parametro(10, agresor.getOcupacion()));
            
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
    
    
    //editar agresor
    public static boolean editarAgresor(Agresor agresor) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            
            String sql = "select * from vif.f_update_agresor(?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, agresor.getCedula_identidad()));
            lstP.add(new Parametro(2, agresor.getPnombres()));
            lstP.add(new Parametro(3, agresor.getPapellidos()));
            lstP.add(new Parametro(4, agresor.getSexo()));
            lstP.add(new Parametro(5, agresor.getDireccion()));
            lstP.add(new Parametro(6, agresor.getPdomiciliado()));
            lstP.add(new Parametro(7, agresor.getEdad()));
            lstP.add(new Parametro(8, agresor.getEstado_civil()));
            lstP.add(new Parametro(9, agresor.getNivel_educacion()));
            lstP.add(new Parametro(10, agresor.getOcupacion()));
            lstP.add(new Parametro(11, agresor.getId_agresor()));
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
    
     public static  boolean eliminarAgresor (int vid) throws  Exception
    {
        boolean eje=false;
         try
        {
        ArrayList<Parametro> lstP = new ArrayList<Parametro>();
        String sql = "select * from vif.f_delete_agresor(?)";
        lstP.add(new Parametro(1,vid));
        ConjuntoResultado rs= AccesoDatos.ejecutaQuery(sql,lstP);
        while(rs.next() )
            {
              if(rs.getString(0).equals("true"));
                   eje=true;
            }
            } catch (SQLException exConec) {
               throw  new Exception(exConec.getMessage());
         }
          return eje;
    }
    
    
     public static Agresor ObtenerAgresorDadoId(int id) throws Exception {
        Agresor lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_select_agresor_dado_id(?)";
            lstP.add(new Parametro(1, id));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Agresor();
            lst = llenarAgresor(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
     
     
     
}
