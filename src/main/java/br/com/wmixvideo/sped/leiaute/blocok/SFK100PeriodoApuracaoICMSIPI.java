package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFK100PeriodoApuracaoICMSIPI implements SFRegistro {

    private final SFReferencia referencia;

    public SFK100PeriodoApuracaoICMSIPI(final SFReferencia referencia) {
        this.referencia = referencia;
    }

    @Override
    public String getCodigoRegistro() {
        return "K100";
    }

    @Override
    public String toString() {
        final SFStringBuilder builder = new SFStringBuilder();
        builder.append(this.getCodigoRegistro());
        builder.append(SFUtil.formatToString(this.referencia.getInicio()));
        builder.append(SFUtil.formatToString(this.referencia.getFim()));
        return builder.toString();
    }
}