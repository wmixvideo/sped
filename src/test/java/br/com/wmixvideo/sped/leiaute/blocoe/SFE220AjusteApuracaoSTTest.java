package br.com.wmixvideo.sped.leiaute.blocoe;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE220AjusteApuracaoSTTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFE220AjusteApuracaoST linha = new SFE220AjusteApuracaoST()
                .setCampo02CodigoAjuste("2")
                .setCampo03DescricaoComplementar("3")
                .setCampo04Valor(BigDecimal.valueOf(4));

        Assert.assertEquals("|E220|2|3|4,00|", linha.toString());

    }
}