package br.com.wmixvideo.sped.util;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFReferenciaTest {

    @Test
    public void deveCalcularADataInicialDaReferencia() throws Exception {
        Assert.assertEquals(LocalDate.of(2015, Month.JANUARY, 1), SFReferencia.of(2015, Month.JANUARY).getInicio());
    }

    @Test
    public void deveCalcularADataFinalDaReferencia() throws Exception {
        Assert.assertEquals(LocalDate.of(2015, Month.FEBRUARY, 28), SFReferencia.of(2015, Month.FEBRUARY).getFim());
    }
}