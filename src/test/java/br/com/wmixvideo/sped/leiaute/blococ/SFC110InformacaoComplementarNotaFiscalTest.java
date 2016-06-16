package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

public class SFC110InformacaoComplementarNotaFiscalTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFC110InformacaoComplementarNotaFiscal linha = new SFC110InformacaoComplementarNotaFiscal()
                .setCampo02Codigo("001")
                .setCampo03Descricao("descricao");

        Assert.assertEquals("|C110|001|descricao|", linha.toString());

    }
}