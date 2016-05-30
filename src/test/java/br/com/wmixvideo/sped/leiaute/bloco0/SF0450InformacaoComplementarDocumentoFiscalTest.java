package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0450InformacaoComplementarDocumentoFiscalTest {
    @Test
    public void geraLinha() {
        final SF0450InformacaoComplementarDocumentoFiscal linha = new SF0450InformacaoComplementarDocumentoFiscal()
                .setContador(1)
                .setObservacao("ICMS RETIDO CONF. TARE 008/08-SAT");

        Assert.assertEquals("|0450|000001|ICMS RETIDO CONF. TARE 008/08-SAT|", linha.toString());
    }
}