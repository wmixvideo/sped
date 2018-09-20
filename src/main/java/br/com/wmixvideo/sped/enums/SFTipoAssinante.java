package br.com.wmixvideo.sped.enums;

public enum SFTipoAssinante {

    COMERCIAL_INDUSTRIAL("1"),
    PODER_PUBLICO("2"),
    RESIDENCIAL_PESSOA_FISICA("3"),
    PUBLICO("4"),
    SEMI_PUBLICO("5"),
    OUTROS("6");

    private final String codigo;

    SFTipoAssinante(final String codigo) {
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
