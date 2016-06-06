package br.com.wmixvideo.sped.enums;

public enum SFNotaFiscalOperacao {

    ENTRADA("0"),
    SAIDA("1");

    private final String codigo;

    SFNotaFiscalOperacao(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}
