package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class SFItemAlteracao implements Serializable {
    private static final long serialVersionUID = -4509539446838186610L;
    private String codigoAnterior;
    private String descricaoAnterior;
    private LocalDate dataInicialUtilizacaoDescricao;
    private LocalDate dataFinalUtilizacaoDescricao;

    public String getCodigoAnterior() {
        return codigoAnterior;
    }

    public void setCodigoAnterior(String codigoAnterior) {
        this.codigoAnterior = codigoAnterior;
    }

    public LocalDate getDataFinalUtilizacaoDescricao() {
        return dataFinalUtilizacaoDescricao;
    }

    public void setDataFinalUtilizacaoDescricao(LocalDate dataFinalUtilizacaoDescricao) {
        this.dataFinalUtilizacaoDescricao = dataFinalUtilizacaoDescricao;
    }

    public LocalDate getDataInicialUtilizacaoDescricao() {
        return dataInicialUtilizacaoDescricao;
    }

    public void setDataInicialUtilizacaoDescricao(LocalDate dataInicialUtilizacaoDescricao) {
        this.dataInicialUtilizacaoDescricao = dataInicialUtilizacaoDescricao;
    }

    public String getDescricaoAnterior() {
        return descricaoAnterior;
    }

    public void setDescricaoAnterior(String descricaoAnterior) {
        this.descricaoAnterior = descricaoAnterior;
    }
}
