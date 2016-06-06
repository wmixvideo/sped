package br.com.wmixvideo.sped.enums;

public enum SFMotivoInventario {

    FINAL_NO_PERIODO("01"),
    MUDANÇA_DE_FORMA_DE_TRIBUTACAO_DA_MERCADORIA("02"),
    SOLICITACAO_DA_BAIXA_CADASTRAL_PARALISACAOTEMPORARIA_E_OUTRASSITUACOES("03"),
    ALTERACAO_DE_REGIME_DE_PAGAMENTO("04"),
    DETERMINACAO_DOS_FISCOS("05");

    private final String codigo;

    SFMotivoInventario(String codigo) {
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
