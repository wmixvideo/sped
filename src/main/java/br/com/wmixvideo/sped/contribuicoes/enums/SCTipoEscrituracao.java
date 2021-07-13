package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCTipoEscrituracao {

    ORIGINAL("0"),
    RETIFICADORA("1");

    private String codigo;

    SCTipoEscrituracao(final String codigo) {
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