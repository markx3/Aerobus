/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

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
    
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1, String tel2) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }
    
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
    }
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }
    
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    public PessoaFisica(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    public PessoaFisica() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
