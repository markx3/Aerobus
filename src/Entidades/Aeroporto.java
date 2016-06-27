/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Henrique Parucker
 */
public class Aeroporto {
    private String codigo;
    private String nome;
    private String cidade;
    
    /**
     * 
     * @param codigo
     * @param nome
     * @param cidade 
     */
    public Aeroporto(String codigo, String nome, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }
    /**
     * 
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * 
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return 
     */
    public String getCidade() {
        return cidade;
    }
    /**
     * 
     * @param cidade 
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return codigo + " / " + nome + " / " + cidade;
    }
   
    
}
