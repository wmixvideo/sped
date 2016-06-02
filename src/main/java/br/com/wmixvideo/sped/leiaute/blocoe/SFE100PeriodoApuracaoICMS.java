package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFE100PeriodoApuracaoICMS implements SFLinha {

    private LocalDate dataInicio;
    private LocalDate dataFim;

    @Override
    public String getCodigoRegistro() {
        return "E100";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.dataInicio));
        texto.append(SFUtil.formatToString(this.dataFim));
        return texto.toString();
    }

    public SFE100PeriodoApuracaoICMS setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
        return this;
    }

    public SFE100PeriodoApuracaoICMS setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
}
