/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import BD.Atualizar;
import BD.Consultas;
import BD.Deletar;
import CLASSES.Venda;
import CLASSES.table;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Historico extends javax.swing.JFrame {

    DefaultTableModel Modelo;

    public Historico() {
        initComponents();        
        Modelo = (DefaultTableModel) jTable1.getModel();
        consultar();
        marca.setVisible(false);
        funcionario.setVisible(false);
       // AbrirFrame();
        table t = new table();
        t.ModifcarTabelaHistorico(jTable1);
    }
    
    //condições do COMBOBOX. Dependo da opção selecionada o campo de texto 
    //adequado irá torna-se visivel
    public void ChangeIndice(){
        int num = jComboBox1.getSelectedIndex();
       switch (num) {
           case 0:
               cliente.setVisible(true);
               funcionario.setVisible(false);
               marca.setVisible(false);
               cliente.setText("");
               consultar();
               break;
           case 1:
               funcionario.setVisible(true);
               cliente.setVisible(false);
               marca.setVisible(false);
               funcionario.setText("");
               consultar();
               break;
           case 2:
               marca.setVisible(true);
               cliente.setVisible(false);
               funcionario.setVisible(false);
               marca.setText("");
               consultar();
               break;
           default:
               break;
       }
    }
    
    private void consultar(){
        Modelo.setNumRows(0);
        Consultas con = new Consultas();       
        for (Venda att: con.ConsultarHistorico()) {
            Modelo.addRow(new Object[]{att.getId(),att.getCpf_fun(),att.getCpf_cl(),att.getNomeProd(),att.getMarca(),att.getValor(),
                att.getQuant(),att.getData(),att.isCheck()});
        }   
        con.FecharConexao();
    }
      //Deletar varios registros ao memso tempo
      public void Deletar(){
        Deletar del = new Deletar();
        ArrayList<Integer> list = new ArrayList();
        try {
            //Recupera a linha selecionada se o valro for igual a -1 o ususario  
            //não selecionou nada
            int LinSelect = jTable1.getSelectedRow();
            if (LinSelect == -1) {
                JOptionPane.showMessageDialog(null, "Selecione o produto que sera devolvido", "Advertência", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja devolver este produto", "Devolução",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION) {
                //adiciona as colunas que representam as chaves primarias no 
                //banco de dados ao um vetor
                int[] Linha = jTable1.getSelectedRows(); 
                 for (int row = 0; row < Linha.length; row++) {
                     list.add(Integer.parseInt(jTable1.getValueAt(Linha[row], 0).toString()));
                 }
                del.DeleteVenda(list);
                consultar();
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel devolver o produto, verifique!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      public void Atualizar(){
        int LinSelect = jTable1.getSelectedRow();
        if (LinSelect == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o produto que sera atualizado", "Advertência", JOptionPane.WARNING_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar esse registro", "Eliminar",JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                

            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cliente = new javax.swing.JFormattedTextField();
        funcionario = new javax.swing.JFormattedTextField();
        marca = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Funcionário (CPF)", "Cliente (CPF)", "Nome do produto", "Marca", "Preço", "Quantidade", "Data", "Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 920, 330));

        try {
            cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        try {
            funcionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        funcionario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        marca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        marca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                marcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente (CPF)", "Funcionário (CPF)", "Nome de Produto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Devolução");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 140, 40));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("HISTÓRICO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 10));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        ChangeIndice();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Modelo.setNumRows(0);
        Consultas con = new Consultas();
        int inidice = jComboBox1.getSelectedIndex();
        for (Venda att: con.ConsultarHistorico(cliente.getText(),funcionario.getText(), marca.getText(), inidice)) {
            Modelo.addRow(new Object[]{att.getId(),att.getCpf_fun(),att.getCpf_cl(),att.getNomeProd(),att.getMarca(),att.getValor(),
                att.getQuant(),att.getData()});
        }
        con.FecharConexao();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped
         
    }//GEN-LAST:event_marcaKeyTyped

    private void marcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyReleased
         Modelo.setNumRows(0);
        Consultas con = new Consultas();
        int inidice = jComboBox1.getSelectedIndex();
        for (Venda att: con.ConsultarHistorico(cliente.getText(),funcionario.getText(), marca.getText(), inidice)) {
            Modelo.addRow(new Object[]{att.getId(),att.getCpf_fun(),att.getCpf_cl(),att.getNomeProd(),att.getMarca(),att.getValor(),
                att.getQuant(),att.getData()});
        }
        con.FecharConexao();
    }//GEN-LAST:event_marcaKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Deletar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int LinSelec = jTable1.getSelectedRow();
        if (jTable1.getSelectedColumn()==8) {
            boolean check = (boolean) jTable1.getValueAt(LinSelec, 8);
            //Assim que clicar no checkbox ele fica true por isso a condição abaixo é adequada
            if (check) {
               int id = (int) jTable1.getValueAt(LinSelec, 0);
               boolean entrega = (Boolean) Modelo.getValueAt(LinSelec, 8);
               
               //Atauliza a entrega no banco de dados
               Atualizar att = new Atualizar();
               att.AtualizaVenda(id, entrega);
                
               consultar();
               JOptionPane.showMessageDialog(null, "Entrega confirmada");
            }else{
                //caso a opção ja esteja marcada
                int id = (int) jTable1.getValueAt(LinSelec, 0);
                boolean entrega = (Boolean) Modelo.getValueAt(LinSelec, 8);

                //Atauliza a entrega no banco de dados
                Atualizar att = new Atualizar();
                att.AtualizaVenda(id, entrega);

                consultar();
                JOptionPane.showMessageDialog(null, "Confrimado");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JFormattedTextField cliente;
    private javax.swing.JFormattedTextField funcionario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marca;
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