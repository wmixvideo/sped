package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFD190RegistroAnaliticoTransporte implements SFLinha {

    private String codigoSituacaoTributaria;
    private String codigoFiscalOperacaoPrestacao;
    private String codigoObservacao;
    private BigDecimal valorICMSAliquota;
    private BigDecimal valor;
    private BigDecimal valorICMSBaseCalculo;
    private BigDecimal valorICMS;
    private BigDecimal valorNaoTributado;

    @Override
    public String getCodigoRegistro() {
        return "D190";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigoSituacaoTributaria);
        texto.append(this.codigoFiscalOperacaoPrestacao);
        texto.append(SFUtil.formatToString(this.valorICMSAliquota));
        texto.append(SFUtil.formatToString(this.valor));
        texto.append(SFUtil.formatToString(this.valorICMSBaseCalculo));
        texto.append(SFUtil.formatToString(this.valorICMS));
        texto.append(SFUtil.formatToString(this.valorNaoTributado));
        texto.append(this.codigoObservacao);
        return texto.toString();
    }

    public SFD190RegistroAnaliticoTransporte setCodigoFiscalOperacaoPrestacao(String codigoFiscalOperacaoPrestacao) {
        this.codigoFiscalOperacaoPrestacao = codigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCodigoObservacao(String codigoObservacao) {
        this.codigoObservacao = codigoObservacao;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCodigoSituacaoTributaria(String codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = valorICMS;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setValorICMSAliquota(BigDecimal valorICMSAliquota) {
        this.valorICMSAliquota = valorICMSAliquota;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setValorICMSBaseCalculo(BigDecimal valorICMSBaseCalculo) {
        this.valorICMSBaseCalculo = valorICMSBaseCalculo;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setValorNaoTributado(BigDecimal valorNaoTributado) {
        this.valorNaoTributado = valorNaoTributado;
        return this;
    }
}
