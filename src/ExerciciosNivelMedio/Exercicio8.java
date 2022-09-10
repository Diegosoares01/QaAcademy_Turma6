package ExerciciosNivelMedio;
//Faça um algoritmo para exibir todos os meses digitados anteriormente.
public class Exercicio8 {
    public static void main(String[] args) {
        String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        System.out.println("================");
        System.out.println("Mes- Nome do Mes");
        System.out.println("================");
        //for (int i=0; i<12; i++) {
//            for (int i=0; i < meses.length; i++) {
//                System.out.printf(" %0,2d- %s\n ", (i+1), meses[i]);
//            }
        for(String mes : meses){
            System.out.println(mes);
        }
        System.out.println("================");
        }
    }
