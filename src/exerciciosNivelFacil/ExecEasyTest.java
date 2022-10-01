package exerciciosNivelFacil;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exec2EasyTest {
    @Test
    public void testeDeJuncaoPalavra(){
//        Exercicio2 exec2 = new Exercicio2();
//        exec2.exibirPalavra("Vote 22");
//        assertEquals("A palavra eh: Vote 22",exec2.exibirPalavra("Vote 22") );

        Exercicio3 exec3 = new Exercicio3();
        exec3.troca(3, 4);
        assertEquals("Troca 43",exec3.troca(3, 4));
    }
}
