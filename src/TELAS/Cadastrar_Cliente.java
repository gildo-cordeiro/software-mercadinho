/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import BD.Cadastro;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 20151134010213
 */
public class Cadastrar_Cliente extends javax.swing.JFrame {
        
    
    public Cadastrar_Cliente() {
        initComponents();
        //AbrirFrame();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        Backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 30));

        jTextField1.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tel.:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 30));

        jTextField3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 30));

        jTextField4.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bairro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rua:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 30));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nº Casa:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, 30));

        jTextField5.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 60, 30));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setText("MORA PERTO DE ONDE...");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 490, 30));

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Complemento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CPF:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton1.setText("MERCADINHO SAMUEL");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 630, 20));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 110, 40));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo 510x350.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 510, 350));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 660, 420));

        Backgound.setBackground(new java.awt.Color(255, 255, 255));
        Backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        Backgound.setOpaque(true);
        jPanel1.add(Backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        String a = jTextField7.getText();
        if (a.equals("MORA PERTO DE ONDE...")) {
            jTextField7.setText("");
            jTextField7.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTextField1.getText().equals("") || jFormattedTextField1.getText().equals("(  )      -    ") || jTextField3.getText().equals("") ||
                jTextField5.getText().equals("") || jTextField4.getText().equals("") || jTextField7.getText().equals("") || 
                jFormattedTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preecncha todos os campos");
        }else{
            String nome = jTextField1.getText();
            String tel = jFormattedTextField1.getText();
            String rua = jTextField3.getText();
            int numero = Integer.parseInt(jTextField5.getText());
            String bairro = jTextField4.getText();
            String complemento = jTextField7.getText();
            String cpf = jFormattedTextField2.getText();

            Cadastro cliente = new Cadastro();
            cliente.CadastrarClientes(cpf,nome, tel, rua, bairro,numero, complemento);
            jTextField1.setText("");
            jFormattedTextField1.setText("");
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField4.setText("");
            jTextField7.setText("MORA PERTO DE ONDE...");
            jTextField7.setForeground(new Color(204,204,204));
            jFormattedTextField2.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jFormattedTextField1.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField4.setText("");
        jTextField7.setText("MORA PERTO DE ONDE...");
        jTextField7.setForeground(new Color(204,204,204));
        jFormattedTextField2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String a = "0123456789#$%¨&*)(_-+=§!@';.,/?°º][ª}{~^´`";
        if (a.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        String numeros = "0123456789";
        if (!numeros.contains(evt.getKeyChar()+"") || jTextField5.getText().length()>4) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        String a = jTextField7.getText();
        if (a.equals("MORA PERTO DE ONDE...")) {
            jTextField7.setText("");
            jTextField7.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgound;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
    private void AbrirFrame(){
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
