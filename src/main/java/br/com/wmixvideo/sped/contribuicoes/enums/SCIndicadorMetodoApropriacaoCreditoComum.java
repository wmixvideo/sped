package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorMetodoApropriacaoCreditoComum {

    APROPRIACAO_DIRETA("1"),
    RATEIO_PROPORCIONAL("2");

    private String codigo;

    SCIndicadorMetodoApropriacaoCreditoComum(final String codigo) {
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