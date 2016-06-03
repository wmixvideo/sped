package br.com.wmixvideo.sped.enums;

public enum SFIndicadorMovimentoAberturaBloco {
    COM(0),
    SEM(1);

    private final int codigo;

    SFIndicadorMovimentoAberturaBloco(final int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}