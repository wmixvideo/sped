package br.com.wmixvideo.sped.leiaute.blocoe;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE110ApuracaoICMSOperacoesPropriasTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setCampo02ValorTotalDebitos(BigDecimal.valueOf(2))
                .setCampo03ValorAjusteDebitos(BigDecimal.valueOf(3))
                .setCampo04ValorTotalAjusteDebitos(BigDecimal.valueOf(4))
                .setCampo05ValorEstornoCreditos(BigDecimal.valueOf(5))
                .setCampo06ValorTotalCreditos(BigDecimal.valueOf(6))
                .setCampo07ValorAjusteCreditos(BigDecimal.valueOf(7))
                .setCampo08ValorTotalAjusteCreditos(BigDecimal.valueOf(8))
                .setCampo09ValorEstornosDebito(BigDecimal.valueOf(9))
                .setCampo10ValorSaldoCredorAnterior(BigDecimal.valueOf(10))
                .setCampo11ValorSaldoApurado(BigDecimal.valueOf(11))
                .setCampo12ValorTotalDeducoes(BigDecimal.valueOf(12))
                .setCampo13ValorIcmsRecolher(BigDecimal.valueOf(13))
                .setCampo14ValorSaldoCredorTransportar(BigDecimal.valueOf(14))
                .setCampo15ValorExtraApuracao(BigDecimal.valueOf(15));

        Assert.assertEquals("|E110|2,00|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|13,00|14,00|15,00|", linha.toString());
    }
}