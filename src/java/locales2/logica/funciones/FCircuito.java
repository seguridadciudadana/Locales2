package locales2.logica.funciones;
 import accesodatos.*;
import locales2.logica.clases.Circuito;
import java.util.*;
public class FCircuito {
    
    public static ArrayList<Circuito> obtenerCircuito(){
        ArrayList<Circuito> lst= new ArrayList<Circuito>();
        String sql="SELECT id_circuito, codigo_circuito, descripcion FROM vif.circuito;";

        try{
            ConjuntoResultado cres= AccesoDatos.ejecutaQuery(sql);
            Circuito cir;
            while(cres.next()){
            cir = new Circuito();
            cir.setId_circuito(cres.getInt(1));
            cir.setCodigo_circuito(cres.getString(2));
            cir.setDescripcion(cres.getString(3));
           lst.add(cir);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    return lst;
    }
    
    
   public static Circuito obtenerCircuitoCodigo(int codigo){
        Circuito cir=null;
        String sql= "SELECT id_circuito, codigo_circuito, descripcion FROM vif.circuito where id_circuito=? ;";
        try {
             ArrayList<Parametro> lstPar= new ArrayList<Parametro>();
            lstPar.add(new Parametro(1,codigo));
            ConjuntoResultado cres= AccesoDatos.ejecutaQuery(sql,lstPar);           
            while(cres.next()){
                cir= new Circuito();
                cir.setId_circuito(cres.getInt(1));
                cir.setCodigo_circuito(cres.getString(2)); 
                cir.setDescripcion(cres.getString(3));
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cir;
    } 
}
