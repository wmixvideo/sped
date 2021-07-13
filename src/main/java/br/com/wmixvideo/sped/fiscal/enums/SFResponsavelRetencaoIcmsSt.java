package br.com.wmixvideo.sped.fiscal.enums;

public enum SFResponsavelRetencaoIcmsSt {

    REMETENTE_DIRETO("1", "Remetente Direto"),
    REMETENTE_INDIRETO("2", "Remetente Indireto"),
    PROPRIO_DECLARANTE("3", "Pr\u00f3prio declarante");

    private final String codigo;
    private final String descricao;

    SFResponsavelRetencaoIcmsSt(final String codigo, final String descricao) {
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
