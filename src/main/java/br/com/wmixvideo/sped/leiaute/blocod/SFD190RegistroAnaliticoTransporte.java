package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFD190RegistroAnaliticoTransporte implements SFLinha {

    private String campo02CodigoSituacaoTributaria;
    private String campo03CodigoFiscalOperacaoPrestacao;
    private String campo09CodigoObservacao;
    private BigDecimal campo04ValorICMSAliquota;
    private BigDecimal campo05Valor;
    private BigDecimal campo06ValorICMSBaseCalculo;
    private BigDecimal campo07ValorICMS;
    private BigDecimal campo08ValorNaoTributado;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D190";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoSituacaoTributaria);
        linha.append(this.campo03CodigoFiscalOperacaoPrestacao);
        linha.append(SFUtil.formatToString(this.campo04ValorICMSAliquota));
        linha.append(SFUtil.formatToString(this.campo05Valor));
        linha.append(SFUtil.formatToString(this.campo06ValorICMSBaseCalculo));
        linha.append(SFUtil.formatToString(this.campo07ValorICMS));
        linha.append(SFUtil.formatToString(this.campo08ValorNaoTributado));
        linha.append(this.campo09CodigoObservacao);
        return linha.toString();
    }

    public SFD190RegistroAnaliticoTransporte setCampo03CodigoFiscalOperacaoPrestacao(String campo03CodigoFiscalOperacaoPrestacao) {
        this.campo03CodigoFiscalOperacaoPrestacao = campo03CodigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo09CodigoObservacao(String campo09CodigoObservacao) {
        this.campo09CodigoObservacao = campo09CodigoObservacao;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo02CodigoSituacaoTributaria(String campo02CodigoSituacaoTributaria) {
        this.campo02CodigoSituacaoTributaria = campo02CodigoSituacaoTributaria;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo05Valor(BigDecimal campo05Valor) {
        this.campo05Valor = campo05Valor;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo07ValorICMS(BigDecimal campo07ValorICMS) {
        this.campo07ValorICMS = campo07ValorICMS;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo04ValorICMSAliquota(BigDecimal campo04ValorICMSAliquota) {
        this.campo04ValorICMSAliquota = campo04ValorICMSAliquota;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo06ValorICMSBaseCalculo(BigDecimal campo06ValorICMSBaseCalculo) {
        this.campo06ValorICMSBaseCalculo = campo06ValorICMSBaseCalculo;
        return this;
    }

    public SFD190RegistroAnaliticoTransporte setCampo08ValorNaoTributado(BigDecimal campo08ValorNaoTributado) {
        this.campo08ValorNaoTributado = campo08ValorNaoTributado;
        return this;
    }
}
