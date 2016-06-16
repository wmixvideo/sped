package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFD101NotaFiscalTransporteInfoComplementar implements SFLinha {

    private BigDecimal campo02ValorFundoCombatePobreza, campo03ValorICMSDestino, campo04ValorICMSRemetente;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D101";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02ValorFundoCombatePobreza));
        linha.append(SFUtil.formatToString(this.campo03ValorICMSDestino));
        linha.append(SFUtil.formatToString(this.campo04ValorICMSRemetente));
        return linha.toString();
    }

    public SFD101NotaFiscalTransporteInfoComplementar setCampo02ValorFundoCombatePobreza(BigDecimal campo02ValorFundoCombatePobreza) {
        this.campo02ValorFundoCombatePobreza = campo02ValorFundoCombatePobreza;
        return this;
    }

    public SFD101NotaFiscalTransporteInfoComplementar setCampo03ValorICMSDestino(BigDecimal campo03ValorICMSDestino) {
        this.campo03ValorICMSDestino = campo03ValorICMSDestino;
        return this;
    }

    public SFD101NotaFiscalTransporteInfoComplementar setCampo04ValorICMSRemetente(BigDecimal campo04ValorICMSRemetente) {
        this.campo04ValorICMSRemetente = campo04ValorICMSRemetente;
        return this;
    }
}
