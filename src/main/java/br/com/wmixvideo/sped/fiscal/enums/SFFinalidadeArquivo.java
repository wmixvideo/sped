package br.com.wmixvideo.sped.fiscal.enums;

public enum SFFinalidadeArquivo {

    REMESSA_ORIGINAL("0", "Remessa original"),
    REMESSA_SUBSTITUTA("1", "Remessa substituta");

    private final String codigo;
    private final String descricao;

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