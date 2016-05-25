package br.com.wmixvideo.sped.modelo;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class SFNotaFiscal implements Serializable {
    private static final long serialVersionUID = 6767616900683111018L;
    private SFUnidadeFederativa uf;
    private SFNotaFiscalFrete frete;
    private SFNotaFiscalEmissao emissao;
    private SFNotaFiscalOperacao operacao;
    private SFNotaFiscalPagamento pagamento;
    private SFNotaFiscalSituacao situacao;
    private String serie;
    private String numero;
    private String chaveNotaFiscalEletronica;
    private String codigoParticipante;
    private String codigoModeloFiscal;
    private LocalDate dataEmissao;
    private LocalDate dataOperacao;
    private BigDecimal valorDocumento;
    private BigDecimal valorDesconto;
    private BigDecimal valorAbatimentoNaoTributado;
    private BigDecimal valorMercadoriaEServico;
    private BigDecimal valorFrete;
    private BigDecimal valorSeguro;
    private BigDecimal valorOutrasDespesasAcessorias;
    private BigDecimal valorIcms;
    private BigDecimal valorIcmsSt;
    private BigDecimal valorBaseCalculoIcms;
    private BigDecimal valorBaseCalculoIcmsSt;
    private BigDecimal valorIpi;
    private BigDecimal valorPis;
    private BigDecimal valorPisSt;
    private BigDecimal valorCofins;
    private BigDecimal valorCofinsSt;
    private BigDecimal valorIcmsPartilhaDestinoFundoCombatePobreza;
    private BigDecimal valorIcmsPartilhaDestino;
    private BigDecimal valorIcmsPartilhaOrigem;

    public String getChaveNotaFiscalEletronica() {
        return chaveNotaFiscalEletronica;
    }

    public SFNotaFiscal setChaveNotaFiscalEletronica(String chaveNotaFiscalEletronica) {
        this.chaveNotaFiscalEletronica = chaveNotaFiscalEletronica;
        return this;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public SFNotaFiscal setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public SFNotaFiscal setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
        return this;
    }

    public SFNotaFiscalEmissao getEmissao() {
        return emissao;
    }

    public SFNotaFiscal setEmissao(SFNotaFiscalEmissao emissao) {
        this.emissao = emissao;
        return this;
    }

    public SFNotaFiscalFrete getFrete() {
        return frete;
    }

    public SFNotaFiscal setFrete(SFNotaFiscalFrete frete) {
        this.frete = frete;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public SFNotaFiscal setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SFNotaFiscalOperacao getOperacao() {
        return operacao;
    }

    public SFNotaFiscal setOperacao(SFNotaFiscalOperacao operacao) {
        this.operacao = operacao;
        return this;
    }

    public SFNotaFiscalPagamento getPagamento() {
        return pagamento;
    }

    public SFNotaFiscal setPagamento(SFNotaFiscalPagamento pagamento) {
        this.pagamento = pagamento;
        return this;
    }

    public String getSerie() {
        return serie;
    }

    public SFNotaFiscal setSerie(String serie) {
        this.serie = serie;
        return this;
    }

    public BigDecimal getValorAbatimentoNaoTributado() {
        return valorAbatimentoNaoTributado;
    }

    public SFNotaFiscal setValorAbatimentoNaoTributado(BigDecimal valorAbatimentoNaoTributado) {
        this.valorAbatimentoNaoTributado = valorAbatimentoNaoTributado;
        return this;
    }

    public BigDecimal getValorBaseCalculoIcms() {
        return valorBaseCalculoIcms;
    }

    public SFNotaFiscal setValorBaseCalculoIcms(BigDecimal valorBaseCalculoIcms) {
        this.valorBaseCalculoIcms = valorBaseCalculoIcms;
        return this;
    }

    public BigDecimal getValorBaseCalculoIcmsSt() {
        return valorBaseCalculoIcmsSt;
    }

    public SFNotaFiscal setValorBaseCalculoIcmsSt(BigDecimal valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
        return this;
    }

    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    public SFNotaFiscal setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
        return this;
    }

    public BigDecimal getValorCofinsSt() {
        return valorCofinsSt;
    }

    public SFNotaFiscal setValorCofinsSt(BigDecimal valorCofinsSt) {
        this.valorCofinsSt = valorCofinsSt;
        return this;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public SFNotaFiscal setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
        return this;
    }

    public BigDecimal getValorDocumento() {
        return valorDocumento;
    }

    public SFNotaFiscal setValorDocumento(BigDecimal valorDocumento) {
        this.valorDocumento = valorDocumento;
        return this;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public SFNotaFiscal setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public SFNotaFiscal setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    public BigDecimal getValorIcmsSt() {
        return valorIcmsSt;
    }

    public SFNotaFiscal setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
        return this;
    }

    public BigDecimal getValorIpi() {
        return valorIpi;
    }

    public SFNotaFiscal setValorIpi(BigDecimal valorIpi) {
        this.valorIpi = valorIpi;
        return this;
    }

    public BigDecimal getValorMercadoriaEServico() {
        return valorMercadoriaEServico;
    }

    public SFNotaFiscal setValorMercadoriaEServico(BigDecimal valorMercadoriaEServico) {
        this.valorMercadoriaEServico = valorMercadoriaEServico;
        return this;
    }

    public BigDecimal getValorOutrasDespesasAcessorias() {
        return valorOutrasDespesasAcessorias;
    }

    public SFNotaFiscal setValorOutrasDespesasAcessorias(BigDecimal valorOutrasDespesasAcessorias) {
        this.valorOutrasDespesasAcessorias = valorOutrasDespesasAcessorias;
        return this;
    }

    public BigDecimal getValorPis() {
        return valorPis;
    }

    public SFNotaFiscal setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
        return this;
    }

    public BigDecimal getValorPisSt() {
        return valorPisSt;
    }

    public SFNotaFiscal setValorPisSt(BigDecimal valorPisSt) {
        this.valorPisSt = valorPisSt;
        return this;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public SFNotaFiscal setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
        return this;
    }

    public String getCodigoParticipante() {
        return codigoParticipante;
    }

    public SFNotaFiscal setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public String getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }

    public SFNotaFiscal setCodigoModeloFiscal(String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
        return this;
    }

    public SFNotaFiscalSituacao getSituacao() {
        return situacao;
    }

    public SFNotaFiscal setSituacao(SFNotaFiscalSituacao situacao) {
        this.situacao = situacao;
        return this;
    }

    public BigDecimal getValorIcmsPartilhaDestinoFundoCombatePobreza() {
        return valorIcmsPartilhaDestinoFundoCombatePobreza;
    }

    public SFNotaFiscal setValorIcmsPartilhaDestinoFundoCombatePobreza(BigDecimal valorIcmsPartilhaDestinoFundoCombatePobreza) {
        this.valorIcmsPartilhaDestinoFundoCombatePobreza = valorIcmsPartilhaDestinoFundoCombatePobreza;
        return this;
    }

    public BigDecimal getValorIcmsPartilhaDestino() {
        return valorIcmsPartilhaDestino;
    }

    public SFNotaFiscal setValorIcmsPartilhaDestino(BigDecimal valorIcmsPartilhaDestino) {
        this.valorIcmsPartilhaDestino = valorIcmsPartilhaDestino;
        return this;
    }

    public BigDecimal getValorIcmsPartilhaOrigem() {
        return valorIcmsPartilhaOrigem;
    }

    public SFNotaFiscal setValorIcmsPartilhaOrigem(BigDecimal valorIcmsPartilhaOrigem) {
        this.valorIcmsPartilhaOrigem = valorIcmsPartilhaOrigem;
        return this;
    }

    public SFUnidadeFederativa getUf() {
        return uf;
    }

    public SFNotaFiscal setUf(SFUnidadeFederativa uf) {
        this.uf = uf;
        return this;
    }

    /**
     * Identifica se esta nota e uma nota fiscal eletronica. Sera eletronica quando tiver chave de acesso.
     * @return Se nota fiscal eletronica.
     */
    public boolean isNotaFiscalEletronica() {
        return !StringUtils.trimToEmpty(this.getChaveNotaFiscalEletronica()).isEmpty();
    }
}
