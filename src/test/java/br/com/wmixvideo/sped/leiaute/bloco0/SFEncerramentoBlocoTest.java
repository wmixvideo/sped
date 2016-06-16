package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SFEncerramentoBlocoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFEncerramentoBloco linha = new SFEncerramentoBloco()
                .setCampo01CodigoRegistro("J990")
                .setCampo02TotalLinhas(1577);
        
        Assert.assertEquals("|J990|1577|", linha.toString());
    }
}