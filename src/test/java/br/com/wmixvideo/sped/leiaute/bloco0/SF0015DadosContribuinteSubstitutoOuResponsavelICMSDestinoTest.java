package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFContribuinteSubstituicao;
import br.com.wmixvideo.sped.modelo.SFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestinoTest {

    @Test
    public void deveGeraTextoFormatado() {
        final SFContribuinteSubstituicao contribuinteSubstituicao = new SFContribuinteSubstituicao(SFUnidadeFederativa.SC, "00011122");
        Assert.assertEquals("|0015|SC|00011122|", new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino(contribuinteSubstituicao).toString());
    }
}