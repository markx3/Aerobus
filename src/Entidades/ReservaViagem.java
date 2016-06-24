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
    protected ArrayList<ReservaVoo> reservasVoos = new ArrayList<>();

    public ReservaViagem() {
    }

    public ArrayList<ReservaVoo> getReservasVoos() {
        return reservasVoos;
    }

    public void setReservasVoos(ArrayList<ReservaVoo> reservasVoos) {
        this.reservasVoos = reservasVoos;
    }
    
}
