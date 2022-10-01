package main;

import exemplos.MetodosComRetornoMain;
import exemplos.MetodosSemMain;
import exemplos.MetodosSemRetornoMain;

public class Execucao {
    public static void main(String[] args) {

        MetodosSemMain exec = new MetodosSemMain();
        exec.primeiroMetodo();
        System.out.println(exec.pernambuco());
        System.out.println(exec.soma(10, 100));
        System.out.println(exec.num1 + exec.num2);

        MetodosSemRetornoMain exec2 = new MetodosSemRetornoMain();
        exec2.primeiroMetodo();

        MetodosComRetornoMain exec3 = new MetodosComRetornoMain();
        System.out.println(exec3.saoPaulo());
    }
}
