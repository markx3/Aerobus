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
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class NegocioCliente extends TelaClientes {

    public NegocioCliente(byte opt) {
        super(opt);
        verificaOperacao();
    }

    private void verificaOperacao() {
        switch (opt) {
            case NOVO:
                caseNovo();
                break;
            case EDITAR:
                caseEditar();
                break;
            case REMOVER:
                caseRemover();
                break;
        }
    }

    private void caseNovo() {
        getLabelTitulo().setText("Novo cliente");
        getBtnConsulta().setEnabled(false);
        habilitaItems();
    }

    private void caseEditar() {
        getLabelTitulo().setText("Editar cliente");
        desabilitaItems();

    }

    private void caseRemover() {
        getLabelTitulo().setText("Remover cliente");
        desabilitaItems();
    }

    private void habilitaItems() {
        getCampoNome().setEnabled(true);
        getCampoEndereco1().setEnabled(true);
        getCampoTel1().setEnabled(true);
        getCampoTel2().setEnabled(true);
        if (getCbDocumento().getSelectedIndex() == CNPJ) {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Razão social:");
            docOpt = CNPJ;
        } else {
            getCbSexo().setEnabled(true);
            getCampoNascimento().setEnabled(true);
            getLabelNome().setText("Nome:");
            docOpt = CPF;

        }
    }

    private void desabilitaItems() {
        getCampoNome().setEnabled(false);
        getCampoEndereco1().setEnabled(false);
        getCampoTel1().setEnabled(false);
        getCampoTel2().setEnabled(false);
        if (getCbDocumento().getSelectedIndex() == CNPJ) {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Razão social:");
        } else {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Nome:");

        }
    }

    public void consultaPessoaFisica() {
        PessoaFisica cliente = (PessoaFisica) Aerobus.pessoaFisicaHTable.get(getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        getCampoDocumento().setText(cliente.getCPF());
        getCampoEndereco1().setText(cliente.getEndereco());
        getCampoNascimento().setText(cliente.getNascimento());
        getCampoNome().setText(cliente.getNome());
        getCampoTel1().setText(cliente.getTel1());
        getCampoTel2().setText(cliente.getTel2());
    }

    public void consultaPessoaJuridica() {
        PessoaJuridica cliente = (PessoaJuridica) Aerobus.pessoaJuridicaHTable.get(getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        getCampoDocumento().setText(cliente.getCNPJ());
        getCampoEndereco1().setText(cliente.getEndereco());
        getCampoNome().setText(cliente.getRazaoSocial());
        getCampoTel1().setText(cliente.getTel1());
        getCampoTel2().setText(cliente.getTel2());
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
                        Aerobus.pessoaFisicaHTable.remove(getCampoDocumento().getText());
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
                        Aerobus.pessoaJuridicaHTable.remove(getCampoDocumento().getText());
                        break;
                }
                break;
        }
    }

    public void inserePessoaFisica() {
        // Verifica se já existe cliente cadastrado com o CPF dado
        if (Aerobus.pessoaFisicaHTable.get(getCampoDocumento().getText()) != null) {
            return;
        }

        // Cria uma nova pessoa fisica
        PessoaFisica cliente = new PessoaFisica(getCampoNome().getText(),
                getCampoDocumento().getText(), getCampoEndereco1().getText());

        // Define os campos da pessoa fisica
        cliente.setNascimento(getCampoNascimento().getText());
        cliente.setSexo((byte) getCbSexo().getSelectedIndex());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        // Insere na hash table
        Aerobus.pessoaFisicaHTable.put(getCampoDocumento().getText(), cliente);
    }

    public void editaPessoaFisica() {
        // Consulta na hash table
        PessoaFisica cliente = (PessoaFisica) Aerobus.pessoaFisicaHTable.get(getCampoDocumento().getText());

        // Define as alterações no cliente
        cliente.setNome(getCampoNome().getText());
        cliente.setEndereco(getCampoEndereco1().getText());
        cliente.setNascimento(getCampoNascimento().getText());
        cliente.setSexo((byte) getCbSexo().getSelectedIndex());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        Aerobus.pessoaFisicaHTable.replace(getCampoDocumento().getText(), cliente);
    }

    private void clienteNaoEncontrado() {
        JOptionPane.showMessageDialog(null, "Cliente não encontrado.\n");
        dispose();
    }

    private void inserePessoaJuridica() {
        // Verifica se já existe pessoa jurídica a partir do CNPJ dado.
        if (Aerobus.pessoaJuridicaHTable.get(getCampoDocumento().getText()) != null) {
            return;
        }

        // Cria uma nova pessoa jurídica
        PessoaJuridica cliente = new PessoaJuridica(getCampoNome().getText(),
                getCampoDocumento().getText(), getCampoEndereco1().getText());

        // Define os campos da pessoa jurídica
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        // Insere novo cliente na hash table
        Aerobus.pessoaJuridicaHTable.put(cliente.getCNPJ(), cliente);

    }

    private void editaPessoaJuridica() {
        // Consulta na hash table
        PessoaJuridica cliente = Aerobus.pessoaJuridicaHTable.get(getCampoDocumento().getText());

        // Define as alterações no cliente
        cliente.setEndereco(getCampoEndereco1().getText());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        Aerobus.pessoaJuridicaHTable.replace(cliente.getCNPJ(), cliente);
    }
    
    public void btnConsultaAcao() {
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 11 && docOpt == CPF) {
            JOptionPane.showMessageDialog(null, "Favor inserir CPF válido.");
            return;
        }
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 14 && docOpt == CNPJ) {
            JOptionPane.showMessageDialog(null, "Favor inserir CNPJ válido.");
        }
  
        
        if (docOpt == CPF) consultaPessoaFisica();
        if (docOpt == CNPJ) consultaPessoaJuridica();
        
        if (opt != REMOVER) {
            habilitaItems();
        }
        getCbDocumento().setEnabled(false);
        getCampoDocumento().setEnabled(false);
        getBtnConsulta().setEnabled(false);
    }
    
    @Override
    public void btnConfirmarAcao() {
        if ("".equals(getCampoDocumento().getText()) || "".equals(getCampoNome().getText()) || "".equals(getCampoEndereco1().getText())) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios: documento, nome/razão social e endereço.\n");
            dispose();
        }
        
        if (getCampoDocumento().getText().length() != 11 && docOpt == CPF) {
            JOptionPane.showMessageDialog(null, "Favor inserir CPF válido.");
            return;
        }

        if (getCampoDocumento().getText().length() != 14 && docOpt == CNPJ) {
            JOptionPane.showMessageDialog(null, "Favor inserir CNPJ válido.");
        }
        verificaAoConfirmar(docOpt, opt);
        dispose();
    }

    @Override
    protected void cbDocumentoAcao() {
        if (getCbDocumento().getSelectedIndex() == CPF) {
           getLabelNome().setText("Nome:");
           docOpt = CPF;
       }
       else {
           getLabelNome().setText("Razão social:");
           docOpt = CNPJ;
       }
       if (opt == NOVO) {
           habilitaItems();
       }
    }
    
}
