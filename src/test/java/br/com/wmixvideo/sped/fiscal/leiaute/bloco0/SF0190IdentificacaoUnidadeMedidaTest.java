package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0190IdentificacaoUnidadeMedidaTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0190IdentificacaoUnidadeMedida linha = new SF0190IdentificacaoUnidadeMedida()
                .setCampo02Codigo("11235")
                .setCampo03Descricao("112358");

        Assert.assertEquals("|0190|11235|112358|", linha.toString());

    }
}