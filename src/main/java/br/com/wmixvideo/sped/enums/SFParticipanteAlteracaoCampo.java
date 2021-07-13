package br.com.wmixvideo.sped.enums;

public enum SFParticipanteAlteracaoCampo {
    NOME("03"),
    CODIGO_PAIS("04"),
    CNPJ("05"),
    CPF("06"),
    @Deprecated
    INSCRICAO_ESTADUAL("07"),
    CODIDO_MUNICIPIO("08"),
    SUFRAMA("09"),
    ENDERECO("10"),
    NUMERO("11"),
    COMPLEMENTO("12"),
    BAIRRO("13");

    private final String numero;

    SFParticipanteAlteracaoCampo(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return this.numero;
    }
}
