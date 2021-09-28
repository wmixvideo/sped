package br.com.wmixvideo.sped.enums;

public enum SFMovimentacaoFisica {

    SIM("0"),
    NAO("1");

    private final String codigo;

    SFMovimentacaoFisica(final String codigo) {
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