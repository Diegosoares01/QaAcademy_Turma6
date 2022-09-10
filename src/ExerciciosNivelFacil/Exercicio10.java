package ExerciciosNivelFacil;
import java.util.Scanner;
/*Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
juros e o total com juros. Considerando que a remuneração será no regime de
juros simples. */
public class Exercicio10 {
    public static void main(String[] args){
//A fórmula de cálculo é: J = C*i*t. Sendo que o J são os juros e o C é o capital. O i é a taxa de juros e t é o tempo.
        int valorinvestimento = 1000;
        double taxa = 0.05;
        double valorjuros = 0;
        double valortotal = 0;
        int i = 1;
//juros simples:
        while (i <= 10) {
            valorjuros = ((valorinvestimento+valorjuros)*taxa)+valorjuros;
            System.out.println("Valor investido: " + valorinvestimento);
            System.out.println("Valor dos juros ao ano: " + valorjuros + " a.a");
            valortotal = valorinvestimento + valorjuros;
            System.out.println("Valor total com juros é: " + valortotal);
        i=i+1;
        }
//juros compostos:


//Outro modo de ser feito, com digitação no painel:
        int temp;
        double valor;
        float juros;
        double remuneracao;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar o valor a ser investido: ");
        valor = scanner.nextInt();
        System.out.println("Informar o valor da taxa de juros: ");
        juros = scanner.nextInt();
        System.out.println("Informar o tempo que pretende investir: ");
        temp = scanner.nextInt();

        remuneracao = valor * juros/100 * temp;
        System.out.println("Valor investido: " +valor);
        System.out.println("Valor do juros: " +juros+ " a.a");
        System.out.println("Valor total com juros é: " +remuneracao);


    }
}
