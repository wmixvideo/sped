package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino implements SFLinha {

    private SFUnidadeFederativa campo02Uf;
    private String campo03InscricaoEstadual;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Uf));
        linha.append(this.campo03InscricaoEstadual);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0015";
    }

    public SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino setCampo02Uf(SFUnidadeFederativa campo02Uf) {
        this.campo02Uf = campo02Uf;
        return this;
    }

    public SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino setCampo03InscricaoEstadual(String campo03InscricaoEstadual) {
        this.campo03InscricaoEstadual = campo03InscricaoEstadual;
        return this;
    }
}