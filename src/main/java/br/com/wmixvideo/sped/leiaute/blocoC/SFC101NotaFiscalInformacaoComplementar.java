package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC101NotaFiscalInformacaoComplementar implements SFLinha {


    private BigDecimal valorIcmsPartilhaOrigem;
    private BigDecimal valorIcmsPartilhaDestino;
    private BigDecimal valorIcmsPartilhaDestinoFundoCombatePobreza;

    @Override
    public String getCodigoRegistro() {
        return "C101";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.valorIcmsPartilhaDestinoFundoCombatePobreza));
        texto.append(SFUtil.formatToString(this.valorIcmsPartilhaDestino));
        texto.append(SFUtil.formatToString(this.valorIcmsPartilhaOrigem));
        return texto.toString();
    }

    public SFC101NotaFiscalInformacaoComplementar setValorIcmsPartilhaDestino(BigDecimal valorIcmsPartilhaDestino) {
        this.valorIcmsPartilhaDestino = valorIcmsPartilhaDestino;
        return this;
    }

    public SFC101NotaFiscalInformacaoComplementar setValorIcmsPartilhaDestinoFundoCombatePobreza(BigDecimal valorIcmsPartilhaDestinoFundoCombatePobreza) {
        this.valorIcmsPartilhaDestinoFundoCombatePobreza = valorIcmsPartilhaDestinoFundoCombatePobreza;
        return this;
    }

    public SFC101NotaFiscalInformacaoComplementar setValorIcmsPartilhaOrigem(BigDecimal valorIcmsPartilhaOrigem) {
        this.valorIcmsPartilhaOrigem = valorIcmsPartilhaOrigem;
        return this;
    }
}