package br.com.wmixvideo.sped.contribuicoes;

import br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0.SC0000AberturaArquivoDigital;
import br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0.SC0001AberturaBloco0;
import org.junit.Assert;
import org.junit.Test;

public class SCSpedContribuicoesTest {

    @Test
    public void arquivoVazioTest() {
        Assert.assertEquals("", new SCSpedContribuicoes().toString());
    }

    @Test
    public void arquivoUmaLinhaTest() {
        final SCSpedContribuicoes sped = new SCSpedContribuicoes();
        sped.getBloco0().addLinha(new SC0000AberturaArquivoDigital());
        Assert.assertEquals("|0000|3.1.0|||||||||||||" + System.lineSeparator(), sped.toString());
    }

    @Test
    public void arquivoDuasLinhasTest() {
        final SCSpedContribuicoes sped = new SCSpedContribuicoes();
        sped.getBloco0().addLinha(new SC0000AberturaArquivoDigital());
        sped.getBloco0().addLinha(new SC0001AberturaBloco0());
        Assert.assertEquals("|0000|3.1.0|||||||||||||" + System.lineSeparator() + "|0001||" + System.lineSeparator(), sped.toString());
    }
}
