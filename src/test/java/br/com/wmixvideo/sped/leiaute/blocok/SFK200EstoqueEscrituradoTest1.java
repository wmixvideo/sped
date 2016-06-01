package br.com.wmixvideo.sped.leiaute.blocok;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SFK200EstoqueEscrituradoTest1 {

    @Test
    public void deveObterSeuCodigo() {
        Assert.assertEquals("K200", new SFK200EstoqueEscriturado(null, null, 0).getCodigoRegistro());
    }

    @Test
    public void deveGerarTextoDaFonte() {
        Assert.assertEquals("|K200|31072010|124315|10|0||", new SFK200EstoqueEscriturado(LocalDate.of(2010, 7, 31), "124315", 10).toString());
    }
}