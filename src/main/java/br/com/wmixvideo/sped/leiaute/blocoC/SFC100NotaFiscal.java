package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalPagamento;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFC100NotaFiscal implements SFLinha {

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

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.operacao != null ? this.operacao.getCodigo() : StringUtils.EMPTY);
        texto.append(this.emissao != null ? this.emissao.getCodigo() : StringUtils.EMPTY);
        texto.append(this.codigoParticipante);
        texto.append(this.codigoModeloFiscal);
        texto.append(this.situacao != null ? this.situacao.getCodigo() : StringUtils.EMPTY);
        texto.append(this.serie);
        texto.append(this.numero);
        texto.append(this.chaveNotaFiscalEletronica);
        texto.append(SFUtil.formatToString(this.dataEmissao));
        texto.append(SFUtil.formatToString(this.dataOperacao));
        texto.append(SFUtil.formatToString(this.valorDocumento));
        texto.append(this.pagamento.getCodigo());
        texto.append(SFUtil.formatToString(this.valorDesconto));
        texto.append(SFUtil.formatToString(this.valorAbatimentoNaoTributado));
        texto.append(SFUtil.formatToString(this.valorMercadoriaEServico));
        texto.append(this.frete != null ? this.frete.getCodigo() : StringUtils.EMPTY);
        texto.append(SFUtil.formatToString(this.valorFrete));
        texto.append(SFUtil.formatToString(this.valorSeguro));
        texto.append(SFUtil.formatToString(this.valorOutrasDespesasAcessorias));
        texto.append(SFUtil.formatToString(this.valorBaseCalculoIcms));
        texto.append(SFUtil.formatToString(this.valorIcms));
        texto.append(SFUtil.formatToString(this.valorBaseCalculoIcmsSt));
        texto.append(SFUtil.formatToString(this.valorIcmsSt));
        texto.append(SFUtil.formatToString(this.valorIpi));
        texto.append(SFUtil.formatToString(this.valorPis));
        texto.append(SFUtil.formatToString(this.valorCofins));
        texto.append(SFUtil.formatToString(this.valorPisSt));
        texto.append(SFUtil.formatToString(this.valorCofinsSt));
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "C100";
    }

    public SFC100NotaFiscal setChaveNotaFiscalEletronica(String chaveNotaFiscalEletronica) {
        this.chaveNotaFiscalEletronica = chaveNotaFiscalEletronica;
        return this;
    }

    public SFC100NotaFiscal setCodigoModeloFiscal(String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
        return this;
    }

    public SFC100NotaFiscal setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public SFC100NotaFiscal setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public SFC100NotaFiscal setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
        return this;
    }

    public SFC100NotaFiscal setEmissao(SFNotaFiscalEmissao emissao) {
        this.emissao = emissao;
        return this;
    }

    public SFC100NotaFiscal setFrete(SFNotaFiscalFrete frete) {
        this.frete = frete;
        return this;
    }

    public SFC100NotaFiscal setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SFC100NotaFiscal setOperacao(SFNotaFiscalOperacao operacao) {
        this.operacao = operacao;
        return this;
    }

    public SFC100NotaFiscal setPagamento(SFNotaFiscalPagamento pagamento) {
        this.pagamento = pagamento;
        return this;
    }

    public SFC100NotaFiscal setSerie(String serie) {
        this.serie = serie;
        return this;
    }

    public SFC100NotaFiscal setSituacao(SFNotaFiscalSituacao situacao) {
        this.situacao = situacao;
        return this;
    }

    public SFC100NotaFiscal setValorAbatimentoNaoTributado(BigDecimal valorAbatimentoNaoTributado) {
        this.valorAbatimentoNaoTributado = valorAbatimentoNaoTributado;
        return this;
    }

    public SFC100NotaFiscal setValorBaseCalculoIcms(BigDecimal valorBaseCalculoIcms) {
        this.valorBaseCalculoIcms = valorBaseCalculoIcms;
        return this;
    }

    public SFC100NotaFiscal setValorBaseCalculoIcmsSt(BigDecimal valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
        return this;
    }

    public SFC100NotaFiscal setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
        return this;
    }

    public SFC100NotaFiscal setValorCofinsSt(BigDecimal valorCofinsSt) {
        this.valorCofinsSt = valorCofinsSt;
        return this;
    }

    public SFC100NotaFiscal setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
        return this;
    }

    public SFC100NotaFiscal setValorDocumento(BigDecimal valorDocumento) {
        this.valorDocumento = valorDocumento;
        return this;
    }

    public SFC100NotaFiscal setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }

    public SFC100NotaFiscal setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    public SFC100NotaFiscal setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
        return this;
    }

    public SFC100NotaFiscal setValorIpi(BigDecimal valorIpi) {
        this.valorIpi = valorIpi;
        return this;
    }

    public SFC100NotaFiscal setValorMercadoriaEServico(BigDecimal valorMercadoriaEServico) {
        this.valorMercadoriaEServico = valorMercadoriaEServico;
        return this;
    }

    public SFC100NotaFiscal setValorOutrasDespesasAcessorias(BigDecimal valorOutrasDespesasAcessorias) {
        this.valorOutrasDespesasAcessorias = valorOutrasDespesasAcessorias;
        return this;
    }

    public SFC100NotaFiscal setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
        return this;
    }

    public SFC100NotaFiscal setValorPisSt(BigDecimal valorPisSt) {
        this.valorPisSt = valorPisSt;
        return this;
    }

    public SFC100NotaFiscal setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
        return this;
    }
}
