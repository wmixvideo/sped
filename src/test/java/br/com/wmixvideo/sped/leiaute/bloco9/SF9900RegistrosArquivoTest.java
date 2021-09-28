package br.com.wmixvideo.sped.leiaute.bloco9;

import org.junit.Assert;
import org.junit.Test;

public class SF9900RegistrosArquivoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        Assert.assertEquals("|9900|001|10|", new SF9900RegistrosArquivo("001", 10).toString());

    }
}