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

    public DescricaoAviao(String nomeFabricante, long idModelo, int numAssentos) {
        this.nomeFabricante = nomeFabricante;
        this.idModelo = idModelo;
        this.numAssentos = numAssentos;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(long idModelo) {
        this.idModelo = idModelo;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    @Override
    public String toString() {
        return nomeFabricante + " / " + idModelo;
    }
    
    
    
}
