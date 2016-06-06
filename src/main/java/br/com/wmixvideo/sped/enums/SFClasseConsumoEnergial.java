package br.com.wmixvideo.sped.enums;

public enum SFClasseConsumoEnergial {

    COMERCIAL("01"),
    CONSUMO_PROPRIO("02"),
    ILUMINACAO_PUBLICA("03"),
    INDUSTRIAL("04"),
    PODER_PUBLICO("05"),
    RESIDENCIAL("06"),
    RURAL("07"),
    SERVICO_PUBLICO("08");

    private final String codigo;

    SFClasseConsumoEnergial(final String codigo) {
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
