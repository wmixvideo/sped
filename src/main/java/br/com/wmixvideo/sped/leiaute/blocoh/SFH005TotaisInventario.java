package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.enums.SFMotivoInventario;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFH005TotaisInventario implements SFLinha {
    private LocalDate dataInventario;
    private BigDecimal valorTotalEstoque;
    private SFMotivoInventario motivoInventario;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(SFUtil.formatToString(this.dataInventario));
        texto.append(SFUtil.formatToString(this.valorTotalEstoque));
        texto.append(this.motivoInventario.getCodigo());
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "H005";
    }

    public SFH005TotaisInventario setDataInventario(LocalDate dataInventario) {
        this.dataInventario = dataInventario;
        return this;
    }

    public SFH005TotaisInventario setMotivoInventario(SFMotivoInventario motivoInventario) {
        this.motivoInventario = motivoInventario;
        return this;
    }

    public SFH005TotaisInventario setValorTotalEstoque(BigDecimal valorTotalEstoque) {
        this.valorTotalEstoque = valorTotalEstoque;
        return this;
    }
}