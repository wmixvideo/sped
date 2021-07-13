package br.com.wmixvideo.sped.util;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFReferenciaTest {

    @Test
    public void deveCalcularADataInicialDaReferencia() {
        Assert.assertEquals(LocalDate.of(2015, Month.JANUARY, 1), SFReferencia.of(2015, Month.JANUARY).getInicio());
    }

    @Test
    public void deveCalcularADataFinalDaReferencia() {
        Assert.assertEquals(LocalDate.of(2015, Month.FEBRUARY, 28), SFReferencia.of(2015, Month.FEBRUARY).getFim());
    }

    @Test
    public void toStringDeveFormatarReferenciaMmAaaa() {
        Assert.assertEquals("022016", SFUtil.formatToString(SFReferencia.of(2016, Month.FEBRUARY)));
        Assert.assertEquals("112016", SFUtil.formatToString(SFReferencia.of(2016, Month.NOVEMBER)));
    }
}