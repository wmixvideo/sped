package br.com.wmixvideo.sped.modelo;

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
}
