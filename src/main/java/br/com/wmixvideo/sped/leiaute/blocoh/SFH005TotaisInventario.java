package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFH005TotaisInventario implements SFRegistro {
    private static final String MOTIVO_INVENTARIO = "01";
    private LocalDate data;
    private BigDecimal valorTotal;

    public SFH005TotaisInventario(final LocalDate data, final BigDecimal valorTotal) {
        this.data = data;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.data));
        texto.append(SFUtil.formatToString(this.valorTotal));
        texto.append(MOTIVO_INVENTARIO);
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "H005";
    }
}