import java.util.ArrayList;
import java.util.HashMap;

public class ExemplosJava3 {
    public static void main(String[] args) {
//        criandoArray();
//        criandoHashMap();
        tratandoExcessao();
    }
    public static void criandoArray(){
//        String [] nomes = new String[10];
//        nomes[0] = "Diego";
//        nomes[1] = "Soares";

        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Diego");
        nomes.add("Soares");
        System.out.println(nomes.get(1));
    }
    public static void criandoHashMap(){
        HashMap<Integer,String>nomes = new HashMap<>();
        nomes.put(10, "Larissa");
        nomes.put(20, "Gomes");
        System.out.println(nomes.get(20));
    }
    public static void tratandoExcessao(){
        String numero = "10xyz";
        try {
            int num = Integer.parseInt(numero);
            System.out.println(num);
        } catch (Exception e) {
            throw new RuntimeException("Parse Inválido");
        }
    }
}
