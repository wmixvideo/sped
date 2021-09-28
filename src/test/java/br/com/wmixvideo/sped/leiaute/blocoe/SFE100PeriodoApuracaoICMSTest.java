package br.com.wmixvideo.sped.leiaute.blocoe;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFE100PeriodoApuracaoICMSTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE100PeriodoApuracaoICMS linha = new SFE100PeriodoApuracaoICMS()
                .setCampo02DataInicio(LocalDate.of(2016, Month.DECEMBER, 1))
                .setCampo03DataFim(LocalDate.of(2016, Month.DECEMBER, 31));

        Assert.assertEquals("|E100|01122016|31122016|", linha.toString());

    }
}