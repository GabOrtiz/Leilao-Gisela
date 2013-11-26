/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ortiz
 */
public class Livro{
    private String titulo, autor, estado, vencendo, vendedor;
    private double valor;
    private Date data;

    public Livro(String titulo, String autor, String estado, double valor, Date data){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.valor = valor;
        this.data = Calendar.getInstance().getTime();
    }
    
    public Livro(String titulo, String autor, String estado, double valor, Date data, String vencendo, String vendedor){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.valor = valor;
        this.data = Calendar.getInstance().getTime();
        this.vendedor = vendedor;
    }

    public String getVencendo(){
        return vencendo;
    }

    public void setVencendo(String vencendo){
        this.vencendo = vencendo;
    }

    public Date getData(){
        return data;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", estado=" + estado + ", vencendo=" + vencendo + ", valor=" + valor + ", data=" + data + '}';
    }
  
    
}
