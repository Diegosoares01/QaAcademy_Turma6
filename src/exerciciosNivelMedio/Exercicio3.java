package exerciciosNivelMedio;

//Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
//números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).
public class Exercicio3 {

    //public static void main(String[] args) {
    public  void somaNumeros() {
       int i = 0, soma = 0;

        while (i <= 1000) {
            soma = i + soma;
            //i++;
            if (soma >= 1500) {
                break;
            }
            System.out.println(soma);
            i++;
        }
    }
}
 /*       int i = 0, soma = 0;
        while (i <= 1000 && soma <= 1500) {
            soma = i + soma;
            i++;
        }
    }
}
*/