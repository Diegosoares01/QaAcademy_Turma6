package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
//        String cidade1 = saoPaulo();
//        String cidade2 = santos();
//        String cidade3 = santaCatarina();
//        String cidade4 = vitoria();
//        String cidade5 = pernambuco();

        System.out.println("As cidades são: "+"\n"+ saoPaulo()+" "+"\n"+ santos()+" "+"\n"+santaCatarina()+" "+"\n"+vitoria()+" "+"\n"+pernambuco()+"\n");
        //System.out.println("As cidades são: "+" "+cidade1+" "+cidade2+" "+cidade3+" "+cidade4+" "+cidade5);

    }
    public static String saoPaulo(){
        return "São Paulo";
    }
    public static String santos(){
        return "Santos";
    }
    public static String santaCatarina(){
        return "Santa Catarina";
    }
    public static String vitoria(){
        return "Vitória";
    }
    public static String pernambuco(){
        return "Pernambuco";
    }

}
