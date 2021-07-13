package br.com.wmixvideo.sped.contribuicoes.enums;

public enum SCIndicadorNaturezaPessoaJuridica {

    PESSOA_JURIDICA("00"),
    SOCIEDADE_COOPERATIVA("01"),
    ENTIDADE_SUJEITA_PIS_PASEP("02"),
    PESSOA_JURIDICA_SCP("03"),
    SOCIEDADE_COOPERATIVA_SCP("04"),
    SOCIEDADE_CONTA_PARTICIPACAO("05");

    private String codigo;

    SCIndicadorNaturezaPessoaJuridica(final String codigo) {
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