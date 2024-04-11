/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provads_03_04;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Conta {
   
    //MÉTODOS
    public double saldo = 100;
    public double deposito;
    public double saque;
    public int rept;
    void Saldo(){
        JOptionPane.showMessageDialog(null, "Seu saldo é R$"+saldo);
    }
    void Deposito(){
        deposito =  Double.parseDouble(JOptionPane.showInputDialog("Informe em reais (R$) o valor do depósito:"));
        saldo = saldo + deposito;
    }
    void Saque(){
         saque = Double.parseDouble(JOptionPane.showInputDialog("Informe em reais (R$) o valor do saque:"));
         if (saque<=500){
             saldo = saldo - saque;
             JOptionPane.showMessageDialog(null, "Com um saque no valor de R$" + saque + " o seu saldo é de R$"+saldo);
             rept =1;
         }
         else{
            JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo+", logo está abaixo do limite, você não pode realizar esse saque");
            rept = Integer.parseInt(JOptionPane.showInputDialog("Deseja sacar mais algum valor?\n0. Não;\n1.Sim. "));;
         }   
    }
    void Extrato(){
        JOptionPane.showMessageDialog(null, "Seu saldo é de R$" + saldo + "\nFoi realizado um deposito de: " + deposito + "\nFoi realizado um saque de: " +saque);
    }
    
}
