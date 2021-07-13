package br.com.wmixvideo.sped.fiscal.enums;

public enum SFMotivoRessarcimento {

    VENDA_PARA_OUTRA_UF("1", "Venda para outra UF"),
    SAIDA_AMPARADA_POR_ISENCAO_OU_NAO_INCIDENCIA("2", "Saída amparada por isenção ou não incidência"),
    PERDA_OU_DETERIORACAO("3", "Perda ou deterioração"),
    FURTO_OU_ROUBO("4", "Furto ou roubo"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    SFMotivoRessarcimento(final String codigo, final String descricao) {
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
