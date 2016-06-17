package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestinoTest {

    @Test
    public void deveGerarLinhaVazia() {
        Assert.assertEquals("|0015|||", new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino().toString());
    }

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino linha = new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino()
                .setCampo02Uf(SFUnidadeFederativa.SC)
                .setCampo03InscricaoEstadual("00011122");

        Assert.assertEquals("|0015|SC|00011122|", linha.toString());
    }
}