package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import org.junit.Assert;
import org.junit.Test;

public class SFC111ProcessoReferenciadoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC111ProcessoReferenciado linha = new SFC111ProcessoReferenciado()
                .setCampo02Numero("123")
                .setCampo03IndicadorOrigem(SFIndicadorProcessoOrigem.SECEX_SRF);

        Assert.assertEquals("|C111|123|3|", linha.toString());
    }
}