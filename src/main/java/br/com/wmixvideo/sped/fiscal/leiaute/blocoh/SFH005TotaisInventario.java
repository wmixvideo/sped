package br.com.wmixvideo.sped.fiscal.leiaute.blocoh;

import br.com.wmixvideo.sped.fiscal.enums.SFMotivoInventario;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFH005TotaisInventario implements SFLinha {

    private LocalDate campo02DataInventario;
    private BigDecimal campo03ValorTotalEstoque;
    private SFMotivoInventario campo04MotivoInventario;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02DataInventario));
        linha.append(SFUtil.formatToString(this.campo03ValorTotalEstoque));
        linha.append(SFUtil.formatToString(this.campo04MotivoInventario));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "H005";
    }

    public SFH005TotaisInventario setCampo02DataInventario(LocalDate campo02DataInventario) {
        this.campo02DataInventario = campo02DataInventario;
        return this;
    }

    public SFH005TotaisInventario setCampo04MotivoInventario(SFMotivoInventario campo04MotivoInventario) {
        this.campo04MotivoInventario = campo04MotivoInventario;
        return this;
    }

    public SFH005TotaisInventario setCampo03ValorTotalEstoque(BigDecimal campo03ValorTotalEstoque) {
        this.campo03ValorTotalEstoque = campo03ValorTotalEstoque;
        return this;
    }
}