package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;

public class SFContribuinteSubstituicao implements Serializable {
    private static final long serialVersionUID = -4325277617885488564L;

    private final SFUnidadeFederativa uf;
    private final String inscricaoEstadual;

    public SFContribuinteSubstituicao(SFUnidadeFederativa uf, String inscricaoEstadual) {
        this.uf = uf;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public SFUnidadeFederativa getUf() {
        return uf;
    }
}
