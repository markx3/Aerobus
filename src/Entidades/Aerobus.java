package Entidades;


import Telas.Menu;
import java.util.ArrayList;
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
    
    public static Hashtable<String,PessoaFisica> pessoaFisicaHTable = new Hashtable<>();
    public static Hashtable<String,PessoaJuridica> pessoaJuridicaHTable = new Hashtable<>();
    public static ArrayList<DescricaoVoo> arrayDescricaoVoos = new ArrayList<>();
    public static ArrayList<Voo> arrayVoos = new ArrayList<>();
    public static ArrayList<DescricaoAviao> arrayDescricaoAviao = new ArrayList<>();
    public static ArrayList<Aeroporto> arrayAeroporto = new ArrayList<>();
    
    public static void main(String args[]) {
        Menu menu = new Menu();
        menu.setVisible(true);
        

        
        

     
        
    }
    
}
