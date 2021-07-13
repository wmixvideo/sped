package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorSituacaoEspecial {

    ABERTURA("0"),
    CISAO("1"),
    FUSAO("2"),
    INCORPORACAO("3"),
    ENCERRAMENTO("4");

    private String codigo;

    SCIndicadorSituacaoEspecial(final String codigo) {
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