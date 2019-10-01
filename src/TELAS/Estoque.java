/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import BD.Atualizar;
import BD.Cadastro;
import BD.Consultas;
import BD.Deletar;
import CLASSES.Hora;
import CLASSES.produto;
import CLASSES.table;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20151134010213
 */
public class Estoque extends javax.swing.JFrame {

   DefaultTableModel Modelo;
   
    public Estoque() {
        this.dtcr = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                comp.setBackground(new Color(255,0,0));
                String data = (String) jTable1.getValueAt(row, 7);
                JOptionPane.showMessageDialog(null,data);
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date dateTabela = formato.parse(data);
                    dataHoje.setDate(dataHoje.getDate()+5);
                    if (dateTabela.equals(dataHoje)) {
                        comp.setBackground(new Color(255,0,0));
                    }
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Erro");
                }
                return comp;
            }
        };
        initComponents();
        //ModifcarTabela();
        Modelo = (DefaultTableModel) jTable1.getModel();
        marca.setVisible(false);
        nome.setVisible(false);
        consulta();
        ChangeIndice();
        table t = new table();
        t.ModifcarTabelaEstoque(jTable1);
        //AbrirFrame();
    }
    //CORRIGIR ESTE CÓDIGO. DEIXAR DE ACORDO COM O JCOMBOBOX!!!
    private void consulta(){
        Modelo.setNumRows(0);
        Consultas produtos = new Consultas();        
        for (produto prod: produtos.ConsultarProduto()) {
            Modelo.addRow(new Object[]{prod.getNome(), prod.getMarca(),String.format("%.2f",prod.getPreco()), 
                prod.getQuantidade(), prod.getValidade(), prod.getCodigo()});
        }
        produtos.FecharConexao();
    }
    
    public void Deletar(){
        Deletar del = new Deletar();
        ArrayList<String> list = new ArrayList();
        try {
            int LinSelect = jTable1.getSelectedRow();
            if (LinSelect == -1) {
                JOptionPane.showMessageDialog(null, "Selecione o produto que sera deletado", "Advertência", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse registro", "Eliminar",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION) {
                int[] Linha = jTable1.getSelectedRows(); 
                 for (int row = 0; row < Linha.length; row++) {
                     list.add((String) jTable1.getValueAt(Linha[row], 5));
                 }
                del.DeleteProduto(list);
                consulta();
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel apagar o registo, verifique!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Atualizar(){
        int LinSelect = jTable1.getSelectedRow();
        if (LinSelect == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a droga que sera atualizado", "Advertência", JOptionPane.WARNING_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar esse registro", "Eliminar",JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int Linha = Modelo.getRowCount();
                try {
                    for (int row = 0; row < Linha; row++) {
                        String Nome = (String) Modelo.getValueAt(row,0);
                        String Marca = (String) Modelo.getValueAt(row,1);
                        double preco = Double.parseDouble(Modelo.getValueAt(row,2).toString().replace(",", "."));
                        int quantidade = Integer.parseInt(Modelo.getValueAt(row,3).toString());
                        String validade = (String) Modelo.getValueAt(row,4);
                        String codigo = (String) Modelo.getValueAt(row, 5);

                        Atualizar att = new Atualizar();
                        att.AtualizProduto(codigo, Nome, preco, Marca,quantidade, validade);
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
    private void ChangeIndice(){
        int num = jComboBox1.getSelectedIndex();
       switch (num) {
           case 0:
               nome.setVisible(true);
               marca.setVisible(false);
               nome.setText("");
               consulta();
               break;
           case 1:
               marca.setVisible(true);
               nome.setVisible(false);
               marca.setText("");
               consulta();
               break;
           default:
               break;
       }
    }
    
    Date dataHoje = new Date();
    //setando o render para qualquer objeto da jTable
    DefaultTableCellRenderer dtcr;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(204, 204, 204));
        nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeMouseClicked(evt);
            }
        });
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 30));

        marca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        marca.setForeground(new java.awt.Color(204, 204, 204));
        marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcaMouseClicked(evt);
            }
        });
        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Preço", "Quantidade", "Validade", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 580, 210));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 250, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Marca" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 70, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 180, 40));

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preço:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 50, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 80, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Validade:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 30));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 150, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 290, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estoque");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 50));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jButton5.setBackground(new java.awt.Color(0, 102, 0));
        jButton5.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 180, 40));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Deletar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 180, 40));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Marca:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo 400x260.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 400, 260));

        Backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        jPanel1.add(Backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        ChangeIndice();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Hora validar = new Hora(null);
        if (jTextField1.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("")
                || jTextField5.getText().equals("") || jTextField6.getText().equals("") ||
                jFormattedTextField1.getText().equals("  /  ")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos.");
        }else if (validar.ValidandoMes(Integer.parseInt(jFormattedTextField1.getText().substring(0,2)), Integer.parseInt(jFormattedTextField1.getText().substring(3,5)),
                Integer.parseInt(jFormattedTextField1.getText().substring(6,10)),jFormattedTextField1)){
            String codigo = jTextField6.getText();
            String Nome = jTextField1.getText();
            double preco = Double.parseDouble(jTextField3.getText().replace(",", "."));
            int quantidade = Integer.parseInt(jTextField4.getText());
            String Marca = jTextField5.getText();
            String data = jFormattedTextField1.getText();

            Cadastro produto = new Cadastro();
            produto.CadastrarProduto(Nome, preco, Marca, quantidade, data,codigo);
                      
            consulta();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            int inidice = jComboBox1.getSelectedIndex();
            Modelo.setNumRows(0);
            Consultas produtos = new Consultas();        
            for (produto prod: produtos.ConsultarProduto(nome.getText(), marca.getText(), inidice)) {
                Modelo.addRow(new Object[]{prod.getNome(), prod.getMarca(),String.format("%.2f",prod.getPreco()), 
                    prod.getQuantidade(), prod.getValidade(), prod.getCodigo()});
            }
            produtos.FecharConexao();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String a = "0123456789#$%¨&*)(_-+=§!@';.,/?°º][ª}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        String a = "0123456789,";
        if (!a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        String a = "0123456789";
        if (!a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        String a = "0123456789#$%¨=*)(+=§!';.,/?][}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        String a = "/@ç%$&*)(+=!'";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Deletar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Atualizar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMouseClicked
        nome.setForeground(new Color(0,0,0));
            
    }//GEN-LAST:event_nomeMouseClicked

    private void marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaMouseClicked
        marca.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_marcaMouseClicked

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped
        String a = "0123456789#$%¨&*)(_-+=§!@';.,/?°º][ª}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Por favor, informa apenas letras.","Advertência", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_nomeKeyTyped

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped
        String a = "0123456789#$%¨=*)(+=§!';.,/?][}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Por favor, informa apenas letras.", "Advertência", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_marcaKeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgound;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nome;
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
