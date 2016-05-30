package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFParticipanteAlteracaoCampo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SF0175AlteracaoCadastroParticipante implements SFLinha {

    private LocalDate data;
    private SFParticipanteAlteracaoCampo campo;
    private String conteudoAnterior;

    @Override
    public String getCodigoRegistro() {
        return "0175";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.data));
        texto.append(this.campo.getNumero());
        texto.append(this.conteudoAnterior);
        return texto.toString();
    }

    public SF0175AlteracaoCadastroParticipante setCampo(SFParticipanteAlteracaoCampo campo) {
        this.campo = campo;
        return this;
    }

    public SF0175AlteracaoCadastroParticipante setConteudoAnterior(String conteudoAnterior) {
        this.conteudoAnterior = conteudoAnterior;
        return this;
    }

    public SF0175AlteracaoCadastroParticipante setData(LocalDate data) {
        this.data = data;
        return this;
    }
}
