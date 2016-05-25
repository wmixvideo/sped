package br.com.wmixvideo.sped.modelo;

public enum SFNotaFiscalEmissao {

    PROPRIA("0"),
    TERCEIROS("1");

    private final String codigo;

    SFNotaFiscalEmissao(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
