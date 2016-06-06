package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import org.junit.Assert;
import org.junit.Test;

public class SFC111ProcessoReferenciadoTest {

    @Test
    public void testeToString() throws Exception {
        final SFC111ProcessoReferenciado linha = new SFC111ProcessoReferenciado()
                .setNumero("123")
                .setIndicadorOrigem(SFIndicadorProcessoOrigem.SECEX_SRF);

        Assert.assertEquals("|C111|123|3|", linha.toString());
    }
}