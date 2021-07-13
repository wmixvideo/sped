package br.com.wmixvideo.sped.enums;

public enum SFIndicadorEmitente {

    EMISSAO_PROPRIA("0"),
    TERCEIROS("1");

    private final String codigo;

    SFIndicadorEmitente(final String codigo) {
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