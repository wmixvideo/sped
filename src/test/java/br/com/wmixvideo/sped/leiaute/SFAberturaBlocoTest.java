package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimentoAberturaBloco;
import org.junit.Assert;
import org.junit.Test;

public class SFAberturaBlocoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        Assert.assertEquals("|1234|0|", new SFAberturaBloco("1234", SFIndicadorMovimentoAberturaBloco.COM).toString());
    }
}