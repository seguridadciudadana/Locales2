/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.logica.clases;

import java.sql.Date;
import master.logica.clases.Usuario;

/**
 *
 * @author Oscunach
 */
public class Documento {

    private int codigo;
    private String titulo;
    private String path;
    private String tipo;
    private String keywords;
    private int estado;
    private Usuario codigo_usuario;
    private Date fecha_registro;

    /*
     * Constructores
     */
    public Documento(int codigo, String titulo, String path, String tipo, String keywords, int estado, Usuario codigo_usuario, Date fecha_registro) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.path = path;
        this.tipo = tipo;
        this.keywords = keywords;
        this.estado = estado;
        this.codigo_usuario = codigo_usuario;
        this.fecha_registro = fecha_registro;
    }

    public Documento() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Usuario getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(Usuario codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

}
