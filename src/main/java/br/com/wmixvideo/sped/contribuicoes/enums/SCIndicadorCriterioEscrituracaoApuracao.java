package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorCriterioEscrituracaoApuracao {
    REGIME_CAIXA_ESCRITURACAO_CONSOLIDADA("1"),
    REGIME_COMPETENCIA_ESCRITURACAO_CONSOLIDADA("2"),
    REGIME_COMPETENCIA_ESCRITURACAO_DETALHADA("9");

    private String codigo;

    SCIndicadorCriterioEscrituracaoApuracao(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}