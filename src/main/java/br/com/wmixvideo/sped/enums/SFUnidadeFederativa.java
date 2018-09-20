package br.com.wmixvideo.sped.enums;

public enum SFUnidadeFederativa {

    AC("AC", "Acre"),
    AL("AL", "Alagoas"),
    AP("AP", "Amap\u00E1"),
    AM("AM", "Amazonas"),
    BA("BA", "Bahia"),
    CE("CE", "Cear\u00E1"),
    DF("DF", "Distrito Federal"),
    GO("GO", "Goi\u00E1s"),
    ES("ES", "Esp\u00EDrito Santo"),
    MA("MA", "Maranh\u00E3o"),
    MT("MT", "Mato Grosso"),
    MS("MS", "Mato Grosso do Sul"),
    MG("MG", "Minas Gerais"),
    PA("PA", "Par\u00E1"),
    PB("PB", "Paraiba"),
    PR("PR", "Paran\u00E1"),
    PE("PE", "Pernambuco"),
    PI("PI", "Piau\u00ED"),
    RJ("RJ", "Rio de Janeiro"),
    RN("RN", "Rio Grande do Norte"),
    RS("RS", "Rio Grande do Sul"),
    RO("RO", "Rond\u00F4nia"),
    RR("RR", "Roraima"),
    SP("SP", "S\u00E3o Paulo"),
    SC("SC", "Santa Catarina"),
    SE("SE", "Sergipe"),
    TO("TO", "Tocantins");

    private final String codigo;
    private final String descricao;

    SFUnidadeFederativa(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return this.getCodigo();
    }

    /**
     * Identifica a UF pela sigla.
     * @param sigla da UF.
     * @return Unidade Federativa.
     */
    public static SFUnidadeFederativa valueOfCodigo(final String sigla) {
        for (final SFUnidadeFederativa uf : SFUnidadeFederativa.values()) {
            if (uf.getCodigo().equalsIgnoreCase(sigla)) {
                return uf;
            }
        }
        throw new IllegalArgumentException(String.format("A sigla da uf %s n\u00e3o foi encontrada.", sigla));
    }
}
