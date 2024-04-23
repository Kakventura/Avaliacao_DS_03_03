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
public class TestarConta {
     public static void main(String[] args) {
        // INSTANCIAMENTO DE CLASSE
        Conta start = new Conta();
        // VARIAVEL DE DECISÃO DE EXECUÇÃO DO PROGRAMA
        int escolha;
        do{
            
            
            escolha = Integer.parseInt(JOptionPane.showInputDialog(" Bem vindo ao Banco DS!\nEscolha uma das opções abaixo:\n1. Saque Atual;\n2. Depósito;\n3. Saque;\n4. Imprimir Extrato;\n5. Sair."));
            //DECISAO
            switch (escolha){
                case 1:
                    start.Saldo();
                    break;
                case 2:
                    start.Deposito();
                    break;
                case 3:
                    start.Saque();
                    break;
                case 4:
                    start.Extrato();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "O programa está sendo encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
            }
            
        }
        while(escolha == 5) ;
    }
    
}
