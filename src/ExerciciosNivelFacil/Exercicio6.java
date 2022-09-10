package ExerciciosNivelFacil;
import java.util.Scanner;
import javax.swing.*;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.
public class Exercicio6 {

    public static void main(String[] args) {
      /*  java.util.Scanner nota = new Scanner(System.in);
        double nota1;
        double nota2;
        System.out.println("Digite a primeira nota");
        nota1 = nota.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = nota.nextDouble();
        double media = (nota1 + nota2) /2;

        System.out.println("Sua média é: " +media);

        if(media < 5) {
            System.out.println("Reprovado");
        }
        else if(media == 5){
            System.out.println("Exame");
        }
            else if(media > 5){
                System.out.println("Aprovado");

        }*/


        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média é: " + media);

        if (media < 5) {
            System.out.println("Reprovado");
        } else if (media == 5) {
            System.out.println("Exame");
        } else if (media > 5) {
            System.out.println("Aprovado");
        }
    }
}
