package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorMovimento {

    COM_DADOS("0"),
    SEM_DADOS("1");

    private final String codigo;

    SCIndicadorMovimento(final String codigo) {
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