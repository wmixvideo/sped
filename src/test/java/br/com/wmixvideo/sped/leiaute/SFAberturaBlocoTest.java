package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimentoAberturaBloco;
import org.junit.Assert;
import org.junit.Test;

public class SFAberturaBlocoTest {

    @Test
    public void deveGerarTextoComCodigoDoRegistro() {
        Assert.assertEquals("|1234|0|", new SFAberturaBloco("1234", SFIndicadorMovimentoAberturaBloco.COM).toString());
    }

    @Test
    public void deveGerarTextoComDadosInformados() {
        Assert.assertEquals("||0|", new SFAberturaBloco("", SFIndicadorMovimentoAberturaBloco.COM).toString());
    }

    @Test
    public void deveGerarTextoSemDadosInformados() {
        Assert.assertEquals("||1|", new SFAberturaBloco("", SFIndicadorMovimentoAberturaBloco.SEM).toString());
    }
}