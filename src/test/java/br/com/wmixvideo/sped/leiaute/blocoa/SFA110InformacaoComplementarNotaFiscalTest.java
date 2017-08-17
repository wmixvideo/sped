package br.com.wmixvideo.sped.leiaute.blocoa;

import org.junit.Assert;
import org.junit.Test;

public class SFA110InformacaoComplementarNotaFiscalTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFA110InformacaoComplementarNotaFiscal linha = new SFA110InformacaoComplementarNotaFiscal()
                .setCampo02Codigo("001")
                .setCampo03Descricao("descricao");

        Assert.assertEquals("|A110|001|descricao|", linha.toString());

    }
}