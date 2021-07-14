package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCInformacaoComplementar {

    PESSOA_JURIDICA_IMUNE_OU_ISENTA_IRPJ("01"),
    ORGAOS_PUBLICOS("02"),
    PESSOA_JURIDICA_INATIVA("03"),
    PESSOA_JURIDICA_EM_GERAL("04"),
    SOCIEDADE_EM_CONTA_DE_PARTICIPACAO("05"),
    SOCIEDADE_COOPERATIVA("06"),
    INCORPORACAO_FUSAO_CISAO("07"),
    DEMAIS_HIPOTESES("99");

    private final String codigo;

    SCInformacaoComplementar(final String codigo) {
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