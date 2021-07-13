package br.com.wmixvideo.sped.fiscal.enums;

public enum SFIndicadorOrigemCredito {

    MERCADO_INTERNO("0"),
    IMPORTACAO("1");

    private final String codigo;

    SFIndicadorOrigemCredito(final String codigo) {
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