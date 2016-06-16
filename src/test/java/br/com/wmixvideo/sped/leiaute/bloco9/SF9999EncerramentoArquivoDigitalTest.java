package br.com.wmixvideo.sped.leiaute.bloco9;

import org.junit.Assert;
import org.junit.Test;

public class SF9999EncerramentoArquivoDigitalTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        Assert.assertEquals("|9999|10|", new SF9999EncerramentoArquivoDigital(10).toString());

    }
}