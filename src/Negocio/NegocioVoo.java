/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.DescricaoVoo;
import Entidades.Voo;
import Telas.TelaVoos;

/**
 *
 * @author marcos
 */
public class NegocioVoo {
    
    private final static byte VOOS         = 3;
    private final static byte NOVO         = 5;
    private final static byte EDITAR       = 6;
    private final static byte REMOVER      = 7;
    
    TelaVoos tela;

    public NegocioVoo(TelaVoos tela) {
        this.tela = tela;
    }
    
    public void insereVoo() {

    }
}
