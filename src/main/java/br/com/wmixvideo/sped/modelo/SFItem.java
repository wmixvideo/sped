package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class SFItem implements Serializable {
    private static final long serialVersionUID = 1314885623430502457L;
    private String codigo;
    private String codigoAnterior;
    private String codigoBarras;
    private String codigoNcm;
    private String codigoExIpi;
    private String codigoGenero;
    private String codigoServico;
    private String codigoSubstituicaoTributaria;
    private String descricao;
    private SFItemTipo tipo;
    private BigDecimal aliquotaIcms;
    private SFUnidadeMedida unidadeMedida;
    private List<SFItemAlteracao> alteracoes;

    public SFItem() {
        this.aliquotaIcms = BigDecimal.ZERO;
        this.alteracoes = Collections.emptyList();
    }

    public SFItem(SFItemTipo tipo, SFUnidadeMedida unidadeMedida) {
        this();
        this.tipo = tipo;
        this.unidadeMedida = unidadeMedida;
    }

    public BigDecimal getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(BigDecimal aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoExIpi() {
        return codigoExIpi;
    }

    public void setCodigoExIpi(String codigoExIpi) {
        this.codigoExIpi = codigoExIpi;
    }

    public String getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(String codigoGenero) {
        this.codigoGenero = codigoGenero;
    }

    public String getCodigoNcm() {
        return codigoNcm;
    }

    public void setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
    }

    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public SFItemTipo getTipo() {
        return tipo;
    }

    public void setTipo(SFItemTipo tipo) {
        this.tipo = tipo;
    }

    public SFUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(SFUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getCodigoAnterior() {
        return codigoAnterior;
    }

    public void setCodigoAnterior(String codigoAnterior) {
        this.codigoAnterior = codigoAnterior;
    }

    public List<SFItemAlteracao> getAlteracoes() {
        return alteracoes;
    }

    public void setAlteracoes(List<SFItemAlteracao> alteracoes) {
        this.alteracoes = alteracoes;
    }

    public String getCodigoSubstituicaoTributaria() {
        return codigoSubstituicaoTributaria;
    }

    public void setCodigoSubstituicaoTributaria(String codigoSubstituicaoTributaria) {
        this.codigoSubstituicaoTributaria = codigoSubstituicaoTributaria;
    }
}
