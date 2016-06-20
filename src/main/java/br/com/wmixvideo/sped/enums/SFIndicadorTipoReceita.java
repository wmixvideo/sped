package br.com.wmixvideo.sped.enums;

public enum SFIndicadorTipoReceita {

    PROPRIA("0"),
    TERCEIROS("1");

    private String codigo;

    SFIndicadorTipoReceita(final String codigo) {
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