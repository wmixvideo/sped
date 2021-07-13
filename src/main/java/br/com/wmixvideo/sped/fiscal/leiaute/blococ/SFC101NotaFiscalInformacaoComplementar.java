package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC101NotaFiscalInformacaoComplementar implements SFLinha {

    private BigDecimal campo04ValorIcmsPartilhaOrigem;
    private BigDecimal campo03ValorIcmsPartilhaDestino;
    private BigDecimal campo02ValorIcmsPartilhaDestinoFundoCombatePobreza;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C101";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02ValorIcmsPartilhaDestinoFundoCombatePobreza));
        linha.append(SFUtil.formatToString(this.campo03ValorIcmsPartilhaDestino));
        linha.append(SFUtil.formatToString(this.campo04ValorIcmsPartilhaOrigem));
        return linha.toString();
    }

    public SFC101NotaFiscalInformacaoComplementar setCampo03ValorIcmsPartilhaDestino(final BigDecimal campo03ValorIcmsPartilhaDestino) {
        this.campo03ValorIcmsPartilhaDestino = campo03ValorIcmsPartilhaDestino;
        return this;
    }

    public SFC101NotaFiscalInformacaoComplementar setCampo02ValorIcmsPartilhaDestinoFundoCombatePobreza(final BigDecimal campo02ValorIcmsPartilhaDestinoFundoCombatePobreza) {
        this.campo02ValorIcmsPartilhaDestinoFundoCombatePobreza = campo02ValorIcmsPartilhaDestinoFundoCombatePobreza;
        return this;
    }

    public SFC101NotaFiscalInformacaoComplementar setCampo04ValorIcmsPartilhaOrigem(final BigDecimal campo04ValorIcmsPartilhaOrigem) {
        this.campo04ValorIcmsPartilhaOrigem = campo04ValorIcmsPartilhaOrigem;
        return this;
    }
}