package br.com.wmixvideo.sped.leiaute;

import org.junit.Assert;
import org.junit.Test;

public class SFAberturaBlocoTest {

    @Test
    public void deveGerarTextoComCodigoDoRegistro() {
        Assert.assertEquals("|1234|0|", new SFAberturaBloco("1234", SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS).toString());
    }

    @Test
    public void deveGerarTextoComDadosInformados() {
        Assert.assertEquals("||0|", new SFAberturaBloco("", SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS).toString());
    }

    @Test
    public void deveGerarTextoSemDadosInformados() {
        Assert.assertEquals("||1|", new SFAberturaBloco("", SFIndicadorMovimento.BLOCO_SEM_DADOS_INFORMADOS).toString());
    }
}