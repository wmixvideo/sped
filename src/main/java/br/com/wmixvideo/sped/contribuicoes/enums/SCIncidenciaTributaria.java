package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIncidenciaTributaria {

    EXCLUSIVAMENTE_REGIME_NAO_CUMULATIVO("1"),
    EXCLUSIVAMENTE_REGIME_CUMULATIVO("2"),
    NOS_REGIMES_NAO_CUMULATIVO_E_CUMULATIVO("3");

    private String codigo;

    SCIncidenciaTributaria(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}