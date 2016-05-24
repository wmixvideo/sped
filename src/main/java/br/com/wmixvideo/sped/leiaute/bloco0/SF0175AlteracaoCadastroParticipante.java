package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFParticipanteAlteracao;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF0175AlteracaoCadastroParticipante implements SFRegistro {

    private final SFParticipanteAlteracao participanteAlteracao;

    public SF0175AlteracaoCadastroParticipante(final SFParticipanteAlteracao participanteAlteracao) {
        this.participanteAlteracao = participanteAlteracao;
    }

    @Override
    public String getCodigoRegistro() {
        return "0175";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.participanteAlteracao.getData()));
        texto.append(this.participanteAlteracao.getCampo().getNumero());
        texto.append(this.participanteAlteracao.getConteudoAnterior());

        return texto.toString();
    }
}
