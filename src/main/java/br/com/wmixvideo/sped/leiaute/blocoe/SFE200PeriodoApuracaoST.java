package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFE200PeriodoApuracaoST implements SFLinha {

    private SFUnidadeFederativa uf;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    @Override
    public String getCodigoRegistro() {
        return "E200";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(SFUtil.formatToString(this.uf));
        linha.append(SFUtil.formatToString(this.dataInicial));
        linha.append(SFUtil.formatToString(this.dataFinal));
        return linha.toString();
    }

    public SFE200PeriodoApuracaoST setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
        return this;
    }

    public SFE200PeriodoApuracaoST setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
        return this;
    }

    public SFE200PeriodoApuracaoST setUf(SFUnidadeFederativa uf) {
        this.uf = uf;
        return this;
    }
}
