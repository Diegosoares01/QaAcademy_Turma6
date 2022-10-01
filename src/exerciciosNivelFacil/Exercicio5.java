package exerciciosNivelFacil;

import javax.swing.*;

//Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//digitados.
public class Exercicio5 {
    public String numeros(int num1, int num2, int num3){

        System.out.println("A soma dos numeros eh:"+" "+(num1 + num2 + num3));
        System.out.println("A subtracao dos numeros eh:" +(num1 - num2 - num3));
        System.out.println("A multiplicacao dos numeros eh:"+" "+num1 * num2 * num3);
        System.out.println("A média dos numeros eh:"+" "+(num1 + num2 + num3)/3);

        return (""+num1 + num2 + num3);
    }

}
//    public static void main(String[] args){
//
//        int var1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero numero"));
//        int var2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
//        int var3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
//
//        System.out.println("Os numeros sao: ");
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
//
//        int soma = var1 + var2 + var3;
//        System.out.println("A soma dos numeros eh: " +soma);
//
//        int sub = var1 - var2 - var3;
//        System.out.println("A subtracao dos numeros eh: " +sub);
//
//        int mult = var1 * var2 * var3;
//        System.out.println("A multiplicacao dos numeros eh: " +mult);
//
//        double med = (var1 + var2 + var3) / 3;
//        System.out.println("A media dos numeros eh: " +med);
//    }
//}
//Inicio Algoritmo
//Declarar variáveis numéricas: numero1, numero2 e numero3;
//Declarar variáveis numéricas: soma, subtração, multiplicação, media;
//numero1 = Ler(10);
//numero2 = Ler(20);
//numero3 = Ler(30);
//soma = numero1 + numero2 + numero3;
//subtracao = numero1 - numero2 - numero3;
//multiplicacao = numero1 * numero2 * numero3;
//media = soma / 3;
//Exibir: “A soma dos números digitados é: ”+soma;
//Exibir:  “A subtração dos números digitados é: ”+ subtração;
//Exibir:  “A multiplicacaodos números digitados é: ” +multiplicacao;
//Exibir: “A  media dos números digitados é: ” +media;
//Fim Algoritmo