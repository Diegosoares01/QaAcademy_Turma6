package ExerciciosNivelFacil;

import javax.swing.*;

//Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
//variável, calcular o dobro, e exibir
public class Exercicio4 {
    public static void main (String [] args){
        /*int num1 = 100;
        int num2 = num1 * 2;

        System.out.println("O numero é:  " + num1);
        System.out.println("Numero é dobrado = " + num2);*/

//Usando a caixa de dialogo:
       int num1, result;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        result = num1 * 2;
        //System.out.println("Numero dobrado é: " + result);
        JOptionPane.showMessageDialog(null, result);
    }
}
//Inicio Algoritmo
//	Declarar variável do tipo numérico : num1, result;
//	num1 =  Ler(6);
//	result= num1*2;
//	Exibir: “O dobro é: ” + result;
//Fim Algoritmo