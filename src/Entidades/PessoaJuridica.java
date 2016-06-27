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
public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String razaoSocial;    
    
    /**
     * Construtor PessoaJuridica.
     * @param razaoSocial
     * @param CNPJ
     * @param endereco
     * @param tel1
     * @param tel2 
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1, String tel2){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }
    
    /**
     * Construtor PessoaJuridica.
     * @param razaoSocial
     * @param CNPJ
     * @param endereco
     * @param tel1 
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor PessoaJuridica.
     * @param razaoSocial
     * @param CNPJ
     * @param endereco 
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }
    
    /**
     * Construtor PessoaJuridica.
     */
    public PessoaJuridica() {}

    /**
     * 
     * @return 
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * 
     * @param CNPJ 
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * 
     * @return 
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * 
     * @param razaoSocial 
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
