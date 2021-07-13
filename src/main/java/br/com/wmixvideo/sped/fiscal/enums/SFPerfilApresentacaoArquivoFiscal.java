package br.com.wmixvideo.sped.fiscal.enums;

public enum SFPerfilApresentacaoArquivoFiscal {

    PERFIL_A("A"),
    PERFIL_B("B"),
    PERFIL_C("C");

    private final String codigo;

    SFPerfilApresentacaoArquivoFiscal(final String codigo) {
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