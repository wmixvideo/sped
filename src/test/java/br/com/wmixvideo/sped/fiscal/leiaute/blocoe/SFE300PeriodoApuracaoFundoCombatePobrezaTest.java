package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFE300PeriodoApuracaoFundoCombatePobrezaTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE300PeriodoApuracaoFundoCombatePobreza linha = new SFE300PeriodoApuracaoFundoCombatePobreza()
                .setCampo02Uf(SFUnidadeFederativa.BA)
                .setCampo03DataInicial(LocalDate.of(2016, Month.FEBRUARY, 1))
                .setCampo04DataFinal(LocalDate.of(2016, Month.FEBRUARY, 28));

        Assert.assertEquals("|E300|BA|01022016|28022016|", linha.toString());
    }
}