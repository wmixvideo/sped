package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC590RegistroAnaliticoDocumento implements SFLinha {

    private String campo02CodigoSubstituicaoTributaria;
    private String campo03CodigoFiscalOperacaoPrestacao;
    private BigDecimal campo04AliquotaIcms;
    private BigDecimal campo05ValorOperacao;
    private BigDecimal campo06ValorBaseCalculoIcms;
    private BigDecimal campo07ValorIcms;
    private BigDecimal campo08ValorBaseCalculoIcmsSt;
    private BigDecimal campo09ValorIcmsSt;
    private BigDecimal campo10ValorNaoTributado;
    private String campo11CodigoObservacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C590";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoSubstituicaoTributaria);
        linha.append(this.campo03CodigoFiscalOperacaoPrestacao);
        linha.append(SFUtil.formatToString(this.campo04AliquotaIcms));
        linha.append(SFUtil.formatToString(this.campo05ValorOperacao));
        linha.append(SFUtil.formatToString(this.campo06ValorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo07ValorIcms));
        linha.append(SFUtil.formatToString(this.campo08ValorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.campo09ValorIcmsSt));
        linha.append(SFUtil.formatToString(this.campo10ValorNaoTributado));
        linha.append(this.campo11CodigoObservacao);
        return linha.toString();
    }

    public SFC590RegistroAnaliticoDocumento setCampo02CodigoSubstituicaoTributaria(String campo02CodigoSubstituicaoTributaria) {
        this.campo02CodigoSubstituicaoTributaria = campo02CodigoSubstituicaoTributaria;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo03CodigoFiscalOperacaoPrestacao(String campo03CodigoFiscalOperacaoPrestacao) {
        this.campo03CodigoFiscalOperacaoPrestacao = campo03CodigoFiscalOperacaoPrestacao;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo04AliquotaIcms(BigDecimal campo04AliquotaIcms) {
        this.campo04AliquotaIcms = campo04AliquotaIcms;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo05ValorOperacao(BigDecimal campo05ValorOperacao) {
        this.campo05ValorOperacao = campo05ValorOperacao;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo06ValorBaseCalculoIcms(BigDecimal campo06ValorBaseCalculoIcms) {
        this.campo06ValorBaseCalculoIcms = campo06ValorBaseCalculoIcms;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo07ValorIcms(BigDecimal campo07ValorIcms) {
        this.campo07ValorIcms = campo07ValorIcms;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo08ValorBaseCalculoIcmsSt(BigDecimal campo08ValorBaseCalculoIcmsSt) {
        this.campo08ValorBaseCalculoIcmsSt = campo08ValorBaseCalculoIcmsSt;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo09ValorIcmsSt(BigDecimal campo09ValorIcmsSt) {
        this.campo09ValorIcmsSt = campo09ValorIcmsSt;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo10ValorNaoTributado(BigDecimal campo10ValorNaoTributado) {
        this.campo10ValorNaoTributado = campo10ValorNaoTributado;
        return this;
    }

    public SFC590RegistroAnaliticoDocumento setCampo11CodigoObservacao(String campo11CodigoObservacao) {
        this.campo11CodigoObservacao = campo11CodigoObservacao;
        return this;
    }
}