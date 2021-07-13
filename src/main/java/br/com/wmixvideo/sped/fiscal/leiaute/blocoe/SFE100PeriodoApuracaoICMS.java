package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFE100PeriodoApuracaoICMS implements SFLinha {

    private LocalDate campo02DataInicio;
    private LocalDate campo03DataFim;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E100";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02DataInicio));
        linha.append(SFUtil.formatToString(this.campo03DataFim));
        return linha.toString();
    }

    public SFE100PeriodoApuracaoICMS setCampo03DataFim(LocalDate campo03DataFim) {
        this.campo03DataFim = campo03DataFim;
        return this;
    }

    public SFE100PeriodoApuracaoICMS setCampo02DataInicio(LocalDate campo02DataInicio) {
        this.campo02DataInicio = campo02DataInicio;
        return this;
    }
}
