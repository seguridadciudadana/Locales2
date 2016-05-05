package locales2.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import locales2.logica.clases.*;
import vif.logica.clases.*;
import vif.logica.funciones.*;
import locales2.logica.clases.FichaLocales;
import vif.logica.funciones.FCircuito;
import vif.logica.funciones.FSubcircuito;

public class FFichaLocales {

    //Fecha 05-05-2016
    public static ArrayList<FichaLocales> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<FichaLocales> lst = new ArrayList<FichaLocales>();
        FichaLocales datos = null;
        try {
            while (rs.next()) {
                datos = new FichaLocales(rs.getInt(null),
                        rs.getString("pparroquia"), 
                        rs.getString("pbarrio"), 
                        FCircuito.ObtenerCircuitoDadoId(rs.getInt("")),
                        FSubcircuito.ObtenerSubcircuitoDadoId(rs.getInt("")), 
                        rs.getString("pestado_local"), 
                        rs.getString("prazon_social"), 
                        rs.getInt("pcategoria"), 
                        rs.getString("ptipo_establecimiento"), 
                        rs.getString("pdireccion_establecimiento"), 
                        rs.getString("pnombre_propietario"), 
                        rs.getString("pcedula_propietario"), 
                        rs.getString("ptelefono_propietario"), 
                        rs.getDouble("px_local"),
                        rs.getDouble("py_local"), 
                        rs.getString("ppermiso_municipio"), 
                        rs.getString("ppermiso_bomberos"), 
                        rs.getString("ppermiso_mds"), 
                        rs.getString("ppermiso_mi"), 
                        rs.getString("ppermiso_lt"), 
                        rs.getString("psri"), 
                        rs.getString("phora_inicio_diurno"), 
                        rs.getString("phora_fin_diurno"), 
                        rs.getString("phora_inicio_nocturno"), 
                        rs.getString("phora_fin_nocturno"), 
                        rs.getString("pobservaciones_hora"), 
                        rs.getString("pterrenos_valdios"), 
                        rs.getString("pespacios_abiertos"), 
                        rs.getString("pespecificaciones_entorno"), 
                        rs.getString("pvisualizacion"), 
                        rs.getString("piluminacion"), 
                        rs.getString("pentrada_salida_emergencia"), 
                        rs.getString("pescondites"), 
                        rs.getString("plimpieza"), 
                        rs.getString("psenializado"), 
                        rs.getString("pextintores"), 
                        rs.getString("pobservaciones_sistema_emergencia"), 
                        rs.getString("psistema_seguridad"), 
                        rs.getString("ptipo_sistema_seguridad"), 
                        rs.getString("pobservaciones_sistema_seguridad"), 
                        rs.getString("pinstitucion_educativa"), 
                        rs.getInt("pdistancia_local_centro_educativo"), 
                        rs.getString("pdireccion"), 
                        rs.getDouble("px_centro_educativo"),
                        rs.getDouble("py_centro_educativo"),
                        rs.getString("pnombre_encuestada"),
                        rs.getString("pcedula_encuestada"),
                        rs.getString("ptelefono_encuestada"),
                        rs.getString("psugerencia_encuestada"),
                        rs.getString("observaciones_generales"));
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    
    
    public static boolean insertarFichasLocales(FichaLocales fichasLocales) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from locales2.f_insert_ficha(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, fichasLocales.getParroquia()));
            lstP.add(new Parametro(2, fichasLocales.getBarrio()));
            lstP.add(new Parametro(3, fichasLocales.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(4, fichasLocales.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(5, fichasLocales.getEstado_local()));
            lstP.add(new Parametro(6, fichasLocales.getRazon_social()));
            lstP.add(new Parametro(7, fichasLocales.getCategoria()));
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
