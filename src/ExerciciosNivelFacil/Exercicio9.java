package ExerciciosNivelFacil;
import javax.swing.*;
import java.util.Scanner;
/* Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10,
calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100 */
public class Exercicio9 {
    public static void main(String[] args) {
        int multiplicador = 0;
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        while (multiplicador <= 10){
            int resultado = valor * multiplicador;
            System.out.println(+valor +" X " +multiplicador +" = " +resultado);
            multiplicador++;
        }
    }
}