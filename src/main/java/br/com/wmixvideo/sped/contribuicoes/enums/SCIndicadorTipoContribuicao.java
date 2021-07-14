package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorTipoContribuicao {

    EXCLUSIVAMENTE_ALIQUOTA_BASICA("1"),
    ALIQUOTAS_ESPECIFICAS("2");

    private final String codigo;

    SCIndicadorTipoContribuicao(final String codigo) {
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