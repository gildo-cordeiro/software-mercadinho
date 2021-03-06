/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import CLASSES.Funcionario;
import CLASSES.Hora;
import CLASSES.Venda;

/**
 *
 * @author gildo
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form inicial
     */
    public Inicial() {
        initComponents();
        BloqueioCaixa.setVisible(false);
        BloqueioGerenete.setVisible(false);
        BloqueioFuncCadastrado.setVisible(false);
        VerificarGerente();
        mostrarHora();
    }
    Funcionario at = new Funcionario();
    private void VerificarGerente(){
        if(at.isGer()){
            DESC.setText("GERENTE: "+at.getNomeFun().toUpperCase()+" ");
        }else{
            DESC.setText("FUNCIONÁRIO: "+at.getNomeFun().toUpperCase()+" ");
        }
    }
    private void mostrarHora(){
        Hora h = new Hora(DESC1);
        h.mostrarData(true);
        Thread thHora = h;
        thHora.start();
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
        jLabel2 = new javax.swing.JLabel();
        BloqueioCaixa = new javax.swing.JLabel();
        caixa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BloqueioGerenete = new javax.swing.JLabel();
        gerente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextGer = new javax.swing.JLabel();
        TextCaixa = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DESC1 = new javax.swing.JLabel();
        DESC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BloqueioFuncCadastrado = new javax.swing.JLabel();
        funcCadastrado = new javax.swing.JLabel();
        TextFunCad = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Clientes Cadastrados.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 120));

        BloqueioCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BloqueioCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Bloqueio.png"))); // NOI18N
        BloqueioCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BloqueioCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BloqueioCaixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BloqueioCaixaMouseExited(evt);
            }
        });
        jPanel1.add(BloqueioCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 120, 120));

        caixa.setBackground(new java.awt.Color(255, 255, 255));
        caixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Caixa.png"))); // NOI18N
        caixa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caixaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caixaMouseExited(evt);
            }
        });
        jPanel1.add(caixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 120, 120));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Estoque.png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 120));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Histórico.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 120, 120));

        BloqueioGerenete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BloqueioGerenete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Bloqueio.png"))); // NOI18N
        BloqueioGerenete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BloqueioGerenete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BloqueioGereneteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BloqueioGereneteMouseExited(evt);
            }
        });
        jPanel1.add(BloqueioGerenete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 120));

        gerente.setBackground(new java.awt.Color(255, 255, 255));
        gerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Gerente.png"))); // NOI18N
        gerente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenteMouseEntered(evt);
            }
        });
        jPanel1.add(gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 120));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Nova Venda.png"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOVA VENDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CLIENTES CADASTRADOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ESTOQUE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 120, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HISTÓRICO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 20));

        TextGer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextGer.setForeground(new java.awt.Color(255, 255, 255));
        TextGer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextGer.setText("CRIAR CONTA - FUNCIONÁRIO");
        jPanel1.add(TextGer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 190, 20));

        TextCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextCaixa.setForeground(new java.awt.Color(255, 255, 255));
        TextCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCaixa.setText("CAIXA");
        jPanel1.add(TextCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 120, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Cadastrar Cliente.png"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 120, 120));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CADASTRAR CLIENTES");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo 260x160.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 260, 210));

        DESC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DESC1.setForeground(new java.awt.Color(255, 255, 255));
        DESC1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(DESC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 270, 30));

        DESC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DESC.setForeground(new java.awt.Color(255, 255, 255));
        DESC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(DESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 420, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu - Mercadinho Samuel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 290, 10));

        BloqueioFuncCadastrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BloqueioFuncCadastrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Bloqueio.png"))); // NOI18N
        BloqueioFuncCadastrado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BloqueioFuncCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BloqueioFuncCadastradoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BloqueioFuncCadastradoMouseExited(evt);
            }
        });
        jPanel1.add(BloqueioFuncCadastrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, 120));

        funcCadastrado.setBackground(new java.awt.Color(255, 255, 255));
        funcCadastrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcCadastrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FuncionarioCadastrados.png"))); // NOI18N
        funcCadastrado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        funcCadastrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        funcCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcCadastradoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                funcCadastradoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                funcCadastradoMouseExited(evt);
            }
        });
        jPanel1.add(funcCadastrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, 120));

        TextFunCad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextFunCad.setForeground(new java.awt.Color(255, 255, 255));
        TextFunCad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextFunCad.setText("FUNCIONÁROS CADASTRADOS");
        jPanel1.add(TextFunCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 20));

        Background.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenteMouseEntered
        if(!at.isGer()){
            BloqueioGerenete.setVisible(true);
            gerente.setEnabled(false);
            TextGer.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_gerenteMouseEntered

    private void BloqueioGereneteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioGereneteMouseExited
        BloqueioGerenete.setVisible(false);
        gerente.setEnabled(true);
        TextGer.setText("CRIAR CONTA - FUNCIONARIO");
    }//GEN-LAST:event_BloqueioGereneteMouseExited

    private void caixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaMouseEntered
        if(!at.isGer()){
            BloqueioCaixa.setVisible(true);
            caixa.setEnabled(false);
            TextCaixa.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_caixaMouseEntered

    private void caixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaMouseExited
        BloqueioCaixa.setVisible(false);
        caixa.setEnabled(true);
        TextCaixa.setText("CAIXA");
    }//GEN-LAST:event_caixaMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //this.dispose();
        new Vendas().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //this.dispose();
        new Cadastrar_Cliente().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //this.dispose();
        new Estoque().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //this.dispose();
        new Clientes_cadastrados().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //this.dispose();
        new Historico().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void gerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenteMouseClicked
        //this.dispose();
        new Criar_Fun().setVisible(true);
    }//GEN-LAST:event_gerenteMouseClicked

    private void caixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaMouseClicked
        //this.dispose();
        new Caixa().setVisible(true);
    }//GEN-LAST:event_caixaMouseClicked

    private void BloqueioCaixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioCaixaMouseEntered
        if(!at.isGer()){
            BloqueioCaixa.setVisible(true);
            caixa.setEnabled(false);
            TextCaixa.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_BloqueioCaixaMouseEntered

    private void BloqueioCaixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioCaixaMouseExited
        BloqueioCaixa.setVisible(false);
        caixa.setEnabled(true);
        TextCaixa.setText("CAIXA");
    }//GEN-LAST:event_BloqueioCaixaMouseExited

    private void BloqueioGereneteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioGereneteMouseEntered
         if(!at.isGer()){
            BloqueioGerenete.setVisible(true);
            gerente.setEnabled(false);
            TextGer.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_BloqueioGereneteMouseEntered

    private void funcCadastradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcCadastradoMouseClicked
        new Fun_cadastrados().setVisible(true);
    }//GEN-LAST:event_funcCadastradoMouseClicked

    private void funcCadastradoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcCadastradoMouseEntered
        if(!at.isGer()){
            BloqueioFuncCadastrado.setVisible(true);
            funcCadastrado.setEnabled(false);
            TextFunCad.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_funcCadastradoMouseEntered

    private void funcCadastradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcCadastradoMouseExited
        BloqueioFuncCadastrado.setVisible(false);
        funcCadastrado.setEnabled(true);
        TextFunCad.setText("FUNCIONÁROS CADASTRADOS");
    }//GEN-LAST:event_funcCadastradoMouseExited

    private void BloqueioFuncCadastradoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioFuncCadastradoMouseEntered
        if(!at.isGer()){
            BloqueioFuncCadastrado.setVisible(true);
            funcCadastrado.setEnabled(false);
            TextFunCad.setText("BLOQUEADO");
        }
    }//GEN-LAST:event_BloqueioFuncCadastradoMouseEntered

    private void BloqueioFuncCadastradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloqueioFuncCadastradoMouseExited
        BloqueioFuncCadastrado.setVisible(false);
        funcCadastrado.setEnabled(true);
        TextFunCad.setText("FUNCIONÁROS CADASTRADOS");
    }//GEN-LAST:event_BloqueioFuncCadastradoMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BloqueioCaixa;
    private javax.swing.JLabel BloqueioFuncCadastrado;
    private javax.swing.JLabel BloqueioGerenete;
    private javax.swing.JLabel DESC;
    private javax.swing.JLabel DESC1;
    private javax.swing.JLabel TextCaixa;
    private javax.swing.JLabel TextFunCad;
    private javax.swing.JLabel TextGer;
    private javax.swing.JLabel caixa;
    private javax.swing.JLabel funcCadastrado;
    private javax.swing.JLabel gerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
}
