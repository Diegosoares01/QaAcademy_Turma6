package exerciciosNivelFacil;

/*Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
exibir os valores das variáveis, trocados.*/
public class Exercicio3 {

       public String troca(int a, int b) {
        int c = a;
        a = b;
        b = c;

        return ("Troca " +a + b);
    }
}
//    public static void main(String[] args) {
//        int var1 = 100;
//        int var2 = 200;
//
//        System.out.println("Antes de trocar");
//        System.out.println("Var 1 = " + var1);
//        System.out.println("Var 2 = " + var2);
//
//        int var3 = var1;
//        var1 = var2;
//        var2 = var3;
//
//        System.out.println("Depois de trocar");
//        System.out.println("Var 1 = " + var1);
//        System.out.println("Var 2 = " + var2);
//    }
//}
////Usando caixa de dialogo
//        String var1, var2, var3;
//
//        var1 = (JOptionPane.showInputDialog("Digite o primeiro."));
//        var2 = (JOptionPane.showInputDialog("Digite o segundo."));
//
//        System.out.println("Antes de trocar");
//        System.out.println("O nome eh: " + var1 + " " + var2);
//
//        var3 = var1;
//        var1 = var2;
//        var2 = var3;
//
//        System.out.println("Depois de trocar");
//        System.out.println("O nome agora eh: " + var1 + " " + var2);
//       // System.out.println("numero 2 agora eh o um = " + var2);
//    }
//}
//Ex1:
//Inicio Algoritmo
//	Declarar variáveis do tipo texto : nome, sobrenome;
//	nome = Ler(“Silas”);
//	sobrenome = Ler(“Leão”);
//                 Exibir: “O nome é ” + sobrenome + nome;
//Fim Algoritmo
//Ex2:
//Inicio Algoritmo
//	Declarar variáveis do tipo texto : nome, sobrenome, auxiliar;
//	nome = Ler(“Silas”);
//	sobrenome = Ler(“Leão”);
//	auxiliar = nome;
//	nome = sobrenome;
//             sobrenome = auxiliar;
//              Exibir: “O nome é ” + nome + sobrenome;
//Fim Algoritmo