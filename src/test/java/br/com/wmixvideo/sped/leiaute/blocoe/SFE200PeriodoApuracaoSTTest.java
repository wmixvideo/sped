package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFE200PeriodoApuracaoSTTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE200PeriodoApuracaoST linha = new SFE200PeriodoApuracaoST()
                .setCampo02Uf(SFUnidadeFederativa.BA)
                .setCampo03DataInicial(LocalDate.of(2016, Month.FEBRUARY, 1))
                .setCampo04DataFinal(LocalDate.of(2016, Month.FEBRUARY, 28));

        Assert.assertEquals("|E200|BA|01022016|28022016|", linha.toString());
    }
}