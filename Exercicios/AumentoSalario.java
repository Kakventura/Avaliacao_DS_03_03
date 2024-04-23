/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provads_03_04;
import javax.swing.JOptionPane;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class AumentoSalario {
    //CLASSE PRINCIPAL
    public static void main(String[] args) {
        int decisao;
        decisao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de acréscimo ao salário:\n1. Acréscimo com taxa fixa;\n2. Acréscimo com taxa trasnfigurável."));
        if ((decisao == 1) || (decisao == 2)){
            if (decisao == 1)
               Fixo();
            else
                Variavel();
        }
        else
            JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
            
            
    }
    
    // MÉTODOS
    static void Fixo(){
        double salario, acrescimo;
        salario = Double.parseDouble(JOptionPane.showInputDialog("A opção escolhida foi: Salário Fixo \n\nInsira em reais (R$) o valor do salário:"));
        acrescimo =  salario + (salario * 0.10);
        JOptionPane.showMessageDialog(null, "Com um acréscimo fixo de 10%, o seu salário passa de R$" +salario+ " para R$"+ acrescimo);
    }
    
    static void Variavel(){
        double salario, taxa, acrescimo;
        salario = Double.parseDouble(JOptionPane.showInputDialog("A opção escolhida foi: Salário Transfigurável \n\nInsira em reais (R$) o valor do salário:"));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da taxa de acréscimo (%)"));
        acrescimo =  salario + (salario * (taxa/100));
        JOptionPane.showMessageDialog(null, "Com um acréscimo de " + taxa + "%, o seu salário passa de R$" +salario+ " para R$"+ acrescimo);
    }
}
