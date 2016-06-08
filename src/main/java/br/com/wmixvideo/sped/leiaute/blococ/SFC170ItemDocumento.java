package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorPeriodo;
import br.com.wmixvideo.sped.enums.SFMovimentacaoFisica;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC170ItemDocumento implements SFLinha {

    private int quantidade;
    private String ordem;
    private String codigo;
    private String descricao;
    private String unidade;
    private String codigoSituacaoTributaria;
    private String codigoFiscalOperacaoPrestacao;
    private String codigoNaturezaOperacao;
    private String codigoSituacaoTributariaIpi;
    private String codigoEnquadramentoIpi;
    private String codigoStPis;
    private String codigoStCofins;
    private String contaContabil;
    private BigDecimal valor;
    private BigDecimal valorDesconto;
    private BigDecimal valorBaseCalculoIcms;
    private BigDecimal valorAliquotaIcms;
    private BigDecimal valorIcms;
    private BigDecimal valorBaseCalculoIcmsSt;
    private BigDecimal valorAliquotaIcmsSt;
    private BigDecimal valorIcmsSt;
    private BigDecimal valorBaseCalculoIpi;
    private BigDecimal valorAliquotaIpi;
    private BigDecimal valorIpi;
    private BigDecimal valorBaseCalculoPis;
    private BigDecimal valorAliquotaPercentualPis;
    private BigDecimal quantidadeBaseCalculoPis;
    private BigDecimal valorAliquotaPis;
    private BigDecimal valorPis;
    private BigDecimal valorBaseCalculoCofins;
    private BigDecimal valorAliquotaPercentualCofins;
    private BigDecimal quantidadeBaseCalculoCofins;
    private BigDecimal valorAliquotaCofins;
    private BigDecimal valorCofins;
    private SFMovimentacaoFisica movimentacaoFisica;
    private SFIndicadorPeriodo indicadorPeriodo;

    @Override
    public String getCodigoRegistro() {
        return "C170";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(this.ordem);
        linha.append(this.codigo);
        linha.append(this.descricao);
        linha.append(this.quantidade);
        linha.append(this.unidade);
        linha.append(SFUtil.formatToString(this.valor));
        linha.append(SFUtil.formatToString(this.valorDesconto));
        linha.append(SFUtil.formatToString(this.movimentacaoFisica));
        linha.append(this.codigoSituacaoTributaria);
        linha.append(this.codigoFiscalOperacaoPrestacao);
        linha.append(this.codigoNaturezaOperacao);
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.valorAliquotaIcms));
        linha.append(SFUtil.formatToString(this.valorIcms));
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.valorAliquotaIcmsSt));
        linha.append(SFUtil.formatToString(this.valorIcmsSt));
        linha.append(SFUtil.formatToString(this.indicadorPeriodo));
        linha.append(this.codigoSituacaoTributariaIpi);
        linha.append(this.codigoEnquadramentoIpi);
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIpi));
        linha.append(SFUtil.formatToString(this.valorAliquotaIpi));
        linha.append(SFUtil.formatToString(this.valorIpi));
        linha.append(this.codigoStPis);
        linha.append(SFUtil.formatToString(this.valorBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.valorAliquotaPercentualPis));
        linha.append(SFUtil.formatToString(this.quantidadeBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.valorAliquotaPis));
        linha.append(SFUtil.formatToString(this.valorPis));
        linha.append(this.codigoStCofins);
        linha.append(SFUtil.formatToString(this.valorBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.valorAliquotaPercentualCofins));
        linha.append(SFUtil.formatToString(this.quantidadeBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.valorAliquotaCofins));
        linha.append(SFUtil.formatToString(this.valorCofins));
        linha.append(this.contaContabil);
        return linha.toString();
    }

    public SFC170ItemDocumento setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFC170ItemDocumento setCodigoEnquadramentoIpi(String codigoEnquadramentoIpi) {
        this.codigoEnquadramentoIpi = codigoEnquadramentoIpi;
        return this;
    }

    public SFC170ItemDocumento setCodigoFiscalOperacaoPrestacao(String codigoFiscalOperacaoPrestacao) {
        this.codigoFiscalOperacaoPrestacao = codigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFC170ItemDocumento setCodigoNaturezaOperacao(String codigoNaturezaOperacao) {
        this.codigoNaturezaOperacao = codigoNaturezaOperacao;
        return this;
    }

    public SFC170ItemDocumento setCodigoSituacaoTributaria(String codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
        return this;
    }

    public SFC170ItemDocumento setCodigoSituacaoTributariaIpi(String codigoSituacaoTributariaIpi) {
        this.codigoSituacaoTributariaIpi = codigoSituacaoTributariaIpi;
        return this;
    }

    public SFC170ItemDocumento setCodigoStCofins(String codigoStCofins) {
        this.codigoStCofins = codigoStCofins;
        return this;
    }

    public SFC170ItemDocumento setCodigoStPis(String codigoStPis) {
        this.codigoStPis = codigoStPis;
        return this;
    }

    public SFC170ItemDocumento setContaContabil(String contaContabil) {
        this.contaContabil = contaContabil;
        return this;
    }

    public SFC170ItemDocumento setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public SFC170ItemDocumento setIndicadorPeriodo(SFIndicadorPeriodo indicadorPeriodo) {
        this.indicadorPeriodo = indicadorPeriodo;
        return this;
    }

    public SFC170ItemDocumento setMovimentacaoFisica(SFMovimentacaoFisica movimentacaoFisica) {
        this.movimentacaoFisica = movimentacaoFisica;
        return this;
    }

    public SFC170ItemDocumento setOrdem(String ordem) {
        this.ordem = ordem;
        return this;
    }

    public SFC170ItemDocumento setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public SFC170ItemDocumento setQuantidadeBaseCalculoCofins(BigDecimal quantidadeBaseCalculoCofins) {
        this.quantidadeBaseCalculoCofins = quantidadeBaseCalculoCofins;
        return this;
    }

    public SFC170ItemDocumento setQuantidadeBaseCalculoPis(BigDecimal quantidadeBaseCalculoPis) {
        this.quantidadeBaseCalculoPis = quantidadeBaseCalculoPis;
        return this;
    }

    public SFC170ItemDocumento setUnidade(String unidade) {
        this.unidade = unidade;
        return this;
    }

    public SFC170ItemDocumento setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaCofins(BigDecimal valorAliquotaCofins) {
        this.valorAliquotaCofins = valorAliquotaCofins;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaIcms(BigDecimal valorAliquotaIcms) {
        this.valorAliquotaIcms = valorAliquotaIcms;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaIcmsSt(BigDecimal valorAliquotaIcmsSt) {
        this.valorAliquotaIcmsSt = valorAliquotaIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaIpi(BigDecimal valorAliquotaIpi) {
        this.valorAliquotaIpi = valorAliquotaIpi;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaPercentualCofins(BigDecimal valorAliquotaPercentualCofins) {
        this.valorAliquotaPercentualCofins = valorAliquotaPercentualCofins;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaPercentualPis(BigDecimal valorAliquotaPercentualPis) {
        this.valorAliquotaPercentualPis = valorAliquotaPercentualPis;
        return this;
    }

    public SFC170ItemDocumento setValorAliquotaPis(BigDecimal valorAliquotaPis) {
        this.valorAliquotaPis = valorAliquotaPis;
        return this;
    }

    public SFC170ItemDocumento setValorBaseCalculoCofins(BigDecimal valorBaseCalculoCofins) {
        this.valorBaseCalculoCofins = valorBaseCalculoCofins;
        return this;
    }

    public SFC170ItemDocumento setValorBaseCalculoIcms(BigDecimal valorBaseCalculoIcms) {
        this.valorBaseCalculoIcms = valorBaseCalculoIcms;
        return this;
    }

    public SFC170ItemDocumento setValorBaseCalculoIcmsSt(BigDecimal valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setValorBaseCalculoIpi(BigDecimal valorBaseCalculoIpi) {
        this.valorBaseCalculoIpi = valorBaseCalculoIpi;
        return this;
    }

    public SFC170ItemDocumento setValorBaseCalculoPis(BigDecimal valorBaseCalculoPis) {
        this.valorBaseCalculoPis = valorBaseCalculoPis;
        return this;
    }

    public SFC170ItemDocumento setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
        return this;
    }

    public SFC170ItemDocumento setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
        return this;
    }

    public SFC170ItemDocumento setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    public SFC170ItemDocumento setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setValorIpi(BigDecimal valorIpi) {
        this.valorIpi = valorIpi;
        return this;
    }

    public SFC170ItemDocumento setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
        return this;
    }
}