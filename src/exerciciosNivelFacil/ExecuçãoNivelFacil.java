package exerciciosNivelFacil;

import java.sql.SQLOutput;

public class ExecuçãoNivelFacil {
    public static void main(String[] args) {
        Main exec1 = new Main();
        exec1.nome();
        //System.out.println(exec1.nome2());

        Exercicio2 exec2 = new Exercicio2();
        System.out.println(exec2.exibirPalavra("Diego"));

        Exercicio3 exec3 = new Exercicio3();
        System.out.println(exec3.troca(1, 2));

        Exercicio4 exec4 = new Exercicio4();
        System.out.println(exec4.soma(10));

        Exercicio5 exec5 = new Exercicio5();
        System.out.println(exec5.numeros(2, 2, 2));

        Exercicio6 exec6 = new Exercicio6();
        System.out.println("Sua media eh: " +exec6.media(4, 10));

        Exercicio7 exec7 = new Exercicio7();
        System.out.println(exec7.salario(2000.00));

        Exercicio8 exec8 = new Exercicio8();
        System.out.println(exec8.salario(2503.9));

        Exercicio9 exec9 = new Exercicio9();
        System.out.println(exec9.mult(5));

        Exercicio10 exec10 = new Exercicio10();
        System.out.println(exec10.investimento(10000.00));

        Exercicio11 exec11 = new Exercicio11();
        System.out.println(exec11.soma(10));
   }
}
