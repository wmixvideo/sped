package br.com.wmixvideo.sped.leiaute;

public enum SFPerfilApresentacaoArquivoFiscal {

    PERFIL_A("A"),
    PERFIL_B("B"),
    PERFIL_C("C");

    private String codigo;

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