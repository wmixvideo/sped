package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFK100PeriodoApuracaoICMSIPI implements SFLinha {

    private LocalDate campo02DataInicial;
    private LocalDate campo03DataFinal;

    @Override
    public String getCampo01CodigoRegistro() {
        return "K100";
    }

    @Override
    public String toString() {
        final SFStringBuilder builder = new SFStringBuilder();
        builder.append(this.getCampo01CodigoRegistro());
        builder.append(SFUtil.formatToString(this.campo02DataInicial));
        builder.append(SFUtil.formatToString(this.campo03DataFinal));
        return builder.toString();
    }

    public SFK100PeriodoApuracaoICMSIPI setCampo02DataInicial(LocalDate campo02DataInicial) {
        this.campo02DataInicial = campo02DataInicial;
        return this;
    }

    public SFK100PeriodoApuracaoICMSIPI setCampo03DataFinal(LocalDate campo03DataFinal) {
        this.campo03DataFinal = campo03DataFinal;
        return this;
    }
}