package br.com.wmixvideo.sped.leiaute.blocoe;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE110ApuracaoICMSOperacoesPropriasTest {
    @Test
    public void geraTexto092008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setCampo02ValorTotalDebitos(BigDecimal.valueOf(1946431.61))
                .setCampo03ValorAjusteDebitos(BigDecimal.ZERO)
                .setCampo04ValorTotalAjusteDebitos(BigDecimal.ZERO)
                .setCampo05ValorEstornoCreditos(BigDecimal.ZERO)
                .setCampo06ValorTotalCreditos(BigDecimal.valueOf(1570001.30))
                .setCampo07ValorAjusteCreditos(BigDecimal.ZERO)
                .setCampo08ValorTotalAjusteCreditos(BigDecimal.ZERO)
                .setCampo09ValorEstornosDebito(BigDecimal.ZERO)
                .setCampo10ValorSaldoCredorAnterior(BigDecimal.ZERO)
                .setCampo11ValorSaldoApurado(BigDecimal.valueOf(376430.31))
                .setCampo12ValorTotalDeducoes(BigDecimal.ZERO)
                .setCampo13ValorIcmsRecolher(BigDecimal.valueOf(376430.31))
                .setCampo14ValorSaldoCredorTransportar(BigDecimal.ZERO)
                .setCampo15ValorExtraApuracao(BigDecimal.ZERO);

        Assert.assertEquals("|E110|1946431,61|0|0|0|1570001,30|0|0|0|0|376430,31|0|376430,31|0|0|", linha.toString());
    }

    @Test
    public void geraTexto102008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setCampo02ValorTotalDebitos(BigDecimal.valueOf(1609177.73))
                .setCampo03ValorAjusteDebitos(BigDecimal.ZERO)
                .setCampo04ValorTotalAjusteDebitos(BigDecimal.ZERO)
                .setCampo05ValorEstornoCreditos(BigDecimal.ZERO)
                .setCampo06ValorTotalCreditos(BigDecimal.valueOf(1298514.66))
                .setCampo07ValorAjusteCreditos(BigDecimal.ZERO)
                .setCampo08ValorTotalAjusteCreditos(BigDecimal.ZERO)
                .setCampo09ValorEstornosDebito(BigDecimal.ZERO)
                .setCampo10ValorSaldoCredorAnterior(BigDecimal.ZERO)
                .setCampo11ValorSaldoApurado(BigDecimal.valueOf(310663.07))
                .setCampo12ValorTotalDeducoes(BigDecimal.ZERO)
                .setCampo13ValorIcmsRecolher(BigDecimal.valueOf(310663.07))
                .setCampo14ValorSaldoCredorTransportar(BigDecimal.ZERO)
                .setCampo15ValorExtraApuracao(BigDecimal.ZERO);

        Assert.assertEquals("|E110|1609177,73|0|0|0|1298514,66|0|0|0|0|310663,07|0|310663,07|0|0|", linha.toString());
    }

    @Test
    public void comCreditoDeImpostoPorOutrosCreditos112008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setCampo02ValorTotalDebitos(BigDecimal.valueOf(1462998.50))
                .setCampo03ValorAjusteDebitos(BigDecimal.ZERO)
                .setCampo04ValorTotalAjusteDebitos(BigDecimal.ZERO)
                .setCampo05ValorEstornoCreditos(BigDecimal.ZERO)
                .setCampo06ValorTotalCreditos(BigDecimal.ZERO)
                .setCampo07ValorAjusteCreditos(BigDecimal.valueOf(1183935.81))
                .setCampo08ValorTotalAjusteCreditos(BigDecimal.ZERO)
                .setCampo09ValorEstornosDebito(BigDecimal.ZERO)
                .setCampo10ValorSaldoCredorAnterior(BigDecimal.ZERO)
                .setCampo11ValorSaldoApurado(BigDecimal.valueOf(279062.69))
                .setCampo12ValorTotalDeducoes(BigDecimal.ZERO)
                .setCampo13ValorIcmsRecolher(BigDecimal.valueOf(279062.69))
                .setCampo14ValorSaldoCredorTransportar(BigDecimal.ZERO)
                .setCampo15ValorExtraApuracao(BigDecimal.ZERO);

        Assert.assertEquals("|E110|1462998,50|0|0|0|0|1183935,81|0|0|0|279062,69|0|279062,69|0|0|", linha.toString());
    }
}