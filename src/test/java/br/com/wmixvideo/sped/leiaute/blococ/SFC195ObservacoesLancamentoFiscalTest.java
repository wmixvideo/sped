package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

public class SFC195ObservacoesLancamentoFiscalTest {
    @Test
    public void testeToString() throws Exception {
        final SFC195ObservacoesLancamentoFiscal linha = new SFC195ObservacoesLancamentoFiscal()
                .setCodigo("001")
                .setDescricao("descricao");

        Assert.assertEquals("|C195|001|descricao|", linha.toString());
    }
}