/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.NegocioVoo;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mrk
 */
public abstract class TelaVoos extends javax.swing.JFrame {

    protected final static byte VOOS         = 3;
    protected final static byte NOVO         = 5;
    protected final static byte EDITAR       = 6;
    protected final static byte REMOVER      = 7;
    
    protected static byte opt;
    
    /**
     * Creates new form Voo
     * @param opt
     */
    public TelaVoos(byte opt) {
        TelaVoos.opt = opt;
        initComponents();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        cbVoo = new javax.swing.JComboBox<>();
        labelCidadeOrigem = new javax.swing.JLabel();
        cbCidadeOrigem = new javax.swing.JComboBox<>();
        labelCidadeDestino = new javax.swing.JLabel();
        cbCidadeDestino = new javax.swing.JComboBox<>();
        labelAeroportoOrigem = new javax.swing.JLabel();
        cbAeroportoOrigem = new javax.swing.JComboBox<>();
        labelAeroportoDestino = new javax.swing.JLabel();
        cbAeroportoDestino = new javax.swing.JComboBox<>();
        labelDataPartida = new javax.swing.JLabel();
        campoDataPartida = new javax.swing.JFormattedTextField();
        labelAviao = new javax.swing.JLabel();
        cbAviao = new javax.swing.JComboBox<>();
        labelVagas = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelHorarioPartida = new javax.swing.JLabel();
        campoHorarioPartida = new javax.swing.JFormattedTextField();
        labelHorarioChegada = new javax.swing.JLabel();
        campoHorarioChegada = new javax.swing.JFormattedTextField();
        campoVagas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("jLabel1");

        cbVoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVooActionPerformed(evt);
            }
        });

        labelCidadeOrigem.setText("Cidade de Origem:");

        cbCidadeOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbCidadeOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeOrigemActionPerformed(evt);
            }
        });

        labelCidadeDestino.setText("Cidade de Destino:");

        cbCidadeDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbCidadeDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeDestinoActionPerformed(evt);
            }
        });

        labelAeroportoOrigem.setText("Aeroporto de Origem:");

        cbAeroportoOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        labelAeroportoDestino.setText("Aeroporto de Destino:");

        cbAeroportoDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        labelDataPartida.setText("Data de Partida:");

        try {
            campoDataPartida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelAviao.setText("Avião:");

        cbAviao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAviaoActionPerformed(evt);
            }
        });

        labelVagas.setText("Vagas disponíveis:");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelHorarioPartida.setText("Horário Partida:");

        try {
            campoHorarioPartida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelHorarioChegada.setText("Horário Chegada:");

        try {
            campoHorarioChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbVoo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelAeroportoOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDataPartida)
                                .addComponent(labelCidadeOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelAviao)
                            .addComponent(labelHorarioPartida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCidadeOrigem, 0, 150, Short.MAX_VALUE)
                            .addComponent(cbAeroportoOrigem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDataPartida)
                            .addComponent(cbAviao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoHorarioPartida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCidadeDestino)
                            .addComponent(labelAeroportoDestino)
                            .addComponent(labelVagas)
                            .addComponent(labelHorarioChegada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoHorarioChegada)
                            .addComponent(cbCidadeDestino, 0, 150, Short.MAX_VALUE)
                            .addComponent(cbAeroportoDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoVagas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(cbVoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidadeOrigem)
                    .addComponent(cbCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidadeDestino)
                    .addComponent(cbCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAeroportoOrigem)
                    .addComponent(cbAeroportoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAeroportoDestino)
                    .addComponent(cbAeroportoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataPartida)
                    .addComponent(campoDataPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAviao)
                    .addComponent(cbAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVagas)
                    .addComponent(campoVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHorarioPartida)
                    .addComponent(campoHorarioPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHorarioChegada)
                    .addComponent(campoHorarioChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected abstract void confirmarAcao();
    
    protected abstract void vooAcao();
    
    protected abstract void cidadeOrigemAcao();
    
    protected abstract void cidadeDestinoAcao();
    
    protected abstract void aviaoAcao();
    
    /**
     * 
     * @param evt 
     */
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       confirmarAcao();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * 
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * 
     * @param evt 
     */
    private void cbVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVooActionPerformed
        vooAcao();
    }//GEN-LAST:event_cbVooActionPerformed

    /**
     * 
     * @param evt 
     */
    private void cbCidadeOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeOrigemActionPerformed
        cidadeOrigemAcao();
    }//GEN-LAST:event_cbCidadeOrigemActionPerformed

    /**
     * 
     * @param evt 
     */
    private void cbCidadeDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeDestinoActionPerformed
        cidadeDestinoAcao();
    }//GEN-LAST:event_cbCidadeDestinoActionPerformed

    /**
     * 
     * @param evt 
     */
    private void cbAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAviaoActionPerformed
        aviaoAcao();
    }//GEN-LAST:event_cbAviaoActionPerformed

    /**
     * Override no dispose() para criar nova tela Manter(VOOS).
     */
    @Override
    public void dispose() {
        super.dispose();
        Manter tela = new Manter(VOOS);
        tela.setVisible(true);
    }

    /**
     * 
     * @return 
     */
    public static byte getOpt() {
        return opt;
    }

    /**
     * 
     * @return 
     */
    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * 
     * @return 
     */
    public JButton getBtnConfirmar() {
        return btnConfirmar;
    }

    /**
     * 
     * @return 
     */
    public JFormattedTextField getCampoDataPartida() {
        return campoDataPartida;
    }

    /**
     * 
     * @return 
     */
    public JFormattedTextField getCampoHorarioChegada() {
        return campoHorarioChegada;
    }

    /**
     * 
     * @return 
     */
    public JFormattedTextField getCampoHorarioPartida() {
        return campoHorarioPartida;
    }

    /**
     * 
     * @return 
     */
    public JTextField getCampoVagas() {
        return campoVagas;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbAeroportoDestino() {
        return cbAeroportoDestino;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbAeroportoOrigem() {
        return cbAeroportoOrigem;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbAviao() {
        return cbAviao;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbCidadeDestino() {
        return cbCidadeDestino;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbCidadeOrigem() {
        return cbCidadeOrigem;
    }

    /**
     * 
     * @return 
     */
    public JComboBox<String> getCbVoo() {
        return cbVoo;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelAeroportoDestino() {
        return labelAeroportoDestino;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelAeroportoOrigem() {
        return labelAeroportoOrigem;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelAviao() {
        return labelAviao;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelCidadeDestino() {
        return labelCidadeDestino;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelCidadeOrigem() {
        return labelCidadeOrigem;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelDataPartida() {
        return labelDataPartida;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelHorarioChegada() {
        return labelHorarioChegada;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelHorarioPartida() {
        return labelHorarioPartida;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

    /**
     * 
     * @return 
     */
    public JLabel getLabelVagas() {
        return labelVagas;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NegocioVoo(opt).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JFormattedTextField campoDataPartida;
    private javax.swing.JFormattedTextField campoHorarioChegada;
    private javax.swing.JFormattedTextField campoHorarioPartida;
    private javax.swing.JTextField campoVagas;
    private javax.swing.JComboBox<String> cbAeroportoDestino;
    private javax.swing.JComboBox<String> cbAeroportoOrigem;
    private javax.swing.JComboBox<String> cbAviao;
    private javax.swing.JComboBox<String> cbCidadeDestino;
    private javax.swing.JComboBox<String> cbCidadeOrigem;
    private javax.swing.JComboBox<String> cbVoo;
    private javax.swing.JLabel labelAeroportoDestino;
    private javax.swing.JLabel labelAeroportoOrigem;
    private javax.swing.JLabel labelAviao;
    private javax.swing.JLabel labelCidadeDestino;
    private javax.swing.JLabel labelCidadeOrigem;
    private javax.swing.JLabel labelDataPartida;
    private javax.swing.JLabel labelHorarioChegada;
    private javax.swing.JLabel labelHorarioPartida;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVagas;
    // End of variables declaration//GEN-END:variables
}
