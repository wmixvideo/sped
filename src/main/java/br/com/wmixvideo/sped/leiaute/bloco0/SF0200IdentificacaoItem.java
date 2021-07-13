package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFItemTipo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.util.Objects;

public class SF0200IdentificacaoItem implements SFLinha, Comparable<SF0200IdentificacaoItem> {

    private String campo02Codigo;
    private String campo03Descricao;
    private String campo04CodigoBarras;
    private String campo05CodigoAnterior;
    private String campo06UnidadeMedida;
    private SFItemTipo campo07Tipo;
    private String campo08CodigoNcm;
    private String campo09CodigoExIpi;
    private String campo10CodigoGenero;
    private String campo11CodigoServico;
    private BigDecimal campo12AliquotaIcms;
    private String campo13CodigoEspecificadorSubstituicaoTributaria;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Descricao);
        linha.append(this.campo04CodigoBarras);
        linha.append(this.campo05CodigoAnterior);
        linha.append(this.campo06UnidadeMedida);
        linha.append(SFUtil.formatToString(this.campo07Tipo));
        linha.append(this.campo08CodigoNcm);
        linha.append(this.campo09CodigoExIpi);
        linha.append(this.campo10CodigoGenero);
        linha.append(this.campo11CodigoServico);
        linha.append(SFUtil.formatToString(this.campo12AliquotaIcms));
        linha.append(this.campo13CodigoEspecificadorSubstituicaoTributaria);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0200";
    }

    public SF0200IdentificacaoItem setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SF0200IdentificacaoItem setCampo03Descricao(String campo03Descricao) {
        this.campo03Descricao = campo03Descricao;
        return this;
    }

    public SF0200IdentificacaoItem setCampo04CodigoBarras(String campo04CodigoBarras) {
        this.campo04CodigoBarras = campo04CodigoBarras;
        return this;
    }

    public SF0200IdentificacaoItem setCampo05CodigoAnterior(String campo05CodigoAnterior) {
        this.campo05CodigoAnterior = campo05CodigoAnterior;
        return this;
    }

    public SF0200IdentificacaoItem setCampo06UnidadeMedida(String campo06UnidadeMedida) {
        this.campo06UnidadeMedida = campo06UnidadeMedida;
        return this;
    }

    public SF0200IdentificacaoItem setCampo07Tipo(SFItemTipo campo07Tipo) {
        this.campo07Tipo = campo07Tipo;
        return this;
    }

    public SF0200IdentificacaoItem setCampo08CodigoNcm(String campo08CodigoNcm) {
        this.campo08CodigoNcm = campo08CodigoNcm;
        return this;
    }

    public SF0200IdentificacaoItem setCampo09CodigoExIpi(String campo09CodigoExIpi) {
        this.campo09CodigoExIpi = campo09CodigoExIpi;
        return this;
    }

    public SF0200IdentificacaoItem setCampo10CodigoGenero(String campo10CodigoGenero) {
        this.campo10CodigoGenero = campo10CodigoGenero;
        return this;
    }

    public SF0200IdentificacaoItem setCampo11CodigoServico(String campo11CodigoServico) {
        this.campo11CodigoServico = campo11CodigoServico;
        return this;
    }

    public SF0200IdentificacaoItem setCampo12AliquotaIcms(BigDecimal campo12AliquotaIcms) {
        this.campo12AliquotaIcms = campo12AliquotaIcms;
        return this;
    }

    public SF0200IdentificacaoItem setCampo13CodigoEspecificadorSubstituicaoTributaria(String campo13CodigoEspecificadorSubstituicaoTributaria) {
        this.campo13CodigoEspecificadorSubstituicaoTributaria = campo13CodigoEspecificadorSubstituicaoTributaria;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SF0200IdentificacaoItem that = (SF0200IdentificacaoItem) o;
        return Objects.equals(campo02Codigo, that.campo02Codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campo02Codigo);
    }

    @Override
    public int compareTo(SF0200IdentificacaoItem o) {
        return SFUtil.formatToString(this.campo02Codigo).compareTo(SFUtil.formatToString(o.campo02Codigo));
    }
}