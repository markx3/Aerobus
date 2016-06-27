/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class ReservaViagem {
    private long id;
    protected ArrayList<ReservaVoo> reservasVoos = new ArrayList<>();

    /**
     * Construtor ReservaViagem.
     */
    public ReservaViagem() {
        id++;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<ReservaVoo> getReservasVoos() {
        return reservasVoos;
    }

    /**
     * 
     * @param reservasVoos 
     */
    public void setReservasVoos(ArrayList<ReservaVoo> reservasVoos) {
        this.reservasVoos = reservasVoos;
    }

    /**
     * 
     * @return 
     */
    public long getId() {
        return id;
    }
    
}
