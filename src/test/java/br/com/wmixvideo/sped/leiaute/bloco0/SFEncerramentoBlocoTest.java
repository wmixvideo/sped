package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SFEncerramentoBlocoTest {

    @Test
    public void geraTexto() {
        Assert.assertEquals("|0990|10|", new SFEncerramentoBloco("0990", 10).toString());
    }

    @Test
    public void sempreSomaMaisUmParaConsiderarOProprio() {
        Assert.assertEquals("|J990|1577|", new SFEncerramentoBloco("J990", 1577).toString());
    }
}