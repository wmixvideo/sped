package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFParticipanteAlteracaoCampo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SF0175AlteracaoCadastroParticipante implements SFLinha {

    private LocalDate campo02Data;
    private SFParticipanteAlteracaoCampo campo03AlteracaoCampo;
    private String campo04ConteudoAnterior;

    @Override
    public String getCampo01CodigoRegistro() {
        return "0175";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Data));
        linha.append(SFUtil.formatToString(this.campo03AlteracaoCampo));
        linha.append(this.campo04ConteudoAnterior);
        return linha.toString();
    }

    public SF0175AlteracaoCadastroParticipante setCampo03AlteracaoCampo(SFParticipanteAlteracaoCampo campo03AlteracaoCampo) {
        this.campo03AlteracaoCampo = campo03AlteracaoCampo;
        return this;
    }

    public SF0175AlteracaoCadastroParticipante setCampo04ConteudoAnterior(String campo04ConteudoAnterior) {
        this.campo04ConteudoAnterior = campo04ConteudoAnterior;
        return this;
    }

    public SF0175AlteracaoCadastroParticipante setCampo02Data(LocalDate campo02Data) {
        this.campo02Data = campo02Data;
        return this;
    }
}
