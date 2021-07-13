package br.com.wmixvideo.sped.fiscal.enums;

public enum SFTipoLigacaoEletrica {

    MONOFASICO("1"),
    BIFASICO("2"),
    TRIFASICO("3");

    private final String codigo;

    SFTipoLigacaoEletrica(final String codigo) {
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
