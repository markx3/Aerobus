/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Henrique Parucker
 */
public class Voo {
    private String data;
    private int numPoltronas;
    private DescricaoVoo descricaoVoo;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;

    /**
     * Construtor Voo.
     * @param data
     * @param numPoltronas
     * @param descricaoVoo 
     */
    public Voo(String data, int numPoltronas, DescricaoVoo descricaoVoo) {
        id = count.incrementAndGet();
        this.data = data;
        this.numPoltronas = numPoltronas;
        this.descricaoVoo = descricaoVoo;
    }

    /**
     * 
     * @return 
     */
    public String getData() {
        return data;
    }

    /**
     * 
     * @param data 
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 
     * @return 
     */
    public int getNumPoltronas() {
        return numPoltronas;
    }

    /**
     * 
     * @param numPoltronas 
     */
    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    /**
     * 
     * @return 
     */
    public DescricaoVoo getDescricaoVoo() {
        return descricaoVoo;
    }

    /**
     * 
     * @param descricaoVoo 
     */
    public void setDescricaoVoo(DescricaoVoo descricaoVoo) {
        this.descricaoVoo = descricaoVoo;
    }

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String retorno = descricaoVoo.getAeroportoOrigem().getCodigo() +
                " -> " + descricaoVoo.getAeroportoChegada().getCodigo() +
                "(" + data + ")";
        return retorno;
    }

}
