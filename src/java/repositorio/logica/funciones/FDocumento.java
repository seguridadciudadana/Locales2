/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.logica.funciones;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import master.logica.funciones.FUsuario;
import repositorio.logica.clases.Documento;

/**
 *
 * @author Oscunach
 */
public class FDocumento {
    
    public static ArrayList<Documento> llenarDocumento(ConjuntoResultado rs) throws Exception {
        ArrayList<Documento> lst = new ArrayList<Documento>();
        Documento texto = null;
        try {
            while (rs.next()) {
                texto = new Documento(rs.getInt("pcodigo"),
                        rs.getString("ptitulo"),
                        rs.getString("ppath"),
                        rs.getString("ptipo"),
                        rs.getString("pkeywords"),
                        rs.getInt("pestado"),
                        FUsuario.ObtenerUsuarioDadoCodigo(rs.getInt("pcodigo_usuario")),
                        rs.getDate("pfecha_registro")
                );
                lst.add(texto);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<Documento> obtenerDocumentos() throws Exception {
        ArrayList<Documento> lst = new ArrayList<Documento>();
        try {
            String sql = "select * from digitales.f_select_documento()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDocumento(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static boolean insertar(Documento documento) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from digitales.f_insert_documento(?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, documento.getTitulo()));
            lstP.add(new Parametro(2, documento.getPath()));
            lstP.add(new Parametro(3, documento.getTipo()));
            lstP.add(new Parametro(4, documento.getKeywords()));            
            lstP.add(new Parametro(5, documento.getEstado()));
            lstP.add(new Parametro(6, documento.getCodigo_usuario().getCodigo()));
            lstP.add(new Parametro(7, documento.getFecha_registro()));
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
    
    public static boolean actualizar(Documento documento) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from digitales.f_update_documento(?,?,?,?,?,?,?,?,?)";
             lstP.add(new Parametro(1, documento.getTitulo()));
             lstP.add(new Parametro(2, documento.getPath()));
             lstP.add(new Parametro(3, documento.getTipo()));
             lstP.add(new Parametro(4, documento.getKeywords()));             
             lstP.add(new Parametro(5, documento.getEstado()));
             lstP.add(new Parametro(6, documento.getCodigo_usuario().getCodigo()));
             lstP.add(new Parametro(7, documento.getFecha_registro()));
             lstP.add(new Parametro(8, documento.getCodigo()));
            
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
    
    public static boolean eliminar(Documento documento) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from digitales.f_delete_documento(?)";
            lstP.add(new Parametro(1, documento.getCodigo()));
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
