package exerciciosNivelMedio;
//Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa
//de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//o total. Considerando que a remuneração será no regime de juros compostos.
public class Exercicio2 {
    //public static void main(String[] args) {
    public void jurosCompostos() {
        double amount; // quantia em deposito ao fim de cada ano
        double investimento = 1000.0; // quantidade inicial antes dos juros
        double juros = 0.05; // taxa de juros

        // exibe cabeçalho
        System.out.printf("%s%20s %n", "Ano      ", "Valor do Deposito");

        // calcula quantidade de deposito para cada um dos dez anos
        for (int anos = 1; anos <= 10; ++anos) {

            // calcula nova quantidade durante ano especificado
            amount = investimento * Math.pow(1.0 + juros, anos);

            //exibe o ano e a quantidade
            System.out.printf("%4d%,20.2f%n", anos, amount);


        }
    }
}