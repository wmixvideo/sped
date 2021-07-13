package br.com.wmixvideo.sped.fiscal.enums;

public enum SFIndicadorProcessoOrigem {

    SEFAZ("0"),
    JUSTICA_FEDERAL("1"),
    JUSTICA_ESTADUAL("2"),
    SECEX_SRF("3"),
    OUTROS("9");

    private final String codigo;

    SFIndicadorProcessoOrigem(String codigo) {
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
