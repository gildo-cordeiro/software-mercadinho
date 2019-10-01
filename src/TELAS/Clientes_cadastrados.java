/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import BD.Atualizar;
import BD.Consultas;
import BD.Deletar;
import CLASSES.Cliente;
import CLASSES.table;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes_cadastrados extends javax.swing.JFrame {

    DefaultTableModel Modelo;
    
    public Clientes_cadastrados() {
        initComponents();
        Modelo = (DefaultTableModel) jTable1.getModel();
        jTextField1.setVisible(true);
        table t = new table();
        t.ModifcarTabelaClientes(jTable1);
        consulta();
        //AbrirFrame();
    }
    
    private void consulta(){
        Modelo.setNumRows(0);
        Consultas con = new Consultas();        
        for (Cliente dados: con.ConsultarPessoa()) {
            Modelo.addRow(new Object[]{dados.getCpf(), dados.getNome(), dados.getTelefone(), dados.getRua(), dados.getNum_casa(), 
                dados.getBairro(),dados.getComplemento()});
        }
        con.FecharConexao();
    }
    public void Atualizar(){
        int LinSelect = jTable1.getSelectedRow();
        if (LinSelect == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o cliente que sera atualizado", "Advertência", JOptionPane.WARNING_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar esse registro", "Eliminar",JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int Linha = Modelo.getRowCount();
                try {
                    for (int row = 0; row < Linha; row++) {
                        String cpf = (String) Modelo.getValueAt(row,0);
                        String Nome = (String) Modelo.getValueAt(row,1);
                        String tel = (String) Modelo.getValueAt(row,2);
                        String rua = (String) Modelo.getValueAt(row,3);
                        int casa = Integer.parseInt(Modelo.getValueAt(row,4).toString());
                        String bairro = (String) Modelo.getValueAt(row,5);
                        String compl = (String) Modelo.getValueAt(row, 6);

                        Atualizar att = new Atualizar();
                       //JOptionPane.showMessageDialog(null,cpf+"-"+Nome+"-"+tel+"-"+rua+"-"+casa+"-"+bairro+"-"+compl);
                        att.AtualizCliente(cpf,Nome, tel, rua,casa, bairro,compl);
                    }
                     consulta();
                     JOptionPane.showMessageDialog(null, "Registros atualizados.");
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ação ivalida", "Advetência", JOptionPane.WARNING_MESSAGE);
                    consulta();
                }

            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Telefone", "Rua", "Casa", "Bairro", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 760, 200));

        jButton5.setBackground(new java.awt.Color(0, 102, 0));
        jButton5.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 180, 40));

        jTextField1.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Nome do Cliente");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 400, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Deletar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo 510x350.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 570, 330));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("Nome do Cliente")) {
            consulta();
        }else{
            Modelo.setNumRows(0);
            Consultas con = new Consultas();
            for (Cliente p : con.ConsultarPessoa(jTextField1.getText())) {
                Modelo.addRow(new Object[]{p.getCpf(),p.getNome(),p.getTelefone(),p.getRua(),p.getNum_casa(),
                    p.getBairro(),p.getComplemento()});
            }
            con.FecharConexao();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        String value = jTextField1.getText();
        if (value.equals("Nome do Cliente")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Deletar del = new Deletar();
        ArrayList<String> list = new ArrayList();
        int LinSelect = jTable1.getSelectedRow();
        if(LinSelect == -1){
            JOptionPane.showMessageDialog(null, "Por favor selecione um Cliente","Advertêmcia",JOptionPane.WARNING_MESSAGE);
        }else{
            int[] Linha = jTable1.getSelectedRows(); 
            for (int row = 0; row < Linha.length; row++) {
                list.add((String) jTable1.getValueAt(Linha[row], 0));
            }
            int indice = 1;
            del.Delete(list,indice);
            consulta();
            //JOptionPane.showMessageDialog(null,list);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        String value = jTextField1.getText();
        if (value.equals("Nome do Cliente")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String a = "0123456789#$%¨&*)(_-+=§!@';.,/?°º][ª}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Atualizar();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    public void AbrirFrame(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt){
                try {
                    Thread.sleep(200);
                    Inicial in = new Inicial();
                    in.setVisible(true);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir tela Inicial");
                }
            }
        });
    } 

}
