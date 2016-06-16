package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0450InformacaoComplementarDocumentoFiscalTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SF0450InformacaoComplementarDocumentoFiscal linha = new SF0450InformacaoComplementarDocumentoFiscal()
                .setCampo02Contador(1)
                .setCampo03Observacao("ICMS RETIDO CONF. TARE 008/08-SAT");

        Assert.assertEquals("|0450|000001|ICMS RETIDO CONF. TARE 008/08-SAT|", linha.toString());
    }
}