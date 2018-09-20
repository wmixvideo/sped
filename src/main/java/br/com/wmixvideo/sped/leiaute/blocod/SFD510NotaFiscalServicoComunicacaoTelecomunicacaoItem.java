package br.com.wmixvideo.sped.leiaute.blocod;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem implements SFLinha {

    private int campo02NumeroItem;
    private String campo03CodigoItem;
    private String campo04CodigoClassificacao;
    private BigDecimal campo05Quantidade;
    private BigDecimal campo06ValorUnitario;
    private BigDecimal campo07ValorItem;
    private BigDecimal campo08ValorDesconto;
    private String campo09CodigoSituacaoTributaria;
    private String campo10Cfop;
    private BigDecimal campo11BaseCalculoIcms;
    private BigDecimal campo12AliquotaIcms;
    private BigDecimal campo13ValorIcms;
    private BigDecimal campo14BaseCalculoIcmsDeOutrasUFs;
    private BigDecimal campo15ValorIcmsDeOutrasUFs;
    private String campo16Indicador;
    private String campo17CodigoParticipante;
    private BigDecimal campo18ValorPis;
    private BigDecimal campo19ValorCofins;
    private String campo20CodigoConta;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D510";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02NumeroItem);
        linha.append(this.campo03CodigoItem);
        linha.append(this.campo04CodigoClassificacao);
        linha.append(SFUtil.formatToString(this.campo05Quantidade));
        linha.append(SFUtil.formatToString(this.campo06ValorUnitario));
        linha.append(SFUtil.formatToString(this.campo07ValorItem));
        linha.append(SFUtil.formatToString(this.campo08ValorDesconto));
        linha.append(this.campo09CodigoSituacaoTributaria);
        linha.append(this.campo10Cfop);
        linha.append(SFUtil.formatToString(this.campo11BaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo12AliquotaIcms));
        linha.append(SFUtil.formatToString(this.campo13ValorIcms));
        linha.append(SFUtil.formatToString(this.campo14BaseCalculoIcmsDeOutrasUFs));
        linha.append(SFUtil.formatToString(this.campo15ValorIcmsDeOutrasUFs));
        linha.append(this.campo16Indicador);
        linha.append(this.campo17CodigoParticipante);
        linha.append(SFUtil.formatToString(this.campo18ValorPis));
        linha.append(SFUtil.formatToString(this.campo19ValorCofins));
        linha.append(this.campo20CodigoConta);
        return linha.toString();
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo02NumeroItem(final int campo02NumeroItem) {
        this.campo02NumeroItem = campo02NumeroItem;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo03CodigoItem(final String campo03CodigoItem) {
        this.campo03CodigoItem = campo03CodigoItem;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo04CodigoClassificacao(final String campo04CodigoClassificacao) {
        this.campo04CodigoClassificacao = campo04CodigoClassificacao;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo05Quantidade(final BigDecimal campo05Quantidade) {
        this.campo05Quantidade = campo05Quantidade;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo06ValorUnitario(final BigDecimal campo06ValorUnitario) {
        this.campo06ValorUnitario = campo06ValorUnitario;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo07ValorItem(final BigDecimal campo07ValorItem) {
        this.campo07ValorItem = campo07ValorItem;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo08ValorDesconto(final BigDecimal campo08ValorDesconto) {
        this.campo08ValorDesconto = campo08ValorDesconto;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo09CodigoSituacaoTributaria(final String campo09CodigoSituacaoTributaria) {
        this.campo09CodigoSituacaoTributaria = campo09CodigoSituacaoTributaria;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo10Cfop(final String campo10Cfop) {
        this.campo10Cfop = campo10Cfop;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo11BaseCalculoIcms(final BigDecimal campo11BaseCalculoIcms) {
        this.campo11BaseCalculoIcms = campo11BaseCalculoIcms;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo12AliquotaIcms(final BigDecimal campo12AliquotaIcms) {
        this.campo12AliquotaIcms = campo12AliquotaIcms;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo13ValorIcms(final BigDecimal campo13ValorIcms) {
        this.campo13ValorIcms = campo13ValorIcms;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo14BaseCalculoIcmsDeOutrasUFs(final BigDecimal campo14BaseCalculoIcmsDeOutrasUFs) {
        this.campo14BaseCalculoIcmsDeOutrasUFs = campo14BaseCalculoIcmsDeOutrasUFs;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo15ValorIcmsDeOutrasUFs(final BigDecimal campo15ValorIcmsDeOutrasUFs) {
        this.campo15ValorIcmsDeOutrasUFs = campo15ValorIcmsDeOutrasUFs;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo16Indicador(final String campo16Indicador) {
        this.campo16Indicador = campo16Indicador;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo17CodigoParticipante(final String campo17CodigoParticipante) {
        this.campo17CodigoParticipante = campo17CodigoParticipante;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo18ValorPis(final BigDecimal campo18ValorPis) {
        this.campo18ValorPis = campo18ValorPis;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo19ValorCofins(final BigDecimal campo19ValorCofins) {
        this.campo19ValorCofins = campo19ValorCofins;
        return this;
    }

    public SFD510NotaFiscalServicoComunicacaoTelecomunicacaoItem setCampo20CodigoConta(final String campo20CodigoConta) {
        this.campo20CodigoConta = campo20CodigoConta;
        return this;
    }

}