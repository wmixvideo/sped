package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFE300PeriodoApuracaoFundoCombatePobrezaTest {

    @Test
    public void testeToString() {
        final SFE300PeriodoApuracaoFundoCombatePobreza linha = new SFE300PeriodoApuracaoFundoCombatePobreza()
                .setUf(SFUnidadeFederativa.BA)
                .setDataInicial(LocalDate.of(2016, Month.FEBRUARY, 1))
                .setDataFinal(LocalDate.of(2016, Month.FEBRUARY, 28));

        Assert.assertEquals("|E300|BA|01022016|28022016|", linha.toString());
    }
}