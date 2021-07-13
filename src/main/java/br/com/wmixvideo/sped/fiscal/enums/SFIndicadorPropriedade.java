package br.com.wmixvideo.sped.fiscal.enums;

public enum SFIndicadorPropriedade {

    DO_INFORMANTE_E_EM_SEU_PODER("0"),
    DO_INFORMANTE_EM_POSSE_DE_TERCEIROS("1"),
    DE_TERCEIROS_EM_POSSE_DO_INFORMANTE("2");

    private final String codigo;

    SFIndicadorPropriedade(final String codigo) {
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
