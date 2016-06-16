package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalPagamento;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFC100NotaFiscal implements SFLinha {

    private SFNotaFiscalOperacao campo02Operacao;
    private SFNotaFiscalEmissao campo03Emissao;
    private String campo04CodigoParticipante;
    private String campo05CodigoModeloFiscal;
    private SFNotaFiscalSituacao campo06Situacao;
    private String campo07Serie;
    private String campo08Numero;
    private String campo09ChaveNotaFiscalEletronica;
    private LocalDate campo10DataEmissao;
    private LocalDate campo11DataOperacao;
    private BigDecimal campo12ValorDocumento;
    private SFNotaFiscalPagamento campo13Pagamento;
    private BigDecimal campo14ValorDesconto;
    private BigDecimal campo15ValorAbatimentoNaoTributado;
    private BigDecimal campo16ValorMercadoriaEServico;
    private SFNotaFiscalFrete campo17Frete;
    private BigDecimal campo18ValorFrete;
    private BigDecimal campo19ValorSeguro;
    private BigDecimal campo20ValorOutrasDespesasAcessorias;
    private BigDecimal campo22ValorIcms;
    private BigDecimal campo24ValorIcmsSt;
    private BigDecimal campo21ValorBaseCalculoIcms;
    private BigDecimal campo23ValorBaseCalculoIcmsSt;
    private BigDecimal campo25ValorIpi;
    private BigDecimal campo26ValorPis;
    private BigDecimal campo28ValorPisSt;
    private BigDecimal campo27ValorCofins;
    private BigDecimal campo29ValorCofinsSt;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Operacao));
        linha.append(SFUtil.formatToString(this.campo03Emissao));
        linha.append(this.campo04CodigoParticipante);
        linha.append(this.campo05CodigoModeloFiscal);
        linha.append(SFUtil.formatToString(this.campo06Situacao));
        linha.append(this.campo07Serie);
        linha.append(this.campo08Numero);
        linha.append(this.campo09ChaveNotaFiscalEletronica);
        linha.append(SFUtil.formatToString(this.campo10DataEmissao));
        linha.append(SFUtil.formatToString(this.campo11DataOperacao));
        linha.append(SFUtil.formatToString(this.campo12ValorDocumento));
        linha.append(SFUtil.formatToString(this.campo13Pagamento));
        linha.append(SFUtil.formatToString(this.campo14ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo15ValorAbatimentoNaoTributado));
        linha.append(SFUtil.formatToString(this.campo16ValorMercadoriaEServico));
        linha.append(SFUtil.formatToString(this.campo17Frete));
        linha.append(SFUtil.formatToString(this.campo18ValorFrete));
        linha.append(SFUtil.formatToString(this.campo19ValorSeguro));
        linha.append(SFUtil.formatToString(this.campo20ValorOutrasDespesasAcessorias));
        linha.append(SFUtil.formatToString(this.campo21ValorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo22ValorIcms));
        linha.append(SFUtil.formatToString(this.campo23ValorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.campo24ValorIcmsSt));
        linha.append(SFUtil.formatToString(this.campo25ValorIpi));
        linha.append(SFUtil.formatToString(this.campo26ValorPis));
        linha.append(SFUtil.formatToString(this.campo27ValorCofins));
        linha.append(SFUtil.formatToString(this.campo28ValorPisSt));
        linha.append(SFUtil.formatToString(this.campo29ValorCofinsSt));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "C100";
    }

    public SFC100NotaFiscal setCampo02Operacao(SFNotaFiscalOperacao campo02Operacao) {
        this.campo02Operacao = campo02Operacao;
        return this;
    }

    public SFC100NotaFiscal setCampo03Emissao(SFNotaFiscalEmissao campo03Emissao) {
        this.campo03Emissao = campo03Emissao;
        return this;
    }

    public SFC100NotaFiscal setCampo04CodigoParticipante(String campo04CodigoParticipante) {
        this.campo04CodigoParticipante = campo04CodigoParticipante;
        return this;
    }

    public SFC100NotaFiscal setCampo05CodigoModeloFiscal(String campo05CodigoModeloFiscal) {
        this.campo05CodigoModeloFiscal = campo05CodigoModeloFiscal;
        return this;
    }

    public SFC100NotaFiscal setCampo06Situacao(SFNotaFiscalSituacao campo06Situacao) {
        this.campo06Situacao = campo06Situacao;
        return this;
    }

    public SFC100NotaFiscal setCampo07Serie(String campo07Serie) {
        this.campo07Serie = campo07Serie;
        return this;
    }

    public SFC100NotaFiscal setCampo08Numero(String campo08Numero) {
        this.campo08Numero = campo08Numero;
        return this;
    }

    public SFC100NotaFiscal setCampo09ChaveNotaFiscalEletronica(String campo09ChaveNotaFiscalEletronica) {
        this.campo09ChaveNotaFiscalEletronica = campo09ChaveNotaFiscalEletronica;
        return this;
    }

    public SFC100NotaFiscal setCampo10DataEmissao(LocalDate campo10DataEmissao) {
        this.campo10DataEmissao = campo10DataEmissao;
        return this;
    }

    public SFC100NotaFiscal setCampo11DataOperacao(LocalDate campo11DataOperacao) {
        this.campo11DataOperacao = campo11DataOperacao;
        return this;
    }

    public SFC100NotaFiscal setCampo12ValorDocumento(BigDecimal campo12ValorDocumento) {
        this.campo12ValorDocumento = campo12ValorDocumento;
        return this;
    }

    public SFC100NotaFiscal setCampo13Pagamento(SFNotaFiscalPagamento campo13Pagamento) {
        this.campo13Pagamento = campo13Pagamento;
        return this;
    }

    public SFC100NotaFiscal setCampo14ValorDesconto(BigDecimal campo14ValorDesconto) {
        this.campo14ValorDesconto = campo14ValorDesconto;
        return this;
    }

    public SFC100NotaFiscal setCampo15ValorAbatimentoNaoTributado(BigDecimal campo15ValorAbatimentoNaoTributado) {
        this.campo15ValorAbatimentoNaoTributado = campo15ValorAbatimentoNaoTributado;
        return this;
    }

    public SFC100NotaFiscal setCampo16ValorMercadoriaEServico(BigDecimal campo16ValorMercadoriaEServico) {
        this.campo16ValorMercadoriaEServico = campo16ValorMercadoriaEServico;
        return this;
    }

    public SFC100NotaFiscal setCampo17Frete(SFNotaFiscalFrete campo17Frete) {
        this.campo17Frete = campo17Frete;
        return this;
    }

    public SFC100NotaFiscal setCampo18ValorFrete(BigDecimal campo18ValorFrete) {
        this.campo18ValorFrete = campo18ValorFrete;
        return this;
    }

    public SFC100NotaFiscal setCampo19ValorSeguro(BigDecimal campo19ValorSeguro) {
        this.campo19ValorSeguro = campo19ValorSeguro;
        return this;
    }

    public SFC100NotaFiscal setCampo20ValorOutrasDespesasAcessorias(BigDecimal campo20ValorOutrasDespesasAcessorias) {
        this.campo20ValorOutrasDespesasAcessorias = campo20ValorOutrasDespesasAcessorias;
        return this;
    }

    public SFC100NotaFiscal setCampo21ValorBaseCalculoIcms(BigDecimal campo21ValorBaseCalculoIcms) {
        this.campo21ValorBaseCalculoIcms = campo21ValorBaseCalculoIcms;
        return this;
    }

    public SFC100NotaFiscal setCampo22ValorIcms(BigDecimal campo22ValorIcms) {
        this.campo22ValorIcms = campo22ValorIcms;
        return this;
    }

    public SFC100NotaFiscal setCampo23ValorBaseCalculoIcmsSt(BigDecimal campo23ValorBaseCalculoIcmsSt) {
        this.campo23ValorBaseCalculoIcmsSt = campo23ValorBaseCalculoIcmsSt;
        return this;
    }

    public SFC100NotaFiscal setCampo24ValorIcmsSt(BigDecimal campo24ValorIcmsSt) {
        this.campo24ValorIcmsSt = campo24ValorIcmsSt;
        return this;
    }

    public SFC100NotaFiscal setCampo25ValorIpi(BigDecimal campo25ValorIpi) {
        this.campo25ValorIpi = campo25ValorIpi;
        return this;
    }

    public SFC100NotaFiscal setCampo26ValorPis(BigDecimal campo26ValorPis) {
        this.campo26ValorPis = campo26ValorPis;
        return this;
    }

    public SFC100NotaFiscal setCampo27ValorCofins(BigDecimal campo27ValorCofins) {
        this.campo27ValorCofins = campo27ValorCofins;
        return this;
    }

    public SFC100NotaFiscal setCampo28ValorPisSt(BigDecimal campo28ValorPisSt) {
        this.campo28ValorPisSt = campo28ValorPisSt;
        return this;
    }

    public SFC100NotaFiscal setCampo29ValorCofinsSt(BigDecimal campo29ValorCofinsSt) {
        this.campo29ValorCofinsSt = campo29ValorCofinsSt;
        return this;
    }
}
