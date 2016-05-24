package br.com.wmixvideo.sped.modelo;

public enum SFPais {

    BRASIL("01058", "Brasil");

    private final String codigo;
    private final String descricao;

    SFPais(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }
}
