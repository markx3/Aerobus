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

    public Voo(String data, int numPoltronas, DescricaoVoo descricaoVoo) {
        id = count.incrementAndGet();
        this.data = data;
        this.numPoltronas = numPoltronas;
        this.descricaoVoo = descricaoVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumPoltronas() {
        return numPoltronas;
    }

    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    public DescricaoVoo getDescricaoVoo() {
        return descricaoVoo;
    }

    public void setDescricaoVoo(DescricaoVoo descricaoVoo) {
        this.descricaoVoo = descricaoVoo;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        String retorno = descricaoVoo.getAeroportoOrigem().getCodigo() +
                " -> " + descricaoVoo.getAeroportoChegada().getCodigo() +
                "(" + data + ")";
        return retorno;
    }

}
