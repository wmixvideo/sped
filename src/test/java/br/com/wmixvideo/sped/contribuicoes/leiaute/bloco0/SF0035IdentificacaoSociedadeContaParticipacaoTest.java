package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0035IdentificacaoSociedadeContaParticipacaoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SC0035IdentificacaoSociedadeContaParticipacao linha = new SC0035IdentificacaoSociedadeContaParticipacao()
                .setCampo02IdentificacaoSCP("00000000000000")
                .setCampo03DescricaoSCP("Descricao SCP")
                .setCampo04InformacaoComplementar("Informacao complementar SCP");

        Assert.assertEquals("|0035|00000000000000|Descricao SCP|Informacao complementar SCP|", linha.toString());
    }
}