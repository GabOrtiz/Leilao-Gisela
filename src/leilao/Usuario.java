/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

/**
 *
 * @author Ortiz
 */
public class Usuario {
    private String nome, cpf, email, senha, msg;


    public Usuario(String nome, String cpf, String email,String senha, String msg){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.msg = msg;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
