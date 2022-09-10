package ExerciciosNivelFacil;
import java.util.Scanner;
/*Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do salário bruto, valor do salário líquido e o valor do imposto de renda.*/

public class Exercicio8{
    public static void main(String args[]) {
        java.util.Scanner salario = new Scanner(System.in);
        Double sal, val, imps, liq, ir;
        System.out.print("Digite o valor do seu salário: ");
        sal = salario.nextDouble();

        if (sal <= 1903.98) {
            val = sal * 1;
            /*imps = val * 0.075;*/
            ir = sal * 0;
            liq = sal - ir;
            System.out.println("Valor salário bruto é: " + val);
            System.out.println("Valor salário líquido é: " + liq);
            System.out.println("Valor do imposto cobrado é: " + ir);
        }
        if ((sal >= 1903.99) && (sal <= 2826.65)) {
            val = sal * 1;
            /*imps = val * 0.075;*/
            ir = (sal * 0.075) - 142.8;
            liq = sal - ir;
            System.out.println("Valor salário bruto é: " + val);
            System.out.println("Valor salário líquido é: " + liq);
            System.out.println("Valor do imposto cobrado é: " + ir);
        }
        if ((sal >= 2826.66) && (sal <= 3751.05)) {
            val = sal * 1;
            /*imps = val * 0.075;*/
            ir = (sal * 0.15) - 354.8;
            liq = sal - ir;
            System.out.println("Valor salário bruto é: " + val);
            System.out.println("Valor salário líquido é: " + liq);
            System.out.println("Valor do imposto cobrado é: " + ir);
        }
        if ((sal >= 3751.06) && (sal <= 4664.68)) {
            val = sal * 1;
            /*imps = val * 0.075;*/
            ir = (sal * 0.225) - 636.13;
            liq = sal - ir;
            System.out.println("Valor salário bruto é: " + val);
            System.out.println("Valor salário líquido é: " + liq);
            System.out.println("Valor do imposto cobrado é: " + ir);
        }
        if (sal > 4664.69) {
            val = sal * 1;
            /*imps = val * 0.075;*/
            ir = (sal * 0.275) - 869.36;
            liq = sal - ir;
            System.out.println("Valor salário bruto é: " + val);
            System.out.println("Valor salário líquido é: " + liq);
            System.out.println("Valor do imposto cobrado é: " + ir);
        }
    }
}
