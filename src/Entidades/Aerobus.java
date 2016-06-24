package Entidades;


import Telas.TelaAeroportos;
import Telas.Menu;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos
 */
public class Aerobus {

    /**
     *
     */
    public static Hashtable<String,PessoaFisica> pessoaFisicaHTable = new Hashtable<>();

    /**
     *
     */
    public static Hashtable<String,PessoaJuridica> pessoaJuridicaHTable = new Hashtable<>();
    
    public static void main(String args[]) {
        Menu menu = new Menu();
        menu.setVisible(true);
        

     
        
    }
    
}
