package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0460ObservacaoLancamentoFiscalTest {

    @Test
    public void deveGerarLinha() throws Exception {
        final SF0460ObservacaoLancamentoFiscal linha = new SF0460ObservacaoLancamentoFiscal()
                .setCampo02Codigo("321")
                .setCampo03Observacao("Observacao do lancamento");

        Assert.assertEquals("|0460|321|Observacao do lancamento|", linha.toString());
    }
}