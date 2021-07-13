package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFE300PeriodoApuracaoFundoCombatePobreza implements SFLinha {

    private SFUnidadeFederativa campo02Uf;
    private LocalDate campo03DataInicial;
    private LocalDate campo04DataFinal;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E300";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Uf));
        linha.append(SFUtil.formatToString(this.campo03DataInicial));
        linha.append(SFUtil.formatToString(this.campo04DataFinal));
        return linha.toString();
    }

    public SFE300PeriodoApuracaoFundoCombatePobreza setCampo04DataFinal(LocalDate campo04DataFinal) {
        this.campo04DataFinal = campo04DataFinal;
        return this;
    }

    public SFE300PeriodoApuracaoFundoCombatePobreza setCampo03DataInicial(LocalDate campo03DataInicial) {
        this.campo03DataInicial = campo03DataInicial;
        return this;
    }

    public SFE300PeriodoApuracaoFundoCombatePobreza setCampo02Uf(SFUnidadeFederativa campo02Uf) {
        this.campo02Uf = campo02Uf;
        return this;
    }
}
