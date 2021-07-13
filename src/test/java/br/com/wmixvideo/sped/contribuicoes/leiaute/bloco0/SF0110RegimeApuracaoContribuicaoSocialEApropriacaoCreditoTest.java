package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.contribuicoes.enums.SCIncidenciaTributaria;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorCriterioEscrituracaoApuracao;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorMetodoApropriacaoCreditoComum;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorTipoContribuicao;
import org.junit.Assert;
import org.junit.Test;

public class SF0110RegimeApuracaoContribuicaoSocialEApropriacaoCreditoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito linha = new SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito()
                .setCampo02IncidenciaTributaria(SCIncidenciaTributaria.EXCLUSIVAMENTE_REGIME_CUMULATIVO)
                .setCampo03IndicadorMetodoApropriacaoCreditoComum(SCIndicadorMetodoApropriacaoCreditoComum.APROPRIACAO_DIRETA)
                .setCampo04IndicadorTipoContribuicao(SCIndicadorTipoContribuicao.EXCLUSIVAMENTE_ALIQUOTA_BASICA)
                .setCampo05IndicadorCriterioEscrituracaoApuracao(SCIndicadorCriterioEscrituracaoApuracao.REGIME_CAIXA_ESCRITURACAO_CONSOLIDADA);

        Assert.assertEquals("|0110|2|1|1|1|", linha.toString());
    }

}