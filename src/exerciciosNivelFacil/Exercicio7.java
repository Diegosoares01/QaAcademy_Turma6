package exerciciosNivelFacil;
import java.util.Scanner;
//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

public class Exercicio7{
   //public double sal = 65.00, val;
    public double salario(double sal){
        double val = 0;
        if(sal <= 1045.00){
            val = sal * 0.075;
            System.out.println("Valor INSS sera: " + val);
        }
        if((sal >= 1045.01) && (sal <= 2089.60)){
            val = sal * 0.09;
            System.out.print("Valor do INSS sera: " + val);
        }
        if((sal >= 2089.61) && (sal <= 3134.40)){
            val = sal * 0.12;
            System.out.println("Valor do INSS sera: " + val);
        }
        if(sal >= 3134.40){
            val = sal * 0.14;
            System.out.println("Valor do INSS sera: " + val);
        }
        return sal;
    }
}
//    public static void main(String args[]) {
//        java.util.Scanner salario = new Scanner(System.in);
//        Double sal, val;
//        System.out.print("Digite o valor do seu salário: ");
//        sal = salario.nextDouble();
//
//        if(sal <= 1045.00){
//            val = sal * 0.075;
//        System.out.println("Valor INSS será: " + val);
//        }
//        if((sal >= 1045.01) && (sal <= 2089.60)){
//            val = sal * 0.09;
//            System.out.print("Valor do INSS será: " + val);
//        }
//        if((sal >= 2089.61) && (sal <= 3134.40)){
//            val = sal * 0.12;
//            System.out.println("Valor do INSS será: " + val);
//        }
//        if(sal >= 3134.40){
//            val = sal * 0.14;
//            System.out.println("Valor do INSS será: " + val);
//        }
//
//    }
//
//}
