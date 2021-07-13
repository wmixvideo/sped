package br.com.wmixvideo.sped.fiscal.leiaute.blocod;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFD110NotaFiscalTransporteItem implements SFLinha {

    private int campo02NumeroItem;
    private String campo03CodigoItem;
    private BigDecimal campo04ValorServico;
    private BigDecimal campo05ValorOutras;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D110";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02NumeroItem);
        linha.append(this.campo03CodigoItem);
        linha.append(SFUtil.formatToString(this.campo04ValorServico));
        linha.append(SFUtil.formatToString(this.campo05ValorOutras));
        return linha.toString();
    }

    public SFD110NotaFiscalTransporteItem setCampo02NumeroItem(final int campo02NumeroItem) {
        this.campo02NumeroItem = campo02NumeroItem;
        return this;
    }

    public SFD110NotaFiscalTransporteItem setCampo03CodigoItem(final String campo03CodigoItem) {
        this.campo03CodigoItem = campo03CodigoItem;
        return this;
    }

    public SFD110NotaFiscalTransporteItem setCampo04ValorServico(final BigDecimal campo04ValorServico) {
        this.campo04ValorServico = campo04ValorServico;
        return this;
    }

    public SFD110NotaFiscalTransporteItem setCampo05ValorOutras(final BigDecimal campo05ValorOutras) {
        this.campo05ValorOutras = campo05ValorOutras;
        return this;
    }

}