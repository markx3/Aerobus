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
    
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1, String tel2){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }
    
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }
    
    public PessoaJuridica() {}

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
