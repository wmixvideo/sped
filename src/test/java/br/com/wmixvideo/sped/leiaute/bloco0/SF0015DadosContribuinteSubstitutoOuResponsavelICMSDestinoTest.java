package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestinoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino linha = new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino()
                .setCampo02Uf("SC")
                .setCampo03InscricaoEstadual("00011122");

        Assert.assertEquals("|0015|SC|00011122|", linha.toString());
    }
}