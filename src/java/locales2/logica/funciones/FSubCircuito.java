
package locales2.logica.funciones;
import locales2.logica.clases.SubCircuito;
import java.util.*;
import accesodatos.*;


public class FSubCircuito {
    
    public static List<SubCircuito> obtenerSubCircuito(){
        ArrayList<SubCircuito> lst= new ArrayList<SubCircuito>();
        String sql="SELECT id_subcircuito, codigo_subcircuito, descripcion, id_circuito FROM vif.subcircuito;";

        try{
            ConjuntoResultado cres= AccesoDatos.ejecutaQuery(sql);
            SubCircuito cir;
            while(cres.next()){
            cir = new SubCircuito();
            cir.setId_subcircuito(cres.getInt(1));
            cir.setCodigo_subcircuito(cres.getString(2));
            cir.setDescripcion(cres.getString(3));
            cir.setId_circuito(FCircuito.obtenerCircuitoCodigo(cres.getInt(4)));
           lst.add(cir);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    return lst;
    }
    
    public static SubCircuito obtenerSubCircuitoCodigo(int codigo){
        SubCircuito sub=null;
        String sql= "SELECT id_subcircuito, codigo_subcircuito, descripcion, id_circuito FROM vif.subcircuito where id_subcircuito=?;";
        try {
             ArrayList<Parametro> lstPar= new ArrayList<Parametro>();
            lstPar.add(new Parametro(1,codigo));
            ConjuntoResultado cres= AccesoDatos.ejecutaQuery(sql,lstPar);           
            while(cres.next()){
                sub= new SubCircuito();
                sub.setId_subcircuito(cres.getInt(1));
                sub.setCodigo_subcircuito(cres.getString(2)); 
                sub.setDescripcion(cres.getString(3));
                sub.setId_circuito(FCircuito.obtenerCircuitoCodigo(cres.getInt(4)));
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sub;
    } 
}
