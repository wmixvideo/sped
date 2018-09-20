package br.com.wmixvideo.sped.leiaute.blocod;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.wmixvideo.sped.enums.*;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFD500NotaFiscalServicoComunicacaoTelecomunicacao implements SFLinha {

    private SFIndicadorOperacao campo02IndicadorOperacao;
    private SFNotaFiscalEmissao campo03EmitenteDocumento;
    private String campo04CodigoParticipante;
    private SFDocumentoModelo campo05ModeloDocumento;
    private SFNotaFiscalSituacao campo06CodigoSituacaoDocumentoFiscal;
    private String campo07SerieDocumento;
    private String campo08SubSerieDocumento;
    private String campo09NumeroDocumento;
    private LocalDate campo10DataEmissao;
    private LocalDate campo11DataEntrada;
    private BigDecimal campo12ValorTotalDocumento;
    private BigDecimal campo13ValorDesconto;
    private BigDecimal campo14ValorPrestacaoServico;
    private BigDecimal campo15ValorTotalServicosNaoTributadoIcms;
    private BigDecimal campo16ValorCobradoEmNomeTerceiros;
    private BigDecimal campo17ValorOutrasDespesas;
    private BigDecimal campo18ValorBaseCalculoIcms;
    private BigDecimal campo19ValorICMS;
    private String campo20CodigoInformacaoComplementar;
    private BigDecimal campo21ValorPis;
    private BigDecimal campo22ValorCofins;
    private String campo23CodigoContaContabil;
    private SFTipoAssinante campo24TipoAssinante;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D500";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorOperacao));
        linha.append(SFUtil.formatToString(this.campo03EmitenteDocumento));
        linha.append(this.campo04CodigoParticipante);
        linha.append(SFUtil.formatToString(this.campo05ModeloDocumento));
        linha.append(SFUtil.formatToString(this.campo06CodigoSituacaoDocumentoFiscal));
        linha.append(this.campo07SerieDocumento);
        linha.append(this.campo08SubSerieDocumento);
        linha.append(this.campo09NumeroDocumento);
        linha.append(SFUtil.formatToString(this.campo10DataEmissao));
        linha.append(SFUtil.formatToString(this.campo11DataEntrada));
        linha.append(SFUtil.formatToString(this.campo12ValorTotalDocumento));
        linha.append(SFUtil.formatToString(this.campo13ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo14ValorPrestacaoServico));
        linha.append(SFUtil.formatToString(this.campo15ValorTotalServicosNaoTributadoIcms));
        linha.append(SFUtil.formatToString(this.campo16ValorCobradoEmNomeTerceiros));
        linha.append(SFUtil.formatToString(this.campo17ValorOutrasDespesas));
        linha.append(SFUtil.formatToString(this.campo18ValorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo19ValorICMS));
        linha.append(this.campo20CodigoInformacaoComplementar);
        linha.append(SFUtil.formatToString(this.campo21ValorPis));
        linha.append(SFUtil.formatToString(this.campo22ValorCofins));
        linha.append(this.campo23CodigoContaContabil);
        linha.append(SFUtil.formatToString(this.campo24TipoAssinante));
        return linha.toString();
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo02IndicadorOperacao(final SFIndicadorOperacao campo02IndicadorOperacao) {
        this.campo02IndicadorOperacao = campo02IndicadorOperacao;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo03EmitenteDocumento(final SFNotaFiscalEmissao campo03EmitenteDocumento) {
        this.campo03EmitenteDocumento = campo03EmitenteDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo04CodigoParticipante(final String campo04CodigoParticipante) {
        this.campo04CodigoParticipante = campo04CodigoParticipante;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo05ModeloDocumento(final SFDocumentoModelo campo05ModeloDocumento) {
        this.campo05ModeloDocumento = campo05ModeloDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo06CodigoSituacaoDocumentoFiscal(final SFNotaFiscalSituacao campo06CodigoSituacaoDocumentoFiscal) {
        this.campo06CodigoSituacaoDocumentoFiscal = campo06CodigoSituacaoDocumentoFiscal;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo07SerieDocumento(final String campo07SerieDocumento) {
        this.campo07SerieDocumento = campo07SerieDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo08SubSerieDocumento(final String campo08SubSerieDocumento) {
        this.campo08SubSerieDocumento = campo08SubSerieDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo09NumeroDocumento(final String campo09NumeroDocumento) {
        this.campo09NumeroDocumento = campo09NumeroDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo10DataEmissao(final LocalDate campo10DataEmissao) {
        this.campo10DataEmissao = campo10DataEmissao;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo11DataEntrada(final LocalDate campo11DataEntrada) {
        this.campo11DataEntrada = campo11DataEntrada;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo12ValorTotalDocumento(final BigDecimal campo12ValorTotalDocumento) {
        this.campo12ValorTotalDocumento = campo12ValorTotalDocumento;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo13ValorDesconto(final BigDecimal campo13ValorDesconto) {
        this.campo13ValorDesconto = campo13ValorDesconto;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo14ValorPrestacaoServico(final BigDecimal campo14ValorPrestacaoServico) {
        this.campo14ValorPrestacaoServico = campo14ValorPrestacaoServico;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo15ValorTotalServicosNaoTributadoIcms(final BigDecimal campo15ValorTotalServicosNaoTributadoIcms) {
        this.campo15ValorTotalServicosNaoTributadoIcms = campo15ValorTotalServicosNaoTributadoIcms;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo16ValorCobradoEmNomeTerceiros(final BigDecimal campo16ValorCobradoEmNomeTerceiros) {
        this.campo16ValorCobradoEmNomeTerceiros = campo16ValorCobradoEmNomeTerceiros;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo17ValorOutrasDespesas(final BigDecimal campo17ValorOutrasDespesas) {
        this.campo17ValorOutrasDespesas = campo17ValorOutrasDespesas;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo18ValorBaseCalculoIcms(final BigDecimal campo18ValorBaseCalculoIcms) {
        this.campo18ValorBaseCalculoIcms = campo18ValorBaseCalculoIcms;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo19ValorICMS(final BigDecimal campo19ValorICMS) {
        this.campo19ValorICMS = campo19ValorICMS;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo20CodigoInformacaoComplementar(final String campo20CodigoInformacaoComplementar) {
        this.campo20CodigoInformacaoComplementar = campo20CodigoInformacaoComplementar;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo21ValorPis(final BigDecimal campo21ValorPis) {
        this.campo21ValorPis = campo21ValorPis;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo22ValorCofins(final BigDecimal campo22ValorCofins) {
        this.campo22ValorCofins = campo22ValorCofins;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo23CodigoContaContabil(final String campo23CodigoContaContabil) {
        this.campo23CodigoContaContabil = campo23CodigoContaContabil;
        return this;
    }

    public SFD500NotaFiscalServicoComunicacaoTelecomunicacao setCampo24TipoAssinante(final SFTipoAssinante campo24TipoAssinante) {
        this.campo24TipoAssinante = campo24TipoAssinante;
        return this;
    }
}
