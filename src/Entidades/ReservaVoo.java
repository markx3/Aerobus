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
public class ReservaVoo {
    protected Voo voo;

    /**
     * Construtor ReservaVoo.
     * @param voo 
     */
    public ReservaVoo(Voo voo) {
        this.voo = voo;
    }

    /**
     * 
     * @return 
     */
    public Voo getVoo() {
        return voo;
    }

    /**
     * 
     * @param voo 
     */
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
