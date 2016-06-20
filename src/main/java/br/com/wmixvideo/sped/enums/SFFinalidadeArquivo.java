package br.com.wmixvideo.sped.enums;

public enum SFFinalidadeArquivo {

    REMESSA_ORIGINAL("0", "Remessa original"),
    REMESSA_SUBSTITUTA("1", "Remessa substituta");

    private String codigo, descricao;

    SFFinalidadeArquivo(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}