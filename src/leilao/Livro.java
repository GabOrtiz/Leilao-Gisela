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
    private String titulo, autor, estado, cpfMaior;
    private double valor;
    private Date data;

    public Livro(String titulo, String autor, String estado, double valor, Date data){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.valor = valor;
        this.data = Calendar.getInstance().getTime();
    }
    
    public Livro(String titulo, String autor, String estado, double valor, Date data, String cpfMaior){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.valor = valor;
        this.data = Calendar.getInstance().getTime();
    }

    public String getCpfMaior() {
        return cpfMaior;
    }

    public void setCpfMaior(String cpfMaior) {
        this.cpfMaior = cpfMaior;
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
  
    
}
