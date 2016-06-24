/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Aerobus;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
import Telas.TelaClientes;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class NegocioCliente {
    
    private final static byte CPF          = 0;
    private final static byte CNPJ         = 1;
    private final static byte CLIENTES     = 4;
    private final static byte NOVO         = 5;
    private final static byte EDITAR       = 6;
    private final static byte REMOVER      = 7;
    
    
    TelaClientes tela;
    private final byte opt;
    
    
    public NegocioCliente(TelaClientes tela, byte opt) {
        this.tela = tela;
        this.opt = opt;
    }
    
    public void consultaPessoaFisica() {
        PessoaFisica cliente = (PessoaFisica)Aerobus.pessoaFisicaHTable.get(tela.getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        tela.getCampoDocumento().setText(cliente.getCPF());
        tela.getCampoEndereco1().setText(cliente.getEndereco());
        tela.getCampoNascimento().setText(cliente.getNascimento());
        tela.getCampoNome().setText(cliente.getNome());
        tela.getCampoTel1().setText(cliente.getTel1());
        tela.getCampoTel2().setText(cliente.getTel2());
    }
    
    public void consultaPessoaJuridica() {
        PessoaJuridica cliente = (PessoaJuridica)Aerobus.pessoaJuridicaHTable.get(tela.getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        tela.getCampoDocumento().setText(cliente.getCNPJ());
        tela.getCampoEndereco1().setText(cliente.getEndereco());
        tela.getCampoNome().setText(cliente.getRazaoSocial());
        tela.getCampoTel1().setText(cliente.getTel1());
        tela.getCampoTel2().setText(cliente.getTel2());
    }
    
    public void verificaAoConfirmar(byte docOpt, byte opt) {
        switch (docOpt) {
            case CPF:
                switch (opt) {
                    case NOVO:
                        inserePessoaFisica();
                        break;
                    case EDITAR:
                        editaPessoaFisica();
                        break;
                    case REMOVER:
                        Aerobus.pessoaFisicaHTable.remove(tela.getCampoDocumento().getText());
                        break;
                }
                break;
            case CNPJ:
                switch (opt) {
                    case NOVO:
                        inserePessoaJuridica();
                        break;
                    case EDITAR:
                        editaPessoaJuridica();
                        break;
                    case REMOVER:
                        Aerobus.pessoaJuridicaHTable.remove(tela.getCampoDocumento().getText());
                        break;
                }
                break;
        }
    }
    
    public void inserePessoaFisica() {
        // Verifica se já existe cliente cadastrado com o CPF dado
        if (Aerobus.pessoaFisicaHTable.get(tela.getCampoDocumento().getText()) != null) return;

        // Cria uma nova pessoa fisica
        PessoaFisica cliente = new PessoaFisica(tela.getCampoNome().getText(), tela.getCampoDocumento().getText(), tela.getCampoEndereco1().getText());
        
        // Define os campos da pessoa fisica
        cliente.setNascimento(tela.getCampoNascimento().getText());
        cliente.setSexo((byte)tela.getCbSexo().getSelectedIndex());
        cliente.setTel1(tela.getCampoTel1().getText());
        cliente.setTel2(tela.getCampoTel2().getText()); 
        
        // Insere na hash table
        Aerobus.pessoaFisicaHTable.put(tela.getCampoDocumento().getText(), cliente);  
    }
    
    public void editaPessoaFisica() {
        // Consulta na hash table
        PessoaFisica cliente = (PessoaFisica) Aerobus.pessoaFisicaHTable.get(tela.getCampoDocumento().getText());
        
        // Define as alterações no cliente
        cliente.setNome(tela.getCampoNome().getText());
        cliente.setEndereco(tela.getCampoEndereco1().getText());
        cliente.setNascimento(tela.getCampoNascimento().getText());
        cliente.setSexo((byte)tela.getCbSexo().getSelectedIndex());
        cliente.setTel1(tela.getCampoTel1().getText());
        cliente.setTel2(tela.getCampoTel2().getText());
        
        Aerobus.pessoaFisicaHTable.replace(tela.getCampoDocumento().getText(), cliente);
    }
    
    private void clienteNaoEncontrado() {
        JOptionPane.showMessageDialog(null, "Cliente não encontrado.\n");
        tela.dispose();
    }   

    private void inserePessoaJuridica() {
        // Verifica se já existe pessoa jurídica a partir do CNPJ dado.
        if (Aerobus.pessoaJuridicaHTable.get(tela.getCampoDocumento().getText()) != null) return;

        // Cria uma nova pessoa jurídica
        PessoaJuridica cliente = new PessoaJuridica(tela.getCampoNome().getText(), tela.getCampoDocumento().getText(), tela.getCampoEndereco1().getText());

        // Define os campos da pessoa jurídica
        cliente.setTel1(tela.getCampoTel1().getText());
        cliente.setTel2(tela.getCampoTel2().getText());
        
        // Insere novo cliente na hash table
        Aerobus.pessoaJuridicaHTable.put(cliente.getCNPJ(), cliente);

    }

    private void editaPessoaJuridica() {
        // Consulta na hash table
        PessoaJuridica cliente = Aerobus.pessoaJuridicaHTable.get(tela.getCampoDocumento().getText());
        
        // Define as alterações no cliente
        cliente.setEndereco(tela.getCampoEndereco1().getText());
        cliente.setTel1(tela.getCampoTel1().getText());
        cliente.setTel2(tela.getCampoTel2().getText());
        
        Aerobus.pessoaJuridicaHTable.replace(cliente.getCNPJ(), cliente);
    }
}

  
