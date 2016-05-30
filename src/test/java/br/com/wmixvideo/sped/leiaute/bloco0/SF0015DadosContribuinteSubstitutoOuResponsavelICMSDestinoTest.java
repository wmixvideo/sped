package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestinoTest {

    @Test
    public void deveGeraTextoFormatado() {
        final SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino linha = new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino()
                .setUf("SC")
                .setInscricaoEstadual("00011122");

        Assert.assertEquals("|0015|SC|00011122|", linha.toString());
    }
}