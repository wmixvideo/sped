package br.com.wmixvideo.sped.leiaute.blocok;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFK100PeriodoApuracaoICMSIPITest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFK100PeriodoApuracaoICMSIPI linha = new SFK100PeriodoApuracaoICMSIPI()
                .setCampo02DataInicial(LocalDate.of(2010, Month.JULY, 1))
                .setCampo03DataFinal(LocalDate.of(2010, Month.JULY, 31));

        Assert.assertEquals("|K100|01072010|31072010|", linha.toString());
    }
}