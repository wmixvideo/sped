package br.com.wmixvideo.sped.leiaute.blocoe;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE110ApuracaoICMSOperacoesPropriasTest {
    @Test
    public void geraTexto092008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setValorTotalCreditos(BigDecimal.valueOf(1570001.30))
                .setValorTotalDebitos(BigDecimal.valueOf(1946431.61))
                .setValorSaldoApurado(BigDecimal.valueOf(376430.31))
                .setValorIcmsRecolher(BigDecimal.valueOf(376430.31));

        Assert.assertEquals("|E110|1946431,61|0|0|0|1570001,30|0|0|0|0|376430,31|0|376430,31|0|0|", linha.toString());
    }

    @Test
    public void geraTexto102008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setValorTotalDebitos(BigDecimal.valueOf(1609177.73))
                .setValorTotalCreditos(BigDecimal.valueOf(1298514.66))
                .setValorSaldoApurado(BigDecimal.valueOf(310663.07))
                .setValorIcmsRecolher(BigDecimal.valueOf(310663.07));

        Assert.assertEquals("|E110|1609177,73|0|0|0|1298514,66|0|0|0|0|310663,07|0|310663,07|0|0|", linha.toString());
    }

    @Test
    public void comCreditoDeImpostoPorOutrosCreditos112008() {
        final SFE110ApuracaoICMSOperacoesProprias linha = new SFE110ApuracaoICMSOperacoesProprias()
                .setValorTotalDebitos(BigDecimal.valueOf(1462998.50))
                .setValorAjusteCreditos(BigDecimal.valueOf(1183935.81))
                .setValorSaldoApurado(BigDecimal.valueOf(279062.69))
                .setValorIcmsRecolher(BigDecimal.valueOf(279062.69));

        Assert.assertEquals("|E110|1462998,50|0|0|0|0|1183935,81|0|0|0|279062,69|0|279062,69|0|0|", linha.toString());
    }
}