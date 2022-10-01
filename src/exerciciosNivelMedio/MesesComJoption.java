package exerciciosNivelMedio;

import javax.swing.*;

public class MesesComJoption {
    static int num = 0;

    //Faça um algoritmo para exibir todos os meses digitados na tela.
        public static void main(String[] args) {
            String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero referente ao mes:"));
            if(num>12){
                solicitar();
            }
           if (num <13){
               System.out.println("O Mes eh: " +meses[num-1]);
           }
        }
        public static void solicitar (){
            System.out.println("Digite o numero correto. 1 até 12");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero referente ao mes:"));
            if (num>=13) {
                solicitar();
            }
        }
}
