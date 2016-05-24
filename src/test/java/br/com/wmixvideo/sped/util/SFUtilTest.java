package br.com.wmixvideo.sped.util;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SFUtilTest {

    @Test
    public void deveFormatarDataSemBarras() throws Exception {
        Assert.assertEquals("16022016", SFUtil.formatToString(LocalDate.of(2016, Month.FEBRUARY, 16)));
    }
}