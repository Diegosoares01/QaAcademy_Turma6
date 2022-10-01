package exerciciosNivelMedio;
import javax.swing.*;

//Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor
public class Exercicio5 {
        /*private static final Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int i = 1;
            System.out.print("n" + i + ": ");
            int numero = sc.nextInt();
            int menor = numero;
            for (i = 2; i <= 5; i++) {
                System.out.print("n" + i + ": ");
                numero = sc.nextInt();
                if (numero < menor) {
                    menor = numero;

                }
            }
            System.out.println("O menor numero e o " + menor);
        }
    }
*/
//Inicio Algoritmo
//
//        	Declarar variável numérica: i = 1, anterior,
//numeroDigitado;
//
//        	Enquanto(i<=5)
//numeroDigitado = Ler();
//Se(numeroDigitado < anterior || i==1)
//  anterior = numeroDigitado;
//Fim Se
//i++;
//        	Fim Enquanto
//
//Exibir (“O menor digitado é: ”+anterior);
//
//Fim Algoritmo


//Abaixo cod para achar o maior numero:

/*
public class Exercicio5 {

        private static final Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int i = 1;
            System.out.print("n" + i + ": ");
            int numero = sc.nextInt();
            int maior = numero;
            for (i = 2; i <= 5; i++) {
                System.out.print("n" + i + ": ");
                numero = sc.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
            }
            System.out.println("O maior numero e o " + maior);
        }
    }

 */
//Com JoptionPane
    public static void main(String[] args) {
        int i = 1, anterior = 0, numDigitado;

        while(i<=5){
            numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros"));
            if (numDigitado < anterior || i==1) {
                anterior = numDigitado;
            }
            i++;
            }
        JOptionPane.showMessageDialog(null, anterior,"Menor numero eh o: ",-1, null);
    }
}