/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import BD.Atualizar;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author gildo
 */
public class Hora extends Thread{
    private final JLabel hr;
    private boolean mostrarData;
    
    public Hora(JLabel hora){
        this.hr=hora;
    }
    public void mostrarData(boolean mostrar){
        this.mostrarData = mostrar;
    }
    @Override
    public void run(){
        try {
            while(true){
                Date dat = new Date();
                StringBuffer data = new StringBuffer();
                if (mostrarData) {
                    SimpleDateFormat CalendarioData = new SimpleDateFormat("dd/MM/yyyy");
                    data.append(CalendarioData.format(dat));
                    data.append(" - ");
                }
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                this.hr.setText(data.toString() + sdf.format(dat));
                Thread.sleep(1000);
                this.hr.revalidate();
            }
        } catch (Exception e) {
            System.out.println("Problema na atualização da data/hora");
            e.printStackTrace();
        }
    }
    
    public boolean ValidandoMes(int dia, int mes,int ano, JFormattedTextField JForm) {
        Date data = new Date();
        SimpleDateFormat Dia = new SimpleDateFormat("dd");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Ano = new SimpleDateFormat("yyyy");
        int diaFormatado= Integer.parseInt(Dia.format(data));
        int mesFormatado = Integer.parseInt(Mes.format(data));
        int anoFormatado= Integer.parseInt(Ano.format(data));
        
        if (((dia < 1 || dia < diaFormatado) || dia > 31) && ano <= anoFormatado) {
            JOptionPane.showMessageDialog(null, "Data de validade invalida!");
            JForm.setText("");
            return false;
        } else if (((mes < 1 || mes < mesFormatado) || mes > 12) && ano <= anoFormatado) {
            JOptionPane.showMessageDialog(null, "Data de validade invalida!");
            JForm.setText("");
            return false;
        }else if(ano < anoFormatado){
            JOptionPane.showMessageDialog(null, "Data de validade invalida!");
            JForm.setText("");
            return false;
        } else {
            return true;
        }
    }
}
