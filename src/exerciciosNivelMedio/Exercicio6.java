package exerciciosNivelMedio;
import javax.swing.*;
import java.util.Scanner;

//6-) Faça um algoritmo para ler um número inteiro, calcular e
// exibir o Fatorial do número digitado.
// Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;
           // System.out.println("Digite um numero");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber o fatorial."));
           // num = ent.nextInt();

            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            System.out.println("!" + num + " = " + fat);
            cont++;
        }
    }

