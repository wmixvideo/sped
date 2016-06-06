package br.com.wmixvideo.sped.enums;

public enum SFTipoTransporte {

    RODOVIARIO("0"),
    FERROVIARIO("1"),
    RODO_FERROVIARIO("2"),
    AQUAVIARIO("3"),
    DUTOVIARIO("4"),
    AEREO("5"),
    OUTROS("9");

    private final String codigo;

    SFTipoTransporte(String codigo) {
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
