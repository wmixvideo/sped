package br.com.wmixvideo.sped.util;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFUtilTest {

    @Test
    public void deveRetornarEmBrancoQuandoDataNula() {
        Assert.assertEquals("", SFUtil.formatToString((LocalDate) null));
    }

    @Test
    public void deveFormatarDataSemBarras() {
        Assert.assertEquals("16022016", SFUtil.formatToString(LocalDate.of(2016, Month.FEBRUARY, 16)));
    }

    @Test
    public void deveFormatarReferenciaMmAaaa() {
        Assert.assertFalse(SFUtil.formatToString(SFReferencia.of(2016, Month.FEBRUARY)).isEmpty());
        Assert.assertTrue(SFUtil.formatToString((SFReferencia) null).isEmpty());
    }
}