package br.com.wmixvideo.sped.fiscal.leiaute.blocoa;

import org.junit.Assert;
import org.junit.Test;

public class SFA110InformacaoComplementarNotaFiscalTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFA110InformacaoComplementarNotaFiscal linha = new SFA110InformacaoComplementarNotaFiscal()
                .setCampo02Codigo("001")
                .setCampo03Descricao("descricao");

        Assert.assertEquals("|A110|001|descricao|", linha.toString());

    }
}