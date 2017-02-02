package br.com.wmixvideo.sped.enums;

public enum SFModeloDocumentoArrecadacao {

    DOCUMENTO_ESTADUAL("0", "Documento estadual de arrecadacao"),
    GNRE("1", "");

    private final String codigo;
    private final String descricao;

    SFModeloDocumentoArrecadacao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}
