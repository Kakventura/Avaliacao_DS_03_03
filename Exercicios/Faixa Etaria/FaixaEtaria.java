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
public class FaixaEtaria {
   
    String nome, sexo, faixa;
    int id;
    
    void Receber(){

        nome = JOptionPane.showInputDialog("Insira o seu nome");
        sexo = JOptionPane.showInputDialog("Informe o seu sexo biológico");
        id = Integer.parseInt(JOptionPane.showInputDialog("Determine a sua idade:"));
    }
    
    void Classificar(){
        if (id <=0)
            faixa = " Você é um recém-nascido";
        else if(id<=2)
            faixa = " Você é um bebê";
        else if(id<=11)
            faixa = " Você é uma criança";
        else if(id<=19)
            faixa = " Você é um adolescente";
        else if(id<=30)
            faixa = " Você é um jovem";
        else if(id<=60)
            faixa = " Você é um adulto";
        else 
            JOptionPane.showMessageDialog(null, " Você é um idoso.");
    }
    void Imprimir(){
        JOptionPane.showMessageDialog(null,"O seu nome é "+ nome + "\nA sua idade é: "+ id + "\n O seu sexo biológico é: "+sexo+ "\n" + faixa);
    }

}

