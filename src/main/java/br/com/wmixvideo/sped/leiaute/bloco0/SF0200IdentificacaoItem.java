package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFItemTipo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Objects;

public class SF0200IdentificacaoItem implements SFLinha, Comparable<SF0200IdentificacaoItem> {

    private String codigo;
    private String codigoAnterior;
    private String codigoBarras;
    private String codigoNcm;
    private String codigoExIpi;
    private String codigoGenero;
    private String codigoServico;
    private String descricao;
    private String unidadeMedida;
    private SFItemTipo tipo;
    private BigDecimal aliquotaIcms;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.descricao);
        texto.append(StringUtils.trimToEmpty(this.codigoBarras));
        texto.append(this.codigoAnterior);
        texto.append(this.unidadeMedida);
        texto.append(this.tipo != null ? this.tipo.getCodigo() : "");
        texto.append(this.codigoNcm);
        texto.append(this.codigoExIpi);
        texto.append(this.codigoGenero);
        texto.append(this.codigoServico);
        texto.append(SFUtil.formatToString(this.aliquotaIcms));
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0200";
    }

    public SF0200IdentificacaoItem setAliquotaIcms(BigDecimal aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
        return this;
    }

    public SF0200IdentificacaoItem setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoAnterior(String codigoAnterior) {
        this.codigoAnterior = codigoAnterior;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoExIpi(String codigoExIpi) {
        this.codigoExIpi = codigoExIpi;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoGenero(String codigoGenero) {
        this.codigoGenero = codigoGenero;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
        return this;
    }

    public SF0200IdentificacaoItem setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
        return this;
    }

    public SF0200IdentificacaoItem setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public SF0200IdentificacaoItem setTipo(SFItemTipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public SF0200IdentificacaoItem setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SF0200IdentificacaoItem that = (SF0200IdentificacaoItem) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(SF0200IdentificacaoItem o) {
        final String codigoBase = StringUtils.defaultIfBlank(this.codigo, StringUtils.EMPTY);
        final String codigoComparador = StringUtils.defaultIfBlank(o.codigo, StringUtils.EMPTY);
        return codigoBase.compareTo(codigoComparador);
    }
}