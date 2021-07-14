package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorTipoAtividadePredominante {
    INDUSTRIAL("0"),
    PRESTADOR_SERVICOS("1"),
    COMERCIO("2"),
    PESSOAS_JURIDICAS_REFERIDAS("3"),
    IMOBILIARIA("4"),
    OUTROS("9");

    private final String codigo;

    SCIndicadorTipoAtividadePredominante(final String codigo) {
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