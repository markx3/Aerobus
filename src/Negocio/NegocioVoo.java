/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Aerobus;
import Entidades.Aeroporto;
import Entidades.DescricaoAviao;
import Entidades.DescricaoVoo;
import Entidades.Voo;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class NegocioVoo extends Telas.TelaVoos {
    
    private final Hashtable<String, DescricaoAviao> hashDescricaoAviao = new Hashtable<>();
    private final Hashtable<String, Aeroporto> hashAeroporto = new Hashtable<>();
    private Voo voo;
    private DescricaoVoo descricaoVoo;
    private Aeroporto aeroporto;

    public NegocioVoo(byte opt) {
        super(opt);
        verificaOperacao();
        initOperations();
    }
    
    protected void initOperations() {
        for(int i = 0; i < Aerobus.arrayDescricaoAviao.size(); i++) {
            DescricaoAviao tmp = Aerobus.arrayDescricaoAviao.get(i);
            hashDescricaoAviao.put(tmp.toString(), tmp);
            getCbAviao().addItem(tmp.toString());
        }
        
        for (int i = 0; i < Aerobus.arrayAeroporto.size(); i++) {
            boolean isInIndexDestino = false;
            boolean isInIndexOrigem = false;
            
            Aeroporto tmp = Aerobus.arrayAeroporto.get(i);
            String cidade = tmp.getCidade();
            String codigo = tmp.getCodigo();
            hashAeroporto.put(tmp.getCodigo(), tmp);
            
            for (int j = 0; j < getCbCidadeDestino().getItemCount(); j++) { 
                if (getCbCidadeDestino().getItemAt(j).equals(cidade)) isInIndexDestino = true;
            }
            for (int j = 0; j < getCbCidadeOrigem().getItemCount(); j++) {
                if (getCbCidadeOrigem().getItemAt(j).equals(cidade)) isInIndexOrigem = true;
            }
            if (!isInIndexDestino) getCbCidadeDestino().addItem(cidade);
            if (!isInIndexOrigem) getCbCidadeOrigem().addItem(cidade);
           
        }
        if (opt == EDITAR || opt == REMOVER) {
            for (int i = 0; i < Aerobus.arrayVoos.size(); i++) {
                Voo tmp = Aerobus.arrayVoos.get(i);
                getCbVoo().addItem(tmp.toString());
            }
        } 
    }
    
    private void verificaOperacao() {
         switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    private void caseNovo() {
        getLabelTitulo().setText("Novo vôo");
        getCbVoo().setEnabled(false);
    }
    
    private void caseEditar() {
        getLabelTitulo().setText("Editar vôo");
        desabilitaItems();
    }
    
    private void caseRemover() {
        getLabelTitulo().setText("Remover vôo");
        desabilitaItems();
    }
    
    private void habilitaItems() {
        getCampoDataPartida().setEnabled(true);
        getCampoVagas().setEnabled(true);
        getCbAeroportoDestino().setEnabled(true);
        getCbAeroportoOrigem().setEnabled(true);
        getCbCidadeDestino().setEnabled(true);
        getCbCidadeOrigem().setEnabled(true);
        getCbAviao().setEnabled(true);

                
    }
    
    private void desabilitaItems() {
        getCampoDataPartida().setEnabled(false);
        getCampoVagas().setEnabled(false);
        getCbAeroportoDestino().setEnabled(false);
        getCbAeroportoOrigem().setEnabled(false);
        getCbCidadeDestino().setEnabled(false);
        getCbCidadeOrigem().setEnabled(false);
        getCbAviao().setEnabled(false);
    }

    @Override
    protected void confirmarAcao() {
       String data = getCampoDataPartida().getText();
       int numPoltronas = Integer.parseInt(getCampoVagas().getText());
       String horarioPartida = getCampoHorarioPartida().getText();
       String horarioChegada = getCampoHorarioChegada().getText();
       DescricaoAviao descricaoAviao = hashDescricaoAviao.get(getCbAviao().getItemAt(getCbAviao().getSelectedIndex()));
       Aeroporto aeroportoOrigem = hashAeroporto.get(getCbAeroportoOrigem().getItemAt(getCbAeroportoOrigem().getSelectedIndex()));
       Aeroporto aeroportoDestino = hashAeroporto.get(getCbAeroportoDestino().getItemAt(getCbAeroportoDestino().getSelectedIndex()));
       
       if ((opt == NOVO || opt == EDITAR) && (data.equals("") || numPoltronas == 0 || horarioPartida.equals("")
                                              || horarioChegada.equals("") || descricaoAviao == null 
                                              || aeroportoOrigem == null || aeroportoDestino == null )) {
           JOptionPane.showMessageDialog(null, "Erro! Todos os campos são obrigatórios.\n");
           dispose();
       }
       
       switch(opt) {
           case NOVO:
               descricaoVoo = new DescricaoVoo(horarioPartida, horarioChegada, aeroportoOrigem, aeroportoDestino, descricaoAviao);
               voo = new Voo(data, numPoltronas, descricaoVoo);
               Aerobus.arrayVoos.add(voo);
               break;
           case EDITAR:
               voo = Aerobus.arrayVoos.get(getCbVoo().getSelectedIndex()-1);
               descricaoVoo = voo.getDescricaoVoo();
               descricaoVoo.setAeroportoChegada(aeroportoDestino);
               descricaoVoo.setAeroportoOrigem(aeroportoOrigem);
               descricaoVoo.setDescricaoAviao(descricaoAviao);
               descricaoVoo.setHorarioChegada(horarioChegada);
               descricaoVoo.setHorarioPartida(horarioPartida);
               voo.setData(data);
               voo.setDescricaoVoo(descricaoVoo);
               voo.setNumPoltronas(numPoltronas);
               break;
           case REMOVER:
               voo = Aerobus.arrayVoos.remove(getCbVoo().getSelectedIndex()-1);
               break;
       }
       dispose();
    }

    @Override
    protected void vooAcao() {
        int option = getCbVoo().getSelectedIndex();
        if (option != -1) {
            voo = Aerobus.arrayVoos.get(option-1);
            descricaoVoo = voo.getDescricaoVoo();
            Aeroporto aeroportoOrigem = descricaoVoo.getAeroportoOrigem();
            Aeroporto aeroportoDestino = descricaoVoo.getAeroportoChegada();
            getCbCidadeDestino().setSelectedItem(aeroportoDestino.getCidade());
            getCbCidadeOrigem().setSelectedItem(aeroportoOrigem.getCidade());
            getCbAeroportoOrigem().setSelectedItem(aeroportoOrigem.getCodigo());
            getCbAeroportoDestino().setSelectedItem(aeroportoDestino.getCodigo());
            getCampoDataPartida().setText(voo.getData());
            getCbAviao().setSelectedItem(descricaoVoo.getDescricaoAviao().toString());
            getCampoVagas().setText(String.valueOf(voo.getNumPoltronas()));
            getCampoHorarioChegada().setText(descricaoVoo.getHorarioChegada());
            getCampoHorarioPartida().setText(descricaoVoo.getHorarioPartida());
            habilitaItems();
        }
        if (option == -1 || opt == REMOVER) desabilitaItems();
    }

    @Override
    protected void cidadeOrigemAcao() {
        int option = getCbCidadeOrigem().getSelectedIndex();
        if (option != -1) {
            String cidade = getCbCidadeOrigem().getItemAt(option);
            getCbAeroportoOrigem().removeAllItems();
            for (int i = 0; i < Aerobus.arrayAeroporto.size(); i++) {
                Aeroporto tmp = Aerobus.arrayAeroporto.get(i);
                if (cidade.equals(tmp.getCidade())) {
                    getCbAeroportoOrigem().addItem(tmp.getCodigo());
                }
            }
        }
    }

    @Override
    protected void cidadeDestinoAcao() {
        int option = getCbCidadeDestino().getSelectedIndex();
        if (option != -1) {
            String cidade = getCbCidadeDestino().getItemAt(option);
            getCbAeroportoDestino().removeAllItems();
            for (int i = 0; i < Aerobus.arrayAeroporto.size(); i++) {
                Aeroporto tmp = Aerobus.arrayAeroporto.get(i);
                if(cidade.equals(tmp.getCidade())) {
                    getCbAeroportoDestino().addItem(tmp.getCodigo());
                }
            }
        }
    }

    @Override
    protected void aviaoAcao() {
        int option = getCbAviao().getSelectedIndex();
        if (option != -1) {
            DescricaoAviao tmp = Aerobus.arrayDescricaoAviao.get(option-1);
            getCampoVagas().setText(String.valueOf(tmp.getNumAssentos()));
        }
    }
    
}
