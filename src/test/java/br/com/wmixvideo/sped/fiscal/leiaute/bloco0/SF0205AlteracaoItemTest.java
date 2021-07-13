package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF0205AlteracaoItemTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0205AlteracaoItem linha = new SF0205AlteracaoItem()
                .setCampo02DescricaoAnterior("descricaoanterior")
                .setCampo03DataInicialUtilizacaoDescricao(LocalDate.of(2016, Month.FEBRUARY, 1))
                .setCampo04DataFinalUtilizacaoDescricao(LocalDate.of(2016, Month.FEBRUARY, 28))
                .setCampo05CodigoAnterior("codigoanterior");

        Assert.assertEquals("|0205|descricaoanterior|01022016|28022016|codigoanterior|", linha.toString());
    }
}