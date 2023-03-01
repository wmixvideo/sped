package br.com.wmixvideo.sped.leiaute.bloco1;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SF1601OperacoesComInstrumentosDePagamentosEletronicosTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF1601OperacoesComInstrumentosDePagamentosEletronicos linha = new SF1601OperacoesComInstrumentosDePagamentosEletronicos()
                .setCampo02InstituicaoQueEfetuouPagamento("12345678909")
                .setCampo03IntermediadorDaTransacao("12345678909")
                .setCampo4ValorTotalVS(BigDecimal.valueOf(50.68))
                .setCampo5ValorTotalISS(BigDecimal.valueOf(10.50))
                .setCampo6ValorTotalOutros(BigDecimal.valueOf(12));

        Assert.assertEquals("|1601|12345678909|12345678909|50,68|10,50|12,00|", linha.toString());
    }
}