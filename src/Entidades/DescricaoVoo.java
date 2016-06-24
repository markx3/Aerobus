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
public class DescricaoVoo {
    private String horarioPartida;
    private String horarioChegada;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoChegada;
    private DescricaoAviao descricaoAviao;

    public DescricaoVoo(String horarioPartida, String horarioChegada, Aeroporto aeroportoOrigem, Aeroporto aeroportoChegada, DescricaoAviao descricaoAviao) {
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoChegada = aeroportoChegada;
        this.descricaoAviao = descricaoAviao;
    }

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public Aeroporto getAeroportoChegada() {
        return aeroportoChegada;
    }

    public void setAeroportoChegada(Aeroporto aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    public DescricaoAviao getDescricaoAviao() {
        return descricaoAviao;
    }

    public void setDescricaoAviao(DescricaoAviao descricaoAviao) {
        this.descricaoAviao = descricaoAviao;
    }
    
    
}
