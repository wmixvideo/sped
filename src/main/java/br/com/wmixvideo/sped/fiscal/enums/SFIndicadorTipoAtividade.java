package br.com.wmixvideo.sped.fiscal.enums;

public enum SFIndicadorTipoAtividade {

    INDUSTRIAL_OU_EQUIPARADO("0"),
    OUTROS("1");

    private final String codigo;

    SFIndicadorTipoAtividade(final String codigo) {
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