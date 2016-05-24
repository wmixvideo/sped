package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class SFParticipanteAlteracao implements Serializable {
    private static final long serialVersionUID = 4595420034625555969L;
    private LocalDate data;
    private SFParticipanteAlteracaoCampo campo;
    private String conteudoAnterior;

    public SFParticipanteAlteracaoCampo getCampo() {
        return campo;
    }

    public void setCampo(SFParticipanteAlteracaoCampo campo) {
        this.campo = campo;
    }

    public String getConteudoAnterior() {
        return conteudoAnterior;
    }

    public void setConteudoAnterior(String conteudoAnterior) {
        this.conteudoAnterior = conteudoAnterior;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
