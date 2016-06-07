package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC190RegistroAnaliticoDocumento implements SFLinha {

    private String codigoSituacaoTributaria, codigoFiscalOperacaoPrestacao, codigoObservacao;
    private BigDecimal aliquotaIcms;
    private BigDecimal valorOperacao;
    private BigDecimal valorBaseCalculoIcms;
    private BigDecimal valorIcms;
    private BigDecimal valorBaseCalculoIcmsSt;
    private BigDecimal valorIcmsSt;
    private BigDecimal valorNaoTributado;
    private BigDecimal valorIpi;

    @Override
    public String getCodigoRegistro() {
        return "C190";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(this.codigoSituacaoTributaria);
        linha.append(this.codigoFiscalOperacaoPrestacao);
        linha.append(SFUtil.formatToString(this.aliquotaIcms));
        linha.append(SFUtil.formatToString(this.valorOperacao));
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.valorIcms));
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.valorIcmsSt));
        linha.append(SFUtil.formatToString(this.valorNaoTributado));
        linha.append(SFUtil.formatToString(this.valorIpi));
        linha.append(this.codigoObservacao);
        return linha.toString();
    }

    public SFC190RegistroAnaliticoDocumento setAliquotaIcms(BigDecimal aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setCodigoFiscalOperacaoPrestacao(String codigoFiscalOperacaoPrestacao) {
        this.codigoFiscalOperacaoPrestacao = codigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setCodigoObservacao(String codigoObservacao) {
        this.codigoObservacao = codigoObservacao;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setCodigoSituacaoTributaria(String codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorBaseCalculoIcms(BigDecimal valorBaseCalculoIcms) {
        this.valorBaseCalculoIcms = valorBaseCalculoIcms;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorBaseCalculoIcmsSt(BigDecimal valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorIpi(BigDecimal valorIpi) {
        this.valorIpi = valorIpi;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorNaoTributado(BigDecimal valorNaoTributado) {
        this.valorNaoTributado = valorNaoTributado;
        return this;
    }

    public SFC190RegistroAnaliticoDocumento setValorOperacao(BigDecimal valorOperacao) {
        this.valorOperacao = valorOperacao;
        return this;
    }
}
