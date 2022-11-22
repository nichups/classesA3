/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

import model.Tarefas;

/**
 *
 * @author victo
 */
public class CriacaoTarefasOcorrencias extends javax.swing.JFrame {

    /**
     * Atributo de armazenamento da classe Tarefa
     */
    private final Tarefas infoTarefa;

    /**
     * Creates new form CriacaoTarefasOcorrencias
     */
    public CriacaoTarefasOcorrencias() {
        this.infoTarefa = new Tarefas();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escolhaTarefa = new javax.swing.JButton();
        escolhaOcorren = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dataPrazo = new javax.swing.JTextField();
        gerarTarefa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nomeTarefa = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Criar tarefas e ocorrências");

        jLabel2.setText("Deseja criar uma tarefa ou uma ocorrência?");

        escolhaTarefa.setText("Tarefa");
        escolhaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaTarefaActionPerformed(evt);
            }
        });

        escolhaOcorren.setText("Ocorrência");
        escolhaOcorren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaOcorrenActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição da Tarefa/Ocorrência");

        descricao.setText("Insira a descrição aqui");
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Prazo de entrega");

        dataPrazo.setText("Insira o prazo aqui");
        dataPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPrazoActionPerformed(evt);
            }
        });

        gerarTarefa.setText("CRIAR");
        gerarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarTarefaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome da Tarefa");

        nomeTarefa.setText("Insira a nome aqui");
        nomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTarefaActionPerformed(evt);
            }
        });

        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataPrazo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descricao)
                            .addComponent(nomeTarefa)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(escolhaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(escolhaOcorren, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gerarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escolhaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escolhaOcorren, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerarTarefa)
                    .addComponent(voltar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTarefaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed

    private void escolhaTarefaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_escolhaTarefaActionPerformed
        /**
         * Definição de variável segundo escolha do usuário
         */
        this.infoTarefa.setTipo("tarefa");
    }// GEN-LAST:event_escolhaTarefaActionPerformed

    private void escolhaOcorrenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_escolhaOcorrenActionPerformed
        /**
         * Definição de variável segundo escolha do usuário
         */
        this.infoTarefa.setTipo("ocorrencia");
    }// GEN-LAST:event_escolhaOcorrenActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_descricaoActionPerformed

    private void dataPrazoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataPrazoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_dataPrazoActionPerformed

    private void gerarTarefaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gerarTarefaActionPerformed
        /**
         * Registro da Descrição da Tarefa
         */
        String desc = descricao.getText();

        /**
         * Registro de Email do Colaborador
         */
        String prazo = dataPrazo.getText();
        
        /**
         * Registro do Nome da Tarefa
         */
        String nome = nomeTarefa.getText();

        this.infoTarefa.setNome(nome);
        this.infoTarefa.setDescricao(desc);
        this.infoTarefa.setPrazoDeEntrega(prazo);
        this.infoTarefa.setCodigoCriador(1);
        this.infoTarefa.setCodigoProjeto(1);
        this.infoTarefa.setColabResponsavel(3);

        this.infoTarefa.inserir();

    }// GEN-LAST:event_gerarTarefaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField dataPrazo;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton escolhaOcorren;
    private javax.swing.JButton escolhaTarefa;
    private javax.swing.JButton gerarTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTarefa;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
