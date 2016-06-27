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
public class DescricaoAviao {
    private String nomeFabricante;
    private long idModelo;
    private int numAssentos;
    /**
     * Construtor DescricaoAviao.
     * @param nomeFabricante
     * @param idModelo
     * @param numAssentos 
     */
    public DescricaoAviao(String nomeFabricante, long idModelo, int numAssentos) {
        this.nomeFabricante = nomeFabricante;
        this.idModelo = idModelo;
        this.numAssentos = numAssentos;
    }
    /**
     * 
     * @return 
     */
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    /**
     * 
     * @param nomeFabricante 
     */
    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    /**
     * 
     * @return 
     */
    public long getIdModelo() {
        return idModelo;
    }

    /**
     * 
     * @param idModelo 
     */
    public void setIdModelo(long idModelo) {
        this.idModelo = idModelo;
    }

    /**
     * 
     * @return 
     */
    public int getNumAssentos() {
        return numAssentos;
    }

    /**
     * 
     * @param numAssentos 
     */
    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return nomeFabricante + " / " + idModelo;
    }
    
    
    
}
