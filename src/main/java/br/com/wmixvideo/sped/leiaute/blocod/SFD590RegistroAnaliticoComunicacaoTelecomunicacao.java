package br.com.wmixvideo.sped.leiaute.blocod;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFD590RegistroAnaliticoComunicacaoTelecomunicacao implements SFLinha {

    private String campo02CodigoSituacaoTributaria;
    private String campo03Cfop;
    private BigDecimal campo04AliquotaIcms;
    private BigDecimal campo05ValorOperacao;
    private BigDecimal campo06ValorBaseCalculo;
    private BigDecimal campo07ValorIcms;
    private BigDecimal campo08ValorBaseCalculoIcmsDeOutrasUFs;
    private BigDecimal campo09ValorIcmsDeOutrasUFs;
    private BigDecimal campo10ValorNaoTributado;
    private String campo11CodigoObservacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D590";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoSituacaoTributaria);
        linha.append(this.campo03Cfop);
        linha.append(SFUtil.formatToString(this.campo04AliquotaIcms));
        linha.append(SFUtil.formatToString(this.campo05ValorOperacao));
        linha.append(SFUtil.formatToString(this.campo06ValorBaseCalculo));
        linha.append(SFUtil.formatToString(this.campo07ValorIcms));
        linha.append(SFUtil.formatToString(this.campo08ValorBaseCalculoIcmsDeOutrasUFs));
        linha.append(SFUtil.formatToString(this.campo09ValorIcmsDeOutrasUFs));
        linha.append(SFUtil.formatToString(this.campo10ValorNaoTributado));
        linha.append(this.campo11CodigoObservacao);
        return linha.toString();
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo02CodigoSituacaoTributaria(final String campo02CodigoSituacaoTributaria) {
        this.campo02CodigoSituacaoTributaria = campo02CodigoSituacaoTributaria;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo03Cfop(final String campo03Cfop) {
        this.campo03Cfop = campo03Cfop;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo04AliquotaIcms(final BigDecimal campo04AliquotaIcms) {
        this.campo04AliquotaIcms = campo04AliquotaIcms;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo05ValorOperacao(final BigDecimal campo05ValorOperacao) {
        this.campo05ValorOperacao = campo05ValorOperacao;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo06ValorBaseCalculo(final BigDecimal campo06ValorBaseCalculo) {
        this.campo06ValorBaseCalculo = campo06ValorBaseCalculo;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo07ValorIcms(final BigDecimal campo07ValorIcms) {
        this.campo07ValorIcms = campo07ValorIcms;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo08ValorBaseCalculoIcmsDeOutrasUFs(final BigDecimal campo08ValorBaseCalculoIcmsDeOutrasUFs) {
        this.campo08ValorBaseCalculoIcmsDeOutrasUFs = campo08ValorBaseCalculoIcmsDeOutrasUFs;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo09ValorIcmsDeOutrasUFs(final BigDecimal campo09ValorIcmsDeOutrasUFs) {
        this.campo09ValorIcmsDeOutrasUFs = campo09ValorIcmsDeOutrasUFs;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo10ValorNaoTributado(final BigDecimal campo10ValorNaoTributado) {
        this.campo10ValorNaoTributado = campo10ValorNaoTributado;
        return this;
    }

    public SFD590RegistroAnaliticoComunicacaoTelecomunicacao setCampo11CodigoObservacao(final String campo11CodigoObservacao) {
        this.campo11CodigoObservacao = campo11CodigoObservacao;
        return this;
    }
}