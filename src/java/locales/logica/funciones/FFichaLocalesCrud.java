/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import locales.logica.clases.FichasLocales;
import master.logica.funciones.FUsuario;
import recursos.funciones.crud.FCantonCrud;
import recursos.funciones.crud.FParroquiaCrud;
import recursos.funciones.crud.FProvinciaCrud;
import vif.logica.funciones.FCircuito;
import vif.logica.funciones.FSubcircuito;

/**
 *
 * @author ICITS SALA5
 */
public class FFichaLocalesCrud {

    public static ArrayList<FichasLocales> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<FichasLocales> lst = new ArrayList<FichasLocales>();
        FichasLocales fichasLocales = null;
        try {
            while (rs.next()) {
                fichasLocales = new FichasLocales(
                        rs.getInt("id_ficha"),
                        rs.getInt("carga_trabajo"),
                        rs.getInt("grupo"),
                        FUsuario.ObtenerUsuarioDadoCodigo(rs.getInt("pid_usuario")),
                        FProvinciaCrud.obtenerProvinciaDadoId(rs.getInt("pid_provincia")),
                        FCantonCrud.obtenerZonaDadoId(rs.getInt("pid_canton")),
                        FParroquiaCrud.obtenerZonaDadoId(rs.getInt("pid_parroquia")),
                        rs.getInt("zona"),
                        rs.getInt("sector"),
                        rs.getInt("manzana"),
                        rs.getInt("formulario"),
                        rs.getString("direccion"),
                        rs.getString("barrio"),
                        FCircuito.ObtenerCircuitoDadoId(rs.getInt("pid_circuito")),
                        FSubcircuito.ObtenerSubcircuitoDadoId(rs.getInt("pid_subcircuito")),
                        rs.getInt("categoria"),
                        rs.getString("razon_social"),
                        rs.getString("tipo_establecimiento"),
                        rs.getString("nombre_propietario"),
                        rs.getString("cedula_cuidadania"),
                        rs.getInt("permiso_municipio"),
                        rs.getInt("permiso_bombero"),
                        rs.getInt("permiso_msp"),
                        rs.getInt("permiso_mi"),
                        rs.getString("horario_diurno"),
                        rs.getString("horario_noctuno"),
                        rs.getString("observacion_horario"),
                        rs.getInt("terrenos_valdios"),
                        rs.getInt("espacio_abiertos"),
                        rs.getString("observacion_entorno_visual"),
                        rs.getInt("visualizacion_interna"),
                        rs.getInt("iluminacion"),
                        rs.getInt("entrada_salidasemergencia"),
                        rs.getInt("escondites"),
                        rs.getInt("limpieza_local"),
                        rs.getInt("senializacion"),
                        rs.getInt("extintor"),
                        rs.getString("observacion_emergenciapxley"),
                        rs.getInt("sistema_seguridad"),
                        rs.getInt("tipo_sseg"),
                        rs.getString("observacio_seguridad"),
                        rs.getString("nombre_unidadeducativa"),
                        rs.getDouble("distancia"),
                        rs.getString("direccion_ie"),
                        rs.getString("observaciones_generales")
                );
                lst.add(fichasLocales);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<FichasLocales> obtenerFichasLocales() throws Exception {
        ArrayList<FichasLocales> lst = new ArrayList<FichasLocales>();
        try {
            String sql = "select * from  locales.f_select_ficha()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static FichasLocales obtenerFichasLocalesDadoId(int id_ficha) throws Exception {
        FichasLocales lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_select_ficha_dado_codig(?)";
            lstP.add(new Parametro(1, id_ficha));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new FichasLocales();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarFichasLocales(FichasLocales fichasLocales) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_insert_ficha(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, fichasLocales.getCarga_trabajo()));
            lstP.add(new Parametro(2, fichasLocales.getGrupo()));
            lstP.add(new Parametro(3, fichasLocales.getId_usuario().getCodigo()));
            lstP.add(new Parametro(4, fichasLocales.getId_provincia().getId_provincia()));
            lstP.add(new Parametro(5, fichasLocales.getId_canton().getId_canton()));
            lstP.add(new Parametro(6, fichasLocales.getId_parroquia().getId_parroquia()));
            lstP.add(new Parametro(7, fichasLocales.getZona()));
            lstP.add(new Parametro(8, fichasLocales.getSector()));
            lstP.add(new Parametro(9, fichasLocales.getManzana()));
            lstP.add(new Parametro(10, fichasLocales.getFormulario()));
            lstP.add(new Parametro(11, fichasLocales.getDireccion()));
            lstP.add(new Parametro(12, fichasLocales.getBarrio()));
            lstP.add(new Parametro(13, fichasLocales.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(14, fichasLocales.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(15, fichasLocales.getCategoria()));
            lstP.add(new Parametro(16, fichasLocales.getRazon_social()));
            lstP.add(new Parametro(17, fichasLocales.getTipo_establecimiento()));
            lstP.add(new Parametro(18, fichasLocales.getNombre_propietario()));
            lstP.add(new Parametro(19, fichasLocales.getCedula_cuidadania()));
            lstP.add(new Parametro(20, fichasLocales.getPermiso_municipio()));
            lstP.add(new Parametro(21, fichasLocales.getPermiso_bombero()));
            lstP.add(new Parametro(22, fichasLocales.getPermiso_msp()));
            lstP.add(new Parametro(23, fichasLocales.getPermiso_mi()));
            lstP.add(new Parametro(24, fichasLocales.getHorario_diurno()));
            lstP.add(new Parametro(25, fichasLocales.getHorario_noctuno()));
            lstP.add(new Parametro(26, fichasLocales.getObservacion_horario()));
            lstP.add(new Parametro(27, fichasLocales.getTerrenos_valdios()));
            lstP.add(new Parametro(28, fichasLocales.getEspacio_abiertos()));
            lstP.add(new Parametro(29, fichasLocales.getObservacion_entorno_visual()));
            lstP.add(new Parametro(30, fichasLocales.getVisualizacion_interna()));
            lstP.add(new Parametro(31, fichasLocales.getIluminacion()));
            lstP.add(new Parametro(32, fichasLocales.getEntrada_salidasemergencia()));
            lstP.add(new Parametro(33, fichasLocales.getEscondites()));
            lstP.add(new Parametro(34, fichasLocales.getLimpieza_local()));
            lstP.add(new Parametro(35, fichasLocales.getSenializacion()));
            lstP.add(new Parametro(36, fichasLocales.getExtintor()));
            lstP.add(new Parametro(37, fichasLocales.getObservacion_emergenciapxley()));
            lstP.add(new Parametro(38, fichasLocales.getSistema_seguridad()));
            lstP.add(new Parametro(39, fichasLocales.getTipo_sseg()));
            lstP.add(new Parametro(40, fichasLocales.getObservacio_seguridad()));
            lstP.add(new Parametro(41, fichasLocales.getNombre_unidadeducativa()));
            lstP.add(new Parametro(42, fichasLocales.getDistancia()));
            lstP.add(new Parametro(43, fichasLocales.getDireccion_ie()));
            lstP.add(new Parametro(44, fichasLocales.getObservaciones_generales()));

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

    public static boolean actualizarFichasLocales(FichasLocales fichasLocales) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_update_ficha(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, fichasLocales.getCarga_trabajo()));
            lstP.add(new Parametro(2, fichasLocales.getGrupo()));
            lstP.add(new Parametro(3, fichasLocales.getId_usuario().getCodigo()));
            lstP.add(new Parametro(4, fichasLocales.getId_provincia().getId_provincia()));
            lstP.add(new Parametro(5, fichasLocales.getId_canton().getId_canton()));
            lstP.add(new Parametro(6, fichasLocales.getId_parroquia().getId_parroquia()));
            lstP.add(new Parametro(7, fichasLocales.getZona()));
            lstP.add(new Parametro(8, fichasLocales.getSector()));
            lstP.add(new Parametro(9, fichasLocales.getManzana()));
            lstP.add(new Parametro(10, fichasLocales.getFormulario()));
            lstP.add(new Parametro(11, fichasLocales.getDireccion()));
            lstP.add(new Parametro(12, fichasLocales.getBarrio()));
            lstP.add(new Parametro(13, fichasLocales.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(14, fichasLocales.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(15, fichasLocales.getCategoria()));
            lstP.add(new Parametro(16, fichasLocales.getRazon_social()));
            lstP.add(new Parametro(17, fichasLocales.getTipo_establecimiento()));
            lstP.add(new Parametro(18, fichasLocales.getNombre_propietario()));
            lstP.add(new Parametro(19, fichasLocales.getCedula_cuidadania()));
            lstP.add(new Parametro(20, fichasLocales.getPermiso_municipio()));
            lstP.add(new Parametro(21, fichasLocales.getPermiso_bombero()));
            lstP.add(new Parametro(22, fichasLocales.getPermiso_msp()));
            lstP.add(new Parametro(23, fichasLocales.getPermiso_mi()));
            lstP.add(new Parametro(24, fichasLocales.getHorario_diurno()));
            lstP.add(new Parametro(25, fichasLocales.getHorario_noctuno()));
            lstP.add(new Parametro(26, fichasLocales.getObservacion_horario()));
            lstP.add(new Parametro(27, fichasLocales.getTerrenos_valdios()));
            lstP.add(new Parametro(28, fichasLocales.getEspacio_abiertos()));
            lstP.add(new Parametro(29, fichasLocales.getObservacion_entorno_visual()));
            lstP.add(new Parametro(30, fichasLocales.getVisualizacion_interna()));
            lstP.add(new Parametro(31, fichasLocales.getIluminacion()));
            lstP.add(new Parametro(32, fichasLocales.getEntrada_salidasemergencia()));
            lstP.add(new Parametro(33, fichasLocales.getEscondites()));
            lstP.add(new Parametro(34, fichasLocales.getLimpieza_local()));
            lstP.add(new Parametro(35, fichasLocales.getSenializacion()));
            lstP.add(new Parametro(36, fichasLocales.getExtintor()));
            lstP.add(new Parametro(37, fichasLocales.getObservacion_emergenciapxley()));
            lstP.add(new Parametro(38, fichasLocales.getSistema_seguridad()));
            lstP.add(new Parametro(39, fichasLocales.getTipo_sseg()));
            lstP.add(new Parametro(40, fichasLocales.getObservacio_seguridad()));
            lstP.add(new Parametro(41, fichasLocales.getNombre_unidadeducativa()));
            lstP.add(new Parametro(42, fichasLocales.getDistancia()));
            lstP.add(new Parametro(43, fichasLocales.getDireccion_ie()));
            lstP.add(new Parametro(44, fichasLocales.getObservaciones_generales()));
            lstP.add(new Parametro(45, fichasLocales.getId_ficha()));

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

    public static boolean eliminarFichaLocales(int id_ficha) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales.f_delete_ficha(?)";
            lstP.add(new Parametro(1, id_ficha));
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
