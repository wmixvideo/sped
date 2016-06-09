package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFD101NotaFiscalTransporteInfoComplementar implements SFLinha {

    private BigDecimal valorFundoCombatePobreza, valorICMSDestino, valorICMSRemetente;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D101";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(SFUtil.formatToString(this.valorFundoCombatePobreza));
        texto.append(SFUtil.formatToString(this.valorICMSDestino));
        texto.append(SFUtil.formatToString(this.valorICMSRemetente));
        return texto.toString();
    }

    public SFD101NotaFiscalTransporteInfoComplementar setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = valorFundoCombatePobreza;
        return this;
    }

    public SFD101NotaFiscalTransporteInfoComplementar setValorICMSDestino(BigDecimal valorICMSDestino) {
        this.valorICMSDestino = valorICMSDestino;
        return this;
    }

    public SFD101NotaFiscalTransporteInfoComplementar setValorICMSRemetente(BigDecimal valorICMSRemetente) {
        this.valorICMSRemetente = valorICMSRemetente;
        return this;
    }
}
