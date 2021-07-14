package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SC0111ReceitaBrutaMensalRateioCreditosComunsTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SC0111ReceitaBrutaMensalRateioCreditosComuns linha = new SC0111ReceitaBrutaMensalRateioCreditosComuns()
                .setCampo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno(new BigDecimal(2))
                .setCampo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno(new BigDecimal(3))
                .setCampo04ReceitaBrutaNaoCumulativaExportacao(new BigDecimal(4))
                .setCampo05ReceitaBrutaCumulativa(new BigDecimal(5))
                .setCampo06ReceitaBrutaTotal(new BigDecimal(6));

        Assert.assertEquals("|0111|2,00|3,00|4,00|5,00|6,00|", linha.toString());
    }
}