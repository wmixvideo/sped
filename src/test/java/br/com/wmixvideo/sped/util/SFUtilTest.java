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

    @Test
    public void deveFormatarString() {
        Assert.assertEquals("", SFUtil.formatToString((String)null));
        Assert.assertEquals("", SFUtil.formatToString(" "));
        Assert.assertEquals("abc", SFUtil.formatToString(" abc "));
    }

    @Test
    public void leftPad() {
        Assert.assertEquals("000123", SFUtil.leftPad(123, 6, '0'));
        Assert.assertEquals("123456", SFUtil.leftPad(123456, 6, '0'));
        Assert.assertEquals("123456789", SFUtil.leftPad(123456789, 6, '0'));
    }
}