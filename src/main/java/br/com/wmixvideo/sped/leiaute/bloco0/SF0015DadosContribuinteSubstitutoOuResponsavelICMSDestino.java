package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino implements SFLinha {

    private String uf, inscricaoEstadual;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.uf);
        texto.append(this.inscricaoEstadual);
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0015";
    }

    public SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino setUf(String uf) {
        this.uf = uf;
        return this;
    }
}