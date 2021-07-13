package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SF0205AlteracaoItem implements SFLinha {

    private String campo02DescricaoAnterior;
    private LocalDate campo03DataInicialUtilizacaoDescricao;
    private LocalDate campo04DataFinalUtilizacaoDescricao;
    private String campo05CodigoAnterior;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02DescricaoAnterior);
        linha.append(SFUtil.formatToString(this.campo03DataInicialUtilizacaoDescricao));
        linha.append(SFUtil.formatToString(this.campo04DataFinalUtilizacaoDescricao));
        linha.append(this.campo05CodigoAnterior);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0205";
    }

    public SF0205AlteracaoItem setCampo05CodigoAnterior(String campo05CodigoAnterior) {
        this.campo05CodigoAnterior = campo05CodigoAnterior;
        return this;
    }

    public SF0205AlteracaoItem setCampo04DataFinalUtilizacaoDescricao(LocalDate campo04DataFinalUtilizacaoDescricao) {
        this.campo04DataFinalUtilizacaoDescricao = campo04DataFinalUtilizacaoDescricao;
        return this;
    }

    public SF0205AlteracaoItem setCampo03DataInicialUtilizacaoDescricao(LocalDate campo03DataInicialUtilizacaoDescricao) {
        this.campo03DataInicialUtilizacaoDescricao = campo03DataInicialUtilizacaoDescricao;
        return this;
    }

    public SF0205AlteracaoItem setCampo02DescricaoAnterior(String campo02DescricaoAnterior) {
        this.campo02DescricaoAnterior = campo02DescricaoAnterior;
        return this;
    }
}