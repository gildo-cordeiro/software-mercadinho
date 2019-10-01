/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import BD.Cadastro;
import BD.Consultas;
import CLASSES.Cliente;
import CLASSES.produto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gildo
 */
public class Vendas extends javax.swing.JFrame {
    
    DefaultTableModel Modelo;
    public Vendas() {
        initComponents();
        Modelo = (DefaultTableModel) jTable1.getModel();
        jTextField1.grabFocus();
        combo();
        jTextField2.setText(1+"");
        dica.setVisible(false);
        dica2.setVisible(false);
        contador.setVisible(false);
        finalizar.setVisible(false);
        //dica();
        //AbrirFrame();
    }
    
        double valor = 0; 
        static String codigo;
        static String cpf_fun = Consultas.log;
        static String cpf_cli=null;
        static double soma=0;
        static int a;
        int cont = 10;
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = formatar.format(data);
        
    
    private void combo(){
        Consultas list = new  Consultas(); 
        jComboBox1.addItem("Selecione um Cliente");
        for (Cliente atr: list.ComboBox()) {
            jComboBox1.addItem(atr.getCpf()+" ("+atr.getNome()+")");
        }
    }
    private void Selecionar(){
        if (jComboBox1.getSelectedIndex()==0) {
            cpf_cli = "";
            JOptionPane.showMessageDialog(null, "Selcione o CPF e Nome de um cliente.","Advertência",JOptionPane.WARNING_MESSAGE);
        } else {
            String p = (String) jComboBox1.getSelectedItem();
            String b = p.substring(0,14);
            cpf_cli = b;
            JOptionPane.showMessageDialog(null, "OK");
        }
    }
    private void consulta(){ 
        Consultas con = new Consultas();  
           for (produto att: con.ConsultarVenda(codigo)) {
               Modelo.addRow(new Object[]{codigo,att.getNome(),att.getMarca(),String.format("%.2f",valor),a});
        }
        con.FecharConexao();
    }
    public void ZerarCampos(){
        jLabel8.setText("Total");
        jLabel8.setForeground(new Color(153,153,153));
        jLabel2.setText("VALOR UNITARIO");
        jLabel2.setForeground(new Color(153,153,153));
        Modelo.setNumRows(0);
        jTextField3.setText("");
        jLabel4.setText("Troco");
        jLabel4.setForeground(new Color(153,153,153));
        jComboBox1.setSelectedIndex(0);
        soma = 0;cpf_cli=null;
    }
    /*private void dica(){
        final Timer timer = new Timer(); //new timer
        TimerTask task = new TimerTask() {         
            public void run() {                
                cont --;
                if (cont == -1){
                    timer.cancel();   
                    dica.setVisible(false);
                    dica2.setVisible(false);
                } 
                contador.setText("Dica sumira em: "+cont);
            }
        };
    timer.scheduleAtFixedRate(task, 1000, 1000); // =  1000 = a delay de 1 segundo no contador;
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        dica = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        dica2 = new javax.swing.JLabel();
        Backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 20));

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quantidade");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Recebido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Marca", "Preço (Unidade)", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 550, 240));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 290, 40));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 110, 40));

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Slecionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 90, 30));

        fechar.setBackground(new java.awt.Color(0, 102, 0));
        fechar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        fechar.setForeground(new java.awt.Color(255, 255, 255));
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        jPanel1.add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, 40));

        finalizar.setBackground(new java.awt.Color(0, 102, 0));
        finalizar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 255, 255));
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        jPanel1.add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 210, 90));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VALOR UNITARIO");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 210, 60));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Troco");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 250, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo 300x200.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 310, 210));

        jTextField3.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 250, 40));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código de Barras");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 30));

        jTextField2.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 70, 40));

        dica.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        dica.setForeground(new java.awt.Color(255, 255, 255));
        dica.setText(" Selecione o cliente e depois aperte");
        jPanel1.add(dica, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 210, 30));

        contador.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        contador.setForeground(new java.awt.Color(255, 255, 255));
        contador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 160, 20));

        dica2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        dica2.setForeground(new java.awt.Color(255, 255, 255));
        dica2.setText(" o botão selecionar");
        jPanel1.add(dica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 160, -1));

        Backgound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        jPanel1.add(Backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        Consultas produtos = new Consultas();        
        for (produto prod: produtos.VenderProduto(jTextField1.getText())) {
            codigo=prod.getCodigo();
            valor = prod.getPreco();
            a = Integer.parseInt(jTextField2.getText());
            double valor2 = valor*a;
            soma += valor2;
            jLabel8.setText(soma+"");
            jLabel8.setText(String.format("%.2f",soma));
            jLabel8.setForeground(new Color(0,0,0));
            jLabel2.setText(String.format("%.2f",valor));
            jLabel2.setForeground(new Color(0,0,0));
            jTextField1.setText("");
            jTextField2.setText(1+"");
            consulta();
        }
        produtos.FecharConexao();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        //String text = jTextField3.getText();
        
    }//GEN-LAST:event_jTextField3KeyReleased

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        Cadastro c = new Cadastro();
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza?",null, JOptionPane.YES_NO_OPTION);
        if (resposta==JOptionPane.YES_OPTION) {
            if (codigo==null || a <=0) {
                JOptionPane.showMessageDialog(null, "Nenhum porduto selecionado","Advertência",JOptionPane.WARNING_MESSAGE);
            } else {
                for (int row = 0; row < Modelo.getRowCount(); row++) {
                    String codi = (String) jTable1.getValueAt(row, 0);
                    int quant = (int) jTable1.getValueAt(row, 4);
                    if(cpf_cli==null){
                        c.CadastrarVendaSemCliente(cpf_fun, codi, quant, dataFormatada);
                        JOptionPane.showMessageDialog(null, "Finalizado.");
                        //JOptionPane.showMessageDialog(null, cpf_fun+" - "+codi+" - "+quant+" - "+dataFormatada);
                    }else{
                        c.CadastrarVenda(cpf_fun, cpf_cli, codi, quant, dataFormatada);
                        JOptionPane.showMessageDialog(null, "Finalizado.");
                        //JOptionPane.showMessageDialog(null, cpf_fun+" - "+cpf_cli+" - "+codi+" - "+quant+" - "+dataFormatada);
                    }   
                }
                finalizar.setVisible(false);fechar.setVisible(true);
                ZerarCampos();
            }
        }
    }//GEN-LAST:event_finalizarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Selecionar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        Consultas produtos = new Consultas();        
        for (produto prod: produtos.VenderProduto(jTextField1.getText())) {
            valor = prod.getPreco();
            a = Integer.parseInt(jTextField2.getText());
            double valor2 = valor*a;
            soma += valor2;
            jLabel8.setText(String.format("%.2f",soma));
            jLabel2.setText(String.format("%.2f",valor));
            jTextField1.setText("");
            jTextField2.setText(1+"");
            codigo=prod.getCodigo();
            consulta();
            jTextField1.grabFocus();
        }
        produtos.FecharConexao();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o dinheiro recebido.");
        }else{ 
            double num = Double.parseDouble(jTextField3.getText().replace(",", "."));
            if (jLabel8.getText().equals("Total")) {
                JOptionPane.showMessageDialog(null, "Não a valor no campo \"Total\"" ,"Advertência",JOptionPane.WARNING_MESSAGE);
            }else{
                if (num > soma) {
                    JOptionPane meuPane = new JOptionPane("Fechando venda...",JOptionPane.WIDTH);
                    final JDialog dialog = meuPane.createDialog(null,"Advertência");
                    dialog.setModal(true);
                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ev) {
                            dialog.dispose();//To change body of generated methods, choose Tools | Templates.
                        }
                    });
                    timer.start();
                    dialog.setVisible(true);
                    timer.stop();
                    jLabel4.setText(String.format("%.2f",(num-soma)));
                    jLabel4.setForeground(new Color(0,0,0));
                    finalizar.setVisible(true);
                    fechar.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dinheiro insuficiente!","Advertência",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_fecharActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ZerarCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        String c = "0123456789";
        if (!c.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        String c = "0123456789,";
        if (!c.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        jTextField2.setText(1+"");
    }//GEN-LAST:event_jTextField2FocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgound;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel dica;
    private javax.swing.JLabel dica2;
    private javax.swing.JButton fechar;
    private javax.swing.JButton finalizar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
