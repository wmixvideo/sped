package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

public class SFC195ObservacoesLancamentoFiscalTest {
    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFC195ObservacoesLancamentoFiscal linha = new SFC195ObservacoesLancamentoFiscal()
                .setCampo02Codigo("001")
                .setCampo03Descricao("descricao");

        Assert.assertEquals("|C195|001|descricao|", linha.toString());
    }
}