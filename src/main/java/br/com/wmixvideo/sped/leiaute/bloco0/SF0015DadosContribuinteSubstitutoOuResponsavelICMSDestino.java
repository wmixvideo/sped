package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFContribuinteSubstituicao;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino implements SFRegistro {

    private final SFContribuinteSubstituicao contribuinteSubstituicao;

    public SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino(final SFContribuinteSubstituicao contribuinteSubstituicao) {
        this.contribuinteSubstituicao = contribuinteSubstituicao;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.contribuinteSubstituicao.getUf().getCodigo());
        texto.append(this.contribuinteSubstituicao.getInscricaoEstadual());
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0015";
    }
}