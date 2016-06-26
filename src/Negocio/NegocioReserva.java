/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Aerobus;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
import Entidades.ReservaViagem;
import Entidades.ReservaVoo;
import Entidades.Voo;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcos
 */
public class NegocioReserva extends Telas.TelaReservas {
    
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private ArrayList<ReservaViagem> arrayReservas;
    private Hashtable<Integer,ReservaViagem> hashReservas;
    private Hashtable hashVoos;
    private ReservaViagem reservaViagem;
    private ArrayList<ReservaVoo> arrayVoo;

    public NegocioReserva(byte opt) {
        super(opt);
        verificaOperacao();
        getCampoNomeCliente().setEditable(false);
        if (opt == NOVO || opt == EDITAR) carregaVoosDisponiveis();
    }
    
    private void verificaOperacao() {
        switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    private void caseNovo() {
        getLabelTitulo().setText("Reservar viagem");
        getCbReservas().setEnabled(false);
    }
    
    private void caseEditar() {
        getLabelTitulo().setText("Editar reserva");
        getTabelaCodVoo().setEnabled(false);

    }
    
    private void caseRemover() {
        getLabelTitulo().setText("Remover reserva");
        getTabelaCodVoo().setEnabled(false);
    }

    @Override
    protected void cbDocumentoAcao() {
        switch(getCbDocumento().getSelectedIndex()) {
            case CPF:
                getLabelDocumento().setText("Nome:");
                break;
            case CNPJ:
                getLabelDocumento().setText("Razão social:");
                break;
        }
        docOpt = (byte) getCbDocumento().getSelectedIndex();
    }

    @Override
    protected void btnConsultaClienteAcao() {
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 11 && docOpt == CPF) {
            JOptionPane.showMessageDialog(null, "Favor inserir CPF válido.");
            return;
        }
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 14 && docOpt == CNPJ) {
            JOptionPane.showMessageDialog(null, "Favor inserir CNPJ válido.");
        }
  
        if (opt == EDITAR || opt == REMOVER) {
            getCbReservas().setEnabled(true);
        }
        
        if ((opt == EDITAR || opt == NOVO) && !Aerobus.arrayVoos.isEmpty()) {
            getBtnAdicionarReserva().setEnabled(true);
        }
        
        String documento = getCampoDocumento().getText();
        switch (docOpt) {
            case CPF:
                pessoaFisica = Aerobus.pessoaFisicaHTable.get(documento);
                getCampoNomeCliente().setText(pessoaFisica.getNome());
                arrayReservas = pessoaFisica.getReservas();
                break;
            case CNPJ:
                pessoaJuridica = Aerobus.pessoaJuridicaHTable.get(documento);
                getCampoNomeCliente().setText(pessoaJuridica.getRazaoSocial());
                arrayReservas = pessoaFisica.getReservas();
                break;
        }
        for (int i = 0; i < arrayReservas.size(); i++) {
            getCbReservas().addItem(String.valueOf(i));
        }
    }
    
    
    @Override
    protected void btnAdicionarReservaAcao() {
 
        DefaultTableModel dtmReservas = (DefaultTableModel) getTabelaCodReserva().getModel();
        DefaultTableModel dtmVoos = (DefaultTableModel) getTabelaCodVoo().getModel();
        
        Vector<Object> data = (Vector<Object>) dtmVoos.getDataVector().elementAt(getTabelaCodVoo().getSelectedRow());
        dtmVoos.removeRow(getTabelaCodVoo().getSelectedRow());
        dtmReservas.addRow(data);
        
        if (getTabelaCodReserva().getRowCount() != 0) {
            getBtnRemoverReserva().setEnabled(true);
        }
        
        if (getTabelaCodVoo().getRowCount() == 0) {
            getBtnAdicionarReserva().setEnabled(false);
        }    
    }

    @Override
    protected void btnRemoverReservaAcao() {
        /**
         * Remove da reserva de viagem uma reserva de vôo
         */
        DefaultTableModel dtmReservas = (DefaultTableModel) getTabelaCodReserva().getModel();
        DefaultTableModel dtmVoos = (DefaultTableModel) getTabelaCodVoo().getModel();
        
        Vector<Object> data = (Vector<Object>) dtmReservas.getDataVector().elementAt(getTabelaCodReserva().getSelectedRow());
        dtmReservas.removeRow(getTabelaCodReserva().getSelectedRow());
        dtmVoos.addRow(data);
        
        if (getTabelaCodVoo().getRowCount() != 0) {
            getBtnAdicionarReserva().setEnabled(true);
        }
        
        if (getTabelaCodReserva().getRowCount() == 0) {
            getBtnRemoverReserva().setEnabled(false);
        }
    }

    @Override
    protected void btnConfirmarReservaAcao() {
        /**
         * Confirma a reserva de viagem
         */
        
        if ((getCampoNomeCliente().equals("") ||
            getTabelaCodReserva().getRowCount() == 0) && opt == NOVO)  {
            JOptionPane.showMessageDialog(null, "É necessário selecionar o cliente e no mínimo um vôo!\n");
            dispose();
        }
        
        DefaultTableModel dtmReservas = (DefaultTableModel) getTabelaCodReserva().getModel();
        ArrayList<ReservaVoo> tmpArrayVoos = new ArrayList<>();
        ReservaViagem tmpReservaViagem = new ReservaViagem();
        
        for (int i = 0; i < getTabelaCodReserva().getRowCount(); i++) {
            int aux = Integer.parseInt(String.valueOf(getTabelaCodReserva().getModel().getValueAt(i, 0)));
            ReservaVoo tmp = new ReservaVoo(Aerobus.arrayVoos.get(aux-1));
            tmpArrayVoos.add(tmp);
        }
        tmpReservaViagem.setReservasVoos(tmpArrayVoos);
        switch(opt) {
            case NOVO:
                switch (docOpt) {
                    case CPF:
                        pessoaFisica.getReservas().add(tmpReservaViagem);
                        break;
                    case CNPJ:
                        pessoaJuridica.getReservas().add(tmpReservaViagem);
                        break;
                }
                break;
            case EDITAR:
                if (docOpt == CPF) {
                    pessoaFisica.getReservas().remove(getCbReservas().getSelectedIndex()-1);
                    pessoaFisica.getReservas().add(getCbReservas().getSelectedIndex()-1, tmpReservaViagem);
                }
                if (docOpt == CNPJ) {
                    pessoaJuridica.getReservas().remove(getCbReservas().getSelectedIndex()-1);
                    pessoaJuridica.getReservas().add(getCbReservas().getSelectedIndex()-1, tmpReservaViagem);
                }
                break;
            case REMOVER:
                if (docOpt == CPF) {
                    pessoaFisica.getReservas().remove(getCbReservas().getSelectedIndex()-1);
                }
                if (docOpt == CNPJ) {
                    pessoaJuridica.getReservas().remove(getCbReservas().getSelectedIndex()-1);
                }
                break;
        }
        dispose();
    }

    @Override
    protected void cbReservasAcao() {
        int option = getCbReservas().getSelectedIndex();
        if (option != -1) {
            
            ArrayList<ReservaVoo> tmpArrayVoo =
            arrayReservas.get(option-1).getReservasVoos();
            
            
            DefaultTableModel dtm = (DefaultTableModel) getTabelaCodReserva().getModel();
            for (int i = 0; i < tmpArrayVoo.size(); i++) {
                ReservaVoo tmp = tmpArrayVoo.get(i);
                Object [] data = {
                    String.valueOf(tmp.getVoo().getId()), 
                    tmp.getVoo().getDescricaoVoo().getAeroportoOrigem().getCodigo(),
                    tmp.getVoo().getDescricaoVoo().getAeroportoChegada().getCodigo(),
                    tmp.getVoo().getData(),
                    tmp.getVoo().getDescricaoVoo().getHorarioPartida(),
                    tmp.getVoo().getDescricaoVoo().getHorarioChegada()
                };
                dtm.addRow(data);
            }
            getBtnAdicionarReserva().setEnabled(true);
            getBtnRemoverReserva().setEnabled(true);
        }
    }

    private void carregaVoosDisponiveis() {
        DefaultTableModel dtm = (DefaultTableModel) getTabelaCodVoo().getModel();
        for (int i = 0; i < Aerobus.arrayVoos.size(); i++) {
            Voo tmp = Aerobus.arrayVoos.get(i);
            Object data [] = {
                String.valueOf(tmp.getId()),
                tmp.getDescricaoVoo().getAeroportoOrigem().getCodigo(),
                tmp.getDescricaoVoo().getAeroportoChegada().getCodigo(),
                tmp.getData(),
                tmp.getDescricaoVoo().getHorarioPartida(),
                tmp.getDescricaoVoo().getHorarioChegada()
            };
            dtm.addRow(data);
        }
    }
    
    
    
}
