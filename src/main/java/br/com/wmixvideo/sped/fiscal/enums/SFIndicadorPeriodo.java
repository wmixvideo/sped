package br.com.wmixvideo.sped.fiscal.enums;

public enum SFIndicadorPeriodo {

    MENSAL("0"),
    DECENDIAL("1");

    private final String codigo;

    SFIndicadorPeriodo(final String codigo) {
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