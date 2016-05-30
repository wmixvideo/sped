package br.com.wmixvideo.sped.enums;

public enum SFNotaFiscalFrete {

    POR_CONTA_DO_EMITENTE("0"),
    POR_CONTA_DO_DESTINATARIO_REMETENTE("1"),
    POR_CONTA_DE_TERCEIROS("2"),
    SEM_COBRANÇA_DE_FRETE("9");

    private final String codigo;

    SFNotaFiscalFrete(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
