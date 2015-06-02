/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

import java.sql.Date;

/**
 *
 * @author Oscunach
 */
public class Vif_2012_2 {
    private Date pfecha_denuncia;
    private String pdenunciante;
    private String pvictima;
    private String psexo_victima;
    private String pdireccion_victima;
    private double px;
    private double py;
    private String pcircuito;
    private String pcodigo_circuito;
    private String psubcircuito;
    private String pcodigo_subcircuito;
    private String pdomiciliado_victima;
    private int pedad_victima;
    private String pestado_civil_victima;
    private String pnivel_de_instruccion_victima;
    private String pocupacion;
    private String pagresor;
    private String psexo_agresor;
    private String pdireccion_agresor;
    private String pedad_agresor;
    private String pdomiciliado_agresor;
    private String pestado_civil_agresor;
    private String pnivel_de_instruccion_agresor;
    private String pocupacion_agresor;
    private String pparentesco_victima_agresor;
    private String pnumeros_hijos_comun;
    private String plugar_agresion;
    private String ptipo_de_violencia;
    private String pfecha_agresion;
    private String phora_de_agresion;
    private String pmedidas_de_amparo;
    private String psentencia;
    private String papelacion;
    private String pboletas_anteriores;
    private String pobservaciones;    
    private int pid;   

    public Vif_2012_2() {
    }

    public Vif_2012_2(Date pfecha_denuncia, String pdenunciante, String pvictima, String psexo_victima, String pdireccion_victima, double px, double py, String pcircuito, String pcodigo_circuito, String psubcircuito, String pcodigo_subcircuito, String pdomiciliado_victima, int pedad_victima, String pestado_civil_victima, String pnivel_de_instruccion_victima, String pocupacion, String pagresor, String psexo_agresor, String pdireccion_agresor, String pedad_agresor, String pdomiciliado_agresor, String pestado_civil_agresor, String pnivel_de_instruccion_agresor, String pocupacion_agresor, String pparentesco_victima_agresor, String pnumeros_hijos_comun, String plugar_agresion, String ptipo_de_violencia, String pfecha_agresion, String phora_de_agresion, String pmedidas_de_amparo, String psentencia, String papelacion, String pboletas_anteriores, String pobservaciones, int pid) {
        this.pfecha_denuncia = pfecha_denuncia;
        this.pdenunciante = pdenunciante;
        this.pvictima = pvictima;
        this.psexo_victima = psexo_victima;
        this.pdireccion_victima = pdireccion_victima;
        this.px = px;
        this.py = py;
        this.pcircuito = pcircuito;
        this.pcodigo_circuito = pcodigo_circuito;
        this.psubcircuito = psubcircuito;
        this.pcodigo_subcircuito = pcodigo_subcircuito;
        this.pdomiciliado_victima = pdomiciliado_victima;
        this.pedad_victima = pedad_victima;
        this.pestado_civil_victima = pestado_civil_victima;
        this.pnivel_de_instruccion_victima = pnivel_de_instruccion_victima;
        this.pocupacion = pocupacion;
        this.pagresor = pagresor;
        this.psexo_agresor = psexo_agresor;
        this.pdireccion_agresor = pdireccion_agresor;
        this.pedad_agresor = pedad_agresor;
        this.pdomiciliado_agresor = pdomiciliado_agresor;
        this.pestado_civil_agresor = pestado_civil_agresor;
        this.pnivel_de_instruccion_agresor = pnivel_de_instruccion_agresor;
        this.pocupacion_agresor = pocupacion_agresor;
        this.pparentesco_victima_agresor = pparentesco_victima_agresor;
        this.pnumeros_hijos_comun = pnumeros_hijos_comun;
        this.plugar_agresion = plugar_agresion;
        this.ptipo_de_violencia = ptipo_de_violencia;
        this.pfecha_agresion = pfecha_agresion;
        this.phora_de_agresion = phora_de_agresion;
        this.pmedidas_de_amparo = pmedidas_de_amparo;
        this.psentencia = psentencia;
        this.papelacion = papelacion;
        this.pboletas_anteriores = pboletas_anteriores;
        this.pobservaciones = pobservaciones;
        this.pid = pid;
    }

    public Date getPfecha_denuncia() {
        return pfecha_denuncia;
    }

    public void setPfecha_denuncia(Date pfecha_denuncia) {
        this.pfecha_denuncia = pfecha_denuncia;
    }

    public String getPdenunciante() {
        return pdenunciante;
    }

    public void setPdenunciante(String pdenunciante) {
        this.pdenunciante = pdenunciante;
    }

    public String getPvictima() {
        return pvictima;
    }

    public void setPvictima(String pvictima) {
        this.pvictima = pvictima;
    }

    public String getPsexo_victima() {
        return psexo_victima;
    }

    public void setPsexo_victima(String psexo_victima) {
        this.psexo_victima = psexo_victima;
    }

    public String getPdireccion_victima() {
        return pdireccion_victima;
    }

    public void setPdireccion_victima(String pdireccion_victima) {
        this.pdireccion_victima = pdireccion_victima;
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public String getPcircuito() {
        return pcircuito;
    }

    public void setPcircuito(String pcircuito) {
        this.pcircuito = pcircuito;
    }

    public String getPcodigo_circuito() {
        return pcodigo_circuito;
    }

    public void setPcodigo_circuito(String pcodigo_circuito) {
        this.pcodigo_circuito = pcodigo_circuito;
    }

    public String getPsubcircuito() {
        return psubcircuito;
    }

    public void setPsubcircuito(String psubcircuito) {
        this.psubcircuito = psubcircuito;
    }

    public String getPcodigo_subcircuito() {
        return pcodigo_subcircuito;
    }

    public void setPcodigo_subcircuito(String pcodigo_subcircuito) {
        this.pcodigo_subcircuito = pcodigo_subcircuito;
    }

    public String getPdomiciliado_victima() {
        return pdomiciliado_victima;
    }

    public void setPdomiciliado_victima(String pdomiciliado_victima) {
        this.pdomiciliado_victima = pdomiciliado_victima;
    }

    public int getPedad_victima() {
        return pedad_victima;
    }

    public void setPedad_victima(int pedad_victima) {
        this.pedad_victima = pedad_victima;
    }

    public String getPestado_civil_victima() {
        return pestado_civil_victima;
    }

    public void setPestado_civil_victima(String pestado_civil_victima) {
        this.pestado_civil_victima = pestado_civil_victima;
    }

    public String getPnivel_de_instruccion_victima() {
        return pnivel_de_instruccion_victima;
    }

    public void setPnivel_de_instruccion_victima(String pnivel_de_instruccion_victima) {
        this.pnivel_de_instruccion_victima = pnivel_de_instruccion_victima;
    }

    public String getPocupacion() {
        return pocupacion;
    }

    public void setPocupacion(String pocupacion) {
        this.pocupacion = pocupacion;
    }

    public String getPagresor() {
        return pagresor;
    }

    public void setPagresor(String pagresor) {
        this.pagresor = pagresor;
    }

    public String getPsexo_agresor() {
        return psexo_agresor;
    }

    public void setPsexo_agresor(String psexo_agresor) {
        this.psexo_agresor = psexo_agresor;
    }

    public String getPdireccion_agresor() {
        return pdireccion_agresor;
    }

    public void setPdireccion_agresor(String pdireccion_agresor) {
        this.pdireccion_agresor = pdireccion_agresor;
    }

    public String getPedad_agresor() {
        return pedad_agresor;
    }

    public void setPedad_agresor(String pedad_agresor) {
        this.pedad_agresor = pedad_agresor;
    }

    public String getPdomiciliado_agresor() {
        return pdomiciliado_agresor;
    }

    public void setPdomiciliado_agresor(String pdomiciliado_agresor) {
        this.pdomiciliado_agresor = pdomiciliado_agresor;
    }

    public String getPestado_civil_agresor() {
        return pestado_civil_agresor;
    }

    public void setPestado_civil_agresor(String pestado_civil_agresor) {
        this.pestado_civil_agresor = pestado_civil_agresor;
    }

    public String getPnivel_de_instruccion_agresor() {
        return pnivel_de_instruccion_agresor;
    }

    public void setPnivel_de_instruccion_agresor(String pnivel_de_instruccion_agresor) {
        this.pnivel_de_instruccion_agresor = pnivel_de_instruccion_agresor;
    }

    public String getPocupacion_agresor() {
        return pocupacion_agresor;
    }

    public void setPocupacion_agresor(String pocupacion_agresor) {
        this.pocupacion_agresor = pocupacion_agresor;
    }

    public String getPparentesco_victima_agresor() {
        return pparentesco_victima_agresor;
    }

    public void setPparentesco_victima_agresor(String pparentesco_victima_agresor) {
        this.pparentesco_victima_agresor = pparentesco_victima_agresor;
    }

    public String getPnumeros_hijos_comun() {
        return pnumeros_hijos_comun;
    }

    public void setPnumeros_hijos_comun(String pnumeros_hijos_comun) {
        this.pnumeros_hijos_comun = pnumeros_hijos_comun;
    }

    public String getPlugar_agresion() {
        return plugar_agresion;
    }

    public void setPlugar_agresion(String plugar_agresion) {
        this.plugar_agresion = plugar_agresion;
    }

    public String getPtipo_de_violencia() {
        return ptipo_de_violencia;
    }

    public void setPtipo_de_violencia(String ptipo_de_violencia) {
        this.ptipo_de_violencia = ptipo_de_violencia;
    }

    public String getPfecha_agresion() {
        return pfecha_agresion;
    }

    public void setPfecha_agresion(String pfecha_agresion) {
        this.pfecha_agresion = pfecha_agresion;
    }

    public String getPhora_de_agresion() {
        return phora_de_agresion;
    }

    public void setPhora_de_agresion(String phora_de_agresion) {
        this.phora_de_agresion = phora_de_agresion;
    }

    public String getPmedidas_de_amparo() {
        return pmedidas_de_amparo;
    }

    public void setPmedidas_de_amparo(String pmedidas_de_amparo) {
        this.pmedidas_de_amparo = pmedidas_de_amparo;
    }

    public String getPsentencia() {
        return psentencia;
    }

    public void setPsentencia(String psentencia) {
        this.psentencia = psentencia;
    }

    public String getPapelacion() {
        return papelacion;
    }

    public void setPapelacion(String papelacion) {
        this.papelacion = papelacion;
    }

    public String getPboletas_anteriores() {
        return pboletas_anteriores;
    }

    public void setPboletas_anteriores(String pboletas_anteriores) {
        this.pboletas_anteriores = pboletas_anteriores;
    }

    public String getPobservaciones() {
        return pobservaciones;
    }

    public void setPobservaciones(String pobservaciones) {
        this.pobservaciones = pobservaciones;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    
    
    
}
