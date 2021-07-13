package br.com.wmixvideo.sped.fiscal.enums;

public enum SFConfirmacao {

    SIM("S"),
    NAO("N");

    private final String codigo;

    SFConfirmacao(final String codigo) {
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
