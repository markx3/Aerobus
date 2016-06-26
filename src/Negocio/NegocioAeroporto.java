/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Aerobus;
import Entidades.Aeroporto;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class NegocioAeroporto extends Telas.TelaAeroportos {
    
    public NegocioAeroporto(byte opt) {
        super(opt);
        verificaOperacao();
        addAeroportoCb();
    }
    
    /**
     *
     */
    private void verificaOperacao() {
         switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    protected void caseNovo() {
        getLabelTitulo().setText("Novo aeroporto");
        getCbAeroporto().setEnabled(false);
    }
    
    protected void caseEditar() {
        getLabelTitulo().setText("Editar aeroporto");
        desabilitaItems();
    }
    
    protected void caseRemover() {
        getLabelTitulo().setText("Remover aeroporto");
        desabilitaItems();
    }
    
    protected void habilitaItems() {
        getCampoCidade().setEnabled(true);
        getCampoCodigo().setEnabled(true);
        getCampoNome().setEnabled(true);
           
    }
    
    protected void desabilitaItems() {
        getCampoCidade().setEnabled(false);
        getCampoCodigo().setEnabled(false);
        getCampoNome().setEnabled(false);
    }
    
    public void addAeroportoCb() {
            for(int i = 0; i < Aerobus.arrayAeroporto.size(); i++) {
            Aeroporto tmp = Aerobus.arrayAeroporto.get(i);
            getCbAeroporto().addItem(tmp.toString());
            
        }
    }
    
    @Override
    public void cbAeroportoAcao() {
        int option = getCbAeroporto().getSelectedIndex();
        if (option != -1) {
           aeroporto = Aerobus.arrayAeroporto.get(option-1);
           getCampoCidade().setText(aeroporto.getCidade());
           getCampoCodigo().setText(aeroporto.getCodigo());
           getCampoNome().setText(aeroporto.getNome());
           habilitaItems();
        }
        if (option == -1 || opt == REMOVER) desabilitaItems();
    }
    
    @Override
    public void btnConfirmarAcao() {
        String nome = getCampoNome().getText();
        String cidade = getCampoCidade().getText();
        String codigo = getCampoCodigo().getText();
        
        if ((opt == NOVO || opt == EDITAR) && 
           (nome.equals("") || cidade.equals("") || codigo.equals(""))) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.\n");
            dispose();
        }
        switch(opt) {
            case NOVO:
                aeroporto = new Aeroporto(codigo, nome, cidade);
                Aerobus.arrayAeroporto.add(aeroporto);
                break;
            case EDITAR:
                aeroporto = Aerobus.arrayAeroporto.get(getCbAeroporto().getSelectedIndex()-1);
                aeroporto.setCidade(cidade);
                aeroporto.setNome(nome);
                aeroporto.setCodigo(codigo);
                break;
            case REMOVER:
                Aerobus.arrayAeroporto.remove(getCbAeroporto().getSelectedIndex()-1);
        }
        dispose();
    }
    
}
