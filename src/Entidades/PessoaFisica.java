/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author marcos
 */
public class PessoaFisica extends Pessoa {
    private static final byte M = 0;
    private static final byte F = 1;
    
    private String nome;
    private String CPF;
    private byte sexo;
    private String nascimento;
    
    /**
     * Construtor PessoaFisica.
     * @param nome
     * @param CPF
     * @param endereco
     * @param sexo
     * @param nascimento
     * @param tel1
     * @param tel2 
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1, String tel2) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }
    
    /**
     * Construtor PessoaFisica.
     * @param nome
     * @param CPF
     * @param endereco
     * @param sexo
     * @param nascimento
     * @param tel1 
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor PessoaFisica.
     * @param nome
     * @param CPF
     * @param endereco
     * @param sexo
     * @param nascimento 
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }
    
    /**
     * Construtor PessoaFisica.
     * @param nome
     * @param CPF
     * @param endereco
     * @param sexo 
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    /**
     * Construtor PessoaFisica.
     * @param nome
     * @param CPF
     * @param endereco 
     */
    public PessoaFisica(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    /**
     * Construtor PessoaFisica.
     */
    public PessoaFisica() {
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
    public String getCPF() {
        return CPF;
    }

    /**
     * 
     * @param CPF 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * 
     * @return 
     */
    public byte getSexo() {
        return sexo;
    }

    /**
     * 
     * @param sexo 
     */
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return 
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * 
     * @param nascimento 
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }  
    
}
