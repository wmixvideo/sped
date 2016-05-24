package br.com.wmixvideo.sped.modelo;

public enum SFItemTipo {

    MERCADORIA_PARA_REVENDA("00", "Mercadoria para Revenda"),
    MATERIA_PRIMA("01", "Matéria-Prima"),
    EMBALAGEM("02", "Embalagem"),
    PRODUTO_EM_PROCESSO("03", "Produto em Processo"),
    PRODUTO_ACABADO("04", "Produto Acabado"),
    SUBPRODUTO("05", "Subproduto"),
    PRODUTO_INTERMEDIÁRIO("06", "Produto Intermediário"),
    MATERIAL_DE_USO_E_CONSUMO("07", "Material de Uso e Consumo"),
    ATIVO_IMOBILIZADO("08", "Ativo Imobilizado"),
    SERVIÇOS("09", "Serviços"),
    OUTROS_INSUMOS("10", "Outros insumos"),
    OUTRAS("99", "Outras");

    private final String codigo;
    private final String descricao;

    SFItemTipo(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
