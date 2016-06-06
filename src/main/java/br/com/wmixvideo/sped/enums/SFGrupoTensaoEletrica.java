package br.com.wmixvideo.sped.enums;

public enum SFGrupoTensaoEletrica {


    A1_ALTA_TENSAO("01", "Alta Tensão (230kV ou mais)"),
    A2_ALTA_TENSAO("02", "Alta Tensão (88 a 138kV)"),
    A3_ALTA_TENSAO("03", "Alta Tensão (69kV)"),
    A3_A_ALTA_TENSAO("04", "Alta Tensão (30kV a 44kV)"),
    A4_ALTA_TENSAO("05", "Alta Tensão (2,3kV a 25kV)"),
    AS_ALTA_TENSAO("06", "Alta Tensão Subterrâneo 06"),
    B1_RESIDENCIAL("07", "Residencial 07"),
    B1_RESIDENCIAL_BAIXA_RENDA("08", "Residencial Baixa Renda 08"),
    B2_RURAL("09", "Rural 09"),
    B2_COOPERATIVA_DE_ELETRIFICACAO_RURAL("10", "Cooperativa de Eletrificação Rural"),
    B2_SERVICO_PUBLICO_DE_IRRIGACAO("11", "Serviço Público de Irrigação"),
    B3_DEMAIS_CLASSES("12", "Demais Classes"),
    B4_A_ILUMINACAO_PUBLICA("13", "Iluminação Pública - rede de distribuição"),
    B4_B_ILUMINACAO_PUBLICA("14", "Iluminação Pública - bulbo de lâmpada");

    private final String codigo;
    private final String descricao;

    SFGrupoTensaoEletrica(final String codigo, final String descricao) {
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
        return this.codigo;
    }
}
