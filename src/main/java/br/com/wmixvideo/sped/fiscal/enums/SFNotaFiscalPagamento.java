package br.com.wmixvideo.sped.fiscal.enums;

public enum SFNotaFiscalPagamento {

    A_VISTA("0"),
    A_PRAZO("1"),
    OUTROS("2"),
    @Deprecated
    SEM_PAGAMENTO("9");

    private final String codigo;

    SFNotaFiscalPagamento(final String codigo) {
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
