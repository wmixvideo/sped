package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SF0205AlteracaoItem implements SFLinha {
    private String codigoAnterior;
    private String descricaoAnterior;
    private LocalDate dataInicialUtilizacaoDescricao;
    private LocalDate dataFinalUtilizacaoDescricao;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.descricaoAnterior);
        texto.append(SFUtil.formatToString(this.dataInicialUtilizacaoDescricao));
        texto.append(SFUtil.formatToString(this.dataFinalUtilizacaoDescricao));
        texto.append(this.codigoAnterior);
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0205";
    }

    public SF0205AlteracaoItem setCodigoAnterior(String codigoAnterior) {
        this.codigoAnterior = codigoAnterior;
        return this;
    }

    public SF0205AlteracaoItem setDataFinalUtilizacaoDescricao(LocalDate dataFinalUtilizacaoDescricao) {
        this.dataFinalUtilizacaoDescricao = dataFinalUtilizacaoDescricao;
        return this;
    }

    public SF0205AlteracaoItem setDataInicialUtilizacaoDescricao(LocalDate dataInicialUtilizacaoDescricao) {
        this.dataInicialUtilizacaoDescricao = dataInicialUtilizacaoDescricao;
        return this;
    }

    public SF0205AlteracaoItem setDescricaoAnterior(String descricaoAnterior) {
        this.descricaoAnterior = descricaoAnterior;
        return this;
    }
}