package br.com.wmixvideo.sped.enums;

public enum SFIndicadorMovimento {

    SEM("0"),
    COM("1");

    private final String codigo;

    SFIndicadorMovimento(String codigo) {
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
