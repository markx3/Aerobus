/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Aerobus;
import Entidades.DescricaoAviao;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class NegocioAvioes extends Telas.TelaAvioes {
    
    protected DescricaoAviao descricaoAviao;
    
    
    public NegocioAvioes(byte opt) {
        super(opt);
        addItemsCbAvioes();
        verificaOperacao();
    }
    /**
     * Carrega todos os aviões existentes ao ComboBox cbAvioes.
     */
    private void addItemsCbAvioes() {
        for (int i = 0; i < Aerobus.arrayDescricaoAviao.size(); i++) {
            DescricaoAviao tmp = Aerobus.arrayDescricaoAviao.get(i);
            getCbAvioes().addItem(tmp.toString());
        }
    }
    
    /**
     * Verifica a operação que foi passada para a nova tela
     * de aviões e faz as devidas alterações.
     */
    private void verificaOperacao() {
         switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    /**
     * Se a operação é NOVO, altera o texto e desabilita o ComboBox.
     */
    private void caseNovo() {
        getLabelTitulo().setText("Novo avião");
        getCbAvioes().setEnabled(false);
    }
    
    /**
     * Se a operação é EDITAR, altera o texto e chama desabilitaItems().
     */
    
    private void caseEditar() {
        getLabelTitulo().setText("Editar avião");
        desabilitaItems();
    }
    
    /**
     * Se a operação é REMOVER, altera o texto e chama desabilitaItems().
     */
    private void caseRemover() {
        getLabelTitulo().setText("Remover avião");
        desabilitaItems();
    }
    
    /**
     * Habilita os campos:
     * - campoFabricante
     * - campoModelo
     * - campoNumAssentos.
     */
    private void habilitaItems() {
        getCampoFabricante().setEnabled(true);
        getCampoModelo().setEnabled(true);
        getCampoNumAssentos().setEnabled(true);
           
    }
    
    /**
     * Desabilita os campos:
     * - campoFabricante
     * - campoModelo
     * - campoNumAssentos
     */
    private void desabilitaItems() {
        getCampoFabricante().setEnabled(false);
        getCampoModelo().setEnabled(false);
        getCampoNumAssentos().setEnabled(false);

    }
    
    /**
     * Verifica qual é a intenção do usuário (NOVO, EDITAR, REMOVER)
     * e faz as devidas alterações.
     */
    @Override
    protected void btnConfirmarAcao() {
        String fabricante = getCampoFabricante().getText();
        String modelo = getCampoModelo().getText();
        String numAssentos = getCampoNumAssentos().getText();
        if ((opt == NOVO || opt == EDITAR) && (fabricante.equals("") || modelo.equals("") || numAssentos.equals(""))) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.\n");
            dispose();
        }
        
        switch(opt) {
            case NOVO: 
                descricaoAviao = new DescricaoAviao(fabricante, Long.parseLong(modelo), Integer.parseInt(numAssentos));
                Aerobus.arrayDescricaoAviao.add(descricaoAviao);
                break;
            case EDITAR:
                descricaoAviao = Aerobus.arrayDescricaoAviao.get(getCbAvioes().getSelectedIndex()-1);
                descricaoAviao.setNomeFabricante(fabricante);
                descricaoAviao.setNumAssentos(Integer.parseInt(numAssentos));
                descricaoAviao.setIdModelo(Long.parseLong(modelo));
                break;
            case REMOVER: caseRemover();
                Aerobus.arrayDescricaoAviao.remove(getCbAvioes().getSelectedIndex()-1);
                break;
        }
        
        
        dispose();
    }
    
    /**
     * Identifica a opção selecionada no ComboBox 
     * cbAvioes e carrega as informações do devido
     * avião nos campos.
     */
    @Override
    protected void cbAvioesAcao() {
        int option = getCbAvioes().getSelectedIndex();
        if (option != -1) {
            descricaoAviao = Aerobus.arrayDescricaoAviao.get(option-1);
            getCampoFabricante().setText(descricaoAviao.getNomeFabricante());
            getCampoModelo().setText(Long.toString(descricaoAviao.getIdModelo()));
            getCampoNumAssentos().setText(Long.toString(descricaoAviao.getNumAssentos()));
            habilitaItems();
        }
        if (option == -1 || opt == REMOVER) desabilitaItems();
    }
    
}
