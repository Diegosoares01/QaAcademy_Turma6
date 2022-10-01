package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        texto("Diego"," " + "Soares");
        texto2("Diego"," " + "Soares");
        texto3("Diego"," " + "Soares");
        texto4("Diego"," " + "Soares");
        texto5("Diego"," " + "Soares");

        System.out.println(media(10,8));
        System.out.println(mult(10,8));
        System.out.println(div(10,8));
        System.out.println(sub(10,8));
        System.out.println(soma(10,8));
    }
    public static void texto(String a, String b) {
        System.out.println("O texto eh:" + a + b);
    }
    public static void texto2(String a, String b) {
        System.out.println("O texto eh:" + a + b);
    }
    public static void texto3(String a, String b) {
        System.out.println("O texto eh:" + a + b);
    }
    public static void texto4(String a, String b) {
        System.out.println("O texto eh:" + a + b);
    }
    public static void texto5(String a, String b) {
        System.out.println("O texto eh:" + a + b);
    }
    public static double media(double a, double b) {
        return((a + b) / 2);
    }
    public static int mult(int a, int b) {
        return(a * b);
    }
    public static double div(double a, double b) {
        return(a / b);
    }
    public static int sub(int a, int b) {
        return(a - b);
    }
    public static int soma(int a, int b) {
        return(a + b);
    }
}

