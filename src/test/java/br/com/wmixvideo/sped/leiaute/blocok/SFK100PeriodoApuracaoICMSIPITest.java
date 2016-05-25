package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

public class SFK100PeriodoApuracaoICMSIPITest {
    @Test
    public void deveObterSeuCodigo() {
        Assert.assertEquals("K100", new SFK100PeriodoApuracaoICMSIPI(null).getCodigoRegistro());
    }

    @Test
    public void deveObterFormatoTexto() {
        Assert.assertEquals("|K100|01072010|31072010|", new SFK100PeriodoApuracaoICMSIPI(SFReferencia.of(2010, Month.JULY)).toString());
    }
}