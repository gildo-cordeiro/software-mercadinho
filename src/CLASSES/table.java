/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import TELAS.Historico;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author 20151134010213
 */
public class table extends JFrame{
    Date dataHoje = new Date();
    public JComponent cores(DefaultTableModel defaultTableModel){
        JTable jtable = new JTable(defaultTableModel){
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int row, int column){
                Component componet = super.prepareRenderer(renderer, row, column);
                if (!isRowSelected(row)) {
                    componet.setBackground(getBackground());
                    int linha = convertRowIndexToModel(row);
                    String data = (String) getModel().getValueAt(linha, 7);
                    JOptionPane.showMessageDialog(null,data);
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date dateTabela = formato.parse(data);
                        dataHoje.setDate(dataHoje.getDate()+5);
                        if (dateTabela.equals(dataHoje)) {
                            componet.setBackground(new Color(255,0,0));
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return componet;
            } 
        };
        return jtable;
    }
    
        
    public void ModifcarTabelaEstoque(JTable Table){
        //Redimensiona a coluna do jtable
        Table.getColumnModel().getColumn(0).setPreferredWidth(300);
        Table.getColumnModel().getColumn(1).setPreferredWidth(300);
        Table.getColumnModel().getColumn(2).setPreferredWidth(150);
        Table.getColumnModel().getColumn(3).setPreferredWidth(200);
        Table.getColumnModel().getColumn(4).setPreferredWidth(300);
        Table.getColumnModel().getColumn(5).setPreferredWidth(300);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(4).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(5).setCellRenderer(Centro_cedula);
        
    }
    
    public void ModifcarTabelaClientes(JTable Table){
        //Redimensiona a coluna do jtable
        Table.getColumnModel().getColumn(0).setPreferredWidth(300);
        Table.getColumnModel().getColumn(1).setPreferredWidth(500);
        Table.getColumnModel().getColumn(2).setPreferredWidth(300);
        Table.getColumnModel().getColumn(3).setPreferredWidth(300);
        Table.getColumnModel().getColumn(4).setPreferredWidth(100);
        Table.getColumnModel().getColumn(5).setPreferredWidth(300);
        Table.getColumnModel().getColumn(6).setPreferredWidth(300);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
         DefaultTableCellRenderer Left_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        Left_cedula.setHorizontalAlignment(SwingConstants.LEFT);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(4).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(5).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(6).setCellRenderer(Left_cedula);
        
    }
    public void ModifcarTabelaHistorico(JTable Table){
        //Redimensiona a coluna do jtable
        Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(300);
        Table.getColumnModel().getColumn(2).setPreferredWidth(300);
        Table.getColumnModel().getColumn(3).setPreferredWidth(300);
        Table.getColumnModel().getColumn(4).setPreferredWidth(300);
        Table.getColumnModel().getColumn(5).setPreferredWidth(150);
        Table.getColumnModel().getColumn(6).setPreferredWidth(250);
        Table.getColumnModel().getColumn(7).setPreferredWidth(400);
        Table.getColumnModel().getColumn(8).setPreferredWidth(150);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(4).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(5).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(6).setCellRenderer(Centro_cedula);
        
    }
    public void ModifcarTabelaFun(JTable Table){
        //Redimensiona a coluna do jtable
        Table.getColumnModel().getColumn(0).setPreferredWidth(250);
        Table.getColumnModel().getColumn(1).setPreferredWidth(480);
        Table.getColumnModel().getColumn(2).setPreferredWidth(380);
        Table.getColumnModel().getColumn(3).setPreferredWidth(270);
        Table.getColumnModel().getColumn(4).setPreferredWidth(230);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
         DefaultTableCellRenderer Left_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        Left_cedula.setHorizontalAlignment(SwingConstants.LEFT);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(4).setCellRenderer(Left_cedula);
        
    }
    public void ModifcarTabelaCaixa(JTable Table){
        //Redimensiona a coluna do jtable
        Table.getColumnModel().getColumn(0).setPreferredWidth(480);
        Table.getColumnModel().getColumn(1).setPreferredWidth(270);
        Table.getColumnModel().getColumn(2).setPreferredWidth(290);
        Table.getColumnModel().getColumn(3).setPreferredWidth(200);
        Table.getColumnModel().getColumn(4).setPreferredWidth(200);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
         DefaultTableCellRenderer Left_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        Left_cedula.setHorizontalAlignment(SwingConstants.LEFT);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Left_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(4).setCellRenderer(Centro_cedula);
        
    }
}
