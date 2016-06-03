package br.com.wmixvideo.sped.enums;

public enum SFIndicadorOperacao {

    AQUISICAO("0"),
    PRESTACAO("1");

    private String codigo;

    SFIndicadorOperacao(final String codigo) {
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