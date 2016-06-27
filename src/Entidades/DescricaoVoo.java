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
    
    /**
     * Construtor DescricaoVoo
     * @param horarioPartida
     * @param horarioChegada
     * @param aeroportoOrigem
     * @param aeroportoChegada
     * @param descricaoAviao 
     */
    public DescricaoVoo(String horarioPartida, String horarioChegada, Aeroporto aeroportoOrigem, Aeroporto aeroportoChegada, DescricaoAviao descricaoAviao) {
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoChegada = aeroportoChegada;
        this.descricaoAviao = descricaoAviao;
    }

    /**
     * 
     * @return 
     */
    public String getHorarioPartida() {
        return horarioPartida;
    }

    /**
     * 
     * @param horarioPartida 
     */
    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    /**
     * 
     * @return 
     */
    public String getHorarioChegada() {
        return horarioChegada;
    }

    /**
     * 
     * @param horarioChegada 
     */
    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    /**
     * 
     * @return 
     */
    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * 
     * @param aeroportoOrigem 
     */
    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    /**
     * 
     * @return 
     */
    public Aeroporto getAeroportoChegada() {
        return aeroportoChegada;
    }

    /**
     * 
     * @param aeroportoChegada 
     */
    public void setAeroportoChegada(Aeroporto aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    /**
     * 
     * @return 
     */
    public DescricaoAviao getDescricaoAviao() {
        return descricaoAviao;
    }

    /**
     * 
     * @param descricaoAviao 
     */
    public void setDescricaoAviao(DescricaoAviao descricaoAviao) {
        this.descricaoAviao = descricaoAviao;
    }
    
    
}
