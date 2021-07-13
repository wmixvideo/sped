package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.contribuicoes.enums.SCIncidenciaTributaria;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorCriterioEscrituracaoApuracao;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorMetodoApropriacaoCreditoComum;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorTipoContribuicao;
import br.com.wmixvideo.sped.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito implements SFLinha {

    private SCIncidenciaTributaria campo02IncidenciaTributaria;
    private SCIndicadorMetodoApropriacaoCreditoComum campo03IndicadorMetodoApropriacaoCreditoComum;
    private SCIndicadorTipoContribuicao campo04IndicadorTipoContribuicao;
    private SCIndicadorCriterioEscrituracaoApuracao campo05IndicadorCriterioEscrituracaoApuracao;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IncidenciaTributaria));
        linha.append(SFUtil.formatToString(this.campo03IndicadorMetodoApropriacaoCreditoComum));
        linha.append(SFUtil.formatToString(this.campo04IndicadorTipoContribuicao));
        linha.append(SFUtil.formatToString(this.campo05IndicadorCriterioEscrituracaoApuracao));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0110";
    }

    public SCIncidenciaTributaria getCampo02IncidenciaTributaria() {
        return campo02IncidenciaTributaria;
    }

    public SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito setCampo02IncidenciaTributaria(SCIncidenciaTributaria campo02IncidenciaTributaria) {
        this.campo02IncidenciaTributaria = campo02IncidenciaTributaria;
        return this;
    }

    public SCIndicadorMetodoApropriacaoCreditoComum getCampo03IndicadorMetodoApropriacaoCreditoComum() {
        return campo03IndicadorMetodoApropriacaoCreditoComum;
    }

    public SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito setCampo03IndicadorMetodoApropriacaoCreditoComum(SCIndicadorMetodoApropriacaoCreditoComum campo03IndicadorMetodoApropriacaoCreditoComum) {
        this.campo03IndicadorMetodoApropriacaoCreditoComum = campo03IndicadorMetodoApropriacaoCreditoComum;
        return this;
    }

    public SCIndicadorTipoContribuicao getCampo04IndicadorTipoContribuicao() {
        return campo04IndicadorTipoContribuicao;
    }

    public SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito setCampo04IndicadorTipoContribuicao(SCIndicadorTipoContribuicao campo04IndicadorTipoContribuicao) {
        this.campo04IndicadorTipoContribuicao = campo04IndicadorTipoContribuicao;
        return this;
    }

    public SCIndicadorCriterioEscrituracaoApuracao getCampo05IndicadorCriterioEscrituracaoApuracao() {
        return campo05IndicadorCriterioEscrituracaoApuracao;
    }

    public SC0110RegimeApuracaoContribuicaoSocialEApropriacaoCredito setCampo05IndicadorCriterioEscrituracaoApuracao(SCIndicadorCriterioEscrituracaoApuracao campo05IndicadorCriterioEscrituracaoApuracao) {
        this.campo05IndicadorCriterioEscrituracaoApuracao = campo05IndicadorCriterioEscrituracaoApuracao;
        return this;
    }
}