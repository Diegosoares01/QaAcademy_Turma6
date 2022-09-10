package ExerciciosNivelFacil;
/*Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número
digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
completar 100 iterações. */
public class Exercicio11 {
    public static void main (String[] args){
        int num = 0;
        int i = 0;

        while (i <= 100) {
            num = num + 2;
            System.out.println(num);
            i=i+1;
        }
    }
}
