package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorPeriodo;
import br.com.wmixvideo.sped.fiscal.enums.SFMovimentacaoFisica;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC170ItemDocumento implements SFLinha {

    private int campo05Quantidade;
    private String campo02Ordem;
    private String campo03Codigo;
    private String campo04Descricao;
    private String campo06Unidade;
    private String campo10CodigoSituacaoTributaria;
    private String campo11CodigoFiscalOperacaoPrestacao;
    private String campo12CodigoNaturezaOperacao;
    private String campo20CodigoSituacaoTributariaIpi;
    private String campo21CodigoEnquadramentoIpi;
    private String campo25CodigoStPis;
    private String campo31CodigoStCofins;
    private String campo37ContaContabil;
    private BigDecimal campo07Valor;
    private BigDecimal campo08ValorDesconto;
    private BigDecimal campo13ValorBaseCalculoIcms;
    private BigDecimal campo14ValorAliquotaIcms;
    private BigDecimal campo15ValorIcms;
    private BigDecimal campo16ValorBaseCalculoIcmsSt;
    private BigDecimal campo17ValorAliquotaIcmsSt;
    private BigDecimal campo18ValorIcmsSt;
    private BigDecimal campo22ValorBaseCalculoIpi;
    private BigDecimal campo23ValorAliquotaIpi;
    private BigDecimal campo24ValorIpi;
    private BigDecimal campo26ValorBaseCalculoPis;
    private BigDecimal campo27ValorAliquotaPercentualPis;
    private BigDecimal campo28QuantidadeBaseCalculoPis;
    private BigDecimal campo29ValorAliquotaPis;
    private BigDecimal campo30ValorPis;
    private BigDecimal campo32ValorBaseCalculoCofins;
    private BigDecimal campo33ValorAliquotaPercentualCofins;
    private BigDecimal campo34QuantidadeBaseCalculoCofins;
    private BigDecimal campo35ValorAliquotaCofins;
    private BigDecimal campo36ValorCofins;
    private SFMovimentacaoFisica campo09MovimentacaoFisica;
    private SFIndicadorPeriodo campo19IndicadorPeriodo;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Ordem);
        linha.append(this.campo03Codigo);
        linha.append(this.campo04Descricao);
        linha.append(this.campo05Quantidade);
        linha.append(this.campo06Unidade);
        linha.append(SFUtil.formatToString(this.campo07Valor));
        linha.append(SFUtil.formatToString(this.campo08ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo09MovimentacaoFisica));
        linha.append(this.campo10CodigoSituacaoTributaria);
        linha.append(this.campo11CodigoFiscalOperacaoPrestacao);
        linha.append(this.campo12CodigoNaturezaOperacao);
        linha.append(SFUtil.formatToString(this.campo13ValorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo14ValorAliquotaIcms));
        linha.append(SFUtil.formatToString(this.campo15ValorIcms));
        linha.append(SFUtil.formatToString(this.campo16ValorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.campo17ValorAliquotaIcmsSt));
        linha.append(SFUtil.formatToString(this.campo18ValorIcmsSt));
        linha.append(SFUtil.formatToString(this.campo19IndicadorPeriodo));
        linha.append(this.campo20CodigoSituacaoTributariaIpi);
        linha.append(this.campo21CodigoEnquadramentoIpi);
        linha.append(SFUtil.formatToString(this.campo22ValorBaseCalculoIpi));
        linha.append(SFUtil.formatToString(this.campo23ValorAliquotaIpi));
        linha.append(SFUtil.formatToString(this.campo24ValorIpi));
        linha.append(this.campo25CodigoStPis);
        linha.append(SFUtil.formatToString(this.campo26ValorBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.campo27ValorAliquotaPercentualPis));
        linha.append(SFUtil.formatToString(this.campo28QuantidadeBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.campo29ValorAliquotaPis));
        linha.append(SFUtil.formatToString(this.campo30ValorPis));
        linha.append(this.campo31CodigoStCofins);
        linha.append(SFUtil.formatToString(this.campo32ValorBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.campo33ValorAliquotaPercentualCofins));
        linha.append(SFUtil.formatToString(this.campo34QuantidadeBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.campo35ValorAliquotaCofins));
        linha.append(SFUtil.formatToString(this.campo36ValorCofins));
        linha.append(this.campo37ContaContabil);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "C170";
    }

    public SFC170ItemDocumento setCampo03Codigo(String campo03Codigo) {
        this.campo03Codigo = campo03Codigo;
        return this;
    }

    public SFC170ItemDocumento setCampo21CodigoEnquadramentoIpi(String campo21CodigoEnquadramentoIpi) {
        this.campo21CodigoEnquadramentoIpi = campo21CodigoEnquadramentoIpi;
        return this;
    }

    public SFC170ItemDocumento setCampo11CodigoFiscalOperacaoPrestacao(String campo11CodigoFiscalOperacaoPrestacao) {
        this.campo11CodigoFiscalOperacaoPrestacao = campo11CodigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFC170ItemDocumento setCampo12CodigoNaturezaOperacao(String campo12CodigoNaturezaOperacao) {
        this.campo12CodigoNaturezaOperacao = campo12CodigoNaturezaOperacao;
        return this;
    }

    public SFC170ItemDocumento setCampo10CodigoSituacaoTributaria(String campo10CodigoSituacaoTributaria) {
        this.campo10CodigoSituacaoTributaria = campo10CodigoSituacaoTributaria;
        return this;
    }

    public SFC170ItemDocumento setCampo20CodigoSituacaoTributariaIpi(String campo20CodigoSituacaoTributariaIpi) {
        this.campo20CodigoSituacaoTributariaIpi = campo20CodigoSituacaoTributariaIpi;
        return this;
    }

    public SFC170ItemDocumento setCampo31CodigoStCofins(String campo31CodigoStCofins) {
        this.campo31CodigoStCofins = campo31CodigoStCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo25CodigoStPis(String campo25CodigoStPis) {
        this.campo25CodigoStPis = campo25CodigoStPis;
        return this;
    }

    public SFC170ItemDocumento setCampo37ContaContabil(String campo37ContaContabil) {
        this.campo37ContaContabil = campo37ContaContabil;
        return this;
    }

    public SFC170ItemDocumento setCampo04Descricao(String campo04Descricao) {
        this.campo04Descricao = campo04Descricao;
        return this;
    }

    public SFC170ItemDocumento setCampo19IndicadorPeriodo(SFIndicadorPeriodo campo19IndicadorPeriodo) {
        this.campo19IndicadorPeriodo = campo19IndicadorPeriodo;
        return this;
    }

    public SFC170ItemDocumento setCampo09MovimentacaoFisica(SFMovimentacaoFisica campo09MovimentacaoFisica) {
        this.campo09MovimentacaoFisica = campo09MovimentacaoFisica;
        return this;
    }

    public SFC170ItemDocumento setCampo02Ordem(String campo02Ordem) {
        this.campo02Ordem = campo02Ordem;
        return this;
    }

    public SFC170ItemDocumento setCampo05Quantidade(int campo05Quantidade) {
        this.campo05Quantidade = campo05Quantidade;
        return this;
    }

    public SFC170ItemDocumento setCampo34QuantidadeBaseCalculoCofins(BigDecimal campo34QuantidadeBaseCalculoCofins) {
        this.campo34QuantidadeBaseCalculoCofins = campo34QuantidadeBaseCalculoCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo28QuantidadeBaseCalculoPis(BigDecimal campo28QuantidadeBaseCalculoPis) {
        this.campo28QuantidadeBaseCalculoPis = campo28QuantidadeBaseCalculoPis;
        return this;
    }

    public SFC170ItemDocumento setCampo06Unidade(String campo06Unidade) {
        this.campo06Unidade = campo06Unidade;
        return this;
    }

    public SFC170ItemDocumento setCampo07Valor(BigDecimal campo07Valor) {
        this.campo07Valor = campo07Valor;
        return this;
    }

    public SFC170ItemDocumento setCampo35ValorAliquotaCofins(BigDecimal campo35ValorAliquotaCofins) {
        this.campo35ValorAliquotaCofins = campo35ValorAliquotaCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo14ValorAliquotaIcms(BigDecimal campo14ValorAliquotaIcms) {
        this.campo14ValorAliquotaIcms = campo14ValorAliquotaIcms;
        return this;
    }

    public SFC170ItemDocumento setCampo17ValorAliquotaIcmsSt(BigDecimal campo17ValorAliquotaIcmsSt) {
        this.campo17ValorAliquotaIcmsSt = campo17ValorAliquotaIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setCampo23ValorAliquotaIpi(BigDecimal campo23ValorAliquotaIpi) {
        this.campo23ValorAliquotaIpi = campo23ValorAliquotaIpi;
        return this;
    }

    public SFC170ItemDocumento setCampo33ValorAliquotaPercentualCofins(BigDecimal campo33ValorAliquotaPercentualCofins) {
        this.campo33ValorAliquotaPercentualCofins = campo33ValorAliquotaPercentualCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo27ValorAliquotaPercentualPis(BigDecimal campo27ValorAliquotaPercentualPis) {
        this.campo27ValorAliquotaPercentualPis = campo27ValorAliquotaPercentualPis;
        return this;
    }

    public SFC170ItemDocumento setCampo29ValorAliquotaPis(BigDecimal campo29ValorAliquotaPis) {
        this.campo29ValorAliquotaPis = campo29ValorAliquotaPis;
        return this;
    }

    public SFC170ItemDocumento setCampo32ValorBaseCalculoCofins(BigDecimal campo32ValorBaseCalculoCofins) {
        this.campo32ValorBaseCalculoCofins = campo32ValorBaseCalculoCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo13ValorBaseCalculoIcms(BigDecimal campo13ValorBaseCalculoIcms) {
        this.campo13ValorBaseCalculoIcms = campo13ValorBaseCalculoIcms;
        return this;
    }

    public SFC170ItemDocumento setCampo16ValorBaseCalculoIcmsSt(BigDecimal campo16ValorBaseCalculoIcmsSt) {
        this.campo16ValorBaseCalculoIcmsSt = campo16ValorBaseCalculoIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setCampo22ValorBaseCalculoIpi(BigDecimal campo22ValorBaseCalculoIpi) {
        this.campo22ValorBaseCalculoIpi = campo22ValorBaseCalculoIpi;
        return this;
    }

    public SFC170ItemDocumento setCampo26ValorBaseCalculoPis(BigDecimal campo26ValorBaseCalculoPis) {
        this.campo26ValorBaseCalculoPis = campo26ValorBaseCalculoPis;
        return this;
    }

    public SFC170ItemDocumento setCampo36ValorCofins(BigDecimal campo36ValorCofins) {
        this.campo36ValorCofins = campo36ValorCofins;
        return this;
    }

    public SFC170ItemDocumento setCampo08ValorDesconto(BigDecimal campo08ValorDesconto) {
        this.campo08ValorDesconto = campo08ValorDesconto;
        return this;
    }

    public SFC170ItemDocumento setCampo15ValorIcms(BigDecimal campo15ValorIcms) {
        this.campo15ValorIcms = campo15ValorIcms;
        return this;
    }

    public SFC170ItemDocumento setCampo18ValorIcmsSt(BigDecimal campo18ValorIcmsSt) {
        this.campo18ValorIcmsSt = campo18ValorIcmsSt;
        return this;
    }

    public SFC170ItemDocumento setCampo24ValorIpi(BigDecimal campo24ValorIpi) {
        this.campo24ValorIpi = campo24ValorIpi;
        return this;
    }

    public SFC170ItemDocumento setCampo30ValorPis(BigDecimal campo30ValorPis) {
        this.campo30ValorPis = campo30ValorPis;
        return this;
    }
}