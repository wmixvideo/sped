package br.com.wmixvideo.sped.fiscal.leiaute;

import org.junit.Assert;
import org.junit.Test;

public class SFEncerramentoBlocoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        Assert.assertEquals("|1234|13|", new SFEncerramentoBloco("1234", 13).toString());
    }
}