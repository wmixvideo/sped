package br.com.wmixvideo.sped.fiscal.enums;

public enum SFSituacaoDocumento {

    DOCUMENTO_REGULAR("00","Documento regular"),
    ESCRITURACAO_EXTEMPORANEA_DOCUMENTO_REGULAR("01","Escrituração extemporânea de documento regular"),
    DOCUMENTO_CANCELADO("02","Documento cancelado"),
    ESCRITURACAO_EXTEMPORANEA_DOCUMENTO_CANCELADO("03","Escrituração extemporânea de documento cancelado"),
    DENEGADO("04","NF-e, NFC-e ou CT-e - denegado"),
    INUTILIZADO("05","NF-e, NFC-e ou CT-e - Numeração inutilizada"),
    DOCUMENTO_FISCAL_COMPLEMENTAR("06","Documento Fiscal Complementar"),
    ESCRITURACAO_EXTEMPORANEA_DOCUMENTO_COMPLEMENTAR("07","Escrituração extemporânea de documento complementar"),
    REGIME_ESPECIAL_NORMA_ESPECIFICA("08","Documento Fiscal emitido com base em Regime Especial ou Norma Específica");

    private final String codigo;
    private final String descricao;

    SFSituacaoDocumento(final String codigo, final String descricao) {
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
