package br.com.wmixvideo.sped.fiscal.leiaute.blocoa;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalPagamento;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFA100NotaFiscalServico implements SFLinha {

    private SFIndicadorOperacao campo02IndicadorOperacao;
    private SFIndicadorEmitente campo03IdicadorEmitente;
    private String campo04CodigoParticipante;
    private SFNotaFiscalSituacao campo05CodigoSituacaoDocumentoFiscal;
    private String campo06SerieDocumento;
    private String campo07SubserieDocumento;
    private String campo08NumeroDocumento;
    private String campo09ChaveCodigoVerificacaoEletronica;
    private LocalDate campo10DataEmissao;
    private LocalDate campo11DataExecucao;
    private BigDecimal campo12ValorTotalDocumento;
    private SFNotaFiscalPagamento campo13Indicador;
    private BigDecimal campo14ValorTotalDesconto;
    private BigDecimal campo15ValorBaseCalculoPis;
    private BigDecimal campo16ValorTotalPis;
    private BigDecimal campo17ValorBaseCalculoCofins;
    private BigDecimal campo18ValorCofins;
    private BigDecimal campo19ValorPisRetidoFonte;
    private BigDecimal campo20ValorCofinsRetidoFonte;
    private BigDecimal campo21ValorTotalISS;

    @Override
    public String getCampo01CodigoRegistro() {
        return "A100";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorOperacao));
        linha.append(SFUtil.formatToString(this.campo03IdicadorEmitente));
        linha.append(this.campo04CodigoParticipante);
        linha.append(SFUtil.formatToString(this.campo05CodigoSituacaoDocumentoFiscal));
        linha.append(this.campo06SerieDocumento);
        linha.append(this.campo07SubserieDocumento);
        linha.append(this.campo08NumeroDocumento);
        linha.append(this.campo09ChaveCodigoVerificacaoEletronica);
        linha.append(SFUtil.formatToString(this.campo10DataEmissao));
        linha.append(SFUtil.formatToString(this.campo11DataExecucao));
        linha.append(SFUtil.formatToString(this.campo12ValorTotalDocumento));
        linha.append(SFUtil.formatToString(this.campo13Indicador));
        linha.append(SFUtil.formatToString(this.campo14ValorTotalDesconto));
        linha.append(SFUtil.formatToString(this.campo15ValorBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.campo16ValorTotalPis));
        linha.append(SFUtil.formatToString(this.campo17ValorBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.campo18ValorCofins));
        linha.append(SFUtil.formatToString(this.campo19ValorPisRetidoFonte));
        linha.append(SFUtil.formatToString(this.campo20ValorCofinsRetidoFonte));
        linha.append(SFUtil.formatToString(this.campo21ValorTotalISS));
        return linha.toString();
    }

    public SFA100NotaFiscalServico setCampo02IndicadorOperacao(final SFIndicadorOperacao campo02IndicadorOperacao) {
        this.campo02IndicadorOperacao = campo02IndicadorOperacao;
        return this;
    }

    public SFA100NotaFiscalServico setCampo03IdicadorEmitente(final SFIndicadorEmitente campo03IdicadorEmitente) {
        this.campo03IdicadorEmitente = campo03IdicadorEmitente;
        return this;
    }

    public SFA100NotaFiscalServico setCampo04CodigoParticipante(final String campo04CodigoParticipante) {
        this.campo04CodigoParticipante = campo04CodigoParticipante;
        return this;
    }

    public SFA100NotaFiscalServico setCampo05CodigoSituacaoDocumentoFiscal(final SFNotaFiscalSituacao campo05CodigoSituacaoDocumentoFiscal) {
        this.campo05CodigoSituacaoDocumentoFiscal = campo05CodigoSituacaoDocumentoFiscal;
        return this;
    }

    public SFA100NotaFiscalServico setCampo06SerieDocumento(final String campo06SerieDocumento) {
        this.campo06SerieDocumento = campo06SerieDocumento;
        return this;
    }

    public SFA100NotaFiscalServico setCampo07SubserieDocumento(final String campo07SubserieDocumento) {
        this.campo07SubserieDocumento = campo07SubserieDocumento;
        return this;
    }

    public SFA100NotaFiscalServico setCampo08NumeroDocumento(final String campo08NumeroDocumento) {
        this.campo08NumeroDocumento = campo08NumeroDocumento;
        return this;
    }

    public SFA100NotaFiscalServico setCampo09ChaveCodigoVerificacaoEletronica(final String campo09ChaveCodigoVerificacaoEletronica) {
        this.campo09ChaveCodigoVerificacaoEletronica = campo09ChaveCodigoVerificacaoEletronica;
        return this;
    }

    public SFA100NotaFiscalServico setCampo10DataEmissao(final LocalDate campo10DataEmissao) {
        this.campo10DataEmissao = campo10DataEmissao;
        return this;
    }

    public SFA100NotaFiscalServico setCampo11DataExecucao(final LocalDate campo11DataExecucao) {
        this.campo11DataExecucao = campo11DataExecucao;
        return this;
    }

    public SFA100NotaFiscalServico setCampo12ValorTotalDocumento(final BigDecimal campo12ValorTotalDocumento) {
        this.campo12ValorTotalDocumento = campo12ValorTotalDocumento;
        return this;
    }

    public SFA100NotaFiscalServico setCampo13Indicador(final SFNotaFiscalPagamento campo13Indicador) {
        this.campo13Indicador = campo13Indicador;
        return this;
    }

    public SFA100NotaFiscalServico setCampo14ValorTotalDesconto(final BigDecimal campo14ValorTotalDesconto) {
        this.campo14ValorTotalDesconto = campo14ValorTotalDesconto;
        return this;
    }

    public SFA100NotaFiscalServico setCampo15ValorBaseCalculoPis(final BigDecimal campo15ValorBaseCalculoPis) {
        this.campo15ValorBaseCalculoPis = campo15ValorBaseCalculoPis;
        return this;
    }

    public SFA100NotaFiscalServico setCampo16ValorTotalPis(final BigDecimal campo16ValorTotalPis) {
        this.campo16ValorTotalPis = campo16ValorTotalPis;
        return this;
    }

    public SFA100NotaFiscalServico setCampo17ValorBaseCalculoCofins(final BigDecimal campo17ValorBaseCalculoCofins) {
        this.campo17ValorBaseCalculoCofins = campo17ValorBaseCalculoCofins;
        return this;
    }

    public SFA100NotaFiscalServico setCampo18ValorCofins(final BigDecimal campo18ValorCofins) {
        this.campo18ValorCofins = campo18ValorCofins;
        return this;
    }

    public SFA100NotaFiscalServico setCampo19ValorPisRetidoFonte(final BigDecimal campo19ValorPisRetidoFonte) {
        this.campo19ValorPisRetidoFonte = campo19ValorPisRetidoFonte;
        return this;
    }

    public SFA100NotaFiscalServico setCampo20ValorCofinsRetidoFonte(final BigDecimal campo20ValorCofinsRetidoFonte) {
        this.campo20ValorCofinsRetidoFonte = campo20ValorCofinsRetidoFonte;
        return this;
    }

    public SFA100NotaFiscalServico setCampo21ValorTotalISS(final BigDecimal campo21ValorTotalISS) {
        this.campo21ValorTotalISS = campo21ValorTotalISS;
        return this;
    }
}