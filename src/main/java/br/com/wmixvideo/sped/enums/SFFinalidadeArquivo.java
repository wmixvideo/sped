package br.com.wmixvideo.sped.enums;

public enum SFFinalidadeArquivo {

    REMESSA_ORIGINAL("0"),
    REMESSA_SUBSTITUTO("1");

    private String codigo;

    SFFinalidadeArquivo(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }
}